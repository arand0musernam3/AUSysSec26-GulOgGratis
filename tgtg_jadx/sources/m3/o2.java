package m3;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o2 {
    public static final int a(ArrayList arrayList, int i11, int i12) {
        int iD = d(arrayList, i11, i12);
        return iD >= 0 ? iD : -(iD + 1);
    }

    public static final int b(int i11, int[] iArr) {
        int i12 = i11 * 5;
        return Integer.bitCount(iArr[i12 + 1] >> 28) + iArr[i12 + 4];
    }

    public static final void c(int i11, int i12, int[] iArr) {
        if (i12 >= 0) {
        }
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & (-67108864));
    }

    public static final int d(ArrayList arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int i15 = ((a) arrayList.get(i14)).f29174a;
            if (i15 < 0) {
                i15 += i12;
            }
            int iCompare = Intrinsics.compare(i15, i11);
            if (iCompare < 0) {
                i13 = i14 + 1;
            } else {
                if (iCompare <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }
}
