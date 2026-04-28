package w2;

import a3.f2;
import android.graphics.Rect;
import android.view.View;
import c5.f3;
import c5.x1;
import c5.z1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r5.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f42835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2 f42836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f42837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y80.m1 f42838d;

    @Override // r5.t
    public final void a() {
        j(null);
    }

    @Override // r5.t
    public final void b(h4.c cVar) {
        Rect rect;
        h0 h0Var = this.f42837c;
        if (h0Var != null) {
            h0Var.l = new Rect(j80.c.b(cVar.f21380a), j80.c.b(cVar.f21381b), j80.c.b(cVar.f21382c), j80.c.b(cVar.f21383d));
            if (!h0Var.f42920j.isEmpty() || (rect = h0Var.l) == null) {
                return;
            }
            h0Var.f42911a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // r5.t
    public final void c() {
        f3 f3Var;
        b0 b0Var = this.f42835a;
        if (b0Var == null || (f3Var = (f3) b5.o.e(b0Var, x1.f7423p)) == null) {
            return;
        }
        ((z1) f3Var).b();
    }

    @Override // r5.t
    public final void d(r5.y yVar, r5.m mVar, m2.h0 h0Var, m2.j0 j0Var) {
        j(new bg.a1(yVar, this, mVar, h0Var, j0Var, 7));
    }

    @Override // r5.t
    public final void e() throws Throwable {
        b2 b2Var = this.f42836b;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.f42836b = null;
        y80.e1 e1VarI = i();
        if (e1VarI != null) {
            ((y80.m1) e1VarI).h();
        }
    }

    @Override // r5.t
    public final void f(r5.y yVar, r5.y yVar2) {
        h0 h0Var = this.f42837c;
        if (h0Var != null) {
            boolean z11 = (m5.t0.c(h0Var.f42918h.f37715b, yVar2.f37715b) && Intrinsics.areEqual(h0Var.f42918h.f37716c, yVar2.f37716c)) ? false : true;
            h0Var.f42918h = yVar2;
            int size = h0Var.f42920j.size();
            for (int i11 = 0; i11 < size; i11++) {
                l0 l0Var = (l0) ((WeakReference) h0Var.f42920j.get(i11)).get();
                if (l0Var != null) {
                    l0Var.f42976g = yVar2;
                }
            }
            d0 d0Var = h0Var.f42922m;
            synchronized (d0Var.f42851c) {
                d0Var.f42858j = null;
                d0Var.l = null;
                d0Var.f42859k = null;
                d0Var.f42860m = null;
                d0Var.f42861n = null;
            }
            if (Intrinsics.areEqual(yVar, yVar2)) {
                if (z11) {
                    z zVar = h0Var.f42912b;
                    int iG = m5.t0.g(yVar2.f37715b);
                    int iF = m5.t0.f(yVar2.f37715b);
                    m5.t0 t0Var = h0Var.f42918h.f37716c;
                    int iG2 = t0Var != null ? m5.t0.g(t0Var.f29650a) : -1;
                    m5.t0 t0Var2 = h0Var.f42918h.f37716c;
                    zVar.q().updateSelection((View) zVar.f43083b, iG, iF, iG2, t0Var2 != null ? m5.t0.f(t0Var2.f29650a) : -1);
                    return;
                }
                return;
            }
            if (yVar != null && (!Intrinsics.areEqual(yVar.f37714a.f29538b, yVar2.f37714a.f29538b) || (m5.t0.c(yVar.f37715b, yVar2.f37715b) && !Intrinsics.areEqual(yVar.f37716c, yVar2.f37716c)))) {
                z zVar2 = h0Var.f42912b;
                zVar2.q().restartInput((View) zVar2.f43083b);
                return;
            }
            int size2 = h0Var.f42920j.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l0 l0Var2 = (l0) ((WeakReference) h0Var.f42920j.get(i12)).get();
                if (l0Var2 != null) {
                    r5.y yVar3 = h0Var.f42918h;
                    z zVar3 = h0Var.f42912b;
                    if (l0Var2.f42980k) {
                        l0Var2.f42976g = yVar3;
                        if (l0Var2.f42978i) {
                            zVar3.q().updateExtractedText((View) zVar3.f43083b, l0Var2.f42977h, c0.g(yVar3));
                        }
                        m5.t0 t0Var3 = yVar3.f37716c;
                        long j9 = yVar3.f37715b;
                        int iG3 = t0Var3 != null ? m5.t0.g(t0Var3.f29650a) : -1;
                        m5.t0 t0Var4 = yVar3.f37716c;
                        zVar3.q().updateSelection((View) zVar3.f43083b, m5.t0.g(j9), m5.t0.f(j9), iG3, t0Var4 != null ? m5.t0.f(t0Var4.f29650a) : -1);
                    }
                }
            }
        }
    }

    @Override // r5.t
    public final void g() {
        f3 f3Var;
        b0 b0Var = this.f42835a;
        if (b0Var == null || (f3Var = (f3) b5.o.e(b0Var, x1.f7423p)) == null) {
            return;
        }
        ((z1) f3Var).a();
    }

    @Override // r5.t
    public final void h(r5.y yVar, r5.s sVar, m5.q0 q0Var, f2 f2Var, h4.c cVar, h4.c cVar2) {
        h0 h0Var = this.f42837c;
        if (h0Var != null) {
            d0 d0Var = h0Var.f42922m;
            synchronized (d0Var.f42851c) {
                try {
                    d0Var.f42858j = yVar;
                    d0Var.l = sVar;
                    d0Var.f42859k = q0Var;
                    d0Var.f42860m = cVar;
                    d0Var.f42861n = cVar2;
                    if (d0Var.f42853e || d0Var.f42852d) {
                        d0Var.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final y80.e1 i() {
        y80.m1 m1Var = this.f42838d;
        if (m1Var != null) {
            return m1Var;
        }
        if (!u2.d.f40640a) {
            return null;
        }
        y80.m1 m1VarB = y80.r.b(1, 0, x80.a.DROP_LATEST, 2);
        this.f42838d = m1VarB;
        return m1VarB;
    }

    public final void j(bg.a1 a1Var) {
        b0 b0Var = this.f42835a;
        if (b0Var == null) {
            return;
        }
        this.f42836b = b0Var.isAttached() ? v80.f0.B(b0Var.getCoroutineScope(), null, v80.d0.UNDISPATCHED, new tm.d(b0Var, new os.c(a1Var, this, b0Var, b2Var, 17), b2Var, 15), 1) : null;
    }

    public final void k(b0 b0Var) {
        if (!(this.f42835a == b0Var)) {
            c2.a.c("Expected textInputModifierNode to be " + b0Var + " but was " + this.f42835a);
        }
        this.f42835a = null;
    }
}
