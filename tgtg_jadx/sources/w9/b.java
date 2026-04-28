package w9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    DEX_FILES("DEX_FILES"),
    EXTRA_DESCRIPTORS("EXTRA_DESCRIPTORS"),
    CLASSES("CLASSES"),
    METHODS("METHODS"),
    AGGREGATION_COUNT("AGGREGATION_COUNT");

    private final long mValue;

    b(String str) {
        this.mValue = j;
    }

    public final long a() {
        return this.mValue;
    }
}
