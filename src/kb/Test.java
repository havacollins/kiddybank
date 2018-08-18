package kb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws IOException {
        readProperties();
    }

    private static void writeProperties() throws IOException {
        File f = new File("accounts.properties");
        System.out.println(f);
        FileOutputStream out = new FileOutputStream(f);
        System.out.println(out);
        Properties properties = new Properties();
        properties.setProperty("lilah", "jacob");
        System.out.println(properties);
        properties.store(out, "foo");
    }

    private static void readProperties() throws IOException {
        System.out.println("hello");
        File f = new File("accounts.properties");
        FileInputStream in = new FileInputStream(f);
        Properties properties = new Properties();
        properties.load(in);
        System.out.println("properties");
    }
}
