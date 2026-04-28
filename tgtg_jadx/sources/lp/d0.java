package lp;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.TextureView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextureView f28034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f28035b;

    public d0(TextureView textureView, Function0 function0) {
        this.f28034a = textureView;
        this.f28035b = function0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        surfaceTexture.getClass();
        TextureView textureView = this.f28034a;
        Object tag = textureView.getTag(-1412567294);
        Uri uri = tag instanceof Uri ? (Uri) tag : null;
        if (uri != null) {
            r.k(textureView, uri, this.f28035b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        TextureView textureView = this.f28034a;
        Object tag = textureView.getTag(-1412567295);
        MediaPlayer mediaPlayer = tag instanceof MediaPlayer ? (MediaPlayer) tag : null;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setOnPreparedListener(null);
                mediaPlayer.setOnVideoSizeChangedListener(null);
                mediaPlayer.setOnCompletionListener(null);
                mediaPlayer.setOnErrorListener(null);
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (Throwable th2) {
                sa0.a.f38953a.e(th2, "onSurfaceTextureDestroyed error", new Object[0]);
            }
        }
        textureView.setTag(-1412567295, null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }
}
