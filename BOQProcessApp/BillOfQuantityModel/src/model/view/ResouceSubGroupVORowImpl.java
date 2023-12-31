package model.view;

import java.math.BigDecimal;

import java.sql.Date;

import model.entity.XxboqResourceSubGroupEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 29 10:00:46 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ResouceSubGroupVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BuId {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        CreatedBy {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        ExpenditureCategory {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getExpenditureCategory();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setExpenditureCategory((String)value);
            }
        },
        LastUpdatedBy {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        ResourceGroup {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceGroup();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setResourceGroup((String)value);
            }
        },
        ResourceGroupId {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceGroupId();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setResourceGroupId((BigDecimal)value);
            }
        },
        ResourceSubGroup {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceSubGroup();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setResourceSubGroup((String)value);
            }
        },
        ResourceSubGroupId {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceSubGroupId();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setResourceSubGroupId((BigDecimal)value);
            }
        },
        ResourceType {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceType();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setResourceType((String)value);
            }
        },
        ResourceTypeCode {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceTypeCode();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setResourceTypeCode((String)value);
            }
        },
        SubGroupDescription {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getSubGroupDescription();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setSubGroupDescription((String)value);
            }
        },
        TransDeleteFlag {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getTransDeleteFlag();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setTransDeleteFlag((String)value);
            }
        },
        ResourceItemsVO {
            public Object get(ResouceSubGroupVORowImpl obj) {
                return obj.getResourceItemsVO();
            }

            public void put(ResouceSubGroupVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ResouceSubGroupVORowImpl object);

        public abstract void put(ResouceSubGroupVORowImpl object,
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
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int EXPENDITURECATEGORY =
        AttributesEnum.ExpenditureCategory.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int RESOURCEGROUP =
        AttributesEnum.ResourceGroup.index();
    public static final int RESOURCEGROUPID =
        AttributesEnum.ResourceGroupId.index();
    public static final int RESOURCESUBGROUP =
        AttributesEnum.ResourceSubGroup.index();
    public static final int RESOURCESUBGROUPID =
        AttributesEnum.ResourceSubGroupId.index();
    public static final int RESOURCETYPE = AttributesEnum.ResourceType.index();
    public static final int RESOURCETYPECODE =
        AttributesEnum.ResourceTypeCode.index();
    public static final int SUBGROUPDESCRIPTION =
        AttributesEnum.SubGroupDescription.index();
    public static final int TRANSDELETEFLAG =
        AttributesEnum.TransDeleteFlag.index();
    public static final int RESOURCEITEMSVO =
        AttributesEnum.ResourceItemsVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ResouceSubGroupVORowImpl() {
    }

    /**
     * Gets XxboqResourceSubGroupEO entity object.
     * @return the XxboqResourceSubGroupEO
     */
    public XxboqResourceSubGroupEOImpl getXxboqResourceSubGroupEO() {
        return (XxboqResourceSubGroupEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for BU_ID using the alias name BuId.
     * @return the BU_ID
     */
    public BigDecimal getBuId() {
        return (BigDecimal)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_ID using the alias name BuId.
     * @param value value to set the BU_ID
     */
    public void setBuId(BigDecimal value) {
        setAttributeInternal(BUID, value);
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
     * Gets the attribute value for EXPENDITURE_CATEGORY using the alias name ExpenditureCategory.
     * @return the EXPENDITURE_CATEGORY
     */
    public String getExpenditureCategory() {
        return (String)getAttributeInternal(EXPENDITURECATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for EXPENDITURE_CATEGORY using the alias name ExpenditureCategory.
     * @param value value to set the EXPENDITURE_CATEGORY
     */
    public void setExpenditureCategory(String value) {
        setAttributeInternal(EXPENDITURECATEGORY, value);
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
     * Gets the attribute value for RESOURCE_GROUP using the alias name ResourceGroup.
     * @return the RESOURCE_GROUP
     */
    public String getResourceGroup() {
        return (String)getAttributeInternal(RESOURCEGROUP);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_GROUP using the alias name ResourceGroup.
     * @param value value to set the RESOURCE_GROUP
     */
    public void setResourceGroup(String value) {
        setAttributeInternal(RESOURCEGROUP, value);
    }

    /**
     * Gets the attribute value for RESOURCE_GROUP_ID using the alias name ResourceGroupId.
     * @return the RESOURCE_GROUP_ID
     */
    public BigDecimal getResourceGroupId() {
        return (BigDecimal)getAttributeInternal(RESOURCEGROUPID);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_GROUP_ID using the alias name ResourceGroupId.
     * @param value value to set the RESOURCE_GROUP_ID
     */
    public void setResourceGroupId(BigDecimal value) {
        setAttributeInternal(RESOURCEGROUPID, value);
    }

    /**
     * Gets the attribute value for RESOURCE_SUB_GROUP using the alias name ResourceSubGroup.
     * @return the RESOURCE_SUB_GROUP
     */
    public String getResourceSubGroup() {
        return (String)getAttributeInternal(RESOURCESUBGROUP);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_SUB_GROUP using the alias name ResourceSubGroup.
     * @param value value to set the RESOURCE_SUB_GROUP
     */
    public void setResourceSubGroup(String value) {
        setAttributeInternal(RESOURCESUBGROUP, value);
    }

    /**
     * Gets the attribute value for RESOURCE_SUB_GROUP_ID using the alias name ResourceSubGroupId.
     * @return the RESOURCE_SUB_GROUP_ID
     */
    public BigDecimal getResourceSubGroupId() {
        return (BigDecimal)getAttributeInternal(RESOURCESUBGROUPID);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_SUB_GROUP_ID using the alias name ResourceSubGroupId.
     * @param value value to set the RESOURCE_SUB_GROUP_ID
     */
    public void setResourceSubGroupId(BigDecimal value) {
        setAttributeInternal(RESOURCESUBGROUPID, value);
    }

    /**
     * Gets the attribute value for RESOURCE_TYPE using the alias name ResourceType.
     * @return the RESOURCE_TYPE
     */
    public String getResourceType() {
        return (String)getAttributeInternal(RESOURCETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_TYPE using the alias name ResourceType.
     * @param value value to set the RESOURCE_TYPE
     */
    public void setResourceType(String value) {
        setAttributeInternal(RESOURCETYPE, value);
    }

    /**
     * Gets the attribute value for RESOURCE_TYPE_CODE using the alias name ResourceTypeCode.
     * @return the RESOURCE_TYPE_CODE
     */
    public String getResourceTypeCode() {
        return (String)getAttributeInternal(RESOURCETYPECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for RESOURCE_TYPE_CODE using the alias name ResourceTypeCode.
     * @param value value to set the RESOURCE_TYPE_CODE
     */
    public void setResourceTypeCode(String value) {
        setAttributeInternal(RESOURCETYPECODE, value);
    }

    /**
     * Gets the attribute value for SUB_GROUP_DESCRIPTION using the alias name SubGroupDescription.
     * @return the SUB_GROUP_DESCRIPTION
     */
    public String getSubGroupDescription() {
        return (String)getAttributeInternal(SUBGROUPDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_GROUP_DESCRIPTION using the alias name SubGroupDescription.
     * @param value value to set the SUB_GROUP_DESCRIPTION
     */
    public void setSubGroupDescription(String value) {
        setAttributeInternal(SUBGROUPDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeleteFlag.
     * @return the TransDeleteFlag
     */
    public String getTransDeleteFlag() {
        if (getResourceItemsVO().first() != null) {
            return "N";
        } else {
            return "Y";
        }
        //        return (String) getAttributeInternal(TRANSDELETEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeleteFlag.
     * @param value value to set the  TransDeleteFlag
     */
    public void setTransDeleteFlag(String value) {
        setAttributeInternal(TRANSDELETEFLAG, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ResourceItemsVO.
     */
    public RowIterator getResourceItemsVO() {
        return (RowIterator)getAttributeInternal(RESOURCEITEMSVO);
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
