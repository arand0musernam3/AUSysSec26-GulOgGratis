package m3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f29277a;

    public f0(Function1 function1) {
        this.f29277a = function1;
    }

    @Override // m3.f3
    public final Object a(u3.i iVar) {
        return this.f29277a.invoke(iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.areEqual(this.f29277a, ((f0) obj).f29277a);
    }

    public final int hashCode() {
        return this.f29277a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f29277a + ')';
    }
}
