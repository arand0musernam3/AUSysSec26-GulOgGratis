package u70;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final y f40865b = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40866a;

    public /* synthetic */ z(int i11) {
        this.f40866a = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.f40866a ^ Integer.MIN_VALUE, ((z) obj).f40866a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f40866a == ((z) obj).f40866a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40866a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f40866a) & 4294967295L);
    }
}
