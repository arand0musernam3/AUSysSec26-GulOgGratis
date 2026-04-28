package s1;

import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t1.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Ls1/n;", "S", "Lb5/h1;", "Ls1/q;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class n<S> extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f38648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.b1 f38649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f38650d;

    public n(m1 m1Var, m3.b1 b1Var, s sVar) {
        this.f38648b = m1Var;
        this.f38649c = b1Var;
        this.f38650d = sVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        q qVar = new q(1);
        qVar.f38660p = this.f38648b;
        qVar.f38661q = this.f38649c;
        qVar.f38662r = this.f38650d;
        qVar.f38663s = i.f38613a;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(nVar.f38648b, this.f38648b) && Intrinsics.areEqual(nVar.f38649c, this.f38649c);
    }

    public final int hashCode() {
        int iHashCode = this.f38650d.hashCode() * 31;
        m1 m1Var = this.f38648b;
        return this.f38649c.hashCode() + ((iHashCode + (m1Var != null ? m1Var.hashCode() : 0)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "sizeTransform";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f38648b, "sizeAnimation");
        l3Var.b(this.f38649c, "sizeTransform");
        l3Var.b(this.f38650d, "scope");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        q qVar = (q) sVar;
        qVar.f38660p = this.f38648b;
        qVar.f38661q = this.f38649c;
        qVar.f38662r = this.f38650d;
    }
}
