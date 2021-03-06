package com.jeffmony.demo.softfilter;

import com.jeffmony.livesdk.filter.softvideofilter.BaseSoftVideoFilter;

/**
 * Created by jeffmony.
 */
public class BlackWhiteFilterSoft extends BaseSoftVideoFilter {
    private byte gap;

    public BlackWhiteFilterSoft(byte gap) {
        this.gap = gap;
    }

    public void setGap(byte gap) {
        this.gap = gap;
    }

    @Override
    public boolean onFrame(byte[] orignBuff, byte[] targetBuff, long presentationTimeMs, int sequenceNum) {
        BlackWhite(orignBuff, SIZE_Y, SIZE_TOTAL, gap);
        return false;
    }

    static {
        System.loadLibrary("sample");
    }

    private native static void BlackWhite(byte[] src, int ysize, int totalsize, byte gap);
}
