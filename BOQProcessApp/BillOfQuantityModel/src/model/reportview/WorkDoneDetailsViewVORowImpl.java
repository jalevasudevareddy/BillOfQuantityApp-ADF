package model.reportview;

import java.math.BigDecimal;

import java.sql.Date;

import model.viewentity.XxboqWorkDoneDetailsVEOImpl;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 08 16:14:59 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WorkDoneDetailsViewVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TillDate {
            public Object get(WorkDoneDetailsViewVORowImpl obj) {
                return obj.getTillDate();
            }

            public void put(WorkDoneDetailsViewVORowImpl obj, Object value) {
                obj.setTillDate((Date)value);
            }
        },
        WdDocumentNum {
            public Object get(WorkDoneDetailsViewVORowImpl obj) {
                return obj.getWdDocumentNum();
            }

            public void put(WorkDoneDetailsViewVORowImpl obj, Object value) {
                obj.setWdDocumentNum((String)value);
            }
        },
        WdHeaderId {
            public Object get(WorkDoneDetailsViewVORowImpl obj) {
                return obj.getWdHeaderId();
            }

            public void put(WorkDoneDetailsViewVORowImpl obj, Object value) {
                obj.setWdHeaderId((BigDecimal)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(WorkDoneDetailsViewVORowImpl object);

        public abstract void put(WorkDoneDetailsViewVORowImpl object,
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
    public static final int TILLDATE = AttributesEnum.TillDate.index();
    public static final int WDDOCUMENTNUM =
        AttributesEnum.WdDocumentNum.index();
    public static final int WDHEADERID = AttributesEnum.WdHeaderId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WorkDoneDetailsViewVORowImpl() {
    }

    /**
     * Gets XxboqWorkDoneDetailsVEO entity object.
     * @return the XxboqWorkDoneDetailsVEO
     */
    public XxboqWorkDoneDetailsVEOImpl getXxboqWorkDoneDetailsVEO() {
        return (XxboqWorkDoneDetailsVEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for TILL_DATE using the alias name TillDate.
     * @return the TILL_DATE
     */
    public Date getTillDate() {
        return (Date)getAttributeInternal(TILLDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TILL_DATE using the alias name TillDate.
     * @param value value to set the TILL_DATE
     */
    public void setTillDate(Date value) {
        setAttributeInternal(TILLDATE, value);
    }

    /**
     * Gets the attribute value for WD_DOCUMENT_NUM using the alias name WdDocumentNum.
     * @return the WD_DOCUMENT_NUM
     */
    public String getWdDocumentNum() {
        return (String)getAttributeInternal(WDDOCUMENTNUM);
    }

    /**
     * Sets <code>value</code> as attribute value for WD_DOCUMENT_NUM using the alias name WdDocumentNum.
     * @param value value to set the WD_DOCUMENT_NUM
     */
    public void setWdDocumentNum(String value) {
        setAttributeInternal(WDDOCUMENTNUM, value);
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