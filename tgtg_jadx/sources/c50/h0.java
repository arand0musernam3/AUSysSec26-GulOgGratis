package c50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7572d;

    public h0(int i11, int i12, String str, boolean z11) {
        str.getClass();
        this.f7569a = str;
        this.f7570b = i11;
        this.f7571c = i12;
        this.f7572d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.areEqual(this.f7569a, h0Var.f7569a) && this.f7570b == h0Var.f7570b && this.f7571c == h0Var.f7571c && this.f7572d == h0Var.f7572d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7572d) + r8.k.b(this.f7571c, r8.k.b(this.f7570b, this.f7569a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f7569a);
        sb2.append(", pid=");
        sb2.append(this.f7570b);
        sb2.append(", importance=");
        sb2.append(this.f7571c);
        sb2.append(", isDefaultProcess=");
        return r8.k.q(sb2, this.f7572d, ')');
    }
}
