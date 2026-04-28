package org.bouncycastle.pqc.legacy.crypto.gemss;

import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class Pointer {
    protected long[] array;

    /* JADX INFO: renamed from: cp, reason: collision with root package name */
    protected int f33654cp;

    public Pointer(Pointer pointer, int i11) {
        this.array = pointer.array;
        this.f33654cp = pointer.f33654cp + i11;
    }

    public void changeIndex(Pointer pointer, int i11) {
        this.array = pointer.array;
        this.f33654cp = pointer.f33654cp + i11;
    }

    public void copyFrom(int i11, Pointer pointer, int i12, int i13) {
        System.arraycopy(pointer.array, pointer.f33654cp + i12, this.array, this.f33654cp + i11, i13);
    }

    public void fill(int i11, byte[] bArr, int i12, int i13) {
        long[] jArr;
        int i14;
        int i15 = this.f33654cp + i11;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            jArr = this.array;
            if (i15 >= jArr.length || (i14 = i17 + 8) > i13) {
                break;
            }
            jArr[i15] = Pack.littleEndianToLong(bArr, i12);
            i12 += 8;
            i15++;
            i17 = i14;
        }
        if (i17 >= i13 || i15 >= jArr.length) {
            return;
        }
        jArr[i15] = 0;
        while (i16 < 8 && i17 < i13) {
            long[] jArr2 = this.array;
            jArr2[i15] = jArr2[i15] | ((((long) bArr[i12]) & 255) << (i16 << 3));
            i16++;
            i12++;
            i17++;
        }
    }

    public void fillRandom(int i11, SecureRandom secureRandom, int i12) {
        byte[] bArr = new byte[i12];
        secureRandom.nextBytes(bArr);
        fill(i11, bArr, 0, i12);
    }

    public long get(int i11) {
        return this.array[this.f33654cp + i11];
    }

    public long[] getArray() {
        return this.array;
    }

    public int getD_for_not0_or_plus(int i11, int i12) {
        int i13 = this.f33654cp;
        int i14 = 0;
        long jORBITS_UINT = 0;
        while (i12 > 0) {
            int i15 = i13 + 1;
            long j9 = this.array[i13];
            int i16 = 1;
            while (i16 < i11) {
                j9 |= this.array[i15];
                i16++;
                i15++;
            }
            jORBITS_UINT |= GeMSSUtils.ORBITS_UINT(j9);
            i14 = (int) (((long) i14) + jORBITS_UINT);
            i12--;
            i13 = i15;
        }
        return i14;
    }

    public long getDotProduct(int i11, Pointer pointer, int i12, int i13) {
        int i14 = i11 + this.f33654cp;
        int i15 = i12 + pointer.f33654cp;
        int i16 = i14 + 1;
        int i17 = i15 + 1;
        long j9 = this.array[i14] & pointer.array[i15];
        int i18 = 1;
        while (i18 < i13) {
            j9 ^= this.array[i16] & pointer.array[i17];
            i18++;
            i17++;
            i16++;
        }
        return j9;
    }

    public int getIndex() {
        return this.f33654cp;
    }

    public int getLength() {
        return this.array.length - this.f33654cp;
    }

    public void indexReset() {
        this.f33654cp = 0;
    }

    public int is0_gf2n(int i11, int i12) {
        long j9 = get(i11);
        for (int i13 = 1; i13 < i12; i13++) {
            j9 |= get(i11 + i13);
        }
        return (int) GeMSSUtils.NORBITS_UINT(j9);
    }

    public int isEqual_nocst_gf2(Pointer pointer, int i11) {
        int i12 = pointer.f33654cp;
        int i13 = this.f33654cp;
        int i14 = 0;
        while (i14 < i11) {
            int i15 = i13 + 1;
            int i16 = i12 + 1;
            if (this.array[i13] != pointer.array[i12]) {
                return 0;
            }
            i14++;
            i12 = i16;
            i13 = i15;
        }
        return 1;
    }

    public void move(int i11) {
        this.f33654cp += i11;
    }

    public void moveIncremental() {
        this.f33654cp++;
    }

    public int searchDegree(int i11, int i12, int i13) {
        while (is0_gf2n(i11 * i13, i13) != 0 && i11 >= i12) {
            i11--;
        }
        return i11;
    }

    public void set(int i11, long j9) {
        this.array[this.f33654cp + i11] = j9;
    }

    public void set1_gf2n(int i11, int i12) {
        int i13 = this.f33654cp + i11;
        int i14 = i13 + 1;
        this.array[i13] = 1;
        int i15 = 1;
        while (i15 < i12) {
            this.array[i14] = 0;
            i15++;
            i14++;
        }
    }

    public void setAnd(int i11, long j9) {
        long[] jArr = this.array;
        int i12 = this.f33654cp + i11;
        jArr[i12] = jArr[i12] & j9;
    }

    public void setClear(int i11) {
        this.array[this.f33654cp + i11] = 0;
    }

    public void setRangeClear(int i11, int i12) {
        int i13 = i11 + this.f33654cp;
        Arrays.fill(this.array, i13, i12 + i13, 0L);
    }

    public void setRangeFromXor(int i11, Pointer pointer, int i12, Pointer pointer2, int i13, int i14) {
        int i15 = i11 + this.f33654cp;
        int i16 = i12 + pointer.f33654cp;
        int i17 = i13 + pointer2.f33654cp;
        int i18 = 0;
        while (i18 < i14) {
            this.array[i15] = pointer.array[i16] ^ pointer2.array[i17];
            i18++;
            i15++;
            i17++;
            i16++;
        }
    }

    public void setRangeFromXorAndMask_xor(Pointer pointer, Pointer pointer2, long j9, int i11) {
        int i12 = this.f33654cp;
        int i13 = pointer.f33654cp;
        int i14 = pointer2.f33654cp;
        int i15 = 0;
        while (i15 < i11) {
            long[] jArr = this.array;
            long[] jArr2 = pointer.array;
            long j11 = jArr2[i13];
            long[] jArr3 = pointer2.array;
            long j12 = (j11 ^ jArr3[i14]) & j9;
            jArr[i12] = j12;
            jArr2[i13] = j12 ^ jArr2[i13];
            jArr3[i14] = jArr3[i14] ^ jArr[i12];
            i15++;
            i14++;
            i12++;
            i13++;
        }
    }

    public void setRangePointerUnion(PointerUnion pointerUnion, int i11, int i12) {
        int i13 = i12 & 63;
        int i14 = 64 - i13;
        int i15 = this.f33654cp;
        int i16 = pointerUnion.f33654cp;
        int i17 = pointerUnion.remainder;
        int i18 = 0;
        if (i17 == 0) {
            while (i18 < i11) {
                long[] jArr = this.array;
                long[] jArr2 = pointerUnion.array;
                long j9 = jArr2[i16] >>> i13;
                i16++;
                jArr[i15] = j9 ^ (jArr2[i16] << i14);
                i18++;
                i15++;
            }
            return;
        }
        int i19 = i17 << 3;
        int i21 = (8 - i17) << 3;
        while (i18 < i11) {
            long[] jArr3 = this.array;
            long[] jArr4 = pointerUnion.array;
            long j11 = jArr4[i16] >>> i19;
            int i22 = i16 + 1;
            long j12 = jArr4[i22];
            jArr3[i15] = ((j11 | (j12 << i21)) >>> i13) ^ (((j12 >>> i19) | (jArr4[i16 + 2] << i21)) << i14);
            i18++;
            i15++;
            i16 = i22;
        }
    }

    public void setRangePointerUnion_Check(PointerUnion pointerUnion, int i11, int i12) {
        int i13 = i12 & 63;
        int i14 = 64 - i13;
        int i15 = this.f33654cp;
        int i16 = pointerUnion.f33654cp;
        int i17 = pointerUnion.remainder;
        int i18 = 0;
        if (i17 == 0) {
            while (i18 < i11) {
                long[] jArr = pointerUnion.array;
                if (i16 >= jArr.length - 1) {
                    break;
                }
                long[] jArr2 = this.array;
                long j9 = jArr[i16] >>> i13;
                i16++;
                jArr2[i15] = j9 ^ (jArr[i16] << i14);
                i18++;
                i15++;
            }
            if (i18 < i11) {
                this.array[i15] = pointerUnion.array[i16] >>> i13;
                return;
            }
            return;
        }
        int i19 = i17 << 3;
        int i21 = (8 - i17) << 3;
        while (i18 < i11) {
            long[] jArr3 = pointerUnion.array;
            if (i16 >= jArr3.length - 2) {
                break;
            }
            long[] jArr4 = this.array;
            long j11 = jArr3[i16] >>> i19;
            int i22 = i16 + 1;
            long j12 = jArr3[i22];
            jArr4[i15] = ((j11 | (j12 << i21)) >>> i13) ^ (((j12 >>> i19) | (jArr3[i16 + 2] << i21)) << i14);
            i18++;
            i15++;
            i16 = i22;
        }
        if (i18 < i11) {
            long[] jArr5 = this.array;
            long[] jArr6 = pointerUnion.array;
            long j13 = jArr6[i16] >>> i19;
            long j14 = jArr6[i16 + 1];
            jArr5[i15] = ((j14 >>> i19) << i14) ^ (((j14 << i21) | j13) >>> i13);
        }
    }

    public void setRangeRotate(int i11, Pointer pointer, int i12, int i13, int i14) {
        int i15 = 64 - i14;
        int i16 = i11 + this.f33654cp;
        int i17 = i12 + pointer.f33654cp;
        int i18 = 0;
        while (i18 < i13) {
            long[] jArr = this.array;
            long[] jArr2 = pointer.array;
            long j9 = jArr2[i17] >>> i15;
            i17++;
            jArr[i16] = j9 ^ (jArr2[i17] << i14);
            i18++;
            i16++;
        }
    }

    public int setRange_xi(long j9, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            this.array[this.f33654cp + i11] = -((j9 >>> i13) & 1);
            i13++;
            i11++;
        }
        return i11;
    }

    public void setXor(int i11, long j9) {
        long[] jArr = this.array;
        int i12 = this.f33654cp + i11;
        jArr[i12] = jArr[i12] ^ j9;
    }

    public void setXorMatrix(Pointer pointer, int i11, int i12) {
        int i13 = this.f33654cp;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13;
            int i16 = 0;
            while (i16 < i11) {
                long[] jArr = this.array;
                long j9 = jArr[i15];
                long[] jArr2 = pointer.array;
                int i17 = pointer.f33654cp;
                pointer.f33654cp = i17 + 1;
                jArr[i15] = j9 ^ jArr2[i17];
                i16++;
                i15++;
            }
        }
        this.f33654cp += i11;
    }

    public void setXorMatrix_NoMove(Pointer pointer, int i11, int i12) {
        int i13 = this.f33654cp;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13;
            int i16 = 0;
            while (i16 < i11) {
                long[] jArr = this.array;
                long j9 = jArr[i15];
                long[] jArr2 = pointer.array;
                int i17 = pointer.f33654cp;
                pointer.f33654cp = i17 + 1;
                jArr[i15] = j9 ^ jArr2[i17];
                i16++;
                i15++;
            }
        }
    }

    public void setXorRange(int i11, PointerUnion pointerUnion, int i12, int i13) {
        int i14 = i11 + this.f33654cp;
        int i15 = i12 + pointerUnion.f33654cp;
        int i16 = pointerUnion.remainder;
        int i17 = 0;
        if (i16 == 0) {
            while (i17 < i13) {
                long[] jArr = this.array;
                jArr[i14] = jArr[i14] ^ pointerUnion.array[i15];
                i17++;
                i14++;
                i15++;
            }
            return;
        }
        int i18 = i16 << 3;
        int i19 = (8 - i16) << 3;
        while (i17 < i13) {
            long[] jArr2 = this.array;
            long j9 = jArr2[i14];
            long[] jArr3 = pointerUnion.array;
            long j11 = jArr3[i15] >>> i18;
            i15++;
            jArr2[i14] = j9 ^ (j11 | (jArr3[i15] << i19));
            i17++;
            i14++;
        }
    }

    public void setXorRangeAndMask(Pointer pointer, int i11, long j9) {
        int i12 = this.f33654cp;
        int i13 = pointer.f33654cp;
        int i14 = 0;
        while (i14 < i11) {
            long[] jArr = this.array;
            jArr[i12] = jArr[i12] ^ (pointer.array[i13] & j9);
            i14++;
            i12++;
            i13++;
        }
    }

    public void setXorRangeAndMaskMove(Pointer pointer, int i11, long j9) {
        int i12 = this.f33654cp;
        int i13 = 0;
        while (i13 < i11) {
            long[] jArr = this.array;
            long j11 = jArr[i12];
            long[] jArr2 = pointer.array;
            int i14 = pointer.f33654cp;
            pointer.f33654cp = i14 + 1;
            jArr[i12] = j11 ^ (jArr2[i14] & j9);
            i13++;
            i12++;
        }
    }

    public void setXorRangeXor(int i11, Pointer pointer, int i12, Pointer pointer2, int i13, int i14) {
        int i15 = i11 + this.f33654cp;
        int i16 = i12 + pointer.f33654cp;
        int i17 = i13 + pointer2.f33654cp;
        int i18 = 0;
        while (i18 < i14) {
            long[] jArr = this.array;
            jArr[i15] = (pointer.array[i16] ^ pointer2.array[i17]) ^ jArr[i15];
            i18++;
            i15++;
            i17++;
            i16++;
        }
    }

    public void setXorRange_SelfMove(Pointer pointer, int i11) {
        int i12 = pointer.f33654cp;
        int i13 = 0;
        while (i13 < i11) {
            long[] jArr = this.array;
            int i14 = this.f33654cp;
            this.f33654cp = i14 + 1;
            jArr[i14] = jArr[i14] ^ pointer.array[i12];
            i13++;
            i12++;
        }
    }

    public void swap(Pointer pointer) {
        long[] jArr = pointer.array;
        int i11 = pointer.f33654cp;
        pointer.array = this.array;
        pointer.f33654cp = this.f33654cp;
        this.array = jArr;
        this.f33654cp = i11;
    }

    public byte[] toBytes(int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (this.array[this.f33654cp + (i12 >>> 3)] >>> ((i12 & 7) << 3));
        }
        return bArr;
    }

    public long get() {
        return this.array[this.f33654cp];
    }

    public void set(long j9) {
        this.array[this.f33654cp] = j9;
    }

    public void changeIndex(Pointer pointer) {
        this.array = pointer.array;
        this.f33654cp = pointer.f33654cp;
    }

    public void changeIndex(int i11) {
        this.f33654cp = i11;
    }

    public void setAnd(long j9) {
        long[] jArr = this.array;
        int i11 = this.f33654cp;
        jArr[i11] = j9 & jArr[i11];
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public void setXor(long j9) {
        long[] jArr = this.array;
        int i11 = this.f33654cp;
        jArr[i11] = j9 ^ jArr[i11];
    }

    public Pointer(int i11) {
        this.array = new long[i11];
        this.f33654cp = 0;
    }

    public Pointer(Pointer pointer) {
        this.array = pointer.array;
        this.f33654cp = pointer.f33654cp;
    }

    public void copyFrom(Pointer pointer, int i11) {
        System.arraycopy(pointer.array, pointer.f33654cp, this.array, this.f33654cp, i11);
    }

    public Pointer() {
        this.f33654cp = 0;
    }

    public void setRangeFromXor(Pointer pointer, Pointer pointer2, int i11) {
        int i12 = this.f33654cp;
        int i13 = pointer.f33654cp;
        int i14 = pointer2.f33654cp;
        int i15 = 0;
        while (i15 < i11) {
            this.array[i12] = pointer.array[i13] ^ pointer2.array[i14];
            i15++;
            i12++;
            i14++;
            i13++;
        }
    }

    public void setXorRange(int i11, Pointer pointer, int i12, int i13) {
        int i14 = i11 + this.f33654cp;
        int i15 = i12 + pointer.f33654cp;
        int i16 = 0;
        while (i16 < i13) {
            long[] jArr = this.array;
            jArr[i14] = jArr[i14] ^ pointer.array[i15];
            i16++;
            i14++;
            i15++;
        }
    }

    public void setXorRange(Pointer pointer, int i11) {
        int i12 = this.f33654cp;
        int i13 = pointer.f33654cp;
        int i14 = 0;
        while (i14 < i11) {
            long[] jArr = this.array;
            jArr[i12] = jArr[i12] ^ pointer.array[i13];
            i14++;
            i12++;
            i13++;
        }
    }

    public void setXorRange(Pointer pointer, int i11, int i12) {
        int i13 = this.f33654cp;
        int i14 = i11 + pointer.f33654cp;
        int i15 = 0;
        while (i15 < i12) {
            long[] jArr = this.array;
            jArr[i13] = jArr[i13] ^ pointer.array[i14];
            i15++;
            i13++;
            i14++;
        }
    }

    public void setRangePointerUnion(PointerUnion pointerUnion, int i11) {
        int i12 = pointerUnion.remainder;
        if (i12 == 0) {
            System.arraycopy(pointerUnion.array, pointerUnion.f33654cp, this.array, this.f33654cp, i11);
            return;
        }
        int i13 = (8 - i12) << 3;
        int i14 = i12 << 3;
        int i15 = this.f33654cp;
        int i16 = pointerUnion.f33654cp;
        int i17 = 0;
        while (i17 < i11) {
            long[] jArr = this.array;
            long[] jArr2 = pointerUnion.array;
            long j9 = jArr2[i16] >>> i14;
            i16++;
            jArr[i15] = j9 ^ (jArr2[i16] << i13);
            i17++;
            i15++;
        }
    }
}
