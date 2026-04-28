package m2;

import c5.f3;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public final m3.k1 A;
    public final m3.k1 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k1 f28818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.w1 f28819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f3 f28820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r5.h f28821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r5.d0 f28822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.k1 f28823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.k1 f28824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z4.z f28825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.k1 f28826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m5.h f28827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.k1 f28828k;
    public final m3.k1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.k1 f28829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m3.k1 f28830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m3.k1 f28831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f28832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3.k1 f28833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f28834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m3.k1 f28835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m3.k1 f28836t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Function1 f28837u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j0 f28838v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f28839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j0 f28840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0.w f28841y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f28842z;

    public e1(k1 k1Var, m3.w1 w1Var, f3 f3Var) {
        this.f28818a = k1Var;
        this.f28819b = w1Var;
        this.f28820c = f3Var;
        r5.h hVar = new r5.h();
        m5.h hVar2 = m5.i.f29541a;
        long j9 = m5.t0.f29648b;
        r5.y yVar = new r5.y(hVar2, j9, (m5.t0) null);
        hVar.f37674a = yVar;
        hVar.f37675b = new r5.i(hVar2, yVar.f37715b);
        this.f28821d = hVar;
        Boolean bool = Boolean.FALSE;
        this.f28823f = m3.i.w(bool);
        this.f28824g = m3.i.w(new z5.f(0));
        this.f28826i = m3.i.w(null);
        this.f28828k = m3.i.w(u0.None);
        this.l = m3.i.w(bool);
        this.f28829m = m3.i.w(bool);
        this.f28830n = m3.i.w(bool);
        this.f28831o = m3.i.w(bool);
        this.f28832p = true;
        this.f28833q = m3.i.w(Boolean.TRUE);
        this.f28834r = new b1(f3Var);
        this.f28835s = m3.i.w(bool);
        this.f28836t = m3.i.w(bool);
        this.f28837u = new k9.f(26);
        this.f28838v = new j0(this, 2);
        this.f28839w = new j0(this, 3);
        this.f28840x = new j0(this, 4);
        this.f28841y = i4.g0.g();
        this.f28842z = i4.v.f23315h;
        this.A = m3.i.w(new m5.t0(j9));
        this.B = m3.i.w(new m5.t0(j9));
    }

    public final u0 a() {
        return (u0) this.f28828k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f28823f.getValue()).booleanValue();
    }

    public final z4.z c() {
        z4.z zVar = this.f28825h;
        if (zVar == null || !zVar.n()) {
            return null;
        }
        return zVar;
    }

    public final a2 d() {
        return (a2) this.f28826i.getValue();
    }

    public final void e(long j9) {
        this.B.setValue(new m5.t0(j9));
    }

    public final void f(long j9) {
        this.A.setValue(new m5.t0(j9));
    }
}
