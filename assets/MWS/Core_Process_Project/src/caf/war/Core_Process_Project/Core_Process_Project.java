/**
 * 
 */
package caf.war.Core_Process_Project;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author USER
 *
 */
@ManagedBean(name = "Core_Process_Project")
@ApplicationScoped
@DTManagedBean(displayName = "Core_Process_Project", beanType = BeanType.APPLICATION)
public class Core_Process_Project extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	private transient caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler slaHandler = null;
	private static final String[][] SLAHANDLER_PROPERTY_BINDINGS = new String[][] {
		{"#{SlaHandler.authCredentials.authenticationMethod}", "1"},
		{"#{SlaHandler.authCredentials.requiresAuth}", "true"},
	};
	public Core_Process_Project()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "Core_Process_Project" );
	}

	public caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler getSlaHandler()  {
		if (slaHandler == null) {
		    slaHandler = (caf.war.Core_Process_Project.wsclient.ss_shared_coreprocess_services.taskservices.slahandler_wsd.SlaHandler)resolveExpression("#{SlaHandler}");
		}
	
	    resolveDataBinding(SLAHANDLER_PROPERTY_BINDINGS, slaHandler, "slaHandler", false, false);
		return slaHandler;
	}
}