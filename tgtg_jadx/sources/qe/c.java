package qe;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f36955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f36956b;

    public c(float[] fArr, int[] iArr) {
        this.f36955a = fArr;
        this.f36956b = iArr;
    }

    public final void a(c cVar) {
        int i11 = 0;
        while (true) {
            int[] iArr = cVar.f36956b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f36955a[i11] = cVar.f36955a[i11];
            this.f36956b[i11] = iArr[i11];
            i11++;
        }
    }

    public final c b(float[] fArr) {
        int iN;
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            float f11 = fArr[i11];
            float[] fArr2 = this.f36955a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f11);
            int[] iArr2 = this.f36956b;
            if (iBinarySearch >= 0) {
                iN = iArr2[iBinarySearch];
            } else {
                int i12 = -(iBinarySearch + 1);
                if (i12 == 0) {
                    iN = iArr2[0];
                } else if (i12 == iArr2.length - 1) {
                    iN = iArr2[iArr2.length - 1];
                } else {
                    int i13 = i12 - 1;
                    float f12 = fArr2[i13];
                    iN = h0.g.n(iArr2[i13], (f11 - f12) / (fArr2[i12] - f12), iArr2[i12]);
                }
            }
            iArr[i11] = iN;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f36955a, cVar.f36955a) && Arrays.equals(this.f36956b, cVar.f36956b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36956b) + (Arrays.hashCode(this.f36955a) * 31);
    }
}
