package org.prog.session4;

public class homework41 {
    public static void main(String[] args) {
        String[] emails = new String[]{
                "abcdefg@gmail.com", //+
                "a@gmail.com", //-
                "josh@@gmail.com", //-
                "janegmail.com", // -
                "pete@gmail.com", //+
                "zoe@gmailcom", //-
                "steve@outlook.com", //+
                "abcd@a.a", //+
                "abcd.a@fakemail" //-
        };
        for (int i = 0; i < emails.length; i++) {

            int firstAt = emails[i].indexOf("@");
            int lastAt = emails[i].lastIndexOf("@");

            if (firstAt >= 3 && firstAt == lastAt && emails[i].substring(firstAt).contains(".")){
                System.out.println(emails[i]);
            }
        }

        }
}
