package x6;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f43871a = new ThreadLocal();

    public static int a(double d3, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d3))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d3))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d3))) / 100.0d;
        double dPow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double dPow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static double b(int i11) {
        ThreadLocal threadLocal = f43871a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i11);
        int iGreen = Color.green(i11);
        int iBlue = Color.blue(i11);
        if (dArr.length != 3) {
            i4.a.f("outXyz must have a length of 3.");
            return 0.0d;
        }
        double d3 = ((double) iRed) / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d;
    }

    public static int c(int i11, int i12) {
        int iAlpha = Color.alpha(i12);
        int iAlpha2 = Color.alpha(i11);
        int i13 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i13, d(Color.red(i11), iAlpha2, Color.red(i12), iAlpha, i13), d(Color.green(i11), iAlpha2, Color.green(i12), iAlpha, i13), d(Color.blue(i11), iAlpha2, Color.blue(i12), iAlpha, i13));
    }

    public static int d(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return (((255 - i12) * (i13 * i14)) + ((i11 * 255) * i12)) / (i15 * 255);
    }

    public static int e(int i11, int i12) {
        if (i12 >= 0 && i12 <= 255) {
            return (i11 & 16777215) | (i12 << 24);
        }
        i4.a.f("alpha must be between 0 and 255.");
        return 0;
    }
}
