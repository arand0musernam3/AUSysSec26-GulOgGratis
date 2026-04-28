package y00;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f44957a;

    public /* synthetic */ m1(n1 n1Var) {
        this.f44957a = n1Var;
    }

    public void a(Bundle bundle, String str) {
        String string;
        n1 n1Var = this.f44957a;
        l1 l1Var = n1Var.f44988g;
        e1 e1Var = n1Var.f44986e;
        n1.m(l1Var);
        l1Var.p();
        if (n1Var.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        n1.k(e1Var);
        e1Var.f44727x.j(string);
        d1 d1Var = e1Var.f44728y;
        n1Var.f44992k.getClass();
        d1Var.b(System.currentTimeMillis());
    }

    public boolean b() {
        if (!d()) {
            return false;
        }
        n1 n1Var = this.f44957a;
        n1Var.f44992k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e1 e1Var = n1Var.f44986e;
        n1.k(e1Var);
        return jCurrentTimeMillis - e1Var.f44728y.a() > n1Var.f44985d.x(null, g0.f44787i0);
    }

    @Override // y00.v2, y00.y0
    public /* synthetic */ void c(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.f44957a.i(i11, th2, bArr);
    }

    public boolean d() {
        e1 e1Var = this.f44957a.f44986e;
        n1.k(e1Var);
        return e1Var.f44728y.a() > 0;
    }
}
