package com.ssm.converter;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 自定义的类型转换器需要在springmvc配置文件中配置
 */
public class StringToDate implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = null;
        try {
            date = df.parse(s);
            return date;
        } catch (ParseException e) {
           throw new RuntimeException("dateformat.....");
        }

    }


}
