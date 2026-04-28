package h2;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh2/l;", "Lb5/h1;", "Lh2/m;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class l extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.x f21157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.x f21158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.b1 f21159d;

    public l(t1.x xVar, t1.x xVar2, t1.b1 b1Var) {
        this.f21157b = xVar;
        this.f21158c = xVar2;
        this.f21159d = b1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        m mVar = new m();
        mVar.f21167o = this.f21157b;
        mVar.f21168p = this.f21158c;
        mVar.f21169q = this.f21159d;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f21157b, lVar.f21157b) && Intrinsics.areEqual(this.f21158c, lVar.f21158c) && Intrinsics.areEqual(this.f21159d, lVar.f21159d);
    }

    public final int hashCode() {
        t1.x xVar = this.f21157b;
        int iHashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
        t1.x xVar2 = this.f21158c;
        return this.f21159d.hashCode() + ((iHashCode + (xVar2 != null ? xVar2.hashCode() : 0)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "animateItem";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f21157b, "fadeInSpec");
        l3Var.b(this.f21158c, "placementSpec");
        l3Var.b(this.f21159d, "fadeOutSpec");
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f21157b + ", placementSpec=" + this.f21158c + ", fadeOutSpec=" + this.f21159d + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        m mVar = (m) sVar;
        mVar.f21167o = this.f21157b;
        mVar.f21168p = this.f21158c;
        mVar.f21169q = this.f21159d;
    }
}
