package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f29333a;

    public m0(k1 k1Var) {
        this.f29333a = k1Var;
    }

    @Override // m3.f3
    public final Object a(u3.i iVar) {
        return this.f29333a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.areEqual(this.f29333a, ((m0) obj).f29333a);
    }

    public final int hashCode() {
        return this.f29333a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f29333a + ')';
    }
}
