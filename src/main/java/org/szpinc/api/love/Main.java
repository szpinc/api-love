package org.szpinc.api.love;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static Pattern aaaPattern = Pattern.compile("(.)\\1{3,}");
    private static Pattern aabbPattern = Pattern.compile("(.)\\1(.)\\2");

    public static String process(String str) {
        return matcher2(matcher1(str));
    }


    public static String matcher2(String str) {
        Matcher matcher = aabbPattern.matcher(str);
        String result = str;
        while (matcher.find()) {
            String matcherStr = matcher.group(0);
            System.out.println(matcherStr);
            return result.replace(matcherStr, matcherStr.substring(0, matcherStr.length() - 1));
        }
        return result;
    }

    public static String matcher1(String str) {
        Matcher matcher = aaaPattern.matcher(str);
        String result = str;
        while (matcher.find()) {
            String matcherStr = matcher.group(0);
            result = result.replace(matcherStr, matcherStr.substring(0, 2));
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            list.add(str);
        }
        for (String str : list) {
            System.out.println(process(str));
        }
    }
}
