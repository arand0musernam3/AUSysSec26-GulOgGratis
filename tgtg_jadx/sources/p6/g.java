package p6;

import a60.r;
import android.view.View;
import f0.f2;
import i0.w;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f2 f34504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34506c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34507d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34508e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f34509f = new ArrayList();

    public static g b(String str) {
        if (str.startsWith("CUSTOM")) {
            d dVar = new d();
            dVar.f34501g = new float[1];
            return dVar;
        }
        switch (str) {
            case "rotationX":
                return new c(3);
            case "rotationY":
                return new c(4);
            case "translationX":
                return new c(7);
            case "translationY":
                return new c(8);
            case "translationZ":
                return new c(9);
            case "progress":
                f fVar = new f();
                fVar.f34503g = false;
                return fVar;
            case "scaleX":
                return new c(5);
            case "scaleY":
                return new c(6);
            case "waveVariesBy":
                return new c(0);
            case "rotation":
                return new c(2);
            case "elevation":
                return new c(1);
            case "transitionPathRotate":
                return new e();
            case "alpha":
                return new c(0);
            case "waveOffset":
                return new c(0);
            default:
                return null;
        }
    }

    public final float a(float f11) {
        char c3;
        double dSignum;
        double dAbs;
        f2 f2Var = this.f34504a;
        xz.b bVar = (xz.b) f2Var.f16654g;
        double[] dArr = (double[]) f2Var.f16655h;
        if (bVar != null) {
            bVar.v(f11, dArr);
        } else {
            dArr[0] = ((float[]) f2Var.f16652e)[0];
            dArr[1] = ((float[]) f2Var.f16653f)[0];
            dArr[2] = ((float[]) f2Var.f16649b)[0];
        }
        double[] dArr2 = (double[]) f2Var.f16655h;
        double d3 = dArr2[0];
        double d11 = dArr2[1];
        w wVar = (w) f2Var.f16648a;
        double d12 = f11;
        wVar.getClass();
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            c3 = 2;
        } else if (d12 >= 1.0d) {
            c3 = 2;
            d13 = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch((double[]) wVar.f22747d, d12);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = (float[]) wVar.f22746c;
            float f12 = fArr[iBinarySearch];
            int i11 = iBinarySearch - 1;
            float f13 = fArr[i11];
            c3 = 2;
            double[] dArr3 = (double[]) wVar.f22747d;
            double d14 = dArr3[iBinarySearch];
            double d15 = dArr3[i11];
            double d16 = ((double) (f12 - f13)) / (d14 - d15);
            d13 = ((((d12 * d12) - (d15 * d15)) * d16) / 2.0d) + ((d12 - d15) * (((double) f13) - (d16 * d15))) + ((double[]) wVar.f22748e)[i11];
        }
        double d17 = d13 + d11;
        switch (wVar.f22745b) {
            case 1:
                dSignum = Math.signum(0.5d - (d17 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d17 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d17 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d17 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d11 + d17) * 6.283185307179586d);
                break;
            case 6:
                double dAbs2 = 1.0d - Math.abs(((d17 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = ((i6.h) wVar.f22749f).u(d17 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d17);
                break;
        }
        return (float) ((dSignum * ((double[]) f2Var.f16655h)[c3]) + d3);
    }

    public abstract void d(View view, float f11);

    public final void e() {
        int i11;
        int i12;
        int i13;
        int i14;
        double d3;
        int i15;
        ArrayList<i6.f> arrayList = this.f34509f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new r(13));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i16 = this.f34506c;
        String str = this.f34507d;
        f2 f2Var = new f2();
        w wVar = new w(2);
        wVar.f22746c = new float[0];
        wVar.f22747d = new double[0];
        f2Var.f16648a = wVar;
        wVar.f22745b = i16;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i13 = 3;
            int iIndexOf = str.indexOf(40) + 1;
            i14 = 0;
            i12 = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i17 = 0;
            d3 = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i17] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i17++;
            }
            dArr3[i17] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i17 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d11 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i11 = 2;
            int i18 = 0;
            while (i18 < dArrCopyOf.length) {
                double d12 = dArrCopyOf[i18];
                int i19 = i18 + length2;
                dArr4[i19][0] = d12;
                double d13 = d11;
                double d14 = ((double) i18) * d13;
                dArr5[i19] = d14;
                if (i18 > 0) {
                    int i21 = (length2 * 2) + i18;
                    dArr4[i21][0] = d12 + 1.0d;
                    dArr5[i21] = d14 + 1.0d;
                    int i22 = i18 - 1;
                    dArr4[i22][0] = (d12 - 1.0d) - d13;
                    dArr5[i22] = (d14 - 1.0d) - d13;
                }
                i18++;
                d11 = d13;
            }
            wVar.f22749f = new i6.h(dArr5, dArr4);
        } else {
            i11 = 2;
            i12 = 1;
            i13 = 3;
            i14 = 0;
            d3 = 1.0d;
        }
        f2Var.f16649b = new float[size];
        f2Var.f16650c = new double[size];
        f2Var.f16651d = new float[size];
        f2Var.f16652e = new float[size];
        f2Var.f16653f = new float[size];
        float[] fArr = new float[size];
        this.f34504a = f2Var;
        int i23 = i14;
        for (i6.f fVar : arrayList) {
            float f11 = fVar.f23420d;
            dArr[i23] = ((double) f11) * 0.01d;
            double[] dArr6 = dArr2[i23];
            float f12 = fVar.f23418b;
            dArr6[i14] = f12;
            float f13 = fVar.f23419c;
            dArr6[i12] = f13;
            float f14 = fVar.f23421e;
            dArr6[i11] = f14;
            f2 f2Var2 = this.f34504a;
            ((double[]) f2Var2.f16650c)[i23] = ((double) fVar.f23417a) / 100.0d;
            ((float[]) f2Var2.f16651d)[i23] = f11;
            ((float[]) f2Var2.f16652e)[i23] = f13;
            ((float[]) f2Var2.f16653f)[i23] = f14;
            ((float[]) f2Var2.f16649b)[i23] = f12;
            i23++;
        }
        f2 f2Var3 = this.f34504a;
        float[] fArr2 = (float[]) f2Var3.f16651d;
        w wVar2 = (w) f2Var3.f16648a;
        double[] dArr7 = (double[]) f2Var3.f16650c;
        int length3 = dArr7.length;
        int i24 = i11;
        int[] iArr = new int[i24];
        iArr[i12] = i13;
        iArr[i14] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) f2Var3.f16649b;
        f2Var3.f16655h = new double[fArr3.length + i24];
        double[] dArr9 = new double[fArr3.length + i24];
        double d15 = 0.0d;
        if (dArr7[i14] > 0.0d) {
            wVar2.f(0.0d, fArr2[i14]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d3) {
            wVar2.f(d3, fArr2[length4]);
        }
        for (int i25 = i14; i25 < dArr8.length; i25++) {
            double[] dArr10 = dArr8[i25];
            dArr10[i14] = ((float[]) f2Var3.f16652e)[i25];
            dArr10[i12] = ((float[]) f2Var3.f16653f)[i25];
            dArr10[2] = fArr3[i25];
            wVar2.f(dArr7[i25], fArr2[i25]);
        }
        double d16 = 0.0d;
        int i26 = i14;
        while (true) {
            float[] fArr4 = (float[]) wVar2.f22746c;
            if (i26 >= fArr4.length) {
                break;
            }
            d16 += (double) fArr4[i26];
            i26++;
        }
        double d17 = 0.0d;
        int i27 = i12;
        while (true) {
            float[] fArr5 = (float[]) wVar2.f22746c;
            if (i27 >= fArr5.length) {
                break;
            }
            int i28 = i27 - 1;
            float f15 = (fArr5[i28] + fArr5[i27]) / 2.0f;
            double d18 = d15;
            double[] dArr11 = (double[]) wVar2.f22747d;
            d17 = ((dArr11[i27] - dArr11[i28]) * ((double) f15)) + d17;
            i27++;
            d15 = d18;
        }
        double d19 = d15;
        int i29 = i14;
        while (true) {
            float[] fArr6 = (float[]) wVar2.f22746c;
            if (i29 >= fArr6.length) {
                break;
            }
            fArr6[i29] = fArr6[i29] * ((float) (d16 / d17));
            i29++;
        }
        ((double[]) wVar2.f22748e)[i14] = d19;
        int i31 = i12;
        while (true) {
            float[] fArr7 = (float[]) wVar2.f22746c;
            if (i31 >= fArr7.length) {
                break;
            }
            int i32 = i31 - 1;
            float f16 = (fArr7[i32] + fArr7[i31]) / 2.0f;
            double[] dArr12 = (double[]) wVar2.f22747d;
            double d21 = dArr12[i31] - dArr12[i32];
            double[] dArr13 = (double[]) wVar2.f22748e;
            dArr13[i31] = (d21 * ((double) f16)) + dArr13[i32];
            i31++;
        }
        if (dArr7.length > i12) {
            i15 = i14;
            f2Var3.f16654g = xz.b.t(i15, dArr7, dArr8);
        } else {
            i15 = i14;
            f2Var3.f16654g = null;
        }
        xz.b.t(i15, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f34505b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (i6.f fVar : this.f34509f) {
            StringBuilder sbR = e0.f.r(string, "[");
            sbR.append(fVar.f23417a);
            sbR.append(" , ");
            sbR.append(decimalFormat.format(fVar.f23418b));
            sbR.append("] ");
            string = sbR.toString();
        }
        return string;
    }

    public void c(androidx.constraintlayout.widget.b bVar) {
    }
}
