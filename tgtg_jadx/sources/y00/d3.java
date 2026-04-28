package y00;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.l6;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile a3 f44679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile a3 f44680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a3 f44681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f44682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l6 f44683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f44684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a3 f44685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a3 f44686k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f44687m;

    public d3(n1 n1Var) {
        super(n1Var);
        this.f44687m = new Object();
        this.f44682g = new ConcurrentHashMap();
    }

    @Override // y00.i0
    public final boolean s() {
        return false;
    }

    public final a3 t(boolean z11) {
        q();
        p();
        a3 a3Var = this.f44681f;
        return (z11 && a3Var == null) ? this.f44686k : a3Var;
    }

    public final String u(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        n1 n1Var = (n1) this.f21216b;
        int length2 = str2.length();
        n1Var.f44985d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        n1Var.f44985d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(y00.a3 r20, y00.a3 r21, long r22, boolean r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.d3.v(y00.a3, y00.a3, long, boolean, android.os.Bundle):void");
    }

    public final void w(l6 l6Var, Bundle bundle) {
        Bundle bundle2;
        if (!((n1) this.f21216b).f44985d.E() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f44682g.put(Integer.valueOf(l6Var.f11591a), new a3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void x(String str, a3 a3Var, boolean z11) {
        a3 a3Var2;
        a3 a3Var3 = this.f44679d == null ? this.f44680e : this.f44679d;
        if (a3Var.f44580b == null) {
            a3Var2 = new a3(a3Var.f44579a, str != null ? u(str) : null, a3Var.f44581c, a3Var.f44583e, a3Var.f44584f, a3Var.f44585g);
        } else {
            a3Var2 = a3Var;
        }
        this.f44680e = this.f44679d;
        this.f44679d = a3Var2;
        n1 n1Var = (n1) this.f21216b;
        n1Var.f44992k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        l1 l1Var = n1Var.f44988g;
        n1.m(l1Var);
        l1Var.y(new b3(this, a3Var2, a3Var3, jElapsedRealtime, z11));
    }

    public final void y(a3 a3Var, boolean z11, long j9) {
        n1 n1Var = (n1) this.f21216b;
        a0 a0Var = n1Var.f44994n;
        n1.j(a0Var);
        n1Var.f44992k.getClass();
        a0Var.s(SystemClock.elapsedRealtime());
        boolean z12 = a3Var != null && a3Var.f44582d;
        u3 u3Var = n1Var.f44989h;
        n1.l(u3Var);
        if (!u3Var.f45213g.r(j9, z12, z11) || a3Var == null) {
            return;
        }
        a3Var.f44582d = false;
    }

    public final a3 z(l6 l6Var) {
        com.google.android.gms.common.internal.i0.h(l6Var);
        Integer numValueOf = Integer.valueOf(l6Var.f11591a);
        ConcurrentHashMap concurrentHashMap = this.f44682g;
        a3 a3Var = (a3) concurrentHashMap.get(numValueOf);
        if (a3Var == null) {
            String strU = u(l6Var.f11592b);
            r4 r4Var = ((n1) this.f21216b).f44990i;
            n1.k(r4Var);
            a3 a3Var2 = new a3(null, strU, r4Var.o0());
            concurrentHashMap.put(numValueOf, a3Var2);
            a3Var = a3Var2;
        }
        return this.f44685j != null ? this.f44685j : a3Var;
    }
}
