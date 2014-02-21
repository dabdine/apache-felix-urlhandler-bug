package derekabdine.bug.osgi;

import java.net.URL;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	public void start(BundleContext context) throws Exception {
		String location = context.getBundle().getLocation();
		new URL("jar", "", -1, new URL("jar", "", -1, location) + "!/slf4j-api-1.7.5.jar").openStream();
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}
}
