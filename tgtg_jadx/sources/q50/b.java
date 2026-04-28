package q50;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f36060d;

    public b(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            i4.a.f("Both dimensions must be greater than 0");
            throw null;
        }
        this.f36057a = i11;
        this.f36058b = i12;
        int i13 = (i11 + 31) / 32;
        this.f36059c = i13;
        this.f36060d = new int[i13 * i12];
    }

    public final boolean a(int i11, int i12) {
        return ((this.f36060d[(i11 / 32) + (i12 * this.f36059c)] >>> (i11 & 31)) & 1) != 0;
    }

    public final void b(int i11, int i12) {
        int i13 = (i11 / 32) + (i12 * this.f36059c);
        int[] iArr = this.f36060d;
        iArr[i13] = (1 << (i11 & 31)) | iArr[i13];
    }

    public final void c(int i11, int i12, int i13, int i14) {
        if (i12 < 0 || i11 < 0) {
            i4.a.f("Left and top must be nonnegative");
            return;
        }
        if (i14 <= 0 || i13 <= 0) {
            i4.a.f("Height and width must be at least 1");
            return;
        }
        int i15 = i13 + i11;
        int i16 = i14 + i12;
        if (i16 > this.f36058b || i15 > this.f36057a) {
            i4.a.f("The region must fit inside the matrix");
            return;
        }
        while (i12 < i16) {
            int i17 = this.f36059c * i12;
            for (int i18 = i11; i18 < i15; i18++) {
                int i19 = (i18 / 32) + i17;
                int[] iArr = this.f36060d;
                iArr[i19] = iArr[i19] | (1 << (i18 & 31));
            }
            i12++;
        }
    }

    public final Object clone() {
        return new b(this.f36057a, this.f36058b, this.f36059c, (int[]) this.f36060d.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f36057a == bVar.f36057a && this.f36058b == bVar.f36058b && this.f36059c == bVar.f36059c && Arrays.equals(this.f36060d, bVar.f36060d);
    }

    public final int hashCode() {
        int i11 = this.f36057a;
        return Arrays.hashCode(this.f36060d) + (((((((i11 * 31) + i11) * 31) + this.f36058b) * 31) + this.f36059c) * 31);
    }

    public final String toString() {
        int i11 = this.f36057a;
        int i12 = this.f36058b;
        StringBuilder sb2 = new StringBuilder((i11 + 1) * i12);
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                sb2.append(a(i14, i13) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int i11, int i12, int i13, int[] iArr) {
        this.f36057a = i11;
        this.f36058b = i12;
        this.f36059c = i13;
        this.f36060d = iArr;
    }
}
