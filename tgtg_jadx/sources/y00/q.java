package y00;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f45079g;

    public q(n1 n1Var, String str, String str2, String str3, long j9, long j11, long j12, Bundle bundle) {
        t tVar;
        com.google.android.gms.common.internal.i0.e(str2);
        com.google.android.gms.common.internal.i0.e(str3);
        this.f45073a = str2;
        this.f45074b = str3;
        this.f45075c = true == TextUtils.isEmpty(str) ? null : str;
        this.f45076d = j9;
        this.f45077e = j11;
        this.f45078f = j12;
        if (j12 != 0 && j12 > j9) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.b(w0.x(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.a("Param name can't be null");
                    it.remove();
                } else {
                    r4 r4Var = n1Var.f44990i;
                    n1.k(r4Var);
                    Object objY = r4Var.y(bundle2.get(next), next);
                    if (objY == null) {
                        w0 w0Var3 = n1Var.f44987f;
                        n1.m(w0Var3);
                        w0Var3.f45263j.b(n1Var.f44991j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        r4 r4Var2 = n1Var.f44990i;
                        n1.k(r4Var2);
                        r4Var2.G(bundle2, next, objY);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.f45079g = tVar;
    }

    public final q a(n1 n1Var, long j9) {
        return new q(n1Var, this.f45075c, this.f45073a, this.f45074b, this.f45076d, this.f45077e, j9, this.f45079g);
    }

    public final String toString() {
        String string = this.f45079g.toString();
        String str = this.f45073a;
        int length = String.valueOf(str).length();
        String str2 = this.f45074b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        j4.s.A(sb2, "Event{appId='", str, "', name='", str2);
        return e0.f.n(sb2, "', params=", string, "}");
    }

    public q(n1 n1Var, String str, String str2, String str3, long j9, long j11, long j12, t tVar) {
        com.google.android.gms.common.internal.i0.e(str2);
        com.google.android.gms.common.internal.i0.e(str3);
        com.google.android.gms.common.internal.i0.h(tVar);
        this.f45073a = str2;
        this.f45074b = str3;
        this.f45075c = true == TextUtils.isEmpty(str) ? null : str;
        this.f45076d = j9;
        this.f45077e = j11;
        this.f45078f = j12;
        if (j12 != 0 && j12 > j9) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45263j.c("Event created with reverse previous/current timestamps. appId, name", w0.x(str2), w0.x(str3));
        }
        this.f45079g = tVar;
    }
}
