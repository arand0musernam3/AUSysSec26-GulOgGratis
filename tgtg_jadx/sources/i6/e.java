package i6;

import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f23413c = new e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f23414d = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f23416b;

    public e(int i11) {
        this.f23415a = i11;
        switch (i11) {
            case 1:
                this.f23416b = new HashMap();
                break;
            default:
                this.f23416b = "identity";
                break;
        }
    }

    public static e d(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new d(str);
        }
        if (str.startsWith("spline")) {
            k kVar = new k(0);
            kVar.f23416b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i11 = 0;
            while (iIndexOf2 != -1) {
                dArr[i11] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i11++;
            }
            dArr[i11] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i11 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d3 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i12 = 0; i12 < dArrCopyOf.length; i12++) {
                double d11 = dArrCopyOf[i12];
                int i13 = i12 + length2;
                dArr2[i13][0] = d11;
                double d12 = ((double) i12) * d3;
                dArr3[i13] = d12;
                if (i12 > 0) {
                    int i14 = (length2 * 2) + i12;
                    dArr2[i14][0] = d11 + 1.0d;
                    dArr3[i14] = d12 + 1.0d;
                    int i15 = i12 - 1;
                    dArr2[i15][0] = (d11 - 1.0d) - d3;
                    dArr3[i15] = (d12 - 1.0d) - d3;
                }
            }
            h hVar = new h(dArr3, dArr2);
            System.out.println(" 0 " + hVar.u(0.0d));
            System.out.println(" 1 " + hVar.u(1.0d));
            kVar.f23440e = hVar;
            return kVar;
        }
        if (str.startsWith("Schlick")) {
            i iVar = new i(0);
            iVar.f23416b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            iVar.f23429e = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i16 = iIndexOf4 + 1;
            iVar.f23430f = Double.parseDouble(str.substring(i16, str.indexOf(44, i16)).trim());
            return iVar;
        }
        switch (str) {
            case "accelerate":
                return new d("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new d("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new d("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new d("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new d("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f23414d));
                return f23413c;
        }
    }

    public double b(double d3) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.f23416b;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f23415a) {
            case 0:
                return (String) this.f23416b;
            default:
                return super.toString();
        }
    }

    public double a(double d3) {
        return d3;
    }
}
