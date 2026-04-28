package g3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg3/a8;", "Lb5/h1;", "Lg3/c8;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a8 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.c3 f18334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t1.b1 f18337e;

    public a8(m3.k1 k1Var, int i11, boolean z11, t1.b1 b1Var) {
        this.f18334b = k1Var;
        this.f18335c = i11;
        this.f18336d = z11;
        this.f18337e = b1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        c8 c8Var = new c8();
        c8Var.f18419o = this.f18334b;
        c8Var.f18420p = this.f18335c;
        c8Var.f18421q = this.f18336d;
        c8Var.f18422r = this.f18337e;
        return c8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return Intrinsics.areEqual(this.f18334b, a8Var.f18334b) && this.f18335c == a8Var.f18335c && this.f18336d == a8Var.f18336d && Intrinsics.areEqual(this.f18337e, a8Var.f18337e);
    }

    public final int hashCode() {
        return this.f18337e.hashCode() + r8.k.e(r8.k.b(this.f18335c, this.f18334b.hashCode() * 31, 31), 31, this.f18336d);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f18334b + ", selectedTabIndex=" + this.f18335c + ", followContentSize=" + this.f18336d + ", animationSpec=" + this.f18337e + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        c8 c8Var = (c8) sVar;
        c8Var.f18419o = this.f18334b;
        c8Var.f18420p = this.f18335c;
        c8Var.f18421q = this.f18336d;
        c8Var.f18422r = this.f18337e;
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
    }
}
