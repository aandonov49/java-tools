package com.ad4u.bg;

import java.io.IOException;

public class Bitmask {

    private static int mask = 255;
    private static int bitmask;
    private static int a;
    private static String bits = "000000010000000000000000";
    private static boolean isGds = true;
    private static boolean isVda = true;
    private static boolean isDyna = true;

    public static void main(String[] args) throws IOException {

        int intRepresentation = Integer.parseUnsignedInt(bits, 2);

        for (int i = 0; i < 255; i++) {
            if (i < 85) {
                bitmask++;
                continue;
            }
            if (i < 170) {
                bitmask = bitmask + 256;
                continue;
            }
            bitmask = bitmask + 65536;
        }
        String binaryString = Integer.toBinaryString(a);
        int gds = bitmask & mask;
        String binaryStringvds = Integer.toBinaryString((a >> 8));
        int vds = (bitmask >> 8) & mask;
        //       String stringRepresentation = padWithZeros(binaryString);
        int dynaWeb = (bitmask >> 16) & mask;
        if (checkPrices(isGds, isVda, isDyna, bitmask)==255) {
            System.out.println("Success");
        }

    }

    private static int checkPrices(boolean isGds, boolean isVda, boolean isDyna, int bitmask) {
        int priceSum = 0;
        if (isGds) {
            priceSum = priceSum + (bitmask & mask);
        }
        if (isVda) {
            priceSum = priceSum + ((bitmask >> 8) & mask);
        }
        if (isDyna) {
            priceSum = priceSum + ((bitmask >> 16) & mask);
        }
        return priceSum;
    }
}
