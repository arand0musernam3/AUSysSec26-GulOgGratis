package org.bouncycastle.crypto.engines;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected byte f33138n = 0;
    protected byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte f33139s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a.f("VMPC init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            a.f("VMPC init parameters must include a key");
            return;
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            a.f("VMPC requires 1 to 768 bytes of IV");
            return;
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
        String algorithmName = getAlgorithmName();
        byte[] bArr = this.workingKey;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, bArr.length >= 32 ? 256 : bArr.length * 8, cipherParameters, Utils.getPurpose(z11)));
    }

    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f33139s = (byte) 0;
        this.P = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.P[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.P;
            byte b8 = this.f33139s;
            int i13 = i12 & 255;
            byte b11 = bArr3[i13];
            byte b12 = bArr3[(b8 + b11 + bArr[i12 % bArr.length]) & 255];
            this.f33139s = b12;
            bArr3[i13] = bArr3[b12 & 255];
            bArr3[b12 & 255] = b11;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.P;
            byte b13 = this.f33139s;
            int i15 = i14 & 255;
            byte b14 = bArr4[i15];
            byte b15 = bArr4[(b13 + b14 + bArr2[i14 % bArr2.length]) & 255];
            this.f33139s = b15;
            bArr4[i15] = bArr4[b15 & 255];
            bArr4[b15 & 255] = b14;
        }
        this.f33138n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 > bArr.length) {
            i1.t("input buffer too short");
            return 0;
        }
        if (i13 + i12 > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr3 = this.P;
            byte b8 = this.f33139s;
            byte b11 = this.f33138n;
            byte b12 = bArr3[(b8 + bArr3[b11 & 255]) & 255];
            this.f33139s = b12;
            byte b13 = bArr3[(bArr3[bArr3[b12 & 255] & 255] + 1) & 255];
            byte b14 = bArr3[b11 & 255];
            bArr3[b11 & 255] = bArr3[b12 & 255];
            bArr3[b12 & 255] = b14;
            this.f33138n = (byte) ((b11 + 1) & 255);
            bArr2[i14 + i13] = (byte) (bArr[i14 + i11] ^ b13);
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b8) {
        byte[] bArr = this.P;
        byte b11 = this.f33139s;
        byte b12 = this.f33138n;
        byte b13 = bArr[(b11 + bArr[b12 & 255]) & 255];
        this.f33139s = b13;
        byte b14 = bArr[(bArr[bArr[b13 & 255] & 255] + 1) & 255];
        byte b15 = bArr[b12 & 255];
        bArr[b12 & 255] = bArr[b13 & 255];
        bArr[b13 & 255] = b15;
        this.f33138n = (byte) ((b12 + 1) & 255);
        return (byte) (b8 ^ b14);
    }
}
