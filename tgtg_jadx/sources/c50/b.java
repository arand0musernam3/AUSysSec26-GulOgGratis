package c50;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f7497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7498c;

    public b(String str, b0 b0Var, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        b0Var.getClass();
        this.f7496a = str;
        this.f7497b = b0Var;
        this.f7498c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Intrinsics.areEqual(this.f7496a, bVar.f7496a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.areEqual(str, str) || !Intrinsics.areEqual("3.0.4", "3.0.4")) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return Intrinsics.areEqual(str2, str2) && this.f7497b == bVar.f7497b && Intrinsics.areEqual(this.f7498c, bVar.f7498c);
    }

    public final int hashCode() {
        return this.f7498c.hashCode() + ((this.f7497b.hashCode() + w2.l1.b((((Build.MODEL.hashCode() + (this.f7496a.hashCode() * 31)) * 31) + 48517563) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f7496a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.4, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f7497b + ", androidAppInfo=" + this.f7498c + ')';
    }
}
