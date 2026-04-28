package od;

import a3.j0;
import a3.k0;
import a3.n0;
import a3.o;
import a3.s2;
import a3.t2;
import android.os.Bundle;
import android.os.SystemClock;
import co.datadome.sdk.x;
import com.braze.h2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;
import t1.p0;
import t1.x1;
import t1.z1;
import y00.d1;
import y00.d3;
import y00.e1;
import y00.g0;
import y00.n1;
import y00.r4;
import y00.t3;
import y00.u3;
import y00.w0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements x1, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32443d;

    public f(x xVar, long j9) {
        this.f32443d = xVar;
        this.f32442c = new LinkedHashMap(0, 0.75f, true);
        this.f32440a = j9;
        if (j9 > 0) {
            return;
        }
        i4.a.f("maxSize <= 0");
        throw null;
    }

    @Override // t1.x1
    public boolean a() {
        return true;
    }

    @Override // t1.x1
    public long b(t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return LongCompanionObject.MAX_VALUE;
    }

    public void c(Object obj, Object obj2, e eVar) {
        e eVar2 = (e) obj2;
        ((h) ((x) this.f32443d).f8719b).f((a) obj, eVar2.f32437a, eVar2.f32438b, eVar2.f32439c);
    }

    @Override // a3.o
    public boolean d(long j9) {
        z zVar = (z) ((z2.h) this.f32442c).invoke();
        if (zVar == null) {
            return true;
        }
        s2 s2Var = (s2) this.f32443d;
        long j11 = this.f32441b;
        if (!zVar.n() || !t2.a(s2Var, j11)) {
            return false;
        }
        if (!s2Var.b(zVar, j9, this.f32440a, k0.f431d, false)) {
            return true;
        }
        this.f32440a = j9;
        return true;
    }

    @Override // t1.x1
    public t1.o e(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return ((z1) this.f32442c).e(j(j9), oVar, oVar2, n(j9, oVar, oVar3, oVar2));
    }

    @Override // a3.o
    public void f() {
        n0 n0Var = ((s2) this.f32443d).f564h;
        if (n0Var != null) {
            n0Var.invoke();
        }
    }

    @Override // a3.o
    public boolean g(long j9, j0 j0Var, int i11) {
        z zVar = (z) ((z2.h) this.f32442c).invoke();
        if (zVar == null) {
            return false;
        }
        s2 s2Var = (s2) this.f32443d;
        long j11 = this.f32441b;
        if (!zVar.n()) {
            return false;
        }
        a3.z1 z1Var = s2Var.f562f;
        if (z1Var != null) {
            z1Var.invoke(Boolean.FALSE, zVar, new h4.b(j9), j0Var);
        }
        this.f32440a = j9;
        return t2.a(s2Var, j11);
    }

    @Override // a3.o
    public boolean h(long j9, j0 j0Var) {
        z zVar = (z) ((z2.h) this.f32442c).invoke();
        if (zVar == null) {
            return true;
        }
        s2 s2Var = (s2) this.f32443d;
        long j11 = this.f32441b;
        if (!zVar.n() || !t2.a(s2Var, j11)) {
            return false;
        }
        if (!s2Var.b(zVar, j9, this.f32440a, j0Var, false)) {
            return true;
        }
        this.f32440a = j9;
        return true;
    }

    public long i() {
        if (this.f32441b == -1) {
            long jO = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f32442c).entrySet()) {
                jO += o(entry.getKey(), entry.getValue());
            }
            this.f32441b = jO;
        }
        return this.f32441b;
    }

    public long j(long j9) {
        long j11 = this.f32441b;
        if (j9 + j11 <= 0) {
            return 0L;
        }
        long j12 = j9 + j11;
        long j13 = this.f32440a;
        long j14 = j12 / j13;
        return (((p0) this.f32443d) == p0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    @Override // a3.o
    public boolean l(long j9) {
        z zVar = (z) ((z2.h) this.f32442c).invoke();
        if (zVar == null) {
            return false;
        }
        s2 s2Var = (s2) this.f32443d;
        long j11 = this.f32441b;
        if (!zVar.n()) {
            return false;
        }
        if (s2Var.b(zVar, j9, this.f32440a, k0.f431d, false)) {
            this.f32440a = j9;
        }
        return t2.a(s2Var, j11);
    }

    @Override // t1.x1
    public t1.o m(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return ((z1) this.f32442c).m(j(j9), oVar, oVar2, n(j9, oVar, oVar3, oVar2));
    }

    public t1.o n(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        long j11 = this.f32441b;
        long j12 = j9 + j11;
        long j13 = this.f32440a;
        return j12 > j13 ? ((z1) this.f32442c).m(j13 - j11, oVar, oVar3, oVar2) : oVar2;
    }

    public long o(Object obj, Object obj2) throws Exception {
        try {
            long j9 = ((e) obj2).f32439c;
            if (j9 >= 0) {
                return j9;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j9).toString());
        } catch (Exception e5) {
            this.f32441b = -1L;
            throw e5;
        }
    }

    public void p(long j9) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f32442c;
        while (i() > j9) {
            if (linkedHashMap.isEmpty()) {
                if (i() == 0) {
                    return;
                }
                h2.b("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.N(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.f32441b = i() - o(key, value);
                c(key, value, null);
            }
        }
    }

    public boolean r(long j9, boolean z11, boolean z12) {
        u3 u3Var = (u3) this.f32443d;
        u3Var.p();
        u3Var.q();
        n1 n1Var = (n1) u3Var.f21216b;
        boolean zE = n1Var.e();
        w0 w0Var = n1Var.f44987f;
        if (zE) {
            e1 e1Var = n1Var.f44986e;
            n1.k(e1Var);
            d1 d1Var = e1Var.f44720q;
            n1Var.f44992k.getClass();
            d1Var.b(System.currentTimeMillis());
        }
        long j11 = j9 - this.f32440a;
        if (!z11 && j11 < 1000) {
            n1.m(w0Var);
            w0Var.f45267o.b(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z12) {
            j11 = j9 - this.f32441b;
            this.f32441b = j9;
        }
        n1.m(w0Var);
        w0Var.f45267o.b(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z13 = !n1Var.f44985d.E();
        d3 d3Var = n1Var.l;
        n1.l(d3Var);
        r4.m0(d3Var.t(z13), bundle, true);
        if (!z12) {
            y00.t2 t2Var = n1Var.f44993m;
            n1.l(t2Var);
            t2Var.w("auto", "_e", bundle);
        }
        this.f32440a = j9;
        t3 t3Var = (t3) this.f32442c;
        t3Var.c();
        t3Var.b(((Long) g0.f44802p0.a(null)).longValue());
        return true;
    }

    public f(u3 u3Var) {
        this.f32443d = u3Var;
        n1 n1Var = (n1) u3Var.f21216b;
        this.f32442c = new t3(this, n1Var, 0);
        n1Var.f44992k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f32440a = jElapsedRealtime;
        this.f32441b = jElapsedRealtime;
    }

    public f(z2.h hVar, s2 s2Var, long j9) {
        this.f32442c = hVar;
        this.f32443d = s2Var;
        this.f32441b = j9;
        this.f32440a = 0L;
    }

    public f(z1 z1Var, p0 p0Var, long j9) {
        this.f32442c = z1Var;
        this.f32443d = p0Var;
        this.f32440a = ((long) (z1Var.t() + z1Var.q())) * 1000000;
        this.f32441b = j9 * 1000000;
    }
}
