package w2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v1.y1;
import v80.b2;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw2/q0;", "Lb5/h1;", "Lw2/v0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class q0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f43022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1 f43023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x2.w f43024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i4.r f43025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y1 f43027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h2 f43028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s2.l f43029k;
    public final a3.u l;

    public q0(boolean z11, boolean z12, o1 o1Var, s1 s1Var, x2.w wVar, i4.r rVar, boolean z13, y1 y1Var, h2 h2Var, s2.l lVar, a3.u uVar) {
        this.f43020b = z11;
        this.f43021c = z12;
        this.f43022d = o1Var;
        this.f43023e = s1Var;
        this.f43024f = wVar;
        this.f43025g = rVar;
        this.f43026h = z13;
        this.f43027i = y1Var;
        this.f43028j = h2Var;
        this.f43029k = lVar;
        this.l = uVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new v0(this.f43020b, this.f43021c, this.f43022d, this.f43023e, this.f43024f, this.f43025g, this.f43026h, this.f43027i, this.f43028j, this.f43029k, this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f43020b == q0Var.f43020b && this.f43021c == q0Var.f43021c && Intrinsics.areEqual(this.f43022d, q0Var.f43022d) && Intrinsics.areEqual(this.f43023e, q0Var.f43023e) && Intrinsics.areEqual(this.f43024f, q0Var.f43024f) && Intrinsics.areEqual(this.f43025g, q0Var.f43025g) && this.f43026h == q0Var.f43026h && Intrinsics.areEqual(this.f43027i, q0Var.f43027i) && this.f43028j == q0Var.f43028j && Intrinsics.areEqual(this.f43029k, q0Var.f43029k) && Intrinsics.areEqual(this.l, q0Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.f43029k.hashCode() + ((this.f43028j.hashCode() + ((this.f43027i.hashCode() + r8.k.e((this.f43025g.hashCode() + ((this.f43024f.hashCode() + ((this.f43023e.hashCode() + ((this.f43022d.hashCode() + r8.k.e(Boolean.hashCode(this.f43020b) * 31, 31, this.f43021c)) * 31)) * 31)) * 31)) * 31, 31, this.f43026h)) * 31)) * 31)) * 31;
        a3.u uVar = this.l;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f43020b + ", isDragHovered=" + this.f43021c + ", textLayoutState=" + this.f43022d + ", textFieldState=" + this.f43023e + ", textFieldSelectionState=" + this.f43024f + ", cursorBrush=" + this.f43025g + ", writeable=" + this.f43026h + ", scrollState=" + this.f43027i + ", orientation=" + this.f43028j + ", toolbarRequester=" + this.f43029k + ", platformSelectionBehaviors=" + this.l + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        v80.i1 i1Var;
        v0 v0Var = (v0) sVar;
        boolean zO0 = v0Var.O0();
        boolean z11 = v0Var.f43054q;
        s1 s1Var = v0Var.f43057t;
        o1 o1Var = v0Var.f43056s;
        x2.w wVar = v0Var.f43058u;
        y1 y1Var = v0Var.f43061x;
        boolean z12 = this.f43020b;
        v0Var.f43054q = z12;
        boolean z13 = this.f43021c;
        v0Var.f43055r = z13;
        o1 o1Var2 = this.f43022d;
        v0Var.f43056s = o1Var2;
        s1 s1Var2 = this.f43023e;
        v0Var.f43057t = s1Var2;
        x2.w wVar2 = this.f43024f;
        v0Var.f43058u = wVar2;
        v0Var.f43059v = this.f43025g;
        v0Var.f43060w = this.f43026h;
        y1 y1Var2 = this.f43027i;
        v0Var.f43061x = y1Var2;
        v0Var.f43062y = this.f43028j;
        s2.l lVar = this.f43029k;
        v0Var.f43063z = lVar;
        v0Var.A = this.l;
        v0Var.H.O0(s1Var2, wVar2, o1Var2, z12 || z13);
        s2.j jVar = v0Var.I;
        jVar.f38771q.f38778a = null;
        jVar.f38771q = lVar;
        lVar.f38778a = jVar;
        lVar.f38779b = jVar.isAttached() ? s2.k.Attached : s2.k.Detached;
        if (!v0Var.O0()) {
            b2 b2Var = v0Var.C;
            if (b2Var != null) {
                b2Var.a(null);
            }
            v0Var.C = null;
            q qVar = v0Var.B;
            if (qVar != null && (i1Var = (v80.i1) qVar.f43018b.getAndSet(null)) != null) {
                i1Var.a(null);
            }
        } else if (!z11 || !Intrinsics.areEqual(s1Var, s1Var2) || !zO0) {
            v0Var.P0();
        }
        if (Intrinsics.areEqual(s1Var, s1Var2) && Intrinsics.areEqual(o1Var, o1Var2) && Intrinsics.areEqual(wVar, wVar2) && Intrinsics.areEqual(y1Var, y1Var2)) {
            return;
        }
        b5.m.g(v0Var).F();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
