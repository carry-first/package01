package com.FuctionalInterface.base.ConstomFilter;

import java.util.ArrayList;
import java.util.function.Predicate;

public class filter {
    public static ArrayList<String> Filter(String[] arr, Predicate<String> a) {
        ArrayList<String> list = new ArrayList<>();

//        循环遍历传递的数组
        for (String s : arr) {
//          循环筛选我们定义的规则
            boolean b = a.test(s);
//            如果符合规则，就添加内容
            if (b) {
                list.add(s);
            }
        }
//        返回筛选后的集合
        return list;
    }

    public static void main(String[] args) {
        String arr[] = {"迪丽热巴，女", "古力娜扎，女", "黄晓明，男", "肖战，男"};
//       筛选信息为女;
        ArrayList<String> list = Filter(arr, s -> s.split("，")[1].equals("女"));
//        输出集合
        System.out.println(list);
    }
}
