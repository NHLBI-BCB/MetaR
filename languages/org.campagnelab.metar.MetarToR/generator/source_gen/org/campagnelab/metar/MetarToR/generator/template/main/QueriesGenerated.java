package org.campagnelab.metar.MetarToR.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;
  public static SNode sourceNodeQuery_548072407393102715(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x40d3459003345bbL, 0xb8234cfd22657c15L, 0x79b24f36195e546L, 0x79b24f36195ea2dL, "child"));
  }
}
