package vy;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum z {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<z> valueMap;
    private final int value;

    static {
        z zVar = NOT_SET;
        z zVar2 = EVENT_OVERRIDE;
        SparseArray<z> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, zVar);
        sparseArray.put(5, zVar2);
    }

    z(int i11) {
        this.value = i11;
    }
}
