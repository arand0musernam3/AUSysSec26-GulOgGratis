package c50;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f7623a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jd.f f7624b;

    static {
        o40.d dVar = new o40.d();
        dVar.a(r0.class, g.f7544a);
        dVar.a(y0.class, h.f7561a);
        dVar.a(k.class, e.f7516a);
        dVar.a(b.class, d.f7507a);
        dVar.a(a.class, c.f7499a);
        dVar.a(h0.class, f.f7526a);
        dVar.f31981d = true;
        f7624b = new jd.f(dVar, 14);
    }

    public static b a(p30.g gVar) throws PackageManager.NameNotFoundException {
        gVar.a();
        Context context = gVar.f34222a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.f34224c.f34238b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        b0 b0Var = b0.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        gVar.a();
        h0 h0VarB = i0.b(context);
        gVar.a();
        return new b(str, b0Var, new a(packageName, str2, strValueOf, h0VarB, i0.a(context)));
    }
}
