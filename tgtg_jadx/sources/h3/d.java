package h3;

import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.c f21366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21370e;

    public d(h4.c cVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f21366a = cVar;
        this.f21367b = z11;
        this.f21368c = z12;
        this.f21369d = z13;
        this.f21370e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f21366a, dVar.f21366a) && this.f21367b == dVar.f21367b && this.f21368c == dVar.f21368c && this.f21369d == dVar.f21369d && this.f21370e == dVar.f21370e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21370e) + k.e(k.e(k.e(this.f21366a.hashCode() * 31, 31, this.f21367b), 31, this.f21368c), 31, this.f21369d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HingeInfo(bounds=");
        sb2.append(this.f21366a);
        sb2.append(", isFlat=");
        sb2.append(this.f21367b);
        sb2.append(", isVertical=");
        sb2.append(this.f21368c);
        sb2.append(", isSeparating=");
        sb2.append(this.f21369d);
        sb2.append(", isOccluding=");
        return k.q(sb2, this.f21370e, ')');
    }
}
