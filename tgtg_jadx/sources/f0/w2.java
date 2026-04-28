package f0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 implements e0.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.k1 f16959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16960b;

    public w2(e0.k1 k1Var, long j9) {
        k1Var.getClass();
        this.f16959a = k1Var;
        this.f16960b = j9;
    }

    @Override // e0.j1
    public final boolean B() {
        return false;
    }

    @Override // e0.j1
    public final int H() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            return Intrinsics.areEqual(this.f16959a, w2Var.f16959a) && this.f16960b == w2Var.f16960b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + e0.f.b(r8.k.e(this.f16959a.hashCode() * 31, 31, false), 31, this.f16960b);
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        kClass.getClass();
        return null;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.f16959a + ", wasImageCaptured=false, frameNumber=" + ((Object) e0.l0.a(this.f16960b)) + ", reason=0)";
    }
}
