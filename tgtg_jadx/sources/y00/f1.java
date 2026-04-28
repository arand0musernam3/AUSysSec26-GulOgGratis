package y00;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44752a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f44753b;

    public f1(l4 l4Var) {
        this.f44753b = l4Var.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f44752a) {
            case 0:
                n1 n1Var = this.f44753b;
                boolean z11 = false;
                try {
                    ky.b bVarA = xz.c.a(n1Var.f44982a);
                    if (bVarA == null) {
                        w0 w0Var = n1Var.f44987f;
                        n1.m(w0Var);
                        w0Var.f45267o.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        n1Var = n1Var;
                    } else {
                        int i11 = bVarA.d(128, "com.android.vending").versionCode;
                        n1Var = i11;
                        if (i11 >= 80837300) {
                            z11 = true;
                            n1Var = i11;
                        }
                    }
                    break;
                } catch (Exception e5) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45267o.b(e5, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z11;
            default:
                w0 w0Var3 = this.f44753b.f44987f;
                n1.m(w0Var3);
                return Log.isLoggable(w0Var3.z(), 3);
        }
    }

    public f1(e2 e2Var, n1 n1Var) {
        this.f44753b = n1Var;
    }
}
