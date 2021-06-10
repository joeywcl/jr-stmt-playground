import java.util.*;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 * @author sachinmittal@wmg.com
 */
public class IncomeLinesScriptlet extends JRDefaultScriptlet {

	/**
	 *
	 */
	public void afterGroupInit(String groupName) throws JRScriptletException {
		if ("Details".equals(groupName)) {
		    String ramc = (String) this.getFieldValue("rate_application_method_code");
		    if("SOURCE".equals(ramc)) {
		        this.setVariableValue("ShowSource", true);
		    }
		}
	}

}
