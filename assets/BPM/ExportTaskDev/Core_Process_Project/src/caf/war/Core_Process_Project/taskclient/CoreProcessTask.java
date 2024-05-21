package caf.war.Core_Process_Project.taskclient;

 

import com.webmethods.portal.service.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
 
/**
 * Task Client bean for 'Core Process Task' task.
 */ 
@ManagedBean(name = "CoreProcessTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class CoreProcessTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 6547423305096946688L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "EDC3DD96-F6CA-7C05-B3B9-D1CF57ECE7DE";

	/**
	 * Default constructor
	 */
	public CoreProcessTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 7046972879478504448L;
		 
			
		private caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessCanonicalDoc coreProcessCanonicalDoc = null;


		public static String[][] FIELD_NAMES = new String[][] {{"coreProcessCanonicalDoc", "coreProcessCanonicalDoc"},{"testDate", "testDate"},{"logId", "logId"},
		};


		private java.lang.String logId;


		public static final String[] INPUTS = new String[] {"coreProcessCanonicalDoc", "logId", };


		public static final String[] OUTPUTS = new String[] {"coreProcessCanonicalDoc", "logId", };
 
		public TaskData() {
		}

		public caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessCanonicalDoc getCoreProcessCanonicalDoc()  {
			if (coreProcessCanonicalDoc == null) {
				coreProcessCanonicalDoc = new caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessCanonicalDoc();
			}
			return coreProcessCanonicalDoc;
		}

		public void setCoreProcessCanonicalDoc(caf.war.SS_SLA_Project.is.document.SS_Shared_CoreProcess_Services_docs_coreProcess_coreProcessCanonicalDoc coreProcessCanonicalDoc)  {
			this.coreProcessCanonicalDoc = coreProcessCanonicalDoc;
		}

		public java.lang.String getLogId()  {
			
			return logId;
		}

		public void setLogId(java.lang.String logId)  {
			this.logId = logId;
		}
		
		
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}