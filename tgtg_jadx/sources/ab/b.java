package ab;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1197d;

    static {
        new b(0, 0, 0, 0);
    }

    public b(int i11, int i12, int i13, int i14) {
        this.f1194a = i11;
        this.f1195b = i12;
        this.f1196c = i13;
        this.f1197d = i14;
        if (i11 > i13) {
            i4.a.i(r8.k.k("Left must be less than or equal to right, left: ", i11, i13, ", right: "));
            throw null;
        }
        if (i12 <= i14) {
            return;
        }
        i4.a.i(r8.k.k("top must be less than or equal to bottom, top: ", i12, i14, ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.f1197d - this.f1195b;
    }

    public final int b() {
        return this.f1196c - this.f1194a;
    }

    public final Rect c() {
        return new Rect(this.f1194a, this.f1195b, this.f1196c, this.f1197d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        return this.f1194a == bVar.f1194a && this.f1195b == bVar.f1195b && this.f1196c == bVar.f1196c && this.f1197d == bVar.f1197d;
    }

    public final int hashCode() {
        return (((((this.f1194a * 31) + this.f1195b) * 31) + this.f1196c) * 31) + this.f1197d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f1194a);
        sb2.append(',');
        sb2.append(this.f1195b);
        sb2.append(',');
        sb2.append(this.f1196c);
        sb2.append(',');
        return r8.k.i(this.f1197d, "] }", sb2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
