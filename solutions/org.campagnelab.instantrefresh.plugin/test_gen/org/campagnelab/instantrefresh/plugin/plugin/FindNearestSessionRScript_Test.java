package org.campagnelab.instantrefresh.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import junit.framework.Assert;

@MPSLaunch
public class FindNearestSessionRScript_Test extends BaseTransformationTest {
  @Test
  public void test_r1() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindNearestSessionRScript_Test$TestBody", "test_r1", true);
  }
  @Test
  public void test_r2() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindNearestSessionRScript_Test$TestBody", "test_r2", true);
  }
  @Test
  public void test_r3() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindNearestSessionRScript_Test$TestBody", "test_r3", true);
  }
  @Test
  public void test_r4() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindNearestSessionRScript_Test$TestBody", "test_r4", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_r1() throws Exception {
      addNodeById("7834511297252353258");
      addNodeById("5602467779903612471");
      addNodeById("5602467779907387899");
      addNodeById("5602467779908018720");
      TestHelper.fakeSaveSession(SNodeOperations.cast(getNodeById("7834511297252353264"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
      Assert.assertEquals(SNodeOperations.cast(getNodeById("7834511297252353264"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")), TestHelper.getNearestSessionRScript(SNodeOperations.cast(getNodeById("7834511297252353260"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("7834511297252353274"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr"))));
      TestHelper.deleteTempResultsFolder(SNodeOperations.cast(getNodeById("7834511297252353264"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
    }
    public void test_r2() throws Exception {
      addNodeById("7834511297252353258");
      addNodeById("5602467779903612471");
      addNodeById("5602467779907387899");
      addNodeById("5602467779908018720");
      TestHelper.fakeSaveSession(SNodeOperations.cast(getNodeById("5602467779903612501"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
      Assert.assertEquals(SNodeOperations.cast(getNodeById("5602467779903612501"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")), TestHelper.getNearestSessionRScript(SNodeOperations.cast(getNodeById("5602467779903612472"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779903612475"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr"))));
      TestHelper.deleteTempResultsFolder(SNodeOperations.cast(getNodeById("5602467779903612501"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
    }
    public void test_r3() throws Exception {
      addNodeById("7834511297252353258");
      addNodeById("5602467779903612471");
      addNodeById("5602467779907387899");
      addNodeById("5602467779908018720");
      // we need to manually convert r3 to root because getExpressionRoot is executed before the conversion happens. 
      TestHelper.fakeSaveSession(SNodeOperations.cast(getNodeById("5602467779907387903"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
      TestHelper.convertNodeToRoot(SNodeOperations.cast(getNodeById("5602467779907387900"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")));
      Assert.assertEquals(SNodeOperations.cast(getNodeById("5602467779907387903"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")), TestHelper.getNearestSessionRScript(SNodeOperations.cast(getNodeById("5602467779907387900"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(ChangedNodesHelper.getExpressionRoot(SNodeOperations.cast(getNodeById("5602467779907387905"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.getParent(SNodeOperations.cast(getNodeById("5602467779907387905"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")))), MetaAdapterFactory.getInterfaceConcept(0x95951e17c0d647b9L, 0xb1b542a4ca186fc6L, 0x1168d32e575dc596L, "org.campagnelab.instantrefresh.structure.IAtomic"))));

      TestHelper.deleteTempResultsFolder(SNodeOperations.cast(getNodeById("5602467779907387903"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
    }
    public void test_r4() throws Exception {
      addNodeById("7834511297252353258");
      addNodeById("5602467779903612471");
      addNodeById("5602467779907387899");
      addNodeById("5602467779908018720");
      Assert.assertNull(TestHelper.getNearestSessionRScript(SNodeOperations.cast(getNodeById("5602467779908018721"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779908018727"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr"))));
    }


  }
}
