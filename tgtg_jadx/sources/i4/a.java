package i4;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements j30.l, j4.j {
    public static /* synthetic */ void b() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void c(int i11, StringBuilder sb2) {
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void d(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void e(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void h() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void i(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void k(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void l(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // j4.j
    public double a(double d3) {
        double d11;
        double dPow = d3 < 0.0d ? -d3 : d3;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d11 = 0.9478672985781991d;
        } else {
            d11 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d11, d3);
    }

    @Override // j30.l
    public Object get() {
        throw new IllegalStateException();
    }
}
