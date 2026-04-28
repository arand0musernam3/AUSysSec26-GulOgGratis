package org.bouncycastle.pqc.legacy.math.linearalgebra;

import e0.f;
import i4.a;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Permutation {
    private int[] perm;

    public Permutation(byte[] bArr) {
        int[] iArr;
        if (bArr.length <= 4) {
            a.f("invalid encoding");
            throw null;
        }
        int i11 = 0;
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int iCeilLog256 = IntegerFunctions.ceilLog256(iOS2IP - 1);
        if (bArr.length != (iOS2IP * iCeilLog256) + 4) {
            a.f("invalid encoding");
            throw null;
        }
        this.perm = new int[iOS2IP];
        while (true) {
            iArr = this.perm;
            if (i11 >= iOS2IP) {
                break;
            }
            iArr[i11] = LittleEndianConversions.OS2IP(bArr, (i11 * iCeilLog256) + 4, iCeilLog256);
            i11++;
        }
        if (isPermutation(iArr)) {
            return;
        }
        a.f("invalid encoding");
        throw null;
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 : iArr) {
            if (i11 < 0 || i11 >= length || zArr[i11]) {
                return false;
            }
            zArr[i11] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int iCeilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * iCeilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i11 = 0; i11 < length; i11++) {
            LittleEndianConversions.I2OSP(this.perm[i11], bArr, (i11 * iCeilLog256) + 4, iCeilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.perm);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            a.f("length mismatch");
            return null;
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String string = "[" + this.perm[0];
        for (int i11 = 1; i11 < this.perm.length; i11++) {
            StringBuilder sbR = f.r(string, ", ");
            sbR.append(this.perm[i11]);
            string = sbR.toString();
        }
        return string.concat("]");
    }

    public Permutation(int i11, SecureRandom secureRandom) {
        if (i11 <= 0) {
            a.f("invalid length");
            throw null;
        }
        this.perm = new int[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = i12;
        }
        int i13 = i11;
        for (int i14 = 0; i14 < i11; i14++) {
            int iNextInt = RandUtils.nextInt(secureRandom, i13);
            i13--;
            this.perm[i14] = iArr[iNextInt];
            iArr[iNextInt] = iArr[i13];
        }
    }

    public Permutation(int i11) {
        if (i11 <= 0) {
            a.f("invalid length");
            throw null;
        }
        this.perm = new int[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            this.perm[i12] = i12;
        }
    }

    public Permutation(int[] iArr) {
        if (isPermutation(iArr)) {
            this.perm = IntUtils.clone(iArr);
        } else {
            a.f("array is not a permutation vector");
            throw null;
        }
    }
}
