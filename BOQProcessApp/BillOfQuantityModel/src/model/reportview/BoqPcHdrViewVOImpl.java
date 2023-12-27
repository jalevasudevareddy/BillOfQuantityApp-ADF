package model.reportview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 10 18:28:51 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BoqPcHdrViewVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public BoqPcHdrViewVOImpl() {
    }

    /**
     * Returns the bind variable value for p_prj_id.
     * @return bind variable value for p_prj_id
     */
    public BigDecimal getp_prj_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_prj_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_prj_id.
     * @param value value to bind as p_prj_id
     */
    public void setp_prj_id(BigDecimal value) {
        setNamedWhereClauseParam("p_prj_id", value);
    }
}