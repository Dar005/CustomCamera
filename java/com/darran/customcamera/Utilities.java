package com.darran.customcamera;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Darran on 02/01/2019.
 */

public class Utilities {

    private Utilities(){

    }

    public static String generateFilename(){
        @SuppressLint("SimpleDateFormat")SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        return "cam" + sdf.format(new Date()) + ".jpg";
    }


}
