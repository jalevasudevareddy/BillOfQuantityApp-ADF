package model.entity;

import java.math.BigDecimal;

import java.sql.Date;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 23 17:45:45 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqProgressDetailsLinesEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DocHeaderId {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getDocHeaderId();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setDocHeaderId((BigDecimal)value);
            }
        },
        ActivityId {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getActivityId();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setActivityId((BigDecimal)value);
            }
        },
        ProgressPercent {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getProgressPercent();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setProgressPercent((BigDecimal)value);
            }
        },
        CreationDate {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        RowID {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getRowID();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxboqProgressDetailsHdrEO {
            public Object get(XxboqProgressDetailsLinesEOImpl obj) {
                return obj.getXxboqProgressDetailsHdrEO();
            }

            public void put(XxboqProgressDetailsLinesEOImpl obj,
                            Object value) {
                obj.setXxboqProgressDetailsHdrEO((XxboqProgressDetailsHdrEOImpl)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqProgressDetailsLinesEOImpl object);

        public abstract void put(XxboqProgressDetailsLinesEOImpl object,
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
    private static final byte USERNAME_HISTORY_TYPE = 13;


    public static final int DOCHEADERID = AttributesEnum.DocHeaderId.index();
    public static final int ACTIVITYID = AttributesEnum.ActivityId.index();
    public static final int PROGRESSPERCENT =
        AttributesEnum.ProgressPercent.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int ROWID = AttributesEnum.RowID.index();
    public static final int XXBOQPROGRESSDETAILSHDREO =
        AttributesEnum.XxboqProgressDetailsHdrEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqProgressDetailsLinesEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqProgressDetailsLinesEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DocHeaderId, using the alias name DocHeaderId.
     * @return the DocHeaderId
     */
    public BigDecimal getDocHeaderId() {
        return (BigDecimal)getAttributeInternal(DOCHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocHeaderId.
     * @param value value to set the DocHeaderId
     */
    public void setDocHeaderId(BigDecimal value) {
        setAttributeInternal(DOCHEADERID, value);
    }

    /**
     * Gets the attribute value for ActivityId, using the alias name ActivityId.
     * @return the ActivityId
     */
    public BigDecimal getActivityId() {
        return (BigDecimal)getAttributeInternal(ACTIVITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActivityId.
     * @param value value to set the ActivityId
     */
    public void setActivityId(BigDecimal value) {
        setAttributeInternal(ACTIVITYID, value);
    }

    /**
     * Gets the attribute value for ProgressPercent, using the alias name ProgressPercent.
     * @return the ProgressPercent
     */
    public BigDecimal getProgressPercent() {
        return (BigDecimal)getAttributeInternal(PROGRESSPERCENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProgressPercent.
     * @param value value to set the ProgressPercent
     */
    public void setProgressPercent(BigDecimal value) {
        setAttributeInternal(PROGRESSPERCENT, value);
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
     * Gets the attribute value for RowID, using the alias name RowID.
     * @return the RowID
     */
    public String getRowID() {
        return (String)getAttributeInternal(ROWID);
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
     * @return the associated entity XxboqProgressDetailsHdrEOImpl.
     */
    public XxboqProgressDetailsHdrEOImpl getXxboqProgressDetailsHdrEO() {
        return (XxboqProgressDetailsHdrEOImpl)getAttributeInternal(XXBOQPROGRESSDETAILSHDREO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqProgressDetailsHdrEOImpl.
     */
    public void setXxboqProgressDetailsHdrEO(XxboqProgressDetailsHdrEOImpl value) {
        setAttributeInternal(XXBOQPROGRESSDETAILSHDREO, value);
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