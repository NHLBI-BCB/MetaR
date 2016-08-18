package org.campagnelab.instantrefresh.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import junit.framework.Assert;

@MPSLaunch
public class FindChangedExprsWithoutSession_Test extends BaseTransformationTest {
  @Test
  public void test_r1() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r1", true);
  }
  @Test
  public void test_r2() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r2", true);
  }
  @Test
  public void test_r3() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r3", true);
  }
  @Test
  public void test_r4() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r4", true);
  }
  @Test
  public void test_r5() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r5", true);
  }
  @Test
  public void test_r6() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r6", true);
  }
  @Test
  public void test_r7() throws Throwable {
    initTest("${org.campagnelab.metaR.home}", "r:8c8e7c7a-f1cb-4808-9480-84094238b5cc(org.campagnelab.instantrefresh.plugin.plugin@tests)", false);
    runTest("org.campagnelab.instantrefresh.plugin.plugin.FindChangedExprsWithoutSession_Test$TestBody", "test_r7", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_r1() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("5602467779903629912"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779903629909"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779903629913"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52b7L, "org.campagnelab.metar.R.structure.Identifier"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779903629909"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779903629914"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52baL, "org.campagnelab.metar.R.structure.IntLiteralExpr"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779903629909"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779903629915"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x6c9855e84894644L, "org.campagnelab.metar.R.structure.SimpleAssignment"))));
    }
    public void test_r2() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("5602467779905304795"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.cast(getNodeById("5602467779905304820"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779905304794"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779905304797"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52baL, "org.campagnelab.metar.R.structure.IntLiteralExpr"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779905304794"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779905304796"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52b7L, "org.campagnelab.metar.R.structure.Identifier"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779905304794"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779905304798"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x6c9855e84894644L, "org.campagnelab.metar.R.structure.SimpleAssignment"))));
    }
    public void test_r3() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("5602467779906115259"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.cast(getNodeById("5602467779906116267"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.cast(getNodeById("5602467779906115265"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779906115258"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779906116301"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52baL, "org.campagnelab.metar.R.structure.IntLiteralExpr"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779906115258"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779906115260"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52b7L, "org.campagnelab.metar.R.structure.Identifier"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779906115258"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779906115263"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x6c9855e84894644L, "org.campagnelab.metar.R.structure.SimpleAssignment"))));
    }
    public void test_r4() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      TestHelper.fakeSaveSession(SNodeOperations.cast(getNodeById("1419026042554497895"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("1405249123697929223"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52a4L, "org.campagnelab.metar.R.structure.ComparisonExpr")), SNodeOperations.cast(getNodeById("1405249123697929256"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr")), SNodeOperations.cast(getNodeById("1405249123697929291"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779906703089"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("1405249123697929231"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52baL, "org.campagnelab.metar.R.structure.IntLiteralExpr"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779906703089"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("1405249123697929229"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x14d038586597da88L, "org.campagnelab.metar.R.structure.IdentifierRef"))));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779906703089"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("1405249123697929230"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x6c9855e84894644L, "org.campagnelab.metar.R.structure.SimpleAssignment"))));
      TestHelper.deleteTempResultsFolder(SNodeOperations.cast(getNodeById("1419026042554497895"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x286b139ecca2e1feL, "org.campagnelab.metar.R.structure.SaveSession")));
    }
    public void test_r5() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("5602467779908054971"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779908054835"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779908054971"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr"))));
    }
    public void test_r6() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("5602467779911322962"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.cast(getNodeById("5602467779911322988"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.cast(getNodeById("5602467779911323041"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("5602467779911322833"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("5602467779911322968"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52baL, "org.campagnelab.metar.R.structure.IntLiteralExpr"))));
    }
    public void test_r7() throws Exception {
      addNodeById("5602467779903629908");
      addNodeById("5602467779905304793");
      addNodeById("5602467779906115257");
      addNodeById("5602467779906702999");
      addNodeById("5602467779908054834");
      addNodeById("5602467779911322832");
      addNodeById("1419026042558778770");
      Set<SNode> expected = SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.cast(getNodeById("1419026042558778989"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52aaL, "org.campagnelab.metar.R.structure.AssignmentOperatorExpr")), SNodeOperations.cast(getNodeById("1419026042562462156"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04b52acL, "org.campagnelab.metar.R.structure.FunctionCallExpr")));
      Assert.assertEquals(expected, TestHelper.findChangesRScript(SNodeOperations.cast(getNodeById("1419026042558778771"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x55b5a4eee04afaceL, "org.campagnelab.metar.R.structure.RScript")), SNodeOperations.cast(getNodeById("1419026042562462261"), MetaAdapterFactory.getConcept(0x3b58810c84314bbbL, 0x99eab4671e02dd13L, 0x14d038586597da88L, "org.campagnelab.metar.R.structure.IdentifierRef"))));
    }


  }
}