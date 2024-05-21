package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_requesterData extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:requesterData";
	private java.lang.String requesterEmail;
	private java.lang.String requesterType;
	private java.lang.String requesterRole;
	private java.lang.String requesterDMEmail;
	public static String[][] FIELD_NAMES = new String[][] {{"requesterEmail", "requesterEmail"},{"requesterType", "requesterType"},{"requesterRole", "requesterRole"},{"requesterDMEmail", "requesterDMEmail"},{"requesterDMRole", "requesterDMRole"},
	};
	private java.lang.String requesterDMRole;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_requesterData() {
	}

	public java.lang.String getRequesterEmail()  {
		
		return requesterEmail;
	}

	public void setRequesterEmail(java.lang.String requesterEmail)  {
		this.requesterEmail = requesterEmail;
	}

	public java.lang.String getRequesterType()  {
		
		return requesterType;
	}

	public void setRequesterType(java.lang.String requesterType)  {
		this.requesterType = requesterType;
	}

	public java.lang.String getRequesterRole()  {
		
		return requesterRole;
	}

	public void setRequesterRole(java.lang.String requesterRole)  {
		this.requesterRole = requesterRole;
	}

	public java.lang.String getRequesterDMEmail()  {
		
		return requesterDMEmail;
	}

	public void setRequesterDMEmail(java.lang.String requesterDMEmail)  {
		this.requesterDMEmail = requesterDMEmail;
	}

	public java.lang.String getRequesterDMRole()  {
		
		return requesterDMRole;
	}

	public void setRequesterDMRole(java.lang.String requesterDMRole)  {
		this.requesterDMRole = requesterDMRole;
	}
	
	

}