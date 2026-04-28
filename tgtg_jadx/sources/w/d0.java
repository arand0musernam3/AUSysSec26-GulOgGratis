package w;

import android.util.Range;
import android.util.Rational;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f42665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rational f42666d;

    public d0(boolean z11, int i11, Range range, Rational rational) {
        range.getClass();
        rational.getClass();
        this.f42663a = z11;
        this.f42664b = i11;
        this.f42665c = range;
        this.f42666d = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f42663a == d0Var.f42663a && this.f42664b == d0Var.f42664b && Intrinsics.areEqual(this.f42665c, d0Var.f42665c) && Intrinsics.areEqual(this.f42666d, d0Var.f42666d);
    }

    public final int hashCode() {
        return this.f42666d.hashCode() + ((this.f42665c.hashCode() + r8.k.b(this.f42664b, Boolean.hashCode(this.f42663a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.f42663a + ", index=" + this.f42664b + ", range=" + this.f42665c + ", step=" + this.f42666d + ')';
    }
}
