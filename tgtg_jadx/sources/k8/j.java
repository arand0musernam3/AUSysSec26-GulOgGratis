package k8;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f26167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f26168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f26170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f26171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f26172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f26173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f26174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f26175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k3.a f26176j;

    public j() {
        this.f26167a = Math.sqrt(1500.0d);
        this.f26168b = 0.5d;
        this.f26169c = false;
        this.f26175i = Double.MAX_VALUE;
        this.f26176j = new k3.a();
    }

    public final void a(float f11) {
        if (f11 < 0.0f) {
            i4.a.f("Damping ratio must be non-negative");
        } else {
            this.f26168b = f11;
            this.f26169c = false;
        }
    }

    public final void b(float f11) {
        if (f11 <= 0.0f) {
            i4.a.f("Spring stiffness constant must be positive.");
        } else {
            this.f26167a = Math.sqrt(f11);
            this.f26169c = false;
        }
    }

    public final k3.a c(double d3, double d11, long j9) {
        double dSin;
        double dCos;
        if (!this.f26169c) {
            if (this.f26175i == Double.MAX_VALUE) {
                h2.b("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d12 = this.f26168b;
            if (d12 > 1.0d) {
                double d13 = this.f26167a;
                this.f26172f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f26168b;
                double d15 = this.f26167a;
                this.f26173g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f26174h = Math.sqrt(1.0d - (d12 * d12)) * this.f26167a;
            }
            this.f26169c = true;
        }
        double d16 = j9 / 1000.0d;
        double d17 = d3 - this.f26175i;
        double d18 = this.f26168b;
        if (d18 > 1.0d) {
            double d19 = this.f26173g;
            double d21 = ((d19 * d17) - d11) / (d19 - this.f26172f);
            double d22 = d17 - d21;
            dSin = (Math.pow(2.718281828459045d, this.f26172f * d16) * d21) + (Math.pow(2.718281828459045d, d19 * d16) * d22);
            double d23 = this.f26173g;
            double dPow = Math.pow(2.718281828459045d, d23 * d16) * d22 * d23;
            double d24 = this.f26172f;
            dCos = (Math.pow(2.718281828459045d, d24 * d16) * d21 * d24) + dPow;
        } else if (d18 == 1.0d) {
            double d25 = this.f26167a;
            double d26 = (d25 * d17) + d11;
            double d27 = (d26 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d25) * d16) * d27;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f26167a) * d16) * d27;
            double d28 = -this.f26167a;
            dCos = (Math.pow(2.718281828459045d, d28 * d16) * d26) + (dPow3 * d28);
            dSin = dPow2;
        } else {
            double d29 = 1.0d / this.f26174h;
            double d31 = this.f26167a;
            double d32 = ((d18 * d31 * d17) + d11) * d29;
            dSin = ((Math.sin(this.f26174h * d16) * d32) + (Math.cos(this.f26174h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d31 * d16);
            double d33 = this.f26167a;
            double d34 = this.f26168b;
            double d35 = (-d33) * dSin * d34;
            double dPow4 = Math.pow(2.718281828459045d, (-d34) * d33 * d16);
            double d36 = this.f26174h;
            double dSin2 = Math.sin(d36 * d16) * (-d36) * d17;
            double d37 = this.f26174h;
            dCos = (((Math.cos(d37 * d16) * d32 * d37) + dSin2) * dPow4) + d35;
        }
        float f11 = (float) (dSin + this.f26175i);
        k3.a aVar = this.f26176j;
        aVar.f25779a = f11;
        aVar.f25780b = (float) dCos;
        return aVar;
    }

    public j(float f11) {
        this.f26167a = Math.sqrt(1500.0d);
        this.f26168b = 0.5d;
        this.f26169c = false;
        this.f26176j = new k3.a();
        this.f26175i = f11;
    }
}
