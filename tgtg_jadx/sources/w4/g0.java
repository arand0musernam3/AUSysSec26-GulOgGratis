package w4;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h1;
import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw4/g0;", "Lb5/h1;", "Lw4/m0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f43124d;

    public g0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i11) {
        obj2 = (i11 & 2) != 0 ? null : obj2;
        this.f43122b = obj;
        this.f43123c = obj2;
        this.f43124d = pointerInputEventHandler;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new m0(this.f43122b, this.f43123c, this.f43124d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f43122b, g0Var.f43122b) && Intrinsics.areEqual(this.f43123c, g0Var.f43123c) && this.f43124d == g0Var.f43124d;
    }

    public final int hashCode() {
        Object obj = this.f43122b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f43123c;
        return this.f43124d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "pointerInput";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f43122b, "key1");
        l3Var.b(this.f43123c, "key2");
        l3Var.b(null, "keys");
        l3Var.b(this.f43124d, "pointerInputEventHandler");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        m0 m0Var = (m0) sVar;
        Object obj = m0Var.f43155o;
        Object obj2 = this.f43122b;
        boolean z11 = !Intrinsics.areEqual(obj, obj2);
        m0Var.f43155o = obj2;
        Object obj3 = m0Var.f43156p;
        Object obj4 = this.f43123c;
        if (!Intrinsics.areEqual(obj3, obj4)) {
            z11 = true;
        }
        m0Var.f43156p = obj4;
        Class<?> cls = m0Var.f43157q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f43124d;
        if (cls == pointerInputEventHandler.getClass() ? z11 : true) {
            m0Var.N0();
        }
        m0Var.f43157q = pointerInputEventHandler;
    }
}
