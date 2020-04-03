package com.jeffmony.livesdk.core;

import android.graphics.SurfaceTexture;

import com.jeffmony.livesdk.core.listener.RESScreenShotListener;
import com.jeffmony.livesdk.core.listener.RESVideoChangeListener;
import com.jeffmony.livesdk.model.RESConfig;
import com.jeffmony.livesdk.model.RESCoreParameters;
import com.jeffmony.livesdk.rtmp.RESFlvDataCollecter;

/**
 * Created by jeffmony.
 */
public interface RESVideoCore {
    int OVERWATCH_TEXTURE_ID = 10;
    boolean prepare(RESConfig resConfig);

    void updateCamTexture(SurfaceTexture camTex);

    void startPreview(SurfaceTexture surfaceTexture, int visualWidth, int visualHeight);

    void updatePreview(int visualWidth, int visualHeight);

    void stopPreview(boolean releaseTexture);

    boolean startStreaming(RESFlvDataCollecter flvDataCollecter);

    boolean stopStreaming();

    boolean destroy();

    void reSetVideoBitrate(int bitrate);

    int getVideoBitrate();

    void reSetVideoFPS(int fps);

    void reSetVideoSize(RESCoreParameters newParameters);

    void setCurrentCamera(int cameraIndex);

    void takeScreenShot(RESScreenShotListener listener);

    void setVideoChangeListener(RESVideoChangeListener listener);

    float getDrawFrameRate();
}
