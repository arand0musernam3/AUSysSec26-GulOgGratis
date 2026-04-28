package y00;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o3 extends f4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f45044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d1 f45045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1 f45046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d1 f45047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d1 f45048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d1 f45049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d1 f45050k;

    public o3(l4 l4Var) {
        super(l4Var);
        this.f45044e = new HashMap();
        e1 e1Var = ((n1) this.f21216b).f44986e;
        n1.k(e1Var);
        this.f45045f = new d1(e1Var, "last_delete_stale", 0L);
        e1 e1Var2 = ((n1) this.f21216b).f44986e;
        n1.k(e1Var2);
        this.f45046g = new d1(e1Var2, "last_delete_stale_batch", 0L);
        e1 e1Var3 = ((n1) this.f21216b).f44986e;
        n1.k(e1Var3);
        this.f45047h = new d1(e1Var3, "backoff", 0L);
        e1 e1Var4 = ((n1) this.f21216b).f44986e;
        n1.k(e1Var4);
        this.f45048i = new d1(e1Var4, "last_upload", 0L);
        e1 e1Var5 = ((n1) this.f21216b).f44986e;
        n1.k(e1Var5);
        this.f45049j = new d1(e1Var5, "last_upload_attempt", 0L);
        e1 e1Var6 = ((n1) this.f21216b).f44986e;
        n1.k(e1Var6);
        this.f45050k = new d1(e1Var6, "midnight_offset", 0L);
    }

    public final Pair t(t4 t4Var, b2 b2Var) {
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        return (b2Var.i(a2.AD_STORAGE) && t4Var.f45182n) ? u(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair u(String str) {
        AdvertisingIdClient.Info advertisingIdInfo;
        n3 n3Var;
        p();
        n1 n1Var = (n1) this.f21216b;
        vz.b bVar = n1Var.f44992k;
        g gVar = n1Var.f44985d;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f45044e;
        n3 n3Var2 = (n3) map.get(str);
        if (n3Var2 != null && jElapsedRealtime < n3Var2.f45012c) {
            return new Pair(n3Var2.f45010a, Boolean.valueOf(n3Var2.f45011b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jX = gVar.x(str, g0.f44765b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(n1Var.f44982a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (n3Var2 != null && jElapsedRealtime < n3Var2.f45012c + gVar.x(str, g0.f44768c)) {
                    return new Pair(n3Var2.f45010a, Boolean.valueOf(n3Var2.f45011b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e5) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45266n.b(e5, "Unable to get advertising id");
            n3Var = new n3("", jX, false);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        n3Var = id2 != null ? new n3(id2, jX, advertisingIdInfo.isLimitAdTrackingEnabled()) : new n3("", jX, advertisingIdInfo.isLimitAdTrackingEnabled());
        map.put(str, n3Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(n3Var.f45010a, Boolean.valueOf(n3Var.f45011b));
    }

    public final String v(t4 t4Var, b2 b2Var) {
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        if (!b2Var.i(a2.AD_STORAGE) || !t4Var.f45182n) {
            return "";
        }
        p();
        String str2 = (String) u(str).first;
        MessageDigest messageDigestI = r4.I();
        if (messageDigestI == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestI.digest(str2.getBytes())));
    }

    @Override // y00.f4
    public final void s() {
    }
}
