package m5;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29670a;

    public x0(String str) {
        this.f29670a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return Intrinsics.areEqual(this.f29670a, ((x0) obj).f29670a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29670a.hashCode();
    }

    public final String toString() {
        return l1.f(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f29670a, ')');
    }
}
