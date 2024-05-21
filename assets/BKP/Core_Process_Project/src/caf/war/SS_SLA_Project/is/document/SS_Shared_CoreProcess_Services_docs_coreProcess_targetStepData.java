package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_targetStepData extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:targetStepData";
	private java.lang.String targetStepName;
	public static String[][] FIELD_NAMES = new String[][] {{"targetStepName", "targetStepName"},{"targetOwnerEmail", "targetOwnerEmail"},
	};
	private java.lang.String targetOwnerEmail;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_targetStepData() {
	}

	public java.lang.String getTargetStepName()  {
		
		return targetStepName;
	}

	public void setTargetStepName(java.lang.String targetStepName)  {
		this.targetStepName = targetStepName;
	}

	public java.lang.String getTargetOwnerEmail()  {
		
		return targetOwnerEmail;
	}

	public void setTargetOwnerEmail(java.lang.String targetOwnerEmail)  {
		this.targetOwnerEmail = targetOwnerEmail;
	}
	
	

}