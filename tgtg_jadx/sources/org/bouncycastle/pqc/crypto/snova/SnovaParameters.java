package org.bouncycastle.pqc.crypto.snova;

/* JADX INFO: loaded from: classes3.dex */
public class SnovaParameters {
    private final int alpha;
    private final int l;
    private final int lsq;
    private final String name;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f33616o;
    private final boolean pkExpandShake;
    private final boolean skIsSeed;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f33617v;
    public static final SnovaParameters SNOVA_24_5_4_SSK = new SnovaParameters("SNOVA_24_5_4_SSK", 24, 5, 4, true, false);
    public static final SnovaParameters SNOVA_24_5_4_ESK = new SnovaParameters("SNOVA_24_5_4_ESK", 24, 5, 4, false, false);
    public static final SnovaParameters SNOVA_24_5_4_SHAKE_SSK = new SnovaParameters("SNOVA_24_5_4_SHAKE_SSK", 24, 5, 4, true, true);
    public static final SnovaParameters SNOVA_24_5_4_SHAKE_ESK = new SnovaParameters("SNOVA_24_5_4_SHAKE_ESK", 24, 5, 4, false, true);
    public static final SnovaParameters SNOVA_24_5_5_SSK = new SnovaParameters("SNOVA_24_5_5_SSK", 24, 5, 5, true, false);
    public static final SnovaParameters SNOVA_24_5_5_ESK = new SnovaParameters("SNOVA_24_5_5_ESK", 24, 5, 5, false, false);
    public static final SnovaParameters SNOVA_24_5_5_SHAKE_SSK = new SnovaParameters("SNOVA_24_5_5_SHAKE_SSK", 24, 5, 5, true, true);
    public static final SnovaParameters SNOVA_24_5_5_SHAKE_ESK = new SnovaParameters("SNOVA_24_5_5_SHAKE_ESK", 24, 5, 5, false, true);
    public static final SnovaParameters SNOVA_25_8_3_SSK = new SnovaParameters("SNOVA_25_8_3_SSK", 25, 8, 3, true, false);
    public static final SnovaParameters SNOVA_25_8_3_ESK = new SnovaParameters("SNOVA_25_8_3_ESK", 25, 8, 3, false, false);
    public static final SnovaParameters SNOVA_25_8_3_SHAKE_SSK = new SnovaParameters("SNOVA_25_8_3_SHAKE_SSK", 25, 8, 3, true, true);
    public static final SnovaParameters SNOVA_25_8_3_SHAKE_ESK = new SnovaParameters("SNOVA_25_8_3_SHAKE_ESK", 25, 8, 3, false, true);
    public static final SnovaParameters SNOVA_29_6_5_SSK = new SnovaParameters("SNOVA_29_6_5_SSK", 29, 6, 5, true, false);
    public static final SnovaParameters SNOVA_29_6_5_ESK = new SnovaParameters("SNOVA_29_6_5_ESK", 29, 6, 5, false, false);
    public static final SnovaParameters SNOVA_29_6_5_SHAKE_SSK = new SnovaParameters("SNOVA_29_6_5_SHAKE_SSK", 29, 6, 5, true, true);
    public static final SnovaParameters SNOVA_29_6_5_SHAKE_ESK = new SnovaParameters("SNOVA_29_6_5_SHAKE_ESK", 29, 6, 5, false, true);
    public static final SnovaParameters SNOVA_37_8_4_SSK = new SnovaParameters("SNOVA_37_8_4_SSK", 37, 8, 4, true, false);
    public static final SnovaParameters SNOVA_37_8_4_ESK = new SnovaParameters("SNOVA_37_8_4_ESK", 37, 8, 4, false, false);
    public static final SnovaParameters SNOVA_37_8_4_SHAKE_SSK = new SnovaParameters("SNOVA_37_8_4_SHAKE_SSK", 37, 8, 4, true, true);
    public static final SnovaParameters SNOVA_37_8_4_SHAKE_ESK = new SnovaParameters("SNOVA_37_8_4_SHAKE_ESK", 37, 8, 4, false, true);
    public static final SnovaParameters SNOVA_37_17_2_SSK = new SnovaParameters("SNOVA_37_17_2_SSK", 37, 17, 2, true, false);
    public static final SnovaParameters SNOVA_37_17_2_ESK = new SnovaParameters("SNOVA_37_17_2_ESK", 37, 17, 2, false, false);
    public static final SnovaParameters SNOVA_37_17_2_SHAKE_SSK = new SnovaParameters("SNOVA_37_17_2_SHAKE_SSK", 37, 17, 2, true, true);
    public static final SnovaParameters SNOVA_37_17_2_SHAKE_ESK = new SnovaParameters("SNOVA_37_17_2_SHAKE_ESK", 37, 17, 2, false, true);
    public static final SnovaParameters SNOVA_49_11_3_SSK = new SnovaParameters("SNOVA_49_11_3_SSK", 49, 11, 3, true, false);
    public static final SnovaParameters SNOVA_49_11_3_ESK = new SnovaParameters("SNOVA_49_11_3_ESK", 49, 11, 3, false, false);
    public static final SnovaParameters SNOVA_49_11_3_SHAKE_SSK = new SnovaParameters("SNOVA_49_11_3_SHAKE_SSK", 49, 11, 3, true, true);
    public static final SnovaParameters SNOVA_49_11_3_SHAKE_ESK = new SnovaParameters("SNOVA_49_11_3_SHAKE_ESK", 49, 11, 3, false, true);
    public static final SnovaParameters SNOVA_56_25_2_SSK = new SnovaParameters("SNOVA_56_25_2_SSK", 56, 25, 2, true, false);
    public static final SnovaParameters SNOVA_56_25_2_ESK = new SnovaParameters("SNOVA_56_25_2_ESK", 56, 25, 2, false, false);
    public static final SnovaParameters SNOVA_56_25_2_SHAKE_SSK = new SnovaParameters("SNOVA_56_25_2_SHAKE_SSK", 56, 25, 2, true, true);
    public static final SnovaParameters SNOVA_56_25_2_SHAKE_ESK = new SnovaParameters("SNOVA_56_25_2_SHAKE_ESK", 56, 25, 2, false, true);
    public static final SnovaParameters SNOVA_60_10_4_SSK = new SnovaParameters("SNOVA_60_10_4_SSK", 60, 10, 4, true, false);
    public static final SnovaParameters SNOVA_60_10_4_ESK = new SnovaParameters("SNOVA_60_10_4_ESK", 60, 10, 4, false, false);
    public static final SnovaParameters SNOVA_60_10_4_SHAKE_SSK = new SnovaParameters("SNOVA_60_10_4_SHAKE_SSK", 60, 10, 4, true, true);
    public static final SnovaParameters SNOVA_60_10_4_SHAKE_ESK = new SnovaParameters("SNOVA_60_10_4_SHAKE_ESK", 60, 10, 4, false, true);
    public static final SnovaParameters SNOVA_66_15_3_SSK = new SnovaParameters("SNOVA_66_15_3_SSK", 66, 15, 3, true, false);
    public static final SnovaParameters SNOVA_66_15_3_ESK = new SnovaParameters("SNOVA_66_15_3_ESK", 66, 15, 3, false, false);
    public static final SnovaParameters SNOVA_66_15_3_SHAKE_SSK = new SnovaParameters("SNOVA_66_15_3_SHAKE_SSK", 66, 15, 3, true, true);
    public static final SnovaParameters SNOVA_66_15_3_SHAKE_ESK = new SnovaParameters("SNOVA_66_15_3_SHAKE_ESK", 66, 15, 3, false, true);
    public static final SnovaParameters SNOVA_75_33_2_SSK = new SnovaParameters("SNOVA_75_33_2_SSK", 75, 33, 2, true, false);
    public static final SnovaParameters SNOVA_75_33_2_ESK = new SnovaParameters("SNOVA_75_33_2_ESK", 75, 33, 2, false, false);
    public static final SnovaParameters SNOVA_75_33_2_SHAKE_SSK = new SnovaParameters("SNOVA_75_33_2_SHAKE_SSK", 75, 33, 2, true, true);
    public static final SnovaParameters SNOVA_75_33_2_SHAKE_ESK = new SnovaParameters("SNOVA_75_33_2_SHAKE_ESK", 75, 33, 2, false, true);

