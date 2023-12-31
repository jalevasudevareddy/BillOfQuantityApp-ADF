package model.view;

import java.math.BigDecimal;

import java.sql.Date;

import model.entity.XxboqBoqResourcesEOImpl;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 13 15:08:57 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CandyBOQResourcesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CostCodeId {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getCostCodeId();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setCostCodeId((BigDecimal)value);
            }
        },
        CreatedBy {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        FinalRate {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getFinalRate();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setFinalRate((BigDecimal)value);
            }
        },
        LastUpdatedBy {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        NetUseunit {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getNetUseunit();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setNetUseunit((BigDecimal)value);
            }
        },
        ResourceDesc {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getResourceDesc();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setResourceDesc((String)value);
            }
        },
        ResourceId {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getResourceId();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setResourceId((BigDecimal)value);
            }
        },
        ResourceUom {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getResourceUom();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setResourceUom((String)value);
            }
        },
        ResourceValue {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getResourceValue();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setResourceValue((BigDecimal)value);
            }
        },
        ResourceCode {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getResourceCode();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setResourceCode((String)value);
            }
        },
        TransResourceAmountTotal {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getTransResourceAmountTotal();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setTransResourceAmountTotal((BigDecimal)value);
            }
        },
        TransResourceAmnt {
            public Object get(CandyBOQResourcesVORowImpl obj) {
                return obj.getTransResourceAmnt();
            }

            public void put(CandyBOQResourcesVORowImpl obj, Object value) {
                obj.setTransResourceAmnt((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(CandyBOQResourcesVORowImpl object);

        public abstract void put(CandyBOQResourcesVORowImpl object,
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


    public static final int COSTCODEID = AttributesEnum.CostCodeId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int FINALRATE = AttributesEnum.FinalRate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int NETUSEUNIT = AttributesEnum.NetUseunit.index();
    public static final int RESOURCEDESC = AttributesEnum.ResourceDesc.index();
    public static final int RESOURCEID = AttributesEnum.ResourceId.index();
    public static final int RESOURCEUOM = AttributesEnum.ResourceUom.index();
    public static final int RESOURCEVALUE =
        AttributesEnum.ResourceValue.index();
    public static final int RESOURCECODE = AttributesEnum.ResourceCode.index();
    public static final int TRANSRESOURCEAMOUNTTOTAL =
        AttributesEnum.TransResourceAmountTotal.index();
    public static final int TRANSRESOURCEAMNT =
        AttributesEnum.TransResourceAmnt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CandyBOQResourcesVORowImpl() {
    }

    /**
     * Gets XxboqBoqResourcesEO entity object.
     * @return the XxboqBoqResourcesEO
     */
    public XxboqBoqResourcesEOImpl getXxboqBoqResourcesEO() {
        return (XxboqBoqResourcesEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for COST_CODE_ID using the alias name CostCodeId.
     * @return the COST_CODE_ID
     */
    public BigDecimal getCostCodeId() {
        return (BigDecimal)getAttributeInternal(COSTCODEID);
    }

    /**
     * Sets <code>value</code> as attribute value for COST_CODE_ID using the alias name CostCodeId.
     * @param value value to set the COST_CODE_ID
     */
    public void setCostCodeId(BigDecimal value) {
        setAttributeInternal(COSTCODEID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for FINAL_RATE using the alias name FinalRate.
     * @return the FINAL_RATE
     */
    public BigDecimal getFinalRate() {
        return (BigDecimal)getAttributeInternal(FINALRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for FINAL_RATE using the alias name FinalRate.
     * @param value value to set the FINAL_RATE
     */
    public void setFinalRate(BigDecimal value) {
        setAttributeInternal(FINALRATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for NET_USEUNIT using the alias name NetUseunit.
     * @return the NET_USEUNIT
     */
    public BigDecimal getNetUseunit() {
        return (BigDecimal)getAttributeInternal(NETUSEUNIT);
    }

    /**
     * Sets <code>value</code> as attribute value for NET_USEUNIT using the alias name NetUseunit.
     * @param value value to set the NET_USEUNIT
     */
    public void setNetUseunit(BigDecimal value) {
        setAttributeInternal(NETUSEUNIT, value);
    }

    /**
     * Gets the attribute value for RESOURCE_DESC using the alias name ResourceDesc.
     * @return the RESOURCE_DESC
     */
    public String getResourceDesc() {
        return (String)getAttributeInternal(RESOURCEDESC);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_DESC using the alias name ResourceDesc.
     * @param value value to set the RESOURCE_DESC
     */
    public void setResourceDesc(String value) {
        setAttributeInternal(RESOURCEDESC, value);
    }

    /**
     * Gets the attribute value for RESOURCE_ID using the alias name ResourceId.
     * @return the RESOURCE_ID
     */
    public BigDecimal getResourceId() {
        return (BigDecimal)getAttributeInternal(RESOURCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_ID using the alias name ResourceId.
     * @param value value to set the RESOURCE_ID
     */
    public void setResourceId(BigDecimal value) {
        setAttributeInternal(RESOURCEID, value);
    }

    /**
     * Gets the attribute value for RESOURCE_UOM using the alias name ResourceUom.
     * @return the RESOURCE_UOM
     */
    public String getResourceUom() {
        return (String)getAttributeInternal(RESOURCEUOM);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_UOM using the alias name ResourceUom.
     * @param value value to set the RESOURCE_UOM
     */
    public void setResourceUom(String value) {
        setAttributeInternal(RESOURCEUOM, value);
    }

    /**
     * Gets the attribute value for RESOURCE_VALUE using the alias name ResourceValue.
     * @return the RESOURCE_VALUE
     */
    public BigDecimal getResourceValue() {
        return (BigDecimal)getAttributeInternal(RESOURCEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_VALUE using the alias name ResourceValue.
     * @param value value to set the RESOURCE_VALUE
     */
    public void setResourceValue(BigDecimal value) {
        setAttributeInternal(RESOURCEVALUE, value);
    }

    /**
     * Gets the attribute value for RESOURCE_CODE using the alias name ResourceCode.
     * @return the RESOURCE_CODE
     */
    public String getResourceCode() {
        return (String)getAttributeInternal(RESOURCECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_CODE using the alias name ResourceCode.
     * @param value value to set the RESOURCE_CODE
     */
    public void setResourceCode(String value) {
        setAttributeInternal(RESOURCECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransResourceAmountTotal.
     * @return the TransResourceAmountTotal
     */
    public BigDecimal getTransResourceAmountTotal() {
        return (BigDecimal)getAttributeInternal(TRANSRESOURCEAMOUNTTOTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransResourceAmountTotal.
     * @param value value to set the  TransResourceAmountTotal
     */
    public void setTransResourceAmountTotal(BigDecimal value) {
        setAttributeInternal(TRANSRESOURCEAMOUNTTOTAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransResourceAmnt.
     * @return the TransResourceAmnt
     */
    public BigDecimal getTransResourceAmnt() {

        BigDecimal amount = null;
        try {
            if (getNetUseunit() != null && getFinalRate() != null) {
                //                 Double  netUseUnt = new Double(getNetUseUnit());
                //                 Double  finalRate =  new Double(getFinalRate());
                amount =
                        new BigDecimal(getNetUseunit().doubleValue() * getFinalRate().doubleValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return amount;
        //        return (BigDecimal)getAttributeInternal(TRANSRESOURCEAMNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransResourceAmnt.
     * @param value value to set the  TransResourceAmnt
     */
    public void setTransResourceAmnt(BigDecimal value) {
        setAttributeInternal(TRANSRESOURCEAMNT, value);
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
