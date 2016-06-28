/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miracle
 */
public class WritePropertiesFile {

    public static void main(String[] args) {
        Properties p = new Properties();
        OutputStream oStream = null;
        try {
            oStream = new FileOutputStream("config.properties");

            p.setProperty("voterId", "2746");
            p.setProperty("voterName", "Sandeep");

            p.store(oStream, "voter details");

        } catch (IOException ex) {
            Logger.getLogger(WritePropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (oStream != null) {
                try {
                    oStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(WritePropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
