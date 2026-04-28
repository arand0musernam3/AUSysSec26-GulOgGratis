package k00;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f25632a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z11;
        if (obj instanceof d0) {
            byte[] bArr = ((c0) this).f25630b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((c0) ((d0) obj)).f25630b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z11 = true;
                    for (int i11 = 0; i11 < bArr.length; i11++) {
                        z11 &= bArr[i11] == bArr2[i11];
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((c0) this).f25630b;
        if (bArr.length * 8 < 32) {
            int i11 = bArr[0] & 255;
            for (int i12 = 1; i12 < bArr.length; i12++) {
                i11 |= (bArr[i12] & 255) << (i12 * 8);
            }
            return i11;
        }
        int length = bArr.length;
        if (length < 4) {
            h2.b(a.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i13 = bArr[0] & 255;
        int i14 = bArr[1] & 255;
        int i15 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i13 | (i14 << 8) | (i15 << 16);
    }

    public final String toString() {
        byte[] bArr = ((c0) this).f25630b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b8 : bArr) {
            char[] cArr = f25632a;
            sb2.append(cArr[(b8 >> 4) & 15]);
            sb2.append(cArr[b8 & 15]);
        }
        return sb2.toString();
    }
}
