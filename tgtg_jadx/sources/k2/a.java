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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import v1.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk2/a;", "Lb5/h1;", "Lk2/d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f25746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f25747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f25749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f25750g;

    public a(boolean z11, l lVar, e1 e1Var, boolean z12, j jVar, Function0 function0) {
        this.f25745b = z11;
        this.f25746c = lVar;
        this.f25747d = e1Var;
        this.f25748e = z12;
        this.f25749f = jVar;
        this.f25750g = function0;
    }

    @Override // b5.h1
    public final s create() {
        d dVar = new d(this.f25746c, this.f25747d, false, this.f25748e, null, this.f25749f, this.f25750g);
        dVar.N = this.f25745b;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25745b == aVar.f25745b && Intrinsics.areEqual(this.f25746c, aVar.f25746c) && Intrinsics.areEqual(this.f25747d, aVar.f25747d) && this.f25748e == aVar.f25748e && Intrinsics.areEqual(this.f25749f, aVar.f25749f) && this.f25750g == aVar.f25750g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f25745b) * 31;
        l lVar = this.f25746c;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        e1 e1Var = this.f25747d;
        int iE = k.e(k.e((iHashCode2 + (e1Var != null ? e1Var.hashCode() : 0)) * 31, 31, false), 31, this.f25748e);
        j jVar = this.f25749f;
        return this.f25750g.hashCode() + ((iE + (jVar != null ? Integer.hashCode(jVar.f24632a) : 0)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "selectable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Boolean.valueOf(this.f25745b), "selected");
        l3Var.b(this.f25746c, "interactionSource");
        l3Var.b(this.f25747d, "indicationNodeFactory");
        l3Var.b(Boolean.valueOf(this.f25748e), FeatureFlag.ENABLED);
        l3Var.b(this.f25749f, "role");
        l3Var.b(this.f25750g, "onClick");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        d dVar = (d) sVar;
        boolean z11 = dVar.N;
        boolean z12 = this.f25745b;
        if (z11 != z12) {
            dVar.N = z12;
            m.g(dVar).G();
        }
        dVar.Z0(this.f25746c, this.f25747d, false, this.f25748e, null, this.f25749f, this.f25750g);
    }
}
