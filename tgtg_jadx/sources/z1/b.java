package z1;

import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lz1/b;", "T", "Lb5/h1;", "Lz1/n;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class b<T> extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f46406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f46407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f46409e;

    public b(r rVar, h2 h2Var, boolean z11, l1 l1Var) {
        this.f46406b = rVar;
        this.f46407c = h2Var;
        this.f46408d = z11;
        this.f46409e = l1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        yj.m mVar = k.f46568a;
        boolean z11 = this.f46408d;
        h2 h2Var = this.f46407c;
        n nVar = new n(mVar, z11, null, h2Var);
        nVar.I = this.f46406b;
        nVar.J = h2Var;
        nVar.K = this.f46409e;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f46406b, bVar.f46406b) && this.f46407c == bVar.f46407c && this.f46408d == bVar.f46408d && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f46409e, bVar.f46409e);
    }

    public final int hashCode() {
        int iE = r8.k.e((this.f46407c.hashCode() + (this.f46406b.hashCode() * 31)) * 31, 28629151, this.f46408d);
        l1 l1Var = this.f46409e;
        return iE + (l1Var != null ? l1Var.hashCode() : 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "anchoredDraggable";
        c5.l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f46406b, "state");
        l3Var.b(this.f46407c, InAppMessageBase.ORIENTATION);
        l3Var.b(Boolean.valueOf(this.f46408d), FeatureFlag.ENABLED);
        l3Var.b(null, "reverseDirection");
        l3Var.b(null, "interactionSource");
        l3Var.b(null, "startDragImmediately");
        l3Var.b(null, "overscrollEffect");
        l3Var.b(this.f46409e, "flingBehavior");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        boolean z11;
        n nVar = (n) sVar;
        l1 l1Var = this.f46409e;
        nVar.K = l1Var;
        r rVar = nVar.I;
        r rVar2 = this.f46406b;
        if (Intrinsics.areEqual(rVar, rVar2)) {
            z11 = false;
        } else {
            nVar.I = rVar2;
            nVar.i1(l1Var);
            z11 = true;
        }
        h2 h2Var = nVar.J;
        h2 h2Var2 = this.f46407c;
        if (h2Var != h2Var2) {
            nVar.J = h2Var2;
            z11 = true;
        }
        nVar.f1(nVar.f46498r, this.f46408d, null, h2Var2, !Intrinsics.areEqual((Object) null, (Object) null) ? true : z11);
    }
}
