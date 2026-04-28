package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.d f18404b;

    public c2(d7 d7Var, u3.d dVar) {
        this.f18403a = d7Var;
        this.f18404b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Intrinsics.areEqual(this.f18403a, c2Var.f18403a) && Intrinsics.areEqual(this.f18404b, c2Var.f18404b);
    }

    public final int hashCode() {
        Object obj = this.f18403a;
        return this.f18404b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f18403a + ", transition=" + this.f18404b + ')';
    }
}
