package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 02 12:56:40 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PCLinesSearchWithProjectIdVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Cummulative {
            public Object get(PCLinesSearchWithProjectIdVORowImpl obj) {
                return obj.getCummulative();
            }

            public void put(PCLinesSearchWithProjectIdVORowImpl obj,
                            Object value) {
                obj.setCummulative((BigDecimal)value);
            }
        },
        PcLineId {
            public Object get(PCLinesSearchWithProjectIdVORowImpl obj) {
                return obj.getPcLineId();
            }

            public void put(PCLinesSearchWithProjectIdVORowImpl obj,
                            Object value) {
                obj.setPcLineId((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(PCLinesSearchWithProjectIdVORowImpl object);

        public abstract void put(PCLinesSearchWithProjectIdVORowImpl object,
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


    public static final int CUMMULATIVE = AttributesEnum.Cummulative.index();
    public static final int PCLINEID = AttributesEnum.PcLineId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PCLinesSearchWithProjectIdVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Cummulative.
     * @return the Cummulative
     */
    public BigDecimal getCummulative() {
        return (BigDecimal)getAttributeInternal(CUMMULATIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Cummulative.
     * @param value value to set the  Cummulative
     */
    public void setCummulative(BigDecimal value) {
        setAttributeInternal(CUMMULATIVE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PcLineId.
     * @return the PcLineId
     */
    public BigDecimal getPcLineId() {
        return (BigDecimal)getAttributeInternal(PCLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PcLineId.
     * @param value value to set the  PcLineId
     */
    public void setPcLineId(BigDecimal value) {
        setAttributeInternal(PCLINEID, value);
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
