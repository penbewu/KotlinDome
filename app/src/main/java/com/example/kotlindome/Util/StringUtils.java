package com.example.kotlindome.Util;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 文件描述:
 * 创建者: IAN
 * 创建时间: 2019/7/4 15:12
 */
public class StringUtils {


    /**
     * 判断字符串是否为null或长度为0
     *
     * @param s 待校验字符串
     * @return {@code true}: 空<br> {@code false}: 不为空
     */
    public static boolean isEmpty(CharSequence s) {
        return s == null || s.equals("Null") || s.length() == 0 || TextUtils.isEmpty(s);
    }

    /**
     * 判断字符串是否为null或全为空格
     *
     * @param s 待校验字符串
     * @return {@code true}: null或全空格<br> {@code false}: 不为null且不全空格
     */
    public static boolean isSpace(String s) {
        return (s == null || s.trim().length() == 0);
    }

    /**
     * 判断两字符串是否相等
     *
     * @param a 待校验字符串a
     * @param b 待校验字符串b
     * @return {@code true}: 相等<br>{@code false}: 不相等
     */
    public static boolean equals(Object a, Object b) {
        if (a == b) return true;
        if(a != null && b != null) {
            return a.toString().equals(b.toString());
        }
        return false;
    }
    /**
     * null转为长度为0的字符串
     *
     * @param s 待转字符串
     * @return s为null转为长度为0字符串，否则不改变
     */
    public static String null2Length0(String s) {
        return s == null ? "" : s;
    }
    /**
     * 返回字符串长度
     *
     * @param s 字符串
     * @return null返回0，其他返回自身长度
     */
    public static int length(CharSequence s) {
        return s == null ? 0 : s.length();
    }
    /**
     * 首字母大写
     *
     * @param s 待转字符串
     * @return 首字母大写字符串
     */
    public static String upperFirstLetter(String s) {
        if (isEmpty(s) || !Character.isLowerCase(s.charAt(0))) {
            return s;
        }
        return String.valueOf((char) (s.charAt(0) - 32)) + s.substring(1);
    }
    /**
     * 首字母小写
     *
     * @param s 待转字符串
     * @return 首字母小写字符串
     */
    public static String lowerFirstLetter(String s) {
        if (isEmpty(s) || !Character.isUpperCase(s.charAt(0))) {
            return s;
        }
        return String.valueOf((char) (s.charAt(0) + 32)) + s.substring(1);
    }

    public static String replaceHtmlI(String s) {
        return s.replaceAll("<i ", "<span ").replaceAll("</i>", "</span>");
    }

    /**
     * 提取字符串里面的数字
     * @param str
     * @return
     */
    public static String extractNumber(String str) {
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }
    //是否数字
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    /**
     * 判断字符串是不是double型
     * @param str
     * @return
     */
    public static boolean isDoubNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]+[.]{0,1}[0-9]*[dD]{0,1}");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }

    public static int douStringToInt(String douNum){
        int num =0;
        try {
            if (!StringUtils.isEmpty(douNum)&&StringUtils.isDoubNumeric(douNum)){
                Double douData = Double.parseDouble(douNum);
                num = douData.intValue();
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        return num;
    }
    public static String shadeMiddle(String s) {
        String shade = "";
        if (s.length() < 10) {
            shade = s;
        } else {
            shade = s.substring(0, 4) + "****" + s.substring(s.length()-4);
        }
        return shade;
    }

    public static String tailNumber(String s) {
        String tail = "";
        if (s.length() < 4) {
            tail = "尾号" + s;
        } else {
            tail = "尾号" + s.substring(s.length()-4);
        }
        return tail;
    }


    /**
     * 使用java正则表达式去掉多余的.与0
     * @param s
     * @return
     */
    public static String subZeroAndDot(String s){
        try {
            if(StringUtils.isEmpty(s)){
                return null;
            }
            if(s.indexOf(".") > 0){
                s = s.replaceAll("0+?$", "");//去掉多余的0
                s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return s;
    }
}
