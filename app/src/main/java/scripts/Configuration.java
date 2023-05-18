package scripts;

import java.util.Properties;

public class Configuration {
    public static final String filePath = "../app/src/main/resources/properties/";
    public static final String keysProperty = filePath + "keys" + ".properties";
    public static final Properties keyPropertyFile = Commons.getProperties(keysProperty);

}
