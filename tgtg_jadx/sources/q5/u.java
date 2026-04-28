package q5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ky.o f36053f;

    public u(ky.o oVar) {
        this.f36053f = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return Intrinsics.areEqual(this.f36053f, ((u) obj).f36053f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36053f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f36053f + ')';
    }
}
