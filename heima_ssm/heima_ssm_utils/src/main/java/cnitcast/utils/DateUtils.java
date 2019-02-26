package cnitcast.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    //日期转字符串
    public static String date2String(Date date,String s){
        SimpleDateFormat sdf = new SimpleDateFormat(s);
        String format = sdf.format(date);
        return format;
    }

    //字符串转日期
    public static Date string2Date(String date,String s) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(s);
        Date parse = sdf.parse(date);
        return parse;
    }
}
