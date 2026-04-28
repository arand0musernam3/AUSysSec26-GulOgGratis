package org.bouncycastle.pqc.crypto.mayo;

/* JADX INFO: loaded from: classes3.dex */
public class MayoParameters {
    public static final MayoParameters mayo1 = new MayoParameters("MAYO_1", 86, 78, 5, 8, 78, 81, 10, 39, 312, 39, 40, 120159, 24336, 24, 1420, 454, new int[]{8, 1, 1, 0}, 24, 32, 24);
    public static final MayoParameters mayo2 = new MayoParameters("MAYO_2", 81, 64, 4, 17, 64, 69, 4, 32, 544, 32, 34, 66560, 34816, 24, 4912, 186, new int[]{8, 0, 2, 8}, 24, 32, 24);
    public static final MayoParameters mayo3 = new MayoParameters("MAYO_3", 118, 108, 7, 10, 108, 111, 11, 54, 540, 54, 55, 317844, 58320, 32, 2986, 681, new int[]{8, 0, 1, 7}, 32, 48, 32);
    public static final MayoParameters mayo5 = new MayoParameters("MAYO_5", 154, 142, 9, 12, 142, 145, 12, 71, 852, 71, 72, 720863, 120984, 40, 5554, 964, new int[]{4, 0, 8, 1}, 40, 64, 40);
    private static final int pkSeedBytes = 16;
    private final int ACols;
    private final int OBytes;
    private final int P1Bytes;
    private final int P2Bytes;
    private final int cpkBytes;
    private final int cskBytes;
    private final int digestBytes;
    private final int[] fTail;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f33537k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f33538m;
    private final int mBytes;
    private final int mVecLimbs;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f33539n;
    private final String name;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f33540o;
    private final int rBytes;
    private final int saltBytes;
    private final int sigBytes;
    private final int skSeedBytes;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f33541v;
    private final int vBytes;

    private MayoParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int[] iArr, int i28, int i29, int i31) {
        this.name = str;
        this.f33539n = i11;
        this.f33538m = i12;
        this.mVecLimbs = i13;
        this.f33540o = i14;
        this.f33541v = i15;
        this.ACols = i16;
        this.f33537k = i17;
        this.mBytes = i18;
        this.OBytes = i19;
        this.vBytes = i21;
        this.rBytes = i22;
        this.P1Bytes = i23;
        this.P2Bytes = i24;
        this.cskBytes = i25;
        this.cpkBytes = i26;
        this.sigBytes = i27;
        this.fTail = iArr;
        this.saltBytes = i28;
        this.digestBytes = i29;
        this.skSeedBytes = i31;
    }

    public int getACols() {
        return this.ACols;
    }

    public int getCpkBytes() {
        return this.cpkBytes;
    }

    public int getCskBytes() {
        return this.cskBytes;
    }

    public int getDigestBytes() {
        return this.digestBytes;
    }

    public int[] getFTail() {
        return this.fTail;
    }

    public int getK() {
        return this.f33537k;
    }

    public int getM() {
        return this.f33538m;
    }

    public int getMBytes() {
        return this.mBytes;
    }

    public int getMVecLimbs() {
        return this.mVecLimbs;
    }

    public int getN() {
        return this.f33539n;
    }

    public String getName() {
        return this.name;
    }

    public int getO() {
        return this.f33540o;
    }

    public int getOBytes() {
        return this.OBytes;
    }

    public int getP1Bytes() {
        return this.P1Bytes;
    }

    public int getP1Limbs() {
        int i11 = this.f33541v;
        return (((i11 + 1) * i11) >> 1) * this.mVecLimbs;
    }

    public int getP2Bytes() {
        return this.P2Bytes;
    }

    public int getP2Limbs() {
        return this.f33541v * this.f33540o * this.mVecLimbs;
    }

    public int getP3Limbs() {
        int i11 = this.f33540o;
        return (((i11 + 1) * i11) >> 1) * this.mVecLimbs;
    }

    public int getPkSeedBytes() {
        return 16;
    }

    public int getRBytes() {
        return this.rBytes;
    }

    public int getSaltBytes() {
        return this.saltBytes;
    }

    public int getSigBytes() {
        return this.sigBytes;
    }

    public int getSkSeedBytes() {
        return this.skSeedBytes;
    }

    public int getV() {
        return this.f33541v;
    }

    public int getVBytes() {
        return this.vBytes;
    }
}
