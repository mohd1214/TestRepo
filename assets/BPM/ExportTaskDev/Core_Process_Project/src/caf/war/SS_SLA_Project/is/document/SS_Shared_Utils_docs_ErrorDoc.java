package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_Utils_docs_ErrorDoc extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_Utils.docs:ErrorDoc";
	private java.lang.String status;
	private java.lang.String errorCode;
	public static String[][] FIELD_NAMES = new String[][] {{"status", "status"},{"errorCode", "errorCode"},{"errorMessage", "errorMessage"},
	};
	private java.lang.String errorMessage;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_Utils_docs_ErrorDoc() {
	}

	public java.lang.String getStatus()  {
		
		return status;
	}

	public void setStatus(java.lang.String status)  {
		this.status = status;
	}

	public java.lang.String getErrorCode()  {
		
		return errorCode;
	}

	public void setErrorCode(java.lang.String errorCode)  {
		this.errorCode = errorCode;
	}

	public java.lang.String getErrorMessage()  {
		
		return errorMessage;
	}

	public void setErrorMessage(java.lang.String errorMessage)  {
		this.errorMessage = errorMessage;
	}
	
	

}