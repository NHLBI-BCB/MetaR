package org.campagnelab.hta.tables.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class JoinTables_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Iterable<SNode> virtual_dependencies_7074867102589853662(SNode thisNode) {
    SNode p = SConceptOperations.createNewNode("org.campagnelab.hta.tables.structure.R_Package", null);
    SPropertyOperations.set(p, "name", "data.table");
    List<SNode> packages = ListSequence.fromListAndArray(new ArrayList<SNode>(), p);
    return packages;
  }

  public static Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    Iterable<SNode> groups;
    groups = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "inputTables", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "table", false);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "table", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "table", false);
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "columns", true);
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("org.campagnelab.hta.tables.structure.ColumnAnnotation")), "groups", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, "columnGroup", false) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, "columnGroup", false);
          }
        });
      }
    });
    if (kind == SConceptOperations.findConceptDeclaration("org.campagnelab.hta.tables.structure.ColumnGroup")) {
      return ListScope.forNamedElements(Sequence.fromIterable(groups).distinct());
    }
    return null;
  }

  @Deprecated
  public static Iterable<SNode> call_dependencies_7074867102589853662(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<Iterable<SNode>>) ((Class) Object.class), thisNode, "virtual_dependencies_7074867102589853662", new Object[]{});
  }

  @Deprecated
  public static Iterable<SNode> callSuper_dependencies_7074867102589853662(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<Iterable<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "org.campagnelab.hta.tables.structure.JoinTables"), callerConceptFqName, "virtual_dependencies_7074867102589853662", new Class[]{SNode.class}, new Object[]{});
  }
}
