package org.bouncycastle.math.ec.rfc8032;

import c50.w;
import i4.a;
import java.security.SecureRandom;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = 39081;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_RANGE = 450;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_225 = 5;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, 100, 52, 52, 56};
    private static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final int[] B225_x = {110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 90340180, 222600478, 61097333, 7431335, 198491505, 102372861};
    private static final int[] B225_y = {221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 186410297, 126520782, 47339196, 78164062, 198835543, 169622712};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointAffine[] PRECOMP_BASE_WNAF = null;
    private static PointAffine[] PRECOMP_BASE225_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointAffine {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f33424x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f33425y;

        private PointAffine() {
            this.f33424x = X448Field.create();
            this.f33425y = X448Field.create();
        }
    }

    public static class PointProjective {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f33426x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f33427y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int[] f33428z;

        private PointProjective() {
            this.f33426x = X448Field.create();
            this.f33427y = X448Field.create();
            this.f33428z = X448Field.create();
        }
    }

    public static class PointTemp {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int[] f33429r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int[] f33430r1;

        /* JADX INFO: renamed from: r2, reason: collision with root package name */
        int[] f33431r2;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        int[] f33432r3;

        /* JADX INFO: renamed from: r4, reason: collision with root package name */
        int[] f33433r4;

        /* JADX INFO: renamed from: r5, reason: collision with root package name */
        int[] f33434r5;

        /* JADX INFO: renamed from: r6, reason: collision with root package name */
        int[] f33435r6;

        /* JADX INFO: renamed from: r7, reason: collision with root package name */
        int[] f33436r7;

        private PointTemp() {
            this.f33429r0 = X448Field.create();
            this.f33430r1 = X448Field.create();
            this.f33431r2 = X448Field.create();
            this.f33432r3 = X448Field.create();
            this.f33433r4 = X448Field.create();
            this.f33434r5 = X448Field.create();
            this.f33435r6 = X448Field.create();
            this.f33436r7 = X448Field.create();
        }
    }

    public static final class PublicPoint {
        final int[] data;

        public PublicPoint(int[] iArr) {
            this.data = iArr;
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        Scalar448.decode(bArr, iArr);
        int[] iArr2 = new int[14];
        Scalar448.decode(bArr2, iArr2);
        int[] iArr3 = new int[14];
        Scalar448.decode(bArr3, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        Codec.encode32(iArr, 0, 28, bArr4, 0);
        return Scalar448.reduce912(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(PointProjective pointProjective) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        X448Field.sqr(pointProjective.f33426x, iArrCreate2);
        X448Field.sqr(pointProjective.f33427y, iArrCreate3);
        X448Field.sqr(pointProjective.f33428z, iArrCreate4);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X448Field.sqr(iArrCreate4, iArrCreate4);
        X448Field.mul(iArrCreate, C_d, iArrCreate);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate3);
        X448Field.normalize(iArrCreate4);
        return X448Field.isZero(iArrCreate) & (~X448Field.isZero(iArrCreate3)) & (~X448Field.isZero(iArrCreate4));
    }

    private static boolean checkPointFullVar(byte[] bArr) {
        if ((bArr[56] & ByteCompanionObject.MAX_VALUE) != 0) {
            return false;
        }
        int iDecode32 = Codec.decode32(bArr, 52);
        int i11 = P[13] ^ iDecode32;
        for (int i12 = 12; i12 > 0; i12--) {
            int iDecode322 = Codec.decode32(bArr, i12 * 4);
            if (i11 == 0 && iDecode322 - Integer.MIN_VALUE > P[i12] - Integer.MIN_VALUE) {
                return false;
            }
            iDecode32 |= iDecode322;
            i11 |= P[i12] ^ iDecode322;
        }
        int iDecode323 = Codec.decode32(bArr, 0);
        if (iDecode32 != 0 || iDecode323 - Integer.MIN_VALUE > -2147483647) {
            return i11 != 0 || iDecode323 + Integer.MIN_VALUE < P[0] - (-2147483647);
        }
        return false;
    }

    private static boolean checkPointOrderVar(PointAffine pointAffine) {
        PointProjective pointProjective = new PointProjective();
        scalarMultOrderVar(pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & ByteCompanionObject.MAX_VALUE) != 0) {
            return false;
        }
        if (Codec.decode32(bArr, 52) != P[13]) {
            return true;
        }
        Codec.decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r3, r2);
    }

    private static byte[] copy(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static boolean decodePointVar(byte[] bArr, boolean z11, PointAffine pointAffine) {
        int i11 = (bArr[56] & ByteCompanionObject.MIN_VALUE) >>> 7;
        X448Field.decode(bArr, pointAffine.f33425y);
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.sqr(pointAffine.f33425y, iArrCreate);
        X448Field.mul(iArrCreate, C_d, iArrCreate2);
        X448Field.negate(iArrCreate, iArrCreate);
        X448Field.addOne(iArrCreate);
        X448Field.addOne(iArrCreate2);
        if (!X448Field.sqrtRatioVar(iArrCreate, iArrCreate2, pointAffine.f33424x)) {
            return false;
        }
        X448Field.normalize(pointAffine.f33424x);
        if (i11 == 1 && X448Field.isZeroVar(pointAffine.f33424x)) {
            return false;
        }
        int[] iArr = pointAffine.f33424x;
        if (z11 ^ (i11 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
            X448Field.normalize(pointAffine.f33424x);
        }
        return true;
    }

    private static void dom4(Xof xof, byte b8, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i11 = length + 2;
        int length2 = bArr.length + i11;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b8;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i11, bArr.length);
        xof.update(bArr3, 0, length2);
    }

    private static void encodePoint(PointAffine pointAffine, byte[] bArr, int i11) {
        X448Field.encode(pointAffine.f33425y, bArr, i11);
        bArr[i11 + 56] = (byte) ((pointAffine.f33424x[0] & 1) << 7);
    }

    public static void encodePublicPoint(PublicPoint publicPoint, byte[] bArr, int i11) {
        X448Field.encode(publicPoint.data, 16, bArr, i11);
        bArr[i11 + 56] = (byte) ((publicPoint.data[0] & 1) << 7);
    }

    private static int encodeResult(PointProjective pointProjective, byte[] bArr, int i11) {
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointProjective, pointAffine);
        int iCheckPoint = checkPoint(pointAffine);
        encodePoint(pointAffine, bArr, i11);
        return iCheckPoint;
    }

    private static PublicPoint exportPoint(PointAffine pointAffine) {
        int[] iArr = new int[32];
        X448Field.copy(pointAffine.f33424x, 0, iArr, 0);
        X448Field.copy(pointAffine.f33425y, 0, iArr, 16);
        return new PublicPoint(iArr);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length == 57) {
            secureRandom.nextBytes(bArr);
        } else {
            a.f("k");
        }
    }

    public static PublicPoint generatePublicKey(byte[] bArr, int i11) {
        Xof xofCreateXof = createXof();
        byte[] bArr2 = new byte[114];
        xofCreateXof.update(bArr, i11, 57);
        xofCreateXof.doFinal(bArr2, 0, 114);
        byte[] bArr3 = new byte[57];
        pruneScalar(bArr2, 0, bArr3);
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr3, pointProjective);
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointProjective, pointAffine);
        if (checkPoint(pointAffine) != 0) {
            return exportPoint(pointAffine);
        }
        y.e();
        return null;
    }

    private static int getWindow4(int[] iArr, int i11) {
        return (iArr[i11 >>> 3] >>> ((i11 & 7) << 2)) & 15;
    }

    private static void implSign(byte[] bArr, int i11, byte[] bArr2, byte b8, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        if (!checkContextVar(bArr2)) {
            a.f("ctx");
            return;
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        xofCreateXof.update(bArr, i11, 57);
        xofCreateXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(xofCreateXof, bArr5, bArr6, bArr7, 0, bArr2, b8, bArr3, i12, i13, bArr4, i14);
    }

    private static boolean implVerify(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b8, byte[] bArr4, int i13, int i14) {
        if (!checkContextVar(bArr3)) {
            a.f("ctx");
            return false;
        }
        byte[] bArrCopy = copy(bArr, i11, 57);
        byte[] bArrCopy2 = copy(bArr, i11 + 57, 57);
        byte[] bArrCopy3 = copy(bArr2, i12, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!Scalar448.checkVar(bArrCopy2, iArr) || !checkPointFullVar(bArrCopy3)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        if (!decodePointVar(bArrCopy3, true, pointAffine2)) {
            return false;
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b8, bArr3);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArrCopy3, 0, 57);
        xofCreateXof.update(bArr4, i13, i14);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        Scalar448.decode(Scalar448.reduce912(bArr5), iArr2);
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        if (!Scalar448.reduceBasisVar(iArr2, iArr3, iArr4)) {
            y.e();
            return false;
        }
        Scalar448.multiply225Var(iArr, iArr4, iArr);
        PointProjective pointProjective = new PointProjective();
        scalarMultStraus225Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static void invertZs(PointProjective[] pointProjectiveArr) {
        int length = pointProjectiveArr.length;
        int[] iArrCreateTable = X448Field.createTable(length);
        int[] iArrCreate = X448Field.create();
        X448Field.copy(pointProjectiveArr[0].f33428z, 0, iArrCreate, 0);
        X448Field.copy(iArrCreate, 0, iArrCreateTable, 0);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= length) {
                break;
            }
            X448Field.mul(iArrCreate, pointProjectiveArr[i12].f33428z, iArrCreate);
            X448Field.copy(iArrCreate, 0, iArrCreateTable, i12 * 16);
            i11 = i12;
        }
        X448Field.invVar(iArrCreate, iArrCreate);
        int[] iArrCreate2 = X448Field.create();
        while (i11 > 0) {
            int i13 = i11 - 1;
            X448Field.copy(iArrCreateTable, i13 * 16, iArrCreate2, 0);
            X448Field.mul(iArrCreate2, iArrCreate, iArrCreate2);
            X448Field.mul(iArrCreate, pointProjectiveArr[i11].f33428z, iArrCreate);
            X448Field.copy(iArrCreate2, 0, pointProjectiveArr[i11].f33428z, 0);
            i11 = i13;
        }
        X448Field.copy(iArrCreate, 0, pointProjectiveArr[0].f33428z, 0);
    }

    private static void normalizeToAffine(PointProjective pointProjective, PointAffine pointAffine) {
        X448Field.inv(pointProjective.f33428z, pointAffine.f33425y);
        X448Field.mul(pointAffine.f33425y, pointProjective.f33426x, pointAffine.f33424x);
        int[] iArr = pointAffine.f33425y;
        X448Field.mul(iArr, pointProjective.f33427y, iArr);
        X448Field.normalize(pointAffine.f33424x);
        X448Field.normalize(pointAffine.f33425y);
    }

    private static boolean normalizeToNeutralElementVar(PointProjective pointProjective) {
        X448Field.normalize(pointProjective.f33426x);
        X448Field.normalize(pointProjective.f33427y);
        X448Field.normalize(pointProjective.f33428z);
        return X448Field.isZeroVar(pointProjective.f33426x) && !X448Field.isZeroVar(pointProjective.f33427y) && X448Field.areEqualVar(pointProjective.f33427y, pointProjective.f33428z);
    }

    private static void pointAdd(PointProjective pointProjective, PointProjective pointProjective2, PointTemp pointTemp) {
        int[] iArr = pointTemp.f33429r0;
        int[] iArr2 = pointTemp.f33430r1;
        int[] iArr3 = pointTemp.f33431r2;
        int[] iArr4 = pointTemp.f33432r3;
        int[] iArr5 = pointTemp.f33433r4;
        int[] iArr6 = pointTemp.f33434r5;
        int[] iArr7 = pointTemp.f33435r6;
        int[] iArr8 = pointTemp.f33436r7;
        X448Field.mul(pointProjective.f33428z, pointProjective2.f33428z, iArr);
        X448Field.sqr(iArr, iArr2);
        X448Field.mul(pointProjective.f33426x, pointProjective2.f33426x, iArr3);
        X448Field.mul(pointProjective.f33427y, pointProjective2.f33427y, iArr4);
        X448Field.mul(iArr3, iArr4, iArr5);
        X448Field.mul(iArr5, C_d, iArr5);
        X448Field.add(iArr2, iArr5, iArr6);
        X448Field.sub(iArr2, iArr5, iArr7);
        X448Field.add(pointProjective.f33427y, pointProjective.f33426x, iArr8);
        X448Field.add(pointProjective2.f33427y, pointProjective2.f33426x, iArr5);
        X448Field.mul(iArr8, iArr5, iArr8);
        X448Field.add(iArr4, iArr3, iArr2);
        X448Field.sub(iArr4, iArr3, iArr5);
        X448Field.carry(iArr2);
        X448Field.sub(iArr8, iArr2, iArr8);
        X448Field.mul(iArr8, iArr, iArr8);
        X448Field.mul(iArr5, iArr, iArr5);
        X448Field.mul(iArr6, iArr8, pointProjective2.f33426x);
        X448Field.mul(iArr5, iArr7, pointProjective2.f33427y);
        X448Field.mul(iArr6, iArr7, pointProjective2.f33428z);
    }

    private static void pointAddVar(boolean z11, PointProjective pointProjective, PointProjective pointProjective2, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = pointTemp.f33429r0;
        int[] iArr6 = pointTemp.f33430r1;
        int[] iArr7 = pointTemp.f33431r2;
        int[] iArr8 = pointTemp.f33432r3;
        int[] iArr9 = pointTemp.f33433r4;
        int[] iArr10 = pointTemp.f33434r5;
        int[] iArr11 = pointTemp.f33435r6;
        int[] iArr12 = pointTemp.f33436r7;
        if (z11) {
            X448Field.sub(pointProjective.f33427y, pointProjective.f33426x, iArr12);
            iArr2 = iArr6;
            iArr = iArr9;
            iArr4 = iArr10;
            iArr3 = iArr11;
        } else {
            X448Field.add(pointProjective.f33427y, pointProjective.f33426x, iArr12);
            iArr = iArr6;
            iArr2 = iArr9;
            iArr3 = iArr10;
            iArr4 = iArr11;
        }
        X448Field.mul(pointProjective.f33428z, pointProjective2.f33428z, iArr5);
        X448Field.sqr(iArr5, iArr6);
        X448Field.mul(pointProjective.f33426x, pointProjective2.f33426x, iArr7);
        X448Field.mul(pointProjective.f33427y, pointProjective2.f33427y, iArr8);
        X448Field.mul(iArr7, iArr8, iArr9);
        X448Field.mul(iArr9, C_d, iArr9);
        X448Field.add(iArr6, iArr9, iArr3);
        X448Field.sub(iArr6, iArr9, iArr4);
        X448Field.add(pointProjective2.f33427y, pointProjective2.f33426x, iArr9);
        X448Field.mul(iArr12, iArr9, iArr12);
        X448Field.add(iArr8, iArr7, iArr);
        X448Field.sub(iArr8, iArr7, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArr12, iArr6, iArr12);
        X448Field.mul(iArr12, iArr5, iArr12);
        X448Field.mul(iArr9, iArr5, iArr9);
        X448Field.mul(iArr10, iArr12, pointProjective2.f33426x);
        X448Field.mul(iArr9, iArr11, pointProjective2.f33427y);
        X448Field.mul(iArr10, iArr11, pointProjective2.f33428z);
    }

    private static void pointCopy(PointProjective pointProjective, PointProjective pointProjective2) {
        X448Field.copy(pointProjective.f33426x, 0, pointProjective2.f33426x, 0);
        X448Field.copy(pointProjective.f33427y, 0, pointProjective2.f33427y, 0);
        X448Field.copy(pointProjective.f33428z, 0, pointProjective2.f33428z, 0);
    }

    private static void pointDouble(PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr = pointTemp.f33430r1;
        int[] iArr2 = pointTemp.f33431r2;
        int[] iArr3 = pointTemp.f33432r3;
        int[] iArr4 = pointTemp.f33433r4;
        int[] iArr5 = pointTemp.f33436r7;
        int[] iArr6 = pointTemp.f33429r0;
        X448Field.add(pointProjective.f33426x, pointProjective.f33427y, iArr);
        X448Field.sqr(iArr, iArr);
        X448Field.sqr(pointProjective.f33426x, iArr2);
        X448Field.sqr(pointProjective.f33427y, iArr3);
        X448Field.add(iArr2, iArr3, iArr4);
        X448Field.carry(iArr4);
        X448Field.sqr(pointProjective.f33428z, iArr5);
        X448Field.add(iArr5, iArr5, iArr5);
        X448Field.carry(iArr5);
        X448Field.sub(iArr4, iArr5, iArr6);
        X448Field.sub(iArr, iArr4, iArr);
        X448Field.sub(iArr2, iArr3, iArr2);
        X448Field.mul(iArr, iArr6, pointProjective.f33426x);
        X448Field.mul(iArr4, iArr2, pointProjective.f33427y);
        X448Field.mul(iArr4, iArr6, pointProjective.f33428z);
    }

    private static void pointLookup(int[] iArr, int i11, int[] iArr2, PointProjective pointProjective) {
        int window4 = getWindow4(iArr, i11);
        int i12 = (window4 >>> 3) ^ 1;
        int i13 = (window4 ^ (-i12)) & 7;
        int i14 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = ((i15 ^ i13) - 1) >> 31;
            X448Field.cmov(i16, iArr2, i14, pointProjective.f33426x, 0);
            X448Field.cmov(i16, iArr2, i14 + 16, pointProjective.f33427y, 0);
            X448Field.cmov(i16, iArr2, i14 + 32, pointProjective.f33428z, 0);
            i14 += 48;
        }
        X448Field.cnegate(i12, pointProjective.f33426x);
    }

    private static void pointLookup15(int[] iArr, PointProjective pointProjective) {
        X448Field.copy(iArr, 336, pointProjective.f33426x, 0);
        X448Field.copy(iArr, 352, pointProjective.f33427y, 0);
        X448Field.copy(iArr, 368, pointProjective.f33428z, 0);
    }

    private static int[] pointPrecompute(PointProjective pointProjective, int i11, PointTemp pointTemp) {
        PointProjective pointProjective2 = new PointProjective();
        pointCopy(pointProjective, pointProjective2);
        PointProjective pointProjective3 = new PointProjective();
        pointCopy(pointProjective, pointProjective3);
        pointDouble(pointProjective3, pointTemp);
        int[] iArrCreateTable = X448Field.createTable(i11 * 3);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            X448Field.copy(pointProjective2.f33426x, 0, iArrCreateTable, i12);
            X448Field.copy(pointProjective2.f33427y, 0, iArrCreateTable, i12 + 16);
            X448Field.copy(pointProjective2.f33428z, 0, iArrCreateTable, i12 + 32);
            i12 += 48;
            i13++;
            if (i13 == i11) {
                return iArrCreateTable;
            }
            pointAdd(pointProjective3, pointProjective2, pointTemp);
        }
    }

    private static void pointSetNeutral(PointProjective pointProjective) {
        X448Field.zero(pointProjective.f33426x);
        X448Field.one(pointProjective.f33427y);
        X448Field.one(pointProjective.f33428z);
    }

    public static void precompute() {
        int i11;
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_COMB == null) {
                    PointProjective[] pointProjectiveArr = new PointProjective[144];
                    PointTemp pointTemp = new PointTemp();
                    PointAffine pointAffine = new PointAffine();
                    X448Field.copy(B_x, 0, pointAffine.f33424x, 0);
                    X448Field.copy(B_y, 0, pointAffine.f33425y, 0);
                    pointPrecompute(pointAffine, pointProjectiveArr, 0, 32, pointTemp);
                    PointAffine pointAffine2 = new PointAffine();
                    X448Field.copy(B225_x, 0, pointAffine2.f33424x, 0);
                    X448Field.copy(B225_y, 0, pointAffine2.f33425y, 0);
                    pointPrecompute(pointAffine2, pointProjectiveArr, 32, 32, pointTemp);
                    PointProjective pointProjective = new PointProjective();
                    pointCopy(pointAffine, pointProjective);
                    int i12 = 5;
                    PointProjective[] pointProjectiveArr2 = new PointProjective[5];
                    for (int i13 = 0; i13 < 5; i13++) {
                        pointProjectiveArr2[i13] = new PointProjective();
                    }
                    int i14 = 0;
                    int i15 = 64;
                    while (i14 < i12) {
                        int i16 = i15 + 1;
                        PointProjective pointProjective2 = new PointProjective();
                        pointProjectiveArr[i15] = pointProjective2;
                        int i17 = 0;
                        while (true) {
                            i11 = 1;
                            if (i17 >= i12) {
                                break;
                            }
                            if (i17 == 0) {
                                pointCopy(pointProjective, pointProjective2);
                            } else {
                                pointAdd(pointProjective, pointProjective2, pointTemp);
                            }
                            pointDouble(pointProjective, pointTemp);
                            pointCopy(pointProjective, pointProjectiveArr2[i17]);
                            if (i14 + i17 != 8) {
                                while (i11 < 18) {
                                    pointDouble(pointProjective, pointTemp);
                                    i11++;
                                }
                            }
                            i17++;
                            i12 = 5;
                        }
                        int[] iArr = pointProjective2.f33426x;
                        X448Field.negate(iArr, iArr);
                        int i18 = 0;
                        i15 = i16;
                        while (i18 < 4) {
                            int i19 = i11 << i18;
                            int i21 = 0;
                            while (i21 < i19) {
                                PointProjective pointProjective3 = new PointProjective();
                                pointProjectiveArr[i15] = pointProjective3;
                                pointCopy(pointProjectiveArr[i15 - i19], pointProjective3);
                                pointAdd(pointProjectiveArr2[i18], pointProjectiveArr[i15], pointTemp);
                                i21++;
                                i15++;
                            }
                            i18++;
                            i11 = 1;
                        }
                        i14++;
                        i12 = 5;
                    }
                    invertZs(pointProjectiveArr);
                    PRECOMP_BASE_WNAF = new PointAffine[32];
                    for (int i22 = 0; i22 < 32; i22++) {
                        PointProjective pointProjective4 = pointProjectiveArr[i22];
                        PointAffine[] pointAffineArr = PRECOMP_BASE_WNAF;
                        PointAffine pointAffine3 = new PointAffine();
                        pointAffineArr[i22] = pointAffine3;
                        X448Field.mul(pointProjective4.f33426x, pointProjective4.f33428z, pointAffine3.f33424x);
                        X448Field.normalize(pointAffine3.f33424x);
                        X448Field.mul(pointProjective4.f33427y, pointProjective4.f33428z, pointAffine3.f33425y);
                        X448Field.normalize(pointAffine3.f33425y);
                    }
                    PRECOMP_BASE225_WNAF = new PointAffine[32];
                    for (int i23 = 0; i23 < 32; i23++) {
                        PointProjective pointProjective5 = pointProjectiveArr[32 + i23];
                        PointAffine[] pointAffineArr2 = PRECOMP_BASE225_WNAF;
                        PointAffine pointAffine4 = new PointAffine();
                        pointAffineArr2[i23] = pointAffine4;
                        X448Field.mul(pointProjective5.f33426x, pointProjective5.f33428z, pointAffine4.f33424x);
                        X448Field.normalize(pointAffine4.f33424x);
                        X448Field.mul(pointProjective5.f33427y, pointProjective5.f33428z, pointAffine4.f33425y);
                        X448Field.normalize(pointAffine4.f33425y);
                    }
                    PRECOMP_BASE_COMB = X448Field.createTable(160);
                    int i24 = 0;
                    for (int i25 = 64; i25 < 144; i25++) {
                        PointProjective pointProjective6 = pointProjectiveArr[i25];
                        int[] iArr2 = pointProjective6.f33426x;
                        X448Field.mul(iArr2, pointProjective6.f33428z, iArr2);
                        X448Field.normalize(pointProjective6.f33426x);
                        int[] iArr3 = pointProjective6.f33427y;
                        X448Field.mul(iArr3, pointProjective6.f33428z, iArr3);
                        X448Field.normalize(pointProjective6.f33427y);
                        X448Field.copy(pointProjective6.f33426x, 0, PRECOMP_BASE_COMB, i24);
                        X448Field.copy(pointProjective6.f33427y, 0, PRECOMP_BASE_COMB, i24 + 16);
                        i24 += 32;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i11, byte[] bArr2) {
        System.arraycopy(bArr, i11, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | ByteCompanionObject.MIN_VALUE);
        bArr2[56] = 0;
    }

    private static void scalarMult(byte[] bArr, PointProjective pointProjective, PointProjective pointProjective2) {
        int[] iArr = new int[15];
        Scalar448.decode(bArr, iArr);
        Scalar448.toSignedDigits(449, iArr, iArr);
        PointProjective pointProjective3 = new PointProjective();
        PointTemp pointTemp = new PointTemp();
        int[] iArrPointPrecompute = pointPrecompute(pointProjective, 8, pointTemp);
        pointLookup15(iArrPointPrecompute, pointProjective2);
        pointAdd(pointProjective, pointProjective2, pointTemp);
        int i11 = 111;
        while (true) {
            pointLookup(iArr, i11, iArrPointPrecompute, pointProjective3);
            pointAdd(pointProjective3, pointProjective2, pointTemp);
            i11--;
            if (i11 < 0) {
                return;
            }
            for (int i12 = 0; i12 < 4; i12++) {
                pointDouble(pointProjective2, pointTemp);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointProjective pointProjective) {
        precompute();
        int[] iArr = new int[15];
        Scalar448.decode(bArr, iArr);
        Scalar448.toSignedDigits(PRECOMP_RANGE, iArr, iArr);
        PointAffine pointAffine = new PointAffine();
        PointTemp pointTemp = new PointTemp();
        pointSetNeutral(pointProjective);
        int i11 = 17;
        while (true) {
            int i12 = i11;
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = 0;
                for (int i15 = 0; i15 < 5; i15++) {
                    i14 = (i14 & (~(1 << i15))) ^ ((iArr[i12 >>> 5] >>> (i12 & 31)) << i15);
                    i12 += 18;
                }
                int i16 = (i14 >>> 4) & 1;
                pointLookup(i13, ((-i16) ^ i14) & 15, pointAffine);
                X448Field.cnegate(i16, pointAffine.f33424x);
                pointAdd(pointAffine, pointProjective, pointTemp);
            }
            i11--;
            if (i11 < 0) {
                return;
            } else {
                pointDouble(pointProjective, pointTemp);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i11) {
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr, pointProjective);
        if (encodeResult(pointProjective, bArr2, i11) != 0) {
            return;
        }
        y.e();
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i11, int[] iArr, int[] iArr2) {
        if (friend == null) {
            w.l("This method is only for use by X448");
            return;
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i11, bArr2);
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr2, pointProjective);
        if (checkPoint(pointProjective) == 0) {
            y.e();
        } else {
            X448Field.copy(pointProjective.f33426x, 0, iArr, 0);
            X448Field.copy(pointProjective.f33427y, 0, iArr2, 0);
        }
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointProjective pointProjective) {
        byte[] bArr = new byte[447];
        Scalar448.getOrderWnafVar(5, bArr);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        PointTemp pointTemp = new PointTemp();
        pointPrecompute(pointAffine, pointProjectiveArr, 0, 8, pointTemp);
        pointSetNeutral(pointProjective);
        int i11 = 446;
        while (true) {
            byte b8 = bArr[i11];
            if (b8 != 0) {
                pointAddVar(b8 < 0, pointProjectiveArr[(b8 >> 1) ^ (b8 >> 31)], pointProjective, pointTemp);
            }
            i11--;
            if (i11 < 0) {
                return;
            } else {
                pointDouble(pointProjective, pointTemp);
            }
        }
    }

    private static void scalarMultStraus225Var(int[] iArr, int[] iArr2, PointAffine pointAffine, int[] iArr3, PointAffine pointAffine2, PointProjective pointProjective) {
        int i11;
        precompute();
        byte[] bArr = new byte[PRECOMP_RANGE];
        int i12 = 225;
        byte[] bArr2 = new byte[225];
        byte[] bArr3 = new byte[225];
        Wnaf.getSignedVar(iArr, 7, bArr);
        Wnaf.getSignedVar(iArr2, 5, bArr2);
        Wnaf.getSignedVar(iArr3, 5, bArr3);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        PointProjective[] pointProjectiveArr2 = new PointProjective[8];
        PointTemp pointTemp = new PointTemp();
        pointPrecompute(pointAffine, pointProjectiveArr, 0, 8, pointTemp);
        pointPrecompute(pointAffine2, pointProjectiveArr2, 0, 8, pointTemp);
        pointSetNeutral(pointProjective);
        while (true) {
            i11 = i12 - 1;
            if (i11 < 0 || (bArr[i11] | bArr[i12 + BERTags.FLAGS] | bArr2[i11] | bArr3[i11]) != 0) {
                break;
            } else {
                i12 = i11;
            }
        }
        while (i11 >= 0) {
            byte b8 = bArr[i11];
            if (b8 != 0) {
                pointAddVar(b8 < 0, PRECOMP_BASE_WNAF[(b8 >> 1) ^ (b8 >> 31)], pointProjective, pointTemp);
            }
            byte b11 = bArr[i11 + 225];
            if (b11 != 0) {
                pointAddVar(b11 < 0, PRECOMP_BASE225_WNAF[(b11 >> 1) ^ (b11 >> 31)], pointProjective, pointTemp);
            }
            byte b12 = bArr2[i11];
            if (b12 != 0) {
                pointAddVar(b12 < 0, pointProjectiveArr[(b12 >> 1) ^ (b12 >> 31)], pointProjective, pointTemp);
            }
            byte b13 = bArr3[i11];
            if (b13 != 0) {
                pointAddVar(b13 < 0, pointProjectiveArr2[(b13 >> 1) ^ (b13 >> 31)], pointProjective, pointTemp);
            }
            pointDouble(pointProjective, pointTemp);
            i11--;
        }
        pointDouble(pointProjective, pointTemp);
    }

    public static void sign(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        implSign(bArr, i11, bArr2, i12, bArr3, (byte) 0, bArr4, i13, i14, bArr5, i15);
    }

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, Xof xof, byte[] bArr4, int i13) {
        byte[] bArr5 = new byte[64];
        if (64 == xof.doFinal(bArr5, 0, 64)) {
            implSign(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i13);
        } else {
            a.f("ph");
        }
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i11) {
        byte[] bArrCopy = copy(bArr, i11, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return checkPointOrderVar(pointAffine);
        }
        return false;
    }

    public static PublicPoint validatePublicKeyFullExport(byte[] bArr, int i11) {
        byte[] bArrCopy = copy(bArr, i11, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine) && checkPointOrderVar(pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i11) {
        byte[] bArrCopy = copy(bArr, i11, 57);
        if (checkPointFullVar(bArrCopy)) {
            return decodePointVar(bArrCopy, false, new PointAffine());
        }
        return false;
    }

    public static PublicPoint validatePublicKeyPartialExport(byte[] bArr, int i11) {
        byte[] bArrCopy = copy(bArr, i11, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean verify(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, int i14) {
        return implVerify(bArr, i11, bArr2, i12, bArr3, (byte) 0, bArr4, i13, i14);
    }

    public static boolean verifyPrehash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr4, 0, 64);
        }
        a.f("ph");
        return false;
    }

    public static boolean verify(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i12, int i13) {
        return implVerify(bArr, i11, publicPoint, bArr2, (byte) 0, bArr3, i12, i13);
    }

    public static void sign(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        implSign(bArr, i11, bArr2, (byte) 0, bArr3, i12, i13, bArr4, i14);
    }

    private static void pointCopy(PointAffine pointAffine, PointProjective pointProjective) {
        X448Field.copy(pointAffine.f33424x, 0, pointProjective.f33426x, 0);
        X448Field.copy(pointAffine.f33425y, 0, pointProjective.f33427y, 0);
        X448Field.one(pointProjective.f33428z);
    }

    public static boolean verifyPrehash(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i12) {
        return implVerify(bArr, i11, publicPoint, bArr2, (byte) 1, bArr3, i12, 64);
    }

    public static boolean verifyPrehash(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, Xof xof) {
        byte[] bArr3 = new byte[64];
        if (64 == xof.doFinal(bArr3, 0, 64)) {
            return implVerify(bArr, i11, publicPoint, bArr2, (byte) 1, bArr3, 0, 64);
        }
        a.f("ph");
        return false;
    }

    public static boolean verifyPrehash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13) {
        return implVerify(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr4, i13, 64);
    }

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, byte[] bArr5, int i14) {
        implSign(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr4, i13, 64, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, Xof xof, byte[] bArr3, int i12) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            implSign(bArr, i11, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i12);
        } else {
            a.f("ph");
        }
    }

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12, byte[] bArr4, int i13) {
        implSign(bArr, i11, bArr2, (byte) 1, bArr3, i12, 64, bArr4, i13);
    }

    public static void generatePublicKey(byte[] bArr, int i11, byte[] bArr2, int i12) {
        Xof xofCreateXof = createXof();
        byte[] bArr3 = new byte[114];
        xofCreateXof.update(bArr, i11, 57);
        xofCreateXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i12);
    }

    private static void pointLookup(int i11, int i12, PointAffine pointAffine) {
        int i13 = i11 * 512;
        for (int i14 = 0; i14 < 16; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            X448Field.cmov(i15, PRECOMP_BASE_COMB, i13, pointAffine.f33424x, 0);
            X448Field.cmov(i15, PRECOMP_BASE_COMB, i13 + 16, pointAffine.f33425y, 0);
            i13 += 32;
        }
    }

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, byte b8, byte[] bArr5, int i12, int i13, byte[] bArr6, int i14) {
        dom4(xof, b8, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i12, i13);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] bArrReduce912 = Scalar448.reduce912(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArrReduce912, bArr7, 0);
        dom4(xof, b8, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i11, 57);
        xof.update(bArr5, i12, i13);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] bArrCalculateS = calculateS(bArrReduce912, Scalar448.reduce912(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i14, 57);
        System.arraycopy(bArrCalculateS, 0, bArr6, i14 + 57, 57);
    }

    private static void implSign(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b8, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        if (!checkContextVar(bArr3)) {
            a.f("ctx");
            return;
        }
        Xof xofCreateXof = createXof();
        byte[] bArr6 = new byte[114];
        xofCreateXof.update(bArr, i11, 57);
        xofCreateXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(xofCreateXof, bArr6, bArr7, bArr2, i12, bArr3, b8, bArr4, i13, i14, bArr5, i15);
    }

    private static void pointPrecompute(PointAffine pointAffine, PointProjective[] pointProjectiveArr, int i11, int i12, PointTemp pointTemp) {
        PointProjective pointProjective = new PointProjective();
        pointCopy(pointAffine, pointProjective);
        pointDouble(pointProjective, pointTemp);
        PointProjective pointProjective2 = new PointProjective();
        pointProjectiveArr[i11] = pointProjective2;
        pointCopy(pointAffine, pointProjective2);
        for (int i13 = 1; i13 < i12; i13++) {
            int i14 = i11 + i13;
            PointProjective pointProjective3 = new PointProjective();
            pointProjectiveArr[i14] = pointProjective3;
            pointCopy(pointProjectiveArr[i14 - 1], pointProjective3);
            pointAdd(pointProjective, pointProjectiveArr[i14], pointTemp);
        }
    }

    private static int checkPoint(PointAffine pointAffine) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        X448Field.sqr(pointAffine.f33424x, iArrCreate2);
        X448Field.sqr(pointAffine.f33425y, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate, C_d, iArrCreate);
        X448Field.subOne(iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate3);
        return X448Field.isZero(iArrCreate) & (~X448Field.isZero(iArrCreate3));
    }

    private static void pointAdd(PointAffine pointAffine, PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr = pointTemp.f33430r1;
        int[] iArr2 = pointTemp.f33431r2;
        int[] iArr3 = pointTemp.f33432r3;
        int[] iArr4 = pointTemp.f33433r4;
        int[] iArr5 = pointTemp.f33434r5;
        int[] iArr6 = pointTemp.f33435r6;
        int[] iArr7 = pointTemp.f33436r7;
        X448Field.sqr(pointProjective.f33428z, iArr);
        X448Field.mul(pointAffine.f33424x, pointProjective.f33426x, iArr2);
        X448Field.mul(pointAffine.f33425y, pointProjective.f33427y, iArr3);
        X448Field.mul(iArr2, iArr3, iArr4);
        X448Field.mul(iArr4, C_d, iArr4);
        X448Field.add(iArr, iArr4, iArr5);
        X448Field.sub(iArr, iArr4, iArr6);
        X448Field.add(pointAffine.f33425y, pointAffine.f33424x, iArr7);
        X448Field.add(pointProjective.f33427y, pointProjective.f33426x, iArr4);
        X448Field.mul(iArr7, iArr4, iArr7);
        X448Field.add(iArr3, iArr2, iArr);
        X448Field.sub(iArr3, iArr2, iArr4);
        X448Field.carry(iArr);
        X448Field.sub(iArr7, iArr, iArr7);
        X448Field.mul(iArr7, pointProjective.f33428z, iArr7);
        X448Field.mul(iArr4, pointProjective.f33428z, iArr4);
        X448Field.mul(iArr5, iArr7, pointProjective.f33426x);
        X448Field.mul(iArr4, iArr6, pointProjective.f33427y);
        X448Field.mul(iArr5, iArr6, pointProjective.f33428z);
    }

    private static void pointAddVar(boolean z11, PointAffine pointAffine, PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = pointTemp.f33430r1;
        int[] iArr6 = pointTemp.f33431r2;
        int[] iArr7 = pointTemp.f33432r3;
        int[] iArr8 = pointTemp.f33433r4;
        int[] iArr9 = pointTemp.f33434r5;
        int[] iArr10 = pointTemp.f33435r6;
        int[] iArr11 = pointTemp.f33436r7;
        if (z11) {
            X448Field.sub(pointAffine.f33425y, pointAffine.f33424x, iArr11);
            iArr2 = iArr5;
            iArr = iArr8;
            iArr4 = iArr9;
            iArr3 = iArr10;
        } else {
            X448Field.add(pointAffine.f33425y, pointAffine.f33424x, iArr11);
            iArr = iArr5;
            iArr2 = iArr8;
            iArr3 = iArr9;
            iArr4 = iArr10;
        }
        X448Field.sqr(pointProjective.f33428z, iArr5);
        X448Field.mul(pointAffine.f33424x, pointProjective.f33426x, iArr6);
        X448Field.mul(pointAffine.f33425y, pointProjective.f33427y, iArr7);
        X448Field.mul(iArr6, iArr7, iArr8);
        X448Field.mul(iArr8, C_d, iArr8);
        X448Field.add(iArr5, iArr8, iArr3);
        X448Field.sub(iArr5, iArr8, iArr4);
        X448Field.add(pointProjective.f33427y, pointProjective.f33426x, iArr8);
        X448Field.mul(iArr11, iArr8, iArr11);
        X448Field.add(iArr7, iArr6, iArr);
        X448Field.sub(iArr7, iArr6, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArr11, iArr5, iArr11);
        X448Field.mul(iArr11, pointProjective.f33428z, iArr11);
        X448Field.mul(iArr8, pointProjective.f33428z, iArr8);
        X448Field.mul(iArr9, iArr11, pointProjective.f33426x);
        X448Field.mul(iArr8, iArr10, pointProjective.f33427y);
        X448Field.mul(iArr9, iArr10, pointProjective.f33428z);
    }

    private static boolean implVerify(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, byte b8, byte[] bArr3, int i12, int i13) {
        if (!checkContextVar(bArr2)) {
            a.f("ctx");
            return false;
        }
        byte[] bArrCopy = copy(bArr, i11, 57);
        byte[] bArrCopy2 = copy(bArr, i11 + 57, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!Scalar448.checkVar(bArrCopy2, iArr)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        X448Field.negate(publicPoint.data, pointAffine2.f33424x);
        X448Field.copy(publicPoint.data, 16, pointAffine2.f33425y, 0);
        byte[] bArr4 = new byte[57];
        encodePublicPoint(publicPoint, bArr4, 0);
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b8, bArr2);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArr4, 0, 57);
        xofCreateXof.update(bArr3, i12, i13);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        Scalar448.decode(Scalar448.reduce912(bArr5), iArr2);
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        if (!Scalar448.reduceBasisVar(iArr2, iArr3, iArr4)) {
            y.e();
            return false;
        }
        Scalar448.multiply225Var(iArr, iArr4, iArr);
        PointProjective pointProjective = new PointProjective();
        scalarMultStraus225Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }
}
