package com.swordToOffer;
/*
* 【面试题4 二维数组中的查找】
*题目描述
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*Consider the following matrix:
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

Given target = 5, return true.
Given target = 20, return false.
* */
/**
 * @Description: 面试题4 二维数组中的查找
 * @Author: liangzhen
 * @Email: 1033855573@qq.com
 * @Date: 2020-03-24 11:06
 */
public class Solution {

    public boolean Find(int target, int [][] array) {
        if(array == null){
            return false;
        }

        int i = 0;
        int j = array[0].length - 1;
        while(i <= array.length - 1 && j >= 0){
            if(target < array[i][j]){
                j--;
            }else if(target > array[i][j]){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

}
