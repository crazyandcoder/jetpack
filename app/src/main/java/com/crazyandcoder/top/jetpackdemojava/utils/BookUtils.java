package com.crazyandcoder.top.jetpackdemojava.utils;

public class BookUtils {
    public static String getRating(int rating) {
        switch (rating) {
            case 0:
                return "零星";

            case 1:
                return "一星";

            case 2:
                return "二星";

            case 3:
                return "三星";

            case 4:
                return "四星";

            default:
                return "五星";
        }
    }
}
