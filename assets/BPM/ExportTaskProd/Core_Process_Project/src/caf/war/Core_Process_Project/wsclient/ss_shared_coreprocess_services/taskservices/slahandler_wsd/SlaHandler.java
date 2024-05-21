package caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.data.ContentProviderException;
import com.webmethods.caf.faces.util.LogUtils;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.slaHandler.
 */
@ManagedBean(name = "SlaHandler")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class SlaHandler extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4297519232421708800L;
	
	/**
	 * Constructor
	 */
	public SlaHandler() {
		super(caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.class,  // port type proxy class
			"slaHandler", // method to invoke
			new String[] { "slaHandler", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 5813223818140049408L;
		
		public Parameters() {
		}
	
	  
		private caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.SlaHandlerE slaHandler  = new  caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.SlaHandlerE() ;

		public caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.SlaHandlerE getSlaHandler() {
			return slaHandler;
		}

		public void setSlaHandler(caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.SlaHandlerE slaHandler) {
			this.slaHandler = slaHandler;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.SlaHandlerResponseE getResult() {
		return (caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SS_Shared_CoreProcess_ServicesTaskServicesSlaHandler_WSDStub.SlaHandlerResponseE)result;
	}
	public void refreshWithTaskId(String taskId) {
		try {
			super.refresh();
		}catch(ContentProviderException e) {
			e.printStackTrace();
			LogUtils.log("SLA FAILED for Task ID: "+ taskId + " Error: " + e.toString());
			
		}
	}
	
	
}