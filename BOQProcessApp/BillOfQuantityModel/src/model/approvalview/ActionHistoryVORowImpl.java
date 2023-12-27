package model.approvalview;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 04 17:01:26 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ActionHistoryVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ActionCode,
        ActionDate,
        PerformerId,
        DocumentId,
        ApprovalGroupId,
        ApprovalGroupLevel,
        SequenceNumber,
        ApproverLevel,
        Remarks,
        DocumentTypeId,
        DocumentType,
        PerformerName;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return ActionHistoryVORowImpl.AttributesEnum.firstIndex() +
                ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return ActionHistoryVORowImpl.AttributesEnum.firstIndex() +
                ActionHistoryVORowImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = ActionHistoryVORowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ACTIONCODE = AttributesEnum.ActionCode.index();
    public static final int ACTIONDATE = AttributesEnum.ActionDate.index();
    public static final int PERFORMERID = AttributesEnum.PerformerId.index();
    public static final int DOCUMENTID = AttributesEnum.DocumentId.index();
    public static final int APPROVALGROUPID =
        AttributesEnum.ApprovalGroupId.index();
    public static final int APPROVALGROUPLEVEL =
        AttributesEnum.ApprovalGroupLevel.index();
    public static final int SEQUENCENUMBER =
        AttributesEnum.SequenceNumber.index();
    public static final int APPROVERLEVEL =
        AttributesEnum.ApproverLevel.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int DOCUMENTTYPEID =
        AttributesEnum.DocumentTypeId.index();
    public static final int DOCUMENTTYPE = AttributesEnum.DocumentType.index();
    public static final int PERFORMERNAME =
        AttributesEnum.PerformerName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ActionHistoryVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute ActionCode.
     * @return the ActionCode
     */
    public String getActionCode() {
        return (String)getAttributeInternal(ACTIONCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActionCode.
     * @param value value to set the  ActionCode
     */
    public void setActionCode(String value) {
        setAttributeInternal(ACTIONCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActionDate.
     * @return the ActionDate
     */
    public String getActionDate() {
        return (String)getAttributeInternal(ACTIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActionDate.
     * @param value value to set the  ActionDate
     */
    public void setActionDate(String value) {
        setAttributeInternal(ACTIONDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PerformerId.
     * @return the PerformerId
     */
    public Number getPerformerId() {
        return (Number)getAttributeInternal(PERFORMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PerformerId.
     * @param value value to set the  PerformerId
     */
    public void setPerformerId(Number value) {
        setAttributeInternal(PERFORMERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocumentId.
     * @return the DocumentId
     */
    public Number getDocumentId() {
        return (Number)getAttributeInternal(DOCUMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocumentId.
     * @param value value to set the  DocumentId
     */
    public void setDocumentId(Number value) {
        setAttributeInternal(DOCUMENTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ApprovalGroupId.
     * @return the ApprovalGroupId
     */
    public Number getApprovalGroupId() {
        return (Number)getAttributeInternal(APPROVALGROUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ApprovalGroupId.
     * @param value value to set the  ApprovalGroupId
     */
    public void setApprovalGroupId(Number value) {
        setAttributeInternal(APPROVALGROUPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ApprovalGroupLevel.
     * @return the ApprovalGroupLevel
     */
    public Number getApprovalGroupLevel() {
        return (Number)getAttributeInternal(APPROVALGROUPLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ApprovalGroupLevel.
     * @param value value to set the  ApprovalGroupLevel
     */
    public void setApprovalGroupLevel(Number value) {
        setAttributeInternal(APPROVALGROUPLEVEL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SequenceNumber.
     * @return the SequenceNumber
     */
    public Number getSequenceNumber() {
        return (Number)getAttributeInternal(SEQUENCENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SequenceNumber.
     * @param value value to set the  SequenceNumber
     */
    public void setSequenceNumber(Number value) {
        setAttributeInternal(SEQUENCENUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ApproverLevel.
     * @return the ApproverLevel
     */
    public Number getApproverLevel() {
        return (Number)getAttributeInternal(APPROVERLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ApproverLevel.
     * @param value value to set the  ApproverLevel
     */
    public void setApproverLevel(Number value) {
        setAttributeInternal(APPROVERLEVEL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Remarks.
     * @param value value to set the  Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocumentTypeId.
     * @return the DocumentTypeId
     */
    public Number getDocumentTypeId() {
        return (Number)getAttributeInternal(DOCUMENTTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocumentTypeId.
     * @param value value to set the  DocumentTypeId
     */
    public void setDocumentTypeId(Number value) {
        setAttributeInternal(DOCUMENTTYPEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocumentType.
     * @return the DocumentType
     */
    public String getDocumentType() {
        return (String)getAttributeInternal(DOCUMENTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocumentType.
     * @param value value to set the  DocumentType
     */
    public void setDocumentType(String value) {
        setAttributeInternal(DOCUMENTTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PerformerName.
     * @return the PerformerName
     */
    public String getPerformerName() {
        return (String)getAttributeInternal(PERFORMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PerformerName.
     * @param value value to set the  PerformerName
     */
    public void setPerformerName(String value) {
        setAttributeInternal(PERFORMERNAME, value);
    }


}