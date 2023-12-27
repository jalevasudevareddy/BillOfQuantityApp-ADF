package model.searchview;

import java.sql.Date;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 28 11:17:56 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CurrencyConversionVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CurrencyConversionVOImpl() {
    }

    /**
     * Returns the bind variable value for p_from_currency.
     * @return bind variable value for p_from_currency
     */
    public String getp_from_currency() {
        return (String)getNamedWhereClauseParam("p_from_currency");
    }

    /**
     * Sets <code>value</code> for bind variable p_from_currency.
     * @param value value to bind as p_from_currency
     */
    public void setp_from_currency(String value) {
        setNamedWhereClauseParam("p_from_currency", value);
    }

    /**
     * Returns the bind variable value for p_to_currency.
     * @return bind variable value for p_to_currency
     */
    public String getp_to_currency() {
        return (String)getNamedWhereClauseParam("p_to_currency");
    }

    /**
     * Sets <code>value</code> for bind variable p_to_currency.
     * @param value value to bind as p_to_currency
     */
    public void setp_to_currency(String value) {
        setNamedWhereClauseParam("p_to_currency", value);
    }

    /**
     * Returns the bind variable value for p_conversion_date.
     * @return bind variable value for p_conversion_date
     */
    public Date getp_conversion_date() {
        return (Date)getNamedWhereClauseParam("p_conversion_date");
    }

    /**
     * Sets <code>value</code> for bind variable p_conversion_date.
     * @param value value to bind as p_conversion_date
     */
    public void setp_conversion_date(Date value) {
        setNamedWhereClauseParam("p_conversion_date", value);
    }

    /**
     * Returns the bind variable value for p_conversion_type.
     * @return bind variable value for p_conversion_type
     */
    public String getp_conversion_type() {
        return (String)getNamedWhereClauseParam("p_conversion_type");
    }

    /**
     * Sets <code>value</code> for bind variable p_conversion_type.
     * @param value value to bind as p_conversion_type
     */
    public void setp_conversion_type(String value) {
        setNamedWhereClauseParam("p_conversion_type", value);
    }
}