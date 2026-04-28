package z40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements p40.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    c(int i11) {
        this.number_ = i11;
    }

    @Override // p40.c
    public final int getNumber() {
        return this.number_;
    }
}
