package com.example.fahad.pharmacy.Utils;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Helper {

    public static void copyDataBase(Context context) {
        String package_name=context.getPackageName();
        String DB_PATH = "/data/data/"+package_name+"/databases/";
        String DB_NAME = "pharmacy.sql";
        try {
            InputStream myInput = context.getAssets().open(DB_NAME);

            File dbFile=new File(DB_PATH);
            if(!dbFile.exists()){
                dbFile.mkdirs();

                String outputFileName = DB_PATH + DB_NAME;
                OutputStream myOutput = new FileOutputStream(outputFileName);

                byte[] buffer = new byte[1024];
                int length;

                while((length = myInput.read(buffer))>0){
                    myOutput.write(buffer, 0, length);
                }

                myOutput.flush();
                myOutput.close();
                myInput.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
