package qk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.d f37192b;

    public m(String str, u3.d dVar) {
        this.f37191a = str;
        this.f37192b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f37191a, mVar.f37191a) && Intrinsics.areEqual(this.f37192b, mVar.f37192b);
    }

    public final int hashCode() {
        return this.f37192b.hashCode() + (this.f37191a.hashCode() * 31);
    }

    public final String toString() {
        return "Section(key=" + this.f37191a + ", content=" + this.f37192b + ")";
    }
}
