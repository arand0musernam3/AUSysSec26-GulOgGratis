package org.bouncycastle.pqc.crypto.hqc;

import com.app.tgtg.model.local.AppConstants;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes3.dex */
public class HQCParameters implements KEMParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, MLKEMEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 75, 16767881, 4, new int[]{89, 69, 153, 116, 176, 117, 111, 75, 73, 233, 242, 233, 65, 210, 21, 139, 103, 173, 67, 118, 105, 210, 174, 110, 74, 69, 228, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 114, 16742417, 5, new int[]{45, 216, 239, 24, 253, 104, 27, 40, 107, 50, 163, 210, 227, 134, BERTags.FLAGS, 158, 119, 13, 158, 1, 238, 164, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 59, 29, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, 149, 149, 16772367, 5, new int[]{49, 167, 49, 39, 200, 121, 124, 91, 240, 63, AppConstants.CONTACT_US_REQUEST_FILE, 71, 150, AppConstants.RESULT_CODE_ORDER_CANCELLED, 87, 101, 32, 215, 159, 71, AppConstants.PERMISSIONS_REQUEST_USE_LOCATION, 115, 97, 210, 186, 183, 141, 217, AppConstants.RESULT_CODE_ORDER_CANCELLED, 12, 31, 243, 180, 219, 152, 239, 99, 141, 4, 246, 191, 144, 8, 232, 47, 27, 141, 178, AppConstants.RESULT_CODE_ORDER_COLLECTED, 64, 124, 47, 39, 188, 216, 48, 199, 187, 1});
    private int delta;
    private int fft;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33512g;
    private int[] generatorPoly;
    private HQCEngine hqcEngine;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33513k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33514n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f33515n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private int f33516n2;
    private final String name;
    private int utilRejectionThreshold;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33517w;

    /* JADX INFO: renamed from: we, reason: collision with root package name */
    private int f33518we;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private int f33519wr;

    private HQCParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int[] iArr) {
        this.name = str;
        this.f33514n = i11;
        this.f33515n1 = i12;
        this.f33516n2 = i13;
        this.f33513k = i14;
        this.delta = i16;
        this.f33517w = i17;
        this.f33519wr = i18;
        this.f33518we = i19;
        this.generatorPoly = iArr;
        this.f33512g = i15;
        this.utilRejectionThreshold = i21;
        this.fft = i22;
        this.hqcEngine = new HQCEngine(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, iArr);
    }

    public int getDelta() {
        return this.delta;
    }

    public HQCEngine getEngine() {
        return this.hqcEngine;
    }

    public int getK() {
        return this.f33513k;
    }

    public int getN() {
        return this.f33514n;
    }

    public int getN1() {
        return this.f33515n1;
    }

    public int getN1N2_BYTES() {
        return ((this.f33515n1 * this.f33516n2) + 7) / 8;
    }

    public int getN2() {
        return this.f33516n2;
    }

    public int getN_BYTES() {
        return (this.f33514n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getSALT_SIZE_BYTES() {
        return 16;
    }

    public int getSHA512_BYTES() {
        return 64;
    }

    public int getSessionKeySize() {
        return 256;
    }

    public int getW() {
        return this.f33517w;
    }

    public int getWe() {
        return this.f33518we;
    }

    public int getWr() {
        return this.f33519wr;
    }
}
