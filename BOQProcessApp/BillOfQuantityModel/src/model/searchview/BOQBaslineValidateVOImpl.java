package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 22 13:08:48 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BOQBaslineValidateVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public BOQBaslineValidateVOImpl() {
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
