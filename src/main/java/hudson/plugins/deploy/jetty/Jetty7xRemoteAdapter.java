package hudson.plugins.deploy.jetty;

import hudson.Extension;
import hudson.plugins.deploy.ContainerAdapterDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author Andy Tompkins
 */
public class Jetty7xRemoteAdapter extends JettyRemoteAdapter {
    @DataBoundConstructor
    public Jetty7xRemoteAdapter(String url, String password, String userName) {
        super(url, password, userName);
    }

    public String getContainerId() {
        return "jetty7x";
    }


    @Extension
    public static final class DescriptorImpl extends ContainerAdapterDescriptor {
        public String getDisplayName() {
            return "Jetty 7.x Remote";
        }
    }
}
