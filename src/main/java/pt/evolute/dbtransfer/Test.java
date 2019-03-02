package pt.evolute.dbtransfer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            p.load( new FileInputStream("mysql_to_kingbase.properties" ) );
            p.list( System.out );
            new Main( p );
        } catch ( Exception e) {
            e.printStackTrace();
        }

    }
}
