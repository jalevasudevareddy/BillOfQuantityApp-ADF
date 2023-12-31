package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 02 12:56:41 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PCLinesSearchWithProjectIdVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PCLinesSearchWithProjectIdVOImpl() {
    }

    /**
     * Returns the bind variable value for p_particulars.
     * @return bind variable value for p_particulars
     */
    public String getp_particulars() {
        return (String)getNamedWhereClauseParam("p_particulars");
    }

    /**
     * Sets <code>value</code> for bind variable p_particulars.
     * @param value value to bind as p_particulars
     */
    public void setp_particulars(String value) {
        setNamedWhereClauseParam("p_particulars", value);
    }

    /**
     * Returns the bind variable value for p_project_id.
     * @return bind variable value for p_project_id
     */
    public BigDecimal getp_project_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_project_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_project_id.
     * @param value value to bind as p_project_id
     */
    public void setp_project_id(BigDecimal value) {
        setNamedWhereClauseParam("p_project_id", value);
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
     * Returns the bind variable value for p_contract_id.
     * @return bind variable value for p_contract_id
     */
    public BigDecimal getp_contract_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_contract_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_contract_id.
     * @param value value to bind as p_contract_id
     */
    public void setp_contract_id(BigDecimal value) {
        setNamedWhereClauseParam("p_contract_id", value);
    }
}
