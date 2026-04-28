package k1;

import a3.y0;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25719a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1.c f25720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f25722d;

    public c(Surface surface, int i11, int i12, m1.g gVar) {
        m1.g eVar = Build.VERSION.SDK_INT >= 29 ? new m1.e(gVar, i11, i12, "ViewfinderExternalSurfaceHolder-" + hashCode()) : m1.f.f28703a;
        this.f25722d = eVar;
        Surface surfaceE = eVar.e();
        surfaceE = surfaceE == null ? surface : surfaceE;
        m1.c cVar = new m1.c(new y0(this, surfaceE, surface, 26));
        this.f25720b = cVar;
        cVar.b(surfaceE);
    }

    public c(SurfaceTexture surfaceTexture) {
        this.f25722d = surfaceTexture;
        m1.c cVar = new m1.c(new jd.a(this, 5));
        this.f25720b = cVar;
        cVar.b(new Surface(surfaceTexture));
    }
}
