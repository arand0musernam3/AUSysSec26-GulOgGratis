package f4;

import androidx.fragment.app.r;
import b4.s;
import b5.h1;
import b5.s1;
import c5.l3;
import c5.o2;
import i4.v;
import i4.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf4/o;", "Lb5/h1;", "Li4/q;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class o extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f17316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17319f;

    public o(float f11, v0 v0Var, boolean z11, long j9, long j11) {
        this.f17315b = f11;
        this.f17316c = v0Var;
        this.f17317d = z11;
        this.f17318e = j9;
        this.f17319f = j11;
    }

    @Override // b5.h1
    public final s create() {
        return new i4.q(new r(this, 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return z5.f.c(this.f17315b, oVar.f17315b) && Intrinsics.areEqual(this.f17316c, oVar.f17316c) && this.f17317d == oVar.f17317d && v.c(this.f17318e, oVar.f17318e) && v.c(this.f17319f, oVar.f17319f);
    }

    public final int hashCode() {
        int iE = r8.k.e((this.f17316c.hashCode() + (Float.hashCode(this.f17315b) * 31)) * 31, 31, this.f17317d);
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return Long.hashCode(this.f17319f) + e0.f.b(iE, 31, this.f17318e);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "shadow";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(new z5.f(this.f17315b), "elevation");
        l3Var.b(this.f17316c, "shape");
        l3Var.b(Boolean.valueOf(this.f17317d), "clip");
        l3Var.b(new v(this.f17318e), "ambientColor");
        l3Var.b(new v(this.f17319f), "spotColor");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        r8.k.u(this.f17315b, ", shape=", sb2);
        sb2.append(this.f17316c);
        sb2.append(", clip=");
        sb2.append(this.f17317d);
        sb2.append(", ambientColor=");
        r8.k.x(this.f17318e, ", spotColor=", sb2);
        sb2.append((Object) v.i(this.f17319f));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // b5.h1
    public final void update(s sVar) {
        s1 s1Var;
        i4.q qVar = (i4.q) sVar;
        r rVar = new r(this, 16);
        qVar.f23277o = rVar;
        if (qVar.getNode().isAttached() && (s1Var = b5.m.e(qVar, 2).f5967q) != null) {
            s1Var.B1(rVar, true);
        }
    }
}
