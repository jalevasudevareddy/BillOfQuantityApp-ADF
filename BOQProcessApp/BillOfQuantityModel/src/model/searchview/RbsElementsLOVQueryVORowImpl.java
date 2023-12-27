package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 02 12:19:07 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RbsElementsLOVQueryVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        RbsElementId {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getRbsElementId();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setRbsElementId((BigDecimal)value);
            }
        }
        ,
        Alias {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getAlias();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setAlias((String)value);
            }
        }
        ,
        UnitOfMeasure {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getUnitOfMeasure();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setUnitOfMeasure((String)value);
            }
        }
        ,
        ExpenditureTypeId {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getExpenditureTypeId();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setExpenditureTypeId((BigDecimal)value);
            }
        }
        ,
        ResourceClassName {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getResourceClassName();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setResourceClassName((String)value);
            }
        }
        ,
        UomMeaning {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getUomMeaning();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setUomMeaning((String)value);
            }
        }
        ,
        CostRate {
            public Object get(RbsElementsLOVQueryVORowImpl obj) {
                return obj.getCostRate();
            }

            public void put(RbsElementsLOVQueryVORowImpl obj, Object value) {
                obj.setCostRate((BigDecimal)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(RbsElementsLOVQueryVORowImpl object);

        public abstract void put(RbsElementsLOVQueryVORowImpl object,
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


    public static final int RBSELEMENTID = AttributesEnum.RbsElementId.index();
    public static final int ALIAS = AttributesEnum.Alias.index();
    public static final int UNITOFMEASURE = AttributesEnum.UnitOfMeasure.index();
    public static final int EXPENDITURETYPEID = AttributesEnum.ExpenditureTypeId.index();
    public static final int RESOURCECLASSNAME = AttributesEnum.ResourceClassName.index();
    public static final int UOMMEANING = AttributesEnum.UomMeaning.index();
    public static final int COSTRATE = AttributesEnum.CostRate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RbsElementsLOVQueryVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute RbsElementId.
     * @return the RbsElementId
     */
    public BigDecimal getRbsElementId() {
        return (BigDecimal)getAttributeInternal(RBSELEMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RbsElementId.
     * @param value value to set the  RbsElementId
     */
    public void setRbsElementId(BigDecimal value) {
        setAttributeInternal(RBSELEMENTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Alias.
     * @return the Alias
     */
    public String getAlias() {
        return (String)getAttributeInternal(ALIAS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Alias.
     * @param value value to set the  Alias
     */
    public void setAlias(String value) {
        setAttributeInternal(ALIAS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UnitOfMeasure.
     * @return the UnitOfMeasure
     */
    public String getUnitOfMeasure() {
        return (String)getAttributeInternal(UNITOFMEASURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UnitOfMeasure.
     * @param value value to set the  UnitOfMeasure
     */
    public void setUnitOfMeasure(String value) {
        setAttributeInternal(UNITOFMEASURE, value);
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
     * Gets the attribute value for the calculated attribute ResourceClassName.
     * @return the ResourceClassName
     */
    public String getResourceClassName() {
        return (String)getAttributeInternal(RESOURCECLASSNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ResourceClassName.
     * @param value value to set the  ResourceClassName
     */
    public void setResourceClassName(String value) {
        setAttributeInternal(RESOURCECLASSNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UomMeaning.
     * @return the UomMeaning
     */
    public String getUomMeaning() {
        return (String) getAttributeInternal(UOMMEANING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UomMeaning.
     * @param value value to set the  UomMeaning
     */
    public void setUomMeaning(String value) {
        setAttributeInternal(UOMMEANING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CostRate.
     * @return the CostRate
     */
    public BigDecimal getCostRate() {
        return (BigDecimal) getAttributeInternal(COSTRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CostRate.
     * @param value value to set the  CostRate
     */
    public void setCostRate(BigDecimal value) {
        setAttributeInternal(COSTRATE, value);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}