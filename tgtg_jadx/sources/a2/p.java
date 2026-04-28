package a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f233b = new p(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f234c = new p(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235a;

    public /* synthetic */ p(int i11) {
        this.f235a = i11;
    }

    public final int a(int i11, int i12, int i13, int i14) {
        switch (this.f235a) {
            case 0:
                return (((i11 - i13) - i14) / 2) - (i12 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f235a) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
