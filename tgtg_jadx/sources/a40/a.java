package a40;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ub.a f697h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, ub.a aVar) {
        this.f690a = str;
        this.f691b = str2;
        this.f692c = arrayList;
        this.f693d = str3;
        this.f694e = str4;
        this.f695f = str5;
        this.f696g = str6;
        this.f697h = aVar;
    }

    public static a a(Context context, b0 b0Var, String str, String str2, ArrayList arrayList, ub.a aVar) {
        String packageName = context.getPackageName();
        String strD = b0Var.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, strD, packageName, string, str3, aVar);
    }
}
