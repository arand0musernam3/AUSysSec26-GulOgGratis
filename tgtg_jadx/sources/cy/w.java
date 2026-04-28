package cy;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f13596d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se.d f13598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13599c;

    public w(Context context, String str) {
        PackageInfo packageInfo;
        context.getClass();
        this.f13597a = str;
        this.f13598b = new se.d(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f13599c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Bundle bundleB = a0.b("");
            bundleB.putString("2_result", s.ERROR.a());
            bundleB.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleB.putString("3_method", str2);
            this.f13598b.M(bundleB, str);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
