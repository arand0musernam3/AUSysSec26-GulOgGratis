package qe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum m {
    STAR(1),
    POLYGON(2);

    private final int value;

    m(int i11) {
        this.value = i11;
    }

    public static m a(int i11) {
        for (m mVar : values()) {
            if (mVar.value == i11) {
                return mVar;
            }
        }
        return null;
    }
}
