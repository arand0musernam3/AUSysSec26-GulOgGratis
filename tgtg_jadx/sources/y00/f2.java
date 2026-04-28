package y00;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f44755b;

    public /* synthetic */ f2(t2 t2Var, int i11) {
        this.f44754a = i11;
        this.f44755b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44754a) {
            case 0:
                this.f44755b.M();
                break;
            case 1:
                m1 m1Var = this.f44755b.f45162r;
                n1 n1Var = m1Var.f44957a;
                l1 l1Var = n1Var.f44988g;
                t2 t2Var = n1Var.f44993m;
                e1 e1Var = n1Var.f44986e;
                n1.m(l1Var);
                l1Var.p();
                if (m1Var.d()) {
                    if (m1Var.b()) {
                        n1.k(e1Var);
                        e1Var.f44727x.j(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        n1.l(t2Var);
                        t2Var.w("auto", "_cmpx", bundle);
                    } else {
                        n1.k(e1Var);
                        c40.q qVar = e1Var.f44727x;
                        String strI = qVar.i();
                        if (TextUtils.isEmpty(strI)) {
                            w0 w0Var = n1Var.f44987f;
                            n1.m(w0Var);
                            w0Var.f45261h.a("Cache still valid but referrer not found");
                        } else {
                            long jA = e1Var.f44728y.a() / 3600000;
                            Uri uri = Uri.parse(strI);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            n1.l(t2Var);
                            t2Var.w(str2, "_cmp", (Bundle) pair.second);
                        }
                        qVar.j(null);
                    }
                    n1.k(e1Var);
                    e1Var.f44728y.b(0L);
                    break;
                }
                break;
            case 2:
                t2 t2Var2 = this.f44755b;
                t2Var2.p();
                n1 n1Var2 = (n1) t2Var2.f21216b;
                e1 e1Var2 = n1Var2.f44986e;
                w0 w0Var2 = n1Var2.f44987f;
                n1.k(e1Var2);
                g9.i iVar = e1Var2.f44724u;
                if (iVar.b()) {
                    n1.m(w0Var2);
                    w0Var2.f45266n.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    d1 d1Var = e1Var2.f44725v;
                    long jA2 = d1Var.a();
                    d1Var.b(1 + jA2);
                    if (jA2 >= 5) {
                        n1.m(w0Var2);
                        w0Var2.f45263j.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        iVar.c(true);
                    } else {
                        if (t2Var2.f45164t == null) {
                            t2Var2.f45164t = new g2(t2Var2, n1Var2, 3);
                        }
                        t2Var2.f45164t.b(0L);
                    }
                }
                break;
            default:
                this.f44755b.M();
                break;
        }
    }
}
