package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.i1;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes3.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i11) {
        int length = bArr.length - i11;
        bArr[i11] = ByteCompanionObject.MIN_VALUE;
        while (true) {
            i11++;
            if (i11 >= bArr.length) {
                return length;
            }
            bArr[i11] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            i11 ^= ((((r4 ^ 128) - 1) >> 31) & i12) & (length ^ i11);
            i12 &= ((bArr[length] & 255) - 1) >> 31;
        }
        if (i11 >= 0) {
            return bArr.length - i11;
        }
        i1.i("pad block corrupted");
        return 0;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
