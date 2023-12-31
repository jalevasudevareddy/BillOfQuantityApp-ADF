package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 05 16:11:56 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobTempGroupRescPopulateVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public JobTempGroupRescPopulateVOImpl() {
    }

    /**
     * Returns the bind variable value for p_job_id.
     * @return bind variable value for p_job_id
     */
    public BigDecimal getp_job_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_job_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_job_id.
     * @param value value to bind as p_job_id
     */
    public void setp_job_id(BigDecimal value) {
        setNamedWhereClauseParam("p_job_id", value);
    }

    /**
     * Returns the variable value for p_select_flag.
     * @return variable value for p_select_flag
     */
    public String getp_select_flag() {
        return (String)ensureVariableManager().getVariableValue("p_select_flag");
    }

    /**
     * Sets <code>value</code> for variable p_select_flag.
     * @param value value to bind as p_select_flag
     */
    public void setp_select_flag(String value) {
        ensureVariableManager().setVariableValue("p_select_flag", value);
    }

    /**
     * Returns the variable value for p_item_id.
     * @return variable value for p_item_id
     */
    public BigDecimal getp_item_id() {
        return (BigDecimal)ensureVariableManager().getVariableValue("p_item_id");
    }

    /**
     * Sets <code>value</code> for variable p_item_id.
     * @param value value to bind as p_item_id
     */
    public void setp_item_id(BigDecimal value) {
        ensureVariableManager().setVariableValue("p_item_id", value);
    }
}
