package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a7 f18540d;

    public e7(String str, String str2, boolean z11, a7 a7Var) {
        this.f18537a = str;
        this.f18538b = str2;
        this.f18539c = z11;
        this.f18540d = a7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e7.class != obj.getClass()) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return Intrinsics.areEqual(this.f18537a, e7Var.f18537a) && Intrinsics.areEqual(this.f18538b, e7Var.f18538b) && this.f18539c == e7Var.f18539c && this.f18540d == e7Var.f18540d;
    }

    public final int hashCode() {
        int iHashCode = this.f18537a.hashCode() * 31;
        String str = this.f18538b;
        return this.f18540d.hashCode() + r8.k.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f18539c);
    }
}
