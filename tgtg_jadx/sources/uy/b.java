package uy;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AdRevenueScheme;
import com.braze.h2;
import com.google.android.gms.internal.measurement.te;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import jd.f;
import o40.d;
import vy.a0;
import vy.b0;
import vy.c;
import vy.c0;
import vy.d0;
import vy.e;
import vy.e0;
import vy.f0;
import vy.g0;
import vy.h;
import vy.h0;
import vy.i;
import vy.i0;
import vy.j;
import vy.k;
import vy.l;
import vy.m;
import vy.n;
import vy.o;
import vy.p;
import vy.q;
import vy.r;
import vy.s;
import vy.t;
import vy.v;
import vy.w;
import vy.y;
import xy.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f41574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f41575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f41576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f41577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.a f41578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.a f41579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41580g;

    public b(Context context, fz.a aVar, fz.a aVar2) {
        d dVar = new d();
        c cVar = c.f42547a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f42572a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        vy.d dVar2 = vy.d.f42549a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        vy.b bVar = vy.b.f42535a;
        dVar.a(vy.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.f42562a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        e eVar = e.f42552a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        h hVar = h.f42560a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        vy.g gVar = vy.g.f42558a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f42580a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        vy.f fVar = vy.f.f42555a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f31981d = true;
        this.f41574a = new f(dVar, 14);
        this.f41576c = context;
        this.f41575b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f41577d = b(a.f41568c);
        this.f41578e = aVar2;
        this.f41579f = aVar;
        this.f41580g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException(e0.f.k("Invalid url: ", str), e5);
        }
    }

    public final wy.h a(wy.h hVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f41575b.getActiveNetworkInfo();
        te teVarC = hVar.c();
        int i11 = Build.VERSION.SDK_INT;
        HashMap map = (HashMap) teVarC.f11899g;
        if (map == null) {
            h2.b("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("sdk-version", String.valueOf(i11));
        teVarC.d("model", Build.MODEL);
        teVarC.d("hardware", Build.HARDWARE);
        teVarC.d("device", Build.DEVICE);
        teVarC.d("product", Build.PRODUCT);
        teVarC.d("os-uild", Build.ID);
        teVarC.d("manufacturer", Build.MANUFACTURER);
        teVarC.d("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = (HashMap) teVarC.f11899g;
        if (map2 == null) {
            h2.b("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("tz-offset", String.valueOf(offset));
        int iC = activeNetworkInfo == null ? h0.NONE.c() : activeNetworkInfo.getType();
        HashMap map3 = (HashMap) teVarC.f11899g;
        if (map3 == null) {
            h2.b("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("net-type", String.valueOf(iC));
        int i12 = -1;
        if (activeNetworkInfo == null) {
            subtype = g0.UNKNOWN_MOBILE_SUBTYPE.c();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = g0.COMBINED.c();
            } else if (g0.a(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = (HashMap) teVarC.f11899g;
        if (map4 == null) {
            h2.b("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        teVarC.d(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        teVarC.d("locale", Locale.getDefault().getLanguage());
        Context context = this.f41576c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        teVarC.d("mcc_mnc", simOperator);
        try {
            i12 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            w0.e.u("CctTransportBackend", "Unable to find version code for package", e5);
        }
        teVarC.d("application_build", Integer.toString(i12));
        return teVarC.e();
    }
}
