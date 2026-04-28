package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b4.e f13763i;

    public c0(b4.i iVar) {
        this.f13763i = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.areEqual(this.f13763i, ((c0) obj).f13763i);
    }

    public final int hashCode() {
        return this.f13763i.hashCode();
    }

    @Override // d2.c
    public final int i(int i11, int i12, z5.m mVar) {
        return this.f13763i.a(i12, i11, mVar);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f13763i + ')';
    }
}
