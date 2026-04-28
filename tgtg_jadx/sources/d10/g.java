package d10;

import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f13697a = new o();

    public g(se.b bVar) {
        se.d dVar = new se.d(this, 12);
        bVar.getClass();
        ((o) bVar.f39010b).h(h.f13698a, new a50.c(bVar, dVar));
    }

    public final void a(Exception exc) {
        this.f13697a.r(exc);
    }

    public final void b(Object obj) {
        this.f13697a.p(obj);
    }

    public final boolean c(Exception exc) {
        o oVar = this.f13697a;
        oVar.getClass();
        i0.i(exc, "Exception must not be null");
        synchronized (oVar.f13719a) {
            try {
                if (oVar.f13721c) {
                    return false;
                }
                oVar.f13721c = true;
                oVar.f13724f = exc;
                oVar.f13720b.B(oVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Object obj) {
        this.f13697a.q(obj);
    }

    public g() {
    }
}
