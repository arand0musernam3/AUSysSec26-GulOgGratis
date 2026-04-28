package org.bouncycastle.pqc.legacy.math.linearalgebra;

import a40.d0;
import b3.i;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.util.Arrays;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, LongCompanionObject.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i11 = this.mLength;
        long[] jArr = new long[i11];
        this.mPol = jArr;
        if (i11 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i12 = 0; i12 < this.mLength - 1; i12++) {
                this.mPol[i12] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i11 = 0;
        while (true) {
            int i12 = oNBLength - 1;
            if (i11 >= i12) {
                jArr[i12] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i11] = -1;
            i11++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            long[] jArr = this.mPol;
            int i12 = i11 >>> 3;
            jArr[i12] = jArr[i12] | ((((long) bArr[(bArr.length - 1) - i11]) & 255) << ((i11 & 7) << 3));
        }
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i11 = 0;
        while (true) {
            if (i11 >= this.mDegree) {
                return jArr;
            }
            if (testBit((r2 - i11) - 1)) {
                int i12 = i11 >>> 6;
                jArr[i12] = jArr[i12] | mBitmask[i11 & 63];
            }
            i11++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nONBElement)) {
            d0.c();
            return;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            d0.c();
            return;
        }
        for (int i11 = 0; i11 < this.mLength; i11++) {
            long[] jArr = this.mPol;
            jArr[i11] = jArr[i11] ^ gF2nONBElement.mPol[i11];
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void assignOne() {
        int i11 = 0;
        while (true) {
            int i12 = this.mLength;
            int i13 = i12 - 1;
            long[] jArr = this.mPol;
            if (i11 >= i13) {
                jArr[i12 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                jArr[i11] = -1;
                i11++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i11 = 0; i11 < this.mLength; i11++) {
            if (this.mPol[i11] != gF2nONBElement.mPol[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.mPol);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i11 = 31;
        boolean z11 = false;
        while (!z11 && i11 >= 0) {
            if ((((long) (this.mDegree - 1)) & mBitmask[i11]) != 0) {
                z11 = true;
            }
            i11--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i12 = 1;
        while (i11 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i13 = 1; i13 <= i12; i13++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i12 <<= 1;
            if ((((long) (this.mDegree - 1)) & mBitmask[i11]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i12++;
            }
            i11--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isOne() {
        int i11;
        boolean z11 = true;
        int i12 = 0;
        while (true) {
            i11 = this.mLength;
            if (i12 >= i11 - 1 || !z11) {
                break;
            }
            z11 = z11 && this.mPol[i12] == -1;
            i12++;
        }
        if (!z11) {
            return z11;
        }
        if (z11) {
            long j9 = this.mPol[i11 - 1];
            long[] jArr = mMaxmask;
            int i13 = this.mBit;
            if ((j9 & jArr[i13 - 1]) == jArr[i13 - 1]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z11 = true;
        for (int i11 = 0; i11 < this.mLength && z11; i11++) {
            z11 = z11 && this.mPol[i11] == 0;
        }
        return z11;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        char c3;
        if (!(gFElement instanceof GF2nONBElement)) {
            d0.k("The elements have different representation: not yet implemented");
            return;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            d0.c();
            return;
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i11 = this.mLength;
        long[] jArr3 = new long[i11];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i12 = i11 - 1;
        char c7 = 1;
        int i13 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j9 = jArr4[63];
        long j11 = jArr4[i13];
        int i14 = 0;
        while (i14 < this.mDegree) {
            int i15 = 0;
            boolean z11 = false;
            while (i15 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i16 = iArr2[i15];
                int[] iArr3 = iArr[i15];
                int i17 = iArr3[0];
                int i18 = iArr2[i17];
                int i19 = i17 & 63;
                long j12 = jArr[i16];
                long[] jArr5 = mBitmask;
                if ((j12 & jArr5[i15 & 63]) != 0) {
                    if ((jArr2[i18] & jArr5[i19]) != 0) {
                        z11 = !z11;
                    }
                    int i21 = iArr3[c7];
                    if (i21 != -1 && (jArr2[iArr2[i21]] & jArr5[i21 & 63]) != 0) {
                        z11 = !z11;
                    }
                }
                i15++;
                c7 = 1;
            }
            int i22 = mIBY64[i14];
            int i23 = i14 & 63;
            if (z11) {
                jArr3[i22] = jArr3[i22] ^ mBitmask[i23];
            }
            if (this.mLength > 1) {
                boolean z12 = (jArr[i12] & 1) == 1;
                int i24 = i11 - 2;
                int i25 = i24;
                while (i25 >= 0) {
                    long j13 = jArr[i25];
                    boolean z13 = (j13 & 1) != 0;
                    long j14 = j13 >>> 1;
                    jArr[i25] = j14;
                    if (z12) {
                        jArr[i25] = j14 ^ j9;
                    }
                    i25--;
                    z12 = z13;
                }
                long j15 = jArr[i12] >>> 1;
                jArr[i12] = j15;
                if (z12) {
                    jArr[i12] = j15 ^ j11;
                }
                boolean z14 = (jArr2[i12] & 1) == 1;
                while (i24 >= 0) {
                    long j16 = jArr2[i24];
                    boolean z15 = (j16 & 1) != 0;
                    long j17 = j16 >>> 1;
                    jArr2[i24] = j17;
                    if (z14) {
                        jArr2[i24] = j17 ^ j9;
                    }
                    i24--;
                    z14 = z15;
                }
                long j18 = jArr2[i12] >>> 1;
                jArr2[i12] = j18;
                if (z14) {
                    jArr2[i12] = j18 ^ j11;
                }
                c3 = 1;
            } else {
                long j19 = jArr[0];
                boolean z16 = (j19 & 1) == 1;
                long j21 = j19 >>> 1;
                jArr[0] = j21;
                if (z16) {
                    jArr[0] = j21 ^ j11;
                }
                long j22 = jArr2[0];
                boolean z17 = (j22 & 1) == 1;
                c3 = 1;
                long j23 = j22 >>> 1;
                jArr2[0] = j23;
                if (z17) {
                    jArr2[0] = j23 ^ j11;
                }
            }
            i14++;
            c7 = c3;
        }
        assign(jArr3);
    }

    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        int i11;
        if (trace() == 1) {
            d0.c();
            return null;
        }
        long j9 = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i12 = 0;
        long j11 = 0;
        while (true) {
            i11 = this.mLength;
            if (i12 >= i11 - 1) {
                break;
            }
            for (int i13 = 1; i13 < 64; i13++) {
                long[] jArr2 = mBitmask;
                long j12 = jArr2[i13];
                long j13 = this.mPol[i12];
                if (((j12 & j13) == 0 || (j11 & jArr2[i13 - 1]) == 0) && ((j13 & j12) != 0 || (jArr2[i13 - 1] & j11) != 0)) {
                    j11 ^= j12;
                }
            }
            jArr[i12] = j11;
            long j14 = j11 & j9;
            j11 = ((j14 == 0 || (1 & this.mPol[i12 + 1]) != 1) && !(j14 == 0 && (this.mPol[i12 + 1] & 1) == 0)) ? 1L : 0L;
            i12++;
        }
        int i14 = 63 & this.mDegree;
        long j15 = this.mPol[i11 - 1];
        for (int i15 = 1; i15 < i14; i15++) {
            long[] jArr3 = mBitmask;
            long j16 = jArr3[i15];
            if (((j16 & j15) == 0 || (jArr3[i15 - 1] & j11) == 0) && ((j16 & j15) != 0 || (jArr3[i15 - 1] & j11) != 0)) {
                j11 ^= j16;
            }
        }
        jArr[this.mLength - 1] = j11;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i11 = this.mLength - 1;
        int i12 = this.mBit - 1;
        long j9 = mBitmask[63];
        boolean z11 = (element[0] & 1) != 0;
        int i13 = i11;
        while (i13 >= 0) {
            long j11 = element[i13];
            boolean z12 = (j11 & 1) != 0;
            long j12 = j11 >>> 1;
            element[i13] = j12;
            if (z11) {
                if (i13 == i11) {
                    element[i13] = j12 ^ mBitmask[i12];
                } else {
                    element[i13] = j12 ^ j9;
                }
            }
            i13--;
            z11 = z12;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i11 = this.mLength - 1;
        int i12 = this.mBit;
        int i13 = i12 - 1;
        long[] jArr = mBitmask;
        long j9 = jArr[63];
        boolean z11 = (element[i11] & jArr[i13]) != 0;
        int i14 = 0;
        while (i14 < i11) {
            long j11 = element[i14];
            boolean z12 = (j11 & j9) != 0;
            long j12 = j11 << 1;
            element[i14] = j12;
            if (z11) {
                element[i14] = 1 ^ j12;
            }
            i14++;
            z11 = z12;
        }
        long j13 = element[i11];
        long[] jArr2 = mBitmask;
        boolean z13 = (jArr2[i13] & j13) != 0;
        long j14 = j13 << 1;
        element[i11] = j14;
        if (z11) {
            element[i11] = j14 ^ 1;
        }
        if (z13) {
            element[i11] = jArr2[i12] ^ element[i11];
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testBit(int i11) {
        return i11 >= 0 && i11 <= this.mDegree && (this.mPol[i11 >>> 6] & mBitmask[i11 & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i11 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (i12 & 7) << 3;
            bArr[(i11 - i12) - 1] = (byte) ((this.mPol[i12 >>> 3] & (255 << i13)) >>> i13);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString(int i11) {
        long[] element = getElement();
        int i12 = this.mBit;
        String strL = "";
        if (i11 == 2) {
            while (true) {
                i12--;
                if (i12 < 0) {
                    break;
                }
                strL = (element[element.length + (-1)] & (1 << i12)) == 0 ? strL.concat("0") : strL.concat("1");
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i13 = 63; i13 >= 0; i13--) {
                    strL = (element[length] & mBitmask[i13]) == 0 ? k.l(strL, "0") : k.l(strL, "1");
                }
            }
            return strL;
        }
        if (i11 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                StringBuilder sbO = i.o(strL);
                sbO.append(cArr[((int) (element[length2] >>> 60)) & 15]);
                StringBuilder sbO2 = i.o(sbO.toString());
                sbO2.append(cArr[((int) (element[length2] >>> 56)) & 15]);
                StringBuilder sbO3 = i.o(sbO2.toString());
                sbO3.append(cArr[((int) (element[length2] >>> 52)) & 15]);
                StringBuilder sbO4 = i.o(sbO3.toString());
                sbO4.append(cArr[((int) (element[length2] >>> 48)) & 15]);
                StringBuilder sbO5 = i.o(sbO4.toString());
                sbO5.append(cArr[((int) (element[length2] >>> 44)) & 15]);
                StringBuilder sbO6 = i.o(sbO5.toString());
                sbO6.append(cArr[((int) (element[length2] >>> 40)) & 15]);
                StringBuilder sbO7 = i.o(sbO6.toString());
                sbO7.append(cArr[((int) (element[length2] >>> 36)) & 15]);
                StringBuilder sbO8 = i.o(sbO7.toString());
                sbO8.append(cArr[((int) (element[length2] >>> 32)) & 15]);
                StringBuilder sbO9 = i.o(sbO8.toString());
                sbO9.append(cArr[((int) (element[length2] >>> 28)) & 15]);
                StringBuilder sbO10 = i.o(sbO9.toString());
                sbO10.append(cArr[((int) (element[length2] >>> 24)) & 15]);
                StringBuilder sbO11 = i.o(sbO10.toString());
                sbO11.append(cArr[((int) (element[length2] >>> 20)) & 15]);
                StringBuilder sbO12 = i.o(sbO11.toString());
                sbO12.append(cArr[((int) (element[length2] >>> 16)) & 15]);
                StringBuilder sbO13 = i.o(sbO12.toString());
                sbO13.append(cArr[((int) (element[length2] >>> 12)) & 15]);
                StringBuilder sbO14 = i.o(sbO13.toString());
                sbO14.append(cArr[((int) (element[length2] >>> 8)) & 15]);
                StringBuilder sbO15 = i.o(sbO14.toString());
                sbO15.append(cArr[((int) (element[length2] >>> 4)) & 15]);
                StringBuilder sbO16 = i.o(sbO15.toString());
                sbO16.append(cArr[((int) element[length2]) & 15]);
                strL = sbO16.toString().concat(" ");
            }
        }
        return strL;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public int trace() {
        int i11 = this.mLength - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((this.mPol[i13] & mBitmask[i14]) != 0) {
                    i12 ^= 1;
                }
            }
        }
        int i15 = this.mBit;
        for (int i16 = 0; i16 < i15; i16++) {
            if ((this.mPol[i11] & mBitmask[i16]) != 0) {
                i12 ^= 1;
            }
        }
        return i12;
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }
}
