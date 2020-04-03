package com.jeffmony.livesdk.render;

import android.graphics.SurfaceTexture;

/**
 * Created by jeffmony.
 */
public interface IRender {
    void create(SurfaceTexture visualSurfaceTexture, int pixelFormat, int pixelWidth, int pixelHeight, int visualWidth, int visualHeight);

    void update(int visualWidth, int visualHeight);

    void rendering(byte[] pixel);

    void destroy(boolean releaseTexture);
}
