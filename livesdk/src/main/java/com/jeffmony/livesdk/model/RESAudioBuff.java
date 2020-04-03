package com.jeffmony.livesdk.model;

/**
 * Created by jeffmony.
 */
public class RESAudioBuff {
    public boolean isReadyToFill;
    public int audioFormat = -1;
    public byte[] buff;

    public RESAudioBuff(int audioFormat, int size) {
        isReadyToFill = true;
        this.audioFormat = audioFormat;
        buff = new byte[size];
    }
}
