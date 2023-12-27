package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 15:54:28 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqStructureSetupEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        StructureId {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getStructureId();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setStructureId((BigDecimal)value);
            }
        },
        BuId {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getBuId();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getProjectId();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        StructureCode {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getStructureCode();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setStructureCode((String)value);
            }
        },
        Description {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getDescription();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        },
        BillDetailFlag {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getBillDetailFlag();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setBillDetailFlag((String)value);
            }
        },
        CreationDate {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqStructureSetupEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqStructureSetupEOImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqStructureSetupEOImpl object);

        public abstract void put(XxboqStructureSetupEOImpl object,
                                 Object value);

        public int index() {
            return XxboqStructureSetupEOImpl.AttributesEnum.firstIndex() +
                ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return XxboqStructureSetupEOImpl.AttributesEnum.firstIndex() +
                XxboqStructureSetupEOImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = XxboqStructureSetupEOImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int STRUCTUREID = AttributesEnum.StructureId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int STRUCTURECODE =
        AttributesEnum.StructureCode.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int BILLDETAILFLAG =
        AttributesEnum.BillDetailFlag.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqStructureSetupEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqStructureSetupEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for StructureId, using the alias name StructureId.
     * @return the StructureId
     */
    public BigDecimal getStructureId() {
        return (BigDecimal)getAttributeInternal(STRUCTUREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StructureId.
     * @param value value to set the StructureId
     */
    public void setStructureId(BigDecimal value) {
        setAttributeInternal(STRUCTUREID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the BuId
     */
    public BigDecimal getBuId() {
        return (BigDecimal)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(BigDecimal value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for StructureCode, using the alias name StructureCode.
     * @return the StructureCode
     */
    public String getStructureCode() {
        return (String)getAttributeInternal(STRUCTURECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StructureCode.
     * @param value value to set the StructureCode
     */
    public void setStructureCode(String value) {
        setAttributeInternal(STRUCTURECODE, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the Description
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for BillDetailFlag, using the alias name BillDetailFlag.
     * @return the BillDetailFlag
     */
    public String getBillDetailFlag() {
        return (String)getAttributeInternal(BILLDETAILFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillDetailFlag.
     * @param value value to set the BillDetailFlag
     */
    public void setBillDetailFlag(String value) {
        setAttributeInternal(BILLDETAILFLAG, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
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


    /**
     * @param structureId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal structureId) {
        return new Key(new Object[] { structureId });
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXPJ_BOQ_STRUCTURE_SETUP_S", getDBTransaction());
        //           SequenceImpl seq=new SequenceImpl("XXBOQ_STRUCTURE_SETUP_S",getDBTransaction());
        setStructureId(new BigDecimal(seq.getSequenceNumber().toString()));
    }

    private static final byte USERNAME_HISTORY_TYPE = 13;

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
        }
        return super.getHistoryContextForAttribute(attr);
    }

}