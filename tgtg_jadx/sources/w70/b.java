package w70;

import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends a {
    public static int b(int i11, int... iArr) {
        for (int i12 : iArr) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    public static Comparable c(f fVar, f fVar2) {
        return fVar.compareTo(fVar2) >= 0 ? fVar : fVar2;
    }
}
