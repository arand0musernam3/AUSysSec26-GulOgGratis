package kotlin.collections;

import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class j0 extends i0 {
    public static final int A(int i11, List list) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Position index ", " must be in range [");
        sbK.append(new IntRange(0, list.size(), 1));
        sbK.append("].");
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public static final int z(int i11, List list) {
        if (i11 >= 0 && i11 <= list.size() - 1) {
            return (list.size() - 1) - i11;
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Element index ", " must be in range [");
        sbK.append(new IntRange(0, list.size() - 1, 1));
        sbK.append("].");
        throw new IndexOutOfBoundsException(sbK.toString());
    }
}
