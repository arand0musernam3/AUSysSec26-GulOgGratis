package w2;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw2/w0;", "Lb5/h1;", "Lw2/e1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class w0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f43067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f43068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x2.w f43069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2.d1 f43071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2.l f43073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y80.e1 f43074i;

    public w0(s1 s1Var, o1 o1Var, x2.w wVar, boolean z11, m2.d1 d1Var, boolean z12, b2.l lVar, y80.e1 e1Var) {
        this.f43067b = s1Var;
        this.f43068c = o1Var;
        this.f43069d = wVar;
        this.f43070e = z11;
        this.f43071f = d1Var;
        this.f43072g = z12;
        this.f43073h = lVar;
        this.f43074i = e1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new e1(this.f43067b, this.f43068c, this.f43069d, this.f43070e, this.f43071f, this.f43072g, this.f43073h, this.f43074i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.areEqual(this.f43067b, w0Var.f43067b) && Intrinsics.areEqual(this.f43068c, w0Var.f43068c) && Intrinsics.areEqual(this.f43069d, w0Var.f43069d) && Intrinsics.areEqual((Object) null, (Object) null) && this.f43070e == w0Var.f43070e && Intrinsics.areEqual(this.f43071f, w0Var.f43071f) && Intrinsics.areEqual((Object) null, (Object) null) && this.f43072g == w0Var.f43072g && Intrinsics.areEqual(this.f43073h, w0Var.f43073h) && Intrinsics.areEqual(this.f43074i, w0Var.f43074i);
    }

    public final int hashCode() {
        int iE = r8.k.e((this.f43073h.hashCode() + r8.k.e((this.f43071f.hashCode() + r8.k.e(r8.k.e((this.f43069d.hashCode() + ((this.f43068c.hashCode() + (this.f43067b.hashCode() * 31)) * 31)) * 961, 31, this.f43070e), 31, false)) * 961, 31, this.f43072g)) * 31, 31, false);
        y80.e1 e1Var = this.f43074i;
        return iE + (e1Var != null ? e1Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f43067b + ", textLayoutState=" + this.f43068c + ", textFieldSelectionState=" + this.f43069d + ", filter=null, enabled=" + this.f43070e + ", readOnly=false, keyboardOptions=" + this.f43071f + ", keyboardActionHandler=null, singleLine=" + this.f43072g + ", interactionSource=" + this.f43073h + ", isPassword=false, stylusHandwritingTrigger=" + this.f43074i + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        b2 b2Var;
        e1 e1Var = (e1) sVar;
        w4.m0 m0Var = e1Var.f42887z;
        v1.p0 p0Var = e1Var.f42886y;
        boolean z11 = e1Var.f42881t;
        s1 s1Var = e1Var.f42878q;
        m2.d1 d1Var = e1Var.f42882u;
        x2.w wVar = e1Var.f42880s;
        b2.l lVar = e1Var.f42884w;
        y80.e1 e1Var2 = e1Var.f42885x;
        s1 s1Var2 = this.f43067b;
        e1Var.f42878q = s1Var2;
        e1Var.f42879r = this.f43068c;
        x2.w wVar2 = this.f43069d;
        e1Var.f42880s = wVar2;
        boolean z12 = this.f43070e;
        e1Var.f42881t = z12;
        m2.d1 d1Var2 = this.f43071f;
        e1Var.f42882u = d1Var2;
        e1Var.f42883v = this.f43072g;
        b2.l lVar2 = this.f43073h;
        e1Var.f42884w = lVar2;
        y80.e1 e1Var3 = this.f43074i;
        e1Var.f42885x = e1Var3;
        if (z12 != z11 || !Intrinsics.areEqual(s1Var2, s1Var) || !Intrinsics.areEqual(d1Var2, d1Var) || !Intrinsics.areEqual(e1Var3, e1Var2)) {
            if (z12 && (e1Var.R0() || e1Var.G != null)) {
                e1Var.T0(false);
            } else if (!z12) {
                e1Var.P0();
            }
        }
        if (z12 != z11 || z12 != z11 || d1Var2.a() != d1Var.a()) {
            b5.m.g(e1Var).G();
        }
        if (!Intrinsics.areEqual(wVar2, wVar)) {
            m0Var.N0();
            if (e1Var.isAttached()) {
                wVar2.f43792m = e1Var.H;
                if (e1Var.R0() && (b2Var = e1Var.D) != null) {
                    b2Var.a(null);
                    e1Var.D = v80.f0.B(e1Var.getCoroutineScope(), null, null, new m2.f0(wVar2, null, 1), 3);
                }
            }
            wVar2.l = new y0(e1Var, 4);
        }
        if (!Intrinsics.areEqual(lVar2, lVar)) {
            m0Var.N0();
            if (p0Var.isAttached()) {
                p0Var.Q0(lVar2);
            }
        }
        if (z12 != z11) {
            if (!z12) {
                e1Var.M0(p0Var);
            } else {
                e1Var.L0(p0Var);
                p0Var.Q0(lVar2);
            }
        }
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
