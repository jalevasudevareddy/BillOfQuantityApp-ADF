package model.applicationmodule.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 13 16:45:44 IST 2017
// ---------------------------------------------------------------------
public interface CandyBillofQuantityAM extends ApplicationModule {
    void editDocument();


    byte[] interfaceBudget();

    byte[] runAndGetBoqAnalysisReportData();

    String createBaseline();

    String createBudget();

    byte[] getUploadedBoqData();

    String createBudgetLines();

    String createFinancialPlan();
}