package v0;

import android.util.Rational;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f41584a = new Rational(4, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rational f41585b = new Rational(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rational f41586c = new Rational(16, 9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rational f41587d = new Rational(9, 16);

    public static boolean a(Rational rational, Size size) {
        Size size2 = b1.a.f5536b;
        if (rational != null) {
            if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                return true;
            }
            if (size.getHeight() * size.getWidth() >= b1.a.a(size2)) {
                int width = size.getWidth();
                int height = size.getHeight();
                Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                int i11 = width % 16;
                if (i11 == 0 && height % 16 == 0) {
                    if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                        return true;
                    }
                } else {
                    if (i11 == 0) {
                        return b(height, width, rational);
                    }
                    if (height % 16 == 0) {
                        return b(width, height, rational2);
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(int i11, int i12, Rational rational) {
        pd.g.j(i12 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i11)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i12 + (-16))) && numerator < ((double) (i12 + 16));
    }
}
