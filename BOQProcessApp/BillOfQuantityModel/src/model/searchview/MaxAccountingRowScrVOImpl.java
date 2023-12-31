package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 26 18:04:40 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MaxAccountingRowScrVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MaxAccountingRowScrVOImpl() {
    }

    /**
     * Returns the bind variable value for p_bu_id.
     * @return bind variable value for p_bu_id
     */
    public BigDecimal getp_bu_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_bu_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_bu_id.
     * @param value value to bind as p_bu_id
     */
    public void setp_bu_id(BigDecimal value) {
        setNamedWhereClauseParam("p_bu_id", value);
    }

    /**
     * Returns the bind variable value for p_cat_type.
     * @return bind variable value for p_cat_type
     */
    public String getp_cat_type() {
        return (String)getNamedWhereClauseParam("p_cat_type");
    }

    /**
     * Sets <code>value</code> for bind variable p_cat_type.
     * @param value value to bind as p_cat_type
     */
    public void setp_cat_type(String value) {
        setNamedWhereClauseParam("p_cat_type", value);
    }

    /**
     * Returns the bind variable value for p_accnt_id.
     * @return bind variable value for p_accnt_id
     */
    public BigDecimal getp_accnt_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_accnt_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_accnt_id.
     * @param value value to bind as p_accnt_id
     */
    public void setp_accnt_id(BigDecimal value) {
        setNamedWhereClauseParam("p_accnt_id", value);
    }

    /**
     * Returns the bind variable value for p_dest.
     * @return bind variable value for p_dest
     */
    public String getp_dest() {
        return (String)getNamedWhereClauseParam("p_dest");
    }

    /**
     * Sets <code>value</code> for bind variable p_dest.
     * @param value value to bind as p_dest
     */
    public void setp_dest(String value) {
        setNamedWhereClauseParam("p_dest", value);
    }

    /**
     * Returns the bind variable value for p_cust_type.
     * @return bind variable value for p_cust_type
     */
    public String getp_cust_type() {
        return (String)getNamedWhereClauseParam("p_cust_type");
    }

    /**
     * Sets <code>value</code> for bind variable p_cust_type.
     * @param value value to bind as p_cust_type
     */
    public void setp_cust_type(String value) {
        setNamedWhereClauseParam("p_cust_type", value);
    }

    /**
     * Returns the bind variable value for p_ar_cont.
     * @return bind variable value for p_ar_cont
     */
    public String getp_ar_cont() {
        return (String)getNamedWhereClauseParam("p_ar_cont");
    }

    /**
     * Sets <code>value</code> for bind variable p_ar_cont.
     * @param value value to bind as p_ar_cont
     */
    public void setp_ar_cont(String value) {
        setNamedWhereClauseParam("p_ar_cont", value);
    }
}
