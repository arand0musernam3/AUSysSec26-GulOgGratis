package kotlin.text;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f26597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f26598b;

    static {
        int[] iArr = new int[256];
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = "0123456789abcdef".charAt(i12 & 15) | ("0123456789abcdef".charAt(i12 >> 4) << '\b');
        }
        f26597a = iArr;
        int[] iArr2 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr2[i13] = "0123456789ABCDEF".charAt(i13 & 15) | ("0123456789ABCDEF".charAt(i13 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i14 = 0; i14 < 256; i14++) {
            iArr3[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        long[] jArr = new long[256];
        for (int i19 = 0; i19 < 256; i19++) {
            jArr[i19] = -1;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i21)] = i22;
            i21++;
            i22++;
        }
        int i23 = 0;
        while (i11 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i11)] = i23;
            i11++;
            i23++;
        }
        f26598b = jArr;
    }

    public static String a(int i11) {
        j.f26604d.getClass();
        j jVar = j.f26605e;
        jVar.getClass();
        String str = jVar.f26606a ? "0123456789ABCDEF" : "0123456789abcdef";
        if (jVar.f26608c.f26603a) {
            return new String(new char[]{str.charAt((i11 >> 28) & 15), str.charAt((i11 >> 24) & 15), str.charAt((i11 >> 20) & 15), str.charAt((i11 >> 16) & 15), str.charAt((i11 >> 12) & 15), str.charAt((i11 >> 8) & 15), str.charAt((i11 >> 4) & 15), str.charAt(i11 & 15)});
        }
        long j9 = i11;
        long j11 = 0;
        long j12 = j11 + j11 + ((long) 8) + j11;
        if (0 > j12 || j12 > 2147483647L) {
            u70.b0 b0Var = u70.c0.f40833b;
            j4.d.t(bx.o.S(10, j12), "The resulting string length is too big: ");
            return null;
        }
        int i12 = (int) j12;
        char[] cArr = new char[i12];
        int i13 = 32;
        int i14 = 0;
        int i15 = 0;
        while (i14 < 8) {
            i13 -= 4;
            cArr[i15] = str.charAt((int) ((j9 >> i13) & 15));
            i14++;
            i15++;
        }
        if (i15 == i12) {
            return new String(cArr);
        }
        kotlin.collections.f.f26505a.getClass();
        kotlin.collections.c.a(0, i15, i12);
        return new String(cArr, 0, i15);
    }
}
