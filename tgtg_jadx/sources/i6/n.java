package i6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f23454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f23455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f23457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f23458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f23460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f23461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23462i;

    public final void a(float f11, int i11) {
        int i12 = this.f23459f;
        int[] iArr = this.f23457d;
        if (i12 >= iArr.length) {
            this.f23457d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f23458e;
            this.f23458e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f23457d;
        int i13 = this.f23459f;
        iArr2[i13] = i11;
        float[] fArr2 = this.f23458e;
        this.f23459f = i13 + 1;
        fArr2[i13] = f11;
    }

    public final void b(int i11, int i12) {
        int i13 = this.f23456c;
        int[] iArr = this.f23454a;
        if (i13 >= iArr.length) {
            this.f23454a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f23455b;
            this.f23455b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f23454a;
        int i14 = this.f23456c;
        iArr3[i14] = i11;
        int[] iArr4 = this.f23455b;
        this.f23456c = i14 + 1;
        iArr4[i14] = i12;
    }

    public final void c(int i11, String str) {
        int i12 = this.f23462i;
        int[] iArr = this.f23460g;
        if (i12 >= iArr.length) {
            this.f23460g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f23461h;
            this.f23461h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f23460g;
        int i13 = this.f23462i;
        iArr2[i13] = i11;
        String[] strArr2 = this.f23461h;
        this.f23462i = i13 + 1;
        strArr2[i13] = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypedBundle{mCountInt=");
        sb2.append(this.f23456c);
        sb2.append(", mCountFloat=");
        sb2.append(this.f23459f);
        sb2.append(", mCountString=");
        return r8.k.i(this.f23462i, ", mCountBoolean=0}", sb2);
    }
}
