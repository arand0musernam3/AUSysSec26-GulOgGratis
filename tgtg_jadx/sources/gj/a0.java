package gj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20477a;

    public a0(String str) {
        this.f20477a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.areEqual(this.f20477a, ((a0) obj).f20477a);
    }

    public final int hashCode() {
        return this.f20477a.hashCode();
    }

    public final String toString() {
        return w.a0.p("TrackQuickFilterReset(source=", this.f20477a, ")");
    }
}
