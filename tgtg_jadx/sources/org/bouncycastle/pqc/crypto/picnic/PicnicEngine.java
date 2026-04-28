package org.bouncycastle.pqc.crypto.picnic;

import i4.a;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.logging.Logger;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.math.raw.Bits;
import org.bouncycastle.pqc.crypto.picnic.Signature;
import org.bouncycastle.pqc.crypto.picnic.Signature2;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class PicnicEngine {
    private static final Logger LOG = Logger.getLogger(PicnicEngine.class.getName());
    protected static final int LOWMC_MAX_AND_GATES = 1144;
    protected static final int LOWMC_MAX_KEY_BITS = 256;
    private static final int LOWMC_MAX_STATE_SIZE = 64;
    protected static final int LOWMC_MAX_WORDS = 16;
    private static final int MAX_AUX_BYTES = 176;
    private static final int MAX_DIGEST_SIZE = 64;
    private static final int PICNIC_MAX_LOWMC_BLOCK_SIZE = 32;
    private static final int TRANSFORM_FS = 0;
    private static final int TRANSFORM_INVALID = 255;
    private static final int TRANSFORM_UR = 1;
    private static final int WORD_SIZE_BITS = 32;
    protected static final int saltSizeBytes = 32;
    private final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    protected final int UnruhGWithInputBytes;
    protected final int UnruhGWithoutInputBytes;
    protected final int andSizeBytes;
    protected final Xof digest;
    protected final int digestSizeBytes;
    protected final LowmcConstants lowmcConstants;
    protected final int numMPCParties;
    protected final int numMPCRounds;
    protected final int numOpenedRounds;
    protected final int numRounds;
    protected final int numSboxes;
    private final int parameters;
    protected final int pqSecurityLevel;
    protected final int seedSizeBytes;
    private int signatureLength;
    protected final int stateSizeBits;
    protected final int stateSizeBytes;
    protected final int stateSizeWords;
    private final int transform;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b7  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PicnicEngine(int r17, org.bouncycastle.pqc.crypto.picnic.LowmcConstants r18) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.<init>(int, org.bouncycastle.pqc.crypto.picnic.LowmcConstants):void");
    }

    private void Commit(byte[] bArr, int i11, View view, byte[] bArr2) {
        this.digest.update((byte) 4);
        this.digest.update(bArr, i11, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update((byte) 0);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.outputShare), 0, this.stateSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
    }

    private void G(int i11, byte[] bArr, int i12, View view, byte[] bArr2) {
        int i13 = this.seedSizeBytes + this.andSizeBytes;
        this.digest.update((byte) 5);
        this.digest.update(bArr, i12, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        if (i11 == 2) {
            this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
            i13 += this.stateSizeBytes;
        }
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(i13), 0, 2);
        this.digest.doFinal(bArr2, 0, i13);
    }

    private void H3(int[] iArr, int[] iArr2, View[][] viewArr, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                Pack.intToLittleEndian(viewArr[i11][i12].outputShare, bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private void HCP(byte[] bArr, int[] iArr, int[] iArr2, byte[][] bArr2, byte[] bArr3, byte[] bArr4, int[] iArr3, int[] iArr4, byte[] bArr5) {
        Xof xof;
        int i11 = 0;
        while (true) {
            int i12 = this.numMPCRounds;
            xof = this.digest;
            if (i11 >= i12) {
                break;
            }
            xof.update(bArr2[i11], 0, this.digestSizeBytes);
            i11++;
        }
        byte[] bArr6 = new byte[32];
        xof.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr4, 0, 32);
        updateDigest(iArr3, bArr6);
        updateDigest(iArr4, bArr6);
        this.digest.update(bArr5, 0, bArr5.length);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
        if (iArr == null || iArr2 == null) {
            return;
        }
        expandChallengeHash(bArr, iArr, iArr2);
    }

    private void LowMCEnc(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        if (iArr != iArr2) {
            System.arraycopy(iArr, 0, iArr2, 0, this.stateSizeWords);
        }
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr2, iArr2, iArr4, 0);
        for (int i11 = 1; i11 <= this.numRounds; i11++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i11);
            matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            substitution(iArr2);
            int i12 = i11 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i12);
            matrix_mul(iArr2, iArr2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i12);
            xor_array(iArr2, iArr2, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            xor_array(iArr2, iArr2, iArr4, 0);
        }
    }

    public static int appendUnique(int[] iArr, int i11, int i12) {
        if (i12 == 0) {
            iArr[i12] = i11;
        } else {
            for (int i13 = 0; i13 < i12; i13++) {
                if (iArr[i13] == i11) {
                    return i12;
                }
            }
            iArr[i12] = i11;
        }
        return i12 + 1;
    }

    private boolean arePaddingBitsZero(byte[] bArr, int i11) {
        int iNumBytes = Utils.numBytes(i11);
        while (i11 < iNumBytes * 8) {
            if (Utils.getBit(bArr, i11) != 0) {
                return false;
            }
            i11++;
        }
        return true;
    }

    private void aux_mpc_AND(int i11, int i12, int i13, Tape tape) {
        int i14 = this.numMPCParties - 1;
        Utils.setBit(tape.tapes[i14], tape.pos - 1, (byte) ((((i11 & i12) ^ (Utils.parity16(tape.tapesToWord()) ^ Utils.getBit(tape.tapes[i14], tape.pos - 1))) ^ i13) & 255));
    }

    public static int bitsToChunks(int i11, byte[] bArr, int i12, int[] iArr) {
        int i13 = i12 * 8;
        if (i11 > i13) {
            return 0;
        }
        int i14 = i13 / i11;
        for (int i15 = 0; i15 < i14; i15++) {
            iArr[i15] = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                iArr[i15] = iArr[i15] + (Utils.getBit(bArr, (i15 * i11) + i16) << i16);
            }
        }
        return i14;
    }

    private void commit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i11, int i12) {
        this.digest.update(bArr2, 0, this.seedSizeBytes);
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, this.andSizeBytes);
        }
        this.digest.update(bArr4, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i11), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_h(byte[] bArr, byte[][] bArr2) {
        int i11 = 0;
        while (true) {
            int i12 = this.numMPCParties;
            Xof xof = this.digest;
            if (i11 >= i12) {
                xof.doFinal(bArr, 0, this.digestSizeBytes);
                return;
            } else {
                xof.update(bArr2[i11], 0, this.digestSizeBytes);
                i11++;
            }
        }
    }

    private void commit_v(byte[] bArr, byte[] bArr2, Msg msg) {
        this.digest.update(bArr2, 0, this.stateSizeBytes);
        for (int i11 = 0; i11 < this.numMPCParties; i11++) {
            this.digest.update(msg.msgs[i11], 0, Utils.numBytes(msg.pos));
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void computeSaltAndRootSeed(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr2, 0, bArr2.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        Pack.shortToLittleEndian((short) this.stateSizeBits, bArr3, 0);
        this.digest.update(bArr3, 0, 2);
        this.digest.doFinal(bArr, 0, bArr.length);
    }

    private byte[] computeSeeds(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr) {
        byte[] bArr2 = new byte[(this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32];
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr, 0, bArr.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        this.digest.update(Pack.intToLittleEndian(this.stateSizeBits), 0, 2);
        this.digest.doFinal(bArr2, 0, (this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32);
        return bArr2;
    }

    private boolean contains(int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    private int countNonZeroChallenges(byte[] bArr, int i11) {
        int i12;
        int i13 = 0;
        int i14 = 0;
        int iBitCount = 0;
        while (true) {
            int i15 = i13 + 16;
            i12 = this.numMPCRounds;
            if (i15 > i12) {
                break;
            }
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i13 >>> 2) + i11);
            int i16 = iLittleEndianToInt >>> 1;
            i14 |= iLittleEndianToInt & i16;
            iBitCount += Integers.bitCount((iLittleEndianToInt ^ i16) & 1431655765);
            i13 = i15;
        }
        int i17 = (i12 - i13) * 2;
        if (i17 > 0) {
            int iLittleEndianToInt_Low = Pack.littleEndianToInt_Low(bArr, i11 + (i13 >>> 2), (i17 + 7) / 8) & Utils.getTrailingBitsMask(i17);
            int i18 = iLittleEndianToInt_Low >>> 1;
            i14 |= iLittleEndianToInt_Low & i18;
            iBitCount += Integers.bitCount((iLittleEndianToInt_Low ^ i18) & 1431655765);
        }
        if ((i14 & 1431655765) == 0) {
            return iBitCount;
        }
        return -1;
    }

    private boolean createRandomTape(byte[] bArr, int i11, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        if (i14 < this.digestSizeBytes) {
            return false;
        }
        this.digest.update((byte) 2);
        this.digest.update(bArr, i11, this.seedSizeBytes);
        this.digest.doFinal(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i13), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i14), 0, 2);
        this.digest.doFinal(bArr3, 0, i14);
        return true;
    }

    private void createRandomTapes(Tape tape, byte[][] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.andSizeBytes * 2;
        for (int i14 = 0; i14 < this.numMPCParties; i14++) {
            this.digest.update(bArr[i14 + i11], 0, this.seedSizeBytes);
            this.digest.update(bArr2, 0, 32);
            this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
            this.digest.update(Pack.intToLittleEndian(i14), 0, 2);
            this.digest.doFinal(tape.tapes[i14], 0, i13);
        }
    }

    private int deserializeSignature(Signature signature, byte[] bArr, int i11, int i12) {
        int iCountNonZeroChallenges;
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2);
        if (i11 < iNumBytes || (iCountNonZeroChallenges = countNonZeroChallenges(bArr, i12)) < 0) {
            return -1;
        }
        int i13 = this.stateSizeBytes * iCountNonZeroChallenges;
        int i14 = this.numMPCRounds;
        int i15 = (((this.seedSizeBytes * 2) + this.andSizeBytes + this.digestSizeBytes) * i14) + iNumBytes + 32 + i13;
        if (this.transform == 1) {
            i15 = (this.UnruhGWithoutInputBytes * iCountNonZeroChallenges) + ((i14 - iCountNonZeroChallenges) * this.UnruhGWithInputBytes) + i15;
        }
        if (i11 != i15) {
            LOG.fine("sigBytesLen = " + i11 + ", expected bytesRequired = " + i15);
            return -1;
        }
        System.arraycopy(bArr, i12, bArr2, 0, iNumBytes);
        int i16 = i12 + iNumBytes;
        System.arraycopy(bArr, i16, signature.salt, 0, 32);
        int i17 = i16 + 32;
        for (int i18 = 0; i18 < this.numMPCRounds; i18++) {
            int challenge = getChallenge(bArr2, i18);
            System.arraycopy(bArr, i17, proofArr[i18].view3Commitment, 0, this.digestSizeBytes);
            int i19 = i17 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i21 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(bArr, i19, proofArr[i18].view3UnruhG, 0, i21);
                i19 += i21;
            }
            System.arraycopy(bArr, i19, proofArr[i18].communicatedBits, 0, this.andSizeBytes);
            int i22 = i19 + this.andSizeBytes;
            System.arraycopy(bArr, i22, proofArr[i18].seed1, 0, this.seedSizeBytes);
            int i23 = this.seedSizeBytes;
            int i24 = i22 + i23;
            System.arraycopy(bArr, i24, proofArr[i18].seed2, 0, i23);
            i17 = i24 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.littleEndianToInt(bArr, i17, proofArr[i18].inputShare, 0, this.stateSizeBytes / 4);
                int i25 = this.stateSizeBits;
                if (i25 == 129) {
                    proofArr[i18].inputShare[this.stateSizeWords - 1] = bArr[(this.stateSizeBytes + i17) - 1] & 255;
                }
                i17 += this.stateSizeBytes;
                if (!arePaddingBitsZero(proofArr[i18].inputShare, i25)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private int deserializeSignature2(Signature2 signature2, byte[] bArr, int i11, int i12) {
        Logger logger;
        String str;
        int i13 = this.digestSizeBytes;
        int i14 = i13 + 32;
        if (bArr.length < i14) {
            return -1;
        }
        System.arraycopy(bArr, i12, signature2.challengeHash, 0, i13);
        int i15 = i12 + this.digestSizeBytes;
        System.arraycopy(bArr, i15, signature2.salt, 0, 32);
        int i16 = i15 + 32;
        expandChallengeHash(signature2.challengeHash, signature2.challengeC, signature2.challengeP);
        int iRevealSeedsSize = new Tree(this, this.numMPCRounds, this.seedSizeBytes).revealSeedsSize(signature2.challengeC, this.numOpenedRounds);
        signature2.iSeedInfoLen = iRevealSeedsSize;
        int i17 = i14 + iRevealSeedsSize;
        int iOpenMerkleTreeSize = new Tree(this, this.numMPCRounds, this.digestSizeBytes).openMerkleTreeSize(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds);
        signature2.cvInfoLen = iOpenMerkleTreeSize;
        int i18 = i17 + iOpenMerkleTreeSize;
        int iRevealSeedsSize2 = new Tree(this, this.numMPCParties, this.seedSizeBytes).revealSeedsSize(new int[1], 1);
        for (int i19 = 0; i19 < this.numMPCRounds; i19++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i19)) {
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i19)] != this.numMPCParties - 1) {
                    i18 += this.andSizeBytes;
                }
                i18 = i18 + iRevealSeedsSize2 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (i11 == i18) {
            int i21 = signature2.iSeedInfoLen;
            byte[] bArr2 = new byte[i21];
            signature2.iSeedInfo = bArr2;
            System.arraycopy(bArr, i16, bArr2, 0, i21);
            int i22 = i16 + signature2.iSeedInfoLen;
            int i23 = signature2.cvInfoLen;
            byte[] bArr3 = new byte[i23];
            signature2.cvInfo = bArr3;
            System.arraycopy(bArr, i22, bArr3, 0, i23);
            int i24 = i22 + signature2.cvInfoLen;
            for (int i25 = 0; i25 < this.numMPCRounds; i25++) {
                if (contains(signature2.challengeC, this.numOpenedRounds, i25)) {
                    signature2.proofs[i25] = new Signature2.Proof2(this);
                    Signature2.Proof2 proof2 = signature2.proofs[i25];
                    proof2.seedInfoLen = iRevealSeedsSize2;
                    byte[] bArr4 = new byte[iRevealSeedsSize2];
                    proof2.seedInfo = bArr4;
                    System.arraycopy(bArr, i24, bArr4, 0, iRevealSeedsSize2);
                    int i26 = i24 + signature2.proofs[i25].seedInfoLen;
                    if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i25)] != this.numMPCParties - 1) {
                        System.arraycopy(bArr, i26, signature2.proofs[i25].aux, 0, this.andSizeBytes);
                        i26 += this.andSizeBytes;
                        if (!arePaddingBitsZero(signature2.proofs[i25].aux, this.numRounds * 3 * this.numSboxes)) {
                            logger = LOG;
                            str = "failed while deserializing aux bits";
                        }
                    }
                    System.arraycopy(bArr, i26, signature2.proofs[i25].input, 0, this.stateSizeBytes);
                    int i27 = i26 + this.stateSizeBytes;
                    int i28 = this.andSizeBytes;
                    System.arraycopy(bArr, i27, signature2.proofs[i25].msgs, 0, i28);
                    int i29 = i27 + i28;
                    if (arePaddingBitsZero(signature2.proofs[i25].msgs, this.numRounds * 3 * this.numSboxes)) {
                        System.arraycopy(bArr, i29, signature2.proofs[i25].C, 0, this.digestSizeBytes);
                        i24 = i29 + this.digestSizeBytes;
                    } else {
                        logger = LOG;
                        str = "failed while deserializing msgs bits";
                    }
                }
            }
            return 0;
        }
        logger = LOG;
        str = "sigLen = " + i11 + ", expected bytesRequired = " + i18;
        logger.fine(str);
        return -1;
    }

    private void expandChallengeHash(byte[] bArr, int[] iArr, int[] iArr2) {
        int iCeil_log2 = Utils.ceil_log2(this.numMPCRounds);
        int iCeil_log22 = Utils.ceil_log2(this.numMPCParties);
        int[] iArr3 = new int[(this.digestSizeBytes * 8) / Math.min(iCeil_log2, iCeil_log22)];
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, this.digestSizeBytes);
        int iAppendUnique = 0;
        while (iAppendUnique < this.numOpenedRounds) {
            int iBitsToChunks = bitsToChunks(iCeil_log2, bArr2, this.digestSizeBytes, iArr3);
            for (int i11 = 0; i11 < iBitsToChunks; i11++) {
                int i12 = iArr3[i11];
                if (i12 < this.numMPCRounds) {
                    iAppendUnique = appendUnique(iArr, i12, iAppendUnique);
                }
                if (iAppendUnique == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
        int i13 = 0;
        while (i13 < this.numOpenedRounds) {
            int iBitsToChunks2 = bitsToChunks(iCeil_log22, bArr2, this.digestSizeBytes, iArr3);
            for (int i14 = 0; i14 < iBitsToChunks2; i14++) {
                int i15 = iArr3[i14];
                if (i15 < this.numMPCParties) {
                    iArr2[i13] = i15;
                    i13++;
                }
                if (i13 == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
    }

    public static int extend(int i11) {
        return ~(i11 - 1);
    }

    private void getAuxBits(byte[] bArr, Tape tape) {
        byte[] bArr2 = tape.tapes[this.numMPCParties - 1];
        int i11 = this.stateSizeBits;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < this.numRounds; i14++) {
            i12 += i11;
            int i15 = 0;
            while (i15 < i11) {
                Utils.setBit(bArr, i13, Utils.getBit(bArr2, i12));
                i15++;
                i13++;
                i12++;
            }
        }
    }

    private int[] getMissingLeavesList(int[] iArr) {
        int[] iArr2 = new int[this.numMPCRounds - this.numOpenedRounds];
        int i11 = 0;
        for (int i12 = 0; i12 < this.numMPCRounds; i12++) {
            if (!contains(iArr, this.numOpenedRounds, i12)) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    private void implH3(int[] iArr, int[] iArr2, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        byte[] bArr6 = new byte[this.digestSizeBytes];
        bArr2[Utils.numBytes(this.numMPCRounds * 2) - 1] = 0;
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                this.digest.update(bArr[i11][i12], 0, this.digestSizeBytes);
            }
        }
        if (this.transform == 1) {
            for (int i13 = 0; i13 < this.numMPCRounds; i13++) {
                int i14 = 0;
                while (i14 < 3) {
                    this.digest.update(bArr5[i13][i14], 0, i14 == 2 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
                    i14++;
                }
            }
        }
        this.digest.update(Pack.intToLittleEndian(iArr), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr2), 0, this.stateSizeBytes);
        this.digest.update(bArr3, 0, 32);
        this.digest.update(bArr4, 0, bArr4.length);
        this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        boolean z11 = true;
        int i15 = 0;
        while (z11) {
            for (int i16 = 0; i16 < this.digestSizeBytes; i16++) {
                byte b8 = bArr6[i16];
                int i17 = 0;
                while (true) {
                    if (i17 >= 8) {
                        break;
                    }
                    int i18 = (b8 >>> (6 - i17)) & 3;
                    if (i18 < 3) {
                        setChallenge(bArr2, i15, i18);
                        i15++;
                        if (i15 == this.numMPCRounds) {
                            z11 = false;
                            break;
                        }
                    }
                    i17 += 2;
                }
                if (!z11) {
                    break;
                }
            }
            if (!z11) {
                return;
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr6, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        }
    }

    public static int indexOf(int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return i13;
            }
        }
        return -1;
    }

    public static boolean is_picnic3(int i11) {
        return i11 == 7 || i11 == 8 || i11 == 9;
    }

    private void mpc_AND(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View[] viewArr) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        byte bit3 = Utils.getBit(tape.tapes[2], tape.pos);
        int i11 = iArr[0];
        int i12 = iArr2[1];
        int i13 = iArr[1];
        int i14 = iArr2[0];
        int i15 = (((i11 & i14) ^ ((i11 & i12) ^ (i13 & i14))) ^ bit) ^ bit2;
        iArr3[0] = i15;
        int i16 = iArr2[2];
        int i17 = iArr[2];
        iArr3[1] = (bit2 ^ ((i12 & i13) ^ ((i13 & i16) ^ (i17 & i12)))) ^ bit3;
        iArr3[2] = ((((iArr[0] & i16) ^ (iArr2[0] & i17)) ^ (i17 & i16)) ^ bit3) ^ bit;
        Utils.setBit(viewArr[0].communicatedBits, tape.pos, (byte) i15);
        Utils.setBit(viewArr[1].communicatedBits, tape.pos, (byte) iArr3[1]);
        Utils.setBit(viewArr[2].communicatedBits, tape.pos, (byte) iArr3[2]);
        tape.pos++;
    }

    private void mpc_LowMC(Tape tape, View[] viewArr, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i11 = this.stateSizeWords;
        mpc_xor_constant(iArr2, i11 * 3, iArr, 0, i11);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        for (int i12 = 0; i12 < 3; i12++) {
            matrix_mul_offset(iArr2, i12 * this.stateSizeWords, viewArr[i12].inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        }
        int[] iArr3 = iArr2;
        mpc_xor(iArr3, iArr3, 3);
        for (int i13 = 1; i13 <= this.numRounds; i13++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i13);
            for (int i14 = 0; i14 < 3; i14++) {
                matrix_mul_offset(iArr3, this.stateSizeWords * i14, viewArr[i14].inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            }
            mpc_substitution(iArr3, tape, viewArr);
            int i15 = i13 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i15);
            int i16 = this.stateSizeWords;
            mpc_matrix_mul(iArr3, i16 * 3, iArr2, i16 * 3, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 3);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i15);
            iArr3 = iArr2;
            mpc_xor_constant(iArr3, this.stateSizeWords * 3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords);
            mpc_xor(iArr3, iArr3, 3);
        }
        for (int i17 = 0; i17 < 3; i17++) {
            int i18 = this.stateSizeWords;
            System.arraycopy(iArr3, (i17 + 3) * i18, viewArr[i17].outputShare, 0, i18);
        }
    }

    private void mpc_matrix_mul(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = this.stateSizeWords;
            matrix_mul_offset(iArr, (i15 * i16) + i11, iArr2, (i16 * i15) + i12, iArr3, i13);
        }
    }

    private void mpc_sbox(int[] iArr, int[] iArr2, Tape tape, Msg msg) {
        for (int i11 = 0; i11 < this.numSboxes * 3; i11 += 3) {
            int i12 = i11 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i12);
            int i13 = iArr2[i12];
            int i14 = i11 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i14);
            int i15 = iArr2[i14];
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i11);
            int i16 = iArr2[i11];
            int iMpc_AND = mpc_AND(bitFromWordArray, bitFromWordArray2, i13, i15, tape, msg);
            int iMpc_AND2 = mpc_AND(bitFromWordArray2, bitFromWordArray3, i15, i16, tape, msg);
            int iMpc_AND3 = mpc_AND(bitFromWordArray3, bitFromWordArray, i16, i13, tape, msg);
            int i17 = bitFromWordArray ^ iMpc_AND2;
            int i18 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i12, i17);
            Utils.setBitInWordArray(iArr, i14, iMpc_AND3 ^ i18);
            Utils.setBitInWordArray(iArr, i11, (i18 ^ bitFromWordArray3) ^ iMpc_AND);
        }
    }

    private void mpc_substitution(int[] iArr, Tape tape, View[] viewArr) {
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int[] iArr4 = new int[3];
        int[] iArr5 = new int[3];
        int[] iArr6 = new int[3];
        int[] iArr7 = new int[3];
        int i11 = 0;
        while (i11 < this.numSboxes * 3) {
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = ((i12 + 3) * this.stateSizeWords * 32) + i11;
                iArr2[i12] = Utils.getBitFromWordArray(iArr, i13 + 2);
                iArr3[i12] = Utils.getBitFromWordArray(iArr, i13 + 1);
                iArr4[i12] = Utils.getBitFromWordArray(iArr, i13);
            }
            mpc_AND(iArr2, iArr3, iArr5, tape, viewArr);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND(iArr10, iArr8, iArr11, tape, viewArr);
            int[] iArr13 = iArr7;
            mpc_AND(iArr8, iArr9, iArr13, tape, viewArr);
            iArr2 = iArr9;
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = ((i14 + 3) * this.stateSizeWords * 32) + i11;
                Utils.setBitInWordArray(iArr, i15 + 2, iArr2[i14] ^ iArr11[i14]);
                Utils.setBitInWordArray(iArr, i15 + 1, (iArr2[i14] ^ iArr10[i14]) ^ iArr13[i14]);
                Utils.setBitInWordArray(iArr, i15, ((iArr2[i14] ^ iArr10[i14]) ^ iArr8[i14]) ^ iArr12[i14]);
            }
            i11 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    private void mpc_xor(int[] iArr, int[] iArr2, int i11) {
        int i12 = this.stateSizeWords * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (this.stateSizeWords * i11) + i13;
            iArr[i14] = iArr[i14] ^ iArr2[i13];
        }
    }

    private void mpc_xor_constant(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 + i11;
            iArr[i15] = iArr[i15] ^ iArr2[i14 + i12];
        }
    }

    private void mpc_xor_constant_verify(int[] iArr, int[] iArr2, int i11, int i12, int i13) {
        int i14;
        if (i13 == 0) {
            i14 = this.stateSizeWords * 2;
        } else if (i13 != 2) {
            return;
        } else {
            i14 = this.stateSizeWords * 3;
        }
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i15 + i14;
            iArr[i16] = iArr[i16] ^ iArr2[i15 + i11];
        }
    }

    private void picnic_keygen(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int[] iArr = new int[bArr3.length / 4];
        int[] iArr2 = new int[bArr.length / 4];
        int[] iArr3 = new int[bArr2.length / 4];
        secureRandom.nextBytes(bArr3);
        Pack.littleEndianToInt(bArr3, 0, iArr);
        Utils.zeroTrailingBits(iArr, this.stateSizeBits);
        secureRandom.nextBytes(bArr);
        Pack.littleEndianToInt(bArr, 0, iArr2);
        Utils.zeroTrailingBits(iArr2, this.stateSizeBits);
        LowMCEnc(iArr2, iArr3, iArr);
        Pack.intToLittleEndian(iArr, bArr3, 0);
        Pack.intToLittleEndian(iArr2, bArr, 0);
        Pack.intToLittleEndian(iArr3, bArr2, 0);
    }

    private void picnic_read_public_key(int[] iArr, int[] iArr2, byte[] bArr) {
        int i11 = this.stateSizeBytes;
        int i12 = i11 + 1;
        int i13 = i11 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i13);
        Pack.littleEndianToInt(bArr, i12, iArr2, 0, i13);
        if (i13 < this.stateSizeWords) {
            int i14 = i13 * 4;
            int i15 = this.stateSizeBytes - i14;
            iArr[i13] = Pack.littleEndianToInt_Low(bArr, i14 + 1, i15);
            iArr2[i13] = Pack.littleEndianToInt_Low(bArr, i12 + i14, i15);
        }
    }

    private boolean picnic_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PicnicEngine picnicEngine;
        int iSerializeSignature2;
        int i11 = this.stateSizeWords;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = this.stateSizeBytes;
        int i13 = i12 + 1;
        int i14 = (i12 * 2) + 1;
        int i15 = i12 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i15);
        Pack.littleEndianToInt(bArr, i13, iArr2, 0, i15);
        Pack.littleEndianToInt(bArr, i14, iArr3, 0, i15);
        if (i15 < this.stateSizeWords) {
            int i16 = i15 * 4;
            int i17 = this.stateSizeBytes - i16;
            iArr[i15] = Pack.littleEndianToInt_Low(bArr, i16 + 1, i17);
            iArr2[i15] = Pack.littleEndianToInt_Low(bArr, i13 + i16, i17);
            iArr3[i15] = Pack.littleEndianToInt_Low(bArr, i14 + i16, i17);
        }
        if (is_picnic3(this.parameters)) {
            picnicEngine = this;
            Signature2 signature2 = new Signature2(this);
            if (!picnicEngine.sign_picnic3(iArr, iArr2, iArr3, bArr2, signature2)) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature2(signature2, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        } else {
            Signature signature = new Signature(this);
            picnicEngine = this;
            if (picnicEngine.sign_picnic1(iArr, iArr2, iArr3, bArr2, signature) != 0) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature(signature, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        }
        picnicEngine.signatureLength = iSerializeSignature2;
        Pack.intToLittleEndian(iSerializeSignature2, bArr3, 0);
        return true;
    }

    private int picnic_verify(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        Logger logger;
        String str;
        int i12 = this.stateSizeWords;
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        picnic_read_public_key(iArr, iArr2, bArr);
        if (is_picnic3(this.parameters)) {
            Signature2 signature2 = new Signature2(this);
            if (deserializeSignature2(signature2, bArr3, i11, bArr2.length + 4) == 0) {
                return verify_picnic3(signature2, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature (2)!";
        } else {
            Signature signature = new Signature(this);
            if (deserializeSignature(signature, bArr3, i11, bArr2.length + 4) == 0) {
                return verify(signature, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature!";
        }
        logger.fine(str);
        return -1;
    }

    private int picnic_write_private_key(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i11 = this.stateSizeBytes;
        int i12 = (i11 * 3) + 1;
        if (bArr4.length < i12) {
            LOG.fine("Failed writing private key!");
            return -1;
        }
        bArr4[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr4, 1, i11);
        int i13 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr4, i13 + 1, i13);
        int i14 = this.stateSizeBytes;
        System.arraycopy(bArr3, 0, bArr4, (i14 * 2) + 1, i14);
        return i12;
    }

    private int picnic_write_public_key(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.stateSizeBytes;
        int i12 = (i11 * 2) + 1;
        if (bArr3.length < i12) {
            LOG.fine("Failed writing public key!");
            return -1;
        }
        bArr3[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr3, 1, i11);
        int i13 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr3, i13 + 1, i13);
        return i12;
    }

    private int serializeSignature2(Signature2 signature2, byte[] bArr, int i11) {
        int i12 = this.digestSizeBytes + 32 + signature2.iSeedInfoLen + signature2.cvInfoLen;
        for (int i13 = 0; i13 < this.numMPCRounds; i13++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i13)) {
                int i14 = signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i13)];
                int i15 = i12 + signature2.proofs[i13].seedInfoLen;
                if (i14 != this.numMPCParties - 1) {
                    i15 += this.andSizeBytes;
                }
                i12 = i15 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (bArr.length < i12) {
            return -1;
        }
        System.arraycopy(signature2.challengeHash, 0, bArr, i11, this.digestSizeBytes);
        int i16 = this.digestSizeBytes + i11;
        System.arraycopy(signature2.salt, 0, bArr, i16, 32);
        int i17 = i16 + 32;
        System.arraycopy(signature2.iSeedInfo, 0, bArr, i17, signature2.iSeedInfoLen);
        int i18 = i17 + signature2.iSeedInfoLen;
        System.arraycopy(signature2.cvInfo, 0, bArr, i18, signature2.cvInfoLen);
        int i19 = i18 + signature2.cvInfoLen;
        for (int i21 = 0; i21 < this.numMPCRounds; i21++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i21)) {
                Signature2.Proof2 proof2 = signature2.proofs[i21];
                System.arraycopy(proof2.seedInfo, 0, bArr, i19, proof2.seedInfoLen);
                int i22 = i19 + signature2.proofs[i21].seedInfoLen;
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i21)] != this.numMPCParties - 1) {
                    System.arraycopy(signature2.proofs[i21].aux, 0, bArr, i22, this.andSizeBytes);
                    i22 += this.andSizeBytes;
                }
                System.arraycopy(signature2.proofs[i21].input, 0, bArr, i22, this.stateSizeBytes);
                int i23 = i22 + this.stateSizeBytes;
                System.arraycopy(signature2.proofs[i21].msgs, 0, bArr, i23, this.andSizeBytes);
                int i24 = i23 + this.andSizeBytes;
                System.arraycopy(signature2.proofs[i21].C, 0, bArr, i24, this.digestSizeBytes);
                i19 = i24 + this.digestSizeBytes;
            }
        }
        return i19 - i11;
    }

    private void setChallenge(byte[] bArr, int i11, int i12) {
        int i13 = i11 * 2;
        Utils.setBit(bArr, i13, (byte) (i12 & 1));
        Utils.setBit(bArr, i13 + 1, (byte) ((i12 >>> 1) & 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00df, code lost:
    
        r18 = r3;
        r11 = r6;
        r19 = r8;
        r8 = r1;
        r1 = r2;
        r3 = r15 * r4;
        r22 = r12;
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0101, code lost:
    
        if (r0.createRandomTape(r1, (r7 * 2) + r3, r29.salt, r4, 2, r8.tapes[r19], r0.andSizeBytes) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0103, code lost:
    
        org.bouncycastle.pqc.crypto.picnic.PicnicEngine.LOG.fine("createRandomTape failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0109, code lost:
    
        r2 = r22[r6];
        r0.xor_three(r2[r19].inputShare, r25, r2[0].inputShare, r2[r16].inputShare);
        r8.pos = 0;
        r2 = org.bouncycastle.util.Pack.littleEndianToInt(r11, 0, r18 / 4);
        r0.mpc_LowMC(r8, r22[r6], r27, r2);
        org.bouncycastle.util.Pack.intToLittleEndian(r2, r11, 0);
        r2 = new int[16];
        r3 = r22[r6];
        r0.xor_three(r2, r3[0].outputShare, r3[r16].outputShare, r3[r19].outputShare);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014c, code lost:
    
        if (subarrayEquals(r2, r26, r0.stateSizeWords) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014e, code lost:
    
        org.bouncycastle.pqc.crypto.picnic.PicnicEngine.LOG.fine("Simulation failed; output does not match public key (round = " + r6 + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0166, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0167, code lost:
    
        r0.Commit(r1, r3, r22[r6][0], r13[r6][0]);
        r0.Commit(r1, r3 + r0.seedSizeBytes, r22[r6][r16], r13[r6][r16]);
        r0.Commit(r1, (r0.seedSizeBytes * 2) + r3, r22[r6][r19], r13[r6][r19]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0197, code lost:
    
        if (r0.transform != r16) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0199, code lost:
    
        r0.G(0, r1, r3, r22[r6][0], r14[r6][0]);
        r0.G(1, r1, r3 + r0.seedSizeBytes, r22[r6][r16], r14[r6][r16]);
        r0.G(2, r1, (r0.seedSizeBytes * 2) + r3, r22[r6][r19], r14[r6][r19]);
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01d4, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01d5, code lost:
    
        r4 = r6 + 1;
        r0 = r24;
        r1 = r8;
        r6 = r11;
        r2 = r12;
        r3 = r18;
        r8 = r19;
        r12 = r22;
        r10 = 1;
        r11 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int sign_picnic1(int[] r25, int[] r26, int[] r27, byte[] r28, org.bouncycastle.pqc.crypto.picnic.Signature r29) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.sign_picnic1(int[], int[], int[], byte[], org.bouncycastle.pqc.crypto.picnic.Signature):int");
    }

    private boolean sign_picnic3(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature2 signature2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.seedSizeBytes + 32;
        byte[] bArr2 = new byte[i16];
        computeSaltAndRootSeed(bArr2, iArr, iArr2, iArr3, bArr);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, i16);
        signature2.salt = Arrays.copyOfRange(bArr2, 0, 32);
        Tree tree = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
        tree.generateSeeds(bArrCopyOfRange, signature2.salt, 0);
        byte[][] leaves = tree.getLeaves();
        int leavesOffset = tree.getLeavesOffset();
        int i17 = this.numMPCRounds;
        Tape[] tapeArr = new Tape[i17];
        Tree[] treeArr = new Tree[i17];
        int i18 = 0;
        while (true) {
            i11 = this.numMPCRounds;
            if (i18 >= i11) {
                break;
            }
            tapeArr[i18] = new Tape(this);
            Tree tree2 = new Tree(this, this.numMPCParties, this.seedSizeBytes);
            treeArr[i18] = tree2;
            tree2.generateSeeds(leaves[i18 + leavesOffset], signature2.salt, i18);
            createRandomTapes(tapeArr[i18], treeArr[i18].getLeaves(), treeArr[i18].getLeavesOffset(), signature2.salt, i18);
            i18++;
        }
        int[] iArr4 = {i11, this.stateSizeWords * 4};
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[] bArr4 = new byte[MAX_AUX_BYTES];
        int i19 = 0;
        while (true) {
            i12 = this.numMPCRounds;
            if (i19 >= i12) {
                break;
            }
            tapeArr[i19].computeAuxTape(bArr3[i19]);
            i19++;
        }
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, i12, this.numMPCParties, this.digestSizeBytes);
        int i21 = 0;
        while (true) {
            i13 = this.numMPCRounds;
            if (i21 >= i13) {
                break;
            }
            int i22 = 0;
            while (true) {
                i15 = this.numMPCParties;
                if (i22 < i15 - 1) {
                    commit(bArr5[i21][i22], treeArr[i21].getLeaf(i22), null, signature2.salt, i21, i22);
                    i22++;
                }
            }
            int i23 = i15 - 1;
            getAuxBits(bArr4, tapeArr[i21]);
            commit(bArr5[i21][i23], treeArr[i21].getLeaf(i23), bArr4, signature2.salt, i21, i23);
            i21++;
        }
        Msg[] msgArr = new Msg[i13];
        int[] iArr5 = new int[this.stateSizeBits];
        int i24 = 0;
        while (true) {
            int i25 = this.numMPCRounds;
            if (i24 >= i25) {
                byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) cls, i25, this.digestSizeBytes);
                byte[][] bArr7 = (byte[][]) Array.newInstance((Class<?>) cls, this.numMPCRounds, this.digestSizeBytes);
                for (int i26 = 0; i26 < this.numMPCRounds; i26++) {
                    commit_h(bArr6[i26], bArr5[i26]);
                    commit_v(bArr7[i26], bArr3[i26], msgArr[i26]);
                }
                Tree tree3 = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
                tree3.buildMerkleTree(bArr7, signature2.salt);
                int i27 = this.numOpenedRounds;
                int[] iArr6 = new int[i27];
                signature2.challengeC = iArr6;
                int[] iArr7 = new int[i27];
                signature2.challengeP = iArr7;
                byte[] bArr8 = new byte[this.digestSizeBytes];
                signature2.challengeHash = bArr8;
                int i28 = 0;
                HCP(bArr8, iArr6, iArr7, bArr6, tree3.nodes[0], signature2.salt, iArr2, iArr3, bArr);
                int[] iArr8 = new int[1];
                signature2.cvInfo = tree3.openMerkleTree(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds, iArr8);
                signature2.cvInfoLen = iArr8[0];
                int i29 = this.numMPCRounds;
                int i31 = this.seedSizeBytes;
                byte[] bArr9 = new byte[i29 * i31];
                signature2.iSeedInfo = bArr9;
                signature2.iSeedInfoLen = tree.revealSeeds(signature2.challengeC, this.numOpenedRounds, bArr9, i29 * i31);
                signature2.proofs = new Signature2.Proof2[this.numMPCRounds];
                int i32 = 0;
                while (i32 < this.numMPCRounds) {
                    if (contains(signature2.challengeC, this.numOpenedRounds, i32)) {
                        signature2.proofs[i32] = new Signature2.Proof2(this);
                        int iIndexOf = indexOf(signature2.challengeC, this.numOpenedRounds, i32);
                        int[] iArr9 = {signature2.challengeP[iIndexOf]};
                        Signature2.Proof2 proof2 = signature2.proofs[i32];
                        int i33 = this.numMPCParties;
                        int i34 = this.seedSizeBytes;
                        byte[] bArr10 = new byte[i33 * i34];
                        proof2.seedInfo = bArr10;
                        proof2.seedInfoLen = treeArr[i32].revealSeeds(iArr9, 1, bArr10, i33 * i34);
                        if (signature2.challengeP[iIndexOf] != this.numMPCParties - 1) {
                            getAuxBits(signature2.proofs[i32].aux, tapeArr[i32]);
                        }
                        i14 = i28;
                        System.arraycopy(bArr3[i32], i14, signature2.proofs[i32].input, i14, this.stateSizeBytes);
                        System.arraycopy(msgArr[i32].msgs[signature2.challengeP[iIndexOf]], i14, signature2.proofs[i32].msgs, i14, this.andSizeBytes);
                        System.arraycopy(bArr5[i32][signature2.challengeP[iIndexOf]], i14, signature2.proofs[i32].C, i14, this.digestSizeBytes);
                    } else {
                        i14 = i28;
                    }
                    i32++;
                    i28 = i14;
                }
                return true;
            }
            msgArr[i24] = new Msg(this);
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr3[i24], 0, this.stateSizeWords);
            xor_array(iArrLittleEndianToInt, iArrLittleEndianToInt, iArr, 0);
            int i35 = i24;
            if (simulateOnline(iArrLittleEndianToInt, tapeArr[i35], iArr5, msgArr[i35], iArr3, iArr2) != 0) {
                LOG.fine("MPC simulation failed, aborting signature");
                return false;
            }
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr3[i35], 0);
            i24 = i35 + 1;
        }
    }

    private int simulateOnline(int[] iArr, Tape tape, int[] iArr2, Msg msg, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr6, iArr5, iArr3, 0);
        for (int i11 = 1; i11 <= this.numRounds; i11++) {
            tapesToWords(iArr2, tape);
            mpc_sbox(iArr6, iArr2, tape, msg);
            int i12 = i11 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i12);
            matrix_mul(iArr6, iArr6, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i12);
            xor_array(iArr6, iArr6, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i11);
            matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            xor_array(iArr6, iArr5, iArr6, 0);
        }
        return !subarrayEquals(iArr6, iArr4, this.stateSizeWords) ? -1 : 0;
    }

    private static boolean subarrayEquals(byte[] bArr, byte[] bArr2, int i11) {
        if (bArr.length < i11 || bArr2.length < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    private void substitution(int[] iArr) {
        for (int i11 = 0; i11 < this.numSboxes * 3; i11 += 3) {
            int i12 = i11 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i12);
            int i13 = i11 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i13);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i11);
            Utils.setBitInWordArray(iArr, i12, (bitFromWordArray2 & bitFromWordArray3) ^ bitFromWordArray);
            int i14 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i13, (bitFromWordArray & bitFromWordArray3) ^ i14);
            Utils.setBitInWordArray(iArr, i11, (i14 ^ bitFromWordArray3) ^ (bitFromWordArray & bitFromWordArray2));
        }
    }

    private void tapesToWords(int[] iArr, Tape tape) {
        for (int i11 = 0; i11 < this.stateSizeBits; i11++) {
            iArr[i11] = tape.tapesToWord();
        }
    }

    private void updateDigest(int[] iArr, byte[] bArr) {
        Pack.intToLittleEndian(iArr, bArr, 0);
        this.digest.update(bArr, 0, this.stateSizeBytes);
    }

    private int verify(Signature signature, int[] iArr, int[] iArr2, byte[] bArr) {
        String str;
        int i11;
        int i12;
        PicnicEngine picnicEngine = this;
        char c3 = 3;
        char c7 = 2;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        int[][][] iArr4 = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, picnicEngine.numMPCRounds, 3, picnicEngine.stateSizeBytes);
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr4 = signature.challengeBits;
        int i13 = picnicEngine.stateSizeBytes;
        byte[] bArr5 = new byte[Math.max(i13 * 6, i13 + picnicEngine.andSizeBytes)];
        Tape tape = new Tape(picnicEngine);
        int i14 = picnicEngine.numMPCRounds;
        View[] viewArr = new View[i14];
        View[] viewArr2 = new View[i14];
        int i15 = 0;
        while (true) {
            int i16 = picnicEngine.numMPCRounds;
            if (i15 < i16) {
                viewArr[i15] = new View(picnicEngine);
                View[] viewArr3 = viewArr2;
                View view = new View(picnicEngine);
                viewArr3[i15] = view;
                Signature.Proof[] proofArr2 = proofArr;
                View[] viewArr4 = viewArr;
                char c8 = c3;
                byte[] bArr6 = bArr4;
                char c11 = c7;
                str = "Invalid signature. Did not verify";
                if (!picnicEngine.verifyProof(proofArr2[i15], viewArr[i15], view, picnicEngine.getChallenge(bArr4, i15), signature.salt, i15, bArr5, iArr2, tape)) {
                    break;
                }
                int challenge = picnicEngine.getChallenge(bArr6, i15);
                picnicEngine.Commit(proofArr2[i15].seed1, 0, viewArr4[i15], bArr2[i15][challenge]);
                int i17 = (challenge + 1) % 3;
                picnicEngine.Commit(proofArr2[i15].seed2, 0, viewArr3[i15], bArr2[i15][i17]);
                int i18 = (challenge + 2) % 3;
                System.arraycopy(proofArr2[i15].view3Commitment, 0, bArr2[i15][i18], 0, picnicEngine.digestSizeBytes);
                if (picnicEngine.transform == 1) {
                    picnicEngine.G(challenge, proofArr2[i15].seed1, 0, viewArr4[i15], bArr3[i15][challenge]);
                    i11 = challenge;
                    picnicEngine = this;
                    i12 = i17;
                    picnicEngine.G(i12, proofArr2[i15].seed2, 0, viewArr3[i15], bArr3[i15][i17]);
                    System.arraycopy(proofArr2[i15].view3UnruhG, 0, bArr3[i15][i18], 0, i11 == 0 ? picnicEngine.UnruhGWithInputBytes : picnicEngine.UnruhGWithoutInputBytes);
                } else {
                    i11 = challenge;
                    i12 = i17;
                }
                iArr4[i15][i11] = viewArr4[i15].outputShare;
                iArr4[i15][i12] = viewArr3[i15].outputShare;
                int[] iArr5 = new int[picnicEngine.stateSizeWords];
                picnicEngine.xor_three(iArr5, viewArr4[i15].outputShare, viewArr3[i15].outputShare, iArr);
                iArr4[i15][i18] = iArr5;
                i15++;
                bArr4 = bArr6;
                proofArr = proofArr2;
                c3 = c8;
                viewArr = viewArr4;
                viewArr2 = viewArr3;
                c7 = c11;
            } else {
                str = "Invalid signature. Did not verify";
                byte[] bArr7 = new byte[Utils.numBytes(i16 * 2)];
                picnicEngine.H3(iArr, iArr2, iArr4, bArr2, bArr7, signature.salt, bArr, bArr3);
                if (subarrayEquals(bArr4, bArr7, Utils.numBytes(picnicEngine.numMPCRounds * 2))) {
                    return 0;
                }
            }
        }
        LOG.fine(str);
        return -1;
    }

    private int verify_picnic3(Signature2 signature2, int[] iArr, int[] iArr2, byte[] bArr) {
        int iVerifyMerkleTree;
        Logger logger;
        String string;
        StringBuilder sb2;
        Tape[] tapeArr;
        int i11;
        PicnicEngine picnicEngine = this;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        Msg[] msgArr = new Msg[picnicEngine.numMPCRounds];
        Tree tree = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[] bArr5 = new byte[64];
        int i12 = picnicEngine.numMPCRounds;
        Tree[] treeArr = new Tree[i12];
        Tape[] tapeArr2 = new Tape[i12];
        Tree tree2 = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.seedSizeBytes);
        if (tree2.reconstructSeeds(signature2.challengeC, picnicEngine.numOpenedRounds, signature2.iSeedInfo, signature2.iSeedInfoLen, signature2.salt, 0) != 0) {
            return -1;
        }
        int i13 = 0;
        while (true) {
            if (i13 < picnicEngine.numMPCRounds) {
                if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i13)) {
                    treeArr[i13] = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                    int[] iArr4 = {signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i13)]};
                    Tree tree3 = treeArr[i13];
                    Signature2.Proof2 proof2 = signature2.proofs[i13];
                    int i14 = i13;
                    int iReconstructSeeds = tree3.reconstructSeeds(iArr4, 1, proof2.seedInfo, proof2.seedInfoLen, signature2.salt, i14);
                    i11 = i14;
                    if (iReconstructSeeds != 0) {
                        logger = LOG;
                        sb2 = new StringBuilder("Failed to reconstruct seeds for round ");
                        sb2.append(i11);
                        break;
                    }
                } else {
                    Tree tree4 = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                    treeArr[i13] = tree4;
                    tree4.generateSeeds(tree2.getLeaf(i13), signature2.salt, i13);
                    i11 = i13;
                }
                i13 = i11 + 1;
            } else {
                int i15 = picnicEngine.numMPCParties - 1;
                byte[] bArr6 = new byte[MAX_AUX_BYTES];
                int i16 = 0;
                while (i16 < picnicEngine.numMPCRounds) {
                    byte[] bArr7 = bArr6;
                    Tape tape = new Tape(picnicEngine);
                    tapeArr2[i16] = tape;
                    byte[][] bArr8 = bArr3;
                    byte[][][] bArr9 = bArr2;
                    picnicEngine.createRandomTapes(tape, treeArr[i16].getLeaves(), treeArr[i16].getLeavesOffset(), signature2.salt, i16);
                    if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i16)) {
                        tapeArr = tapeArr2;
                        int i17 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i16)];
                        int i18 = 0;
                        while (i18 < i15) {
                            if (i18 != i17) {
                                picnicEngine.commit(bArr9[i16][i18], treeArr[i16].getLeaf(i18), null, signature2.salt, i16, i18);
                            }
                            i18++;
                            picnicEngine = this;
                        }
                        if (i15 != i17) {
                            picnicEngine = this;
                            picnicEngine.commit(bArr9[i16][i15], treeArr[i16].getLeaf(i15), signature2.proofs[i16].aux, signature2.salt, i16, i15);
                        } else {
                            picnicEngine = this;
                        }
                        System.arraycopy(signature2.proofs[i16].C, 0, bArr9[i16][i17], 0, picnicEngine.digestSizeBytes);
                    } else {
                        tapeArr2[i16].computeAuxTape(null);
                        Tape[] tapeArr3 = tapeArr2;
                        int i19 = 0;
                        while (i19 < i15) {
                            picnicEngine.commit(bArr9[i16][i19], treeArr[i16].getLeaf(i19), null, signature2.salt, i16, i19);
                            i19++;
                            tapeArr3 = tapeArr3;
                        }
                        tapeArr = tapeArr3;
                        picnicEngine.getAuxBits(bArr7, tapeArr[i16]);
                        picnicEngine.commit(bArr9[i16][i15], treeArr[i16].getLeaf(i15), bArr7, signature2.salt, i16, i15);
                    }
                    i16++;
                    bArr6 = bArr7;
                    bArr3 = bArr8;
                    tapeArr2 = tapeArr;
                    bArr2 = bArr9;
                }
                Tape[] tapeArr4 = tapeArr2;
                byte[][][] bArr10 = bArr2;
                byte[][] bArr11 = bArr3;
                for (int i21 = 0; i21 < picnicEngine.numMPCRounds; i21++) {
                    picnicEngine.commit_h(bArr11[i21], bArr10[i21]);
                }
                int[] iArr5 = new int[picnicEngine.stateSizeBits];
                int i22 = 0;
                while (true) {
                    int i23 = picnicEngine.numMPCRounds;
                    if (i22 < i23) {
                        msgArr[i22] = new Msg(picnicEngine);
                        if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i22)) {
                            int i24 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i22)];
                            if (i24 != i15) {
                                tapeArr4[i22].setAuxBits(signature2.proofs[i22].aux);
                            }
                            System.arraycopy(signature2.proofs[i22].msgs, 0, msgArr[i22].msgs[i24], 0, picnicEngine.andSizeBytes);
                            Arrays.fill(tapeArr4[i22].tapes[i24], (byte) 0);
                            msgArr[i22].unopened = i24;
                            byte[] bArr12 = new byte[picnicEngine.stateSizeWords * 4];
                            byte[] bArr13 = signature2.proofs[i22].input;
                            System.arraycopy(bArr13, 0, bArr12, 0, bArr13.length);
                            int i25 = picnicEngine.stateSizeWords;
                            int[] iArr6 = new int[i25];
                            Pack.littleEndianToInt(bArr12, 0, iArr6, 0, i25);
                            if (picnicEngine.simulateOnline(iArr6, tapeArr4[i22], iArr5, msgArr[i22], iArr2, iArr) != 0) {
                                logger = LOG;
                                sb2 = new StringBuilder("MPC simulation failed for round ");
                                sb2.append(i22);
                                sb2.append(", signature invalid");
                                break;
                            }
                            picnicEngine.commit_v(bArr4[i22], signature2.proofs[i22].input, msgArr[i22]);
                        } else {
                            bArr4[i22] = null;
                        }
                        i22++;
                    } else {
                        if (tree.addMerkleNodes(picnicEngine.getMissingLeavesList(signature2.challengeC), i23 - picnicEngine.numOpenedRounds, signature2.cvInfo, signature2.cvInfoLen) != 0 || (iVerifyMerkleTree = tree.verifyMerkleTree(bArr4, signature2.salt)) != 0) {
                            return -1;
                        }
                        picnicEngine.HCP(bArr5, null, null, bArr11, tree.nodes[0], signature2.salt, iArr, iArr2, bArr);
                        if (subarrayEquals(signature2.challengeHash, bArr5, picnicEngine.digestSizeBytes)) {
                            return iVerifyMerkleTree;
                        }
                        logger = LOG;
                        string = "Challenge does not match, signature invalid";
                    }
                }
            }
        }
        string = sb2.toString();
        logger.fine(string);
        return -1;
    }

    private void wordToMsgs(int i11, Msg msg) {
        for (int i12 = 0; i12 < this.numMPCParties; i12++) {
            Utils.setBit(msg.msgs[i12], msg.pos, (byte) Utils.getBit(i11, i12));
        }
        msg.pos++;
    }

    private void xor_three(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i11 = 0; i11 < this.stateSizeWords; i11++) {
            iArr[i11] = (iArr2[i11] ^ iArr3[i11]) ^ iArr4[i11];
        }
    }

    public void aux_mpc_sbox(int[] iArr, int[] iArr2, Tape tape) {
        for (int i11 = 0; i11 < this.numSboxes * 3; i11 += 3) {
            int i12 = i11 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i12);
            int i13 = i11 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i13);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i11);
            int bitFromWordArray4 = Utils.getBitFromWordArray(iArr2, i12);
            int bitFromWordArray5 = Utils.getBitFromWordArray(iArr2, i13);
            aux_mpc_AND(bitFromWordArray, bitFromWordArray2, ((Utils.getBitFromWordArray(iArr2, i11) ^ bitFromWordArray) ^ bitFromWordArray2) ^ bitFromWordArray3, tape);
            aux_mpc_AND(bitFromWordArray2, bitFromWordArray3, bitFromWordArray4 ^ bitFromWordArray, tape);
            aux_mpc_AND(bitFromWordArray3, bitFromWordArray, (bitFromWordArray5 ^ bitFromWordArray) ^ bitFromWordArray2, tape);
        }
    }

    public void crypto_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_sign(bArr3, bArr2, bArr)) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
    }

    public void crypto_sign_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i11 = this.stateSizeWords;
        byte[] bArr3 = new byte[i11 * 4];
        byte[] bArr4 = new byte[i11 * 4];
        byte[] bArr5 = new byte[i11 * 4];
        picnic_keygen(bArr3, bArr4, bArr5, secureRandom);
        picnic_write_public_key(bArr4, bArr3, bArr);
        picnic_write_private_key(bArr5, bArr4, bArr3, bArr2);
    }

    public boolean crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_verify(bArr3, Arrays.copyOfRange(bArr2, 4, bArr.length + 4), bArr2, Pack.littleEndianToInt(bArr2, 0)) == -1) {
            return false;
        }
        System.arraycopy(bArr2, 4, bArr, 0, bArr.length);
        return true;
    }

    public int getChallenge(byte[] bArr, int i11) {
        return Utils.getCrumbAligned(bArr, i11);
    }

    public int getPublicKeySize() {
        return this.CRYPTO_PUBLICKEYBYTES;
    }

    public int getSecretKeySize() {
        return this.CRYPTO_SECRETKEYBYTES;
    }

    public int getSignatureSize(int i11) {
        return this.CRYPTO_BYTES + i11;
    }

    public int getTrueSignatureSize() {
        return this.signatureLength;
    }

    public void matrix_mul(int[] iArr, int[] iArr2, int[] iArr3, int i11) {
        matrix_mul_offset(iArr, 0, iArr2, 0, iArr3, i11);
    }

    public void matrix_mul_offset(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        int[] iArr4 = new int[16];
        int i14 = this.stateSizeWords;
        iArr4[i14 - 1] = 0;
        int i15 = this.stateSizeBits;
        int i16 = i15 / 32;
        int i17 = (i14 * 32) - i15;
        int iBitPermuteStepSimple = Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple((-1) >>> i17, 1431655765, 1), 858993459, 2), 252645135, 4);
        for (int i18 = 0; i18 < this.stateSizeBits; i18++) {
            int i19 = 0;
            for (int i21 = 0; i21 < i16; i21++) {
                i19 ^= iArr3[i13 + ((this.stateSizeWords * i18) + i21)] & iArr2[i12 + i21];
            }
            if (i17 > 0) {
                i19 ^= (iArr3[i13 + ((this.stateSizeWords * i18) + i16)] & iArr2[i12 + i16]) & iBitPermuteStepSimple;
            }
            Utils.setBit(iArr4, i18, Utils.parity32(i19));
        }
        System.arraycopy(iArr4, 0, iArr, i11, this.stateSizeWords);
    }

    public void mpc_AND_verify(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View view, View view2) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr2[0];
        int i14 = ((((i12 & i13) ^ (iArr2[1] & i11)) ^ (i11 & i13)) ^ bit) ^ bit2;
        iArr3[0] = i14;
        Utils.setBit(view.communicatedBits, tape.pos, (byte) i14);
        iArr3[1] = Utils.getBit(view2.communicatedBits, tape.pos);
        tape.pos++;
    }

    public void mpc_LowMC_verify(View view, View view2, Tape tape, int[] iArr, int[] iArr2, int i11) {
        Arrays.fill(iArr, 0, iArr.length, 0);
        mpc_xor_constant_verify(iArr, iArr2, 0, this.stateSizeWords, i11);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        int[] iArr3 = iArr;
        matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        matrix_mul_offset(iArr3, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        mpc_xor(iArr3, iArr3, 2);
        for (int i12 = 1; i12 <= this.numRounds; i12++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i12);
            matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            matrix_mul_offset(iArr, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            mpc_substitution_verify(iArr, tape, view, view2);
            int i13 = i12 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i13);
            int i14 = this.stateSizeWords;
            mpc_matrix_mul(iArr, i14 * 2, iArr, i14 * 2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 2);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i13);
            iArr3 = iArr;
            mpc_xor_constant_verify(iArr3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords, i11);
            mpc_xor(iArr3, iArr3, 2);
        }
        int i15 = this.stateSizeWords;
        System.arraycopy(iArr3, i15 * 2, view.outputShare, 0, i15);
        int i16 = this.stateSizeWords;
        System.arraycopy(iArr3, i16 * 3, view2.outputShare, 0, i16);
    }

    public void mpc_substitution_verify(int[] iArr, Tape tape, View view, View view2) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[2];
        int[] iArr7 = new int[2];
        int i11 = 0;
        while (i11 < this.numSboxes * 3) {
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = ((i12 + 2) * this.stateSizeWords * 32) + i11;
                iArr2[i12] = Utils.getBitFromWordArray(iArr, i13 + 2);
                iArr3[i12] = Utils.getBitFromWordArray(iArr, i13 + 1);
                iArr4[i12] = Utils.getBitFromWordArray(iArr, i13);
            }
            mpc_AND_verify(iArr2, iArr3, iArr5, tape, view, view2);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND_verify(iArr10, iArr8, iArr11, tape, view, view2);
            int[] iArr13 = iArr7;
            mpc_AND_verify(iArr8, iArr9, iArr13, tape, view, view2);
            iArr2 = iArr9;
            for (int i14 = 0; i14 < 2; i14++) {
                int i15 = ((i14 + 2) * this.stateSizeWords * 32) + i11;
                Utils.setBitInWordArray(iArr, i15 + 2, iArr2[i14] ^ iArr11[i14]);
                Utils.setBitInWordArray(iArr, i15 + 1, (iArr2[i14] ^ iArr10[i14]) ^ iArr13[i14]);
                Utils.setBitInWordArray(iArr, i15, ((iArr2[i14] ^ iArr10[i14]) ^ iArr8[i14]) ^ iArr12[i14]);
            }
            i11 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    public void prove(Signature.Proof proof, int i11, byte[] bArr, int i12, View[] viewArr, byte[][] bArr2, byte[][] bArr3) {
        if (i11 == 0) {
            System.arraycopy(bArr, i12, proof.seed1, 0, this.seedSizeBytes);
            int i13 = this.seedSizeBytes;
            System.arraycopy(bArr, i12 + i13, proof.seed2, 0, i13);
        } else if (i11 == 1) {
            int i14 = this.seedSizeBytes;
            System.arraycopy(bArr, i12 + i14, proof.seed1, 0, i14);
            int i15 = this.seedSizeBytes;
            System.arraycopy(bArr, (i15 * 2) + i12, proof.seed2, 0, i15);
        } else if (i11 != 2) {
            LOG.fine("Invalid challenge");
            a.f("challenge");
            return;
        } else {
            int i16 = this.seedSizeBytes;
            System.arraycopy(bArr, (i16 * 2) + i12, proof.seed1, 0, i16);
            System.arraycopy(bArr, i12, proof.seed2, 0, this.seedSizeBytes);
        }
        if (i11 == 1 || i11 == 2) {
            System.arraycopy(viewArr[2].inputShare, 0, proof.inputShare, 0, this.stateSizeWords);
        }
        System.arraycopy(viewArr[(i11 + 1) % 3].communicatedBits, 0, proof.communicatedBits, 0, this.andSizeBytes);
        int i17 = (i11 + 2) % 3;
        System.arraycopy(bArr2[i17], 0, proof.view3Commitment, 0, this.digestSizeBytes);
        if (this.transform == 1) {
            System.arraycopy(bArr3[i17], 0, proof.view3UnruhG, 0, i11 == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
        }
    }

    public int serializeSignature(Signature signature, byte[] bArr, int i11) {
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2) + 32;
        int i12 = this.numMPCRounds;
        int i13 = (((this.seedSizeBytes * 2) + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes) * i12) + iNumBytes;
        if (this.transform == 1) {
            i13 += this.UnruhGWithoutInputBytes * i12;
        }
        if (this.CRYPTO_BYTES < i13) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i11, Utils.numBytes(i12 * 2));
        int iNumBytes2 = Utils.numBytes(this.numMPCRounds * 2) + i11;
        System.arraycopy(signature.salt, 0, bArr, iNumBytes2, 32);
        int i14 = iNumBytes2 + 32;
        for (int i15 = 0; i15 < this.numMPCRounds; i15++) {
            int challenge = getChallenge(bArr2, i15);
            System.arraycopy(proofArr[i15].view3Commitment, 0, bArr, i14, this.digestSizeBytes);
            int i16 = i14 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i17 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(proofArr[i15].view3UnruhG, 0, bArr, i16, i17);
                i16 += i17;
            }
            System.arraycopy(proofArr[i15].communicatedBits, 0, bArr, i16, this.andSizeBytes);
            int i18 = i16 + this.andSizeBytes;
            System.arraycopy(proofArr[i15].seed1, 0, bArr, i18, this.seedSizeBytes);
            int i19 = this.seedSizeBytes;
            int i21 = i18 + i19;
            System.arraycopy(proofArr[i15].seed2, 0, bArr, i21, i19);
            i14 = i21 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.intToLittleEndian(proofArr[i15].inputShare, 0, this.stateSizeWords, bArr, i14);
                i14 += this.stateSizeBytes;
            }
        }
        return i14 - i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verifyProof(org.bouncycastle.pqc.crypto.picnic.Signature.Proof r17, org.bouncycastle.pqc.crypto.picnic.View r18, org.bouncycastle.pqc.crypto.picnic.View r19, int r20, byte[] r21, int r22, byte[] r23, int[] r24, org.bouncycastle.pqc.crypto.picnic.Tape r25) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.verifyProof(org.bouncycastle.pqc.crypto.picnic.Signature$Proof, org.bouncycastle.pqc.crypto.picnic.View, org.bouncycastle.pqc.crypto.picnic.View, int, byte[], int, byte[], int[], org.bouncycastle.pqc.crypto.picnic.Tape):boolean");
    }

    public void xor_array(int[] iArr, int[] iArr2, int[] iArr3, int i11) {
        for (int i12 = 0; i12 < this.stateSizeWords; i12++) {
            iArr[i12] = iArr2[i12] ^ iArr3[i12 + i11];
        }
    }

    private boolean arePaddingBitsZero(int[] iArr, int i11) {
        if ((i11 & 31) == 0) {
            return true;
        }
        return (iArr[i11 >>> 5] & (~Utils.getTrailingBitsMask(i11))) == 0;
    }

    private static boolean subarrayEquals(int[] iArr, int[] iArr2, int i11) {
        if (iArr.length < i11 || iArr2.length < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    private void H3(int[] iArr, int[] iArr2, int[][][] iArr3, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                Pack.intToLittleEndian(iArr3[i11][i12], bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private int mpc_AND(int i11, int i12, int i13, int i14, Tape tape, Msg msg) {
        int iExtend = ((i13 & extend(i12)) ^ (i14 & extend(i11))) ^ tape.tapesToWord();
        int i15 = msg.unopened;
        if (i15 >= 0) {
            iExtend = Utils.setBit(iExtend, msg.unopened, Utils.getBit(msg.msgs[i15], msg.pos));
        }
        wordToMsgs(iExtend, msg);
        return (i11 & i12) ^ Utils.parity16(iExtend);
    }
}
