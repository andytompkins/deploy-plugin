package hudson.plugins.deploy.jetty;

import hudson.plugins.deploy.PasswordProtectedAdapterCargo;
import org.codehaus.cargo.container.configuration.Configuration;
import org.codehaus.cargo.container.property.GeneralPropertySet;
//import org.codehaus.cargo.container.property.RemotePropertySet;
import org.codehaus.cargo.container.property.ServletPropertySet;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Base class for JettyRemote adapters.
 *
 * @author Andy Tompkins
 */
public abstract class JettyRemoteAdapter extends PasswordProtectedAdapterCargo {
    public final String url;

    protected JettyRemoteAdapter(String url, String password, String userName) {
        super(userName, password);        
        this.url = url;
    }

    @Override
    public void configure(Configuration config) {
        super.configure(config);
        try {
            URL _url = new URL(url);
            //config.setProperty(GeneralPropertySet.PROTOCOL,_url.getProtocol());
            config.setProperty(GeneralPropertySet.HOSTNAME,_url.getHost());
            int p = _url.getPort();
            if(p<0) p=80;
            config.setProperty(ServletPropertySet.PORT,String.valueOf(p));
        } catch (MalformedURLException ex) {
            throw new AssertionError(ex);
        }
    }
}
