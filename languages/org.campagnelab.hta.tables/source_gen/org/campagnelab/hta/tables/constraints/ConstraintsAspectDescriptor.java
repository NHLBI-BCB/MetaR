package org.campagnelab.hta.tables.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 3:
        return new FutureTableRef_Constraints();
      case 4:
        return new ImportTable_Constraints();
      case 2:
        return new FutureTable_Constraints();
      case 1:
        return new CommonColumnSelection_Constraints();
      case 0:
        return new ColumnRef_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"org.campagnelab.hta.tables.structure.ColumnRef", "org.campagnelab.hta.tables.structure.CommonColumnSelection", "org.campagnelab.hta.tables.structure.FutureTable", "org.campagnelab.hta.tables.structure.FutureTableRef", "org.campagnelab.hta.tables.structure.ImportTable"};
}
