package gf;

import ax.f0;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.appsflyer.AdRevenueScheme;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import ye.c0;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements qf.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f20408d = y.W(new String[]{"", "9774d56d682e549c", PaymentMethodTypes.UNKNOWN, "000000000000000", AnalyticsProcessor.CHANNEL_NAME, "DEFACE", "00000000-0000-0000-0000-000000000000"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf.c f20409a = qf.c.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ye.b f20410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f20411c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    @Override // qf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ye.b r8) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.d.a(ye.b):void");
    }

    @Override // qf.d
    public final pf.a b(pf.a aVar) {
        ye.g gVar = c().f45852a;
        if (aVar.f34736c == null) {
            aVar.f34736c = Long.valueOf(System.currentTimeMillis());
        }
        if (aVar.f34739f == null) {
            aVar.f34739f = UUID.randomUUID().toString();
        }
        if (aVar.B == null) {
            aVar.B = "amplitude-analytics-android/1.27.0";
        }
        if (aVar.f34734a == null) {
            aVar.f34734a = (String) c().f45853b.f24502b;
        }
        if (aVar.f34735b == null) {
            aVar.f34735b = (String) c().f45853b.f24503c;
        }
        c0 c0Var = gVar.f45895j;
        f0 f0Var = null;
        if (c0Var.a("version_name")) {
            f0 f0Var2 = this.f20411c;
            if (f0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var2 = null;
            }
            aVar.f34743j = f0Var2.d().f27761c;
        }
        if (c0Var.a("os_name")) {
            f0 f0Var3 = this.f20411c;
            if (f0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var3 = null;
            }
            f0Var3.d().getClass();
            aVar.l = AnalyticsPlatformParams.channel;
        }
        if (c0Var.a("os_version")) {
            f0 f0Var4 = this.f20411c;
            if (f0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var4 = null;
            }
            aVar.f34745m = f0Var4.d().f27762d;
        }
        if (c0Var.a("device_brand")) {
            f0 f0Var5 = this.f20411c;
            if (f0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var5 = null;
            }
            aVar.f34746n = f0Var5.d().f27763e;
        }
        if (c0Var.a("device_manufacturer")) {
            f0 f0Var6 = this.f20411c;
            if (f0Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var6 = null;
            }
            aVar.f34747o = f0Var6.d().f27764f;
        }
        if (c0Var.a("device_model")) {
            f0 f0Var7 = this.f20411c;
            if (f0Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var7 = null;
            }
            aVar.f34748p = f0Var7.d().f27765g;
        }
        if (c0Var.a("carrier")) {
            f0 f0Var8 = this.f20411c;
            if (f0Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var8 = null;
            }
            aVar.f34749q = f0Var8.d().f27766h;
        }
        if (c0Var.a("ip_address") && aVar.C == null) {
            aVar.C = "$remote";
        }
        if (c0Var.a(AdRevenueScheme.COUNTRY) && aVar.C != "$remote") {
            f0 f0Var9 = this.f20411c;
            if (f0Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var9 = null;
            }
            aVar.f34750r = f0Var9.d().f27760b;
        }
        if (c0Var.a("language")) {
            f0 f0Var10 = this.f20411c;
            if (f0Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var10 = null;
            }
            aVar.A = f0Var10.d().f27767i;
        }
        if (c0Var.a("platform")) {
            aVar.f34744k = AnalyticsProcessor.CHANNEL_NAME;
        }
        if (c0Var.a("lat_lng")) {
            f0 f0Var11 = this.f20411c;
            if (f0Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var11 = null;
            }
            f0Var11.getClass();
        }
        if (c0Var.a("adid")) {
            f0 f0Var12 = this.f20411c;
            if (f0Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
                f0Var12 = null;
            }
            String str = f0Var12.d().f27759a;
            if (str != null) {
                aVar.f34756x = str;
            }
        }
        if (c0Var.a("app_set_id")) {
            f0 f0Var13 = this.f20411c;
            if (f0Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contextProvider");
            } else {
                f0Var = f0Var13;
            }
            String str2 = f0Var.d().f27768j;
            if (str2 != null) {
                aVar.f34757y = str2;
            }
        }
        if (aVar.K == null) {
            ye.g gVar2 = c().f45852a;
        }
        if (aVar.D == null) {
            ye.g gVar3 = c().f45852a;
        }
        if (aVar.E == null) {
            ye.g gVar4 = c().f45852a;
        }
        return aVar;
    }

    public final ye.b c() {
        ye.b bVar = this.f20410b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
        return null;
    }

    @Override // qf.d
    public final qf.c getType() {
        return this.f20409a;
    }
}
