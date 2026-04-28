package hp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22254c;

    public b(String str, String str2, int i11) {
        str.getClass();
        str2.getClass();
        this.f22252a = str;
        this.f22253b = str2;
        this.f22254c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f22252a, bVar.f22252a) && Intrinsics.areEqual(this.f22253b, bVar.f22253b) && this.f22254c == bVar.f22254c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22254c) + w2.l1.b(this.f22252a.hashCode() * 31, 31, this.f22253b);
    }

    public final String toString() {
        return r8.k.i(this.f22254c, ")", e0.f.t("IntroStep(title=", this.f22252a, ", body=", this.f22253b, ", videoRes="));
    }
}
