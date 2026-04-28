package r50;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f37719g = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37720h = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37721i = new a(67, 64, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f37722j = new a(19, 16, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f37723k = new a(285, 256, 0);
    public static final a l = new a(301, 256, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f37724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f37725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f37726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37729f;

    public a(int i11, int i12, int i13) {
        this.f37728e = i11;
        this.f37727d = i12;
        this.f37729f = i13;
        this.f37724a = new int[i12];
        this.f37725b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f37724a[i15] = i14;
            i14 <<= 1;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f37725b[this.f37724a[i16]] = i16;
        }
        this.f37726c = new b(this, new int[]{0});
    }

    public final int a(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f37725b;
        return this.f37724a[(iArr[i11] + iArr[i12]) % (this.f37727d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f37728e));
        sb2.append(',');
        return k.o(sb2, this.f37727d, ')');
    }
}
