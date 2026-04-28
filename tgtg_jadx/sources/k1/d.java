package k1;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends TextureView {
    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        c cVar;
        super.onAttachedToWindow();
        TextureView.SurfaceTextureListener surfaceTextureListener = getSurfaceTextureListener();
        e eVar = surfaceTextureListener instanceof e ? (e) surfaceTextureListener : null;
        if (eVar == null || (cVar = eVar.f25724e) == null) {
            return;
        }
        SurfaceTexture surfaceTexture = (SurfaceTexture) cVar.f25722d;
        if (!cVar.f25721c) {
            Log.d("VfEmbeddedSurface", "Unable to reattach " + surfaceTexture + " to " + this + ". Still attached.");
            return;
        }
        if (((Surface) cVar.f25720b.a()) == null) {
            Log.d("VfEmbeddedSurface", "Unable to reattach " + surfaceTexture + " to " + this + ". Already released.");
            return;
        }
        setSurfaceTexture(surfaceTexture);
        Log.d("VfEmbeddedSurface", "Reattached " + surfaceTexture + " to " + this);
        cVar.f25721c = false;
    }
}
