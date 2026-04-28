package l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f26790a = a(50);

    public static final f a(int i11) {
        e eVar = new e(i11);
        return new f(eVar, eVar, eVar, eVar);
    }

    public static final f b(float f11) {
        c cVar = new c(f11);
        return new f(cVar, cVar, cVar, cVar);
    }

    public static f c(float f11, float f12, float f13, float f14, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 0;
        }
        if ((i11 & 2) != 0) {
            f12 = 0;
        }
        if ((i11 & 4) != 0) {
            f13 = 0;
        }
        if ((i11 & 8) != 0) {
            f14 = 0;
        }
        return new f(new c(f11), new c(f12), new c(f13), new c(f14));
    }
}
