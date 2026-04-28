package w;

import android.os.Looper;
import android.util.Log;
import androidx.core.util.Consumer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42728a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jd.f f42729b = new jd.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.o0 f42730c = new androidx.lifecycle.o0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0.b f42731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0.h0 f42732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0.e f42733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f42735h;

    public o() {
        s0.h0 h0Var = s0.h0.CLOSED;
        this.f42732e = h0Var;
        this.f42735h = new LinkedHashMap();
        c(h0Var, null);
    }

    public final void a(i0.b bVar, e0.q0 q0Var) {
        l lVar;
        e0.n0 n0Var = e0.n0.f15383b;
        e0.n0 n0Var2 = e0.n0.f15384c;
        if (!Intrinsics.areEqual(bVar, this.f42731d)) {
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + q0Var + " for " + bVar);
                return;
            }
            return;
        }
        s0.h0 h0Var = this.f42732e;
        h0Var.getClass();
        q0Var.getClass();
        int i11 = n.$EnumSwitchMapping$0[h0Var.ordinal()];
        l lVar2 = null;
        if (i11 != 1) {
            e0.p0 p0Var = e0.p0.f15396b;
            e0.o0 o0Var = e0.o0.f15388b;
            if (i11 == 2) {
                if (Intrinsics.areEqual(q0Var, n0Var)) {
                    lVar = new l(s0.h0.OPEN, null);
                } else if (q0Var instanceof e0.m0) {
                    e0.m0 m0Var = (e0.m0) q0Var;
                    int i12 = m0Var.f15366b;
                    lVar2 = m0Var.f15367c ? new l(s0.h0.OPENING, u00.d.P(i12)) : u00.d.G(i12) ? new l(s0.h0.PENDING_OPEN, u00.d.P(i12)) : new l(s0.h0.CLOSING, u00.d.P(i12));
                } else if (Intrinsics.areEqual(q0Var, p0Var)) {
                    lVar = new l(s0.h0.CLOSING, null);
                } else if (Intrinsics.areEqual(q0Var, o0Var)) {
                    lVar = new l(s0.h0.CLOSED, null);
                }
                lVar2 = lVar;
            } else if (i11 == 3) {
                if (Intrinsics.areEqual(q0Var, p0Var)) {
                    lVar = new l(s0.h0.CLOSING, null);
                } else if (Intrinsics.areEqual(q0Var, o0Var)) {
                    lVar = new l(s0.h0.CLOSED, null);
                } else if (q0Var instanceof e0.m0) {
                    int i13 = ((e0.m0) q0Var).f15366b;
                    lVar2 = u00.d.G(i13) ? new l(s0.h0.PENDING_OPEN, u00.d.P(i13)) : new l(s0.h0.CLOSED, u00.d.P(i13));
                }
                lVar2 = lVar;
            } else if (i11 == 4) {
                if (Intrinsics.areEqual(q0Var, o0Var)) {
                    lVar = new l(s0.h0.CLOSED, null);
                } else if (Intrinsics.areEqual(q0Var, n0Var2)) {
                    lVar = new l(s0.h0.OPENING, null);
                } else if (q0Var instanceof e0.m0) {
                    lVar2 = new l(s0.h0.CLOSING, u00.d.P(((e0.m0) q0Var).f15366b));
                }
                lVar2 = lVar;
            } else if (i11 == 5) {
                if (Intrinsics.areEqual(q0Var, n0Var2)) {
                    lVar = new l(s0.h0.OPENING, null);
                } else if (Intrinsics.areEqual(q0Var, n0Var)) {
                    lVar = new l(s0.h0.OPEN, null);
                } else if (q0Var instanceof e0.m0) {
                    int i14 = ((e0.m0) q0Var).f15366b;
                    lVar2 = u00.d.G(i14) ? new l(s0.h0.PENDING_OPEN, u00.d.P(i14)) : new l(s0.h0.CLOSED, u00.d.P(i14));
                }
                lVar2 = lVar;
            }
        } else {
            if (Intrinsics.areEqual(q0Var, n0Var2)) {
                lVar = new l(s0.h0.OPENING, null);
            } else if (Intrinsics.areEqual(q0Var, n0Var)) {
                lVar = new l(s0.h0.OPEN, null);
            }
            lVar2 = lVar;
        }
        if (lVar2 == null) {
            if (wd.a.B(5, "CXCP")) {
                Log.w("CXCP", "Impermissible state transition: current camera internal state: " + this.f42732e + ", received graph state: " + q0Var);
                return;
            }
            return;
        }
        this.f42732e = lVar2.f42714a;
        this.f42733f = lVar2.f42715b;
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Updated current camera internal state to " + lVar2);
        }
        c(this.f42732e, this.f42733f);
    }

    public final void b(i0.b bVar, e0.q0 q0Var) {
        bVar.getClass();
        q0Var.getClass();
        synchronized (this.f42728a) {
            if (this.f42734g) {
                if (wd.a.B(5, "CXCP")) {
                    Log.w("CXCP", "Ignoring graph state update " + q0Var + " on removed camera.");
                }
                return;
            }
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", bVar + " state updated to " + q0Var);
            }
            a(bVar, q0Var);
        }
    }

    public final void c(s0.h0 h0Var, m0.e eVar) {
        m0.t tVar;
        List<Map.Entry> listR0;
        ((androidx.lifecycle.o0) this.f42729b.f24983b).i(new fd.j(h0Var, 3));
        h0Var.getClass();
        int i11 = m.$EnumSwitchMapping$0[h0Var.ordinal()];
        if (i11 == 1) {
            tVar = m0.t.CLOSED;
        } else if (i11 == 2) {
            tVar = m0.t.OPENING;
        } else if (i11 == 3) {
            tVar = m0.t.OPEN;
        } else if (i11 == 4) {
            tVar = m0.t.CLOSING;
        } else {
            if (i11 != 5) {
                j4.d.o(h0Var, "Unexpected CameraInternal state: ");
                return;
            }
            tVar = m0.t.PENDING_OPEN;
        }
        m0.d dVar = new m0.d(tVar, eVar);
        androidx.lifecycle.o0 o0Var = this.f42730c;
        o0Var.getClass();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o0Var.k(dVar);
        } else {
            o0Var.i(dVar);
        }
        synchronized (this.f42728a) {
            listR0 = CollectionsKt.r0(this.f42735h.entrySet());
        }
        for (Map.Entry entry : listR0) {
            ((Executor) entry.getValue()).execute(new v30.a(3, (Consumer) entry.getKey(), dVar));
        }
    }
}
