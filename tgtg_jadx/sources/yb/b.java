package yb;

import a60.b0;
import a60.y;
import android.content.Context;
import android.os.Build;
import com.app.tgtg.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import q90.c0;
import q90.d0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f45803a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.e f45804b = new cc.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f45805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jb.b f45806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f45807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f45808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f45809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f45811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f45812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f45813k;
    public static final long l;

    static {
        c0 c0Var = new c0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        c0Var.f36450y = r90.g.b(TimeConstants.ONE_MINUTE_DIFFERENCE, timeUnit);
        c0Var.f36449x = r90.g.b(TimeConstants.ONE_MINUTE_DIFFERENCE, timeUnit);
        c0Var.f36451z = r90.g.b(TimeConstants.ONE_MINUTE_DIFFERENCE, timeUnit);
        c0Var.A = r90.g.b(TimeConstants.ONE_MINUTE_DIFFERENCE, timeUnit);
        f45805c = new d0(c0Var);
        f45806d = new jb.b(7);
        f45807e = "https://sandbox.api.cash.app/customer-request/v1/";
        f45808f = "https://api.cash.app/customer-request/v1/";
        f45809g = "https://api.squareup.com/";
        f45810h = "paykit-events.db";
        f45811i = "paykit-events-sandbox.db";
        f45812j = "production";
        f45813k = "sandbox";
        p80.c cVar = p80.d.f34559b;
        l = p80.g.g(10, p80.h.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cz.j a(boolean r8, jb.b r9) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.b.a(boolean, jb.b):cz.j");
    }

    public static cz.j b(String str, cc.g gVar, cz.j jVar, String str2) {
        WeakReference weakReference = z20.b.f46935c;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContextReference");
            weakReference = null;
        }
        Object obj = weakReference.get();
        obj.getClass();
        String string = ((Context) obj).getString(R.string.cap_version);
        string.getClass();
        String strC = c();
        y yVar = new y(0);
        yVar.a(g90.b.class, new a60.d0(9));
        yVar.a(fc.a.class, new a60.d0(11));
        b0 b0Var = new b0(yVar);
        n20.f fVar = new n20.f(28);
        r40.d dVar = new r40.d();
        string.getClass();
        str2.getClass();
        cz.j jVar2 = new cz.j();
        jVar2.f13631a = string;
        jVar2.f13632b = str;
        jVar2.f13633c = strC;
        jVar2.f13634d = str2;
        jVar2.f13635e = jVar;
        jVar2.f13636f = gVar;
        jVar2.f13637g = b0Var;
        jVar2.f13638h = fVar;
        jVar2.f13639i = dVar;
        jVar.l(new zb.a(jVar2));
        return jVar2;
    }

    public static String c() {
        WeakReference weakReference = z20.b.f46935c;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContextReference");
            weakReference = null;
        }
        Object obj = weakReference.get();
        obj.getClass();
        Context context = (Context) obj;
        return context.getPackageName() + " (Android " + Build.VERSION.RELEASE + "; " + Build.MANUFACTURER + "; " + Build.BRAND + "; " + Build.MODEL + "; " + Locale.getDefault() + ") PayKitVersion/" + context.getString(R.string.cap_version);
    }
}
