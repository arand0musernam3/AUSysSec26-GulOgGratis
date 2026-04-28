package b80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d80.b f6062a = new d80.b();

    public static final int a(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                int i14 = i12 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i11 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i12 - i16;
            }
        } else {
            if (i13 >= 0) {
                i4.a.f("Step is zero.");
                return 0;
            }
            if (i11 > i12) {
                int i17 = -i13;
                int i18 = i11 % i17;
                if (i18 < 0) {
                    i18 += i17;
                }
                int i19 = i12 % i17;
                if (i19 < 0) {
                    i19 += i17;
                }
                int i21 = (i18 - i19) % i17;
                if (i21 < 0) {
                    i21 += i17;
                }
                return i21 + i12;
            }
        }
        return i12;
    }
}
