package org.campagnelab.metar.tables.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.BaseHelginsDescriptor;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;

public class TypesystemDescriptor extends BaseHelginsDescriptor {
  public TypesystemDescriptor() {
    {
      InferenceRule_Runtime inferenceRule = new typeof_FilterWithExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new CheckInputTableHasId_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new LoadFutureTableColumns_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_FitXByY_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
  }
}