package y00;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f45109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45111f;

    public r1(d3 d3Var, Bundle bundle, a3 a3Var, a3 a3Var2, long j9) {
        this.f45106a = 2;
        this.f45107b = bundle;
        this.f45108c = a3Var;
        this.f45110e = a3Var2;
        this.f45109d = j9;
        Objects.requireNonNull(d3Var);
        this.f45111f = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45106a) {
            case 0:
                String str = (String) this.f45108c;
                v1 v1Var = (v1) this.f45111f;
                String str2 = (String) this.f45107b;
                if (str2 != null) {
                    a3 a3Var = new a3((String) this.f45110e, str2, this.f45109d);
                    l4 l4Var = v1Var.f45249g;
                    l4Var.d().p();
                    String str3 = l4Var.G;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    l4Var.G = str;
                    l4Var.F = a3Var;
                } else {
                    l4 l4Var2 = v1Var.f45249g;
                    l4Var2.d().p();
                    String str4 = l4Var2.G;
                    if (str4 == null || str4.equals(str)) {
                        l4Var2.G = str;
                        l4Var2.F = null;
                    }
                }
                break;
            case 1:
                t2 t2Var = (t2) this.f45111f;
                String str5 = (String) this.f45107b;
                String str6 = (String) this.f45108c;
                t2Var.A(this.f45109d, this.f45110e, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) this.f45107b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                d3 d3Var = (d3) this.f45111f;
                r4 r4Var = ((n1) d3Var.f21216b).f44990i;
                n1.k(r4Var);
                d3Var.v((a3) this.f45108c, (a3) this.f45110e, this.f45109d, true, r4Var.z("screen_view", bundle, null, false));
                break;
        }
    }

    public /* synthetic */ r1(Object obj, String str, String str2, Object obj2, long j9, int i11) {
        this.f45106a = i11;
        this.f45107b = str;
        this.f45108c = str2;
        this.f45110e = obj2;
        this.f45109d = j9;
        this.f45111f = obj;
    }
}
