package cb;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f7879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7880b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Rect rect, float f11) {
        this(new ab.b(rect), f11);
        rect.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f7879a, iVar.f7879a) && this.f7880b == iVar.f7880b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7880b) + (this.f7879a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f7879a);
        sb2.append(", density=");
        return r8.k.n(sb2, this.f7880b, ')');
    }

    public i(ab.b bVar, float f11) {
        this.f7879a = bVar;
        this.f7880b = f11;
    }
}
