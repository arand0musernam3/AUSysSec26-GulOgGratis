package x90;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f44208b = new int[10];

    public final int a() {
        return (this.f44207a & 16) != 0 ? this.f44208b[4] : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public final void b(int i11, int i12) {
        if (i11 >= 0) {
            int[] iArr = this.f44208b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f44207a = (1 << i11) | this.f44207a;
            iArr[i11] = i12;
        }
    }
}
