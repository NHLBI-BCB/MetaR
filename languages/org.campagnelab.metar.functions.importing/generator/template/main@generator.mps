<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3002ef72-27f5-4307-88c6-fc59c09d3ea5(org.campagnelab.metar.functions.importing.generator.template.main@generator)">
  <persistence version="9" />
  <languages>
    <use id="c1747c67-8f42-4d83-9542-4a948aec17d9" name="org.campagnelab.metar.functions.importing" version="-1" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="-1" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="-1" />
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="-1" />
    <use id="32f503e8-061b-451e-bcb0-fef56aa05eb9" name="org.campagnelab.metar.inspect" version="-1" />
    <use id="901f5cf3-dc77-4c1e-bc5a-6382baee28b4" name="org.campagnelab.textoutput" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="jrxw" ref="r:9f2bbfbf-f8b7-4b3b-92b1-b6a0e9642c10(org.campagnelab.metar.tables.structure)" />
    <import index="v8sa" ref="r:db1b133e-9a0f-4319-b384-413408eb1729(org.campagnelab.metar.tables.behavior)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="8t56" ref="r:c30a0469-24e5-4b8a-89e7-0d2028c5aa49(org.campagnelab.metar.functions.importing.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1114706874351" name="jetbrains.mps.lang.generator.structure.CopySrcNodeMacro" flags="ln" index="29HgVG">
        <child id="1168024447342" name="sourceNodeQuery" index="3NFExx" />
      </concept>
      <concept id="1202776937179" name="jetbrains.mps.lang.generator.structure.AbandonInput_RuleConsequence" flags="lg" index="b5Tf3" />
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1167328349397" name="reductionMappingRule" index="3acgRq" />
      </concept>
      <concept id="1177093525992" name="jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence" flags="lg" index="gft3U">
        <child id="1177093586806" name="templateNode" index="gfFT$" />
      </concept>
      <concept id="1168559333462" name="jetbrains.mps.lang.generator.structure.TemplateDeclarationReference" flags="ln" index="j$656" />
      <concept id="1095672379244" name="jetbrains.mps.lang.generator.structure.TemplateFragment" flags="ng" index="raruj" />
      <concept id="1722980698497626400" name="jetbrains.mps.lang.generator.structure.ITemplateCall" flags="ng" index="v9R3L">
        <reference id="1722980698497626483" name="template" index="v9R2y" />
      </concept>
      <concept id="1167168920554" name="jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition" flags="in" index="30G5F_" />
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <property id="1167272244852" name="applyToConceptInheritors" index="36QftV" />
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
        <child id="1167169362365" name="conditionFunction" index="30HLyM" />
      </concept>
      <concept id="1227303129915" name="jetbrains.mps.lang.generator.structure.AbstractMacro" flags="lg" index="30XT8A">
        <property id="3265704088513289864" name="comment" index="34cw8o" />
      </concept>
      <concept id="1092059087312" name="jetbrains.mps.lang.generator.structure.TemplateDeclaration" flags="ig" index="13MO4I">
        <reference id="1168285871518" name="applicableConcept" index="3gUMe" />
        <child id="1092060348987" name="contentNode" index="13RCb5" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167327847730" name="jetbrains.mps.lang.generator.structure.Reduction_MappingRule" flags="lg" index="3aamgX">
        <child id="1169672767469" name="ruleConsequence" index="1lVwrX" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167945743726" name="jetbrains.mps.lang.generator.structure.IfMacro_Condition" flags="in" index="3IZrLx" />
      <concept id="1168024337012" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery" flags="in" index="3NFfHV" />
      <concept id="1118773211870" name="jetbrains.mps.lang.generator.structure.IfMacro" flags="ln" index="1W57fq">
        <child id="1194989344771" name="alternativeConsequence" index="UU_$l" />
        <child id="1167945861827" name="conditionFunction" index="3IZSJc" />
      </concept>
    </language>
    <language id="901f5cf3-dc77-4c1e-bc5a-6382baee28b4" name="org.campagnelab.textoutput">
      <concept id="5039633819242576787" name="org.campagnelab.textoutput.structure.Lines" flags="ng" index="2G3XJi">
        <child id="5039633819242576854" name="lines" index="2G3XIn" />
      </concept>
      <concept id="5493669862519709805" name="org.campagnelab.textoutput.structure.Line" flags="ng" index="1gZcZf">
        <property id="5493669862519718600" name="text" index="1gZaPE" />
        <child id="1680136183140337477" name="phrases" index="3_3kQL" />
      </concept>
      <concept id="1680136183140337486" name="org.campagnelab.textoutput.structure.Phrase" flags="ng" index="3_3kQU">
        <property id="1680136183140337487" name="text" index="3_3kQV" />
      </concept>
    </language>
    <language id="c1747c67-8f42-4d83-9542-4a948aec17d9" name="org.campagnelab.metar.functions.importing">
      <concept id="2324880425333148499" name="org.campagnelab.metar.functions.importing.structure.Stubs" flags="ng" index="3TvA$Y">
        <property id="2324880425333420411" name="isBioconductor" index="3T0_cm" />
      </concept>
    </language>
    <language id="32f503e8-061b-451e-bcb0-fef56aa05eb9" name="org.campagnelab.metar.inspect">
      <concept id="8969925079115431553" name="org.campagnelab.metar.inspect.structure.TryForNode" flags="ng" index="3eWmRk">
        <property id="8969925079115431616" name="nodeId" index="3eWmQl" />
        <child id="8969925079115431619" name="try" index="3eWmQm" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="propertyName" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="bUwia" id="7BS5aCD41nG">
    <property role="TrG5h" value="main" />
    <node concept="3aamgX" id="AYlbCANkEs" role="3acgRq">
      <property role="36QftV" value="true" />
      <ref role="30HIoZ" to="8t56:7BS5aCD41ov" resolve="ImportPackage" />
      <node concept="j$656" id="AYlbCANkEt" role="1lVwrX">
        <ref role="v9R2y" node="6kVgbi6iGEe" resolve="reduce_ImportPackage" />
      </node>
      <node concept="30G5F_" id="YA$ymmY7Af" role="30HLyM">
        <node concept="3clFbS" id="YA$ymmY7Ag" role="2VODD2">
          <node concept="3clFbF" id="YA$ymmY7Hy" role="3cqZAp">
            <node concept="2OqwBi" id="YA$ymmY9AO" role="3clFbG">
              <node concept="2OqwBi" id="YA$ymmY7Na" role="2Oq$k0">
                <node concept="30H73N" id="YA$ymmY7Hx" role="2Oq$k0" />
                <node concept="3Tsc0h" id="YA$ymmY8ES" role="2OqNvi">
                  <ref role="3TtcxE" to="8t56:2n2dP0rz_yM" />
                </node>
              </node>
              <node concept="1v1jN8" id="YA$ymmYcms" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="YA$ymnyKPk" role="3acgRq">
      <ref role="30HIoZ" to="8t56:7BS5aCD41ov" resolve="ImportPackage" />
      <node concept="30G5F_" id="YA$ymnyL3K" role="30HLyM">
        <node concept="3clFbS" id="YA$ymnyL3L" role="2VODD2">
          <node concept="3clFbF" id="YA$ymnyL8H" role="3cqZAp">
            <node concept="2OqwBi" id="YA$ymnyN1Z" role="3clFbG">
              <node concept="2OqwBi" id="YA$ymnyLel" role="2Oq$k0">
                <node concept="30H73N" id="YA$ymnyL8G" role="2Oq$k0" />
                <node concept="3Tsc0h" id="YA$ymnyM63" role="2OqNvi">
                  <ref role="3TtcxE" to="8t56:2n2dP0rz_yM" />
                </node>
              </node>
              <node concept="3GX2aA" id="YA$ymnyRlq" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
      <node concept="b5Tf3" id="2ExvV8ps25n" role="1lVwrX" />
    </node>
    <node concept="3aamgX" id="YA$ymnyRz8" role="3acgRq">
      <ref role="30HIoZ" to="8t56:2n2dP0rzrIW" resolve="ImportStubs" />
      <node concept="gft3U" id="213CARpjm8N" role="1lVwrX">
        <node concept="3TvA$Y" id="213CARpjm8V" role="gfFT$">
          <property role="3T0_cm" value="false" />
          <property role="TrG5h" value="stubs" />
          <node concept="29HgVG" id="213CARpjm92" role="lGtFl">
            <node concept="3NFfHV" id="213CARpjm95" role="3NFExx">
              <node concept="3clFbS" id="213CARpjm96" role="2VODD2">
                <node concept="3clFbF" id="213CARpjm9K" role="3cqZAp">
                  <node concept="2OqwBi" id="213CARpjmdj" role="3clFbG">
                    <node concept="30H73N" id="213CARpjm9J" role="2Oq$k0" />
                    <node concept="3TrEf2" id="213CARpjmub" role="2OqNvi">
                      <ref role="3Tt5mk" to="8t56:2n2dP0rzyqm" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3aamgX" id="213CARpfFOy" role="3acgRq">
      <ref role="30HIoZ" to="8t56:213CARpfsHj" resolve="Stubs" />
      <node concept="j$656" id="213CARpgJJu" role="1lVwrX">
        <ref role="v9R2y" node="5HtHr3DJtI3" resolve="reduce_Stubs" />
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="6kVgbi6iGEe">
    <property role="TrG5h" value="reduce_ImportPackage" />
    <ref role="3gUMe" to="8t56:7BS5aCD41ov" resolve="ImportPackage" />
    <node concept="3eWmRk" id="6kVgbi6iGUN" role="13RCb5">
      <property role="1gZaPE" value="" />
      <property role="3eWmQl" value="nodeid" />
      <node concept="1gZcZf" id="oeXtRYm32a" role="2G3XIn">
        <node concept="3_3kQU" id="6kVgbi6iGUT" role="3_3kQL">
          <property role="3_3kQV" value="" />
        </node>
      </node>
      <node concept="1gZcZf" id="6kVgbi6iGUO" role="2G3XIn">
        <property role="1gZaPE" value="" />
      </node>
      <node concept="1gZcZf" id="6kVgbi6iGUQ" role="2G3XIn">
        <property role="1gZaPE" value="" />
        <node concept="3_3kQU" id="6kVgbi6iGUR" role="3_3kQL">
          <property role="3_3kQV" value="" />
        </node>
      </node>
      <node concept="2G3XJi" id="6kVgbi6iGUV" role="3eWmQm">
        <property role="1gZaPE" value="" />
        <node concept="1gZcZf" id="4OlXQqAj1q2" role="2G3XIn">
          <node concept="3_3kQU" id="6kVgbi6iGV1" role="3_3kQL">
            <property role="3_3kQV" value="" />
          </node>
        </node>
        <node concept="2G3XJi" id="6kVgbi6iItu" role="2G3XIn">
          <property role="1gZaPE" value="" />
          <node concept="1gZcZf" id="6kVgbi6iItw" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="6kVgbi6iItx" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="oeXtRXJM$H" role="3_3kQL">
              <property role="3_3kQV" value="## set output file" />
            </node>
            <node concept="3_3kQU" id="AYlbCANsst" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="AYlbCANsti" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="AYlbCANsu9" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="AYlbCANsui" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANsvd" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANMIP" role="3_3kQL">
              <property role="3_3kQV" value="stubsFile &lt;- &quot;" />
            </node>
            <node concept="3_3kQU" id="AYlbCANMIQ" role="3_3kQL">
              <property role="3_3kQV" value="stubs.R" />
              <node concept="17Uvod" id="AYlbCANMIY" role="lGtFl">
                <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
                <property role="2qtEX9" value="text" />
                <property role="34cw8o" value="output file with the funtions stubs" />
                <node concept="3zFVjK" id="AYlbCANMIZ" role="3zH0cK">
                  <node concept="3clFbS" id="AYlbCANMJ0" role="2VODD2">
                    <node concept="3clFbF" id="AYlbCANMRp" role="3cqZAp">
                      <node concept="2OqwBi" id="AYlbCANMWC" role="3clFbG">
                        <node concept="30H73N" id="AYlbCANMRo" role="2Oq$k0" />
                        <node concept="3TrcHB" id="AYlbCANNhr" role="2OqNvi">
                          <ref role="3TsBF5" to="8t56:AYlbCAFbMU" resolve="sourceFile" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3_3kQU" id="AYlbCANMIR" role="3_3kQL">
              <property role="3_3kQV" value="&quot;" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANuid" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANuie" role="3_3kQL">
              <property role="3_3kQV" value="unlink(stubsFile)" />
            </node>
            <node concept="3_3kQU" id="AYlbCANwiO" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOokr" role="2G3XIn" />
          <node concept="1gZcZf" id="AYlbCANwjD" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANwjE" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOoq2" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCAOoq4" role="3_3kQL">
              <property role="3_3kQV" value="## send output to the file" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANvnw" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANvny" role="3_3kQL">
              <property role="3_3kQV" value="sink(stubsFile)" />
            </node>
            <node concept="3_3kQU" id="AYlbCAOmTQ" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOmVL" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAOn4B" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOp4o" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAOp4p" role="3_3kQL">
              <property role="3_3kQV" value="## get all objects from the package" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOoAP" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAOoAQ" role="3_3kQL">
              <property role="3_3kQV" value="objs &lt;- mget(ls(paste(&quot;package&quot;,&quot;" />
            </node>
            <node concept="3_3kQU" id="AYlbCAOn4C" role="3_3kQL">
              <property role="3_3kQV" value="package" />
              <node concept="17Uvod" id="AYlbCAOn4K" role="lGtFl">
                <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
                <property role="2qtEX9" value="text" />
                <property role="34cw8o" value="package to import" />
                <node concept="3zFVjK" id="AYlbCAOn4L" role="3zH0cK">
                  <node concept="3clFbS" id="AYlbCAOn4M" role="2VODD2">
                    <node concept="3clFbF" id="AYlbCAOn9U" role="3cqZAp">
                      <node concept="2OqwBi" id="AYlbCAOnf9" role="3clFbG">
                        <node concept="30H73N" id="AYlbCAOn9T" role="2Oq$k0" />
                        <node concept="3TrcHB" id="AYlbCAOnus" role="2OqNvi">
                          <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3_3kQU" id="AYlbCAOn4D" role="3_3kQL">
              <property role="3_3kQV" value="&quot;,sep=&quot;:&quot;)), inherits = TRUE)" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANtmZ" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="AYlbCANxwI" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANxwK" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOpwO" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAOpwP" role="3_3kQL">
              <property role="3_3kQV" value="## filter functions from the list" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOoKk" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAOoKl" role="3_3kQL">
              <property role="3_3kQV" value="functions &lt;- Filter(is.function, objs)" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANtmW" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="AYlbCANyA$" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANyAA" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAOoTk" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAOoTl" role="3_3kQL">
              <property role="3_3kQV" value="for (n in 1:length(functions)) {" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAN$vI" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCAN$vJ" role="3_3kQL">
              <property role="3_3kQV" value="   fname &lt;- names(functions[n])" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEBrzS" role="2G3XIn" />
          <node concept="1gZcZf" id="AYlbCAN_yL" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="AYlbCAN_yI" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCAN_yJ" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="AYlbCAN_yK" role="3_3kQL">
              <property role="3_3kQV" value=" functionDeclaration &lt;- deparse(args(fname))" />
            </node>
            <node concept="3_3kQU" id="28AXeAEDpbl" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="28AXeAEDpbs" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEDpb_" role="2G3XIn">
            <node concept="3_3kQU" id="28AXeAEDpbA" role="3_3kQL">
              <property role="3_3kQV" value="   if (length(i &lt;- grep(&quot;^function&quot;, functionDeclaration))) {" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCAN_yF" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCAN_yH" role="3_3kQL" />
            <node concept="3_3kQU" id="AYlbCANAKR" role="3_3kQL">
              <property role="3_3kQV" value="    if (length(i2 &lt;- grep(&quot;^\\.?[a-zA-Z0-9_$\\.]*$&quot;, fname))) {" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEBrLe" role="2G3XIn" />
          <node concept="1gZcZf" id="28AXeAEBrUP" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="28AXeAEBrUM" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="28AXeAEBrUJ" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="28AXeAEBrUK" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="28AXeAEBrUL" role="3_3kQL">
              <property role="3_3kQV" value="      cat(fname)" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEBrUG" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="28AXeAEBrUI" role="3_3kQL">
              <property role="3_3kQV" value="     } else {" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEBrUD" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="28AXeAEBrUE" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="28AXeAEBrUF" role="3_3kQL">
              <property role="3_3kQV" value="     cat(paste(&quot;\&quot;&quot;, fname,&quot;\&quot;&quot;, sep=&quot;&quot;))" />
            </node>
            <node concept="3_3kQU" id="28AXeAEBs4X" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEBs54" role="2G3XIn">
            <node concept="3_3kQU" id="28AXeAEBs55" role="3_3kQL">
              <property role="3_3kQV" value="     }" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANAMB" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANAMC" role="3_3kQL">
              <property role="3_3kQV" value="     cat(&quot; &lt;- &quot;)" />
            </node>
            <node concept="3_3kQU" id="28AXeAEBrL9" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANBQ5" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANBQ7" role="3_3kQL">
              <property role="3_3kQV" value="     cat(functionDeclaration)" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANEUk" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANQpT" role="3_3kQL">
              <property role="3_3kQV" value="     cat (&quot; " />
            </node>
            <node concept="3_3kQU" id="AYlbCANQpU" role="3_3kQL">
              <property role="3_3kQV" value="newline" />
              <node concept="17Uvod" id="AYlbCANQq2" role="lGtFl">
                <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
                <property role="2qtEX9" value="text" />
                <property role="34cw8o" value="to avoid automatic splitting in two lines" />
                <node concept="3zFVjK" id="AYlbCANQq3" role="3zH0cK">
                  <node concept="3clFbS" id="AYlbCANQq4" role="2VODD2">
                    <node concept="3clFbF" id="AYlbCANQv8" role="3cqZAp">
                      <node concept="Xl_RD" id="AYlbCANQv7" role="3clFbG">
                        <property role="Xl_RC" value="\n" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3_3kQU" id="AYlbCANQpV" role="3_3kQL">
              <property role="3_3kQV" value="&quot;)" />
            </node>
          </node>
          <node concept="1gZcZf" id="28AXeAEDplY" role="2G3XIn">
            <node concept="3_3kQU" id="28AXeAEDplZ" role="3_3kQL">
              <property role="3_3kQV" value="  }" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANzwA" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANzwB" role="3_3kQL">
              <property role="3_3kQV" value="}" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANtmT" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="AYlbCANtmQ" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANtmR" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANMzT" role="2G3XIn">
            <node concept="3_3kQU" id="AYlbCANMzU" role="3_3kQL">
              <property role="3_3kQV" value="## back to the console" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANMB7" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANMB9" role="3_3kQL">
              <property role="3_3kQV" value="sink() " />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANMB4" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANMB6" role="3_3kQL">
              <property role="3_3kQV" value="sink(type = &quot;message&quot;)" />
            </node>
          </node>
          <node concept="1gZcZf" id="AYlbCANtmN" role="2G3XIn">
            <property role="1gZaPE" value="" />
            <node concept="3_3kQU" id="AYlbCANtmO" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
            <node concept="3_3kQU" id="AYlbCANtmP" role="3_3kQL">
              <property role="3_3kQV" value="" />
            </node>
          </node>
          <node concept="1gZcZf" id="6kVgbi6iIux" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
        </node>
        <node concept="2G3XJi" id="4uiWCTtS1gC" role="2G3XIn">
          <property role="1gZaPE" value="" />
          <node concept="1gZcZf" id="4uiWCTtS1gD" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="4uiWCTtUsWq" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
          <node concept="1gZcZf" id="4uiWCTtS1gE" role="2G3XIn">
            <property role="1gZaPE" value="" />
          </node>
        </node>
        <node concept="1gZcZf" id="6kVgbi6iGUY" role="2G3XIn">
          <property role="1gZaPE" value="" />
          <node concept="3_3kQU" id="6kVgbi6iGUZ" role="3_3kQL">
            <property role="3_3kQV" value="" />
          </node>
        </node>
      </node>
      <node concept="raruj" id="6kVgbi6iGVd" role="lGtFl" />
      <node concept="17Uvod" id="6kVgbi6iHhe" role="lGtFl">
        <property role="P4ACc" value="32f503e8-061b-451e-bcb0-fef56aa05eb9/8969925079115431553/8969925079115431616" />
        <property role="2qtEX9" value="nodeId" />
        <node concept="3zFVjK" id="6kVgbi6iHhf" role="3zH0cK">
          <node concept="3clFbS" id="6kVgbi6iHhg" role="2VODD2">
            <node concept="3clFbF" id="6kVgbi6iHqS" role="3cqZAp">
              <node concept="2OqwBi" id="6kVgbi6iHw7" role="3clFbG">
                <node concept="30H73N" id="6kVgbi6iHqR" role="2Oq$k0" />
                <node concept="2qgKlT" id="4OlXQqAhgFu" role="2OqNvi">
                  <ref role="37wK5l" to="v8sa:2AV3DmgHDX5" resolve="id" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="4lfKH_J5Gys" role="lGtFl">
        <property role="P4ACc" value="32f503e8-061b-451e-bcb0-fef56aa05eb9/8969925079115431553/2742007948304393655" />
        <property role="2qtEX9" value="enabled" />
        <node concept="3zFVjK" id="4lfKH_J5Gyt" role="3zH0cK">
          <node concept="3clFbS" id="4lfKH_J5Gyu" role="2VODD2">
            <node concept="3clFbF" id="2od$re20h56" role="3cqZAp">
              <node concept="2OqwBi" id="2od$re20hbl" role="3clFbG">
                <node concept="30H73N" id="2od$re20h55" role="2Oq$k0" />
                <node concept="2qgKlT" id="2od$re20oR2" role="2OqNvi">
                  <ref role="37wK5l" to="v8sa:2od$re20jdz" resolve="errorCatchingEnabled" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="5HtHr3DJtI3">
    <property role="TrG5h" value="reduce_Stubs" />
    <ref role="3gUMe" to="8t56:213CARpfsHj" resolve="Stubs" />
    <node concept="2G3XJi" id="5HtHr3DJtI5" role="13RCb5">
      <property role="1gZaPE" value="" />
      <node concept="1gZcZf" id="5csGvVLtgxy" role="2G3XIn">
        <property role="1gZaPE" value="" />
        <node concept="3_3kQU" id="213CARpgx$p" role="3_3kQL">
          <property role="3_3kQV" value="if (!require(&quot;" />
        </node>
        <node concept="3_3kQU" id="213CARpgx$q" role="3_3kQL">
          <property role="3_3kQV" value="package" />
          <node concept="17Uvod" id="213CARpgxOP" role="lGtFl">
            <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
            <property role="2qtEX9" value="text" />
            <node concept="3zFVjK" id="213CARpgxOQ" role="3zH0cK">
              <node concept="3clFbS" id="213CARpgxOR" role="2VODD2">
                <node concept="3clFbF" id="213CARpgxTV" role="3cqZAp">
                  <node concept="2OqwBi" id="213CARpgxYJ" role="3clFbG">
                    <node concept="30H73N" id="213CARpgxTU" role="2Oq$k0" />
                    <node concept="3TrcHB" id="213CARpgyeK" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3_3kQU" id="213CARpgyqK" role="3_3kQL">
          <property role="3_3kQV" value="&quot;)) {install.packages(&quot;" />
        </node>
        <node concept="3_3kQU" id="213CARpgyqL" role="3_3kQL">
          <property role="3_3kQV" value="package" />
          <node concept="17Uvod" id="213CARpgyFY" role="lGtFl">
            <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
            <property role="2qtEX9" value="text" />
            <node concept="3zFVjK" id="213CARpgyFZ" role="3zH0cK">
              <node concept="3clFbS" id="213CARpgyG0" role="2VODD2">
                <node concept="3clFbF" id="213CARpgyL4" role="3cqZAp">
                  <node concept="2OqwBi" id="213CARpgyPS" role="3clFbG">
                    <node concept="30H73N" id="213CARpgyL3" role="2Oq$k0" />
                    <node concept="3TrcHB" id="213CARpgz5T" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3_3kQU" id="213CARpgyqM" role="3_3kQL">
          <property role="3_3kQV" value="&quot;,repos='http://cran.us.r-project.org'); library(&quot;" />
        </node>
        <node concept="3_3kQU" id="213CARpgyqN" role="3_3kQL">
          <property role="3_3kQV" value="package" />
          <node concept="17Uvod" id="213CARpgzc5" role="lGtFl">
            <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
            <property role="2qtEX9" value="text" />
            <node concept="3zFVjK" id="213CARpgzc6" role="3zH0cK">
              <node concept="3clFbS" id="213CARpgzc7" role="2VODD2">
                <node concept="3clFbF" id="213CARpgzhb" role="3cqZAp">
                  <node concept="2OqwBi" id="213CARpgzlZ" role="3clFbG">
                    <node concept="30H73N" id="213CARpgzha" role="2Oq$k0" />
                    <node concept="3TrcHB" id="213CARpgzA0" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3_3kQU" id="213CARpgyqO" role="3_3kQL">
          <property role="3_3kQV" value="&quot;)}" />
        </node>
        <node concept="3_3kQU" id="5csGvVLtgxz" role="3_3kQL">
          <property role="3_3kQV" value="" />
        </node>
        <node concept="3_3kQU" id="5csGvVLtgx$" role="3_3kQL">
          <property role="3_3kQV" value="" />
        </node>
        <node concept="1W57fq" id="7jqSt7$AhFH" role="lGtFl">
          <node concept="3IZrLx" id="7jqSt7$AhFJ" role="3IZSJc">
            <node concept="3clFbS" id="7jqSt7$AhFL" role="2VODD2">
              <node concept="3clFbF" id="7jqSt7$AhKQ" role="3cqZAp">
                <node concept="3fqX7Q" id="213CARpgwkc" role="3clFbG">
                  <node concept="2OqwBi" id="213CARpgwke" role="3fr31v">
                    <node concept="30H73N" id="213CARpgwkf" role="2Oq$k0" />
                    <node concept="3TrcHB" id="213CARpgwkg" role="2OqNvi">
                      <ref role="3TsBF5" to="8t56:213CARpgv5V" resolve="isBioconductor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="gft3U" id="213CARpgwwc" role="UU_$l">
            <node concept="2G3XJi" id="213CARpgxlT" role="gfFT$">
              <node concept="3_3kQU" id="213CARpgxlU" role="3_3kQL">
                <property role="3_3kQV" value="" />
              </node>
              <node concept="1gZcZf" id="5HtHr3EfCIh" role="2G3XIn">
                <property role="1gZaPE" value="" />
                <node concept="3_3kQU" id="213CARpg_dr" role="3_3kQL">
                  <property role="3_3kQV" value="if (!require(&quot;" />
                </node>
                <node concept="3_3kQU" id="213CARpg_ds" role="3_3kQL">
                  <property role="3_3kQV" value="package" />
                  <node concept="17Uvod" id="213CARpg_d$" role="lGtFl">
                    <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
                    <property role="2qtEX9" value="text" />
                    <node concept="3zFVjK" id="213CARpg_d_" role="3zH0cK">
                      <node concept="3clFbS" id="213CARpg_dA" role="2VODD2">
                        <node concept="3clFbF" id="213CARpg_iE" role="3cqZAp">
                          <node concept="2OqwBi" id="213CARpg_nu" role="3clFbG">
                            <node concept="30H73N" id="213CARpg_iD" role="2Oq$k0" />
                            <node concept="3TrcHB" id="213CARpg_M4" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3_3kQU" id="213CARpg_dt" role="3_3kQL">
                  <property role="3_3kQV" value="&quot;)) {" />
                </node>
                <node concept="3_3kQU" id="213CARpgA6k" role="3_3kQL">
                  <property role="3_3kQV" value="" />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpg_Yp" role="2G3XIn">
                <property role="1gZaPE" value="" />
                <node concept="3_3kQU" id="213CARpg_Yq" role="3_3kQL">
                  <property role="3_3kQV" value="" />
                </node>
                <node concept="3_3kQU" id="213CARpgAkk" role="3_3kQL">
                  <property role="3_3kQV" value="if (!require(&quot;BiocInstaller&quot;)) { " />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpgAkr" role="2G3XIn">
                <node concept="3_3kQU" id="213CARpgAks" role="3_3kQL">
                  <property role="3_3kQV" value="    source(&quot;http://bioconductor.org/biocLite.R&quot;, local=TRUE)  " />
                </node>
                <node concept="3_3kQU" id="213CARpg_Yr" role="3_3kQL">
                  <property role="3_3kQV" value="" />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpgAct" role="2G3XIn">
                <property role="1gZaPE" value="" />
                <node concept="3_3kQU" id="213CARpgAcu" role="3_3kQL">
                  <property role="3_3kQV" value="" />
                </node>
                <node concept="3_3kQU" id="213CARpgAcv" role="3_3kQL">
                  <property role="3_3kQV" value="}" />
                </node>
                <node concept="3_3kQU" id="213CARpg_Sg" role="3_3kQL">
                  <property role="3_3kQV" value="" />
                </node>
                <node concept="3_3kQU" id="213CARpgAsi" role="3_3kQL" />
              </node>
              <node concept="1gZcZf" id="213CARpgAsr" role="2G3XIn">
                <node concept="3_3kQU" id="213CARpgAss" role="3_3kQL">
                  <property role="3_3kQV" value="  " />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpgALD" role="2G3XIn">
                <property role="1gZaPE" value="" />
                <node concept="3_3kQU" id="213CARpgALE" role="3_3kQL">
                  <property role="3_3kQV" value="  biocLite(ask=FALSE, c(&quot;" />
                </node>
                <node concept="3_3kQU" id="213CARpgALF" role="3_3kQL">
                  <property role="3_3kQV" value="&quot;package&quot;" />
                  <node concept="17Uvod" id="213CARpgALG" role="lGtFl">
                    <property role="2qtEX9" value="text" />
                    <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
                    <node concept="3zFVjK" id="213CARpgALH" role="3zH0cK">
                      <node concept="3clFbS" id="213CARpgALI" role="2VODD2">
                        <node concept="3clFbF" id="213CARpgALJ" role="3cqZAp">
                          <node concept="2OqwBi" id="213CARpgALK" role="3clFbG">
                            <node concept="30H73N" id="213CARpgALL" role="2Oq$k0" />
                            <node concept="3TrcHB" id="213CARpgALM" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3_3kQU" id="213CARpgALN" role="3_3kQL">
                  <property role="3_3kQV" value="&quot;))" />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpgA$f" role="2G3XIn">
                <node concept="3_3kQU" id="213CARpgAUL" role="3_3kQL">
                  <property role="3_3kQV" value="  library(&quot;" />
                </node>
                <node concept="3_3kQU" id="213CARpgAUM" role="3_3kQL">
                  <property role="3_3kQV" value="package" />
                  <node concept="17Uvod" id="213CARpgAUU" role="lGtFl">
                    <property role="P4ACc" value="901f5cf3-dc77-4c1e-bc5a-6382baee28b4/1680136183140337486/1680136183140337487" />
                    <property role="2qtEX9" value="text" />
                    <node concept="3zFVjK" id="213CARpgAUV" role="3zH0cK">
                      <node concept="3clFbS" id="213CARpgAUW" role="2VODD2">
                        <node concept="3clFbF" id="213CARpgB00" role="3cqZAp">
                          <node concept="2OqwBi" id="213CARpgB4O" role="3clFbG">
                            <node concept="30H73N" id="213CARpgAZZ" role="2Oq$k0" />
                            <node concept="3TrcHB" id="213CARpgBkP" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3_3kQU" id="213CARpgAUN" role="3_3kQL">
                  <property role="3_3kQV" value="&quot;)" />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpgACQ" role="2G3XIn">
                <property role="1gZaPE" value="" />
                <node concept="3_3kQU" id="213CARpgACS" role="3_3kQL">
                  <property role="3_3kQV" value="} " />
                </node>
              </node>
              <node concept="1gZcZf" id="213CARpg_6y" role="2G3XIn">
                <property role="1gZaPE" value="" />
              </node>
              <node concept="1gZcZf" id="5HtHr3EcHMQ" role="2G3XIn">
                <property role="1gZaPE" value="" />
              </node>
              <node concept="2G3XJi" id="1t7sLRIpJKk" role="2G3XIn">
                <property role="1gZaPE" value="" />
                <node concept="1gZcZf" id="1t7sLRIpJKm" role="2G3XIn">
                  <property role="1gZaPE" value="" />
                </node>
                <node concept="1gZcZf" id="213CARpg_2t" role="2G3XIn" />
              </node>
              <node concept="1gZcZf" id="213CARpgxlW" role="2G3XIn" />
            </node>
          </node>
        </node>
      </node>
      <node concept="1gZcZf" id="213CARpgwA9" role="2G3XIn">
        <node concept="3_3kQU" id="213CARpgwAa" role="3_3kQL">
          <property role="3_3kQV" value="" />
        </node>
      </node>
      <node concept="3_3kQU" id="5HtHr3DJtI8" role="3_3kQL">
        <property role="3_3kQV" value="" />
      </node>
      <node concept="1gZcZf" id="5HtHr3DJtIa" role="2G3XIn">
        <property role="1gZaPE" value="" />
        <node concept="3_3kQU" id="5HtHr3DJtIb" role="3_3kQL">
          <property role="3_3kQV" value="" />
        </node>
      </node>
      <node concept="raruj" id="5HtHr3DJtJ3" role="lGtFl" />
    </node>
  </node>
</model>
