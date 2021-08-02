package citi;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;

/**
 * @author 1
 */
public class 1StartupAction extends SimpleAction {

	@Override
	public void run(String[] lifecycleEventIds) throws ActionException {
		for (String eventId : lifecycleEventIds) {
			System.out.println("Startup event ID " + eventId);
		}
	}

}