package org.campagnelab.hta.tables.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import org.campagnelab.hta.tables.behavior.FutureTable_Behavior;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class FutureTable_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_o51t1s_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_o51t1s_a_0(editorContext, node);
  }

  private EditorCell createCollection_o51t1s_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_o51t1s_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createAlternation_o51t1s_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createAlternation_o51t1s_a0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = FutureTable_Editor.renderingCondition_o51t1s_a0a(node, editorContext);
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createProperty_o51t1s_a0a(editorContext, node);
    } else {
      editorCell = this.createRefCell_o51t1s_a0a(editorContext, node);
    }
    Style style = new StyleImpl();
    style.set(StyleAttributes.NAVIGATABLE_REFERENCE, "table");
    editorCell.getStyle().putAll(style);
    return editorCell;
  }

  private static boolean renderingCondition_o51t1s_a0a(SNode node, EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "table", false) == null);
  }

  private EditorCell createProperty_o51t1s_a0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createNodeRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefCell_o51t1s_a0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("table");
    provider.setNoTargetText("<no table>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new FutureTable_Editor._Inline_o51t1s_a0a0());
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("table");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createNodeRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class _Inline_o51t1s_a0a0 extends InlineCellProvider {
    public _Inline_o51t1s_a0a0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_o51t1s_a0a0a(editorContext, node);
    }

    private EditorCell createProperty_o51t1s_a0a0a(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_1");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = editorContext.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createNodeRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
      } else
      return editorCell;
    }
  }

  private EditorCell createCollection_o51t1s_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_o51t1s_a_0");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_o51t1s_a0(editorContext, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_o51t1s_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_o51t1s_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_o51t1s_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_o51t1s_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "path=");
    editorCell.setCellId("Constant_o51t1s_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createReadOnlyModelAccessor_o51t1s_b0(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        return FutureTable_Behavior.call_getColumnTablePath_4166618652719916891(node);
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_o51t1s_b0");
    return editorCell;
  }

  private EditorCell createConstant_o51t1s_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "columns:");
    editorCell.setCellId("Constant_o51t1s_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_o51t1s_d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("table");
    provider.setNoTargetText("<no table>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new FutureTable_Editor._Inline_o51t1s_a3a());
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("table");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createNodeRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class _Inline_o51t1s_a3a extends InlineCellProvider {
    public _Inline_o51t1s_a3a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createCollection_o51t1s_a0d0(editorContext, node);
    }

    private EditorCell createCollection_o51t1s_a0d0(EditorContext editorContext, SNode node) {
      EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
      editorCell.setCellId("Collection_o51t1s_a0d0");
      editorCell.addEditorCell(this.createRefNodeList_o51t1s_a0a3a(editorContext, node));
      return editorCell;
    }

    private EditorCell createRefNodeList_o51t1s_a0a3a(EditorContext editorContext, SNode node) {
      AbstractCellListHandler handler = new FutureTable_Editor._Inline_o51t1s_a3a.columnsListHandler_o51t1s_a0a3a(node, "columns", editorContext);
      EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Horizontal(), false);
      editorCell.setCellId("refNodeList_columns");
      editorCell.setRole(handler.getElementRole());
      return editorCell;
    }

    private static class columnsListHandler_o51t1s_a0a3a extends RefNodeListHandler {
      public columnsListHandler_o51t1s_a0a3a(SNode ownerNode, String childRole, EditorContext context) {
        super(ownerNode, childRole, context, false);
      }

      public SNode createNodeToInsert(EditorContext editorContext) {
        SNode listOwner = super.getOwner();
        return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
      }

      public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
        EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
        this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
        return elementCell;
      }

      public EditorCell createEmptyCell(EditorContext editorContext) {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell(editorContext);
        this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
        return emptyCell;
      }

      public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
        if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
          if (elementNode != null) {
            elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
            elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode));
          }
          if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
            elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
          }
        }
      }
    }
  }
}
