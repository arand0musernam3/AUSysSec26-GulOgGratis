package se;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String extension;

    a(String str) {
        this.extension = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.extension;
    }
}
