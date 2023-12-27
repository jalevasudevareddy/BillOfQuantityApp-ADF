package model.searchview;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 18 15:36:59 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CostCodeLOVQueryVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BuId {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        ExpenditureTypeName {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getExpenditureTypeName();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setExpenditureTypeName((String)value);
            }
        },
        Description {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getDescription();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        },
        EndDateActive {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getEndDateActive();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setEndDateActive((Date)value);
            }
        },
        ExpenditureTypeId {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getExpenditureTypeId();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setExpenditureTypeId((BigDecimal)value);
            }
        },
        ResourceClass {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getResourceClass();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setResourceClass((String)value);
            }
        },
        ResourceDesc {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getResourceDesc();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setResourceDesc((String)value);
            }
        },
        StartDateActive {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getStartDateActive();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setStartDateActive((Date)value);
            }
        },
        Uom {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getUom();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setUom((String)value);
            }
        },
        UomMeaning {
            public Object get(CostCodeLOVQueryVORowImpl obj) {
                return obj.getUomMeaning();
            }

            public void put(CostCodeLOVQueryVORowImpl obj, Object value) {
                obj.setUomMeaning((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CostCodeLOVQueryVORowImpl object);

        public abstract void put(CostCodeLOVQueryVORowImpl object,
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


    public static final int BUID = AttributesEnum.BuId.index();
    public static final int EXPENDITURETYPENAME =
        AttributesEnum.ExpenditureTypeName.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ENDDATEACTIVE =
        AttributesEnum.EndDateActive.index();
    public static final int EXPENDITURETYPEID =
        AttributesEnum.ExpenditureTypeId.index();
    public static final int RESOURCECLASS =
        AttributesEnum.ResourceClass.index();
    public static final int RESOURCEDESC = AttributesEnum.ResourceDesc.index();
    public static final int STARTDATEACTIVE =
        AttributesEnum.StartDateActive.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int UOMMEANING = AttributesEnum.UomMeaning.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CostCodeLOVQueryVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BuId.
     * @return the BuId
     */
    public BigDecimal getBuId() {
        return (BigDecimal)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuId.
     * @param value value to set the  BuId
     */
    public void setBuId(BigDecimal value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Description.
     * @param value value to set the  Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EndDateActive.
     * @return the EndDateActive
     */
    public Date getEndDateActive() {
        return (Date)getAttributeInternal(ENDDATEACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EndDateActive.
     * @param value value to set the  EndDateActive
     */
    public void setEndDateActive(Date value) {
        setAttributeInternal(ENDDATEACTIVE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExpenditureTypeId.
     * @return the ExpenditureTypeId
     */
    public BigDecimal getExpenditureTypeId() {
        return (BigDecimal)getAttributeInternal(EXPENDITURETYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExpenditureTypeId.
     * @param value value to set the  ExpenditureTypeId
     */
    public void setExpenditureTypeId(BigDecimal value) {
        setAttributeInternal(EXPENDITURETYPEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExpenditureTypeName.
     * @return the ExpenditureTypeName
     */
    public String getExpenditureTypeName() {
        return (String)getAttributeInternal(EXPENDITURETYPENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExpenditureTypeName.
     * @param value value to set the  ExpenditureTypeName
     */
    public void setExpenditureTypeName(String value) {
        setAttributeInternal(EXPENDITURETYPENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ResourceClass.
     * @return the ResourceClass
     */
    public String getResourceClass() {
        return (String)getAttributeInternal(RESOURCECLASS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ResourceClass.
     * @param value value to set the  ResourceClass
     */
    public void setResourceClass(String value) {
        setAttributeInternal(RESOURCECLASS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ResourceDesc.
     * @return the ResourceDesc
     */
    public String getResourceDesc() {
        return (String)getAttributeInternal(RESOURCEDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ResourceDesc.
     * @param value value to set the  ResourceDesc
     */
    public void setResourceDesc(String value) {
        setAttributeInternal(RESOURCEDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StartDateActive.
     * @return the StartDateActive
     */
    public Date getStartDateActive() {
        return (Date)getAttributeInternal(STARTDATEACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StartDateActive.
     * @param value value to set the  StartDateActive
     */
    public void setStartDateActive(Date value) {
        setAttributeInternal(STARTDATEACTIVE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Uom.
     * @return the Uom
     */
    public String getUom() {
        return (String)getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Uom.
     * @param value value to set the  Uom
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UomMeaning.
     * @return the UomMeaning
     */
    public String getUomMeaning() {
        return (String)getAttributeInternal(UOMMEANING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UomMeaning.
     * @param value value to set the  UomMeaning
     */
    public void setUomMeaning(String value) {
        setAttributeInternal(UOMMEANING, value);
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