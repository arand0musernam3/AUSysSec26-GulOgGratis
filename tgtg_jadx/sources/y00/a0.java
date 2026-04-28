package y00;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1.e f44575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1.e f44576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44577e;

    public a0(n1 n1Var) {
        super(n1Var);
        this.f44576d = new q1.e(0);
        this.f44575c = new q1.e(0);
    }

    public final void q(long j9, String str) {
        n1 n1Var = (n1) this.f21216b;
        if (str == null || str.length() == 0) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Ad unit id must be a non-empty string");
        } else {
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.y(new a(this, str, j9, 0));
        }
    }

    public final void r(long j9, String str) {
        n1 n1Var = (n1) this.f21216b;
        if (str == null || str.length() == 0) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.a("Ad unit id must be a non-empty string");
        } else {
            l1 l1Var = n1Var.f44988g;
            n1.m(l1Var);
            l1Var.y(new a(this, str, j9, 1));
        }
    }

    public final void s(long j9) {
        d3 d3Var = ((n1) this.f21216b).l;
        n1.l(d3Var);
        a3 a3VarT = d3Var.t(false);
        q1.e eVar = this.f44575c;
        for (String str : (q1.b) eVar.keySet()) {
            u(str, j9 - ((Long) eVar.get(str)).longValue(), a3VarT);
        }
        if (!eVar.isEmpty()) {
            t(j9 - this.f44577e, a3VarT);
        }
        v(j9);
    }

    public final void t(long j9, a3 a3Var) {
        n1 n1Var = (n1) this.f21216b;
        if (a3Var == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45267o.a("Not logging ad exposure. No active activity");
        } else if (j9 < 1000) {
            w0 w0Var2 = n1Var.f44987f;
            n1.m(w0Var2);
            w0Var2.f45267o.b(Long.valueOf(j9), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j9);
            r4.m0(a3Var, bundle, true);
            t2 t2Var = n1Var.f44993m;
            n1.l(t2Var);
            t2Var.w("am", "_xa", bundle);
        }
    }

    public final void u(String str, long j9, a3 a3Var) {
        n1 n1Var = (n1) this.f21216b;
        if (a3Var == null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45267o.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j9 < 1000) {
                w0 w0Var2 = n1Var.f44987f;
                n1.m(w0Var2);
                w0Var2.f45267o.b(Long.valueOf(j9), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j9);
            r4.m0(a3Var, bundle, true);
            t2 t2Var = n1Var.f44993m;
            n1.l(t2Var);
            t2Var.w("am", "_xu", bundle);
        }
    }

    public final void v(long j9) {
        q1.e eVar = this.f44575c;
        Iterator it = ((q1.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j9));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f44577e = j9;
    }
}
