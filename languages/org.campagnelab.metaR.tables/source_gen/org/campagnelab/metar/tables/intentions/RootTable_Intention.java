package org.campagnelab.metar.tables.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class RootTable_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public RootTable_Intention() {
  }

  public String getConcept() {
    return "org.campagnelab.metar.tables.structure.FutureTable";
  }

  public String getPresentation() {
    return "RootTable";
  }

  public String getPersistentStateKey() {
    return "org.campagnelab.metar.tables.intentions.RootTable_Intention";
  }

  public String getLanguageFqName() {
    return "org.campagnelab.metar.tables";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SLinkOperations.getTarget(node, "table", false) != null;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:597299e2-456c-40ec-87e4-c5fdcfc8d153(org.campagnelab.metar.tables.intentions)", "2433240172667571480");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new RootTable_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Root This Table";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SModelOperations.addRootNode(SNodeOperations.getModel(node), SLinkOperations.getTarget(node, "myOwnTable", true));
    }

    public IntentionDescriptor getDescriptor() {
      return RootTable_Intention.this;
    }
  }
}