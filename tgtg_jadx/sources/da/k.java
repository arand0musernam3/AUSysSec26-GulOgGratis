package da;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14838g;

    public k(String str, String str2, boolean z11, int i11, String str3, int i12) {
        str.getClass();
        str2.getClass();
        this.f14832a = str;
        this.f14833b = str2;
        this.f14834c = z11;
        this.f14835d = i11;
        this.f14836e = str3;
        this.f14837f = i12;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.f14838g = StringsKt.z(upperCase, "INT", false) ? 3 : (StringsKt.z(upperCase, "CHAR", false) || StringsKt.z(upperCase, "CLOB", false) || StringsKt.z(upperCase, "TEXT", false)) ? 2 : StringsKt.z(upperCase, "BLOB", false) ? 5 : (StringsKt.z(upperCase, "REAL", false) || StringsKt.z(upperCase, "FLOA", false) || StringsKt.z(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                boolean z11 = this.f14835d > 0;
                k kVar = (k) obj;
                int i11 = kVar.f14837f;
                if (z11 == (kVar.f14835d > 0) && Intrinsics.areEqual(this.f14832a, kVar.f14832a) && this.f14834c == kVar.f14834c) {
                    String str = kVar.f14836e;
                    int i12 = this.f14837f;
                    String str2 = this.f14836e;
                    if ((i12 != 1 || i11 != 2 || str2 == null || o.a(str2, str)) && ((i12 != 2 || i11 != 1 || str == null || o.a(str, str2)) && ((i12 == 0 || i12 != i11 || (str2 == null ? str == null : o.a(str2, str))) && this.f14838g == kVar.f14838g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f14832a.hashCode() * 31) + this.f14838g) * 31) + (this.f14834c ? 1231 : 1237)) * 31) + this.f14835d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f14832a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f14833b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f14838g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f14834c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f14835d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f14836e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return s.b(s.d(sb2.toString()));
    }
}
