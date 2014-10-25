package org.campagnelab.hta.tables.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.ColumnRef").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("col").create();
      case 1:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.CommonColumnSelection").super_("org.campagnelab.hta.tables.structure.KeySelection").parents("org.campagnelab.hta.tables.structure.KeySelection").children(new String[]{"byColumn"}, new boolean[]{true}).create();
      case 2:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.FutureTable").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").references("table").create();
      case 3:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.FutureTableRef").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("table").create();
      case 4:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.ImportTable").super_("org.campagnelab.hta.tables.structure.Statement").parents("org.campagnelab.hta.tables.structure.Statement").references("table").children(new String[]{"future"}, new boolean[]{false}).alias("import table", "").create();
      case 5:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.JoinTables").super_("org.campagnelab.hta.tables.structure.TableTransformation").parents("org.campagnelab.hta.tables.structure.TableTransformation").children(new String[]{"byKeySelection"}, new boolean[]{false}).alias("join", "").create();
      case 6:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.KeySelection").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      case 7:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.Statement").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      case 8:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.StatementList").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.ScopeProvider").children(new String[]{"transformations"}, new boolean[]{true}).create();
      case 9:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.Table").super_("org.campagnelab.mps.XChart.structure.Tsvfile").parents("org.campagnelab.mps.XChart.structure.Tsvfile", "jetbrains.mps.lang.core.structure.INamedConcept").alias("Table", "").create();
      case 10:
        return new ConceptDescriptorBuilder("org.campagnelab.hta.tables.structure.TableTransformation").super_("org.campagnelab.hta.tables.structure.Statement").parents("org.campagnelab.hta.tables.structure.Statement", "jetbrains.mps.lang.core.structure.ScopeProvider").children(new String[]{"inputTables", "outputTable"}, new boolean[]{true, false}).abstract_().create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"org.campagnelab.hta.tables.structure.ColumnRef", "org.campagnelab.hta.tables.structure.CommonColumnSelection", "org.campagnelab.hta.tables.structure.FutureTable", "org.campagnelab.hta.tables.structure.FutureTableRef", "org.campagnelab.hta.tables.structure.ImportTable", "org.campagnelab.hta.tables.structure.JoinTables", "org.campagnelab.hta.tables.structure.KeySelection", "org.campagnelab.hta.tables.structure.Statement", "org.campagnelab.hta.tables.structure.StatementList", "org.campagnelab.hta.tables.structure.Table", "org.campagnelab.hta.tables.structure.TableTransformation"};
}
