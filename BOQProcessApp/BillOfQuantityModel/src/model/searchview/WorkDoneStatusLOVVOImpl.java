package model.searchview;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 29 15:30:42 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WorkDoneStatusLOVVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public WorkDoneStatusLOVVOImpl() {
    }

    /**
     * Returns the variable value for p_wd_document_num.
     * @return variable value for p_wd_document_num
     */
    public String getp_wd_document_num() {
        return (String)ensureVariableManager().getVariableValue("p_wd_document_num");
    }

    /**
     * Sets <code>value</code> for variable p_wd_document_num.
     * @param value value to bind as p_wd_document_num
     */
    public void setp_wd_document_num(String value) {
        ensureVariableManager().setVariableValue("p_wd_document_num", value);
    }
}
