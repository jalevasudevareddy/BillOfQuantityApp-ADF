package model.masterentity;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 10 14:59:05 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxpoLinesEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PoLineId {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getPoLineId();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setPoLineId((Number)value);
            }
        },
        PoHeaderId {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getPoHeaderId();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setPoHeaderId((Number)value);
            }
        },
        LineStauts {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getLineStauts();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setLineStauts((String)value);
            }
        },
        ItemId {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getItemId();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setItemId((Number)value);
            }
        },
        UomCode {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getUomCode();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setUomCode((String)value);
            }
        },
        CategoryId {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getCategoryId();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setCategoryId((BigDecimal)value);
            }
        },
        Quantity {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getQuantity();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setQuantity((Number)value);
            }
        },
        LineNumber {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getLineNumber();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setLineNumber((BigDecimal)value);
            }
        },
        BuId {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getBuId();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setBuId((Number)value);
            }
        },
        UnitCost {
            public Object get(XxpoLinesEOImpl obj) {
                return obj.getUnitCost();
            }

            public void put(XxpoLinesEOImpl obj, Object value) {
                obj.setUnitCost((Number)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxpoLinesEOImpl object);

        public abstract void put(XxpoLinesEOImpl object, Object value);

        public int index() {
            return XxpoLinesEOImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return XxpoLinesEOImpl.AttributesEnum.firstIndex() +
                XxpoLinesEOImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = XxpoLinesEOImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int POLINEID = AttributesEnum.PoLineId.index();
    public static final int POHEADERID = AttributesEnum.PoHeaderId.index();
    public static final int LINESTAUTS = AttributesEnum.LineStauts.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int UOMCODE = AttributesEnum.UomCode.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int LINENUMBER = AttributesEnum.LineNumber.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int UNITCOST = AttributesEnum.UnitCost.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxpoLinesEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("model.masterentity.XxpoLinesEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for PoLineId, using the alias name PoLineId.
     * @return the PoLineId
     */
    public Number getPoLineId() {
        return (Number)getAttributeInternal(POLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoLineId.
     * @param value value to set the PoLineId
     */
    public void setPoLineId(Number value) {
        setAttributeInternal(POLINEID, value);
    }

    /**
     * Gets the attribute value for PoHeaderId, using the alias name PoHeaderId.
     * @return the PoHeaderId
     */
    public Number getPoHeaderId() {
        return (Number)getAttributeInternal(POHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoHeaderId.
     * @param value value to set the PoHeaderId
     */
    public void setPoHeaderId(Number value) {
        setAttributeInternal(POHEADERID, value);
    }

    /**
     * Gets the attribute value for LineStauts, using the alias name LineStauts.
     * @return the LineStauts
     */
    public String getLineStauts() {
        return (String)getAttributeInternal(LINESTAUTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineStauts.
     * @param value value to set the LineStauts
     */
    public void setLineStauts(String value) {
        setAttributeInternal(LINESTAUTS, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the ItemId
     */
    public Number getItemId() {
        return (Number)getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(Number value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for UomCode, using the alias name UomCode.
     * @return the UomCode
     */
    public String getUomCode() {
        return (String)getAttributeInternal(UOMCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomCode.
     * @param value value to set the UomCode
     */
    public void setUomCode(String value) {
        setAttributeInternal(UOMCODE, value);
    }

    /**
     * Gets the attribute value for CategoryId, using the alias name CategoryId.
     * @return the CategoryId
     */
    public BigDecimal getCategoryId() {
        return (BigDecimal)getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryId.
     * @param value value to set the CategoryId
     */
    public void setCategoryId(BigDecimal value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the Quantity
     */
    public Number getQuantity() {
        return (Number)getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for LineNumber, using the alias name LineNumber.
     * @return the LineNumber
     */
    public BigDecimal getLineNumber() {
        return (BigDecimal)getAttributeInternal(LINENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineNumber.
     * @param value value to set the LineNumber
     */
    public void setLineNumber(BigDecimal value) {
        setAttributeInternal(LINENUMBER, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the BuId
     */
    public Number getBuId() {
        return (Number)getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Number value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for UnitCost, using the alias name UnitCost.
     * @return the UnitCost
     */
    public Number getUnitCost() {
        return (Number)getAttributeInternal(UNITCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitCost.
     * @param value value to set the UnitCost
     */
    public void setUnitCost(Number value) {
        setAttributeInternal(UNITCOST, value);
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
     * @param poLineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number poLineId) {
        return new Key(new Object[] { poLineId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }
}
