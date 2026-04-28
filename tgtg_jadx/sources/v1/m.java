package v1;

import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv1/m;", "Lb5/h1;", "Lv1/o;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4.r f41782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i4.v0 f41784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f41785f;

    public m(long j9, i4.r rVar, float f11, i4.v0 v0Var, Function1 function1, int i11) {
        j9 = (i11 & 1) != 0 ? i4.v.f23315h : j9;
        rVar = (i11 & 2) != 0 ? null : rVar;
        this.f41781b = j9;
        this.f41782c = rVar;
        this.f41783d = f11;
        this.f41784e = v0Var;
        this.f41785f = function1;
    }

    @Override // b5.h1
    public final b4.s create() {
        o oVar = new o();
        oVar.f41803o = this.f41781b;
        oVar.f41804p = this.f41782c;
        oVar.f41805q = this.f41783d;
        oVar.f41806r = this.f41784e;
        oVar.f41807s = 9205357640488583168L;
        return oVar;
    }

    public final boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && i4.v.c(this.f41781b, mVar.f41781b) && Intrinsics.areEqual(this.f41782c, mVar.f41782c) && this.f41783d == mVar.f41783d && Intrinsics.areEqual(this.f41784e, mVar.f41784e);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        int iHashCode = Long.hashCode(this.f41781b) * 31;
        i4.r rVar = this.f41782c;
        return this.f41784e.hashCode() + r8.k.a((iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31, this.f41783d, 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        this.f41785f.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        o oVar = (o) sVar;
        oVar.f41803o = this.f41781b;
        oVar.f41804p = this.f41782c;
        oVar.f41805q = this.f41783d;
        i4.v0 v0Var = oVar.f41806r;
        i4.v0 v0Var2 = this.f41784e;
        if (!Intrinsics.areEqual(v0Var, v0Var2)) {
            oVar.f41806r = v0Var2;
            b5.m.g(oVar).G();
        }
        b5.o.h(oVar);
    }
}
