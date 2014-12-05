package org.campagnelab.metar.tables.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class AddGroupToAll_Intention implements IntentionFactory {
  public AddGroupToAll_Intention() {
  }

  public String getConcept() {
    return "org.campagnelab.metar.tables.structure.Table";
  }

  public String getPresentation() {
    return "AddGroupToAll";
  }

  public String getPersistentStateKey() {
    return "org.campagnelab.metar.tables.intentions.AddGroupToAll_Intention";
  }

  public String getLanguageFqName() {
    return "org.campagnelab.metar.tables";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:597299e2-456c-40ec-87e4-c5fdcfc8d153(org.campagnelab.metar.tables.intentions)", "8031339867717748274");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    List<IntentionExecutable> list = ListSequence.fromList(new ArrayList<IntentionExecutable>());
    List<SNode> paramList = parameter(node, context);
    if (paramList != null) {
      for (SNode param : paramList) {
        ListSequence.fromList(list).addElement(new AddGroupToAll_Intention.IntentionImplementation(param));
      }
    }
    return list;
  }

  private List<SNode> parameter(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(SNodeOperations.getDescendants(node, "org.campagnelab.mps.XChart.structure.Column", false, new String[]{})).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")), "groups", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, "columnGroup", false) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, "columnGroup", false);
          }
        });
      }
    }).distinct().toListSequence();
  }

  public class IntentionImplementation implements IntentionExecutable {
    private SNode myParameter;

    public IntentionImplementation(SNode parameter) {
      myParameter = parameter;
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Add Group " + myParameter + " to All Columns";
    }

    public void execute(final SNode node, final EditorContext editorContext) {

      ListSequence.fromList(SNodeOperations.getDescendants(node, "org.campagnelab.mps.XChart.structure.Column", false, new String[]{})).visitAll(new IVisitor<SNode>() {
        public void visit(SNode col) {
          if ((AttributeOperations.getAttribute(col, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")) == null)) {
            AttributeOperations.setAttribute(col, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation"), SConceptOperations.createNewNode("org.campagnelab.metar.tables.structure.ColumnAnnotation", null));
          }
          if (ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(col, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")), "groups", true)).all(new IWhereFilter<SNode>() {
            public boolean accept(SNode it) {
              return neq_6uje8a_a0a0a0a0a0b0a0a0a0b0d21(SPropertyOperations.getString(SLinkOperations.getTarget(it, "columnGroup", false), "name"), SPropertyOperations.getString(myParameter, "name"));
            }
          })) {

            SNode ref = SConceptOperations.createNewNode("org.campagnelab.metar.tables.structure.ColumnGroupReference", null);
            SLinkOperations.setTarget(ref, "columnGroup", myParameter, false);
            ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(col, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")), "groups", true)).addElement(ref);
          }
        }
      });
    }

    public IntentionDescriptor getDescriptor() {
      return AddGroupToAll_Intention.this;
    }
  }

  private static boolean neq_6uje8a_a0a0a0a0a0b0a0a0a0b0d21(Object a, Object b) {
    return !((a != null ? a.equals(b) : a == b));
  }
}