package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 30 17:48:46 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobItemAnalysisSearchWithCodeVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public JobItemAnalysisSearchWithCodeVOImpl() {
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
     * Returns the bind variable value for p_act_code.
     * @return bind variable value for p_act_code
     */
    public String getp_act_code() {
        return (String)getNamedWhereClauseParam("p_act_code");
    }

    /**
     * Sets <code>value</code> for bind variable p_act_code.
     * @param value value to bind as p_act_code
     */
    public void setp_act_code(String value) {
        setNamedWhereClauseParam("p_act_code", value);
    }

    /**
     * Returns the bind variable value for p_prj_num.
     * @return bind variable value for p_prj_num
     */
    public String getp_prj_num() {
        return (String)getNamedWhereClauseParam("p_prj_num");
    }

    /**
     * Sets <code>value</code> for bind variable p_prj_num.
     * @param value value to bind as p_prj_num
     */
    public void setp_prj_num(String value) {
        setNamedWhereClauseParam("p_prj_num", value);
    }
}
