package h2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh2/p;", "Lb5/h1;", "Lh2/u;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class p extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f21205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h2 f21207e;

    public p(v vVar, o oVar, boolean z11, h2 h2Var) {
        this.f21204b = vVar;
        this.f21205c = oVar;
        this.f21206d = z11;
        this.f21207e = h2Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        u uVar = new u();
        uVar.f21227o = this.f21204b;
        uVar.f21228p = this.f21205c;
        uVar.f21229q = this.f21206d;
        uVar.f21230r = this.f21207e;
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f21204b, pVar.f21204b) && Intrinsics.areEqual(this.f21205c, pVar.f21205c) && this.f21206d == pVar.f21206d && this.f21207e == pVar.f21207e;
    }

    public final int hashCode() {
        return this.f21207e.hashCode() + r8.k.e((this.f21205c.hashCode() + (this.f21204b.hashCode() * 31)) * 31, 31, this.f21206d);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        u uVar = (u) sVar;
        uVar.f21227o = this.f21204b;
        uVar.f21228p = this.f21205c;
        uVar.f21229q = this.f21206d;
        uVar.f21230r = this.f21207e;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
