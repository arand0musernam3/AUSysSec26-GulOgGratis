package org.bouncycastle.crypto.params;

import i4.a;

/* JADX INFO: loaded from: classes3.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            a.f("attempt to create weak DESede key");
            throw null;
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i11) {
        boolean z11 = false;
        for (int i12 = i11; i12 != i11 + 8; i12++) {
            if (bArr[i12] != bArr[i12 + 8]) {
                z11 = true;
            }
        }
        return z11;
    }

    public static boolean isReal3Key(byte[] bArr, int i11) {
        int i12 = i11;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            boolean z14 = true;
            if (i12 == i11 + 8) {
                break;
            }
            byte b8 = bArr[i12];
            byte b11 = bArr[i12 + 8];
            z11 |= b8 != b11;
            byte b12 = bArr[i12 + 16];
            z12 |= b8 != b12;
            if (b11 == b12) {
                z14 = false;
            }
            z13 |= z14;
            i12++;
        }
        return z11 && z12 && z13;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i11) {
        return bArr.length == 16 ? isReal2Key(bArr, i11) : isReal3Key(bArr, i11);
    }

    public static boolean isWeakKey(byte[] bArr, int i11, int i12) {
        while (i11 < i12) {
            if (DESParameters.isWeakKey(bArr, i11)) {
                return true;
            }
            i11 += 8;
        }
        return false;
    }

    public static boolean isWeakKey(byte[] bArr, int i11) {
        return isWeakKey(bArr, i11, bArr.length - i11);
    }
}
