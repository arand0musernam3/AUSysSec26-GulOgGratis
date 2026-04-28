package w2;

import a3.l3;
import android.view.autofill.AutofillValue;
import b5.l2;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b5.n implements l2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r5.e0 f42998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r5.y f42999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m2.e1 f43000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f43002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r5.s f43003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l3 f43004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r5.m f43005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g4.v f43006y;

    public static void O0(m2.e1 e1Var, String str, boolean z11, boolean z12) {
        if (z11 || !z12) {
            return;
        }
        r5.d0 d0Var = e1Var.f28822e;
        m2.j0 j0Var = e1Var.f28838v;
        if (d0Var == null) {
            int length = str.length();
            j0Var.invoke(new r5.y(4, m5.k0.b(length, length), str));
        } else {
            r5.y yVarA = e1Var.f28821d.a(kotlin.collections.d0.h(new r5.d(), new r5.a(str, 1)));
            d0Var.a(null, yVarA);
            j0Var.invoke(yVarA);
        }
    }

    @Override // b5.l2
    public final boolean F0() {
        return true;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        m5.h hVar = this.f42999r.f37714a;
        KProperty[] kPropertyArr = j5.z.f24734a;
        j5.a0 a0Var = j5.x.E;
        KProperty[] kPropertyArr2 = j5.z.f24734a;
        KProperty kProperty = kPropertyArr2[18];
        b0Var.b(a0Var, hVar);
        m5.h hVar2 = this.f42998q.f37669a;
        j5.a0 a0Var2 = j5.x.F;
        KProperty kProperty2 = kPropertyArr2[19];
        b0Var.b(a0Var2, hVar2);
        long j9 = this.f42999r.f37715b;
        j5.a0 a0Var3 = j5.x.G;
        KProperty kProperty3 = kPropertyArr2[20];
        b0Var.b(a0Var3, new m5.t0(j9));
        j5.z.g(b0Var, c4.m.f7039a);
        j5.z.j(b0Var, new c4.g(AutofillValue.forText(this.f42999r.f37714a)));
        boolean z11 = false;
        j5.z.d(b0Var, new n(this, 0));
        int i11 = this.f43005x.f37692d;
        if (i11 == 6) {
            c4.o.f7045a.getClass();
            j5.z.i(b0Var, c4.n.f7043c);
        } else if (i11 == 7 || i11 == 8) {
            c4.o.f7045a.getClass();
            j5.z.i(b0Var, c4.n.f7042b);
        } else if (i11 == 4) {
            c4.o.f7045a.getClass();
            j5.z.i(b0Var, c4.n.f7044d);
        }
        if (!this.f43002u) {
            b0Var.b(j5.x.f24715i, Unit.f26487a);
        }
        if (this.f43002u && !this.f43001t) {
            z11 = true;
        }
        j5.a0 a0Var4 = j5.x.N;
        KProperty kProperty4 = kPropertyArr2[26];
        b0Var.b(a0Var4, Boolean.valueOf(z11));
        j5.z.a(b0Var, new n(this, 1));
        if (z11) {
            b0Var.b(j5.m.f24667k, new j5.a(null, new n(this, 2)));
            b0Var.b(j5.m.f24670o, new j5.a(null, new n(this, b0Var)));
        }
        b0Var.b(j5.m.f24666j, new j5.a(null, new tq.c(this, 5)));
        j5.z.e(b0Var, this.f43005x.f37693e, new m(this, 6));
        j5.z.c(b0Var, new m(this, 7));
        j5.z.f(b0Var, null, new m(this, 1));
        if (!m5.t0.d(this.f42999r.f37715b)) {
            b0Var.b(j5.m.f24672q, new j5.a(null, new m(this, 2)));
            if (this.f43002u && !this.f43001t) {
                b0Var.b(j5.m.f24673r, new j5.a(null, new m(this, 3)));
            }
        }
        if (!this.f43002u || this.f43001t) {
            return;
        }
        b0Var.b(j5.m.f24674s, new j5.a(null, new m(this, 5)));
    }
}
