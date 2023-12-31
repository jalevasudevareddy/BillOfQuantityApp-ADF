package model.view;

import java.math.BigDecimal;

import java.sql.Date;

import model.entity.XxboqBoqLinesEOImpl;

import model.entity.XxboqStructureSetupEOImpl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 31 09:57:16 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BOQLinesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BillNumber {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBillNumber();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setBillNumber((String)value);
            }
        },
        BoqQuantity {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBoqQuantity();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setBoqQuantity((BigDecimal)value);
            }
        },
        BoqRate {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBoqRate();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setBoqRate((BigDecimal)value);
            }
        },
        ContractType {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getContractType();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setContractType((String)value);
            }
        },
        CreatedBy {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        },
        CreationDate {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        },
        EstimatedQuantity {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getEstimatedQuantity();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setEstimatedQuantity((BigDecimal)value);
            }
        },
        HeaderId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setHeaderId((BigDecimal)value);
            }
        },
        ItemDescription {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getItemDescription();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setItemDescription((String)value);
            }
        },
        ItemNumber {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getItemNumber();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setItemNumber((String)value);
            }
        },
        LastUpdateDate {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        },
        LastUpdatedBy {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        },
        LineId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getLineId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setLineId((BigDecimal)value);
            }
        },
        PageNumber {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getPageNumber();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setPageNumber((String)value);
            }
        },
        StructureId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getStructureId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setStructureId((BigDecimal)value);
            }
        },
        Uom {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getUom();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setUom((String)value);
            }
        },
        ParentLineId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getParentLineId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setParentLineId((BigDecimal)value);
            }
        },
        TransTotalAmt {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getTransTotalAmt();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setTransTotalAmt((BigDecimal)value);
            }
        },
        TransGrandTotal {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getTransGrandTotal();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setTransGrandTotal((BigDecimal)value);
            }
        },
        TransStructureCode {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getTransStructureCode();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setTransStructureCode((String)value);
            }
        },
        StructureCode {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getStructureCode();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setStructureCode((String)value);
            }
        },
        StructureId1 {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getStructureId1();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setStructureId1((BigDecimal)value);
            }
        },
        BuId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBuId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setBuId((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getProjectId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        SequenceNumner {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getSequenceNumner();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setSequenceNumner((BigDecimal)value);
            }
        },
        TransDeleteFlag {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getTransDeleteFlag();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setTransDeleteFlag((String)value);
            }
        },
        TransMaxLineId {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getTransMaxLineId();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setTransMaxLineId((BigDecimal)value);
            }
        },
        TransBalance {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getTransBalance();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setTransBalance((BigDecimal)value);
            }
        },
        BOQLinesVO_2 {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBOQLinesVO_2();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        BOQLinesVO {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBOQLinesVO();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        UomCodeVO1 {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getUomCodeVO1();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LookupVO1 {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getLookupVO1();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        StructureSetupVO1 {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getStructureSetupVO1();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        BOQLinesVO1 {
            public Object get(BOQLinesVORowImpl obj) {
                return obj.getBOQLinesVO1();
            }

            public void put(BOQLinesVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(BOQLinesVORowImpl object);

        public abstract void put(BOQLinesVORowImpl object, Object value);

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


    public static final int BILLNUMBER = AttributesEnum.BillNumber.index();
    public static final int BOQQUANTITY = AttributesEnum.BoqQuantity.index();
    public static final int BOQRATE = AttributesEnum.BoqRate.index();
    public static final int CONTRACTTYPE = AttributesEnum.ContractType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int ESTIMATEDQUANTITY =
        AttributesEnum.EstimatedQuantity.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int ITEMDESCRIPTION =
        AttributesEnum.ItemDescription.index();
    public static final int ITEMNUMBER = AttributesEnum.ItemNumber.index();
    public static final int LASTUPDATEDATE =
        AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY =
        AttributesEnum.LastUpdatedBy.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int PAGENUMBER = AttributesEnum.PageNumber.index();
    public static final int STRUCTUREID = AttributesEnum.StructureId.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int PARENTLINEID = AttributesEnum.ParentLineId.index();
    public static final int TRANSTOTALAMT =
        AttributesEnum.TransTotalAmt.index();
    public static final int TRANSGRANDTOTAL =
        AttributesEnum.TransGrandTotal.index();
    public static final int TRANSSTRUCTURECODE =
        AttributesEnum.TransStructureCode.index();
    public static final int STRUCTURECODE =
        AttributesEnum.StructureCode.index();
    public static final int STRUCTUREID1 = AttributesEnum.StructureId1.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int SEQUENCENUMNER =
        AttributesEnum.SequenceNumner.index();
    public static final int TRANSDELETEFLAG =
        AttributesEnum.TransDeleteFlag.index();
    public static final int TRANSMAXLINEID =
        AttributesEnum.TransMaxLineId.index();
    public static final int TRANSBALANCE = AttributesEnum.TransBalance.index();
    public static final int BOQLINESVO_2 = AttributesEnum.BOQLinesVO_2.index();
    public static final int BOQLINESVO = AttributesEnum.BOQLinesVO.index();
    public static final int UOMCODEVO1 = AttributesEnum.UomCodeVO1.index();
    public static final int LOOKUPVO1 = AttributesEnum.LookupVO1.index();
    public static final int STRUCTURESETUPVO1 =
        AttributesEnum.StructureSetupVO1.index();
    public static final int BOQLINESVO1 = AttributesEnum.BOQLinesVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BOQLinesVORowImpl() {
    }

    /**
     * Gets XxboqBoqLinesEO entity object.
     * @return the XxboqBoqLinesEO
     */
    public XxboqBoqLinesEOImpl getXxboqBoqLinesEO() {
        return (XxboqBoqLinesEOImpl)getEntity(0);
    }

    /**
     * Gets XxboqStructureSetupT entity object.
     * @return the XxboqStructureSetupT
     */
    public XxboqStructureSetupEOImpl getXxboqStructureSetupT() {
        return (XxboqStructureSetupEOImpl)getEntity(1);
    }

    /**
     * Gets the attribute value for BILL_NUMBER using the alias name BillNumber.
     * @return the BILL_NUMBER
     */
    public String getBillNumber() {
        return (String)getAttributeInternal(BILLNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_NUMBER using the alias name BillNumber.
     * @param value value to set the BILL_NUMBER
     */
    public void setBillNumber(String value) {
        setAttributeInternal(BILLNUMBER, value);
    }

    /**
     * Gets the attribute value for BOQ_QUANTITY using the alias name BoqQuantity.
     * @return the BOQ_QUANTITY
     */
    public BigDecimal getBoqQuantity() {
        return (BigDecimal)getAttributeInternal(BOQQUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for BOQ_QUANTITY using the alias name BoqQuantity.
     * @param value value to set the BOQ_QUANTITY
     */
    public void setBoqQuantity(BigDecimal value) {
        setAttributeInternal(BOQQUANTITY, value);
    }

    /**
     * Gets the attribute value for BOQ_RATE using the alias name BoqRate.
     * @return the BOQ_RATE
     */
    public BigDecimal getBoqRate() {
        return (BigDecimal)getAttributeInternal(BOQRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for BOQ_RATE using the alias name BoqRate.
     * @param value value to set the BOQ_RATE
     */
    public void setBoqRate(BigDecimal value) {
        setAttributeInternal(BOQRATE, value);
    }

    /**
     * Gets the attribute value for CONTRACT_TYPE using the alias name ContractType.
     * @return the CONTRACT_TYPE
     */
    public String getContractType() {
        return (String)getAttributeInternal(CONTRACTTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_TYPE using the alias name ContractType.
     * @param value value to set the CONTRACT_TYPE
     */
    public void setContractType(String value) {
        setAttributeInternal(CONTRACTTYPE, value);
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
     * Gets the attribute value for ESTIMATED_QUANTITY using the alias name EstimatedQuantity.
     * @return the ESTIMATED_QUANTITY
     */
    public BigDecimal getEstimatedQuantity() {
        return (BigDecimal)getAttributeInternal(ESTIMATEDQUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for ESTIMATED_QUANTITY using the alias name EstimatedQuantity.
     * @param value value to set the ESTIMATED_QUANTITY
     */
    public void setEstimatedQuantity(BigDecimal value) {
        setAttributeInternal(ESTIMATEDQUANTITY, value);
    }

    /**
     * Gets the attribute value for HEADER_ID using the alias name HeaderId.
     * @return the HEADER_ID
     */
    public BigDecimal getHeaderId() {
        return (BigDecimal)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for HEADER_ID using the alias name HeaderId.
     * @param value value to set the HEADER_ID
     */
    public void setHeaderId(BigDecimal value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for ITEM_DESCRIPTION using the alias name ItemDescription.
     * @return the ITEM_DESCRIPTION
     */
    public String getItemDescription() {
        return (String)getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_DESCRIPTION using the alias name ItemDescription.
     * @param value value to set the ITEM_DESCRIPTION
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for ITEM_NUMBER using the alias name ItemNumber.
     * @return the ITEM_NUMBER
     */
    public String getItemNumber() {
        return (String)getAttributeInternal(ITEMNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_NUMBER using the alias name ItemNumber.
     * @param value value to set the ITEM_NUMBER
     */
    public void setItemNumber(String value) {
        setAttributeInternal(ITEMNUMBER, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
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
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public BigDecimal getLineId() {
        return (BigDecimal)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(BigDecimal value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for PAGE_NUMBER using the alias name PageNumber.
     * @return the PAGE_NUMBER
     */
    public String getPageNumber() {
        return (String)getAttributeInternal(PAGENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PAGE_NUMBER using the alias name PageNumber.
     * @param value value to set the PAGE_NUMBER
     */
    public void setPageNumber(String value) {
        setAttributeInternal(PAGENUMBER, value);
    }

    /**
     * Gets the attribute value for STRUCTURE_ID using the alias name StructureId.
     * @return the STRUCTURE_ID
     */
    public BigDecimal getStructureId() {
        return (BigDecimal)getAttributeInternal(STRUCTUREID);
    }

    /**
     * Sets <code>value</code> as attribute value for STRUCTURE_ID using the alias name StructureId.
     * @param value value to set the STRUCTURE_ID
     */
    public void setStructureId(BigDecimal value) {
        setAttributeInternal(STRUCTUREID, value);
    }

    /**
     * Gets the attribute value for UOM using the alias name Uom.
     * @return the UOM
     */
    public String getUom() {
        return (String)getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as attribute value for UOM using the alias name Uom.
     * @param value value to set the UOM
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for PARENT_LINE_ID using the alias name ParentLineId.
     * @return the PARENT_LINE_ID
     */
    public BigDecimal getParentLineId() {
        return (BigDecimal)getAttributeInternal(PARENTLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_LINE_ID using the alias name ParentLineId.
     * @param value value to set the PARENT_LINE_ID
     */
    public void setParentLineId(BigDecimal value) {
        setAttributeInternal(PARENTLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTotalAmt.
     * @return the TransTotalAmt
     */
    public BigDecimal getTransTotalAmt() {
        if (getBoqQuantity() != null && getBoqRate() != null) {
            Double qty = getBoqQuantity().doubleValue();
            Double rate = getBoqRate().doubleValue();
            return new BigDecimal(qty * rate);
        }
        return (BigDecimal)getAttributeInternal(TRANSTOTALAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTotalAmt.
     * @param value value to set the  TransTotalAmt
     */
    public void setTransTotalAmt(BigDecimal value) {
        setAttributeInternal(TRANSTOTALAMT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransGrandTotal.
     * @return the TransGrandTotal
     */
    public BigDecimal getTransGrandTotal() {
        return (BigDecimal)getAttributeInternal(TRANSGRANDTOTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransGrandTotal.
     * @param value value to set the  TransGrandTotal
     */
    public void setTransGrandTotal(BigDecimal value) {
        setAttributeInternal(TRANSGRANDTOTAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransStructureCode.
     * @return the TransStructureCode
     */
    public String getTransStructureCode() {
        return (String)getAttributeInternal(TRANSSTRUCTURECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStructureCode.
     * @param value value to set the  TransStructureCode
     */
    public void setTransStructureCode(String value) {
        setAttributeInternal(TRANSSTRUCTURECODE, value);
    }

    /**
     * Gets the attribute value for STRUCTURE_CODE using the alias name StructureCode.
     * @return the STRUCTURE_CODE
     */
    public String getStructureCode() {
        return (String)getAttributeInternal(STRUCTURECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for STRUCTURE_CODE using the alias name StructureCode.
     * @param value value to set the STRUCTURE_CODE
     */
    public void setStructureCode(String value) {
        setAttributeInternal(STRUCTURECODE, value);
    }

    /**
     * Gets the attribute value for STRUCTURE_ID using the alias name StructureId1.
     * @return the STRUCTURE_ID
     */
    public BigDecimal getStructureId1() {
        return (BigDecimal)getAttributeInternal(STRUCTUREID1);
    }

    /**
     * Sets <code>value</code> as attribute value for STRUCTURE_ID using the alias name StructureId1.
     * @param value value to set the STRUCTURE_ID
     */
    public void setStructureId1(BigDecimal value) {
        setAttributeInternal(STRUCTUREID1, value);
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
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public BigDecimal getProjectId() {
        return (BigDecimal)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for SEQUENCE_NUMNER using the alias name SequenceNumner.
     * @return the SEQUENCE_NUMNER
     */
    public BigDecimal getSequenceNumner() {
        return (BigDecimal)getAttributeInternal(SEQUENCENUMNER);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQUENCE_NUMNER using the alias name SequenceNumner.
     * @param value value to set the SEQUENCE_NUMNER
     */
    public void setSequenceNumner(BigDecimal value) {
        setAttributeInternal(SEQUENCENUMNER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDeleteFlag.
     * @return the TransDeleteFlag
     */
    public String getTransDeleteFlag() {
        return (String)getAttributeInternal(TRANSDELETEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeleteFlag.
     * @param value value to set the  TransDeleteFlag
     */
    public void setTransDeleteFlag(String value) {
        setAttributeInternal(TRANSDELETEFLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMaxLineId.
     * @return the TransMaxLineId
     */
    public BigDecimal getTransMaxLineId() {
        return (BigDecimal)getAttributeInternal(TRANSMAXLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMaxLineId.
     * @param value value to set the  TransMaxLineId
     */
    public void setTransMaxLineId(BigDecimal value) {
        setAttributeInternal(TRANSMAXLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBalance.
     * @return the TransBalance
     */
    public BigDecimal getTransBalance() {
        if (getTransGrandTotal() != null) {
            return ((BigDecimal)getBOQLinesVO().getAttribute("TransTotalAmt")).subtract(getTransGrandTotal());
        }
        return (BigDecimal)getAttributeInternal(TRANSBALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBalance.
     * @param value value to set the  TransBalance
     */
    public void setTransBalance(BigDecimal value) {
        setAttributeInternal(TRANSBALANCE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link BOQLinesVO_2.
     */
    public RowIterator getBOQLinesVO_2() {
        return (RowIterator)getAttributeInternal(BOQLINESVO_2);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link BOQLinesVO.
     */
    public Row getBOQLinesVO() {
        return (Row)getAttributeInternal(BOQLINESVO);
    }

    /**
     * Sets the master-detail link BOQLinesVO between this object and <code>value</code>.
     */
    public void setBOQLinesVO(Row value) {
        setAttributeInternal(BOQLINESVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UomCodeVO1.
     */
    public RowSet getUomCodeVO1() {
        return (RowSet)getAttributeInternal(UOMCODEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupVO1.
     */
    public RowSet getLookupVO1() {
        return (RowSet)getAttributeInternal(LOOKUPVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> StructureSetupVO1.
     */
    public RowSet getStructureSetupVO1() {
        return (RowSet)getAttributeInternal(STRUCTURESETUPVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BOQLinesVO1.
     */
    public RowSet getBOQLinesVO1() {
        return (RowSet)getAttributeInternal(BOQLINESVO1);
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
