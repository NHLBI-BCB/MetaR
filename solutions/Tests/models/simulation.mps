<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3ae7808c-587a-4dc8-af4d-c0911e83677d(simulation)">
  <persistence version="9" />
  <languages>
    <use id="067d1b0c-daf1-44f9-9fbd-e1dd4c6e26e8" name="org.campagnelab.metar.simulation" version="-1" />
    <devkit ref="8a3636fa-c6ec-4cb0-bc2a-b7143f2a4937(org.campagnelab.metaR)" />
  </languages>
  <imports>
    <import index="9nc5" ref="r:d1a256e6-591a-459f-809c-7fc9df45e4d5(org.campagnelab.mps.XChart.types.roots)" implicit="true" />
  </imports>
  <registry>
    <language id="067d1b0c-daf1-44f9-9fbd-e1dd4c6e26e8" name="org.campagnelab.metar.simulation">
      <concept id="8388819603423221474" name="org.campagnelab.metar.simulation.structure.SampleNames" flags="ng" index="2QHcgp">
        <child id="8388819603423222439" name="sampleNames" index="2QHcxs" />
      </concept>
      <concept id="8388819603421131618" name="org.campagnelab.metar.simulation.structure.StringValue" flags="ng" index="2QPe6p" />
      <concept id="2432807068409481897" name="org.campagnelab.metar.simulation.structure.DiscreteGroup" flags="ng" index="2Ym5Ia">
        <property id="8388819603422399145" name="percentageOfTreatedSamples" index="2QI5xi" />
        <property id="8388819603422399124" name="percentageOfAffectedGenes" index="2QI5xJ" />
        <child id="2432807068409481900" name="values" index="2Ym5If" />
      </concept>
      <concept id="2432807068409489390" name="org.campagnelab.metar.simulation.structure.CovariateGroup" flags="ng" index="2Ym7rd" />
      <concept id="2432807068409409150" name="org.campagnelab.metar.simulation.structure.SimulateDataset" flags="ng" index="2YmjXt">
        <property id="2432807068409481702" name="numOfSamples" index="2Ym5z5" />
        <child id="8388819603423222464" name="samples" index="2QHcwV" />
        <child id="2432807068409489366" name="continuousCovariate" index="2Ym7rP" />
        <child id="2432807068409489364" name="discreteGroups" index="2Ym7rR" />
        <child id="2432807068409495956" name="covariateTable" index="2Ym92R" />
        <child id="8725455673819577719" name="simulationTable" index="3curr3" />
      </concept>
    </language>
    <language id="5d6bde84-4ce4-4eb5-a37e-25a5edd55129" name="org.campagnelab.metar.tables">
      <concept id="6106414325997850090" name="org.campagnelab.metar.tables.structure.FutureTableCreator" flags="ng" index="2$MLEj">
        <property id="9080041854829670092" name="inputChanged" index="8NYsT" />
      </concept>
      <concept id="8962032619593737384" name="org.campagnelab.metar.tables.structure.Statement" flags="ng" index="S1EQ7">
        <property id="8962032619593737385" name="id" index="S1EQ6" />
      </concept>
      <concept id="8962032619593737380" name="org.campagnelab.metar.tables.structure.Analysis" flags="ng" index="S1EQb">
        <property id="2742007948298959018" name="trycatch_enabled" index="2BDq$p" />
        <child id="8962032619593737383" name="statements" index="S1EQ8" />
      </concept>
      <concept id="8962032619582305406" name="org.campagnelab.metar.tables.structure.StatementList" flags="ng" index="ZXjPh">
        <child id="8962032619582305407" name="transformations" index="ZXjPg" />
      </concept>
      <concept id="3402264987259919045" name="org.campagnelab.metar.tables.structure.FutureTable" flags="ng" index="3MlLWZ">
        <reference id="3402264987259919103" name="table" index="3MlLW5" />
        <child id="4166618652720259019" name="myOwnTable" index="3WeD9t" />
      </concept>
      <concept id="3402264987258987827" name="org.campagnelab.metar.tables.structure.Table" flags="ng" index="3Mpm39" />
      <concept id="3402264987265829888" name="org.campagnelab.metar.tables.structure.ColumnGroupContainer" flags="ng" index="3MzsBU">
        <child id="3402264987265829889" name="groups" index="3MzsBV" />
      </concept>
      <concept id="3402264987265829883" name="org.campagnelab.metar.tables.structure.ColumnGroup" flags="ng" index="3MzsS1" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="5ec1cd3d-0a50-4049-a8fa-ae768d7baa25" name="org.campagnelab.mps.XChart">
      <concept id="2202909375770430359" name="org.campagnelab.mps.XChart.structure.DataFile" flags="ng" index="31JGnK">
        <child id="2202909375770434164" name="columns" index="31JHgj" />
      </concept>
      <concept id="2202909375770430354" name="org.campagnelab.mps.XChart.structure.DelimitedFile" flags="ng" index="31JGnP">
        <property id="2202909375770898234" name="delimitor" index="31Cu5t" />
      </concept>
      <concept id="2202909375770434159" name="org.campagnelab.mps.XChart.structure.Column" flags="ng" index="31JHg8">
        <reference id="3328299660867197501" name="type" index="1YeEjl" />
      </concept>
    </language>
  </registry>
  <node concept="S1EQb" id="7hF4JJ2J252">
    <property role="2BDq$p" value="true" />
    <property role="TrG5h" value="Simulate Table" />
    <node concept="ZXjPh" id="7hF4JJ2J253" role="S1EQ8">
      <property role="S1EQ6" value="NTGTHOTQKN" />
      <node concept="2YmjXt" id="4CUtYZLMss" role="ZXjPg">
        <property role="S1EQ6" value="GXKWUBMSJV" />
        <property role="8NYsT" value="false" />
        <property role="2Ym5z5" value="10" />
        <node concept="3MlLWZ" id="4CUtYZLMsu" role="2Ym92R">
          <property role="TrG5h" value="covariate" />
          <ref role="3MlLW5" node="4CUtYZLMsv" resolve="covariate" />
          <node concept="3Mpm39" id="4CUtYZLMsv" role="3WeD9t">
            <property role="31Cu5t" value="&#9;" />
            <property role="TrG5h" value="covariate" />
            <node concept="31JHg8" id="4CUtYZLMsw" role="31JHgj">
              <property role="TrG5h" value="SampleName" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_9L" resolve="String" />
            </node>
          </node>
        </node>
        <node concept="3MlLWZ" id="4CUtYZLMu0" role="3curr3">
          <property role="TrG5h" value="simulate" />
          <ref role="3MlLW5" node="4CUtYZLMu1" resolve="simulate" />
          <node concept="3Mpm39" id="4CUtYZLMu1" role="3WeD9t">
            <property role="31Cu5t" value="&#9;" />
            <property role="TrG5h" value="simulate" />
            <node concept="31JHg8" id="4CUtYZLMuk" role="31JHgj">
              <property role="TrG5h" value="gene" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_9L" resolve="String" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuw" role="31JHgj">
              <property role="TrG5h" value="sample_1" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMux" role="31JHgj">
              <property role="TrG5h" value="sample_2" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuy" role="31JHgj">
              <property role="TrG5h" value="sample_3" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuz" role="31JHgj">
              <property role="TrG5h" value="sample_4" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMu$" role="31JHgj">
              <property role="TrG5h" value="sample_5" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMu_" role="31JHgj">
              <property role="TrG5h" value="sample_6" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuA" role="31JHgj">
              <property role="TrG5h" value="sample_7" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuB" role="31JHgj">
              <property role="TrG5h" value="sample_8" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuC" role="31JHgj">
              <property role="TrG5h" value="sample_9" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
            <node concept="31JHg8" id="4CUtYZLMuD" role="31JHgj">
              <property role="TrG5h" value="sample_10" />
              <ref role="1YeEjl" to="9nc5:1ID5TXdv_7G" resolve="Numeric" />
            </node>
          </node>
        </node>
        <node concept="2Ym5Ia" id="4CUtYZLMu2" role="2Ym7rR">
          <property role="2QI5xJ" value="30" />
          <property role="2QI5xi" value="50" />
          <node concept="2QPe6p" id="4CUtYZLMu3" role="2Ym5If" />
        </node>
        <node concept="2Ym7rd" id="4CUtYZLMu4" role="2Ym7rP" />
        <node concept="2QHcgp" id="4CUtYZLMul" role="2QHcwV">
          <node concept="2QPe6p" id="4CUtYZLMum" role="2QHcxs">
            <property role="TrG5h" value="sample_1" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMun" role="2QHcxs">
            <property role="TrG5h" value="sample_2" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMuo" role="2QHcxs">
            <property role="TrG5h" value="sample_3" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMup" role="2QHcxs">
            <property role="TrG5h" value="sample_4" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMuq" role="2QHcxs">
            <property role="TrG5h" value="sample_5" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMur" role="2QHcxs">
            <property role="TrG5h" value="sample_6" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMus" role="2QHcxs">
            <property role="TrG5h" value="sample_7" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMut" role="2QHcxs">
            <property role="TrG5h" value="sample_8" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMuu" role="2QHcxs">
            <property role="TrG5h" value="sample_9" />
          </node>
          <node concept="2QPe6p" id="4CUtYZLMuv" role="2QHcxs">
            <property role="TrG5h" value="sample_10" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3MzsBU" id="4CUtYZLMtX">
    <node concept="3MzsS1" id="4CUtYZLMtY" role="3MzsBV">
      <property role="TrG5h" value="sample-key" />
    </node>
  </node>
</model>

