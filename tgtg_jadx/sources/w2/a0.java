package w2;

import a3.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw2/a0;", "Lb5/h1;", "Lw2/b0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class a0 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f42829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.e1 f42830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f42831d;

    public a0(b bVar, m2.e1 e1Var, l3 l3Var) {
        this.f42829b = bVar;
        this.f42830c = e1Var;
        this.f42831d = l3Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new b0(this.f42829b, this.f42830c, this.f42831d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f42829b, a0Var.f42829b) && Intrinsics.areEqual(this.f42830c, a0Var.f42830c) && Intrinsics.areEqual(this.f42831d, a0Var.f42831d);
    }

    public final int hashCode() {
        return this.f42831d.hashCode() + ((this.f42830c.hashCode() + (this.f42829b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f42829b + ", legacyTextFieldState=" + this.f42830c + ", textFieldSelectionManager=" + this.f42831d + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) throws Throwable {
        b0 b0Var = (b0) sVar;
        if (b0Var.isAttached()) {
            b0Var.f42839o.e();
            b0Var.f42839o.k(b0Var);
        }
        b0Var.f42839o = this.f42829b;
        if (b0Var.isAttached()) {
            b bVar = b0Var.f42839o;
            if (bVar.f42835a != null) {
                c2.a.c("Expected textInputModifierNode to be null");
            }
            bVar.f42835a = b0Var;
        }
        b0Var.f42840p = this.f42830c;
        b0Var.f42841q = this.f42831d;
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
    }
}
