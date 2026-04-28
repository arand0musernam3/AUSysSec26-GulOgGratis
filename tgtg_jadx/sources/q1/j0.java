package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends u {
    public j0(int i11) {
        this.f35831a = i11 == 0 ? y.f35862a : new long[i11];
    }

    public final void a(long j9) {
        int i11 = this.f35832b + 1;
        long[] jArr = this.f35831a;
        if (jArr.length < i11) {
            this.f35831a = Arrays.copyOf(jArr, Math.max(i11, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f35831a;
        int i12 = this.f35832b;
        jArr2[i12] = j9;
        this.f35832b = i12 + 1;
    }
}
