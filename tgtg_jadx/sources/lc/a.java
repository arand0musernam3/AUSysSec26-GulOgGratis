package lc;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f27589d;

    public a(String str, int i11, String str2, Throwable th2) {
        this.f27586a = i11;
        this.f27587b = str;
        this.f27588c = str2;
        this.f27589d = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27586a == aVar.f27586a && Intrinsics.areEqual(this.f27587b, aVar.f27587b) && Intrinsics.areEqual(this.f27588c, aVar.f27588c) && Intrinsics.areEqual(this.f27589d, aVar.f27589d);
    }

    public final int hashCode() {
        int iB = l1.b(l1.b(Integer.hashCode(this.f27586a) * 31, 31, this.f27587b), 31, this.f27588c);
        Throwable th2 = this.f27589d;
        return iB + (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "CashAppLogEntry(level=" + this.f27586a + ", tag=" + this.f27587b + ", msg=" + this.f27588c + ", throwable=" + this.f27589d + ")";
    }
}
