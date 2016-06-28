/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
//jjjjjjjjjjjjjjjjjjjjkgg
/**
 *
 * @author miracle
 */
public class ReadPropertiesFile {

    public void readPropertiesFile() {
        Properties p = new Properties();
        InputStream iStream = null;
        try {
            iStream = new FileInputStream("config.properties");

            p.load(iStream);

            System.out.println(p.getProperty("voterId"));
            System.out.println(p.getProperty("voterName"));

        } catch (IOException ex) {
            Logger.getLogger(ReadPropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (iStream != null) {
                try {
                    iStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(ReadPropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public static void main(String[] args) {
        ReadPropertiesFile rpf = new ReadPropertiesFile();
        rpf.readPropertiesFile();
    }
}
