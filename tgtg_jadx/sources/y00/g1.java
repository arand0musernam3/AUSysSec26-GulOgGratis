package y00;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.z9;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f44823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44824c;

    public /* synthetic */ g1(h1 h1Var, String str, int i11) {
        this.f44822a = i11;
        this.f44823b = h1Var;
        this.f44824c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f44822a) {
            case 0:
                return new z9(new g1(this.f44823b, this.f44824c, 1));
            case 1:
                h1 h1Var = this.f44823b;
                m mVar = h1Var.f44586c.f44922c;
                l4.U(mVar);
                String str = this.f44824c;
                b1 b1VarT0 = mVar.t0(str);
                HashMap map = new HashMap();
                map.put("platform", AnalyticsPlatformParams.channel);
                map.put("package_name", str);
                ((n1) h1Var.f21216b).f44985d.v();
                map.put("gmp_version", 161000L);
                if (b1VarT0 != null) {
                    String strO = b1VarT0.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(b1VarT0.Q()));
                    map.put("dynamite_version", Long.valueOf(b1VarT0.b()));
                }
                return map;
            default:
                ub.a aVar = new ub.a(this.f44823b, this.f44824c, false, 23);
                mb mbVar = new mb("internal.remoteConfig", 0);
                mbVar.f11277b.put("getValue", new z9(mbVar, aVar));
                return mbVar;
        }
    }
}
