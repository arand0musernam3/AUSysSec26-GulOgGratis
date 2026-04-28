package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5890a;

    public static final int a(int i11, long j9) {
        int i12 = o2.f5913b;
        return ((int) (j9 >> (i11 * 15))) & 32767;
    }

    public static long c(int i11, int i12, int i13, int i14) {
        return (((long) (i12 & 32767)) << 15) | ((long) (i11 & 32767)) | (((long) (i13 & 32767)) << 30) | (((long) (i14 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f5890a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
