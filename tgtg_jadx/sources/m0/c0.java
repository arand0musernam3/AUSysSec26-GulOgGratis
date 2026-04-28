package m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f28477c = new c0(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f28478d = new c0(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f28479e = new c0(3, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f28480f = new c0(4, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f28481g = new c0(5, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f28482h = new c0(6, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0 f28483i = new c0(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28485b;

    public c0(int i11, int i12) {
        this.f28484a = i11;
        this.f28485b = i12;
    }

    public final boolean a() {
        return b() && this.f28484a != 1 && this.f28485b == 10;
    }

    public final boolean b() {
        int i11 = this.f28484a;
        return (i11 == 0 || i11 == 2 || this.f28485b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f28484a == c0Var.f28484a && this.f28485b == c0Var.f28485b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28484a ^ 1000003) * 1000003) ^ this.f28485b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f28484a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return r8.k.i(this.f28485b, "}", sb2);
    }
}
