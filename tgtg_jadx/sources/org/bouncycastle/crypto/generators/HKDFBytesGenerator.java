package org.bouncycastle.crypto.generators;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class HKDFBytesGenerator implements DerivationFunction {
    private byte[] currentT;
    private int generatedBytes;
    private HMac hMacHash;
    private int hashLen;
    private byte[] info;

    public HKDFBytesGenerator(Digest digest) {
        this.hMacHash = new HMac(digest);
        this.hashLen = digest.getDigestSize();
    }

    private void expandNext() throws DataLengthException {
        int i11 = this.generatedBytes;
        int i12 = this.hashLen;
        int i13 = (i11 / i12) + 1;
        if (i13 >= 256) {
            i1.t("HKDF cannot generate more than 255 blocks of HashLen size");
            return;
        }
        if (i11 != 0) {
            this.hMacHash.update(this.currentT, 0, i12);
        }
        HMac hMac = this.hMacHash;
        byte[] bArr = this.info;
        hMac.update(bArr, 0, bArr.length);
        this.hMacHash.update((byte) i13);
        this.hMacHash.doFinal(this.currentT, 0);
    }

    public byte[] extractPRK(byte[] bArr, byte[] bArr2) {
        HMac hMac = this.hMacHash;
        if (bArr == null) {
            hMac.init(new KeyParameter(new byte[this.hashLen]));
        } else {
            hMac.init(new KeyParameter(bArr));
        }
        this.hMacHash.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.hashLen];
        this.hMacHash.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        int i13 = this.generatedBytes;
        int i14 = i13 + i12;
        int i15 = this.hashLen;
        if (i14 > i15 * 255) {
            i1.t("HKDF may only be used for 255 * HashLen bytes of output");
            return 0;
        }
        if (i13 % i15 == 0) {
            expandNext();
        }
        int i16 = this.generatedBytes;
        int i17 = this.hashLen;
        int i18 = i16 % i17;
        int iMin = Math.min(i17 - (i16 % i17), i12);
        System.arraycopy(this.currentT, i18, bArr, i11, iMin);
        this.generatedBytes += iMin;
        int i19 = i12 - iMin;
        while (true) {
            i11 += iMin;
            if (i19 <= 0) {
                return i12;
            }
            expandNext();
            iMin = Math.min(this.hashLen, i19);
            System.arraycopy(this.currentT, 0, bArr, i11, iMin);
            this.generatedBytes += iMin;
            i19 -= iMin;
        }
    }

    public Digest getDigest() {
        return this.hMacHash.getUnderlyingDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof HKDFParameters)) {
            a.f("HKDF parameters required for HKDFBytesGenerator");
            return;
        }
        HKDFParameters hKDFParameters = (HKDFParameters) derivationParameters;
        this.hMacHash.init(hKDFParameters.skipExtract() ? new KeyParameter(hKDFParameters.getIKM()) : new KeyParameter(extractPRK(hKDFParameters.getSalt(), hKDFParameters.getIKM())));
        this.info = hKDFParameters.getInfo();
        this.generatedBytes = 0;
        this.currentT = new byte[this.hashLen];
    }
}
