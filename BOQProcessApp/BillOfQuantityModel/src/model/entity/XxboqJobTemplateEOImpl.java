package model.entity;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 03 09:51:11 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqJobTemplateEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BusinessUnitId {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getBusinessUnitId();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setBusinessUnitId((Number)value);
            }
        },
        TemplateId {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getTemplateId();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setTemplateId((Number)value);
            }
        },
        TemplateName {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getTemplateName();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setTemplateName((String)value);
            }
        },
        TemplateNumber {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getTemplateNumber();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setTemplateNumber((String)value);
            }
        },
        CreationDate {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxboqJobTemplateActivityEO {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getXxboqJobTemplateActivityEO();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        JobTemplateActivityVO {
            public Object get(XxboqJobTemplateEOImpl obj) {
                return obj.getJobTemplateActivityVO();
            }

            public void put(XxboqJobTemplateEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqJobTemplateEOImpl object);

        public abstract void put(XxboqJobTemplateEOImpl object, Object value);

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

    private static final byte USERNAME_HISTORY_TYPE = 13;


    public static final int BUSINESSUNITID =
        AttributesEnum.BusinessUnitId.index();
    public static final int TEMPLATEID = AttributesEnum.TemplateId.index();
    public static final int TEMPLATENAME = AttributesEnum.TemplateName.index();
    public static final int TEMPLATENUMBER =
        AttributesEnum.TemplateNumber.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int XXBOQJOBTEMPLATEACTIVITYEO =
        AttributesEnum.XxboqJobTemplateActivityEO.index();
    public static final int JOBTEMPLATEACTIVITYVO =
        AttributesEnum.JobTemplateActivityVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqJobTemplateEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqJobTemplateEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for BusinessUnitId, using the alias name BusinessUnitId.
     * @return the BusinessUnitId
     */
    public Number getBusinessUnitId() {
        return (Number)getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessUnitId.
     * @param value value to set the BusinessUnitId
     */
    public void setBusinessUnitId(Number value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for TemplateId, using the alias name TemplateId.
     * @return the TemplateId
     */
    public Number getTemplateId() {
        return (Number)getAttributeInternal(TEMPLATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TemplateId.
     * @param value value to set the TemplateId
     */
    public void setTemplateId(Number value) {
        setAttributeInternal(TEMPLATEID, value);
    }

    /**
     * Gets the attribute value for TemplateName, using the alias name TemplateName.
     * @return the TemplateName
     */
    public String getTemplateName() {
        return (String)getAttributeInternal(TEMPLATENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for TemplateName.
     * @param value value to set the TemplateName
     */
    public void setTemplateName(String value) {
        setAttributeInternal(TEMPLATENAME, value);
    }

    /**
     * Gets the attribute value for TemplateNumber, using the alias name TemplateNumber.
     * @return the TemplateNumber
     */
    public String getTemplateNumber() {
        return (String)getAttributeInternal(TEMPLATENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TemplateNumber.
     * @param value value to set the TemplateNumber
     */
    public void setTemplateNumber(String value) {
        setAttributeInternal(TEMPLATENUMBER, value);
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
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxboqJobTemplateActivityEO() {
        return (RowIterator)getAttributeInternal(XXBOQJOBTEMPLATEACTIVITYEO);
    }

    /**
     * Uses the link JobTemplateToJobTemplateActvityVL to return rows of JobTemplateActivityVO
     */
    public RowIterator getJobTemplateActivityVO() {
        return (RowIterator)getAttributeInternal(JOBTEMPLATEACTIVITYVO);
    }

    /**
     * @param templateId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number templateId) {
        return new Key(new Object[] { templateId });
    }

    protected void create(AttributeList attributeList) {
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_JOB_TEMPLATE_S", getDBTransaction());

        setTemplateId(seq.getSequenceNumber());

        super.create(attributeList);

    }

    @Override
    protected Object getHistoryContextForAttribute(AttributeDefImpl attr) {
        if (attr.getHistoryKind() == USERNAME_HISTORY_TYPE) {
            // Custom History type logic goes here
            return (String)((Map)ADFContext.getCurrent().getSessionScope().get("userMap")).get("UserName");
        }
        return super.getHistoryContextForAttribute(attr);
    }
}
