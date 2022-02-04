package com.qString;

public class p1108DefanginganIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    static String defangIPaddr(String address) {
        StringBuilder ip = new StringBuilder();
        ip.append(address);

        for (int i = 0; i < ip.length(); i++) {
            if(ip.charAt(i) == '.') {
                ip.replace(i, i + 1, "[.]");
                i++;
            }
        }

        return ip.toString();
    }

    static String defangIPaddr_(String address) {
        StringBuilder ip = new StringBuilder();

        for (char ch: address.toCharArray()) {
            if(ch == '.') {
                ip.append("[.]");
            }else
                ip.append(ch);
        }
        return ip.toString();
    }
}
