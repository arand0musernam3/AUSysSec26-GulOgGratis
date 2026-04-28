package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3675e;

    public final boolean a() {
        int i11 = this.f3671a;
        int i12 = 2;
        if ((i11 & 7) != 0) {
            int i13 = this.f3674d;
            int i14 = this.f3672b;
            if (((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 112) != 0) {
            int i15 = this.f3674d;
            int i16 = this.f3673c;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 4) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 1792) != 0) {
            int i17 = this.f3675e;
            int i18 = this.f3672b;
            if ((((i17 > i18 ? 1 : i17 == i18 ? 2 : 4) << 8) & i11) == 0) {
                return false;
            }
        }
        if ((i11 & 28672) != 0) {
            int i19 = this.f3675e;
            int i21 = this.f3673c;
            if (i19 > i21) {
                i12 = 1;
            } else if (i19 != i21) {
                i12 = 4;
            }
            if ((i11 & (i12 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
