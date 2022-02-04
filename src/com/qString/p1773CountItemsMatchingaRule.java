package com.qString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1773CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer","silver","phone"));
        items.add(Arrays.asList("phone","gold","iphone"));

        countMatches(items, "color", "silver");
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int eval = ruleKey.equals("type") ? 0: ruleKey.equals("color")? 1: 2; // this made the code way faster so remember this part.

        for (List<String> item:items) {
            if(item.get(eval).equals(ruleValue))
                count++;
        }
        System.out.println(count);
        return count;
    }
}
