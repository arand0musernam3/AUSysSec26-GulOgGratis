package i4;

import b5.h1;
import b5.s1;
import c5.l3;
import c5.o2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li4/f0;", "Lb5/h1;", "Li4/w0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class f0 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0 f23249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f23251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f23252k;

    public f0(float f11, float f12, float f13, float f14, float f15, long j9, v0 v0Var, boolean z11, long j11, long j12) {
        this.f23243b = f11;
        this.f23244c = f12;
        this.f23245d = f13;
        this.f23246e = f14;
        this.f23247f = f15;
        this.f23248g = j9;
        this.f23249h = v0Var;
        this.f23250i = z11;
        this.f23251j = j11;
        this.f23252k = j12;
    }

    @Override // b5.h1
    public final b4.s create() {
        w0 w0Var = new w0();
        w0Var.f23319o = this.f23243b;
        w0Var.f23320p = this.f23244c;
        w0Var.f23321q = this.f23245d;
        w0Var.f23322r = this.f23246e;
        w0Var.f23323s = this.f23247f;
        w0Var.f23324t = 8.0f;
        w0Var.f23325u = this.f23248g;
        w0Var.f23326v = this.f23249h;
        w0Var.f23327w = this.f23250i;
        w0Var.f23328x = this.f23251j;
        w0Var.f23329y = this.f23252k;
        w0Var.f23330z = 3;
        w0Var.A = new androidx.fragment.app.r(w0Var, 18);
        return w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Float.compare(this.f23243b, f0Var.f23243b) == 0 && Float.compare(this.f23244c, f0Var.f23244c) == 0 && Float.compare(this.f23245d, f0Var.f23245d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f23246e, f0Var.f23246e) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f23247f, f0Var.f23247f) == 0 && Float.compare(8.0f, 8.0f) == 0 && z0.a(this.f23248g, f0Var.f23248g) && Intrinsics.areEqual(this.f23249h, f0Var.f23249h) && this.f23250i == f0Var.f23250i && Intrinsics.areEqual((Object) null, (Object) null) && v.c(this.f23251j, f0Var.f23251j) && v.c(this.f23252k, f0Var.f23252k) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iA = r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f23243b) * 31, this.f23244c, 31), this.f23245d, 31), 0.0f, 31), 0.0f, 31), this.f23246e, 31), 0.0f, 31), 0.0f, 31), this.f23247f, 31), 8.0f, 31);
        int i11 = z0.f23336c;
        int iE = r8.k.e((this.f23249h.hashCode() + e0.f.b(iA, 31, this.f23248g)) * 31, 961, this.f23250i);
        int i12 = v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return r8.k.b(3, r8.k.b(0, e0.f.b(e0.f.b(iE, 31, this.f23251j), 31, this.f23252k), 31), 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "graphicsLayer";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Float.valueOf(this.f23243b), "scaleX");
        l3Var.b(Float.valueOf(this.f23244c), "scaleY");
        l3Var.b(Float.valueOf(this.f23245d), "alpha");
        Float fValueOf = Float.valueOf(0.0f);
        l3Var.b(fValueOf, "translationX");
        l3Var.b(fValueOf, "translationY");
        l3Var.b(Float.valueOf(this.f23246e), "shadowElevation");
        l3Var.b(fValueOf, "rotationX");
        l3Var.b(fValueOf, "rotationY");
        l3Var.b(Float.valueOf(this.f23247f), "rotationZ");
        l3Var.b(Float.valueOf(8.0f), "cameraDistance");
        l3Var.b(new z0(this.f23248g), "transformOrigin");
        l3Var.b(this.f23249h, "shape");
        l3Var.b(Boolean.valueOf(this.f23250i), "clip");
        l3Var.b(null, "renderEffect");
        l3Var.b(new v(this.f23251j), "ambientShadowColor");
        l3Var.b(new v(this.f23252k), "spotShadowColor");
        l3Var.b(new b0(), "compositingStrategy");
        l3Var.b(new n(), "blendMode");
        l3Var.b(null, "colorFilter");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb2.append(this.f23243b);
        sb2.append(", scaleY=");
        sb2.append(this.f23244c);
        sb2.append(", alpha=");
        sb2.append(this.f23245d);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f23246e);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f23247f);
        sb2.append(", cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) z0.b(this.f23248g));
        sb2.append(", shape=");
        sb2.append(this.f23249h);
        sb2.append(", clip=");
        sb2.append(this.f23250i);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        r8.k.x(this.f23251j, ", spotShadowColor=", sb2);
        sb2.append((Object) v.i(this.f23252k));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) n.a(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        s1 s1Var;
        w0 w0Var = (w0) sVar;
        w0Var.f23319o = this.f23243b;
        w0Var.f23320p = this.f23244c;
        w0Var.f23321q = this.f23245d;
        w0Var.f23322r = this.f23246e;
        w0Var.f23323s = this.f23247f;
        w0Var.f23324t = 8.0f;
        w0Var.f23325u = this.f23248g;
        w0Var.f23326v = this.f23249h;
        w0Var.f23327w = this.f23250i;
        w0Var.f23328x = this.f23251j;
        w0Var.f23329y = this.f23252k;
        w0Var.f23330z = 3;
        androidx.fragment.app.r rVar = w0Var.A;
        if (w0Var.getNode().isAttached() && (s1Var = b5.m.e(w0Var, 2).f5967q) != null) {
            s1Var.B1(rVar, true);
        }
    }
}
