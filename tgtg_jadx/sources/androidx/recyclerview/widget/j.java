package androidx.recyclerview.widget;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d10.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3775c;

    public j(ia0.d0 d0Var) {
        this.f3773a = 1;
        d0Var.getClass();
        this.f3775c = d0Var;
        this.f3774b = 262144L;
    }

    public long a(long j9, long j11, float f11) {
        long jF = h4.b.f(this.f3774b, h4.b.e(j9, j11));
        this.f3774b = jF;
        if ((((z1.h2) this.f3775c) == null ? h4.b.c(jF) : Math.abs(g(jF))) < f11) {
            return 9205357640488583168L;
        }
        z1.h2 h2Var = (z1.h2) this.f3775c;
        long j12 = this.f3774b;
        if (h2Var == null) {
            float fC = h4.b.c(j12);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / fC;
            return h4.b.e(this.f3774b, h4.b.g(f11, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fG = g(j12) - (Math.signum(g(this.f3774b)) * f11);
        long j13 = this.f3774b;
        z1.h2 h2Var2 = (z1.h2) this.f3775c;
        z1.h2 h2Var3 = z1.h2.Horizontal;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (h2Var2 == h2Var3 ? j13 & 4294967295L : j13 >> 32));
        if (((z1.h2) this.f3775c) != h2Var3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fG)) << 32);
    }

    public void b(int i11) {
        if (i11 < 64) {
            this.f3774b &= ~(1 << i11);
            return;
        }
        j jVar = (j) this.f3775c;
        if (jVar != null) {
            jVar.b(i11 - 64);
        }
    }

    public int c(int i11) {
        j jVar = (j) this.f3775c;
        if (jVar == null) {
            long j9 = this.f3774b;
            return i11 >= 64 ? Long.bitCount(j9) : Long.bitCount(((1 << i11) - 1) & j9);
        }
        if (i11 < 64) {
            return Long.bitCount(this.f3774b & ((1 << i11) - 1));
        }
        return Long.bitCount(this.f3774b) + jVar.c(i11 - 64);
    }

    public void d() {
        if (((j) this.f3775c) == null) {
            this.f3775c = new j();
        }
    }

    public boolean e(int i11) {
        if (i11 < 64) {
            return (this.f3774b & (1 << i11)) != 0;
        }
        d();
        return ((j) this.f3775c).e(i11 - 64);
    }

    public void f(int i11, boolean z11) {
        if (i11 >= 64) {
            d();
            ((j) this.f3775c).f(i11 - 64, z11);
            return;
        }
        long j9 = this.f3774b;
        boolean z12 = (Long.MIN_VALUE & j9) != 0;
        long j11 = (1 << i11) - 1;
        this.f3774b = ((j9 & (~j11)) << 1) | (j9 & j11);
        if (z11) {
            j(i11);
        } else {
            b(i11);
        }
        if (z12 || ((j) this.f3775c) != null) {
            d();
            ((j) this.f3775c).f(0, z12);
        }
    }

    public float g(long j9) {
        return Float.intBitsToFloat((int) (((z1.h2) this.f3775c) == z1.h2.Horizontal ? j9 >> 32 : j9 & 4294967295L));
    }

    public boolean h(int i11) {
        if (i11 >= 64) {
            d();
            return ((j) this.f3775c).h(i11 - 64);
        }
        long j9 = 1 << i11;
        long j11 = this.f3774b;
        boolean z11 = (j11 & j9) != 0;
        long j12 = j11 & (~j9);
        this.f3774b = j12;
        long j13 = j9 - 1;
        this.f3774b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        j jVar = (j) this.f3775c;
        if (jVar != null) {
            if (jVar.e(0)) {
                j(63);
            }
            ((j) this.f3775c).h(0);
        }
        return z11;
    }

    public void i() {
        this.f3774b = 0L;
        j jVar = (j) this.f3775c;
        if (jVar != null) {
            jVar.i();
        }
    }

    public void j(int i11) {
        if (i11 < 64) {
            this.f3774b |= 1 << i11;
        } else {
            d();
            ((j) this.f3775c).j(i11 - 64);
        }
    }

    @Override // d10.d
    public /* synthetic */ void onFailure(Exception exc) {
        t5.a aVar = (t5.a) this.f3775c;
        ((AtomicLong) aVar.f39793d).set(this.f3774b);
    }

    public String toString() {
        switch (this.f3773a) {
            case 0:
                if (((j) this.f3775c) == null) {
                    return Long.toBinaryString(this.f3774b);
                }
                return ((j) this.f3775c).toString() + "xx" + Long.toBinaryString(this.f3774b);
            default:
                return super.toString();
        }
    }

    public j(vz.b bVar) {
        this.f3773a = 3;
        com.google.android.gms.common.internal.i0.h(bVar);
        this.f3775c = bVar;
    }

    public /* synthetic */ j(int i11, long j9, Object obj) {
        this.f3773a = i11;
        this.f3775c = obj;
        this.f3774b = j9;
    }

    public j() {
        this.f3773a = 0;
        this.f3774b = 0L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(z1.h2 h2Var, int i11) {
        this(4, 0L, (i11 & 1) != 0 ? null : h2Var);
        this.f3773a = 4;
    }
}
