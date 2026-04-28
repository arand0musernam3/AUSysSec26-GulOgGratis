package org.bouncycastle.crypto.macs;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f33184g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private byte f33187x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private byte f33188x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private byte f33189x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private byte f33190x4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f33185n = 0;
    private byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f33186s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f33186s = (byte) 0;
        this.P = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.P[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.P;
            byte b8 = this.f33186s;
            int i13 = i12 & 255;
            byte b11 = bArr3[i13];
            byte b12 = bArr3[(b8 + b11 + bArr[i12 % bArr.length]) & 255];
            this.f33186s = b12;
            bArr3[i13] = bArr3[b12 & 255];
            bArr3[b12 & 255] = b11;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.P;
            byte b13 = this.f33186s;
            int i15 = i14 & 255;
            byte b14 = bArr4[i15];
            byte b15 = bArr4[(b13 + b14 + bArr2[i14 % bArr2.length]) & 255];
            this.f33186s = b15;
            bArr4[i15] = bArr4[b15 & 255];
            bArr4[b15 & 255] = b14;
        }
        this.f33185n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        for (int i12 = 1; i12 < 25; i12++) {
            byte[] bArr2 = this.P;
            byte b8 = this.f33186s;
            byte b11 = this.f33185n;
            byte b12 = bArr2[(b8 + bArr2[b11 & 255]) & 255];
            this.f33186s = b12;
            byte b13 = this.f33190x4;
            byte b14 = this.f33189x3;
            byte b15 = bArr2[(b13 + b14 + i12) & 255];
            this.f33190x4 = b15;
            byte b16 = this.f33188x2;
            byte b17 = bArr2[(b14 + b16 + i12) & 255];
            this.f33189x3 = b17;
            byte b18 = this.f33187x1;
            byte b19 = bArr2[(b16 + b18 + i12) & 255];
            this.f33188x2 = b19;
            byte b21 = bArr2[(b18 + b12 + i12) & 255];
            this.f33187x1 = b21;
            byte[] bArr3 = this.T;
            byte b22 = this.f33184g;
            bArr3[b22 & 31] = (byte) (b21 ^ bArr3[b22 & 31]);
            bArr3[(b22 + 1) & 31] = (byte) (b19 ^ bArr3[(b22 + 1) & 31]);
            bArr3[(b22 + 2) & 31] = (byte) (b17 ^ bArr3[(b22 + 2) & 31]);
            bArr3[(b22 + 3) & 31] = (byte) (b15 ^ bArr3[(b22 + 3) & 31]);
            this.f33184g = (byte) ((b22 + 4) & 31);
            byte b23 = bArr2[b11 & 255];
            bArr2[b11 & 255] = bArr2[b12 & 255];
            bArr2[b12 & 255] = b23;
            this.f33185n = (byte) ((b11 + 1) & 255);
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.P;
            byte b24 = this.f33186s;
            int i14 = i13 & 255;
            byte b25 = bArr4[i14];
            byte b26 = bArr4[(b24 + b25 + this.T[i13 & 31]) & 255];
            this.f33186s = b26;
            bArr4[i14] = bArr4[b26 & 255];
            bArr4[b26 & 255] = b25;
        }
        byte[] bArr5 = new byte[20];
        for (int i15 = 0; i15 < 20; i15++) {
            byte[] bArr6 = this.P;
            int i16 = i15 & 255;
            byte b27 = bArr6[(this.f33186s + bArr6[i16]) & 255];
            this.f33186s = b27;
            bArr5[i15] = bArr6[(bArr6[bArr6[b27 & 255] & 255] + 1) & 255];
            byte b28 = bArr6[i16];
            bArr6[i16] = bArr6[b27 & 255];
            bArr6[b27 & 255] = b28;
        }
        System.arraycopy(bArr5, 0, bArr, i11, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a.f("VMPC-MAC Init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            a.f("VMPC-MAC Init parameters must include a key");
            return;
        }
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            a.f("VMPC-MAC requires 1 to 768 bytes of IV");
        } else {
            this.workingKey = keyParameter.getKey();
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f33185n = (byte) 0;
        this.f33190x4 = (byte) 0;
        this.f33189x3 = (byte) 0;
        this.f33188x2 = (byte) 0;
        this.f33187x1 = (byte) 0;
        this.f33184g = (byte) 0;
        this.T = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            this.T[i11] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b8) throws IllegalStateException {
        byte[] bArr = this.P;
        byte b11 = this.f33186s;
        byte b12 = this.f33185n;
        byte b13 = bArr[(b11 + bArr[b12 & 255]) & 255];
        this.f33186s = b13;
        byte b14 = (byte) (b8 ^ bArr[(bArr[bArr[b13 & 255] & 255] + 1) & 255]);
        byte b15 = this.f33190x4;
        byte b16 = this.f33189x3;
        byte b17 = bArr[(b15 + b16) & 255];
        this.f33190x4 = b17;
        byte b18 = this.f33188x2;
        byte b19 = bArr[(b16 + b18) & 255];
        this.f33189x3 = b19;
        byte b21 = this.f33187x1;
        byte b22 = bArr[(b18 + b21) & 255];
        this.f33188x2 = b22;
        byte b23 = bArr[(b21 + b13 + b14) & 255];
        this.f33187x1 = b23;
        byte[] bArr2 = this.T;
        byte b24 = this.f33184g;
        bArr2[b24 & 31] = (byte) (b23 ^ bArr2[b24 & 31]);
        bArr2[(b24 + 1) & 31] = (byte) (b22 ^ bArr2[(b24 + 1) & 31]);
        bArr2[(b24 + 2) & 31] = (byte) (b19 ^ bArr2[(b24 + 2) & 31]);
        bArr2[(b24 + 3) & 31] = (byte) (b17 ^ bArr2[(b24 + 3) & 31]);
        this.f33184g = (byte) ((b24 + 4) & 31);
        byte b25 = bArr[b12 & 255];
        bArr[b12 & 255] = bArr[b13 & 255];
        bArr[b13 & 255] = b25;
        this.f33185n = (byte) ((b12 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) throws IllegalStateException, DataLengthException {
        if (i11 + i12 > bArr.length) {
            i1.t("input buffer too short");
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            update(bArr[i11 + i13]);
        }
    }
}
