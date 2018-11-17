package com.stickerworld.stickers.WhatsAppBasedCode.ImageView;

public class GlobalFunctions {

    public static int imageviewindex=0;

    public static String packdata;
    public static boolean isnewly;

    public static void setIsnewly(boolean isnewly) {
        GlobalFunctions.isnewly = isnewly;
    }

    public static void setPackdata(String packdata) {
        GlobalFunctions.packdata = packdata;
    }

    public static void setButtonstatus(boolean buttonstatus) {
        GlobalFunctions.buttonstatus = buttonstatus;
    }

    public static boolean buttonstatus;

    public static int getImageviewindex() {
        return imageviewindex;
    }

    public static void setImageviewindex(int imageviewindex) {
        GlobalFunctions.imageviewindex = imageviewindex;
    }
}
