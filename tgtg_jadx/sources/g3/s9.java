package g3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg3/s9;", "Lb5/h1;", "Lg3/w9;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class s9 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.k f19487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.b1 f19489d;

    public s9(b2.k kVar, boolean z11, t1.b1 b1Var) {
        this.f19487b = kVar;
        this.f19488c = z11;
        this.f19489d = b1Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        w9 w9Var = new w9();
        w9Var.f19734o = this.f19487b;
        w9Var.f19735p = this.f19488c;
        w9Var.f19736q = this.f19489d;
        w9Var.f19740u = Float.NaN;
        w9Var.f19741v = Float.NaN;
        return w9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return Intrinsics.areEqual(this.f19487b, s9Var.f19487b) && this.f19488c == s9Var.f19488c && Intrinsics.areEqual(this.f19489d, s9Var.f19489d);
    }

    public final int hashCode() {
        return this.f19489d.hashCode() + r8.k.e(this.f19487b.hashCode() * 31, 31, this.f19488c);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "switchThumb";
        c5.l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f19487b, "interactionSource");
        l3Var.b(Boolean.valueOf(this.f19488c), "checked");
        l3Var.b(this.f19489d, "animationSpec");
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f19487b + ", checked=" + this.f19488c + ", animationSpec=" + this.f19489d + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        w9 w9Var = (w9) sVar;
        w9Var.f19734o = this.f19487b;
        boolean z11 = w9Var.f19735p;
        boolean z12 = this.f19488c;
        if (z11 != z12) {
            b5.m.g(w9Var).F();
        }
        w9Var.f19735p = z12;
        w9Var.f19736q = this.f19489d;
        if (w9Var.f19739t == null && !Float.isNaN(w9Var.f19741v)) {
            w9Var.f19739t = t1.c.a(w9Var.f19741v);
        }
        if (w9Var.f19738s != null || Float.isNaN(w9Var.f19740u)) {
            return;
        }
        w9Var.f19738s = t1.c.a(w9Var.f19740u);
    }
}
