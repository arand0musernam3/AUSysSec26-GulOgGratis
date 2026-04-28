package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.f f38553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f38554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.x f38555c;

    public c0(b4.f fVar, Function1 function1, t1.x xVar) {
        this.f38553a = fVar;
        this.f38554b = function1;
        this.f38555c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.areEqual(this.f38553a, c0Var.f38553a) && Intrinsics.areEqual(this.f38554b, c0Var.f38554b) && Intrinsics.areEqual(this.f38555c, c0Var.f38555c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f38555c.hashCode() + r8.k.d(this.f38553a.hashCode() * 31, 31, this.f38554b)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f38553a + ", size=" + this.f38554b + ", animationSpec=" + this.f38555c + ", clip=true)";
    }
}
