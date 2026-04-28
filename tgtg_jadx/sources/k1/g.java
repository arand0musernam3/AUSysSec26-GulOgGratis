package k1;

import android.graphics.Rect;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.braze.h2;
import h2.a0;
import kotlin.jvm.internal.Intrinsics;
import v80.d0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f25728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f25729g;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        this.f25726d = i12;
        this.f25727e = i13;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f25726d = surfaceFrame.width();
        this.f25727e = surfaceFrame.height();
        f fVar = this.f25728f;
        x70.c cVar = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
            fVar = null;
        }
        m1.g gVarA = m1.d.a(fVar);
        c cVar2 = this.f25729g;
        if (cVar2 != null) {
            m1.c cVar3 = cVar2.f25720b;
            if (!cVar2.f25721c) {
                h2.b("tryAttach() can only be called when detached");
                return;
            }
            Surface surface = (Surface) cVar3.a();
            if (surface != null) {
                if (((m1.g) cVar2.f25722d).d(gVarA)) {
                    Log.d("VfExternalSurface", "Reattached " + surface + " to " + gVarA);
                    cVar2.f25721c = false;
                    return;
                }
                Log.d("VfExternalSurface", "Unable to attach " + surface + " to " + gVarA);
                cVar3.c();
            }
        }
        c cVar4 = new c(surfaceHolder.getSurface(), this.f25726d, this.f25727e, gVarA);
        this.f25729g = cVar4;
        if (this.f25717b != null) {
            this.f25718c = f0.B(this.f25716a, null, d0.UNDISPATCHED, new a0(this, cVar4, cVar, 15), 1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c cVar = this.f25729g;
        if (cVar == null || cVar.f25721c) {
            return;
        }
        ((m1.g) cVar.f25722d).b();
        cVar.f25720b.c();
        cVar.f25721c = true;
    }
}
