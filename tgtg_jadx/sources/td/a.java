package td;

import kotlin.jvm.internal.Intrinsics;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f39953a;

    public /* synthetic */ a(i1 i1Var) {
        this.f39953a = i1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f39953a, ((a) obj).f39953a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39953a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f39953a + ")";
    }
}
