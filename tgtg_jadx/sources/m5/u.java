package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5.d f29651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29653c;

    public u(u5.d dVar, int i11, int i12) {
        this.f29651a = dVar;
        this.f29652b = i11;
        this.f29653c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f29651a, uVar.f29651a) && this.f29652b == uVar.f29652b && this.f29653c == uVar.f29653c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29653c) + r8.k.b(this.f29652b, this.f29651a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f29651a);
        sb2.append(", startIndex=");
        sb2.append(this.f29652b);
        sb2.append(", endIndex=");
        return r8.k.o(sb2, this.f29653c, ')');
    }
}
