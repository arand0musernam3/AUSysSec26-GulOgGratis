package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes3.dex */
public class MayoKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MayoParameters f33536p;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int i11;
        int mVecLimbs = this.f33536p.getMVecLimbs();
        int m11 = this.f33536p.getM();
        int v3 = this.f33536p.getV();
        int o11 = this.f33536p.getO();
        int oBytes = this.f33536p.getOBytes();
        int p1Limbs = this.f33536p.getP1Limbs();
        int p3Limbs = this.f33536p.getP3Limbs();
        int pkSeedBytes = this.f33536p.getPkSeedBytes();
        int skSeedBytes = this.f33536p.getSkSeedBytes();
        byte[] bArr = new byte[this.f33536p.getCpkBytes()];
        byte[] bArr2 = new byte[this.f33536p.getCskBytes()];
        int i12 = oBytes + pkSeedBytes;
        byte[] bArr3 = new byte[i12];
        long[] jArr = new long[this.f33536p.getP2Limbs() + p1Limbs];
        long[] jArr2 = new long[o11 * o11 * mVecLimbs];
        int i13 = v3 * o11;
        byte[] bArr4 = new byte[i13];
        this.random.nextBytes(bArr2);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, skSeedBytes);
        sHAKEDigest.doFinal(bArr3, 0, i12);
        GF16.decode(bArr3, pkSeedBytes, bArr4, 0, i13);
        Utils.expandP1P2(this.f33536p, jArr, bArr3);
        int i14 = 0;
        GF16Utils.mulAddMUpperTriangularMatXMat(mVecLimbs, jArr, bArr4, jArr, p1Limbs, v3, o11);
        byte[] bArr5 = bArr4;
        GF16Utils.mulAddMatTransXMMat(mVecLimbs, bArr5, jArr, p1Limbs, jArr2, v3, o11);
        System.arraycopy(bArr3, 0, bArr, 0, pkSeedBytes);
        long[] jArr3 = new long[p3Limbs];
        int i15 = o11 * mVecLimbs;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            byte[] bArr6 = bArr5;
            if (i16 >= o11) {
                Utils.packMVecs(jArr3, bArr, pkSeedBytes, p3Limbs / mVecLimbs, m11);
                Arrays.clear(bArr6);
                Arrays.clear(jArr2);
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new MayoPublicKeyParameters(this.f33536p, bArr), (AsymmetricKeyParameter) new MayoPrivateKeyParameters(this.f33536p, bArr2));
            }
            int i19 = i16;
            int i21 = i17;
            int i22 = i14;
            while (true) {
                i11 = i15;
                if (i19 < o11) {
                    System.arraycopy(jArr2, i17 + i22, jArr3, i18, mVecLimbs);
                    if (i16 != i19) {
                        Longs.xorTo(mVecLimbs, jArr2, i21 + i14, jArr3, i18);
                    }
                    i18 += mVecLimbs;
                    i19++;
                    i22 += mVecLimbs;
                    i21 += i11;
                    i15 = i11;
                }
            }
            i16++;
            i17 += i11;
            i14 += mVecLimbs;
            bArr5 = bArr6;
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f33536p = ((MayoKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }
}
