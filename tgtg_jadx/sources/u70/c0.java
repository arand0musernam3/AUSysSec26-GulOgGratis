package u70;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b0 f40833b = new b0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40834a;

    public /* synthetic */ c0(long j9) {
        this.f40834a = j9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.f40834a ^ Long.MIN_VALUE, ((c0) obj).f40834a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f40834a == ((c0) obj).f40834a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40834a);
    }

    public final String toString() {
        return bx.o.S(10, this.f40834a);
    }
}
