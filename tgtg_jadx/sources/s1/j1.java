package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f38634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.x f38635b;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(Function1 function1, t1.x xVar) {
        this.f38634a = (Lambda) function1;
        this.f38635b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.areEqual(this.f38634a, j1Var.f38634a) && Intrinsics.areEqual(this.f38635b, j1Var.f38635b);
    }

    public final int hashCode() {
        return this.f38635b.hashCode() + (this.f38634a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f38634a + ", animationSpec=" + this.f38635b + ')';
    }
}
