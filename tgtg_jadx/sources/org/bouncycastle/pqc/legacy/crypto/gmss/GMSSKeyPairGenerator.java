package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;

/* JADX INFO: loaded from: classes3.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int[] K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i11;
        Class cls;
        int i12;
        int i13;
        if (!this.initialized) {
            initializeDefault();
        }
        int i14 = this.numLayer;
        byte[][][] bArr = new byte[i14][][];
        byte[][][] bArr2 = new byte[i14 - 1][][];
        Treehash[][] treehashArr = new Treehash[i14][];
        Treehash[][] treehashArr2 = new Treehash[i14 - 1][];
        Vector[] vectorArr = new Vector[i14];
        Vector[] vectorArr2 = new Vector[i14 - 1];
        Vector[][] vectorArr3 = new Vector[i14][];
        char c3 = 1;
        Vector[][] vectorArr4 = new Vector[i14 - 1][];
        int i15 = 0;
        while (true) {
            i11 = this.numLayer;
            cls = Byte.TYPE;
            if (i15 >= i11) {
                break;
            }
            int i16 = this.heightOfTrees[i15];
            char c7 = c3;
            int[] iArr = new int[2];
            iArr[c7] = this.mdLength;
            iArr[0] = i16;
            bArr[i15] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i17 = this.heightOfTrees[i15];
            treehashArr[i15] = new Treehash[i17 - this.K[i15]];
            if (i15 > 0) {
                int i18 = i15 - 1;
                int[] iArr2 = new int[2];
                iArr2[c7] = this.mdLength;
                iArr2[0] = i17;
                bArr2[i18] = (byte[][]) Array.newInstance((Class<?>) cls, iArr2);
                treehashArr2[i18] = new Treehash[this.heightOfTrees[i15] - this.K[i15]];
            }
            vectorArr[i15] = new Vector();
            if (i15 > 0) {
                vectorArr2[i15 - 1] = new Vector();
            }
            i15++;
            c3 = c7;
        }
        char c8 = c3;
        int[] iArr3 = new int[2];
        iArr3[c8] = this.mdLength;
        iArr3[0] = i11;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr3);
        int i19 = this.numLayer - 1;
        int[] iArr4 = new int[2];
        iArr4[c8] = this.mdLength;
        iArr4[0] = i19;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        int i21 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[c8] = this.mdLength;
        iArr5[0] = i21;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls, iArr5);
        int i22 = 0;
        while (true) {
            i12 = this.numLayer;
            if (i22 >= i12) {
                break;
            }
            System.arraycopy(this.currentSeeds[i22], 0, bArr5[i22], 0, this.mdLength);
            i22++;
            bArr5 = bArr5;
            bArr3 = bArr3;
        }
        byte[][] bArr6 = bArr5;
        byte[][] bArr7 = bArr3;
        int[] iArr6 = new int[2];
        iArr6[c8] = this.mdLength;
        iArr6[0] = i12 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) cls, iArr6);
        int i23 = this.numLayer - 1;
        while (true) {
            i13 = this.numLayer;
            if (i23 < 0) {
                break;
            }
            GMSSRootCalc gMSSRootCalcGenerateCurrentAuthpathAndRoot = i23 == i13 + (-1) ? generateCurrentAuthpathAndRoot(null, vectorArr[i23], bArr6[i23], i23) : generateCurrentAuthpathAndRoot(bArr7[i23 + 1], vectorArr[i23], bArr6[i23], i23);
            int i24 = 0;
            while (i24 < this.heightOfTrees[i23]) {
                System.arraycopy(gMSSRootCalcGenerateCurrentAuthpathAndRoot.getAuthPath()[i24], 0, bArr[i23][i24], 0, this.mdLength);
                i24++;
                i23 = i23;
            }
            int i25 = i23;
            vectorArr3[i25] = gMSSRootCalcGenerateCurrentAuthpathAndRoot.getRetain();
            treehashArr[i25] = gMSSRootCalcGenerateCurrentAuthpathAndRoot.getTreehash();
            System.arraycopy(gMSSRootCalcGenerateCurrentAuthpathAndRoot.getRoot(), 0, bArr7[i25], 0, this.mdLength);
            i23 = i25 - 1;
        }
        int i26 = i13 - 2;
        while (i26 >= 0) {
            int i27 = i26 + 1;
            GMSSRootCalc gMSSRootCalcGenerateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i26], bArr6[i27], i27);
            int i28 = 0;
            while (i28 < this.heightOfTrees[i27]) {
                System.arraycopy(gMSSRootCalcGenerateNextAuthpathAndRoot.getAuthPath()[i28], 0, bArr2[i26][i28], 0, this.mdLength);
                i28++;
                gMSSRootCalcGenerateNextAuthpathAndRoot = gMSSRootCalcGenerateNextAuthpathAndRoot;
                i26 = i26;
            }
            GMSSRootCalc gMSSRootCalc = gMSSRootCalcGenerateNextAuthpathAndRoot;
            int i29 = i26;
            vectorArr4[i29] = gMSSRootCalc.getRetain();
            treehashArr2[i29] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr4[i29], 0, this.mdLength);
            System.arraycopy(bArr6[i27], 0, this.nextNextSeeds[i29], 0, this.mdLength);
            i26 = i29 - 1;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr7[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i11) {
        byte[] bArrVerify;
        int i12 = this.mdLength;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i12];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i11], this.K[i11], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i13 = this.numLayer - 1;
        GMSSDigestProvider gMSSDigestProvider = this.digestProvider;
        if (i11 == i13) {
            bArrVerify = new WinternitzOTSignature(bArrNextSeed, gMSSDigestProvider.get(), this.otsIndex[i11]).getPublicKey();
        } else {
            this.currentRootSigs[i11] = new WinternitzOTSignature(bArrNextSeed, gMSSDigestProvider.get(), this.otsIndex[i11]).getSignature(bArr);
            bArrVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i11]).Verify(bArr, this.currentRootSigs[i11]);
        }
        gMSSRootCalc.update(bArrVerify);
        int i14 = 3;
        int i15 = 0;
        int i16 = 1;
        while (true) {
            int i17 = this.heightOfTrees[i11];
            if (i16 >= (1 << i17)) {
                break;
            }
            if (i16 == i14 && i15 < i17 - this.K[i11]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i15);
                i14 *= 2;
                i15++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i11]).getPublicKey());
            i16++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i11) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i11], this.K[i11], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i12 = 3;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.heightOfTrees[i11];
            if (i13 >= (1 << i15)) {
                break;
            }
            if (i13 == i12 && i14 < i15 - this.K[i11]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i14);
                i12 *= 2;
                i14++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i11]).getPublicKey());
            i13++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(null, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom random = keyGenerationParameters.getRandom();
        for (int i11 = 0; i11 < this.numLayer; i11++) {
            random.nextBytes(this.currentSeeds[i11]);
            this.gmssRandom.nextSeed(this.currentSeeds[i11]);
        }
        this.initialized = true;
    }

    public void initialize(int i11, SecureRandom secureRandom) {
        initialize(i11 <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i11 <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }
}