    private SnovaParameters(String str, int i11, int i12, int i13, boolean z11, boolean z12) {
        this.name = str;
        this.f33617v = i11;
        this.f33616o = i12;
        this.l = i13;
        int i14 = i13 * i13;
        this.lsq = i14;
        this.alpha = i14 + i13;
        this.skIsSeed = z11;
        this.pkExpandShake = z12;
    }

    public int getAlpha() {
        return this.alpha;
    }

    public int getL() {
        return this.l;
    }

    public int getLsq() {
        return this.lsq;
    }

    public int getM() {
        return this.f33616o;
    }

    public int getN() {
        return this.f33617v + this.f33616o;
    }

    public String getName() {
        return this.name;
    }

    public int getO() {
        return this.f33616o;
    }

    public int getPrivateKeyLength() {
        int i11 = this.lsq;
        int i12 = this.f33616o;
        int i13 = i12 * 4 * this.alpha;
        int i14 = this.f33617v;
        return (((((i14 * i12) + ((((i12 * i14) + ((i14 * i12) + (i14 * i14))) * i12) + i13)) * i11) + 1) >> 1) + 48;
    }

    public int getPublicKeyLength() {
        int i11 = this.f33616o;
        return (((((i11 * i11) * i11) * this.lsq) + 1) >>> 1) + 16;
    }

    public int getSaltLength() {
        return 16;
    }

    public int getV() {
        return this.f33617v;
    }

    public boolean isPkExpandShake() {
        return this.pkExpandShake;
    }

    public boolean isSkIsSeed() {
        return this.skIsSeed;
    }
}
