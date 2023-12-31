package model.applicationmodule.common;

import java.util.Map;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 29 14:31:43 IST 2016
// ---------------------------------------------------------------------
public interface BOQSetupAM extends ApplicationModule {
    void CreateActivityLine();

    void editDocument();

    void createResourceMasterGroupRow();

    void createDocument();

    void cancelDocument();

    void createSubGroupLine();

    void setExpenditureCategoryValue();

    void createItemLine();

    void setExpenditureTypeValue();

    void createTransBuLine();

    void createAccountsSetupRow();

    void crateTransAccountsRow();


    String validateBillCategory();

    String createGLAccountCombination();

    String validateAccountingRow();

    String refreshBOQAccntSetupRow(Map attributesMap);
}
