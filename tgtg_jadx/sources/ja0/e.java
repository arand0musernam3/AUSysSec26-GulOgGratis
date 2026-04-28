package ja0;

import ia0.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final int a(g0 g0Var, int i11) {
        int i12;
        int[] iArr = g0Var.f23645f;
        int i13 = i11 + 1;
        int length = g0Var.f23644e.length;
        iArr.getClass();
        int i14 = length - 1;
        int i15 = 0;
        while (true) {
            if (i15 <= i14) {
                i12 = (i15 + i14) >>> 1;
                int i16 = iArr[i12];
                if (i16 >= i13) {
                    if (i16 <= i13) {
                        break;
                    }
                    i14 = i12 - 1;
                } else {
                    i15 = i12 + 1;
                }
            } else {
                i12 = (-i15) - 1;
                break;
            }
        }
        return i12 >= 0 ? i12 : ~i12;
    }
}
