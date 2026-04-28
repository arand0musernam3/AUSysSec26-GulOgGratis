package g1;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f18064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f18065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f18066c;

    public a(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.f18064a = rect;
        this.f18065b = size;
        this.f18066c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f18064a, aVar.f18064a) && Intrinsics.areEqual(this.f18065b, aVar.f18065b) && Intrinsics.areEqual(this.f18066c, aVar.f18066c);
    }

    public final int hashCode() {
        return this.f18066c.hashCode() + ((this.f18065b.hashCode() + (this.f18064a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f18064a + ", childSizeToScale=" + this.f18065b + ", originalSelectedChildSize=" + this.f18066c + ')';
    }
}
