package hudson.plugins.deploy.jetty;

import hudson.Extension;
import hudson.plugins.deploy.ContainerAdapterDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author Andy Tompkins
 */
public class Jetty9xRemoteAdapter extends JettyRemoteAdapter {
    @DataBoundConstructor
    public Jetty9xRemoteAdapter(String url, String password, String userName) {
        super(url, password, userName);
    }

    public String getContainerId() {
        return "jetty9x";
    }


    @Extension
    public static final class DescriptorImpl extends ContainerAdapterDescriptor {
        public String getDisplayName() {
            return "Jetty 9.x Remote";
        }
    }
}
