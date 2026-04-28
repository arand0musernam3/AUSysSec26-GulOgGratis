package q0;

import kotlin.jvm.internal.Intrinsics;
import m0.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f35702a;

    public d(m1 m1Var) {
        this.f35702a = m1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f35702a, ((d) obj).f35702a);
    }

    public final int hashCode() {
        return this.f35702a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.f35702a + ')';
    }
}
