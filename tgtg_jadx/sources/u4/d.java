package u4;

import b4.s;
import b5.h1;
import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu4/d;", "Lb5/h1;", "Lu4/f;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f40735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f40736c;

    public d(Function1 function1, Function1 function12) {
        this.f40735b = function1;
        this.f40736c = function12;
    }

    @Override // b5.h1
    public final s create() {
        f fVar = new f();
        fVar.f40737o = this.f40735b;
        fVar.f40738p = this.f40736c;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f40735b == dVar.f40735b && this.f40736c == dVar.f40736c;
    }

    public final int hashCode() {
        Function1 function1 = this.f40735b;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f40736c;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        l3 l3Var = o2Var.f7309c;
        Function1 function1 = this.f40735b;
        if (function1 != null) {
            o2Var.f7307a = "onKeyEvent";
            l3Var.b(function1, "onKeyEvent");
        }
        Function1 function12 = this.f40736c;
        if (function12 != null) {
            o2Var.f7307a = "onPreviewKeyEvent";
            l3Var.b(function12, "onPreviewKeyEvent");
        }
    }

    @Override // b5.h1
    public final void update(s sVar) {
        f fVar = (f) sVar;
        fVar.f40737o = this.f40735b;
        fVar.f40738p = this.f40736c;
    }
}
