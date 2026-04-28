package k4;

import i4.t;
import kotlin.jvm.internal.Intrinsics;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z5.c f25933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f25934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f25935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25936d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f25933a, aVar.f25933a) && this.f25934b == aVar.f25934b && Intrinsics.areEqual(this.f25935c, aVar.f25935c) && h4.e.a(this.f25936d, aVar.f25936d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f25936d) + ((this.f25935c.hashCode() + ((this.f25934b.hashCode() + (this.f25933a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f25933a + ", layoutDirection=" + this.f25934b + ", canvas=" + this.f25935c + ", size=" + ((Object) h4.e.f(this.f25936d)) + ')';
    }
}
