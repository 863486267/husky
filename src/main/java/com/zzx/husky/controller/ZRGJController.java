package com.zzx.husky.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mr.John on 2019/4/13 20:34.
 **/
public class ZRGJController {

    public static void main(String[] args) {
        String s = "2012年2月4日，发自95535：您的尾号2354的银行卡于12:21在ATM机支出23元【中国银行】" +
                "2012年2月4日，发自95535：您的尾号2354的银行卡于12:21在ATM机支出23元【中国银行】";

        Pattern pattern = Pattern.compile("(?<date>\\d+年\\d+月\\d+日)(.*?)(?<phone>\\d+)(.*?)(?<card>\\d+)(.*)(?<inout>(收入)|(支出))(?<num>\\d+)元");

        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            String date = matcher.group("date");

        }

    }


}
