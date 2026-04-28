package j5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f24629c = new i(0.0f, new n80.f(0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n80.f f24631b;

    public i(float f11, n80.f fVar) {
        this.f24630a = f11;
        this.f24631b = fVar;
        if (Float.isNaN(f11)) {
            i4.a.f("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f24630a == iVar.f24630a && Intrinsics.areEqual(this.f24631b, iVar.f24631b);
    }

    public final int hashCode() {
        return (this.f24631b.hashCode() + (Float.hashCode(this.f24630a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f24630a + ", range=" + this.f24631b + ", steps=0)";
    }
}
