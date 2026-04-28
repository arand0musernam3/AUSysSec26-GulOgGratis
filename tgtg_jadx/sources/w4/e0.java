package w4;

import b5.h1;
import c5.l3;
import c5.o2;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw4/e0;", "Lb5/h1;", "Lw4/f0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e0 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.q f43118b;

    public e0(b5.q qVar) {
        this.f43118b = qVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new f0(m2.g0.f28859c, this.f43118b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        a aVar = m2.g0.f28859c;
        return Intrinsics.areEqual(aVar, aVar) && Intrinsics.areEqual(this.f43118b, e0Var.f43118b);
    }

    public final int hashCode() {
        int iE = r8.k.e(1022 * 31, 31, false);
        b5.q qVar = this.f43118b;
        return iE + (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "stylusHoverIcon";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(m2.g0.f28859c, InAppMessageBase.ICON);
        l3Var.b(Boolean.FALSE, "overrideDescendants");
        l3Var.b(this.f43118b, "touchBoundsExpansion");
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + m2.g0.f28859c + ", overrideDescendants=false, touchBoundsExpansion=" + this.f43118b + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        f0 f0Var = (f0) sVar;
        a aVar = m2.g0.f28859c;
        if (!Intrinsics.areEqual(f0Var.f43120p, aVar)) {
            f0Var.f43120p = aVar;
            if (f0Var.f43121q) {
                f0Var.N0();
            }
        }
        f0Var.f43119o = this.f43118b;
    }
}
