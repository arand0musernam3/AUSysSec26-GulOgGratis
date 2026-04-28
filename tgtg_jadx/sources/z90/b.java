package z90;

import ia0.j;
import r40.d;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f47414a;

    static {
        j jVar = j.f23646d;
        f47414a = d.p("xn--");
    }

    public static int a(int i11, int i12, boolean z11) {
        int i13 = z11 ? i11 / 700 : i11 / 2;
        int i14 = (i13 / i12) + i13;
        int i15 = 0;
        while (i14 > 455) {
            i14 /= 35;
            i15 += 36;
        }
        return ((i14 * 36) / (i14 + 38)) + i15;
    }

    public static int b(int i11) {
        if (i11 < 26) {
            return i11 + 97;
        }
        if (i11 < 36) {
            return i11 + 22;
        }
        o.n(i11, "unexpected digit: ");
        return 0;
    }
}
