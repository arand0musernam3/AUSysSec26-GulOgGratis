package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.e f16712b;

    public h3(a aVar, h0.e eVar) {
        this.f16711a = aVar;
        this.f16712b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return Intrinsics.areEqual(this.f16711a, h3Var.f16711a) && Intrinsics.areEqual(this.f16712b, h3Var.f16712b);
    }

    public final int hashCode() {
        return this.f16712b.hashCode() + (this.f16711a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.f16711a + ", token=" + this.f16712b + ')';
    }
}
