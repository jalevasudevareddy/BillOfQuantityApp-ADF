package model.applicationmodule.client;

import java.math.BigDecimal;

import java.util.Map;

import model.applicationmodule.common.BOQUploadsAM;
import model.applicationmodule.common.BillingDetailsAM;

import model.applicationmodule.common.CommonUtilsAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;

import oracle.jbo.domain.Number;

import org.apache.myfaces.trinidad.model.UploadedFile;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 04 10:30:52 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BillingDetailsAMClient extends ApplicationModuleImpl
  implements BillingDetailsAM {
    /**
     * This is the default constructor (do not remove).
     */
    public BillingDetailsAMClient() {
    }


    public CommonUtilsAM getCommonUtilsAM() {
        return (CommonUtilsAM)findApplicationModule("CommonUtilsAM1");
    }


    public BOQUploadsAM getBOQUploadsAM() {
        return (BOQUploadsAM)findApplicationModule("BOQUploadsAM1");
    }


  public String CertifiedLinesDeleteAll()
  {
    Object _ret = this.riInvokeExportedMethod(this, "CertifiedLinesDeleteAll", null, null);
    return (String) _ret;
  }

  public String InvoicedLinesDeleteAll()
  {
    Object _ret = this.riInvokeExportedMethod(this, "InvoicedLinesDeleteAll", null, null);
    return (String) _ret;
  }

  public String ReviseCertifiedDoc()
  {
    Object _ret = this.riInvokeExportedMethod(this, "ReviseCertifiedDoc", null, null);
    return (String) _ret;
  }

  public String ReviseInvoicedDoc()
  {
    Object _ret = this.riInvokeExportedMethod(this, "ReviseInvoicedDoc", null, null);
    return (String) _ret;
  }

  public String ReviseWorkDoneDoc()
  {
    Object _ret = this.riInvokeExportedMethod(this, "ReviseWorkDoneDoc", null, null);
    return (String) _ret;
  }

  public String archivePrevCertDoc()
  {
    Object _ret = this.riInvokeExportedMethod(this, "archivePrevCertDoc", null, null);
    return (String) _ret;
  }

  public String archivePrevWDDoc()
  {
    Object _ret = this.riInvokeExportedMethod(this, "archivePrevWDDoc", null, null);
    return (String) _ret;
  }

  public String calcualteCertifiedValues()
  {
    Object _ret = this.riInvokeExportedMethod(this, "calcualteCertifiedValues", null, null);
    return (String) _ret;
  }

  public String calculateCertLineValues()
  {
    Object _ret = this.riInvokeExportedMethod(this, "calculateCertLineValues", null, null);
    return (String) _ret;
  }

  public String calculateInvoiceAmounts()
  {
    Object _ret = this.riInvokeExportedMethod(this, "calculateInvoiceAmounts", null, null);
    return (String) _ret;
  }

  public String calculateInvoiceLineValues()
  {
    Object _ret = this.riInvokeExportedMethod(this, "calculateInvoiceLineValues", null, null);
    return (String) _ret;
  }

  public String calculateWorkdoneLineValues()
  {
    Object _ret = this.riInvokeExportedMethod(this, "calculateWorkdoneLineValues", null, null);
    return (String) _ret;
  }

  public String callpkgForAMECertBOQDocSubmit()
  {
    Object _ret = this.riInvokeExportedMethod(this, "callpkgForAMECertBOQDocSubmit", null, null);
    return (String) _ret;
  }

  public String callpkgForAMEProcessSubmit()
  {
    Object _ret = this.riInvokeExportedMethod(this, "callpkgForAMEProcessSubmit", null, null);
    return (String) _ret;
  }

  public String callpkgForAMEProcessSubmit1()
  {
    Object _ret = this.riInvokeExportedMethod(this, "callpkgForAMEProcessSubmit1", null, null);
    return (String) _ret;
  }

  public String callpkgForAMEProcessSubmit2()
  {
    Object _ret = this.riInvokeExportedMethod(this, "callpkgForAMEProcessSubmit2", null, null);
    return (String) _ret;
  }

  public String cancelCertDocRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelCertDocRow", null, null);
    return (String) _ret;
  }

  public void cancelCertifiedDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelCertifiedDocument", null, null);
    return;
  }

  public String cancelCertifiedRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelCertifiedRow", null, null);
    return (String) _ret;
  }

  public String cancelInvoiceRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelInvoiceRow", null, null);
    return (String) _ret;
  }

  public void cancelInvoicedDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelInvoicedDocument", null, null);
    return;
  }

  public void cancelMatDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelMatDocument", null, null);
    return;
  }

  public void cancelProgDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelProgDocument", null, null);
    return;
  }

  public void cancelWDDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelWDDocument", null, null);
    return;
  }

  public String cancelWRKDoneRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "cancelWRKDoneRow", null, null);
    return (String) _ret;
  }

  public String createCertifiedDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createCertifiedDocument", null, null);
    return (String) _ret;
  }

  public void createCertifiedHeaderRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createCertifiedHeaderRow", null, null);
    return;
  }

  public void createInvoicedHeaderRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createInvoicedHeaderRow", null, null);
    return;
  }

  public void createMatHeaderRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createMatHeaderRow", null, null);
    return;
  }

  public void createProgHeaderRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createProgHeaderRow", null, null);
    return;
  }

  public String createWDDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createWDDocument", null, null);
    return (String) _ret;
  }

  public void createWDHeaderRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "createWDHeaderRow", null, null);
    return;
  }

  public String deleteCertDocRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "deleteCertDocRow", null, null);
    return (String) _ret;
  }

  public String deleteCertifiedRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "deleteCertifiedRow", null, null);
    return (String) _ret;
  }

  public String deleteInvoiceRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "deleteInvoiceRow", null, null);
    return (String) _ret;
  }

  public String deleteWRKDoneRow()
  {
    Object _ret = this.riInvokeExportedMethod(this, "deleteWRKDoneRow", null, null);
    return (String) _ret;
  }

  public String deleteWdLineWithDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "deleteWdLineWithDetails", null, null);
    return (String) _ret;
  }

  public byte[] downloadCertifiedDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "downloadCertifiedDetails", null, null);
    return (byte[]) _ret;
  }

  public byte[] downloadInvoicedDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "downloadInvoicedDetails", null, null);
    return (byte[]) _ret;
  }

  public byte[] downloadWorkDoneDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "downloadWorkDoneDetails", null, null);
    return (byte[]) _ret;
  }

  public void editCertifiedDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "editCertifiedDocument", null, null);
    return;
  }

  public void editInvoicedDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "editInvoicedDocument", null, null);
    return;
  }

  public void editMatDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "editMatDocument", null, null);
    return;
  }

  public void editWDDocument()
  {
    Object _ret = this.riInvokeExportedMethod(this, "editWDDocument", null, null);
    return;
  }

  public void executeCertifiedLinesQuery()
  {
    Object _ret = this.riInvokeExportedMethod(this, "executeCertifiedLinesQuery", null, null);
    return;
  }

  public void executeInvoicedLinesQuery()
  {
    Object _ret = this.riInvokeExportedMethod(this, "executeInvoicedLinesQuery", null, null);
    return;
  }

  public void executePopulateCertifiedLinesVO()
  {
    Object _ret = this.riInvokeExportedMethod(this, "executePopulateCertifiedLinesVO", null, null);
    return;
  }

  public void executePopulateInvoicedLinesVO()
  {
    Object _ret = this.riInvokeExportedMethod(this, "executePopulateInvoicedLinesVO", null, null);
    return;
  }

  public String executePopulateLinesVO()
  {
    Object _ret = this.riInvokeExportedMethod(this, "executePopulateLinesVO", null, null);
    return (String) _ret;
  }

  public void executeWdLinesQuery()
  {
    Object _ret = this.riInvokeExportedMethod(this, "executeWdLinesQuery", null, null);
    return;
  }

  public byte[] getPADetailsReport()
  {
    Object _ret = this.riInvokeExportedMethod(this, "getPADetailsReport", null, null);
    return (byte[]) _ret;
  }

  public byte[] getPAPrintReport()
  {
    Object _ret = this.riInvokeExportedMethod(this, "getPAPrintReport", null, null);
    return (byte[]) _ret;
  }

  public String makeAsCurrentCertDoc(BigDecimal docId)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "makeAsCurrentCertDoc", new String[] { "java.math.BigDecimal" },
                                  new Object[] { docId });
    return (String) _ret;
  }

  public Boolean makeAsCurrentInvoiceHdrRow(BigDecimal invHeaderId)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "makeAsCurrentInvoiceHdrRow", new String[] { "java.math.BigDecimal" },
                                  new Object[] { invHeaderId });
    return (Boolean) _ret;
  }

  public String makeAsCurrentWDdoc(BigDecimal docId)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "makeAsCurrentWDdoc", new String[] { "java.math.BigDecimal" },
                                  new Object[] { docId });
    return (String) _ret;
  }

  public void markAllCertLinesAs(Boolean markAs)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "markAllCertLinesAs", new String[] { "java.lang.Boolean" },
                                  new Object[] { markAs });
    return;
  }

  public void markAllInvLinesAs(Boolean markAs)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "markAllInvLinesAs", new String[] { "java.lang.Boolean" },
                                  new Object[] { markAs });
    return;
  }

  public void markAllWdLinesAs(Boolean markAs)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "markAllWdLinesAs", new String[] { "java.lang.Boolean" },
                                  new Object[] { markAs });
    return;
  }

  public String populateCertifiedLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "populateCertifiedLines", null, null);
    return (String) _ret;
  }

  public String refreshCertHdrVOAttrs(Map attributesMap)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "refreshCertHdrVOAttrs", new String[] { "java.util.Map" },
                                  new Object[] { attributesMap });
    return (String) _ret;
  }

  public String refreshInvoiceHeader()
  {
    Object _ret = this.riInvokeExportedMethod(this, "refreshInvoiceHeader", null, null);
    return (String) _ret;
  }

  public void refreshMaterialAtSiteLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "refreshMaterialAtSiteLines", null, null);
    return;
  }

  public void refreshProgressDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "refreshProgressDetails", null, null);
    return;
  }

  public String refreshWDHdrVOAttrs(Map attributesMap)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "refreshWDHdrVOAttrs", new String[] { "java.util.Map" },
                                  new Object[] { attributesMap });
    return (String) _ret;
  }

  public String refreshWDLineAttrs(Map attributesMap)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "refreshWDLineAttrs", new String[] { "java.util.Map" },
                                  new Object[] { attributesMap });
    return (String) _ret;
  }

  public String reviseMaterialSiteDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "reviseMaterialSiteDetails", null, null);
    return (String) _ret;
  }

  public String saveAttachedFile(UploadedFile attachedFile)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "saveAttachedFile",
                                  new String[] { "org.apache.myfaces.trinidad.model.UploadedFile" },
                                  new Object[] { attachedFile });
    return (String) _ret;
  }

  public String saveAttachedFileCertification(UploadedFile attachedFile)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "saveAttachedFileCertification",
                                  new String[] { "org.apache.myfaces.trinidad.model.UploadedFile" },
                                  new Object[] { attachedFile });
    return (String) _ret;
  }

  public String saveAttachedFileInvoice(UploadedFile attachedFile)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "saveAttachedFileInvoice",
                                  new String[] { "org.apache.myfaces.trinidad.model.UploadedFile" },
                                  new Object[] { attachedFile });
    return (String) _ret;
  }

  public void submitCertifiedDocFor(String toDocStatus)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "submitCertifiedDocFor", new String[] { "java.lang.String" },
                                  new Object[] { toDocStatus });
    return;
  }

  public String submitCertifiedRequestToAME()
  {
    Object _ret = this.riInvokeExportedMethod(this, "submitCertifiedRequestToAME", null, null);
    return (String) _ret;
  }

  public void submitDocFor(String toDocStatus)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "submitDocFor", new String[] { "java.lang.String" },
                                  new Object[] { toDocStatus });
    return;
  }

  public String submitInvoiceRequestToAME()
  {
    Object _ret = this.riInvokeExportedMethod(this, "submitInvoiceRequestToAME", null, null);
    return (String) _ret;
  }

  public void submitInvoicedDocFor(String toDocStatus)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "submitInvoicedDocFor", new String[] { "java.lang.String" },
                                  new Object[] { toDocStatus });
    return;
  }

  public String submitMaterialAtSite()
  {
    Object _ret = this.riInvokeExportedMethod(this, "submitMaterialAtSite", null, null);
    return (String) _ret;
  }

  public void updateBoqQuantities(String from)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "updateBoqQuantities", new String[] { "java.lang.String" },
                                  new Object[] { from });
    return;
  }

  public String uploadCertifiedXLFile(UploadedFile uploadedFile)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "uploadCertifiedXLFile",
                                  new String[] { "org.apache.myfaces.trinidad.model.UploadedFile" },
                                  new Object[] { uploadedFile });
    return (String) _ret;
  }

  public String uploadInvoicedXLFile(UploadedFile uploadedFile)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "uploadInvoicedXLFile",
                                  new String[] { "org.apache.myfaces.trinidad.model.UploadedFile" },
                                  new Object[] { uploadedFile });
    return (String) _ret;
  }

  public String uploadWDXLFile(UploadedFile uploadedFile)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "uploadWDXLFile",
                                  new String[] { "org.apache.myfaces.trinidad.model.UploadedFile" },
                                  new Object[] { uploadedFile });
    return (String) _ret;
  }

  public String validateCertLineActPercentage()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertLineActPercentage", null, null);
    return (String) _ret;
  }

  public String validateCertLineActQty()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertLineActQty", null, null);
    return (String) _ret;
  }

  public String validateCertLinePercentage()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertLinePercentage", null, null);
    return (String) _ret;
  }

  public String validateCertLineQuantities()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertLineQuantities", null, null);
    return (String) _ret;
  }

  public String validateCertLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertLines", null, null);
    return (String) _ret;
  }

  public String validateCertifiedHdr()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertifiedHdr", null, null);
    return (String) _ret;
  }

  public String validateCertifiedLineQuantities()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertifiedLineQuantities", null, null);
    return (String) _ret;
  }

  public String validateCertifiedLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertifiedLines", null, null);
    return (String) _ret;
  }

  public String validateCertifiedUploadDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateCertifiedUploadDetails", null, null);
    return (String) _ret;
  }

  public String validateInvLineActPercentage()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvLineActPercentage", null, null);
    return (String) _ret;
  }

  public String validateInvLineActQty()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvLineActQty", null, null);
    return (String) _ret;
  }

  public String validateInvoiceLinePercentage()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvoiceLinePercentage", null, null);
    return (String) _ret;
  }

  public String validateInvoiceLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvoiceLines", null, null);
    return (String) _ret;
  }

  public String validateInvoicedHdr()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvoicedHdr", null, null);
    return (String) _ret;
  }

  public String validateInvoicedLineQuantities()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvoicedLineQuantities", null, null);
    return (String) _ret;
  }

  public String validateInvoicedLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvoicedLines", null, null);
    return (String) _ret;
  }

  public String validateInvoicedUploadDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateInvoicedUploadDetails", null, null);
    return (String) _ret;
  }

  public String validateLineQuantities()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateLineQuantities", null, null);
    return (String) _ret;
  }

  public String validateMaterialHdr()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateMaterialHdr", null, null);
    return (String) _ret;
  }

  public String validateProgressDetailsHdr()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateProgressDetailsHdr", null, null);
    return (String) _ret;
  }

  public String validateWDLineActQty()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDLineActQty", null, null);
    return (String) _ret;
  }

  public String validateWDLineActQtyPercnt()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDLineActQtyPercnt", null, null);
    return (String) _ret;
  }

  public String validateWDLineCumltAmt()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDLineCumltAmt", null, null);
    return (String) _ret;
  }

  public String validateWDLineCumltQty()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDLineCumltQty", null, null);
    return (String) _ret;
  }

  public String validateWDLineCumltQtyPercnt()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDLineCumltQtyPercnt", null, null);
    return (String) _ret;
  }

  public String validateWDLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDLines", null, null);
    return (String) _ret;
  }

  public String validateWDUploadDetails()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWDUploadDetails", null, null);
    return (String) _ret;
  }

  public String validateWorkDoneHdr()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWorkDoneHdr", null, null);
    return (String) _ret;
  }

  public String validateWorkdoneLines()
  {
    Object _ret = this.riInvokeExportedMethod(this, "validateWorkdoneLines", null, null);
    return (String) _ret;
  }

  public String withdrawCertDocFromApproval(String remarks)
  {
    Object _ret =
      this.riInvokeExportedMethod(this, "withdrawCertDocFromApproval", new String[] { "java.lang.String" },
                                  new Object[] { remarks });
    return (String) _ret;
  }

  public String workDoneLinesDeleteAll()
  {
    Object _ret = this.riInvokeExportedMethod(this, "workDoneLinesDeleteAll", null, null);
    return (String) _ret;
  }
}
