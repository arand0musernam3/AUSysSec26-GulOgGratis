package org.bouncycastle.math.ec.rfc8032;

import c50.w;
import i4.a;
import java.security.SecureRandom;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat256;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ed25519 {
    private static final int COORD_INTS = 8;
    private static final int POINT_BYTES = 32;
    private static final int PRECOMP_BLOCKS = 8;
    private static final int PRECOMP_MASK = 7;
    private static final int PRECOMP_POINTS = 8;
    private static final int PRECOMP_RANGE = 256;
    private static final int PRECOMP_SPACING = 8;
    private static final int PRECOMP_TEETH = 4;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    private static final int SCALAR_BYTES = 32;
    private static final int SCALAR_INTS = 8;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private static final int WNAF_WIDTH_128 = 4;
    private static final int WNAF_WIDTH_BASE = 6;
    private static final byte[] DOM2_PREFIX = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};
    private static final int[] P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ORDER8_y1 = {1886001095, 1339575613, 1980447930, 258412557, -95215574, -959694548, 2013120334, 2047061138};
    private static final int[] ORDER8_y2 = {-1886001114, -1339575614, -1980447931, -258412558, 95215573, 959694547, -2013120335, 100422509};
    private static final int[] B_x = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] B_y = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] B128_x = {12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791};
    private static final int[] B128_y = {66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675};
    private static final int[] C_d = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] C_d2 = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] C_d4 = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointPrecomp[] PRECOMP_BASE_WNAF = null;
    private static PointPrecomp[] PRECOMP_BASE128_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static class F extends X25519Field {
        private F() {
        }
    }

    public static class PointAccum {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int[] f33410u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int[] f33411v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f33412x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f33413y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int[] f33414z;

        private PointAccum() {
            this.f33412x = X25519Field.create();
            this.f33413y = X25519Field.create();
            this.f33414z = X25519Field.create();
            this.f33410u = X25519Field.create();
            this.f33411v = X25519Field.create();
        }
    }

    public static class PointAffine {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f33415x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f33416y;

        private PointAffine() {
            this.f33415x = X25519Field.create();
            this.f33416y = X25519Field.create();
        }
    }

    public static class PointExtended {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int[] f33417t;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f33418x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f33419y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int[] f33420z;

        private PointExtended() {
            this.f33418x = X25519Field.create();
            this.f33419y = X25519Field.create();
            this.f33420z = X25519Field.create();
            this.f33417t = X25519Field.create();
        }
    }

    public static class PointPrecomp {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        private PointPrecomp() {
            this.ymx_h = X25519Field.create();
            this.ypx_h = X25519Field.create();
            this.xyd = X25519Field.create();
        }
    }

    public static class PointPrecompZ {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int[] f33421z;

        private PointPrecompZ() {
            this.ymx_h = X25519Field.create();
            this.ypx_h = X25519Field.create();
            this.xyd = X25519Field.create();
            this.f33421z = X25519Field.create();
        }
    }

    public static class PointTemp {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int[] f33422r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int[] f33423r1;

        private PointTemp() {
            this.f33422r0 = X25519Field.create();
            this.f33423r1 = X25519Field.create();
        }
    }

    public static final class PublicPoint {
        final int[] data;

        public PublicPoint(int[] iArr) {
            this.data = iArr;
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        Scalar25519.decode(bArr, iArr);
        int[] iArr2 = new int[8];
        Scalar25519.decode(bArr2, iArr2);
        int[] iArr3 = new int[8];
        Scalar25519.decode(bArr3, iArr3);
        Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        Codec.encode32(iArr, 0, 16, bArr4, 0);
        return Scalar25519.reduce512(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr, byte b8) {
        if (bArr == null && b8 == 0) {
            return true;
        }
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(PointAccum pointAccum) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        X25519Field.sqr(pointAccum.f33412x, iArrCreate2);
        X25519Field.sqr(pointAccum.f33413y, iArrCreate3);
        X25519Field.sqr(pointAccum.f33414z, iArrCreate4);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X25519Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
        X25519Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X25519Field.sqr(iArrCreate4, iArrCreate4);
        X25519Field.mul(iArrCreate, C_d, iArrCreate);
        X25519Field.add(iArrCreate, iArrCreate4, iArrCreate);
        X25519Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.normalize(iArrCreate);
        X25519Field.normalize(iArrCreate3);
        X25519Field.normalize(iArrCreate4);
        return X25519Field.isZero(iArrCreate) & (~X25519Field.isZero(iArrCreate3)) & (~X25519Field.isZero(iArrCreate4));
    }

    private static boolean checkPointFullVar(byte[] bArr) {
        int iDecode32 = Codec.decode32(bArr, 28) & Integer.MAX_VALUE;
        int i11 = P[7] ^ iDecode32;
        int i12 = ORDER8_y1[7] ^ iDecode32;
        int i13 = ORDER8_y2[7] ^ iDecode32;
        for (int i14 = 6; i14 > 0; i14--) {
            int iDecode322 = Codec.decode32(bArr, i14 * 4);
            iDecode32 |= iDecode322;
            i11 |= P[i14] ^ iDecode322;
            i12 |= ORDER8_y1[i14] ^ iDecode322;
            i13 |= iDecode322 ^ ORDER8_y2[i14];
        }
        int iDecode323 = Codec.decode32(bArr, 0);
        if (iDecode32 == 0 && iDecode323 - Integer.MIN_VALUE <= -2147483647) {
            return false;
        }
        if (i11 == 0 && Integer.MIN_VALUE + iDecode323 >= P[0] - (-2147483647)) {
            return false;
        }
        return (((ORDER8_y1[0] ^ iDecode323) | i12) != 0) & (((iDecode323 ^ ORDER8_y2[0]) | i13) != 0);
    }

    private static boolean checkPointOrderVar(PointAffine pointAffine) {
        PointAccum pointAccum = new PointAccum();
        scalarMultOrderVar(pointAffine, pointAccum);
        return normalizeToNeutralElementVar(pointAccum);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((Codec.decode32(bArr, 28) & Integer.MAX_VALUE) < P[7]) {
            return true;
        }
        int[] iArr = new int[8];
        Codec.decode32(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !Nat256.gte(iArr, r2);
    }

    private static byte[] copy(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    private static Digest createDigest() {
        SHA512Digest sHA512Digest = new SHA512Digest();
        if (sHA512Digest.getDigestSize() == 64) {
            return sHA512Digest;
        }
        y.e();
        return null;
    }

    public static Digest createPrehash() {
        return createDigest();
    }

    private static boolean decodePointVar(byte[] bArr, boolean z11, PointAffine pointAffine) {
        int i11 = (bArr[31] & ByteCompanionObject.MIN_VALUE) >>> 7;
        X25519Field.decode(bArr, pointAffine.f33416y);
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.sqr(pointAffine.f33416y, iArrCreate);
        X25519Field.mul(C_d, iArrCreate, iArrCreate2);
        X25519Field.subOne(iArrCreate);
        X25519Field.addOne(iArrCreate2);
        if (!X25519Field.sqrtRatioVar(iArrCreate, iArrCreate2, pointAffine.f33415x)) {
            return false;
        }
        X25519Field.normalize(pointAffine.f33415x);
        if (i11 == 1 && X25519Field.isZeroVar(pointAffine.f33415x)) {
            return false;
        }
        int[] iArr = pointAffine.f33415x;
        if (z11 ^ (i11 != (iArr[0] & 1))) {
            X25519Field.negate(iArr, iArr);
            X25519Field.normalize(pointAffine.f33415x);
        }
        return true;
    }

    private static void dom2(Digest digest, byte b8, byte[] bArr) {
        byte[] bArr2 = DOM2_PREFIX;
        int length = bArr2.length;
        int i11 = length + 2;
        int length2 = bArr.length + i11;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b8;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i11, bArr.length);
        digest.update(bArr3, 0, length2);
    }

    private static void encodePoint(PointAffine pointAffine, byte[] bArr, int i11) {
        X25519Field.encode(pointAffine.f33416y, bArr, i11);
        int i12 = i11 + 31;
        bArr[i12] = (byte) (((pointAffine.f33415x[0] & 1) << 7) | bArr[i12]);
    }

    public static void encodePublicPoint(PublicPoint publicPoint, byte[] bArr, int i11) {
        X25519Field.encode(publicPoint.data, 10, bArr, i11);
        int i12 = i11 + 31;
        bArr[i12] = (byte) (((publicPoint.data[0] & 1) << 7) | bArr[i12]);
    }

    private static int encodeResult(PointAccum pointAccum, byte[] bArr, int i11) {
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointAccum, pointAffine);
        int iCheckPoint = checkPoint(pointAffine);
        encodePoint(pointAffine, bArr, i11);
        return iCheckPoint;
    }

    private static PublicPoint exportPoint(PointAffine pointAffine) {
        int[] iArr = new int[20];
        X25519Field.copy(pointAffine.f33415x, 0, iArr, 0);
        X25519Field.copy(pointAffine.f33416y, 0, iArr, 10);
        return new PublicPoint(iArr);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length == 32) {
            secureRandom.nextBytes(bArr);
        } else {
            a.f("k");
        }
    }

    public static PublicPoint generatePublicKey(byte[] bArr, int i11) {
        Digest digestCreateDigest = createDigest();
        byte[] bArr2 = new byte[64];
        digestCreateDigest.update(bArr, i11, 32);
        digestCreateDigest.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[32];
        pruneScalar(bArr2, 0, bArr3);
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr3, pointAccum);
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointAccum, pointAffine);
        if (checkPoint(pointAffine) != 0) {
            return exportPoint(pointAffine);
        }
        y.e();
        return null;
    }

    private static int getWindow4(int[] iArr, int i11) {
        return (iArr[i11 >>> 3] >>> ((i11 & 7) << 2)) & 15;
    }

    private static void groupCombBits(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = Interleave.shuffle2(iArr[i11]);
        }
    }

    private static void implSign(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, byte b8, byte[] bArr5, int i12, int i13, byte[] bArr6, int i14) {
        if (bArr4 != null) {
            dom2(digest, b8, bArr4);
        }
        digest.update(bArr, 32, 32);
        digest.update(bArr5, i12, i13);
        digest.doFinal(bArr, 0);
        byte[] bArrReduce512 = Scalar25519.reduce512(bArr);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArrReduce512, bArr7, 0);
        if (bArr4 != null) {
            dom2(digest, b8, bArr4);
        }
        digest.update(bArr7, 0, 32);
        digest.update(bArr3, i11, 32);
        digest.update(bArr5, i12, i13);
        digest.doFinal(bArr, 0);
        byte[] bArrCalculateS = calculateS(bArrReduce512, Scalar25519.reduce512(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i14, 32);
        System.arraycopy(bArrCalculateS, 0, bArr6, i14 + 32, 32);
    }

    private static boolean implVerify(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, byte b8, byte[] bArr3, int i12, int i13) {
        if (!checkContextVar(bArr2, b8)) {
            a.f("ctx");
            return false;
        }
        byte[] bArrCopy = copy(bArr, i11, 32);
        byte[] bArrCopy2 = copy(bArr, i11 + 32, 32);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!Scalar25519.checkVar(bArrCopy2, iArr)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        X25519Field.negate(publicPoint.data, pointAffine2.f33415x);
        X25519Field.copy(publicPoint.data, 10, pointAffine2.f33416y, 0);
        byte[] bArr4 = new byte[32];
        encodePublicPoint(publicPoint, bArr4, 0);
        Digest digestCreateDigest = createDigest();
        byte[] bArr5 = new byte[64];
        if (bArr2 != null) {
            dom2(digestCreateDigest, b8, bArr2);
        }
        digestCreateDigest.update(bArrCopy, 0, 32);
        digestCreateDigest.update(bArr4, 0, 32);
        digestCreateDigest.update(bArr3, i12, i13);
        digestCreateDigest.doFinal(bArr5, 0);
        int[] iArr2 = new int[8];
        Scalar25519.decode(Scalar25519.reduce512(bArr5), iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        if (!Scalar25519.reduceBasisVar(iArr2, iArr3, iArr4)) {
            y.e();
            return false;
        }
        Scalar25519.multiply128Var(iArr, iArr4, iArr);
        PointAccum pointAccum = new PointAccum();
        scalarMultStraus128Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointAccum);
        return normalizeToNeutralElementVar(pointAccum);
    }

    private static void invertDoubleZs(PointExtended[] pointExtendedArr) {
        int length = pointExtendedArr.length;
        int[] iArrCreateTable = X25519Field.createTable(length);
        int[] iArrCreate = X25519Field.create();
        X25519Field.copy(pointExtendedArr[0].f33420z, 0, iArrCreate, 0);
        X25519Field.copy(iArrCreate, 0, iArrCreateTable, 0);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= length) {
                break;
            }
            X25519Field.mul(iArrCreate, pointExtendedArr[i12].f33420z, iArrCreate);
            X25519Field.copy(iArrCreate, 0, iArrCreateTable, i12 * 10);
            i11 = i12;
        }
        X25519Field.add(iArrCreate, iArrCreate, iArrCreate);
        X25519Field.invVar(iArrCreate, iArrCreate);
        int[] iArrCreate2 = X25519Field.create();
        while (i11 > 0) {
            int i13 = i11 - 1;
            X25519Field.copy(iArrCreateTable, i13 * 10, iArrCreate2, 0);
            X25519Field.mul(iArrCreate2, iArrCreate, iArrCreate2);
            X25519Field.mul(iArrCreate, pointExtendedArr[i11].f33420z, iArrCreate);
            X25519Field.copy(iArrCreate2, 0, pointExtendedArr[i11].f33420z, 0);
            i11 = i13;
        }
        X25519Field.copy(iArrCreate, 0, pointExtendedArr[0].f33420z, 0);
    }

    private static void normalizeToAffine(PointAccum pointAccum, PointAffine pointAffine) {
        X25519Field.inv(pointAccum.f33414z, pointAffine.f33416y);
        X25519Field.mul(pointAffine.f33416y, pointAccum.f33412x, pointAffine.f33415x);
        int[] iArr = pointAffine.f33416y;
        X25519Field.mul(iArr, pointAccum.f33413y, iArr);
        X25519Field.normalize(pointAffine.f33415x);
        X25519Field.normalize(pointAffine.f33416y);
    }

    private static boolean normalizeToNeutralElementVar(PointAccum pointAccum) {
        X25519Field.normalize(pointAccum.f33412x);
        X25519Field.normalize(pointAccum.f33413y);
        X25519Field.normalize(pointAccum.f33414z);
        return X25519Field.isZeroVar(pointAccum.f33412x) && !X25519Field.isZeroVar(pointAccum.f33413y) && X25519Field.areEqualVar(pointAccum.f33413y, pointAccum.f33414z);
    }

    private static void pointAdd(PointExtended pointExtended, PointExtended pointExtended2, PointExtended pointExtended3, PointTemp pointTemp) {
        int[] iArr = pointExtended3.f33418x;
        int[] iArr2 = pointExtended3.f33419y;
        int[] iArr3 = pointTemp.f33422r0;
        int[] iArr4 = pointTemp.f33423r1;
        X25519Field.apm(pointExtended.f33419y, pointExtended.f33418x, iArr2, iArr);
        X25519Field.apm(pointExtended2.f33419y, pointExtended2.f33418x, iArr4, iArr3);
        X25519Field.mul(iArr, iArr3, iArr);
        X25519Field.mul(iArr2, iArr4, iArr2);
        X25519Field.mul(pointExtended.f33417t, pointExtended2.f33417t, iArr3);
        X25519Field.mul(iArr3, C_d2, iArr3);
        int[] iArr5 = pointExtended.f33420z;
        X25519Field.add(iArr5, iArr5, iArr4);
        X25519Field.mul(iArr4, pointExtended2.f33420z, iArr4);
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, iArr2, pointExtended3.f33417t);
        X25519Field.mul(iArr3, iArr4, pointExtended3.f33420z);
        X25519Field.mul(iArr, iArr3, pointExtended3.f33418x);
        X25519Field.mul(iArr2, iArr4, pointExtended3.f33419y);
    }

    private static void pointAddVar(boolean z11, PointPrecompZ pointPrecompZ, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = pointAccum.f33412x;
        int[] iArr4 = pointAccum.f33413y;
        int[] iArr5 = pointTemp.f33422r0;
        int[] iArr6 = pointAccum.f33414z;
        int[] iArr7 = pointAccum.f33410u;
        int[] iArr8 = pointAccum.f33411v;
        if (z11) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, pointPrecompZ.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecompZ.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f33410u, pointAccum.f33411v, iArr5);
        X25519Field.mul(iArr5, pointPrecompZ.xyd, iArr5);
        X25519Field.mul(pointAccum.f33414z, pointPrecompZ.f33421z, iArr6);
        X25519Field.apm(iArr4, iArr3, iArr8, iArr7);
        X25519Field.apm(iArr6, iArr5, iArr2, iArr);
        X25519Field.mul(iArr3, iArr4, pointAccum.f33414z);
        X25519Field.mul(iArr3, iArr7, pointAccum.f33412x);
        X25519Field.mul(iArr4, iArr8, pointAccum.f33413y);
    }

    private static void pointCopy(PointAccum pointAccum, PointExtended pointExtended) {
        X25519Field.copy(pointAccum.f33412x, 0, pointExtended.f33418x, 0);
        X25519Field.copy(pointAccum.f33413y, 0, pointExtended.f33419y, 0);
        X25519Field.copy(pointAccum.f33414z, 0, pointExtended.f33420z, 0);
        X25519Field.mul(pointAccum.f33410u, pointAccum.f33411v, pointExtended.f33417t);
    }

    private static void pointDouble(PointAccum pointAccum) {
        int[] iArr = pointAccum.f33412x;
        int[] iArr2 = pointAccum.f33413y;
        int[] iArr3 = pointAccum.f33414z;
        int[] iArr4 = pointAccum.f33410u;
        int[] iArr5 = pointAccum.f33411v;
        X25519Field.add(iArr, iArr2, iArr4);
        X25519Field.sqr(pointAccum.f33412x, iArr);
        X25519Field.sqr(pointAccum.f33413y, iArr2);
        X25519Field.sqr(pointAccum.f33414z, iArr3);
        X25519Field.add(iArr3, iArr3, iArr3);
        X25519Field.apm(iArr, iArr2, iArr5, iArr2);
        X25519Field.sqr(iArr4, iArr4);
        X25519Field.sub(iArr5, iArr4, iArr4);
        X25519Field.add(iArr3, iArr2, iArr);
        X25519Field.carry(iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.f33414z);
        X25519Field.mul(iArr, iArr4, pointAccum.f33412x);
        X25519Field.mul(iArr2, iArr5, pointAccum.f33413y);
    }

    private static void pointLookup(int i11, int i12, PointPrecomp pointPrecomp) {
        int i13 = i11 * 240;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            X25519Field.cmov(i15, PRECOMP_BASE_COMB, i13, pointPrecomp.ymx_h, 0);
            X25519Field.cmov(i15, PRECOMP_BASE_COMB, i13 + 10, pointPrecomp.ypx_h, 0);
            X25519Field.cmov(i15, PRECOMP_BASE_COMB, i13 + 20, pointPrecomp.xyd, 0);
            i13 += 30;
        }
    }

    private static void pointLookupZ(int[] iArr, int i11, int[] iArr2, PointPrecompZ pointPrecompZ) {
        int window4 = getWindow4(iArr, i11);
        int i12 = (window4 >>> 3) ^ 1;
        int i13 = (window4 ^ (-i12)) & 7;
        int i14 = 0;
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = ((i15 ^ i13) - 1) >> 31;
            X25519Field.cmov(i16, iArr2, i14, pointPrecompZ.ymx_h, 0);
            X25519Field.cmov(i16, iArr2, i14 + 10, pointPrecompZ.ypx_h, 0);
            X25519Field.cmov(i16, iArr2, i14 + 20, pointPrecompZ.xyd, 0);
            X25519Field.cmov(i16, iArr2, i14 + 30, pointPrecompZ.f33421z, 0);
            i14 += 40;
        }
        X25519Field.cswap(i12, pointPrecompZ.ymx_h, pointPrecompZ.ypx_h);
        X25519Field.cnegate(i12, pointPrecompZ.xyd);
    }

    private static void pointPrecompute(PointAffine pointAffine, PointExtended[] pointExtendedArr, int i11, int i12, PointTemp pointTemp) {
        PointExtended pointExtended = new PointExtended();
        pointExtendedArr[i11] = pointExtended;
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended();
        PointExtended pointExtended3 = pointExtendedArr[i11];
        pointAdd(pointExtended3, pointExtended3, pointExtended2, pointTemp);
        for (int i13 = 1; i13 < i12; i13++) {
            int i14 = i11 + i13;
            PointExtended pointExtended4 = pointExtendedArr[i14 - 1];
            PointExtended pointExtended5 = new PointExtended();
            pointExtendedArr[i14] = pointExtended5;
            pointAdd(pointExtended4, pointExtended2, pointExtended5, pointTemp);
        }
    }

    private static int[] pointPrecomputeZ(PointAffine pointAffine, int i11, PointTemp pointTemp) {
        PointExtended pointExtended = new PointExtended();
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended();
        pointAdd(pointExtended, pointExtended, pointExtended2, pointTemp);
        PointPrecompZ pointPrecompZ = new PointPrecompZ();
        int[] iArrCreateTable = X25519Field.createTable(i11 * 4);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            pointCopy(pointExtended, pointPrecompZ);
            X25519Field.copy(pointPrecompZ.ymx_h, 0, iArrCreateTable, i12);
            X25519Field.copy(pointPrecompZ.ypx_h, 0, iArrCreateTable, i12 + 10);
            X25519Field.copy(pointPrecompZ.xyd, 0, iArrCreateTable, i12 + 20);
            X25519Field.copy(pointPrecompZ.f33421z, 0, iArrCreateTable, i12 + 30);
            i12 += 40;
            i13++;
            if (i13 == i11) {
                return iArrCreateTable;
            }
            pointAdd(pointExtended, pointExtended2, pointExtended, pointTemp);
        }
    }

    private static void pointSetNeutral(PointAccum pointAccum) {
        X25519Field.zero(pointAccum.f33412x);
        X25519Field.one(pointAccum.f33413y);
        X25519Field.one(pointAccum.f33414z);
        X25519Field.zero(pointAccum.f33410u);
        X25519Field.one(pointAccum.f33411v);
    }

    public static void precompute() {
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_COMB == null) {
                    PointExtended[] pointExtendedArr = new PointExtended[96];
                    PointTemp pointTemp = new PointTemp();
                    PointAffine pointAffine = new PointAffine();
                    int[] iArr = B_x;
                    int i11 = 0;
                    X25519Field.copy(iArr, 0, pointAffine.f33415x, 0);
                    int[] iArr2 = B_y;
                    X25519Field.copy(iArr2, 0, pointAffine.f33416y, 0);
                    pointPrecompute(pointAffine, pointExtendedArr, 0, 16, pointTemp);
                    PointAffine pointAffine2 = new PointAffine();
                    X25519Field.copy(B128_x, 0, pointAffine2.f33415x, 0);
                    X25519Field.copy(B128_y, 0, pointAffine2.f33416y, 0);
                    pointPrecompute(pointAffine2, pointExtendedArr, 16, 16, pointTemp);
                    PointAccum pointAccum = new PointAccum();
                    X25519Field.copy(iArr, 0, pointAccum.f33412x, 0);
                    X25519Field.copy(iArr2, 0, pointAccum.f33413y, 0);
                    X25519Field.one(pointAccum.f33414z);
                    X25519Field.copy(pointAccum.f33412x, 0, pointAccum.f33410u, 0);
                    X25519Field.copy(pointAccum.f33413y, 0, pointAccum.f33411v, 0);
                    int i12 = 4;
                    PointExtended[] pointExtendedArr2 = new PointExtended[4];
                    for (int i13 = 0; i13 < 4; i13++) {
                        pointExtendedArr2[i13] = new PointExtended();
                    }
                    PointExtended pointExtended = new PointExtended();
                    int i14 = 0;
                    int i15 = 32;
                    while (i14 < 8) {
                        int i16 = i15 + 1;
                        PointExtended pointExtended2 = new PointExtended();
                        pointExtendedArr[i15] = pointExtended2;
                        int i17 = i11;
                        while (i17 < i12) {
                            if (i17 == 0) {
                                pointCopy(pointAccum, pointExtended2);
                            } else {
                                pointCopy(pointAccum, pointExtended);
                                pointAdd(pointExtended2, pointExtended, pointExtended2, pointTemp);
                            }
                            pointDouble(pointAccum);
                            pointCopy(pointAccum, pointExtendedArr2[i17]);
                            if (i14 + i17 != 10) {
                                for (int i18 = 1; i18 < 8; i18++) {
                                    pointDouble(pointAccum);
                                }
                            }
                            i17++;
                            i12 = 4;
                        }
                        int[] iArr3 = pointExtended2.f33418x;
                        X25519Field.negate(iArr3, iArr3);
                        int[] iArr4 = pointExtended2.f33417t;
                        X25519Field.negate(iArr4, iArr4);
                        i15 = i16;
                        for (int i19 = 0; i19 < 3; i19++) {
                            int i21 = 1 << i19;
                            int i22 = 0;
                            while (i22 < i21) {
                                PointExtended pointExtended3 = new PointExtended();
                                pointExtendedArr[i15] = pointExtended3;
                                pointAdd(pointExtendedArr[i15 - i21], pointExtendedArr2[i19], pointExtended3, pointTemp);
                                i22++;
                                i15++;
                            }
                        }
                        i14++;
                        i12 = 4;
                        i11 = 0;
                    }
                    invertDoubleZs(pointExtendedArr);
                    PRECOMP_BASE_WNAF = new PointPrecomp[16];
                    for (int i23 = 0; i23 < 16; i23++) {
                        PointExtended pointExtended4 = pointExtendedArr[i23];
                        PointPrecomp[] pointPrecompArr = PRECOMP_BASE_WNAF;
                        PointPrecomp pointPrecomp = new PointPrecomp();
                        pointPrecompArr[i23] = pointPrecomp;
                        int[] iArr5 = pointExtended4.f33418x;
                        X25519Field.mul(iArr5, pointExtended4.f33420z, iArr5);
                        int[] iArr6 = pointExtended4.f33419y;
                        X25519Field.mul(iArr6, pointExtended4.f33420z, iArr6);
                        X25519Field.apm(pointExtended4.f33419y, pointExtended4.f33418x, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                        X25519Field.mul(pointExtended4.f33418x, pointExtended4.f33419y, pointPrecomp.xyd);
                        int[] iArr7 = pointPrecomp.xyd;
                        X25519Field.mul(iArr7, C_d4, iArr7);
                        X25519Field.normalize(pointPrecomp.ymx_h);
                        X25519Field.normalize(pointPrecomp.ypx_h);
                        X25519Field.normalize(pointPrecomp.xyd);
                    }
                    PRECOMP_BASE128_WNAF = new PointPrecomp[16];
                    for (int i24 = 0; i24 < 16; i24++) {
                        PointExtended pointExtended5 = pointExtendedArr[16 + i24];
                        PointPrecomp[] pointPrecompArr2 = PRECOMP_BASE128_WNAF;
                        PointPrecomp pointPrecomp2 = new PointPrecomp();
                        pointPrecompArr2[i24] = pointPrecomp2;
                        int[] iArr8 = pointExtended5.f33418x;
                        X25519Field.mul(iArr8, pointExtended5.f33420z, iArr8);
                        int[] iArr9 = pointExtended5.f33419y;
                        X25519Field.mul(iArr9, pointExtended5.f33420z, iArr9);
                        X25519Field.apm(pointExtended5.f33419y, pointExtended5.f33418x, pointPrecomp2.ypx_h, pointPrecomp2.ymx_h);
                        X25519Field.mul(pointExtended5.f33418x, pointExtended5.f33419y, pointPrecomp2.xyd);
                        int[] iArr10 = pointPrecomp2.xyd;
                        X25519Field.mul(iArr10, C_d4, iArr10);
                        X25519Field.normalize(pointPrecomp2.ymx_h);
                        X25519Field.normalize(pointPrecomp2.ypx_h);
                        X25519Field.normalize(pointPrecomp2.xyd);
                    }
                    PRECOMP_BASE_COMB = X25519Field.createTable(BERTags.PRIVATE);
                    PointPrecomp pointPrecomp3 = new PointPrecomp();
                    int i25 = 0;
                    for (int i26 = 32; i26 < 96; i26++) {
                        PointExtended pointExtended6 = pointExtendedArr[i26];
                        int[] iArr11 = pointExtended6.f33418x;
                        X25519Field.mul(iArr11, pointExtended6.f33420z, iArr11);
                        int[] iArr12 = pointExtended6.f33419y;
                        X25519Field.mul(iArr12, pointExtended6.f33420z, iArr12);
                        X25519Field.apm(pointExtended6.f33419y, pointExtended6.f33418x, pointPrecomp3.ypx_h, pointPrecomp3.ymx_h);
                        X25519Field.mul(pointExtended6.f33418x, pointExtended6.f33419y, pointPrecomp3.xyd);
                        int[] iArr13 = pointPrecomp3.xyd;
                        X25519Field.mul(iArr13, C_d4, iArr13);
                        X25519Field.normalize(pointPrecomp3.ymx_h);
                        X25519Field.normalize(pointPrecomp3.ypx_h);
                        X25519Field.normalize(pointPrecomp3.xyd);
                        X25519Field.copy(pointPrecomp3.ymx_h, 0, PRECOMP_BASE_COMB, i25);
                        X25519Field.copy(pointPrecomp3.ypx_h, 0, PRECOMP_BASE_COMB, i25 + 10);
                        X25519Field.copy(pointPrecomp3.xyd, 0, PRECOMP_BASE_COMB, i25 + 20);
                        i25 += 30;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i11, byte[] bArr2) {
        System.arraycopy(bArr, i11, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b8 = (byte) (bArr2[31] & ByteCompanionObject.MAX_VALUE);
        bArr2[31] = b8;
        bArr2[31] = (byte) (b8 | 64);
    }

    private static void scalarMult(byte[] bArr, PointAffine pointAffine, PointAccum pointAccum) {
        int[] iArr = new int[8];
        Scalar25519.decode(bArr, iArr);
        Scalar25519.toSignedDigits(256, iArr);
        PointPrecompZ pointPrecompZ = new PointPrecompZ();
        PointTemp pointTemp = new PointTemp();
        int[] iArrPointPrecomputeZ = pointPrecomputeZ(pointAffine, 8, pointTemp);
        pointSetNeutral(pointAccum);
        int i11 = 63;
        while (true) {
            pointLookupZ(iArr, i11, iArrPointPrecomputeZ, pointPrecompZ);
            pointAdd(pointPrecompZ, pointAccum, pointTemp);
            i11--;
            if (i11 < 0) {
                return;
            }
            for (int i12 = 0; i12 < 4; i12++) {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointAccum pointAccum) {
        precompute();
        int[] iArr = new int[8];
        Scalar25519.decode(bArr, iArr);
        Scalar25519.toSignedDigits(256, iArr);
        groupCombBits(iArr);
        PointPrecomp pointPrecomp = new PointPrecomp();
        PointTemp pointTemp = new PointTemp();
        pointSetNeutral(pointAccum);
        int i11 = 28;
        int i12 = 0;
        while (true) {
            int i13 = 0;
            while (i13 < 8) {
                int i14 = iArr[i13] >>> i11;
                int i15 = (i14 >>> 3) & 1;
                pointLookup(i13, (i14 ^ (-i15)) & 7, pointPrecomp);
                int i16 = i12 ^ i15;
                X25519Field.cnegate(i16, pointAccum.f33412x);
                X25519Field.cnegate(i16, pointAccum.f33410u);
                pointAdd(pointPrecomp, pointAccum, pointTemp);
                i13++;
                i12 = i15;
            }
            i11 -= 4;
            if (i11 < 0) {
                X25519Field.cnegate(i12, pointAccum.f33412x);
                X25519Field.cnegate(i12, pointAccum.f33410u);
                return;
            }
            pointDouble(pointAccum);
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i11) {
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr, pointAccum);
        if (encodeResult(pointAccum, bArr2, i11) != 0) {
            return;
        }
        y.e();
    }

    public static void scalarMultBaseYZ(X25519.Friend friend, byte[] bArr, int i11, int[] iArr, int[] iArr2) {
        if (friend == null) {
            w.l("This method is only for use by X25519");
            return;
        }
        byte[] bArr2 = new byte[32];
        pruneScalar(bArr, i11, bArr2);
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr2, pointAccum);
        if (checkPoint(pointAccum) == 0) {
            y.e();
        } else {
            X25519Field.copy(pointAccum.f33413y, 0, iArr, 0);
            X25519Field.copy(pointAccum.f33414z, 0, iArr2, 0);
        }
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointAccum pointAccum) {
        byte[] bArr = new byte[253];
        Scalar25519.getOrderWnafVar(4, bArr);
        PointPrecompZ[] pointPrecompZArr = new PointPrecompZ[4];
        PointTemp pointTemp = new PointTemp();
        pointPrecomputeZ(pointAffine, pointPrecompZArr, 4, pointTemp);
        pointSetNeutral(pointAccum);
        int i11 = 252;
        while (true) {
            byte b8 = bArr[i11];
            if (b8 != 0) {
                pointAddVar(b8 < 0, pointPrecompZArr[(b8 >> 1) ^ (b8 >> 31)], pointAccum, pointTemp);
            }
            i11--;
            if (i11 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultStraus128Var(int[] iArr, int[] iArr2, PointAffine pointAffine, int[] iArr3, PointAffine pointAffine2, PointAccum pointAccum) {
        int i11;
        precompute();
        byte[] bArr = new byte[256];
        int i12 = 128;
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[128];
        Wnaf.getSignedVar(iArr, 6, bArr);
        Wnaf.getSignedVar(iArr2, 4, bArr2);
        Wnaf.getSignedVar(iArr3, 4, bArr3);
        PointPrecompZ[] pointPrecompZArr = new PointPrecompZ[4];
        PointPrecompZ[] pointPrecompZArr2 = new PointPrecompZ[4];
        PointTemp pointTemp = new PointTemp();
        pointPrecomputeZ(pointAffine, pointPrecompZArr, 4, pointTemp);
        pointPrecomputeZ(pointAffine2, pointPrecompZArr2, 4, pointTemp);
        pointSetNeutral(pointAccum);
        while (true) {
            i11 = i12 - 1;
            if (i11 < 0 || (bArr[i11] | bArr[i12 + 127] | bArr2[i11] | bArr3[i11]) != 0) {
                break;
            } else {
                i12 = i11;
            }
        }
        while (i11 >= 0) {
            byte b8 = bArr[i11];
            if (b8 != 0) {
                pointAddVar(b8 < 0, PRECOMP_BASE_WNAF[(b8 >> 1) ^ (b8 >> 31)], pointAccum, pointTemp);
            }
            byte b11 = bArr[i11 + 128];
            if (b11 != 0) {
                pointAddVar(b11 < 0, PRECOMP_BASE128_WNAF[(b11 >> 1) ^ (b11 >> 31)], pointAccum, pointTemp);
            }
            byte b12 = bArr2[i11];
            if (b12 != 0) {
                pointAddVar(b12 < 0, pointPrecompZArr[(b12 >> 1) ^ (b12 >> 31)], pointAccum, pointTemp);
            }
            byte b13 = bArr3[i11];
            if (b13 != 0) {
                pointAddVar(b13 < 0, pointPrecompZArr2[(b13 >> 1) ^ (b13 >> 31)], pointAccum, pointTemp);
            }
            pointDouble(pointAccum);
            i11--;
        }
        pointDouble(pointAccum);
        pointDouble(pointAccum);
    }

    public static void sign(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        implSign(bArr, i11, bArr2, i12, bArr3, (byte) 0, bArr4, i13, i14, bArr5, i15);
    }

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, Digest digest, byte[] bArr4, int i13) {
        byte[] bArr5 = new byte[64];
        if (64 == digest.doFinal(bArr5, 0)) {
            implSign(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i13);
        } else {
            a.f("ph");
        }
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i11) {
        byte[] bArrCopy = copy(bArr, i11, 32);
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
        byte[] bArrCopy = copy(bArr, i11, 32);
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
        byte[] bArrCopy = copy(bArr, i11, 32);
        if (checkPointFullVar(bArrCopy)) {
            return decodePointVar(bArrCopy, false, new PointAffine());
        }
        return false;
    }

    public static PublicPoint validatePublicKeyPartialExport(byte[] bArr, int i11) {
        byte[] bArrCopy = copy(bArr, i11, 32);
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

    public static boolean verifyPrehash(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return implVerify(bArr, i11, bArr2, i12, bArr3, (byte) 1, bArr4, 0, 64);
        }
        a.f("ph");
        return false;
    }

    public static boolean verify(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i12, int i13) {
        return implVerify(bArr, i11, publicPoint, bArr2, (byte) 0, bArr3, i12, i13);
    }

    public static boolean verify(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14) {
        return implVerify(bArr, i11, bArr2, i12, null, (byte) 0, bArr3, i13, i14);
    }

    public static boolean verify(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, int i12, int i13) {
        return implVerify(bArr, i11, publicPoint, null, (byte) 0, bArr2, i12, i13);
    }

    public static void sign(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14, byte[] bArr4, int i15) {
        implSign(bArr, i11, bArr2, i12, null, (byte) 0, bArr3, i13, i14, bArr4, i15);
    }

    public static void sign(byte[] bArr, int i11, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        implSign(bArr, i11, null, (byte) 0, bArr2, i12, i13, bArr3, i14);
    }

    public static void sign(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        implSign(bArr, i11, bArr2, (byte) 0, bArr3, i12, i13, bArr4, i14);
    }

    private static void pointCopy(PointAffine pointAffine, PointExtended pointExtended) {
        X25519Field.copy(pointAffine.f33415x, 0, pointExtended.f33418x, 0);
        X25519Field.copy(pointAffine.f33416y, 0, pointExtended.f33419y, 0);
        X25519Field.one(pointExtended.f33420z);
        X25519Field.mul(pointAffine.f33415x, pointAffine.f33416y, pointExtended.f33417t);
    }

    public static boolean verifyPrehash(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i12) {
        return implVerify(bArr, i11, publicPoint, bArr2, (byte) 1, bArr3, i12, 64);
    }

    private static void pointCopy(PointExtended pointExtended, PointPrecompZ pointPrecompZ) {
        X25519Field.apm(pointExtended.f33419y, pointExtended.f33418x, pointPrecompZ.ypx_h, pointPrecompZ.ymx_h);
        X25519Field.mul(pointExtended.f33417t, C_d2, pointPrecompZ.xyd);
        int[] iArr = pointExtended.f33420z;
        X25519Field.add(iArr, iArr, pointPrecompZ.f33421z);
    }

    public static boolean verifyPrehash(byte[] bArr, int i11, PublicPoint publicPoint, byte[] bArr2, Digest digest) {
        byte[] bArr3 = new byte[64];
        if (64 == digest.doFinal(bArr3, 0)) {
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

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, Digest digest, byte[] bArr3, int i12) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            implSign(bArr, i11, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i12);
        } else {
            a.f("ph");
        }
    }

    public static void signPrehash(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12, byte[] bArr4, int i13) {
        implSign(bArr, i11, bArr2, (byte) 1, bArr3, i12, 64, bArr4, i13);
    }

    public static void generatePublicKey(byte[] bArr, int i11, byte[] bArr2, int i12) {
        Digest digestCreateDigest = createDigest();
        byte[] bArr3 = new byte[64];
        digestCreateDigest.update(bArr, i11, 32);
        digestCreateDigest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i12);
    }

    private static void implSign(byte[] bArr, int i11, byte[] bArr2, byte b8, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        if (!checkContextVar(bArr2, b8)) {
            a.f("ctx");
            return;
        }
        Digest digestCreateDigest = createDigest();
        byte[] bArr5 = new byte[64];
        digestCreateDigest.update(bArr, i11, 32);
        digestCreateDigest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(digestCreateDigest, bArr5, bArr6, bArr7, 0, bArr2, b8, bArr3, i12, i13, bArr4, i14);
    }

    private static void implSign(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b8, byte[] bArr4, int i13, int i14, byte[] bArr5, int i15) {
        if (!checkContextVar(bArr3, b8)) {
            a.f("ctx");
            return;
        }
        Digest digestCreateDigest = createDigest();
        byte[] bArr6 = new byte[64];
        digestCreateDigest.update(bArr, i11, 32);
        digestCreateDigest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        pruneScalar(bArr6, 0, bArr7);
        implSign(digestCreateDigest, bArr6, bArr7, bArr2, i12, bArr3, b8, bArr4, i13, i14, bArr5, i15);
    }

    private static void pointPrecomputeZ(PointAffine pointAffine, PointPrecompZ[] pointPrecompZArr, int i11, PointTemp pointTemp) {
        PointExtended pointExtended = new PointExtended();
        pointCopy(pointAffine, pointExtended);
        PointExtended pointExtended2 = new PointExtended();
        pointAdd(pointExtended, pointExtended, pointExtended2, pointTemp);
        int i12 = 0;
        while (true) {
            PointPrecompZ pointPrecompZ = new PointPrecompZ();
            pointPrecompZArr[i12] = pointPrecompZ;
            pointCopy(pointExtended, pointPrecompZ);
            i12++;
            if (i12 == i11) {
                return;
            } else {
                pointAdd(pointExtended, pointExtended2, pointExtended, pointTemp);
            }
        }
    }

    private static void pointAddVar(boolean z11, PointPrecomp pointPrecomp, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = pointAccum.f33412x;
        int[] iArr4 = pointAccum.f33413y;
        int[] iArr5 = pointTemp.f33422r0;
        int[] iArr6 = pointAccum.f33410u;
        int[] iArr7 = pointAccum.f33411v;
        if (z11) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        X25519Field.apm(iArr4, iArr3, iArr4, iArr3);
        X25519Field.mul(iArr, pointPrecomp.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecomp.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f33410u, pointAccum.f33411v, iArr5);
        X25519Field.mul(iArr5, pointPrecomp.xyd, iArr5);
        X25519Field.apm(iArr4, iArr3, iArr7, iArr6);
        X25519Field.apm(pointAccum.f33414z, iArr5, iArr2, iArr);
        X25519Field.mul(iArr3, iArr4, pointAccum.f33414z);
        X25519Field.mul(iArr3, iArr6, pointAccum.f33412x);
        X25519Field.mul(iArr4, iArr7, pointAccum.f33413y);
    }

    private static void pointAdd(PointPrecomp pointPrecomp, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr = pointAccum.f33412x;
        int[] iArr2 = pointAccum.f33413y;
        int[] iArr3 = pointTemp.f33422r0;
        int[] iArr4 = pointAccum.f33410u;
        int[] iArr5 = pointAccum.f33411v;
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.mul(iArr, pointPrecomp.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecomp.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f33410u, pointAccum.f33411v, iArr3);
        X25519Field.mul(iArr3, pointPrecomp.xyd, iArr3);
        X25519Field.apm(iArr2, iArr, iArr5, iArr4);
        X25519Field.apm(pointAccum.f33414z, iArr3, iArr2, iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.f33414z);
        X25519Field.mul(iArr, iArr4, pointAccum.f33412x);
        X25519Field.mul(iArr2, iArr5, pointAccum.f33413y);
    }

    private static void pointAdd(PointPrecompZ pointPrecompZ, PointAccum pointAccum, PointTemp pointTemp) {
        int[] iArr = pointAccum.f33412x;
        int[] iArr2 = pointAccum.f33413y;
        int[] iArr3 = pointTemp.f33422r0;
        int[] iArr4 = pointAccum.f33414z;
        int[] iArr5 = pointAccum.f33410u;
        int[] iArr6 = pointAccum.f33411v;
        X25519Field.apm(iArr2, iArr, iArr2, iArr);
        X25519Field.mul(iArr, pointPrecompZ.ymx_h, iArr);
        X25519Field.mul(iArr2, pointPrecompZ.ypx_h, iArr2);
        X25519Field.mul(pointAccum.f33410u, pointAccum.f33411v, iArr3);
        X25519Field.mul(iArr3, pointPrecompZ.xyd, iArr3);
        X25519Field.mul(pointAccum.f33414z, pointPrecompZ.f33421z, iArr4);
        X25519Field.apm(iArr2, iArr, iArr6, iArr5);
        X25519Field.apm(iArr4, iArr3, iArr2, iArr);
        X25519Field.mul(iArr, iArr2, pointAccum.f33414z);
        X25519Field.mul(iArr, iArr5, pointAccum.f33412x);
        X25519Field.mul(iArr2, iArr6, pointAccum.f33413y);
    }

    private static int checkPoint(PointAffine pointAffine) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        X25519Field.sqr(pointAffine.f33415x, iArrCreate2);
        X25519Field.sqr(pointAffine.f33416y, iArrCreate3);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X25519Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
        X25519Field.mul(iArrCreate, C_d, iArrCreate);
        X25519Field.addOne(iArrCreate);
        X25519Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.normalize(iArrCreate);
        X25519Field.normalize(iArrCreate3);
        return X25519Field.isZero(iArrCreate) & (~X25519Field.isZero(iArrCreate3));
    }

    private static boolean implVerify(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, byte b8, byte[] bArr4, int i13, int i14) {
        if (!checkContextVar(bArr3, b8)) {
            a.f("ctx");
            return false;
        }
        byte[] bArrCopy = copy(bArr, i11, 32);
        byte[] bArrCopy2 = copy(bArr, i11 + 32, 32);
        byte[] bArrCopy3 = copy(bArr2, i12, 32);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!Scalar25519.checkVar(bArrCopy2, iArr) || !checkPointFullVar(bArrCopy3)) {
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
        Digest digestCreateDigest = createDigest();
        byte[] bArr5 = new byte[64];
        if (bArr3 != null) {
            dom2(digestCreateDigest, b8, bArr3);
        }
        digestCreateDigest.update(bArrCopy, 0, 32);
        digestCreateDigest.update(bArrCopy3, 0, 32);
        digestCreateDigest.update(bArr4, i13, i14);
        digestCreateDigest.doFinal(bArr5, 0);
        int[] iArr2 = new int[8];
        Scalar25519.decode(Scalar25519.reduce512(bArr5), iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        if (!Scalar25519.reduceBasisVar(iArr2, iArr3, iArr4)) {
            y.e();
            return false;
        }
        Scalar25519.multiply128Var(iArr, iArr4, iArr);
        PointAccum pointAccum = new PointAccum();
        scalarMultStraus128Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointAccum);
        return normalizeToNeutralElementVar(pointAccum);
    }
}
