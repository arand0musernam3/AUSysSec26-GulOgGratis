package h5;

import kotlin.jvm.internal.Intrinsics;
import p4.f;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21414b;

    public a(f fVar, int i11) {
        this.f21413a = fVar;
        this.f21414b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f21413a, aVar.f21413a) && this.f21414b == aVar.f21414b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21414b) + (this.f21413a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f21413a);
        sb2.append(", configFlags=");
        return k.o(sb2, this.f21414b, ')');
    }
}
