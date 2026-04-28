package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes3.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
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
        for (int i16 = 0; i16 < 768; i16++) {
            byte[] bArr5 = this.P;
            byte b16 = this.f33139s;
            int i17 = i16 & 255;
            byte b17 = bArr5[i17];
            byte b18 = bArr5[(b16 + b17 + bArr[i16 % bArr.length]) & 255];
            this.f33139s = b18;
            bArr5[i17] = bArr5[b18 & 255];
            bArr5[b18 & 255] = b17;
        }
        this.f33138n = (byte) 0;
    }
}
