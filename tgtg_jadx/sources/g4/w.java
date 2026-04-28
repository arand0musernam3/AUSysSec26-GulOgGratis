package g4;

import b5.h1;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg4/w;", "Lb5/h1;", "Lg4/y;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,79:1\n648#2,2:80\n643#2,2:82\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n56#1:80,2\n58#1:82,2\n*E\n"})
final /* data */ class w extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f19989b;

    public w(v vVar) {
        this.f19989b = vVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        y yVar = new y();
        yVar.f19990o = this.f19989b;
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.areEqual(this.f19989b, ((w) obj).f19989b);
    }

    public final int hashCode() {
        return this.f19989b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "focusRequester";
        o2Var.f7309c.b(this.f19989b, "focusRequester");
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f19989b + ')';
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        y yVar = (y) sVar;
        yVar.f19990o.f19988a.j(yVar);
        v vVar = this.f19989b;
        yVar.f19990o = vVar;
        vVar.f19988a.b(yVar);
    }
}
