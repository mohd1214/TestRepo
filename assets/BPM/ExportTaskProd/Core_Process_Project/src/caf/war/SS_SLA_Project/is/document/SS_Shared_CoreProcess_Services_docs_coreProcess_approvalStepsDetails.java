package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:approvalStepsDetails";
	private java.lang.String ownerEmail;
	private java.lang.String actorEmail;
	private java.lang.String action;
	private java.lang.String stepName;
	private java.lang.String taskId;
	private java.lang.String requestStepId;
	private java.lang.String wfSteps;
	private java.lang.String wfId;
	private java.lang.String sla;
	private java.lang.String sla_checkpoint;
	private java.util.Date sla_date;
	public static String[][] FIELD_NAMES = new String[][] {{"ownerEmail", "ownerEmail"},{"actorEmail", "actorEmail"},{"action", "action"},{"stepName", "stepName"},{"taskId", "taskId"},{"requestStepId", "requestStepId"},{"wfSteps", "wfSteps"},{"wfId", "wfId"},{"sla", "SLA"},{"sla_checkpoint", "SLA_checkpoint"},{"sla_date", "SLA_date"},{"stepFields", "stepFields"},
	};
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails.StepFields stepFields = null;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails() {
	}

	public java.lang.String getOwnerEmail()  {
		
		return ownerEmail;
	}

	public void setOwnerEmail(java.lang.String ownerEmail)  {
		this.ownerEmail = ownerEmail;
	}

	public java.lang.String getActorEmail()  {
		
		return actorEmail;
	}

	public void setActorEmail(java.lang.String actorEmail)  {
		this.actorEmail = actorEmail;
	}

	public java.lang.String getAction()  {
		
		return action;
	}

	public void setAction(java.lang.String action)  {
		this.action = action;
	}

	public java.lang.String getStepName()  {
		
		return stepName;
	}

	public void setStepName(java.lang.String stepName)  {
		this.stepName = stepName;
	}

	public java.lang.String getTaskId()  {
		
		return taskId;
	}

	public void setTaskId(java.lang.String taskId)  {
		this.taskId = taskId;
	}

	public java.lang.String getRequestStepId()  {
		
		return requestStepId;
	}

	public void setRequestStepId(java.lang.String requestStepId)  {
		this.requestStepId = requestStepId;
	}

	public java.lang.String getWfSteps()  {
		
		return wfSteps;
	}

	public void setWfSteps(java.lang.String wfSteps)  {
		this.wfSteps = wfSteps;
	}

	public java.lang.String getWfId()  {
		
		return wfId;
	}

	public void setWfId(java.lang.String wfId)  {
		this.wfId = wfId;
	}

	public java.lang.String getSla()  {
		
		return sla;
	}

	public void setSla(java.lang.String sla)  {
		this.sla = sla;
	}

	public java.lang.String getSla_checkpoint()  {
		
		return sla_checkpoint;
	}

	public void setSla_checkpoint(java.lang.String sla_checkpoint)  {
		this.sla_checkpoint = sla_checkpoint;
	}

	public java.util.Date getSla_date()  {
		
		return sla_date;
	}

	public void setSla_date(java.util.Date sla_date)  {
		this.sla_date = sla_date;
	}

	/**
	 * IS document wrapper
	 */
	public static class StepFields extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		// IS Document type used to generate this class
		public static String[][] FIELD_NAMES = new String[][] {{"stepFieldsJSON", "stepFieldsJSON"},
		};
		private java.lang.String stepFieldsJSON;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public StepFields() {
		}


		public java.lang.String getStepFieldsJSON()  {
			
			return stepFieldsJSON;
		}


		public void setStepFieldsJSON(java.lang.String stepFieldsJSON)  {
			this.stepFieldsJSON = stepFieldsJSON;
		}
		
		
	
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails.StepFields getStepFields()  {
		if (stepFields == null) {
			stepFields = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails.StepFields();
		}
		return stepFields;
	}

	public void setStepFields(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails.StepFields stepFields)  {
		this.stepFields = stepFields;
	}
	
	

}