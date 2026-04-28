package af;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1284j;

    public e(View view, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12) {
        this.f1275a = view;
        this.f1276b = str;
        this.f1277c = str2;
        this.f1278d = str3;
        this.f1279e = str4;
        this.f1280f = str5;
        this.f1281g = str6;
        this.f1282h = str7;
        this.f1283i = z11;
        this.f1284j = z12;
        new WeakReference(view);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f1275a, eVar.f1275a) && Intrinsics.areEqual(this.f1276b, eVar.f1276b) && Intrinsics.areEqual(this.f1277c, eVar.f1277c) && Intrinsics.areEqual(this.f1278d, eVar.f1278d) && Intrinsics.areEqual(this.f1279e, eVar.f1279e) && Intrinsics.areEqual(this.f1280f, eVar.f1280f) && Intrinsics.areEqual(this.f1281g, eVar.f1281g) && Intrinsics.areEqual(this.f1282h, eVar.f1282h) && this.f1283i == eVar.f1283i && this.f1284j == eVar.f1284j;
    }

    public final int hashCode() {
        Object obj = this.f1275a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f1276b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1277c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1278d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1279e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1280f;
        int iB = l1.b((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f1281g);
        String str6 = this.f1282h;
        return Boolean.hashCode(this.f1284j) + k.e((iB + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f1283i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewTarget(_view=");
        sb2.append(this.f1275a);
        sb2.append(", className=");
        sb2.append(this.f1276b);
        sb2.append(", resourceName=");
        sb2.append(this.f1277c);
        sb2.append(", tag=");
        sb2.append(this.f1278d);
        sb2.append(", text=");
        sb2.append(this.f1279e);
        sb2.append(", accessibilityLabel=");
        sb2.append(this.f1280f);
        sb2.append(", source=");
        sb2.append(this.f1281g);
        sb2.append(", hierarchy=");
        sb2.append(this.f1282h);
        sb2.append(", ampIgnoreRageClick=");
        sb2.append(this.f1283i);
        sb2.append(", ampIgnoreDeadClick=");
        return k.q(sb2, this.f1284j, ')');
    }
}
