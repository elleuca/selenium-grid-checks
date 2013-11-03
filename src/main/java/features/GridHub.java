package features;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: luca
 * Date: 03/11/13
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 */
public class GridHub {

    public GridHub() {

    }

    public URL getURL() throws MalformedURLException {
        return new URL("http", "192.168.1.2", 4444, "/wd/hub");
    }
}
