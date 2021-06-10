package com.wmg.dsp.tango.sg.pdf;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Locale;

public class Utils {
    public static String utfFormatter(String arg) {
        if(arg != null)
            try {
                return new String(arg.getBytes("ISO-8859-1"), "UTF-8");
            } catch(UnsupportedEncodingException e) {
                return arg;
            }
        else
            return arg;
    }
    
    public static DecimalFormat getDecimalFormatter(Locale arg, String pattern) {
        DecimalFormat formatter = (DecimalFormat)DecimalFormat.getInstance(arg);
        if(pattern != null)
            formatter.applyPattern(pattern);
        
        return formatter;
    }
}
