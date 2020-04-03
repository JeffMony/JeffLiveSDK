package com.jeffmony.demo.softfilter;

import com.jeffmony.livesdk.filter.softvideofilter.BaseSoftVideoFilter;

/**
 * Created by jeffmony.
 */
public class DoNothingFilterSoft extends BaseSoftVideoFilter {
    @Override
    public boolean onFrame(byte[] orignBuff, byte[] targetBuff, long presentationTimeMs, int sequenceNum) {
        return false;
    }
}
