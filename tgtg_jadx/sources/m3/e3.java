package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29269a;

    public e3(Object obj) {
        this.f29269a = obj;
    }

    @Override // m3.f3
    public final Object a(u3.i iVar) {
        return this.f29269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3) && Intrinsics.areEqual(this.f29269a, ((e3) obj).f29269a);
    }

    public final int hashCode() {
        Object obj = this.f29269a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f29269a + ')';
    }
}
