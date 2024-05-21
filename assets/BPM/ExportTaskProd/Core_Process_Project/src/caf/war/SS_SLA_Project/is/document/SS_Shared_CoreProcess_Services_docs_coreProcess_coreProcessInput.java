package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessInput extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:coreProcessInput";
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_headerFields headerFields = null;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requestData requestData = null;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requesterData requesterData = null;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails[] approvalStepsDetails = null;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails[] historyApprovalStepsDetails = null;
	public static String[][] FIELD_NAMES = new String[][] {{"headerFields", "HeaderFields"},{"requestData", "RequestData"},{"requesterData", "RequesterData"},{"approvalStepsDetails", "ApprovalStepsDetails"},{"historyApprovalStepsDetails", "HistoryApprovalStepsDetails"},{"targetStepData", "TargetStepData"},
	};
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_targetStepData targetStepData = null;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessInput() {
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_headerFields getHeaderFields()  {
		if (headerFields == null) {
			headerFields = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_headerFields();
		}
		return headerFields;
	}

	public void setHeaderFields(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_headerFields headerFields)  {
		this.headerFields = headerFields;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requestData getRequestData()  {
		if (requestData == null) {
			requestData = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requestData();
		}
		return requestData;
	}

	public void setRequestData(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requestData requestData)  {
		this.requestData = requestData;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requesterData getRequesterData()  {
		if (requesterData == null) {
			requesterData = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requesterData();
		}
		return requesterData;
	}

	public void setRequesterData(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_requesterData requesterData)  {
		this.requesterData = requesterData;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails[] getApprovalStepsDetails()  {
		if (approvalStepsDetails == null) {
			//TODO: create/set default value here
		}
		return approvalStepsDetails;
	}

	public void setApprovalStepsDetails(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails[] approvalStepsDetails)  {
		this.approvalStepsDetails = approvalStepsDetails;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails[] getHistoryApprovalStepsDetails()  {
		if (historyApprovalStepsDetails == null) {
			//TODO: create/set default value here
		}
		return historyApprovalStepsDetails;
	}

	public void setHistoryApprovalStepsDetails(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails[] historyApprovalStepsDetails)  {
		this.historyApprovalStepsDetails = historyApprovalStepsDetails;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_targetStepData getTargetStepData()  {
		if (targetStepData == null) {
			targetStepData = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_targetStepData();
		}
		return targetStepData;
	}

	public void setTargetStepData(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_targetStepData targetStepData)  {
		this.targetStepData = targetStepData;
	}
	
	

}