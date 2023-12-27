package model.transview;

import java.math.BigDecimal;

import java.sql.Date;

import model.searchview.MaxProjectPCStartDateScrVORowImpl;

import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 24 12:37:36 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransPCHdrVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TransBuId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransBuId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransBuId((BigDecimal)value);
            }
        }
        ,
        TransBuName {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransBuName();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransBuName((String)value);
            }
        }
        ,
        TransProjectNum {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransProjectNum();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransProjectNum((String)value);
            }
        }
        ,
        TransProjectId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransProjectId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransProjectId((BigDecimal)value);
            }
        }
        ,
        TransDocType {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransDocType();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransDocType((String)value);
            }
        }
        ,
        TransCertNum {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransCertNum();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransCertNum((String)value);
            }
        }
        ,
        TransCertId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransCertId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransCertId((BigDecimal)value);
            }
        }
        ,
        TransPeriod {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransPeriod();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransPeriod((String)value);
            }
        }
        ,
        TransMaxStartDate {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransMaxStartDate();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransMaxStartDate((Date)value);
            }
        }
        ,
        TransStartDate {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransStartDate();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransStartDate((Date)value);
            }
        }
        ,
        TransEndDate {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransEndDate();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransEndDate((Date)value);
            }
        }
        ,
        TransMasterCertHdrId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransMasterCertHdrId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransMasterCertHdrId((BigDecimal)value);
            }
        }
        ,
        TransDocCode {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransDocCode();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransDocCode((String)value);
            }
        }
        ,
        TransCustomerId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransCustomerId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransCustomerId((BigDecimal)value);
            }
        }
        ,
        TransAdvancePerct {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransAdvancePerct();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransAdvancePerct((BigDecimal)value);
            }
        }
        ,
        TransAdvanceRecryPerct {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransAdvanceRecryPerct();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransAdvanceRecryPerct((BigDecimal)value);
            }
        }
        ,
        TransRetentionPerct {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransRetentionPerct();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransRetentionPerct((BigDecimal)value);
            }
        }
        ,
        TransPaymenTerms {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransPaymenTerms();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransPaymenTerms((String)value);
            }
        }
        ,
        TransBoqHeaderId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransBoqHeaderId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransBoqHeaderId((BigDecimal)value);
            }
        }
        ,
        TransContractNumber {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransContractNumber();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransContractNumber((String)value);
            }
        }
        ,
        TransContractId {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransContractId();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransContractId((BigDecimal)value);
            }
        }
        ,
        TransTaxFlag {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getTransTaxFlag();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setTransTaxFlag((String)value);
            }
        }
        ,
        UserBUSearchVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getUserBUSearchVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LookupVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getLookupVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MaxProjectPCStartDateScrVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getMaxProjectPCStartDateScrVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PrjProjectsVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getPrjProjectsVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ProjectCertifiedDetailsScrVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getProjectCertifiedDetailsScrVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AgreementMonthsVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getAgreementMonthsVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ProjectSearchVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getProjectSearchVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ContractHeadersVO1 {
            public Object get(TransPCHdrVORowImpl obj) {
                return obj.getContractHeadersVO1();
            }

            public void put(TransPCHdrVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(TransPCHdrVORowImpl object);

        public abstract void put(TransPCHdrVORowImpl object, Object value);

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


    public static final int TRANSBUID = AttributesEnum.TransBuId.index();
    public static final int TRANSBUNAME = AttributesEnum.TransBuName.index();
    public static final int TRANSPROJECTNUM = AttributesEnum.TransProjectNum.index();
    public static final int TRANSPROJECTID = AttributesEnum.TransProjectId.index();
    public static final int TRANSDOCTYPE = AttributesEnum.TransDocType.index();
    public static final int TRANSCERTNUM = AttributesEnum.TransCertNum.index();
    public static final int TRANSCERTID = AttributesEnum.TransCertId.index();
    public static final int TRANSPERIOD = AttributesEnum.TransPeriod.index();
    public static final int TRANSMAXSTARTDATE = AttributesEnum.TransMaxStartDate.index();
    public static final int TRANSSTARTDATE = AttributesEnum.TransStartDate.index();
    public static final int TRANSENDDATE = AttributesEnum.TransEndDate.index();
    public static final int TRANSMASTERCERTHDRID = AttributesEnum.TransMasterCertHdrId.index();
    public static final int TRANSDOCCODE = AttributesEnum.TransDocCode.index();
    public static final int TRANSCUSTOMERID = AttributesEnum.TransCustomerId.index();
    public static final int TRANSADVANCEPERCT = AttributesEnum.TransAdvancePerct.index();
    public static final int TRANSADVANCERECRYPERCT = AttributesEnum.TransAdvanceRecryPerct.index();
    public static final int TRANSRETENTIONPERCT = AttributesEnum.TransRetentionPerct.index();
    public static final int TRANSPAYMENTERMS = AttributesEnum.TransPaymenTerms.index();
    public static final int TRANSBOQHEADERID = AttributesEnum.TransBoqHeaderId.index();
    public static final int TRANSCONTRACTNUMBER = AttributesEnum.TransContractNumber.index();
    public static final int TRANSCONTRACTID = AttributesEnum.TransContractId.index();
    public static final int TRANSTAXFLAG = AttributesEnum.TransTaxFlag.index();
    public static final int USERBUSEARCHVO1 = AttributesEnum.UserBUSearchVO1.index();
    public static final int LOOKUPVO1 = AttributesEnum.LookupVO1.index();
    public static final int MAXPROJECTPCSTARTDATESCRVO1 = AttributesEnum.MaxProjectPCStartDateScrVO1.index();
    public static final int PRJPROJECTSVO1 = AttributesEnum.PrjProjectsVO1.index();
    public static final int PROJECTCERTIFIEDDETAILSSCRVO1 = AttributesEnum.ProjectCertifiedDetailsScrVO1.index();
    public static final int AGREEMENTMONTHSVO1 = AttributesEnum.AgreementMonthsVO1.index();
    public static final int PROJECTSEARCHVO1 = AttributesEnum.ProjectSearchVO1.index();
    public static final int CONTRACTHEADERSVO1 = AttributesEnum.ContractHeadersVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransPCHdrVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TransBuId.
     * @return the TransBuId
     */
    public BigDecimal getTransBuId() {
        return (BigDecimal)getAttributeInternal(TRANSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBuId.
     * @param value value to set the  TransBuId
     */
    public void setTransBuId(BigDecimal value) {
        setAttributeInternal(TRANSBUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBuName.
     * @return the TransBuName
     */
    public String getTransBuName() {
        return (String)getAttributeInternal(TRANSBUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBuName.
     * @param value value to set the  TransBuName
     */
    public void setTransBuName(String value) {
        setAttributeInternal(TRANSBUNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProjectNum.
     * @return the TransProjectNum
     */
    public String getTransProjectNum() {
        return (String)getAttributeInternal(TRANSPROJECTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransProjectNum.
     * @param value value to set the  TransProjectNum
     */
    public void setTransProjectNum(String value) {
        setAttributeInternal(TRANSPROJECTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransProjectId.
     * @return the TransProjectId
     */
    public BigDecimal getTransProjectId() {
        return (BigDecimal)getAttributeInternal(TRANSPROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransProjectId.
     * @param value value to set the  TransProjectId
     */
    public void setTransProjectId(BigDecimal value) {
        setAttributeInternal(TRANSPROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDocType.
     * @return the TransDocType
     */
    public String getTransDocType() {
        return (String)getAttributeInternal(TRANSDOCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDocType.
     * @param value value to set the  TransDocType
     */
    public void setTransDocType(String value) {
        setAttributeInternal(TRANSDOCTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCertNum.
     * @return the TransCertNum
     */
    public String getTransCertNum() {
        return (String)getAttributeInternal(TRANSCERTNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCertNum.
     * @param value value to set the  TransCertNum
     */
    public void setTransCertNum(String value) {
        setAttributeInternal(TRANSCERTNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCertId.
     * @return the TransCertId
     */
    public BigDecimal getTransCertId() {
        return (BigDecimal)getAttributeInternal(TRANSCERTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCertId.
     * @param value value to set the  TransCertId
     */
    public void setTransCertId(BigDecimal value) {
        setAttributeInternal(TRANSCERTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransPeriod.
     * @return the TransPeriod
     */
    public String getTransPeriod() {
        return (String)getAttributeInternal(TRANSPERIOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransPeriod.
     * @param value value to set the  TransPeriod
     */
    public void setTransPeriod(String value) {
        setAttributeInternal(TRANSPERIOD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMaxStartDate.
     * @return the TransMaxStartDate
     */
    public Date getTransMaxStartDate() {
        RowSet rowSetItr = getMaxProjectPCStartDateScrVO1();
        rowSetItr.setNamedWhereClauseParam("p_bu_id", getTransBuId());
        rowSetItr.setNamedWhereClauseParam("p_prj_id", getTransProjectId());
        rowSetItr.executeQuery();
        if (rowSetItr.first() != null) {
            MaxProjectPCStartDateScrVORowImpl row =
                (MaxProjectPCStartDateScrVORowImpl)rowSetItr.first();
            if (row.getMaxDate() != null) {
                return row.getMaxDate();
            } else {
                return getTransStartDate();
            }
        }

        return (Date)getAttributeInternal(TRANSMAXSTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMaxStartDate.
     * @param value value to set the  TransMaxStartDate
     */
    public void setTransMaxStartDate(Date value) {
        setAttributeInternal(TRANSMAXSTARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransStartDate.
     * @return the TransStartDate
     */
    public Date getTransStartDate() {
        return (Date)getAttributeInternal(TRANSSTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStartDate.
     * @param value value to set the  TransStartDate
     */
    public void setTransStartDate(Date value) {
        setAttributeInternal(TRANSSTARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEndDate.
     * @return the TransEndDate
     */
    public Date getTransEndDate() {
        return (Date)getAttributeInternal(TRANSENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEndDate.
     * @param value value to set the  TransEndDate
     */
    public void setTransEndDate(Date value) {
        setAttributeInternal(TRANSENDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMasterCertHdrId.
     * @return the TransMasterCertHdrId
     */
    public BigDecimal getTransMasterCertHdrId() {
        return (BigDecimal)getAttributeInternal(TRANSMASTERCERTHDRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMasterCertHdrId.
     * @param value value to set the  TransMasterCertHdrId
     */
    public void setTransMasterCertHdrId(BigDecimal value) {
        setAttributeInternal(TRANSMASTERCERTHDRID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransDocCode.
     * @return the TransDocCode
     */
    public String getTransDocCode() {
        return (String)getAttributeInternal(TRANSDOCCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDocCode.
     * @param value value to set the  TransDocCode
     */
    public void setTransDocCode(String value) {
        setAttributeInternal(TRANSDOCCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCustomerId.
     * @return the TransCustomerId
     */
    public BigDecimal getTransCustomerId() {
        return (BigDecimal)getAttributeInternal(TRANSCUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCustomerId.
     * @param value value to set the  TransCustomerId
     */
    public void setTransCustomerId(BigDecimal value) {
        setAttributeInternal(TRANSCUSTOMERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAdvancePerct.
     * @return the TransAdvancePerct
     */
    public BigDecimal getTransAdvancePerct() {
        return (BigDecimal)getAttributeInternal(TRANSADVANCEPERCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAdvancePerct.
     * @param value value to set the  TransAdvancePerct
     */
    public void setTransAdvancePerct(BigDecimal value) {
        setAttributeInternal(TRANSADVANCEPERCT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAdvanceRecryPerct.
     * @return the TransAdvanceRecryPerct
     */
    public BigDecimal getTransAdvanceRecryPerct() {
        return (BigDecimal)getAttributeInternal(TRANSADVANCERECRYPERCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAdvanceRecryPerct.
     * @param value value to set the  TransAdvanceRecryPerct
     */
    public void setTransAdvanceRecryPerct(BigDecimal value) {
        setAttributeInternal(TRANSADVANCERECRYPERCT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRetentionPerct.
     * @return the TransRetentionPerct
     */
    public BigDecimal getTransRetentionPerct() {
        return (BigDecimal)getAttributeInternal(TRANSRETENTIONPERCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRetentionPerct.
     * @param value value to set the  TransRetentionPerct
     */
    public void setTransRetentionPerct(BigDecimal value) {
        setAttributeInternal(TRANSRETENTIONPERCT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransPaymenTerms.
     * @return the TransPaymenTerms
     */
    public String getTransPaymenTerms() {
        return (String)getAttributeInternal(TRANSPAYMENTERMS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransPaymenTerms.
     * @param value value to set the  TransPaymenTerms
     */
    public void setTransPaymenTerms(String value) {
        setAttributeInternal(TRANSPAYMENTERMS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBoqHeaderId.
     * @return the TransBoqHeaderId
     */
    public BigDecimal getTransBoqHeaderId() {
        return (BigDecimal)getAttributeInternal(TRANSBOQHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBoqHeaderId.
     * @param value value to set the  TransBoqHeaderId
     */
    public void setTransBoqHeaderId(BigDecimal value) {
        setAttributeInternal(TRANSBOQHEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransContractNumber.
     * @return the TransContractNumber
     */
    public String getTransContractNumber() {
        return (String) getAttributeInternal(TRANSCONTRACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractNumber.
     * @param value value to set the  TransContractNumber
     */
    public void setTransContractNumber(String value) {
        setAttributeInternal(TRANSCONTRACTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransContractId.
     * @return the TransContractId
     */
    public BigDecimal getTransContractId() {
        return (BigDecimal) getAttributeInternal(TRANSCONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransContractId.
     * @param value value to set the  TransContractId
     */
    public void setTransContractId(BigDecimal value) {
        setAttributeInternal(TRANSCONTRACTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransTaxFlag.
     * @return the TransTaxFlag
     */
    public String getTransTaxFlag() {
        return (String) getAttributeInternal(TRANSTAXFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTaxFlag.
     * @param value value to set the  TransTaxFlag
     */
    public void setTransTaxFlag(String value) {
        setAttributeInternal(TRANSTAXFLAG, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UserBUSearchVO1.
     */
    public RowSet getUserBUSearchVO1() {
        return (RowSet)getAttributeInternal(USERBUSEARCHVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupVO1.
     */
    public RowSet getLookupVO1() {
        return (RowSet)getAttributeInternal(LOOKUPVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> MaxProjectPCStartDateScrVO1.
     */
    public RowSet getMaxProjectPCStartDateScrVO1() {
        return (RowSet)getAttributeInternal(MAXPROJECTPCSTARTDATESCRVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PrjProjectsVO1.
     */
    public RowSet getPrjProjectsVO1() {
        return (RowSet)getAttributeInternal(PRJPROJECTSVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProjectCertifiedDetailsScrVO1.
     */
    public RowSet getProjectCertifiedDetailsScrVO1() {
        return (RowSet)getAttributeInternal(PROJECTCERTIFIEDDETAILSSCRVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AgreementMonthsVO1.
     */
    public RowSet getAgreementMonthsVO1() {
        return (RowSet)getAttributeInternal(AGREEMENTMONTHSVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProjectSearchVO1.
     */
    public RowSet getProjectSearchVO1() {
        return (RowSet)getAttributeInternal(PROJECTSEARCHVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ContractHeadersVO1.
     */
    public RowSet getContractHeadersVO1() {
        return (RowSet)getAttributeInternal(CONTRACTHEADERSVO1);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
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
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}