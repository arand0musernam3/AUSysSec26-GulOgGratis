package o4;

import i4.g0;
import i4.v0;
import i4.w;
import jd.f;
import n80.p;
import q1.t0;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n4.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f31949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f31950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k8.d f31951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31952i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f31953j;

    public b(v0 v0Var, d dVar, k8.d dVar2) {
        this.f31949f = v0Var;
        this.f31950g = dVar;
        this.f31951h = dVar2;
        m mVar = m.Ltr;
    }

    @Override // n4.b
    public final boolean a(float f11) {
        this.f31952i = f11;
        return true;
    }

    @Override // n4.b
    public final boolean e(w wVar) {
        this.f31953j = wVar;
        return true;
    }

    @Override // n4.b
    public final long h() {
        return 9205357640488583168L;
    }

    @Override // n4.b
    public final void i(k4.d dVar) {
        c cVar;
        k8.d dVar2 = this.f31951h;
        v0 v0Var = this.f31949f;
        long jD = dVar.d();
        m layoutDirection = dVar.getLayoutDirection();
        d dVar3 = this.f31950g;
        synchronized (dVar2) {
            a aVar = (a) dVar2.f26135c;
            if (aVar == null) {
                a aVar2 = new a(g0.f23254b, 0L, m.Ltr, 1.0f, null);
                dVar2.f26135c = aVar2;
                aVar = aVar2;
            }
            aVar.f31944a = v0Var;
            aVar.f31945b = jD;
            aVar.f31946c = layoutDirection;
            aVar.f31947d = dVar.a();
            aVar.f31948e = new d(dVar3.f31965a, dVar3.f31966b, 0L, dVar3.f31969e, dVar3.f31970f, dVar3.f31968d);
            t0 t0Var = (t0) dVar2.f26134b;
            if (t0Var == null) {
                t0Var = new t0();
                dVar2.f26134b = t0Var;
            }
            cVar = (c) t0Var.d(aVar);
            if (cVar == null) {
                cVar = new c(dVar3, v0Var.a(jD, layoutDirection, dVar));
                t0 t0Var2 = (t0) dVar2.f26134b;
                if (t0Var2 == null) {
                    t0Var2 = new t0();
                    dVar2.f26134b = t0Var2;
                }
                t0Var2.m(new a(aVar.f31944a, aVar.f31945b, aVar.f31946c, aVar.f31947d, aVar.f31948e), cVar);
            }
        }
        float fC0 = dVar.c0(Float.intBitsToFloat((int) (this.f31950g.f31967c >> 32)));
        float fC02 = dVar.c0(Float.intBitsToFloat((int) (this.f31950g.f31967c & 4294967295L)));
        ((f) dVar.g0().f24502b).r(fC0, fC02);
        try {
            w wVar = this.f31953j;
            long jD2 = dVar.d();
            d dVar4 = cVar.f31962i;
            cVar.a(dVar, wVar, jD2, dVar4.f31969e, p.b(this.f31952i * dVar4.f31970f, 0.0f, 1.0f), cVar.f31962i.f31968d);
        } finally {
            ((f) dVar.g0().f24502b).r(-fC0, -fC02);
        }
    }
}
