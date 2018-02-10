/*
 * Copyright 2004 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ancientprogramming.fixedformat4j.samples.basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;

/**
 * Shows the basic usage
 *
 * @author Jacob von Eyben - http://www.ancientprogramming.com
 * @since 1.2.0
 */

// START-SNIPPET: basicusage
public class BasicUsage {

    private static FixedFormatManager manager = new FixedFormatManagerImpl();

    public static void main(String[] args) {
        BufferedReader reader;

        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("conf.properties");
            properties.load(inputStream);

            String fileDirectory = properties.getProperty("chqInwardFilePath");

            Path path = Paths.get("C:", fileDirectory);

            reader = new BufferedReader(new FileReader(path.toString()));
            String line = reader.readLine();

            // String fileName = path.toString();
            // String extension = "";
            // int index = fileName.lastIndexOf(".");

            /*
             * if (index > 0) { extension = fileName.substring(index + 1); }
             */

            while (line != null) {
                BasicRecord record = manager.load(BasicRecord.class, line);
                System.out.println();
                line = reader.readLine();

                int cashTxnAmount = Integer.parseInt(record.getCashTxnAmount()) / 100;
                int amtInContraEntry = Integer.parseInt(record.getAmountInContraEntry()) / 100;

                System.out.println(record.getBranchCode() + "\n" + record.getCashAccountCode() + "\n"
                        + record.getDrcrIndicator() + "\n" + cashTxnAmount + "\n" + record.getValueDate() + "\n"
                        + record.getCashAcctCode() + "\n" + record.getDrcrIndicatorContraEntry() + "\n"
                        + amtInContraEntry + "\n" + record.getCategoryCode() + "\n" + record.getNarrative());
            }
            reader.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        }
    }
}
// END-SNIPPET: basicusage
