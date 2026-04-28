package q6;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f36061r = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i6.e f36062a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f36064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f36066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f36067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36069h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36063b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36070i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36071j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36072k = -1;
    public float l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p f36073m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedHashMap f36074n = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36075o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f36076p = new double[18];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f36077q = new double[18];

    public static boolean c(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) != Float.isNaN(f12) : Math.abs(f11 - f12) > 1.0E-6f;
    }

    public static void f(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f17 = (float) dArr[i11];
            double d3 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f13 = f17;
            } else if (i12 == 2) {
                f15 = f17;
            } else if (i12 == 3) {
                f14 = f17;
            } else if (i12 == 4) {
                f16 = f17;
            }
        }
        float f18 = f13 - ((0.0f * f14) / 2.0f);
        float f19 = f15 - ((0.0f * f16) / 2.0f);
        fArr[0] = (((f14 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
        fArr[1] = (((f16 * 1.0f) + f19) * f12) + ((1.0f - f12) * f19) + 0.0f;
    }

    public final void a(androidx.constraintlayout.widget.l lVar) {
        int iOrdinal;
        this.f36062a = i6.e.d(lVar.f2406d.f2457d);
        androidx.constraintlayout.widget.n nVar = lVar.f2406d;
        this.f36071j = nVar.f2458e;
        this.f36072k = nVar.f2455b;
        this.f36070i = nVar.f2461h;
        this.f36063b = nVar.f2459f;
        this.l = lVar.f2407e.C;
        for (String str : lVar.f2409g.keySet()) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) lVar.f2409g.get(str);
            if (bVar != null && (iOrdinal = bVar.f2353c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f36074n.put(str, bVar);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f36065d, ((a0) obj).f36065d);
    }

    public final void d(double d3, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float fSin = this.f36066e;
        float fCos = this.f36067f;
        float f11 = this.f36068g;
        float f12 = this.f36069h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f13 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                fSin = f13;
            } else if (i13 == 2) {
                fCos = f13;
            } else if (i13 == 3) {
                f11 = f13;
            } else if (i13 == 4) {
                f12 = f13;
            }
        }
        p pVar = this.f36073m;
        if (pVar != null) {
            float[] fArr2 = new float[2];
            pVar.b(d3, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d11 = f14;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f15) - (Math.cos(d13) * d12)) - ((double) (f12 / 2.0f)));
        }
        fArr[i11] = (f11 / 2.0f) + fSin + 0.0f;
        fArr[i11 + 1] = (f12 / 2.0f) + fCos + 0.0f;
    }

    public final void e(float f11, float f12, float f13, float f14) {
        this.f36066e = f11;
        this.f36067f = f12;
        this.f36068g = f13;
        this.f36069h = f14;
    }

    public final void g(p pVar, a0 a0Var) {
        double d3 = (((this.f36068g / 2.0f) + this.f36066e) - a0Var.f36066e) - (a0Var.f36068g / 2.0f);
        double d11 = (((this.f36069h / 2.0f) + this.f36067f) - a0Var.f36067f) - (a0Var.f36069h / 2.0f);
        this.f36073m = pVar;
        this.f36066e = (float) Math.hypot(d11, d3);
        if (Float.isNaN(this.l)) {
            this.f36067f = (float) (Math.atan2(d11, d3) + 1.5707963267948966d);
        } else {
            this.f36067f = (float) Math.toRadians(this.l);
        }
    }
}
