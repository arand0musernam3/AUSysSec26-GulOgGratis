package b4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f5705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f5706b;

    public m(t tVar, t tVar2) {
        this.f5705a = tVar;
        this.f5706b = tVar2;
    }

    @Override // b4.t
    public final boolean all(Function1 function1) {
        return this.f5705a.all(function1) && this.f5706b.all(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f5705a, mVar.f5705a) && Intrinsics.areEqual(this.f5706b, mVar.f5706b);
    }

    @Override // b4.t
    public final Object foldIn(Object obj, Function2 function2) {
        return this.f5706b.foldIn(this.f5705a.foldIn(obj, function2), function2);
    }

    public final int hashCode() {
        return (this.f5706b.hashCode() * 31) + this.f5705a.hashCode();
    }

    public final String toString() {
        return l1.f(new StringBuilder("["), (String) foldIn("", l.f5704a), ']');
    }
}
