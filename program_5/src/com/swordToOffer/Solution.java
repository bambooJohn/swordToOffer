package com.swordToOffer;

/*
【面试题5 替换空格】
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

/**
 * @Description: 面试题5 替换空格
 * @Author: liangzhen
 * @Email: 1033855573@qq.com
 * @Date: 2020-03-24 11:14
 */
public class Solution {

    public String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }

        int p1 = str.length() - 1;

        for (int i = 0; i <= p1; i++) {
            if(' ' == str.charAt(i)){
                str.append(' ').append(' ');
            }
        }

        int p2 = str.length() - 1;
        while(p1 >= 0){
            char c = str.charAt(p1--);
            if(' ' == c){

                str.setCharAt(p2--,'0');

                str.setCharAt(p2--,'2');

                str.setCharAt(p2--,'%');

            }else {
                str.setCharAt(p2--,c);

            }
        }
        return str.toString();
    }

}
