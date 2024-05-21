package caf.war.Core_Process_Project.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "CoreProcessTaskRuleContext")
@SessionScoped
@DTManagedBean(displayName = "Core Process Task Rule Context", beanType = BeanType.DEFAULT)
public class CoreProcessTaskRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
	
	private transient caf.war.Core_Process_Project.taskclient.CoreProcessTask coreProcessTask = null;
	private transient caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler slaHandler = null;
	private static final String[][] SLAHANDLER_PROPERTY_BINDINGS = new String[][] {
		{"#{slaHandler.authCredentials.authenticationMethod}", "0"},
		{"#{slaHandler.authCredentials.requiresAuth}", "false"},
		{"#{slaHandler.autoRefresh}", "false"},
		{"#{slaHandler.parameters.slaHandler.slaHandler.coreProcessCanonicalDoc}", "#{currentTask.taskData.coreProcessCanonicalDoc}"},
		{"#{slaHandler.parameters.slaHandler.slaHandler.coreProcessCanonicalDoc.processData.currentStep.SLA}", "#{currentTask.taskData.coreProcessCanonicalDoc.processData.currentStep.sla}"},
		{"#{slaHandler.parameters.slaHandler.slaHandler.coreProcessCanonicalDoc.processData.currentStep.SLA_checkpoint}", "#{currentTask.taskData.coreProcessCanonicalDoc.processData.currentStep.sla_checkpoint}"},
		{"#{slaHandler.parameters.slaHandler.slaHandler.coreProcessCanonicalDoc.processData.currentStep.SLA_date}", "#{currentTask.taskData.coreProcessCanonicalDoc.processData.currentStep.sla_date}"},
		{"#{slaHandler.endpointAddress}", "#{environment[\"wsclient-endpointAddress\"]}/ws/SS_Shared_CoreProcess_Services.taskServices:slaHandler_WSD"},
	};
	public caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler getSlaHandler()  {
		if (slaHandler == null) {
		    slaHandler = (caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler)resolveExpression("#{SlaHandler}");
		}
	
	    resolveDataBinding(SLAHANDLER_PROPERTY_BINDINGS, slaHandler, "slaHandler", false, false);
		return slaHandler;
	}
	public caf.war.Core_Process_Project.taskclient.CoreProcessTask getCoreProcessTask()  {
		if (coreProcessTask == null) {
			coreProcessTask = (caf.war.Core_Process_Project.taskclient.CoreProcessTask)resolveExpression("#{CoreProcessTask}");
		}
		return coreProcessTask;
	}
	public void setCustomId() {
		
        
        // For this we need to create a reference to the View Bean , in this case - getSubmitApplicationForLocalLoop2
        String ownerEmail = this.getCoreProcessTask().getTaskData().getCoreProcessCanonicalDoc().getProcessData().getCurrentStep().getOwnerEmail();
        String stepName = this.getCoreProcessTask().getTaskData().getCoreProcessCanonicalDoc().getProcessData().getCurrentStep().getStepName();
        String requestNumber = this.getCoreProcessTask().getTaskData().getCoreProcessCanonicalDoc().getCoreProcessInput().getHeaderFields().getRequestNumber();
        String subsidiary = this.getCoreProcessTask().getTaskData().getCoreProcessCanonicalDoc().getCoreProcessInput().getHeaderFields().getSubsidiary();

       
        String custId = "Request Number: " + requestNumber +", Subsidiary: " + subsidiary + ", Step Name: " + stepName+ ", Owner Email: " + ownerEmail;

        try {
              // Code that sets the custom id.
               getCurrentTask().getTaskInfo().setCustomTaskID(custId);
               getCurrentTask().applyChanges();

        } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
               log("Log error statement");
        }

}
}