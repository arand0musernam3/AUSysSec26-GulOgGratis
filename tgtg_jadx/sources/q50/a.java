package q50;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36056b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f36055a = new int[1];

    public final void a(boolean z11) {
        c(this.f36056b + 1);
        if (z11) {
            int[] iArr = this.f36055a;
            int i11 = this.f36056b;
            int i12 = i11 / 32;
            iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
        }
        this.f36056b++;
    }

    public final void b(int i11, int i12) {
        if (i12 < 0 || i12 > 32) {
            i4.a.f("Num bits must be between 0 and 32");
            return;
        }
        c(this.f36056b + i12);
        while (i12 > 0) {
            boolean z11 = true;
            if (((i11 >> (i12 - 1)) & 1) != 1) {
                z11 = false;
            }
            a(z11);
            i12--;
        }
    }

    public final void c(int i11) {
        int[] iArr = this.f36055a;
        if (i11 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i11 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f36055a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f36055a.clone();
        int i11 = this.f36056b;
        a aVar = new a();
        aVar.f36055a = iArr;
        aVar.f36056b = i11;
        return aVar;
    }

    public final boolean d(int i11) {
        return ((1 << (i11 & 31)) & this.f36055a[i11 / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36056b == aVar.f36056b && Arrays.equals(this.f36055a, aVar.f36055a);
    }

    public final int f() {
        return (this.f36056b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36055a) + (this.f36056b * 31);
    }

    public final String toString() {
        int i11 = this.f36056b;
        StringBuilder sb2 = new StringBuilder((i11 / 8) + i11 + 1);
        for (int i12 = 0; i12 < this.f36056b; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i12) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
