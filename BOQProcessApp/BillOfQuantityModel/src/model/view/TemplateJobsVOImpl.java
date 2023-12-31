package model.view;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 12 11:20:36 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TemplateJobsVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public TemplateJobsVOImpl() {
    }

    /**
     * Returns the bind variable value for p_tem_id.
     * @return bind variable value for p_tem_id
     */
    public BigDecimal getp_tem_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_tem_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_tem_id.
     * @param value value to bind as p_tem_id
     */
    public void setp_tem_id(BigDecimal value) {
        setNamedWhereClauseParam("p_tem_id", value);
    }
}
