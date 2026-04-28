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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk2/h;", "Lb5/h1;", "Lk2/i;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class h extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5.a f25767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f25768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f25769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f25771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f25772g;

    public h(l5.a aVar, l lVar, e1 e1Var, boolean z11, j jVar, Function0 function0) {
        this.f25767b = aVar;
        this.f25768c = lVar;
        this.f25769d = e1Var;
        this.f25770e = z11;
        this.f25771f = jVar;
        this.f25772g = function0;
    }

    @Override // b5.h1
    public final s create() {
        i iVar = new i(this.f25768c, this.f25769d, false, this.f25770e, null, this.f25771f, this.f25772g);
        iVar.N = this.f25767b;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25767b == hVar.f25767b && Intrinsics.areEqual(this.f25768c, hVar.f25768c) && Intrinsics.areEqual(this.f25769d, hVar.f25769d) && this.f25770e == hVar.f25770e && Intrinsics.areEqual(this.f25771f, hVar.f25771f) && this.f25772g == hVar.f25772g;
    }

    public final int hashCode() {
        int iHashCode = this.f25767b.hashCode() * 31;
        l lVar = this.f25768c;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        e1 e1Var = this.f25769d;
        return this.f25772g.hashCode() + k.b(this.f25771f.f24632a, k.e(k.e((iHashCode2 + (e1Var != null ? e1Var.hashCode() : 0)) * 31, 31, false), 31, this.f25770e), 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "triStateToggleable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f25767b, "state");
        l3Var.b(this.f25768c, "interactionSource");
        l3Var.b(this.f25769d, "indicationNodeFactory");
        l3Var.b(Boolean.valueOf(this.f25770e), FeatureFlag.ENABLED);
        l3Var.b(this.f25771f, "role");
        l3Var.b(this.f25772g, "onClick");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        i iVar = (i) sVar;
        l5.a aVar = iVar.N;
        l5.a aVar2 = this.f25767b;
        if (aVar != aVar2) {
            iVar.N = aVar2;
            m.g(iVar).G();
        }
        iVar.Z0(this.f25768c, this.f25769d, false, this.f25770e, null, this.f25771f, this.f25772g);
    }
}
