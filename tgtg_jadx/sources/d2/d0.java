package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b4.j f13772i;

    public d0(b4.j jVar) {
        this.f13772i = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.areEqual(this.f13772i, ((d0) obj).f13772i);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13772i.f5701a);
    }

    @Override // d2.c
    public final int i(int i11, int i12, z5.m mVar) {
        return this.f13772i.a(i12, i11);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f13772i + ')';
    }
}
