package model.applicationmodule.common;

import java.math.BigDecimal;

import java.util.Map;

import oracle.jbo.ApplicationModule;

import oracle.jbo.domain.Number;

import org.apache.myfaces.trinidad.model.UploadedFile;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 04 10:30:52 IST 2017
// ---------------------------------------------------------------------
public interface BillingDetailsAM extends ApplicationModule
{
    void editWDDocument();

    void createWDHeaderRow();


    void cancelWDDocument();


    void executeWdLinesQuery();


    String validateWorkDoneHdr();


    String ReviseWorkDoneDoc();

    String validateLineQuantities();

    String validateWDLines();

    void editMatDocument();

    void createMatHeaderRow();

    void cancelMatDocument();

    void refreshMaterialAtSiteLines();

    String submitMaterialAtSite();

    String validateMaterialHdr();

    String reviseMaterialSiteDetails();

    void createProgHeaderRow();

    void cancelProgDocument();

    void refreshProgressDetails();

    String validateProgressDetailsHdr();

    String validateInvoicedLines();

    String validateInvoicedLineQuantities();

    String validateInvoicedHdr();

    String validateCertifiedLines();

    String validateCertifiedLineQuantities();

    String validateCertifiedHdr();


    void submitInvoicedDocFor(String toDocStatus);

    void submitDocFor(String toDocStatus);

    void submitCertifiedDocFor(String toDocStatus);


    void executePopulateInvoicedLinesVO();

    void executePopulateCertifiedLinesVO();

    void executeInvoicedLinesQuery();

    void executeCertifiedLinesQuery();

    void editInvoicedDocument();

    void editCertifiedDocument();

    void createInvoicedHeaderRow();


    void createCertifiedHeaderRow();


    void cancelInvoicedDocument();

    void cancelCertifiedDocument();


    String ReviseInvoicedDoc();

    String ReviseCertifiedDoc();

    byte[] downloadWorkDoneDetails();

    String uploadWDXLFile(UploadedFile uploadedFile);

    String validateWDUploadDetails();

    void updateBoqQuantities(String from);

    String validateInvoicedUploadDetails();

    String validateCertifiedUploadDetails();

    String uploadInvoicedXLFile(UploadedFile uploadedFile);

    String uploadCertifiedXLFile(UploadedFile uploadedFile);

    byte[] downloadInvoicedDetails();

    byte[] downloadCertifiedDetails();

    void markAllWdLinesAs(Boolean markAs);

    String deleteWRKDoneRow();

    String cancelWRKDoneRow();

    void markAllInvLinesAs(Boolean markAs);

    void markAllCertLinesAs(Boolean markAs);

    String deleteInvoiceRow();

    String deleteCertifiedRow();

    String cancelInvoiceRow();

    String cancelCertifiedRow();

    String createWDDocument();

    String executePopulateLinesVO();

    String createCertifiedDocument();

    String deleteCertDocRow();

    String cancelCertDocRow();

    String populateCertifiedLines();

    String validateCertLines();

    String archivePrevWDDoc();

    String archivePrevCertDoc();

    String callpkgForAMEProcessSubmit();


    String withdrawCertDocFromApproval(String remarks);

    String callpkgForAMECertBOQDocSubmit();


    String submitInvoiceRequestToAME();

    String submitCertifiedRequestToAME();

    String refreshWDHdrVOAttrs(Map attributesMap);

    String refreshCertHdrVOAttrs(Map attributesMap);

    String callpkgForAMEProcessSubmit2();

    String callpkgForAMEProcessSubmit1();

    String makeAsCurrentWDdoc(BigDecimal docId);

    String makeAsCurrentCertDoc(BigDecimal docId);

    String refreshWDLineAttrs(Map attributesMap);

    String validateWDLineCumltQty();

    String validateWDLineActQty();

    String validateWDLineCumltQtyPercnt();

    String validateWDLineActQtyPercnt();

    String validateInvoiceLines();

    String validateInvoiceLinePercentage();

    String validateInvLineActQty();

    String validateInvLineActPercentage();

    String calculateInvoiceLineValues();

    String validateWorkdoneLines();

    String calculateWorkdoneLineValues();

    String validateCertLineQuantities();

    String validateCertLinePercentage();

    String validateCertLineActQty();

    String validateCertLineActPercentage();

    String calculateCertLineValues();

    String validateWDLineCumltAmt();

    String saveAttachedFile(UploadedFile attachedFile);

    String workDoneLinesDeleteAll();

    String saveAttachedFileInvoice(UploadedFile attachedFile);

    String saveAttachedFileCertification(UploadedFile attachedFile);

    String InvoicedLinesDeleteAll();

    String CertifiedLinesDeleteAll();

    byte[] getPAPrintReport();

    String calculateInvoiceAmounts();

    String refreshInvoiceHeader();

    String calcualteCertifiedValues();

    Boolean makeAsCurrentInvoiceHdrRow(BigDecimal invHeaderId);

    byte[] getPADetailsReport();

  String deleteWdLineWithDetails();
}