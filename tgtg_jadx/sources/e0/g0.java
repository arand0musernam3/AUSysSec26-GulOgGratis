package e0;

import android.util.Log;
import android.view.Surface;
import b0.i3;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f15339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r80.a f15341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f15342d;

    public g0(h0 h0Var, Surface surface) {
        surface.getClass();
        this.f15342d = h0Var;
        this.f15339a = surface;
        r80.b bVar = h0.f15344d;
        bVar.getClass();
        this.f15340b = r80.b.f37780b.incrementAndGet(bVar);
        this.f15341c = w.b.p(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<i3> listR0;
        if (this.f15341c.a()) {
            h0 h0Var = this.f15342d;
            synchronized (h0Var.f15345a) {
                surface = this.f15339a;
                Integer num = (Integer) h0Var.f15346b.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                h0Var.f15346b.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listR0 = CollectionsKt.r0(h0Var.f15347c);
                    h0Var.f15346b.remove(surface);
                } else {
                    listR0 = null;
                }
            }
            if (listR0 != null) {
                for (i3 i3Var : listR0) {
                    i3Var.getClass();
                    surface.getClass();
                    synchronized (i3Var.f5237e) {
                        try {
                            s0.x0 x0Var = (s0.x0) i3Var.f5239g.remove(surface);
                            if (x0Var != null) {
                                if (wd.a.B(3, "CXCP")) {
                                    Log.d("CXCP", "SurfaceInactive " + x0Var + " in " + i3Var);
                                }
                                i3Var.f5235c.c(x0Var);
                                try {
                                    x0Var.b();
                                } catch (IllegalStateException e5) {
                                    if (wd.a.B(5, "CXCP")) {
                                        Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e5);
                                    }
                                }
                                i3Var.e();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.f15340b;
    }
}
