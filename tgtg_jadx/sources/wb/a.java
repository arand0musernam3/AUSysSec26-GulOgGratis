package wb;

import e0.f;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43381g;

    public a(long j9, String str, String str2, int i11, String str3, String str4, String str5) {
        str2.getClass();
        this.f43375a = j9;
        this.f43376b = str;
        this.f43377c = str2;
        this.f43378d = i11;
        this.f43379e = str3;
        this.f43380f = str4;
        this.f43381g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f43375a == aVar.f43375a && Intrinsics.areEqual(this.f43376b, aVar.f43376b) && Intrinsics.areEqual(this.f43377c, aVar.f43377c) && this.f43378d == aVar.f43378d && Intrinsics.areEqual(this.f43379e, aVar.f43379e) && Intrinsics.areEqual(this.f43380f, aVar.f43380f) && Intrinsics.areEqual(this.f43381g, aVar.f43381g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f43375a) * 31;
        String str = this.f43376b;
        int iB = k.b(this.f43378d, l1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f43377c), 31);
        String str2 = this.f43379e;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43380f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f43381g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticEntry(id=");
        sb2.append(this.f43375a);
        sb2.append(", type=");
        sb2.append(this.f43376b);
        sb2.append(", content=");
        sb2.append(this.f43377c);
        sb2.append(", state=");
        sb2.append(this.f43378d);
        s.A(sb2, ", metaData=", this.f43379e, ", processId=", this.f43380f);
        return f.n(sb2, ", version=", this.f43381g, ")");
    }
}
