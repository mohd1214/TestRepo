package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_headerFields extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:headerFields";
	private java.lang.String requestNumber;
	private java.lang.String parentProcessInstanceId;
	private java.lang.String processInstanceId;
	private java.lang.String parentProcessName;
	private java.lang.String processName;
	private java.lang.String serviceCode;
	private java.lang.String subsidiary;
	private java.lang.String wfId;
	private java.lang.String inboxItemId;
	private java.lang.String addRequester;
	private java.lang.String numberOfResubmits;
	public static String[][] FIELD_NAMES = new String[][] {{"requestNumber", "requestNumber"},{"parentProcessInstanceId", "parentProcessInstanceId"},{"processInstanceId", "processInstanceId"},{"parentProcessName", "parentProcessName"},{"processName", "processName"},{"serviceCode", "serviceCode"},{"subsidiary", "subsidiary"},{"wfId", "wfId"},{"inboxItemId", "inboxItemId"},{"addRequester", "addRequester"},{"numberOfResubmits", "numberOfResubmits"},{"globalTransactionId", "globalTransactionId"},
	};
	private java.lang.String globalTransactionId;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_headerFields() {
	}

	public java.lang.String getRequestNumber()  {
		
		return requestNumber;
	}

	public void setRequestNumber(java.lang.String requestNumber)  {
		this.requestNumber = requestNumber;
	}

	public java.lang.String getParentProcessInstanceId()  {
		
		return parentProcessInstanceId;
	}

	public void setParentProcessInstanceId(java.lang.String parentProcessInstanceId)  {
		this.parentProcessInstanceId = parentProcessInstanceId;
	}

	public java.lang.String getProcessInstanceId()  {
		
		return processInstanceId;
	}

	public void setProcessInstanceId(java.lang.String processInstanceId)  {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.String getParentProcessName()  {
		
		return parentProcessName;
	}

	public void setParentProcessName(java.lang.String parentProcessName)  {
		this.parentProcessName = parentProcessName;
	}

	public java.lang.String getProcessName()  {
		
		return processName;
	}

	public void setProcessName(java.lang.String processName)  {
		this.processName = processName;
	}

	public java.lang.String getServiceCode()  {
		
		return serviceCode;
	}

	public void setServiceCode(java.lang.String serviceCode)  {
		this.serviceCode = serviceCode;
	}

	public java.lang.String getSubsidiary()  {
		
		return subsidiary;
	}

	public void setSubsidiary(java.lang.String subsidiary)  {
		this.subsidiary = subsidiary;
	}

	public java.lang.String getWfId()  {
		
		return wfId;
	}

	public void setWfId(java.lang.String wfId)  {
		this.wfId = wfId;
	}

	public java.lang.String getInboxItemId()  {
		
		return inboxItemId;
	}

	public void setInboxItemId(java.lang.String inboxItemId)  {
		this.inboxItemId = inboxItemId;
	}

	public java.lang.String getAddRequester()  {
		
		return addRequester;
	}

	public void setAddRequester(java.lang.String addRequester)  {
		this.addRequester = addRequester;
	}

	public java.lang.String getNumberOfResubmits()  {
		
		return numberOfResubmits;
	}

	public void setNumberOfResubmits(java.lang.String numberOfResubmits)  {
		this.numberOfResubmits = numberOfResubmits;
	}

	public java.lang.String getGlobalTransactionId()  {
		
		return globalTransactionId;
	}

	public void setGlobalTransactionId(java.lang.String globalTransactionId)  {
		this.globalTransactionId = globalTransactionId;
	}
	
	

}