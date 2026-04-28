package pd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f34665b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f34666a;

    public b() {
        this.f34666a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f34666a, ((b) obj).f34666a);
        }
        return false;
    }

    public final int hashCode() {
        r rVar = this.f34666a;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f34666a + ")";
    }

    public b(r rVar) {
        this.f34666a = rVar;
    }
}
