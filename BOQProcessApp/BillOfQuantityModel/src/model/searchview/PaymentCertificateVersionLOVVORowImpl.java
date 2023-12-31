package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 12 09:42:30 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PaymentCertificateVersionLOVVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PcHeaderId {
            public Object get(PaymentCertificateVersionLOVVORowImpl obj) {
                return obj.getPcHeaderId();
            }

            public void put(PaymentCertificateVersionLOVVORowImpl obj,
                            Object value) {
                obj.setPcHeaderId((BigDecimal)value);
            }
        },
        Revision {
            public Object get(PaymentCertificateVersionLOVVORowImpl obj) {
                return obj.getRevision();
            }

            public void put(PaymentCertificateVersionLOVVORowImpl obj,
                            Object value) {
                obj.setRevision((BigDecimal)value);
            }
        },
        ProjectId {
            public Object get(PaymentCertificateVersionLOVVORowImpl obj) {
                return obj.getProjectId();
            }

            public void put(PaymentCertificateVersionLOVVORowImpl obj,
                            Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        },
        PcDocumentNum {
            public Object get(PaymentCertificateVersionLOVVORowImpl obj) {
                return obj.getPcDocumentNum();
            }

            public void put(PaymentCertificateVersionLOVVORowImpl obj,
                            Object value) {
                obj.setPcDocumentNum((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(PaymentCertificateVersionLOVVORowImpl object);

        public abstract void put(PaymentCertificateVersionLOVVORowImpl object,
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
    public static final int PCHEADERID = AttributesEnum.PcHeaderId.index();
    public static final int REVISION = AttributesEnum.Revision.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int PCDOCUMENTNUM =
        AttributesEnum.PcDocumentNum.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PaymentCertificateVersionLOVVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute PcHeaderId.
     * @return the PcHeaderId
     */
    public BigDecimal getPcHeaderId() {
        return (BigDecimal)getAttributeInternal(PCHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PcHeaderId.
     * @param value value to set the  PcHeaderId
     */
    public void setPcHeaderId(BigDecimal value) {
        setAttributeInternal(PCHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Revision.
     * @return the Revision
     */
    public BigDecimal getRevision() {
        return (BigDecimal)getAttributeInternal(REVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Revision.
     * @param value value to set the  Revision
     */
    public void setRevision(BigDecimal value) {
        setAttributeInternal(REVISION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjectId.
     * @return the ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal)getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProjectId.
     * @param value value to set the  ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PcDocumentNum.
     * @return the PcDocumentNum
     */
    public String getPcDocumentNum() {
        return (String)getAttributeInternal(PCDOCUMENTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PcDocumentNum.
     * @param value value to set the  PcDocumentNum
     */
    public void setPcDocumentNum(String value) {
        setAttributeInternal(PCDOCUMENTNUM, value);
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
