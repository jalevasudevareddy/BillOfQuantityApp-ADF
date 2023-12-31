package model.view;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 25 11:04:15 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BoqValidationRejectionLinesVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ValidationHeaderId {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getValidationHeaderId();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setValidationHeaderId((BigDecimal)value);
            }
        },
        ValidationRejectiondId {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getValidationRejectiondId();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setValidationRejectiondId((BigDecimal)value);
            }
        },
        BoqLevel {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getBoqLevel();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setBoqLevel((String)value);
            }
        },
        LineType {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getLineType();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setLineType((String)value);
            }
        },
        PageItem {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getPageItem();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setPageItem((String)value);
            }
        },
        Item {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getItem();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setItem((String)value);
            }
        },
        BillDescription {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getBillDescription();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setBillDescription((String)value);
            }
        },
        BillQty {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getBillQty();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setBillQty((String)value);
            }
        },
        FinalQty {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getFinalQty();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setFinalQty((String)value);
            }
        },
        Unit {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getUnit();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setUnit((String)value);
            }
        },
        SellingRate {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getSellingRate();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setSellingRate((String)value);
            }
        },
        Trade {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getTrade();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setTrade((String)value);
            }
        },
        PriceCode {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getPriceCode();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setPriceCode((String)value);
            }
        },
        ErrorDetails {
            public Object get(BoqValidationRejectionLinesVORowImpl obj) {
                return obj.getErrorDetails();
            }

            public void put(BoqValidationRejectionLinesVORowImpl obj,
                            Object value) {
                obj.setErrorDetails((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(BoqValidationRejectionLinesVORowImpl object);

        public abstract void put(BoqValidationRejectionLinesVORowImpl object,
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


    public static final int VALIDATIONHEADERID =
        AttributesEnum.ValidationHeaderId.index();
    public static final int VALIDATIONREJECTIONDID =
        AttributesEnum.ValidationRejectiondId.index();
    public static final int BOQLEVEL = AttributesEnum.BoqLevel.index();
    public static final int LINETYPE = AttributesEnum.LineType.index();
    public static final int PAGEITEM = AttributesEnum.PageItem.index();
    public static final int ITEM = AttributesEnum.Item.index();
    public static final int BILLDESCRIPTION =
        AttributesEnum.BillDescription.index();
    public static final int BILLQTY = AttributesEnum.BillQty.index();
    public static final int FINALQTY = AttributesEnum.FinalQty.index();
    public static final int UNIT = AttributesEnum.Unit.index();
    public static final int SELLINGRATE = AttributesEnum.SellingRate.index();
    public static final int TRADE = AttributesEnum.Trade.index();
    public static final int PRICECODE = AttributesEnum.PriceCode.index();
    public static final int ERRORDETAILS = AttributesEnum.ErrorDetails.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BoqValidationRejectionLinesVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ValidationHeaderId.
     * @return the ValidationHeaderId
     */
    public BigDecimal getValidationHeaderId() {
        return (BigDecimal)getAttributeInternal(VALIDATIONHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ValidationHeaderId.
     * @param value value to set the  ValidationHeaderId
     */
    public void setValidationHeaderId(BigDecimal value) {
        setAttributeInternal(VALIDATIONHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ValidationRejectiondId.
     * @return the ValidationRejectiondId
     */
    public BigDecimal getValidationRejectiondId() {
        return (BigDecimal)getAttributeInternal(VALIDATIONREJECTIONDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ValidationRejectiondId.
     * @param value value to set the  ValidationRejectiondId
     */
    public void setValidationRejectiondId(BigDecimal value) {
        setAttributeInternal(VALIDATIONREJECTIONDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BoqLevel.
     * @return the BoqLevel
     */
    public String getBoqLevel() {
        return (String)getAttributeInternal(BOQLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BoqLevel.
     * @param value value to set the  BoqLevel
     */
    public void setBoqLevel(String value) {
        setAttributeInternal(BOQLEVEL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LineType.
     * @return the LineType
     */
    public String getLineType() {
        return (String)getAttributeInternal(LINETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LineType.
     * @param value value to set the  LineType
     */
    public void setLineType(String value) {
        setAttributeInternal(LINETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PageItem.
     * @return the PageItem
     */
    public String getPageItem() {
        return (String)getAttributeInternal(PAGEITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PageItem.
     * @param value value to set the  PageItem
     */
    public void setPageItem(String value) {
        setAttributeInternal(PAGEITEM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Item.
     * @return the Item
     */
    public String getItem() {
        return (String)getAttributeInternal(ITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Item.
     * @param value value to set the  Item
     */
    public void setItem(String value) {
        setAttributeInternal(ITEM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BillDescription.
     * @return the BillDescription
     */
    public String getBillDescription() {
        return (String)getAttributeInternal(BILLDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BillDescription.
     * @param value value to set the  BillDescription
     */
    public void setBillDescription(String value) {
        setAttributeInternal(BILLDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BillQty.
     * @return the BillQty
     */
    public String getBillQty() {
        return (String)getAttributeInternal(BILLQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BillQty.
     * @param value value to set the  BillQty
     */
    public void setBillQty(String value) {
        setAttributeInternal(BILLQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FinalQty.
     * @return the FinalQty
     */
    public String getFinalQty() {
        return (String)getAttributeInternal(FINALQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FinalQty.
     * @param value value to set the  FinalQty
     */
    public void setFinalQty(String value) {
        setAttributeInternal(FINALQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Unit.
     * @return the Unit
     */
    public String getUnit() {
        return (String)getAttributeInternal(UNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Unit.
     * @param value value to set the  Unit
     */
    public void setUnit(String value) {
        setAttributeInternal(UNIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SellingRate.
     * @return the SellingRate
     */
    public String getSellingRate() {
        return (String)getAttributeInternal(SELLINGRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SellingRate.
     * @param value value to set the  SellingRate
     */
    public void setSellingRate(String value) {
        setAttributeInternal(SELLINGRATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trade.
     * @return the Trade
     */
    public String getTrade() {
        return (String)getAttributeInternal(TRADE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trade.
     * @param value value to set the  Trade
     */
    public void setTrade(String value) {
        setAttributeInternal(TRADE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PriceCode.
     * @return the PriceCode
     */
    public String getPriceCode() {
        return (String)getAttributeInternal(PRICECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PriceCode.
     * @param value value to set the  PriceCode
     */
    public void setPriceCode(String value) {
        setAttributeInternal(PRICECODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ErrorDetails.
     * @return the ErrorDetails
     */
    public String getErrorDetails() {
        return (String)getAttributeInternal(ERRORDETAILS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ErrorDetails.
     * @param value value to set the  ErrorDetails
     */
    public void setErrorDetails(String value) {
        setAttributeInternal(ERRORDETAILS, value);
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
