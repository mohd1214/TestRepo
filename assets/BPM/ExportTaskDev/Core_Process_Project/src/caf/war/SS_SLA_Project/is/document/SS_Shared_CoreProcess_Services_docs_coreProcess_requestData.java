package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_requestData extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:requestData";
	public static String[][] FIELD_NAMES = new String[][] {{"requestJSON", "requestJSON"},
	};
	private java.lang.String requestJSON;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_requestData() {
	}

	public java.lang.String getRequestJSON()  {
		
		return requestJSON;
	}

	public void setRequestJSON(java.lang.String requestJSON)  {
		this.requestJSON = requestJSON;
	}
	
	

}