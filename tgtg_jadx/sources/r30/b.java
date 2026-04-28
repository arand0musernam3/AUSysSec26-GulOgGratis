package r30;

import android.os.Bundle;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
import k30.x;
import l20.c;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f37610c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f37611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f37612b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        i0.h(appMeasurementSdk);
        this.f37611a = appMeasurementSdk;
        this.f37612b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (s30.a.f38832c.contains(str) || s30.a.f38831b.contains(str2)) {
            return;
        }
        x xVar = s30.a.f38833d;
        int i11 = xVar.f25928d;
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            boolean zContainsKey = bundle.containsKey((String) xVar.get(i13));
            i13++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (s30.a.f38832c.contains(str)) {
                return;
            }
            x xVar2 = s30.a.f38833d;
            int i14 = xVar2.f25928d;
            while (i12 < i14) {
                boolean zContainsKey2 = bundle.containsKey((String) xVar2.get(i12));
                i12++;
                if (zContainsKey2) {
                    return;
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.f37611a.logEvent(str, str2, bundle);
    }

    public final c b(String str, ub.a aVar) {
        Object mVar;
        if (!s30.a.f38832c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f37612b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f37611a;
                if (zEquals) {
                    mVar = new m(appMeasurementSdk, aVar);
                } else if ("clx".equals(str)) {
                    m1.a aVar2 = new m1.a();
                    aVar2.f28697a = aVar;
                    appMeasurementSdk.a(new s30.b(aVar2, 1));
                    mVar = aVar2;
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    concurrentHashMap.put(str, mVar);
                    return new c(13);
                }
            }
        }
        return null;
    }
}
