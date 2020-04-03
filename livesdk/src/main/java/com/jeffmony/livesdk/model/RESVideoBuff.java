package com.jeffmony.livesdk.model;

import java.util.Arrays;

/**
 * Created by jeffmony.
 */
public class RESVideoBuff {
    public boolean isReadyToFill;
    public int colorFormat = -1;
    public byte[] buff;


    public RESVideoBuff(int colorFormat, int size) {
        isReadyToFill = true;
        this.colorFormat = colorFormat;
        buff = new byte[size];
        Arrays.fill(buff, size/2, size, (byte) 127);
    }
}
