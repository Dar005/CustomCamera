package com.darran.customcamera;

import android.os.Environment;

import java.io.File;

/**
 * Created by Darran on 02/01/2019.
 */

public class Constants {

    private Constants(){

    }

    public static final String SCAN_IMAGE_LOCATION = Environment.getExternalStorageDirectory() + File.separator + "CustomCamera";

}
