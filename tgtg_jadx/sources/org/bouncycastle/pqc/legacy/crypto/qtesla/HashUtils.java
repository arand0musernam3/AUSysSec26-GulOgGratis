package org.bouncycastle.pqc.legacy.crypto.qtesla;

import org.bouncycastle.crypto.digests.CSHAKEDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes3.dex */
class HashUtils {
    static final int SECURE_HASH_ALGORITHM_KECCAK_128_RATE = 168;
    static final int SECURE_HASH_ALGORITHM_KECCAK_256_RATE = 136;

    public static void customizableSecureHashAlgorithmKECCAK128Simple(byte[] bArr, int i11, int i12, short s7, byte[] bArr2, int i13, int i14) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(128, null, new byte[]{(byte) s7, (byte) (s7 >> 8)});
        cSHAKEDigest.update(bArr2, i13, i14);
        cSHAKEDigest.doFinal(bArr, i11, i12);
    }

    public static void customizableSecureHashAlgorithmKECCAK256Simple(byte[] bArr, int i11, int i12, short s7, byte[] bArr2, int i13, int i14) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(256, null, new byte[]{(byte) s7, (byte) (s7 >> 8)});
        cSHAKEDigest.update(bArr2, i13, i14);
        cSHAKEDigest.doFinal(bArr, i11, i12);
    }

    public static void secureHashAlgorithmKECCAK128(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr2, i13, i14);
        sHAKEDigest.doFinal(bArr, i11, i12);
    }

    public static void secureHashAlgorithmKECCAK256(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, i13, i14);
        sHAKEDigest.doFinal(bArr, i11, i12);
    }
}
