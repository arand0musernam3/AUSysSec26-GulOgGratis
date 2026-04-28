package k2;

import b2.l;
import b4.s;
import b5.h1;
import b5.m;
import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import j5.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk2/e;", "Lb5/h1;", "Lk2/g;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f25757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f25760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f25761g;

    public e(boolean z11, l lVar, boolean z12, boolean z13, j jVar, Function1 function1) {
        this.f25756b = z11;
        this.f25757c = lVar;
        this.f25758d = z12;
        this.f25759e = z13;
        this.f25760f = jVar;
        this.f25761g = function1;
    }

    @Override // b5.h1
    public final s create() {
        return new g(this.f25756b, this.f25757c, this.f25758d, this.f25759e, this.f25760f, this.f25761g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f25756b == eVar.f25756b && Intrinsics.areEqual(this.f25757c, eVar.f25757c) && Intrinsics.areEqual((Object) null, (Object) null) && this.f25758d == eVar.f25758d && this.f25759e == eVar.f25759e && Intrinsics.areEqual(this.f25760f, eVar.f25760f) && this.f25761g == eVar.f25761g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f25756b) * 31;
        l lVar = this.f25757c;
        return this.f25761g.hashCode() + k.b(this.f25760f.f24632a, k.e(k.e((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 961, 31, this.f25758d), 31, this.f25759e), 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "toggleable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(o2Var.f7308b, "value");
        l3Var.b(this.f25757c, "interactionSource");
        l3Var.b(null, "indicationNodeFactory");
        l3Var.b(Boolean.valueOf(this.f25759e), FeatureFlag.ENABLED);
        l3Var.b(this.f25760f, "role");
        l3Var.b(this.f25761g, "onValueChange");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        g gVar = (g) sVar;
        boolean z11 = gVar.N;
        boolean z12 = this.f25756b;
        if (z11 != z12) {
            gVar.N = z12;
            m.g(gVar).G();
        }
        gVar.O = this.f25761g;
        gVar.Z0(this.f25757c, null, this.f25758d, this.f25759e, null, this.f25760f, gVar.P);
    }
}
