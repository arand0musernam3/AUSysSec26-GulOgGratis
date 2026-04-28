package a40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public enum y {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f812id;

    y(int i11) {
        this.f812id = i11;
    }

    public final int a() {
        return this.f812id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f812id);
    }
}
