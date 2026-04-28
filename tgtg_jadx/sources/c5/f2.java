package c5;

import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements b5.c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l4.b f7218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.e0 f7219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f7220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function2 f7221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f7222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7224g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f7226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7227j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7230n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i4.g0 f7232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7234r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7236t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f7225h = i4.l0.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z5.c f7228k = z20.b.d();
    public z5.m l = z5.m.Ltr;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k4.b f7229m = new k4.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7231o = i4.z0.f23335b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7235s = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.r f7237u = new androidx.fragment.app.r(this, 8);

    public f2(l4.b bVar, i4.e0 e0Var, y yVar, Function2 function2, Function0 function0) {
        this.f7218a = bVar;
        this.f7219b = e0Var;
        this.f7220c = yVar;
        this.f7221d = function2;
        this.f7222e = function0;
        long j9 = Integer.MAX_VALUE;
        this.f7223f = (j9 & 4294967295L) | (j9 << 32);
    }

    public final float[] a() {
        float[] fArrA = this.f7226i;
        if (fArrA == null) {
            fArrA = i4.l0.a();
            this.f7226i = fArrA;
        }
        if (this.f7234r) {
            this.f7234r = false;
            float[] fArrB = b();
            if (this.f7235s) {
                return fArrB;
            }
            if (!d2.e(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z11 = this.f7233q;
        float[] fArr = this.f7225h;
        if (z11) {
            l4.b bVar = this.f7218a;
            long jV = bVar.f27293v;
            l4.d dVar = bVar.f27273a;
            if ((9223372034707292159L & jV) == 9205357640488583168L) {
                jV = o00.h0.v(b0.z.z(this.f7223f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jV & 4294967295L));
            float fB = dVar.B();
            float fV = dVar.v();
            float fD = dVar.D();
            float fP = dVar.p();
            float fR = dVar.r();
            float fC = dVar.c();
            float fL = dVar.L();
            double d3 = ((double) fD) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d3);
            float fCos = (float) Math.cos(d3);
            float f11 = -fSin;
            float f12 = (fV * fCos) - (0.0f * fSin);
            float f13 = (0.0f * fCos) + (fV * fSin);
            double d11 = ((double) fP) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f14 = -fSin2;
            float f15 = fSin * fSin2;
            float f16 = fSin * fCos2;
            float f17 = fCos * fSin2;
            float f18 = fCos * fCos2;
            float f19 = (f13 * fSin2) + (fB * fCos2);
            float f20 = (f13 * fCos2) + ((-fB) * fSin2);
            double d12 = ((double) fR) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f21 = -fSin3;
            float f22 = (fCos3 * f15) + (f21 * fCos2);
            float f23 = (f15 * fSin3) + (fCos2 * fCos3);
            float f24 = fSin3 * fCos;
            float f25 = f23 * fC;
            float f26 = f24 * fC;
            float f27 = ((fSin3 * f16) + (fCos3 * f14)) * fC;
            float f28 = f22 * fL;
            float f29 = fCos * fCos3 * fL;
            float f31 = ((fCos3 * f16) + (f21 * f14)) * fL;
            float f32 = f17 * 1.0f;
            float f33 = f11 * 1.0f;
            float f34 = f18 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f25;
                fArr[1] = f26;
                fArr[2] = f27;
                fArr[3] = 0.0f;
                fArr[4] = f28;
                fArr[5] = f29;
                fArr[6] = f31;
                fArr[7] = 0.0f;
                fArr[8] = f32;
                fArr[9] = f33;
                fArr[10] = f34;
                fArr[11] = 0.0f;
                float f35 = -fIntBitsToFloat;
                fArr[12] = ((f25 * f35) - (fIntBitsToFloat2 * f28)) + f19 + fIntBitsToFloat;
                fArr[13] = ((f26 * f35) - (fIntBitsToFloat2 * f29)) + f12 + fIntBitsToFloat2;
                fArr[14] = ((f35 * f27) - (fIntBitsToFloat2 * f31)) + f20;
                fArr[15] = 1.0f;
            }
            this.f7233q = false;
            this.f7235s = i4.g0.s(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.f7227j || this.f7224g) {
            return;
        }
        this.f7220c.invalidate();
        f(true);
    }

    public final void d(long j9) {
        y yVar = this.f7220c;
        if (yVar.l) {
            yVar.M(-4.0f);
        }
        l4.b bVar = this.f7218a;
        if (!z5.j.b(bVar.f27291t, j9)) {
            bVar.f27291t = j9;
            bVar.f27273a.o((int) (j9 >> 32), (int) (j9 & 4294967295L), bVar.f27292u);
        }
        ViewParent parent = yVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(yVar, yVar);
        }
    }

    public final void e(long j9) {
        if (z5.l.a(j9, this.f7223f)) {
            return;
        }
        y yVar = this.f7220c;
        if (yVar.l) {
            yVar.M(-4.0f);
        }
        this.f7223f = j9;
        c();
    }

    public final void f(boolean z11) {
        if (z11 != this.f7227j) {
            this.f7227j = z11;
            y yVar = this.f7220c;
            q1.o0 o0Var = yVar.D;
            boolean z12 = yVar.F;
            if (!z11) {
                if (z12) {
                    return;
                }
                o0Var.k(this);
                q1.o0 o0Var2 = yVar.E;
                if (o0Var2 != null) {
                    o0Var2.k(this);
                    return;
                }
                return;
            }
            if (!z12) {
                o0Var.g(this);
                return;
            }
            q1.o0 o0Var3 = yVar.E;
            if (o0Var3 == null) {
                o0Var3 = new q1.o0();
                yVar.E = o0Var3;
            }
            o0Var3.g(this);
        }
    }

    public final void g() {
        if (this.f7227j) {
            if (!i4.z0.a(this.f7231o, i4.z0.f23335b) && !z5.l.a(this.f7218a.f27292u, this.f7223f)) {
                l4.b bVar = this.f7218a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f7231o >> 32)) * ((int) (this.f7223f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f7231o & 4294967295L)) * ((int) (this.f7223f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!h4.b.b(bVar.f27293v, jFloatToRawIntBits)) {
                    bVar.f27293v = jFloatToRawIntBits;
                    bVar.f27273a.s(jFloatToRawIntBits);
                }
            }
            l4.b bVar2 = this.f7218a;
            z5.c cVar = this.f7228k;
            z5.m mVar = this.l;
            long j9 = this.f7223f;
            long j11 = bVar2.f27292u;
            l4.d dVar = bVar2.f27273a;
            if (!z5.l.a(j11, j9)) {
                bVar2.f27292u = j9;
                long j12 = bVar2.f27291t;
                dVar.o((int) (j12 >> 32), (int) (4294967295L & j12), j9);
                if (bVar2.f27281i == 9205357640488583168L) {
                    bVar2.f27279g = true;
                    bVar2.a();
                }
            }
            bVar2.f27274b = cVar;
            bVar2.f27275c = mVar;
            bVar2.f27276d = this.f7237u;
            dVar.I(cVar, mVar, bVar2, bVar2.f27277e);
            f(false);
        }
    }
}
