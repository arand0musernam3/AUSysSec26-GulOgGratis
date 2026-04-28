package i3;

import b5.h1;
import c5.m2;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Li3/q;", "T", "Lb5/h1;", "Li3/s;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDraggableAnchors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsElementV2\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,159:1\n110#2:160\n*S KotlinDebug\n*F\n+ 1 DraggableAnchors.kt\nandroidx/compose/material3/internal/DraggableAnchorsElementV2\n*L\n94#1:160\n*E\n"})
final class q<T> extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.r f23168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f23169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2 f23170d;

    public q(z1.r rVar, Function2 function2, h2 h2Var) {
        this.f23168b = rVar;
        this.f23169c = function2;
        this.f23170d = h2Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        s sVar = new s();
        sVar.f23178o = this.f23168b;
        sVar.f23179p = this.f23169c;
        sVar.f23180q = this.f23170d;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f23168b, qVar.f23168b) && this.f23169c == qVar.f23169c && this.f23170d == qVar.f23170d;
    }

    public final int hashCode() {
        return this.f23170d.hashCode() + ((this.f23169c.hashCode() + (this.f23168b.hashCode() * 31)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        c5.s sVar = m2.f7291a;
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        s sVar2 = (s) sVar;
        sVar2.f23178o = this.f23168b;
        sVar2.f23179p = this.f23169c;
        sVar2.f23180q = this.f23170d;
    }
}
