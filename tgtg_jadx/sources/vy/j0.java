package vy;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum j0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<j0> valueMap;
    private final int value;

    static {
        j0 j0Var = DEFAULT;
        j0 j0Var2 = UNMETERED_ONLY;
        j0 j0Var3 = UNMETERED_OR_DAILY;
        j0 j0Var4 = FAST_IF_RADIO_AWAKE;
        j0 j0Var5 = NEVER;
        j0 j0Var6 = UNRECOGNIZED;
        SparseArray<j0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, j0Var);
        sparseArray.put(1, j0Var2);
        sparseArray.put(2, j0Var3);
        sparseArray.put(3, j0Var4);
        sparseArray.put(4, j0Var5);
        sparseArray.put(-1, j0Var6);
    }

    j0(int i11) {
        this.value = i11;
    }
}
