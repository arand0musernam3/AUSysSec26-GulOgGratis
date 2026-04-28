package of;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v70.i f32489a;

    public f(v70.i iVar) {
        this.f32489a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f32489a, ((f) obj).f32489a);
    }

    public final int hashCode() {
        return this.f32489a.hashCode();
    }

    public final String toString() {
        return "SetTags(tags=" + this.f32489a + ')';
    }
}
