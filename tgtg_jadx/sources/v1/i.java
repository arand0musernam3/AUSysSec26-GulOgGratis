package v1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.c f41751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41752b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f41753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f41754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b5.n f41759i;

    public i(Context context, z5.c cVar, long j9, d2.z1 z1Var) {
        this.f41751a = cVar;
        n0 n0Var = new n0(context, i4.g0.C(j9));
        this.f41753c = n0Var;
        this.f41754d = new m3.k1(Unit.f26487a, m3.f.f29272d);
        this.f41755e = true;
        this.f41757g = 0L;
        this.f41758h = -1L;
        a3.i1 i1Var = new a3.i1(this, 6);
        w4.n nVar = w4.h0.f43125a;
        w4.m0 m0Var = new w4.m0(null, null, i1Var);
        this.f41759i = Build.VERSION.SDK_INT >= 31 ? new c2(m0Var, this, n0Var) : new s0(m0Var, this, n0Var, z1Var);
    }

    public final void a() {
        boolean z11;
        n0 n0Var = this.f41753c;
        EdgeEffect edgeEffect = n0Var.f41794d;
        boolean z12 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = !edgeEffect.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = n0Var.f41795e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 = !edgeEffect2.isFinished() || z11;
        }
        EdgeEffect edgeEffect3 = n0Var.f41796f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 = !edgeEffect3.isFinished() || z11;
        }
        EdgeEffect edgeEffect4 = n0Var.f41797g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z11) {
                z12 = false;
            }
            z11 = z12;
        }
        if (z11) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r20.invoke(r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, kotlin.jvm.functions.Function2 r20, z70.c r21) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i.b(long, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }

    public final long c() {
        long jV = this.f41752b;
        if ((9223372034707292159L & jV) == 9205357640488583168L) {
            jV = o00.h0.v(this.f41757g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32)) / Float.intBitsToFloat((int) (this.f41757g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jV & 4294967295L)) / Float.intBitsToFloat((int) (this.f41757g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f41755e) {
            this.f41754d.setValue(Unit.f26487a);
        }
    }

    public final float e(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i11 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f41757g & 4294967295L));
        EdgeEffect edgeEffectB = this.f41753c.b();
        float fC = -fIntBitsToFloat2;
        float f11 = 1 - fIntBitsToFloat;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fC = l.c(edgeEffectB, fC, f11);
        } else {
            edgeEffectB.onPull(fC, f11);
        }
        return (i12 >= 31 ? l.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f41757g)) * (-fC) : Float.intBitsToFloat(i11);
    }

    public final float f(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i11 = (int) (j9 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f41757g >> 32));
        EdgeEffect edgeEffectC = this.f41753c.c();
        float f11 = 1 - fIntBitsToFloat;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fIntBitsToFloat2 = l.c(edgeEffectC, fIntBitsToFloat2, f11);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f11);
        }
        return (i12 >= 31 ? l.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f41757g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i11);
    }

    public final float g(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i11 = (int) (j9 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f41757g >> 32));
        EdgeEffect edgeEffectD = this.f41753c.d();
        float fC = -fIntBitsToFloat2;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fC = l.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i12 >= 31 ? l.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f41757g >> 32)) * (-fC) : Float.intBitsToFloat(i11);
    }

    public final float h(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i11 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f41757g & 4294967295L));
        EdgeEffect edgeEffectE = this.f41753c.e();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fIntBitsToFloat2 = l.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i12 >= 31 ? l.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f41757g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i11);
    }

    public final void i(long j9) {
        boolean zA = h4.e.a(this.f41757g, 0L);
        boolean zA2 = h4.e.a(j9, this.f41757g);
        this.f41757g = j9;
        if (!zA2) {
            int iB = j80.c.b(Float.intBitsToFloat((int) (j9 >> 32)));
            long jB = (((long) j80.c.b(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
            n0 n0Var = this.f41753c;
            n0Var.f41793c = jB;
            EdgeEffect edgeEffect = n0Var.f41794d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = n0Var.f41795e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = n0Var.f41796f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = n0Var.f41797g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = n0Var.f41798h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = n0Var.f41799i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = n0Var.f41800j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = n0Var.f41801k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB), (int) (jB >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
