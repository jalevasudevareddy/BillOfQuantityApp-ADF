package model.searchview;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 23 18:50:48 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PCLinesScrVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PCLinesScrVOImpl() {
    }

    /**
     * Returns the bind variable value for p_pc_hdr_id.
     * @return bind variable value for p_pc_hdr_id
     */
    public BigDecimal getp_pc_hdr_id() {
        return (BigDecimal)getNamedWhereClauseParam("p_pc_hdr_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_pc_hdr_id.
     * @param value value to bind as p_pc_hdr_id
     */
    public void setp_pc_hdr_id(BigDecimal value) {
        setNamedWhereClauseParam("p_pc_hdr_id", value);
    }
}
