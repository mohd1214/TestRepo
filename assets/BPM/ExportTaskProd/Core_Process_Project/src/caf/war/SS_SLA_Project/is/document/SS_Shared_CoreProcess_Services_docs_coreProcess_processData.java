package caf.war.SS_SLA_Project.is.document;

 import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SS_Shared_CoreProcess_Services_docs_coreProcess_processData extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "SS_Shared_CoreProcess_Services.docs.coreProcess:processData";
	private java.lang.String processType;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails currentStep = null;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData.BPMStepDetails bpmstepdetails = null;
	private caf.war.SS_SLA_Project.is.document.SS_Shared_Utils_docs_ErrorDoc errorDoc = null;
	private java.lang.String isThereNextApprover;
	private java.lang.String isNextApproverMandatoryAndNotFound;
	private java.lang.String isFirstStep;
	private java.lang.String skipTask;
	public static String[][] FIELD_NAMES = new String[][] {{"processType", "processType"},{"currentStep", "currentStep"},{"bpmstepdetails", "BPMStepDetails"},{"errorDoc", "errorDoc"},{"isThereNextApprover", "isThereNextApprover"},{"isNextApproverMandatoryAndNotFound", "isNextApproverMandatoryAndNotFound"},{"isFirstStep", "isFirstStep"},{"skipTask", "skipTask"},{"isSameWF", "isSameWF"},
	};
	private java.lang.String isSameWF;

	// Used by Designer to access the source document.
	 @SuppressWarnings("unused")
	

	
	public SS_Shared_CoreProcess_Services_docs_coreProcess_processData() {
	}

	public java.lang.String getProcessType()  {
		
		return processType;
	}

	public void setProcessType(java.lang.String processType)  {
		this.processType = processType;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails getCurrentStep()  {
		if (currentStep == null) {
			currentStep = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails();
		}
		return currentStep;
	}

	public void setCurrentStep(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_approvalStepsDetails currentStep)  {
		this.currentStep = currentStep;
	}

	/**
	 * IS document wrapper
	 */
	public static class BPMStepDetails extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String bpmstepname;
		private java.lang.String stepId;
		private java.lang.String stepStatus;
		private java.lang.String wfSteps;
		private java.lang.String retry;
		public static String[][] FIELD_NAMES = new String[][] {{"bpmstepname", "BPMStepName"},{"stepId", "stepId"},{"stepStatus", "stepStatus"},{"wfSteps", "wfSteps"},{"retry", "retry"},{"stepIteration", "stepIteration"},
		};
		private java.lang.String stepIteration;
		
	
		// Used by Designer to access the source document.
		 @SuppressWarnings("unused")
		
	
		
		public BPMStepDetails() {
		}


		public java.lang.String getBpmstepname()  {
			
			return bpmstepname;
		}


		public void setBpmstepname(java.lang.String bpmstepname)  {
			this.bpmstepname = bpmstepname;
		}


		public java.lang.String getStepId()  {
			
			return stepId;
		}


		public void setStepId(java.lang.String stepId)  {
			this.stepId = stepId;
		}


		public java.lang.String getStepStatus()  {
			
			return stepStatus;
		}


		public void setStepStatus(java.lang.String stepStatus)  {
			this.stepStatus = stepStatus;
		}


		public java.lang.String getWfSteps()  {
			
			return wfSteps;
		}


		public void setWfSteps(java.lang.String wfSteps)  {
			this.wfSteps = wfSteps;
		}


		public java.lang.String getRetry()  {
			
			return retry;
		}


		public void setRetry(java.lang.String retry)  {
			this.retry = retry;
		}


		public java.lang.String getStepIteration()  {
			
			return stepIteration;
		}


		public void setStepIteration(java.lang.String stepIteration)  {
			this.stepIteration = stepIteration;
		}
		
		
	
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData.BPMStepDetails getBpmstepdetails()  {
		if (bpmstepdetails == null) {
			bpmstepdetails = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData.BPMStepDetails();
		}
		return bpmstepdetails;
	}

	public void setBpmstepdetails(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_processData.BPMStepDetails bpmstepdetails)  {
		this.bpmstepdetails = bpmstepdetails;
	}

	public caf.war.SS_SLA_Project.is.document.SS_Shared_Utils_docs_ErrorDoc getErrorDoc()  {
		if (errorDoc == null) {
			errorDoc = new caf.war.SS_SLA_Project.is.document.SS_Shared_Utils_docs_ErrorDoc();
		}
		return errorDoc;
	}

	public void setErrorDoc(caf.war.SS_SLA_Project.is.document.SS_Shared_Utils_docs_ErrorDoc errorDoc)  {
		this.errorDoc = errorDoc;
	}

	public java.lang.String getIsThereNextApprover()  {
		
		return isThereNextApprover;
	}

	public void setIsThereNextApprover(java.lang.String isThereNextApprover)  {
		this.isThereNextApprover = isThereNextApprover;
	}

	public java.lang.String getIsNextApproverMandatoryAndNotFound()  {
		
		return isNextApproverMandatoryAndNotFound;
	}

	public void setIsNextApproverMandatoryAndNotFound(java.lang.String isNextApproverMandatoryAndNotFound)  {
		this.isNextApproverMandatoryAndNotFound = isNextApproverMandatoryAndNotFound;
	}

	public java.lang.String getIsFirstStep()  {
		
		return isFirstStep;
	}

	public void setIsFirstStep(java.lang.String isFirstStep)  {
		this.isFirstStep = isFirstStep;
	}

	public java.lang.String getSkipTask()  {
		
		return skipTask;
	}

	public void setSkipTask(java.lang.String skipTask)  {
		this.skipTask = skipTask;
	}

	public java.lang.String getIsSameWF()  {
		
		return isSameWF;
	}

	public void setIsSameWF(java.lang.String isSameWF)  {
		this.isSameWF = isSameWF;
	}
	
	

}