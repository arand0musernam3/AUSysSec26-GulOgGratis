package w4;

import b5.h1;
import c5.l3;
import c5.o2;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw4/p;", "Lb5/h1;", "Lw4/q;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f43171b;

    public p(a aVar) {
        this.f43171b = aVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new q(this.f43171b, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f43171b, ((p) obj).f43171b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f43171b.f43096b * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "pointerHoverIcon";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f43171b, InAppMessageBase.ICON);
        l3Var.b(Boolean.FALSE, "overrideDescendants");
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f43171b + ", overrideDescendants=false)";
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        q qVar = (q) sVar;
        a aVar = qVar.f43120p;
        a aVar2 = this.f43171b;
        if (Intrinsics.areEqual(aVar, aVar2)) {
            return;
        }
        qVar.f43120p = aVar2;
        if (qVar.f43121q) {
            qVar.N0();
        }
    }
}
