package p6;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xz.b f34524a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34529f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f34532i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34525b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f34526c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[][] f34527d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f34530g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34531h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f34533j = Float.NaN;

    public final float a(float f11) {
        float fAbs;
        switch (this.f34525b) {
            case 1:
                return Math.signum(f11 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f11);
                break;
            case 3:
                return (((f11 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f11 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f11 * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f11 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f11 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public final float b(float f11, long j9, View view, i6.e eVar) {
        this.f34524a.w(f11, this.f34530g);
        float[] fArr = this.f34530g;
        boolean z11 = true;
        float f12 = fArr[1];
        if (f12 == 0.0f) {
            this.f34531h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f34533j)) {
            float fC = eVar.c(view, this.f34529f);
            this.f34533j = fC;
            if (Float.isNaN(fC)) {
                this.f34533j = 0.0f;
            }
        }
        float f13 = (float) (((((j9 - this.f34532i) * 1.0E-9d) * ((double) f12)) + ((double) this.f34533j)) % 1.0d);
        this.f34533j = f13;
        String str = this.f34529f;
        HashMap map = (HashMap) eVar.f23416b;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f13;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f13});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f13});
            map.put(view, map3);
        }
        this.f34532i = j9;
        float f14 = this.f34530g[0];
        float fA = (a(this.f34533j) * f14) + this.f34530g[2];
        if (f14 == 0.0f && f12 == 0.0f) {
            z11 = false;
        }
        this.f34531h = z11;
        return fA;
    }

    public void c(float f11, float f12, float f13, int i11, int i12) {
        int[] iArr = this.f34526c;
        int i13 = this.f34528e;
        iArr[i13] = i11;
        float[] fArr = this.f34527d[i13];
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        this.f34525b = Math.max(this.f34525b, i12);
        this.f34528e++;
    }

    public abstract boolean d(float f11, long j9, View view, i6.e eVar);

    public void e(int i11) {
        float[][] fArr = this.f34527d;
        int[] iArr = this.f34526c;
        int i12 = this.f34528e;
        if (i12 == 0) {
            System.err.println("Error no points added to " + this.f34529f);
            return;
        }
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i12 - 1;
        iArr2[1] = 0;
        int i13 = 2;
        while (i13 > 0) {
            int i14 = i13 - 1;
            int i15 = iArr2[i14];
            int i16 = i13 - 2;
            int i17 = iArr2[i16];
            if (i15 < i17) {
                int i18 = iArr[i17];
                int i19 = i15;
                int i21 = i19;
                while (i19 < i17) {
                    int i22 = iArr[i19];
                    if (i22 <= i18) {
                        int i23 = iArr[i21];
                        iArr[i21] = i22;
                        iArr[i19] = i23;
                        float[] fArr2 = fArr[i21];
                        fArr[i21] = fArr[i19];
                        fArr[i19] = fArr2;
                        i21++;
                    }
                    i19++;
                }
                int i24 = iArr[i21];
                iArr[i21] = iArr[i17];
                iArr[i17] = i24;
                float[] fArr3 = fArr[i21];
                fArr[i21] = fArr[i17];
                fArr[i17] = fArr3;
                iArr2[i16] = i21 - 1;
                iArr2[i14] = i15;
                int i25 = i13 + 1;
                iArr2[i13] = i17;
                i13 += 2;
                iArr2[i25] = i21 + 1;
            } else {
                i13 = i16;
            }
        }
        int i26 = 0;
        for (int i27 = 1; i27 < iArr.length; i27++) {
            if (iArr[i27] != iArr[i27 - 1]) {
                i26++;
            }
        }
        if (i26 == 0) {
            i26 = 1;
        }
        double[] dArr = new double[i26];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i26, 3);
        int i28 = 0;
        for (int i29 = 0; i29 < this.f34528e; i29++) {
            if (i29 <= 0 || iArr[i29] != iArr[i29 - 1]) {
                dArr[i28] = ((double) iArr[i29]) * 0.01d;
                double[] dArr3 = dArr2[i28];
                float[] fArr4 = fArr[i29];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i28++;
            }
        }
        this.f34524a = xz.b.t(i11, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f34529f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f34528e; i11++) {
            StringBuilder sbR = e0.f.r(string, "[");
            sbR.append(this.f34526c[i11]);
            sbR.append(" , ");
            sbR.append(decimalFormat.format(this.f34527d[i11]));
            sbR.append("] ");
            string = sbR.toString();
        }
        return string;
    }
}
