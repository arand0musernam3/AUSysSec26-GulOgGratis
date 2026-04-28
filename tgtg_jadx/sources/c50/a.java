package c50;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f7489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f7490e;

    public a(String str, String str2, String str3, h0 h0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f7486a = str;
        this.f7487b = str2;
        this.f7488c = str3;
        this.f7489d = h0Var;
        this.f7490e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Intrinsics.areEqual(this.f7486a, aVar.f7486a) || !Intrinsics.areEqual(this.f7487b, aVar.f7487b) || !Intrinsics.areEqual(this.f7488c, aVar.f7488c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.areEqual(str, str) && Intrinsics.areEqual(this.f7489d, aVar.f7489d) && Intrinsics.areEqual(this.f7490e, aVar.f7490e);
    }

    public final int hashCode() {
        return this.f7490e.hashCode() + ((this.f7489d.hashCode() + w2.l1.b(w2.l1.b(w2.l1.b(this.f7486a.hashCode() * 31, 31, this.f7487b), 31, this.f7488c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f7486a + ", versionName=" + this.f7487b + ", appBuildVersion=" + this.f7488c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f7489d + ", appProcessDetails=" + this.f7490e + ')';
    }
}
