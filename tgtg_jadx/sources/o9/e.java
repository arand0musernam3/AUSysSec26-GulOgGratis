package o9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f32136a;

    public e(d dVar) {
        this.f32136a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f32136a, ((e) obj).f32136a);
    }

    public final int hashCode() {
        return this.f32136a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.f32136a + ')';
    }
}
