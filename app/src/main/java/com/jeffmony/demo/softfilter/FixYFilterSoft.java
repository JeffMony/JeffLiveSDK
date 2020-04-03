package com.jeffmony.demo.softfilter;

import com.jeffmony.livesdk.filter.softvideofilter.BaseSoftVideoFilter;

/**
 * Created by jeffmony.
 */
public class FixYFilterSoft extends BaseSoftVideoFilter {
    private byte y;

    public FixYFilterSoft(byte y) {
        this.y = y;
    }

    public void setY(byte y) {
        this.y = y;
    }

    @Override
    public boolean onFrame(byte[] orignBuff, byte[] targetBuff, long presentationTimeMs, int sequenceNum) {
        for (int i = 0; i < SIZE_Y; ++i) {
            orignBuff[i] = y;
        }
        return false;
    }
}
