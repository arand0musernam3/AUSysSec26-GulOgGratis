package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    BigInteger f33103e;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    BigInteger f33104u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    BigInteger f33105u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    BigInteger f33106v;

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i11 = 4 + iBigEndianToInt;
        this.f33104u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i11));
        int i12 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i11) + i12;
        this.f33105u2 = new BigInteger(Arrays.copyOfRange(bArr, i12, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i13 = iBigEndianToInt2 + 4;
        int i14 = iBigEndianToInt3 + i13;
        this.f33103e = new BigInteger(Arrays.copyOfRange(bArr, i13, i14));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i14);
        int i15 = i14 + 4;
        this.f33106v = new BigInteger(Arrays.copyOfRange(bArr, i15, iBigEndianToInt4 + i15));
    }

    public BigInteger getE() {
        return this.f33103e;
    }

    public BigInteger getU1() {
        return this.f33104u1;
    }

    public BigInteger getU2() {
        return this.f33105u2;
    }

    public BigInteger getV() {
        return this.f33106v;
    }

    public void setE(BigInteger bigInteger) {
        this.f33103e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f33104u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f33105u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f33106v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f33104u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f33105u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f33103e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f33106v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i11 = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i11, length2);
        int i12 = i11 + length2;
        Pack.intToBigEndian(length3, bArr, i12);
        int i13 = i12 + 4;
        System.arraycopy(byteArray3, 0, bArr, i13, length3);
        int i14 = i13 + length3;
        Pack.intToBigEndian(length4, bArr, i14);
        System.arraycopy(byteArray4, 0, bArr, i14 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.f33104u1.toString());
        stringBuffer.append("\nu2: " + this.f33105u2.toString());
        stringBuffer.append("\ne: " + this.f33103e.toString());
        stringBuffer.append("\nv: " + this.f33106v.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f33104u1 = bigInteger;
        this.f33105u2 = bigInteger2;
        this.f33103e = bigInteger3;
        this.f33106v = bigInteger4;
    }

    public CramerShoupCiphertext() {
    }
}
