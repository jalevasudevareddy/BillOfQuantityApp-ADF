package model.entity;

import java.util.Map;

import model.view.BOQCostingDetailsHeaderVORowImpl;

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
// ---    Wed Jan 25 10:54:22 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqJobItemCostingEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        JobItemCostingId {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getJobItemCostingId();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setJobItemCostingId((Number)value);
            }
        },
        CostingDetailsHeaderId {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getCostingDetailsHeaderId();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setCostingDetailsHeaderId((Number)value);
            }
        },
        BoqLineId {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getBoqLineId();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setBoqLineId((Number)value);
            }
        },
        JobItemAnalysisId {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getJobItemAnalysisId();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setJobItemAnalysisId((Number)value);
            }
        },
        CreationDate {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreatedBy {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedDate {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        XxboqCostingDetailsHeaderEO {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getXxboqCostingDetailsHeaderEO();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setXxboqCostingDetailsHeaderEO((XxboqCostingDetailsHeaderEOImpl)value);
            }
        },
        BOQCostingDetailsHeaderVO {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getBOQCostingDetailsHeaderVO();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        UnitRateAnalysisForProjectJobVO {
            public Object get(XxboqJobItemCostingEOImpl obj) {
                return obj.getUnitRateAnalysisForProjectJobVO();
            }

            public void put(XxboqJobItemCostingEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqJobItemCostingEOImpl object);

        public abstract void put(XxboqJobItemCostingEOImpl object,
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


    public static final int JOBITEMCOSTINGID =
        AttributesEnum.JobItemCostingId.index();
    public static final int COSTINGDETAILSHEADERID =
        AttributesEnum.CostingDetailsHeaderId.index();
    public static final int BOQLINEID = AttributesEnum.BoqLineId.index();
    public static final int JOBITEMANALYSISID =
        AttributesEnum.JobItemAnalysisId.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE =
        AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int XXBOQCOSTINGDETAILSHEADEREO =
        AttributesEnum.XxboqCostingDetailsHeaderEO.index();
    public static final int BOQCOSTINGDETAILSHEADERVO =
        AttributesEnum.BOQCostingDetailsHeaderVO.index();
    public static final int UNITRATEANALYSISFORPROJECTJOBVO =
        AttributesEnum.UnitRateAnalysisForProjectJobVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqJobItemCostingEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqJobItemCostingEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for JobItemCostingId, using the alias name JobItemCostingId.
     * @return the JobItemCostingId
     */
    public Number getJobItemCostingId() {
        return (Number)getAttributeInternal(JOBITEMCOSTINGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobItemCostingId.
     * @param value value to set the JobItemCostingId
     */
    public void setJobItemCostingId(Number value) {
        setAttributeInternal(JOBITEMCOSTINGID, value);
    }

    /**
     * Gets the attribute value for CostingDetailsHeaderId, using the alias name CostingDetailsHeaderId.
     * @return the CostingDetailsHeaderId
     */
    public Number getCostingDetailsHeaderId() {
        return (Number)getAttributeInternal(COSTINGDETAILSHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CostingDetailsHeaderId.
     * @param value value to set the CostingDetailsHeaderId
     */
    public void setCostingDetailsHeaderId(Number value) {
        setAttributeInternal(COSTINGDETAILSHEADERID, value);
    }

    /**
     * Gets the attribute value for BoqLineId, using the alias name BoqLineId.
     * @return the BoqLineId
     */
    public Number getBoqLineId() {
        return (Number)getAttributeInternal(BOQLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoqLineId.
     * @param value value to set the BoqLineId
     */
    public void setBoqLineId(Number value) {
        setAttributeInternal(BOQLINEID, value);
    }

    /**
     * Gets the attribute value for JobItemAnalysisId, using the alias name JobItemAnalysisId.
     * @return the JobItemAnalysisId
     */
    public Number getJobItemAnalysisId() {
        return (Number)getAttributeInternal(JOBITEMANALYSISID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobItemAnalysisId.
     * @param value value to set the JobItemAnalysisId
     */
    public void setJobItemAnalysisId(Number value) {
        setAttributeInternal(JOBITEMANALYSISID, value);
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
     * @return the associated entity XxboqCostingDetailsHeaderEOImpl.
     */
    public XxboqCostingDetailsHeaderEOImpl getXxboqCostingDetailsHeaderEO() {
        return (XxboqCostingDetailsHeaderEOImpl)getAttributeInternal(XXBOQCOSTINGDETAILSHEADEREO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqCostingDetailsHeaderEOImpl.
     */
    public void setXxboqCostingDetailsHeaderEO(XxboqCostingDetailsHeaderEOImpl value) {
        setAttributeInternal(XXBOQCOSTINGDETAILSHEADEREO, value);
    }

    /**
     * Uses the link BOQCostingDetailsHeaderToJobItemCostingVL to return rows of BOQJobItemCostingVO
     */
    public BOQCostingDetailsHeaderVORowImpl getBOQCostingDetailsHeaderVO() {
        return (BOQCostingDetailsHeaderVORowImpl)getAttributeInternal(BOQCOSTINGDETAILSHEADERVO);
    }

    /**
     * Uses the link BOQJobItemCostingToUnitRateAnalysisForProjectJobVL to return rows of UnitRateAnalysisForProjectJobVO
     */
    public RowIterator getUnitRateAnalysisForProjectJobVO() {
        return (RowIterator)getAttributeInternal(UNITRATEANALYSISFORPROJECTJOBVO);
    }

    /**
     * @param jobItemCostingId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number jobItemCostingId) {
        return new Key(new Object[] { jobItemCostingId });
    }

    protected void create(AttributeList attributeList) {
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_JOB_ITEM_COSTING_S", getDBTransaction());
        setJobItemCostingId(seq.getSequenceNumber());
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
