package org.bouncycastle.pqc.crypto.ntru;

import c50.w;
import i4.a;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class NTRUKEMExtractor implements EncapsulatedSecretExtractor {
    private final NTRUPrivateKeyParameters ntruPrivateKey;

    public NTRUKEMExtractor(NTRUPrivateKeyParameters nTRUPrivateKeyParameters) {
        if (nTRUPrivateKeyParameters != null) {
            this.ntruPrivateKey = nTRUPrivateKeyParameters;
        } else {
            w.l("'ntruPrivateKey' cannot be null");
            throw null;
        }
    }

    private void cmov(byte[] bArr, byte[] bArr2, byte b8) {
        byte b11 = (byte) ((~b8) + 1);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b12 = bArr[i11];
            bArr[i11] = (byte) (b12 ^ ((bArr2[i11] ^ b12) & b11));
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        NTRUParameterSet parameterSet = this.ntruPrivateKey.getParameters().getParameterSet();
        if (bArr == null) {
            w.l("'encapsulation' cannot be null");
            return null;
        }
        if (bArr.length != parameterSet.ntruCiphertextBytes()) {
            a.f("encapsulation");
            return null;
        }
        byte[] bArr2 = this.ntruPrivateKey.privateKey;
        OWCPADecryptResult oWCPADecryptResultDecrypt = new NTRUOWCPA(parameterSet).decrypt(bArr, bArr2);
        byte[] bArr3 = oWCPADecryptResultDecrypt.f33555rm;
        int i11 = oWCPADecryptResultDecrypt.fail;
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        byte[] bArr4 = new byte[sHA3Digest.getDigestSize()];
        sHA3Digest.update(bArr3, 0, bArr3.length);
        sHA3Digest.doFinal(bArr4, 0);
        sHA3Digest.update(bArr2, parameterSet.owcpaSecretKeyBytes(), parameterSet.prfKeyBytes());
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.doFinal(bArr3, 0);
        cmov(bArr4, bArr3, (byte) i11);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 0, parameterSet.sharedKeyBytes());
        Arrays.clear(bArr4);
        return bArrCopyOfRange;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.ntruPrivateKey.getParameters().getParameterSet().ntruCiphertextBytes();
    }
}
