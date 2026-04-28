package org.bouncycastle.crypto.params;

import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class KeyParameter implements CipherParameters {
    private byte[] key;

    public KeyParameter(byte[] bArr, int i11, int i12) {
        this(i12);
        System.arraycopy(bArr, i11, this.key, 0, i12);
    }

    public void copyTo(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.key;
        if (bArr2.length == i12) {
            System.arraycopy(bArr2, 0, bArr, i11, i12);
        } else {
            a.f("len");
        }
    }

    public byte[] getKey() {
        return this.key;
    }

    public int getKeyLength() {
        return this.key.length;
    }

    public KeyParameter reverse() {
        KeyParameter keyParameter = new KeyParameter(this.key.length);
        Arrays.reverse(this.key, keyParameter.key);
        return keyParameter;
    }

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private KeyParameter(int i11) {
        this.key = new byte[i11];
    }
}
