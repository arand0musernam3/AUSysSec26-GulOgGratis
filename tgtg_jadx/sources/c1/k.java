package c1;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements x0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f6883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f6884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.g f6886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.g f6887e;

    public /* synthetic */ k(n nVar, m mVar, int i11, m0.g gVar, m0.g gVar2) {
        this.f6883a = nVar;
        this.f6884b = mVar;
        this.f6885c = i11;
        this.f6886d = gVar;
        this.f6887e = gVar2;
    }

    @Override // x0.a
    public final ListenableFuture apply(Object obj) {
        m mVar = this.f6884b;
        Surface surface = (Surface) obj;
        n nVar = this.f6883a;
        nVar.getClass();
        surface.getClass();
        try {
            mVar.d();
            o oVar = new o(surface, this.f6885c, nVar.f6902g.f38402a, this.f6886d, this.f6887e);
            oVar.f6920k.f15782b.a(new i(mVar, 1), w.b.F());
            pd.g.n("Consumer can only be linked once.", mVar.f6895q == null);
            mVar.f6895q = oVar;
            return x0.g.c(oVar);
        } catch (DeferrableSurface$SurfaceClosedException e5) {
            return new x0.i(e5, 1);
        }
    }
}
