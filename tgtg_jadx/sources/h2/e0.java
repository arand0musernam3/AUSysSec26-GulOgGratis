package h2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b4.s implements b5.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h0 f21084o;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.areEqual(this.f21084o, ((e0) obj).f21084o);
    }

    public final int hashCode() {
        return this.f21084o.hashCode();
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        k4.b bVar = o0Var.f5908a;
        ArrayList arrayList = this.f21084o.f21123i;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = (b0) arrayList.get(i11);
            l4.b bVar2 = b0Var.f21055n;
            if (bVar2 != null) {
                long j9 = b0Var.f21054m;
                long j11 = bVar2.f27291t;
                float f11 = ((int) (j9 >> 32)) - ((int) (j11 >> 32));
                float f12 = ((int) (j9 & 4294967295L)) - ((int) (j11 & 4294967295L));
                ((jd.f) bVar.f25938b.f24502b).r(f11, f12);
                try {
                    d40.t1.A(o0Var, bVar2);
                } finally {
                    ((jd.f) bVar.f25938b.f24502b).r(-f11, -f12);
                }
            }
        }
        o0Var.b();
    }

    @Override // b4.s
    public final void onAttach() {
        this.f21084o.f21124j = this;
    }

    @Override // b4.s
    public final void onDetach() {
        h0 h0Var = this.f21084o;
        h0Var.e();
        h0Var.f21116b = null;
        h0Var.f21117c = -1;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f21084o + ')';
    }
}
