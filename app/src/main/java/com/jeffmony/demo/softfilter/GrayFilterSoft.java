package com.jeffmony.demo.softfilter;

import com.jeffmony.livesdk.filter.softvideofilter.BaseSoftVideoFilter;

/**
 * Created by jeffmony.
 */
public class GrayFilterSoft extends BaseSoftVideoFilter {
    @Override
    public boolean onFrame(byte[] orignBuff, byte[] targetBuff, long presentationTimeMs, int sequenceNum) {
        System.arraycopy(orignBuff,0,targetBuff,0,SIZE_Y);
        for (int i = SIZE_Y; i < SIZE_TOTAL; i++) {
            targetBuff[i] = 127;
        }
        return true;
    }
}
