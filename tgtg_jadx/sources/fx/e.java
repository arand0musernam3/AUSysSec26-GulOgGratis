package fx;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum e {
    ID(1),
    TEXT(2),
    TAG(4),
    DESCRIPTION(8),
    HINT(16);

    private final int value;

    e(int i11) {
        this.value = i11;
    }

    public final int a() {
        return this.value;
    }
}
