package org.bouncycastle.util;

import i4.a;
import j4.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes3.dex */
public final class BigIntegers {
    private static final int MAX_ITERATIONS = 1000;
    public static final BigInteger ZERO = BigInteger.valueOf(0);
    public static final BigInteger ONE = BigInteger.valueOf(1);
    public static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);
    private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    private static final int MAX_SMALL = BigInteger.valueOf(743).bitLength();

    public static class Cache {
        private final Map<BigInteger, Boolean> values = new WeakHashMap();
        private final BigInteger[] preserve = new BigInteger[8];
        private int preserveCounter = 0;

        public synchronized void add(BigInteger bigInteger) {
            this.values.put(bigInteger, Boolean.TRUE);
            BigInteger[] bigIntegerArr = this.preserve;
            int i11 = this.preserveCounter;
            bigIntegerArr[i11] = bigInteger;
            this.preserveCounter = (i11 + 1) % bigIntegerArr.length;
        }

        public synchronized void clear() {
            this.values.clear();
            int i11 = 0;
            while (true) {
                BigInteger[] bigIntegerArr = this.preserve;
                if (i11 != bigIntegerArr.length) {
                    bigIntegerArr[i11] = null;
                    i11++;
                }
            }
        }

        public synchronized boolean contains(BigInteger bigInteger) {
            return this.values.containsKey(bigInteger);
        }

        public synchronized int size() {
            return this.values.size();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void asUnsignedByteArray(java.math.BigInteger r3, byte[] r4, int r5, int r6) {
        /*
            byte[] r3 = r3.toByteArray()
            int r0 = r3.length
            r1 = 0
            if (r0 != r6) goto Lc
            java.lang.System.arraycopy(r3, r1, r4, r5, r6)
            return
        Lc:
            r0 = r3[r1]
            if (r0 != 0) goto L15
            int r0 = r3.length
            r2 = 1
            if (r0 == r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            int r0 = r3.length
            int r0 = r0 - r2
            if (r0 > r6) goto L23
            int r6 = r6 - r0
            int r6 = r6 + r5
            org.bouncycastle.util.Arrays.fill(r4, r5, r6, r1)
            java.lang.System.arraycopy(r3, r2, r4, r6, r0)
            return
        L23:
            java.lang.String r3 = "standard length exceeded for value"
            i4.a.f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.util.BigIntegers.asUnsignedByteArray(java.math.BigInteger, byte[], int, int):void");
    }

    public static byte byteValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 7) {
            return bigInteger.byteValue();
        }
        d.f("BigInteger out of int range");
        return (byte) 0;
    }

    private static byte[] createRandom(int i11, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i11 < 1) {
            a.f("bitLength must be at least 1");
            return null;
        }
        int i12 = (i11 + 7) / 8;
        byte[] bArr = new byte[i12];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i12 * 8) - i11))));
        return bArr;
    }

    public static BigInteger createRandomBigInteger(int i11, SecureRandom secureRandom) {
        return new BigInteger(1, createRandom(i11, secureRandom));
    }

    public static BigInteger createRandomInRange(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo <= 0) {
                return bigInteger;
            }
            a.f("'min' may not be greater than 'max'");
            return null;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return createRandomInRange(ZERO, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        for (int i11 = 0; i11 < 1000; i11++) {
            BigInteger bigIntegerCreateRandomBigInteger = createRandomBigInteger(bigInteger2.bitLength(), secureRandom);
            if (bigIntegerCreateRandomBigInteger.compareTo(bigInteger) >= 0 && bigIntegerCreateRandomBigInteger.compareTo(bigInteger2) <= 0) {
                return bigIntegerCreateRandomBigInteger;
            }
        }
        return createRandomBigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }

    public static BigInteger createRandomPrime(int i11, int i12, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i11 < 2) {
            a.f("bitLength < 2");
            return null;
        }
        if (i11 == 2) {
            return secureRandom.nextInt() < 0 ? TWO : THREE;
        }
        do {
            byte[] bArrCreateRandom = createRandom(i11, secureRandom);
            bArrCreateRandom[0] = (byte) (((byte) (1 << (7 - ((bArrCreateRandom.length * 8) - i11)))) | bArrCreateRandom[0]);
            int length = bArrCreateRandom.length - 1;
            bArrCreateRandom[length] = (byte) (bArrCreateRandom[length] | 1);
            bigInteger = new BigInteger(1, bArrCreateRandom);
            if (i11 > MAX_SMALL) {
                while (!bigInteger.gcd(SMALL_PRIMES_PRODUCT).equals(ONE)) {
                    bigInteger = bigInteger.add(TWO);
                }
            }
        } while (!bigInteger.isProbablePrime(i12));
        return bigInteger;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr, int i11, int i12) {
        if (i11 != 0 || i12 != bArr.length) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static int getUnsignedByteLength(BigInteger bigInteger) {
        if (bigInteger.equals(ZERO)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static int intValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        d.f("BigInteger out of int range");
        return 0;
    }

    public static long longValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        d.f("BigInteger out of long range");
        return 0L;
    }

    public static BigInteger modOddInverse(BigInteger bigInteger, BigInteger bigInteger2) {
        String str;
        if (!bigInteger.testBit(0)) {
            a.f("'M' must be odd");
            return null;
        }
        if (bigInteger.signum() == 1) {
            if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            int iBitLength = bigInteger.bitLength();
            int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
            int length = iArrFromBigInteger.length;
            int[] iArrCreate = Nat.create(length);
            if (Mod.modOddInverse(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate) != 0) {
                return Nat.toBigInteger(length, iArrCreate);
            }
            str = "BigInteger not invertible.";
        } else {
            str = "BigInteger: modulus not positive";
        }
        d.f(str);
        return null;
    }

    public static BigInteger modOddInverseVar(BigInteger bigInteger, BigInteger bigInteger2) {
        String str;
        if (!bigInteger.testBit(0)) {
            a.f("'M' must be odd");
            return null;
        }
        if (bigInteger.signum() == 1) {
            BigInteger bigInteger3 = ONE;
            if (bigInteger.equals(bigInteger3)) {
                return ZERO;
            }
            if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            if (bigInteger2.equals(bigInteger3)) {
                return bigInteger3;
            }
            int iBitLength = bigInteger.bitLength();
            int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
            int length = iArrFromBigInteger.length;
            int[] iArrCreate = Nat.create(length);
            if (Mod.modOddInverseVar(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate)) {
                return Nat.toBigInteger(length, iArrCreate);
            }
            str = "BigInteger not invertible.";
        } else {
            str = "BigInteger: modulus not positive";
        }
        d.f(str);
        return null;
    }

    public static boolean modOddIsCoprime(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            a.f("'M' must be odd");
            return false;
        }
        if (bigInteger.signum() != 1) {
            d.f("BigInteger: modulus not positive");
            return false;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int iBitLength = bigInteger.bitLength();
        return Mod.modOddIsCoprime(Nat.fromBigInteger(iBitLength, bigInteger), Nat.fromBigInteger(iBitLength, bigInteger2)) != 0;
    }

    public static boolean modOddIsCoprimeVar(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            a.f("'M' must be odd");
            return false;
        }
        if (bigInteger.signum() != 1) {
            d.f("BigInteger: modulus not positive");
            return false;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(ONE)) {
            return true;
        }
        int iBitLength = bigInteger.bitLength();
        return Mod.modOddIsCoprimeVar(Nat.fromBigInteger(iBitLength, bigInteger), Nat.fromBigInteger(iBitLength, bigInteger2));
    }

    public static short shortValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 15) {
            return bigInteger.shortValue();
        }
        d.f("BigInteger out of int range");
        return (short) 0;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] asUnsignedByteArray(int i11, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i11) {
            return byteArray;
        }
        int i12 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i12 = 1;
        }
        int length = byteArray.length - i12;
        if (length > i11) {
            a.f("standard length exceeded for value");
            return null;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i12, bArr, i11 - length, length);
        return bArr;
    }

    public static byte[] asUnsignedByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }
}
