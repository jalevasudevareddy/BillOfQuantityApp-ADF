package model.reportview;

import java.math.BigDecimal;

import model.viewentity.XxboqWorkDoneLinesVEOImpl;

import oracle.jbo.Row;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 08 15:20:58 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WorkDoneLinesViewVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Amount {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getAmount();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setAmount((BigDecimal)value);
            }
        },
        BillQty {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getBillQty();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setBillQty((BigDecimal)value);
            }
        },
        Description {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getDescription();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        },
        PageItem {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getPageItem();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setPageItem((String)value);
            }
        },
        Present {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getPresent();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setPresent((BigDecimal)value);
            }
        },
        Previous {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getPrevious();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setPrevious((BigDecimal)value);
            }
        },
        Rate {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getRate();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setRate((BigDecimal)value);
            }
        },
        Total {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getTotal();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setTotal((BigDecimal)value);
            }
        },
        Uom {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getUom();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setUom((String)value);
            }
        },
        WdAmount {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getWdAmount();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setWdAmount((BigDecimal)value);
            }
        },
        WdHeaderId {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getWdHeaderId();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setWdHeaderId((BigDecimal)value);
            }
        },
        WdLineId {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getWdLineId();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setWdLineId((BigDecimal)value);
            }
        },
        WorkDoneDetailsViewVO {
            public Object get(WorkDoneLinesViewVORowImpl obj) {
                return obj.getWorkDoneDetailsViewVO();
            }

            public void put(WorkDoneLinesViewVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(WorkDoneLinesViewVORowImpl object);

        public abstract void put(WorkDoneLinesViewVORowImpl object,
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

    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int BILLQTY = AttributesEnum.BillQty.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int PAGEITEM = AttributesEnum.PageItem.index();
    public static final int PRESENT = AttributesEnum.Present.index();
    public static final int PREVIOUS = AttributesEnum.Previous.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int TOTAL = AttributesEnum.Total.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int WDAMOUNT = AttributesEnum.WdAmount.index();
    public static final int WDHEADERID = AttributesEnum.WdHeaderId.index();
    public static final int WDLINEID = AttributesEnum.WdLineId.index();
    public static final int WORKDONEDETAILSVIEWVO =
        AttributesEnum.WorkDoneDetailsViewVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WorkDoneLinesViewVORowImpl() {
    }

    /**
     * Gets XxboqWorkDoneLinesVEO entity object.
     * @return the XxboqWorkDoneLinesVEO
     */
    public XxboqWorkDoneLinesVEOImpl getXxboqWorkDoneLinesVEO() {
        return (XxboqWorkDoneLinesVEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for AMOUNT using the alias name Amount.
     * @return the AMOUNT
     */
    public BigDecimal getAmount() {
        return (BigDecimal)getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for AMOUNT using the alias name Amount.
     * @param value value to set the AMOUNT
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for BILL_QTY using the alias name BillQty.
     * @return the BILL_QTY
     */
    public BigDecimal getBillQty() {
        return (BigDecimal)getAttributeInternal(BILLQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_QTY using the alias name BillQty.
     * @param value value to set the BILL_QTY
     */
    public void setBillQty(BigDecimal value) {
        setAttributeInternal(BILLQTY, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String)getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for PAGE_ITEM using the alias name PageItem.
     * @return the PAGE_ITEM
     */
    public String getPageItem() {
        return (String)getAttributeInternal(PAGEITEM);
    }

    /**
     * Sets <code>value</code> as attribute value for PAGE_ITEM using the alias name PageItem.
     * @param value value to set the PAGE_ITEM
     */
    public void setPageItem(String value) {
        setAttributeInternal(PAGEITEM, value);
    }

    /**
     * Gets the attribute value for PRESENT using the alias name Present.
     * @return the PRESENT
     */
    public BigDecimal getPresent() {
        return (BigDecimal)getAttributeInternal(PRESENT);
    }

    /**
     * Sets <code>value</code> as attribute value for PRESENT using the alias name Present.
     * @param value value to set the PRESENT
     */
    public void setPresent(BigDecimal value) {
        setAttributeInternal(PRESENT, value);
    }

    /**
     * Gets the attribute value for PREVIOUS using the alias name Previous.
     * @return the PREVIOUS
     */
    public BigDecimal getPrevious() {
        return (BigDecimal)getAttributeInternal(PREVIOUS);
    }

    /**
     * Sets <code>value</code> as attribute value for PREVIOUS using the alias name Previous.
     * @param value value to set the PREVIOUS
     */
    public void setPrevious(BigDecimal value) {
        setAttributeInternal(PREVIOUS, value);
    }

    /**
     * Gets the attribute value for RATE using the alias name Rate.
     * @return the RATE
     */
    public BigDecimal getRate() {
        return (BigDecimal)getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RATE using the alias name Rate.
     * @param value value to set the RATE
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
    }

    /**
     * Gets the attribute value for TOTAL using the alias name Total.
     * @return the TOTAL
     */
    public BigDecimal getTotal() {
        return (BigDecimal)getAttributeInternal(TOTAL);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL using the alias name Total.
     * @param value value to set the TOTAL
     */
    public void setTotal(BigDecimal value) {
        setAttributeInternal(TOTAL, value);
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
     * Gets the attribute value for WD_AMOUNT using the alias name WdAmount.
     * @return the WD_AMOUNT
     */
    public BigDecimal getWdAmount() {
        return (BigDecimal)getAttributeInternal(WDAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for WD_AMOUNT using the alias name WdAmount.
     * @param value value to set the WD_AMOUNT
     */
    public void setWdAmount(BigDecimal value) {
        setAttributeInternal(WDAMOUNT, value);
    }

    /**
     * Gets the attribute value for WD_HEADER_ID using the alias name WdHeaderId.
     * @return the WD_HEADER_ID
     */
    public BigDecimal getWdHeaderId() {
        return (BigDecimal)getAttributeInternal(WDHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for WD_HEADER_ID using the alias name WdHeaderId.
     * @param value value to set the WD_HEADER_ID
     */
    public void setWdHeaderId(BigDecimal value) {
        setAttributeInternal(WDHEADERID, value);
    }

    /**
     * Gets the attribute value for WD_LINE_ID using the alias name WdLineId.
     * @return the WD_LINE_ID
     */
    public BigDecimal getWdLineId() {
        return (BigDecimal)getAttributeInternal(WDLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for WD_LINE_ID using the alias name WdLineId.
     * @param value value to set the WD_LINE_ID
     */
    public void setWdLineId(BigDecimal value) {
        setAttributeInternal(WDLINEID, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link WorkDoneDetailsViewVO.
     */
    public Row getWorkDoneDetailsViewVO() {
        return (Row)getAttributeInternal(WORKDONEDETAILSVIEWVO);
    }

    /**
     * Sets the master-detail link WorkDoneDetailsViewVO between this object and <code>value</code>.
     */
    public void setWorkDoneDetailsViewVO(Row value) {
        setAttributeInternal(WORKDONEDETAILSVIEWVO, value);
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
