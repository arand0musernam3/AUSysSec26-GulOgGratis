package i4;

import b5.l2;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends b4.s implements b5.c0, l2 {
    public androidx.fragment.app.r A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f23319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f23320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f23322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f23323s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f23324t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f23325u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v0 f23326v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f23328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f23329y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23330z;

    @Override // b5.l2
    public final boolean c() {
        return false;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        if (this.f23327w) {
            j5.z.n(b0Var, this.f23326v);
        }
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        m1 m1VarD = t0Var.D(j9);
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new b4.x(13, m1VarD, this));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f23319o);
        sb2.append(", scaleY=");
        sb2.append(this.f23320p);
        sb2.append(", alpha = ");
        sb2.append(this.f23321q);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f23322r);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f23323s);
        sb2.append(", cameraDistance=");
        sb2.append(this.f23324t);
        sb2.append(", transformOrigin=");
        sb2.append((Object) z0.b(this.f23325u));
        sb2.append(", shape=");
        sb2.append(this.f23326v);
        sb2.append(", clip=");
        sb2.append(this.f23327w);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        r8.k.x(this.f23328x, ", spotShadowColor=", sb2);
        r8.k.x(this.f23329y, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb2);
        sb2.append((Object) n.a(this.f23330z));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
