package model.masterview;

import java.math.BigDecimal;

import model.masterentity.XxinvItemSubInventoriesEOImpl;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 17 17:29:33 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvItemSubInventoryVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        InventoryItemId {
            public Object get(InvItemSubInventoryVORowImpl obj) {
                return obj.getInventoryItemId();
            }

            public void put(InvItemSubInventoryVORowImpl obj, Object value) {
                obj.setInventoryItemId((BigDecimal)value);
            }
        },
        LocaterType {
            public Object get(InvItemSubInventoryVORowImpl obj) {
                return obj.getLocaterType();
            }

            public void put(InvItemSubInventoryVORowImpl obj, Object value) {
                obj.setLocaterType((BigDecimal)value);
            }
        },
        OrganizationId {
            public Object get(InvItemSubInventoryVORowImpl obj) {
                return obj.getOrganizationId();
            }

            public void put(InvItemSubInventoryVORowImpl obj, Object value) {
                obj.setOrganizationId((BigDecimal)value);
            }
        },
        RowID {
            public Object get(InvItemSubInventoryVORowImpl obj) {
                return obj.getRowID();
            }

            public void put(InvItemSubInventoryVORowImpl obj, Object value) {
                obj.setRowID((String)value);
            }
        },
        SubinventoryCode {
            public Object get(InvItemSubInventoryVORowImpl obj) {
                return obj.getSubinventoryCode();
            }

            public void put(InvItemSubInventoryVORowImpl obj, Object value) {
                obj.setSubinventoryCode((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(InvItemSubInventoryVORowImpl object);

        public abstract void put(InvItemSubInventoryVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int INVENTORYITEMID =
        AttributesEnum.InventoryItemId.index();
    public static final int LOCATERTYPE = AttributesEnum.LocaterType.index();
    public static final int ORGANIZATIONID =
        AttributesEnum.OrganizationId.index();
    public static final int ROWID = AttributesEnum.RowID.index();
    public static final int SUBINVENTORYCODE =
        AttributesEnum.SubinventoryCode.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvItemSubInventoryVORowImpl() {
    }

    /**
     * Gets XxinvItemSubInventoriesEO entity object.
     * @return the XxinvItemSubInventoriesEO
     */
    public XxinvItemSubInventoriesEOImpl getXxinvItemSubInventoriesEO() {
        return (XxinvItemSubInventoriesEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for INVENTORY_ITEM_ID using the alias name InventoryItemId.
     * @return the INVENTORY_ITEM_ID
     */
    public BigDecimal getInventoryItemId() {
        return (BigDecimal)getAttributeInternal(INVENTORYITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for INVENTORY_ITEM_ID using the alias name InventoryItemId.
     * @param value value to set the INVENTORY_ITEM_ID
     */
    public void setInventoryItemId(BigDecimal value) {
        setAttributeInternal(INVENTORYITEMID, value);
    }

    /**
     * Gets the attribute value for LOCATER_TYPE using the alias name LocaterType.
     * @return the LOCATER_TYPE
     */
    public BigDecimal getLocaterType() {
        return (BigDecimal)getAttributeInternal(LOCATERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATER_TYPE using the alias name LocaterType.
     * @param value value to set the LOCATER_TYPE
     */
    public void setLocaterType(BigDecimal value) {
        setAttributeInternal(LOCATERTYPE, value);
    }

    /**
     * Gets the attribute value for ORGANIZATION_ID using the alias name OrganizationId.
     * @return the ORGANIZATION_ID
     */
    public BigDecimal getOrganizationId() {
        return (BigDecimal)getAttributeInternal(ORGANIZATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORGANIZATION_ID using the alias name OrganizationId.
     * @param value value to set the ORGANIZATION_ID
     */
    public void setOrganizationId(BigDecimal value) {
        setAttributeInternal(ORGANIZATIONID, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name RowID.
     * @return the ROWID
     */
    public String getRowID() {
        return (String)getAttributeInternal(ROWID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROWID using the alias name RowID.
     * @param value value to set the ROWID
     */
    public void setRowID(String value) {
        setAttributeInternal(ROWID, value);
    }

    /**
     * Gets the attribute value for SUBINVENTORY_CODE using the alias name SubinventoryCode.
     * @return the SUBINVENTORY_CODE
     */
    public String getSubinventoryCode() {
        return (String)getAttributeInternal(SUBINVENTORYCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBINVENTORY_CODE using the alias name SubinventoryCode.
     * @param value value to set the SUBINVENTORY_CODE
     */
    public void setSubinventoryCode(String value) {
        setAttributeInternal(SUBINVENTORYCODE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) &&
            (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index -
                AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
