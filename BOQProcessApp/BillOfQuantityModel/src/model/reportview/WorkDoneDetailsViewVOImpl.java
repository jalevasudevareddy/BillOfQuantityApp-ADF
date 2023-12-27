package model.reportview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 08 16:14:59 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WorkDoneDetailsViewVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public WorkDoneDetailsViewVOImpl() {
    }

    /**
     * Returns the bind variable value for p_wd_hdr_id.
     * @return bind variable value for p_wd_hdr_id
     */
    public BigDecimal getp_wd_hdr_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_wd_hdr_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_wd_hdr_id.
     * @param value value to bind as p_wd_hdr_id
     */
    public void setp_wd_hdr_id(BigDecimal value) {
        setNamedWhereClauseParam("p_wd_hdr_id", value);
    }
}