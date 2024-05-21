/**
 * 
 */
package caf.war.Core_Process_Project.coreprocesstaskoverview;

/**
 * @author USER
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "CoreProcessTaskOverviewDefaultxhtmlView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "CoreProcessTaskOverview/default", beanType = BeanType.PAGE)
public class CoreProcessTaskOverviewDefaultxhtmlView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{CoreProcessTaskOverview.taskID}" }, };
	private transient caf.war.Core_Process_Project.coreprocesstaskoverview.CoreProcessTaskOverview coreProcessTaskOverview = null;
	private caf.war.Core_Process_Project.taskclient.CoreProcessTask coreProcessTask = null;
	private static final String[][] COREPROCESSTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{CoreProcessTask.taskID}", "#{CoreProcessTaskOverview.taskID}"},
	};
	private transient caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler slaHandler = null;
	private static final String[][] SLAHANDLER_PROPERTY_BINDINGS = new String[][] {
		{"#{SlaHandler.authCredentials.authenticationMethod}", "1"},
		{"#{SlaHandler.authCredentials.requiresAuth}", "true"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.Core_Process_Project.coreprocesstaskoverview.CoreProcessTaskOverview getCoreProcessTaskOverview()  {
		if (coreProcessTaskOverview == null) {
		    coreProcessTaskOverview = (caf.war.Core_Process_Project.coreprocesstaskoverview.CoreProcessTaskOverview)resolveExpression("#{CoreProcessTaskOverview}");
		}
		return coreProcessTaskOverview;
	}

	public caf.war.Core_Process_Project.taskclient.CoreProcessTask getCoreProcessTask()  {
		if (coreProcessTask == null) {
		    coreProcessTask = (caf.war.Core_Process_Project.taskclient.CoreProcessTask)resolveExpression("#{CoreProcessTask}");
		}
	
	    resolveDataBinding(COREPROCESSTASK_PROPERTY_BINDINGS, coreProcessTask, "coreProcessTask", false, false);
		return coreProcessTask;
	}

	public caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler getSlaHandler()  {
		if (slaHandler == null) {
		    slaHandler = (caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler)resolveExpression("#{SlaHandler}");
		}
	
	    resolveDataBinding(SLAHANDLER_PROPERTY_BINDINGS, slaHandler, "slaHandler", false, false);
		return slaHandler;
	}

}