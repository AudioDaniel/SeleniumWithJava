package utils;

public class RGBtoANSIConverter{
    public static final String RESET = "\u001B[0m";


    public static String RGBtoANSIPrintCode(String rgbString){

        int[] rgbValues = extractRGBValues(rgbString);
        int red = rgbValues[0];
        int green = rgbValues[1];
        int blue = rgbValues[2];

        String ansiColor = rgbToAnsi(red, green, blue);
        return ansiColor;
    }

    public static int[] extractRGBValues(String rgbString) {
        String[] values = rgbString.replaceAll("[^\\d,]", "").split(",");
        int[] rgbValues = new int[3];
        for (int i = 0; i < 3; i++) {
            rgbValues[i] = Integer.parseInt(values[i]);
        }
        return rgbValues;
    }

    public static String rgbToAnsi(int red, int green, int blue) {
        int ansiColorCode = matchClosestColor(red, green, blue);
        return "\u001B[48;5;" + ansiColorCode + "m";
    }

    public static int matchClosestColor(int red, int green, int blue) {
        int[] ansiColors = {
                0x000000, 0xAA0000, 0x00AA00, 0xAA5500, 0x0000AA, 0xAA00AA, 0x00AAAA, 0xAAAAAA,
                0x555555, 0xFF5555, 0x55FF55, 0xFFFF55, 0x5555FF, 0xFF55FF, 0x55FFFF, 0xFFFFFF
        };

        int closestColor = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < ansiColors.length; i++) {
            int color = ansiColors[i];
            int distance = colorDistance(color, red, green, blue);
            if (distance < minDistance) {
                minDistance = distance;
                closestColor = i;
            }
        }

        return closestColor;
    }

    public static int colorDistance(int color, int red, int green, int blue) {
        int colorRed = (color >> 16) & 0xFF;
        int colorGreen = (color >> 8) & 0xFF;
        int colorBlue = color & 0xFF;

        int redDiff = colorRed - red;
        int greenDiff = colorGreen - green;
        int blueDiff = colorBlue - blue;

        return redDiff * redDiff + greenDiff * greenDiff + blueDiff * blueDiff;
    }


}

