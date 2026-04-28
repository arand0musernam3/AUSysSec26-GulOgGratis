package i2;

import java.util.concurrent.CancellationException;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f22781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f22782b;

    public a(e0 e0Var, h2 h2Var) {
        this.f22781a = e0Var;
        this.f22782b = h2Var;
    }

    @Override // v4.a
    public final long J(int i11, long j9) {
        if (i11 != 1) {
            return 0L;
        }
        e0 e0Var = this.f22781a;
        if (Math.abs(e0Var.m()) <= 1.0E-6d) {
            return 0L;
        }
        h2 h2Var = h2.Horizontal;
        h2 h2Var2 = this.f22782b;
        if (Math.abs(Float.intBitsToFloat((int) (h2Var2 == h2Var ? j9 >> 32 : j9 & 4294967295L))) <= 0.0f) {
            return 0L;
        }
        float fM = e0Var.m() * e0Var.p();
        float f11 = ((e0Var.n().f22907b + e0Var.n().f22908c) * (-Math.signum(e0Var.m()))) + fM;
        if (e0Var.m() > 0.0f) {
            f11 = fM;
            fM = f11;
        }
        float fIntBitsToFloat = -e0Var.f22829k.e(-n80.p.b(Float.intBitsToFloat((int) (h2Var2 == h2Var ? j9 >> 32 : j9 & 4294967295L)), fM, f11));
        float fIntBitsToFloat2 = h2Var2 == h2Var ? fIntBitsToFloat : Float.intBitsToFloat((int) (j9 >> 32));
        if (h2Var2 != h2.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j9 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }

    @Override // v4.a
    public final Object V(long j9, long j11, x70.c cVar) {
        return new z5.q(this.f22782b == h2.Vertical ? z5.q.a(j11, 0.0f, 0.0f, 2) : z5.q.a(j11, 0.0f, 0.0f, 1));
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        if (i11 != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f22782b == h2.Horizontal ? j11 >> 32 : 4294967295L & j11)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
