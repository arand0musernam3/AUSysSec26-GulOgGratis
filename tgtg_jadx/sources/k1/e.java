package k1;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import h2.a0;
import v80.b0;
import v80.d0;
import v80.f0;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f25723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f25724e;

    public e(b0 b0Var) {
        super(b0Var);
        this.f25723d = new Matrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        c cVar = new c(surfaceTexture);
        this.f25724e = cVar;
        if (!l.a(0L, 0L)) {
            surfaceTexture.setDefaultBufferSize((int) 0, (int) 0);
        }
        if (this.f25717b != null) {
            this.f25718c = f0.B(this.f25716a, null, d0.UNDISPATCHED, new a0(this, cVar, (x70.c) null, 15), 1);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c cVar = this.f25724e;
        if (cVar == null || cVar.f25721c) {
            return false;
        }
        cVar.f25720b.c();
        cVar.f25721c = true;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        if (l.a(0L, 0L)) {
            return;
        }
        surfaceTexture.setDefaultBufferSize((int) 0, (int) 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
