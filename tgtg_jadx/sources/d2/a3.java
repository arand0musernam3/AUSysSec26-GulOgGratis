package d2;

import c5.l3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/a3;", "Lb5/h1;", "Ld2/c3;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a3 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f13737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f13738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13740e;

    public a3(e0 e0Var, Function2 function2, Object obj, String str) {
        this.f13737b = e0Var;
        this.f13738c = function2;
        this.f13739d = obj;
        this.f13740e = str;
    }

    @Override // b5.h1
    public final b4.s create() {
        c3 c3Var = new c3();
        c3Var.f13769o = this.f13737b;
        c3Var.f13770p = this.f13738c;
        return c3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a3.class != obj.getClass()) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.f13737b == a3Var.f13737b && Intrinsics.areEqual(this.f13739d, a3Var.f13739d);
    }

    public final int hashCode() {
        return this.f13739d.hashCode() + r8.k.e(this.f13737b.hashCode() * 31, 31, false);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = this.f13740e;
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f13739d, "align");
        l3Var.b(Boolean.FALSE, "unbounded");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        c3 c3Var = (c3) sVar;
        c3Var.f13769o = this.f13737b;
        c3Var.f13770p = this.f13738c;
    }
}
