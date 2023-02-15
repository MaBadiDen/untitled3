package org.example;


public class Main {
    public static void main(String[] args) {
        String[] parts = stringSplit("Cats were here!!!!", 3);

        for (String part : parts) {
            System.out.println(part);
        }

    }
    public static String[] stringSplit(String str, int partsCount) {
        if(str == null || partsCount == 0) {
            throw new RuntimeException();
        }
        int length = str.length();
        int partSize = length/partsCount;
        int tailString = length % partsCount;
        String[] parts = new String[partsCount];

        for (int i = 0; i < partsCount; i++) {
            int start = i*partSize;
            int end = start + partSize;
            if(i == partsCount-1) end += tailString;
            parts[i] = str.substring(start, end);

        }

        return parts;
    }

}