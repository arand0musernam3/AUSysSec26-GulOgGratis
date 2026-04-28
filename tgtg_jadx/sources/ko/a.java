package ko;

import bp.u;
import com.app.tgtg.model.remote.order.Order;
import f70.h;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Order f26481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f26483c;

    public a(Order order, int i11, u uVar) {
        this.f26481a = order;
        this.f26482b = i11;
        this.f26483c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f26481a, aVar.f26481a) && this.f26482b == aVar.f26482b && this.f26483c == aVar.f26483c;
    }

    public final int hashCode() {
        return this.f26483c.hashCode() + k.b(this.f26482b, this.f26481a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GoToRatingWithResult(order=" + this.f26481a + ", rating=" + this.f26482b + ", source=" + this.f26483c + ")";
    }
}
