package f0;

import java.util.Set;
import kotlin.Unit;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f16556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f16557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f4 f16558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b5.j1 f16559d;

    public a(h hVar, Set set, v80.b0 b0Var, c50.p pVar) {
        hVar.getClass();
        set.getClass();
        b0Var.getClass();
        this.f16556a = hVar;
        this.f16557b = set;
        ep.l lVar = new ep.l(1, pVar, this);
        b0Var.getClass();
        b5.j1 j1Var = new b5.j1();
        j1Var.f5849c = b0Var;
        j1Var.f5850d = lVar;
        Object obj = new Object();
        j1Var.f5851e = obj;
        synchronized (obj) {
            j1Var.f5852f = v80.f0.B(b0Var, null, null, new a3.b2(j1Var, null, 29), 3);
        }
        this.f16559d = j1Var;
        v80.f0.B(b0Var, null, null, new a3.b2(this, null, 16), 3);
    }

    public final h0.e a() {
        b5.j1 j1Var = this.f16559d;
        synchronized (j1Var.f5851e) {
            try {
                if (j1Var.f5848b) {
                    return null;
                }
                int i11 = j1Var.f5847a + 1;
                j1Var.f5847a = i11;
                if (i11 == 1) {
                    v80.b2 b2Var = (v80.b2) j1Var.f5852f;
                    if (b2Var != null) {
                        b2Var.a(null);
                    }
                    j1Var.f5852f = null;
                }
                return new h0.e(j1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object b(z70.c cVar) {
        Object objP = y80.r.p(this.f16556a.f16705u, new bm.o(2, null, 5), cVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objP != aVar) {
            objP = Unit.f26487a;
        }
        return objP == aVar ? objP : Unit.f26487a;
    }

    public final void c() {
        this.f16559d.d();
        this.f16556a.a();
    }

    public final Unit d(f4 f4Var, h0.e eVar) {
        Unit unit;
        f4 f4Var2 = this.f16558c;
        this.f16558c = f4Var;
        x70.c cVar = null;
        if (f4Var2 != null) {
            f4Var2.a(null);
        }
        y80.a2 a2Var = this.f16556a.f16705u;
        synchronized (f4Var.f16663e) {
            if (f4Var.f16664f) {
                eVar.b();
                unit = Unit.f26487a;
            } else {
                f4Var.f16669k = v80.f0.B(f4Var.f16661c, null, null, new d8.c(a2Var, f4Var, cVar, 19), 3);
                f4Var.l = eVar;
                unit = Unit.f26487a;
            }
        }
        return unit == y70.a.COROUTINE_SUSPENDED ? unit : Unit.f26487a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveCamera(cameraId=");
        sb2.append((Object) e0.s.b(this.f16556a.f16686a));
        sb2.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        sb2.append(string);
        return sb2.toString();
    }
}
