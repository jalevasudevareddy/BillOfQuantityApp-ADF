package model.applicationmodule.client;

import model.applicationmodule.common.CandyBillofQuantityAM;
import model.applicationmodule.common.CommonUtilsAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 13 16:45:44 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CandyBillofQuantityAMClient extends ApplicationModuleImpl implements CandyBillofQuantityAM {
    /**
     * This is the default constructor (do not remove).
     */
    public CandyBillofQuantityAMClient() {
    }


    public CommonUtilsAM getCommonUtilsAM() {
        return (CommonUtilsAM)findApplicationModule("CommonUtilsAM1");
    }


    public void editDocument() {
        Object _ret = this.riInvokeExportedMethod(this,"editDocument",null,null);
        return;
    }

    public byte[] interfaceBudget() {
        Object _ret =
            this.riInvokeExportedMethod(this,"interfaceBudget",null,null);
        return (byte[])_ret;
    }

    public byte[] runAndGetBoqAnalysisReportData() {
        Object _ret =
            this.riInvokeExportedMethod(this,"runAndGetBoqAnalysisReportData",null,null);
        return (byte[])_ret;
    }

    public String createBaseline() {
        Object _ret = this.riInvokeExportedMethod(this,"createBaseline",null,null);
        return (String)_ret;
    }

    public String createBudget() {
        Object _ret = this.riInvokeExportedMethod(this,"createBudget",null,null);
        return (String)_ret;
    }

    public byte[] getUploadedBoqData() {
        Object _ret =
            this.riInvokeExportedMethod(this,"getUploadedBoqData",null,null);
        return (byte[])_ret;
    }

    public String createBudgetLines() {
        Object _ret =
            this.riInvokeExportedMethod(this,"createBudgetLines",null,null);
        return (String)_ret;
    }

    public String createFinancialPlan() {
        Object _ret =
            this.riInvokeExportedMethod(this,"createFinancialPlan",null,null);
        return (String)_ret;
    }
}
