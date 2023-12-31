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
// ---    Fri Dec 30 11:27:26 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxboqBoqLinesEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        HeaderId {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getHeaderId();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setHeaderId((BigDecimal)value);
            }
        },
        LineId {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getLineId();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setLineId((BigDecimal)value);
            }
        },
        BillNumber {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getBillNumber();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setBillNumber((String)value);
            }
        },
        PageNumber {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getPageNumber();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setPageNumber((String)value);
            }
        },
        ItemNumber {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getItemNumber();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setItemNumber((String)value);
            }
        },
        ItemDescription {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getItemDescription();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setItemDescription((String)value);
            }
        },
        BoqQuantity {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getBoqQuantity();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setBoqQuantity((BigDecimal)value);
            }
        },
        Uom {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getUom();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setUom((String)value);
            }
        },
        EstimatedQuantity {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getEstimatedQuantity();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setEstimatedQuantity((BigDecimal)value);
            }
        },
        StructureId {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getStructureId();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setStructureId((BigDecimal)value);
            }
        },
        BoqRate {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getBoqRate();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setBoqRate((BigDecimal)value);
            }
        },
        ContractType {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getContractType();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setContractType((String)value);
            }
        },
        CreatedBy {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CreationDate {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdateDate {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LastUpdatedBy {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        ParentLineId {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getParentLineId();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setParentLineId((BigDecimal)value);
            }
        },
        BuId {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getBuId();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getProjectId();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        SequenceNumner {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getSequenceNumner();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setSequenceNumner((BigDecimal)value);
            }
        },
        WorkDoneQty {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getWorkDoneQty();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setWorkDoneQty((BigDecimal)value);
            }
        },
        CertifiedQty {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getCertifiedQty();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setCertifiedQty((BigDecimal)value);
            }
        },
        InvoicedQty {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getInvoicedQty();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setInvoicedQty((BigDecimal)value);
            }
        },
        XxboqBoqHeaderEO {
            public Object get(XxboqBoqLinesEOImpl obj) {
                return obj.getXxboqBoqHeaderEO();
            }

            public void put(XxboqBoqLinesEOImpl obj, Object value) {
                obj.setXxboqBoqHeaderEO((XxboqBoqHeaderEOImpl)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxboqBoqLinesEOImpl object);

        public abstract void put(XxboqBoqLinesEOImpl object, Object value);

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


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int BILLNUMBER = AttributesEnum.BillNumber.index();
    public static final int PAGENUMBER = AttributesEnum.PageNumber.index();
    public static final int ITEMNUMBER = AttributesEnum.ItemNumber.index();
    public static final int ITEMDESCRIPTION =
        AttributesEnum.ItemDescription.index();
    public static final int BOQQUANTITY = AttributesEnum.BoqQuantity.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int ESTIMATEDQUANTITY =
        AttributesEnum.EstimatedQuantity.index();
    public static final int STRUCTUREID = AttributesEnum.StructureId.index();
    public static final int BOQRATE = AttributesEnum.BoqRate.index();
    public static final int CONTRACTTYPE = AttributesEnum.ContractType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE =
        AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int PARENTLINEID = AttributesEnum.ParentLineId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int SEQUENCENUMNER =
        AttributesEnum.SequenceNumner.index();
    public static final int WORKDONEQTY = AttributesEnum.WorkDoneQty.index();
    public static final int CERTIFIEDQTY = AttributesEnum.CertifiedQty.index();
    public static final int INVOICEDQTY = AttributesEnum.InvoicedQty.index();
    public static final int XXBOQBOQHEADEREO =
        AttributesEnum.XxboqBoqHeaderEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxboqBoqLinesEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.entity.XxboqBoqLinesEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public BigDecimal getHeaderId() {
        return (BigDecimal)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(BigDecimal value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public BigDecimal getLineId() {
        return (BigDecimal)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(BigDecimal value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for BillNumber, using the alias name BillNumber.
     * @return the BillNumber
     */
    public String getBillNumber() {
        return (String)getAttributeInternal(BILLNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillNumber.
     * @param value value to set the BillNumber
     */
    public void setBillNumber(String value) {
        setAttributeInternal(BILLNUMBER, value);
    }

    /**
     * Gets the attribute value for PageNumber, using the alias name PageNumber.
     * @return the PageNumber
     */
    public String getPageNumber() {
        return (String)getAttributeInternal(PAGENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PageNumber.
     * @param value value to set the PageNumber
     */
    public void setPageNumber(String value) {
        setAttributeInternal(PAGENUMBER, value);
    }

    /**
     * Gets the attribute value for ItemNumber, using the alias name ItemNumber.
     * @return the ItemNumber
     */
    public String getItemNumber() {
        return (String)getAttributeInternal(ITEMNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemNumber.
     * @param value value to set the ItemNumber
     */
    public void setItemNumber(String value) {
        setAttributeInternal(ITEMNUMBER, value);
    }

    /**
     * Gets the attribute value for ItemDescription, using the alias name ItemDescription.
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return (String)getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemDescription.
     * @param value value to set the ItemDescription
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for BoqQuantity, using the alias name BoqQuantity.
     * @return the BoqQuantity
     */
    public BigDecimal getBoqQuantity() {
        return (BigDecimal)getAttributeInternal(BOQQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoqQuantity.
     * @param value value to set the BoqQuantity
     */
    public void setBoqQuantity(BigDecimal value) {
        setAttributeInternal(BOQQUANTITY, value);
    }

    /**
     * Gets the attribute value for Uom, using the alias name Uom.
     * @return the Uom
     */
    public String getUom() {
        return (String)getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Uom.
     * @param value value to set the Uom
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for EstimatedQuantity, using the alias name EstimatedQuantity.
     * @return the EstimatedQuantity
     */
    public BigDecimal getEstimatedQuantity() {
        return (BigDecimal)getAttributeInternal(ESTIMATEDQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for EstimatedQuantity.
     * @param value value to set the EstimatedQuantity
     */
    public void setEstimatedQuantity(BigDecimal value) {
        setAttributeInternal(ESTIMATEDQUANTITY, value);
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
     * Gets the attribute value for BoqRate, using the alias name BoqRate.
     * @return the BoqRate
     */
    public BigDecimal getBoqRate() {
        return (BigDecimal)getAttributeInternal(BOQRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoqRate.
     * @param value value to set the BoqRate
     */
    public void setBoqRate(BigDecimal value) {
        setAttributeInternal(BOQRATE, value);
    }

    /**
     * Gets the attribute value for ContractType, using the alias name ContractType.
     * @return the ContractType
     */
    public String getContractType() {
        return (String)getAttributeInternal(CONTRACTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractType.
     * @param value value to set the ContractType
     */
    public void setContractType(String value) {
        setAttributeInternal(CONTRACTTYPE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for ParentLineId, using the alias name ParentLineId.
     * @return the ParentLineId
     */
    public BigDecimal getParentLineId() {
        return (BigDecimal)getAttributeInternal(PARENTLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParentLineId.
     * @param value value to set the ParentLineId
     */
    public void setParentLineId(BigDecimal value) {
        setAttributeInternal(PARENTLINEID, value);
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
     * Gets the attribute value for SequenceNumner, using the alias name SequenceNumner.
     * @return the SequenceNumner
     */
    public BigDecimal getSequenceNumner() {
        return (BigDecimal)getAttributeInternal(SEQUENCENUMNER);
    }

    /**
     * Sets <code>value</code> as the attribute value for SequenceNumner.
     * @param value value to set the SequenceNumner
     */
    public void setSequenceNumner(BigDecimal value) {
        setAttributeInternal(SEQUENCENUMNER, value);
    }

    /**
     * Gets the attribute value for WorkDoneQty, using the alias name WorkDoneQty.
     * @return the WorkDoneQty
     */
    public BigDecimal getWorkDoneQty() {
        return (BigDecimal)getAttributeInternal(WORKDONEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkDoneQty.
     * @param value value to set the WorkDoneQty
     */
    public void setWorkDoneQty(BigDecimal value) {
        setAttributeInternal(WORKDONEQTY, value);
    }

    /**
     * Gets the attribute value for CertifiedQty, using the alias name CertifiedQty.
     * @return the CertifiedQty
     */
    public BigDecimal getCertifiedQty() {
        return (BigDecimal)getAttributeInternal(CERTIFIEDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertifiedQty.
     * @param value value to set the CertifiedQty
     */
    public void setCertifiedQty(BigDecimal value) {
        setAttributeInternal(CERTIFIEDQTY, value);
    }

    /**
     * Gets the attribute value for InvoicedQty, using the alias name InvoicedQty.
     * @return the InvoicedQty
     */
    public BigDecimal getInvoicedQty() {
        return (BigDecimal)getAttributeInternal(INVOICEDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoicedQty.
     * @param value value to set the InvoicedQty
     */
    public void setInvoicedQty(BigDecimal value) {
        setAttributeInternal(INVOICEDQTY, value);
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
     * @return the associated entity XxboqBoqHeaderEOImpl.
     */
    public XxboqBoqHeaderEOImpl getXxboqBoqHeaderEO() {
        return (XxboqBoqHeaderEOImpl)getAttributeInternal(XXBOQBOQHEADEREO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxboqBoqHeaderEOImpl.
     */
    public void setXxboqBoqHeaderEO(XxboqBoqHeaderEOImpl value) {
        setAttributeInternal(XXBOQBOQHEADEREO, value);
    }


    /**
     * @param headerId key constituent
     * @param lineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal headerId,
                                       BigDecimal lineId) {
        return new Key(new Object[] { headerId, lineId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl seq =
            new SequenceImpl("XXBOQ_BOQ_LINES_S", getDBTransaction());
        setLineId(new BigDecimal(seq.getSequenceNumber().toString()));
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
