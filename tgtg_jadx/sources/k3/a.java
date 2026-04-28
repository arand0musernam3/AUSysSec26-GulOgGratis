package k3;

import s1.a1;
import s1.b1;
import t1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f25780b;

    public a1 a(float f11) {
        double dB = b(f11);
        double d3 = b1.f38529a;
        double d11 = d3 - 1.0d;
        return new a1(f11, (float) (Math.exp((d3 / d11) * dB) * ((double) (this.f25779a * this.f25780b))), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public double b(float f11) {
        float[] fArr = s1.b.f38527a;
        return Math.log(((double) (Math.abs(f11) * 0.35f)) / ((double) (this.f25779a * this.f25780b)));
    }

    @Override // t1.z
    public float d() {
        return this.f25779a;
    }

    @Override // t1.z
    public float e(float f11, long j9) {
        return f11 * ((float) Math.exp(((j9 / 1000000) / 1000.0f) * this.f25780b));
    }

    @Override // t1.z
    public float f(float f11, float f12, long j9) {
        float f13 = this.f25780b;
        return ((f12 / f13) * ((float) Math.exp((f13 * (j9 / 1000000)) / 1000.0f))) + (f11 - (f12 / f13));
    }

    @Override // t1.z
    public long k(float f11) {
        return ((long) ((((float) Math.log(this.f25779a / Math.abs(f11))) * 1000.0f) / this.f25780b)) * 1000000;
    }

    @Override // t1.z
    public float l(float f11, float f12) {
        if (Math.abs(f12) <= this.f25779a) {
            return f11;
        }
        double dLog = Math.log(Math.abs(r1 / f12));
        float f13 = this.f25780b;
        return ((f12 / f13) * ((float) Math.exp((((double) f13) * ((dLog / ((double) f13)) * ((double) 1000))) / ((double) 1000.0f)))) + (f11 - (f12 / f13));
    }
}
