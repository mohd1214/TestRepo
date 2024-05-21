package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessCanonicalDoc extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:coreProcessCanonicalDoc";

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://localhost:5555";
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessInput coreProcessInput = null;
	public static String[][] FIELD_NAMES = new String[][] {{"coreProcessInput", "coreProcessInput"},{"processData", "processData"},
	};
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData processData = null;

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessCanonicalDoc() {
	}


	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessInput getCoreProcessInput()  {
		if (coreProcessInput == null) {
			coreProcessInput = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessInput();
		}
		return coreProcessInput;
	}


	public void setCoreProcessInput(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessInput coreProcessInput)  {
		this.coreProcessInput = coreProcessInput;
	}


	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData getProcessData()  {
		if (processData == null) {
			processData = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData();
		}
		return processData;
	}


	public void setProcessData(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData processData)  {
		this.processData = processData;
	}
	
	

}