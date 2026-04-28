package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes3.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    public static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        public ShakeSymmetric() {
            super(168, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(256);
        }

        private void streamInit(SHAKEDigest sHAKEDigest, byte[] bArr, short s7) {
            sHAKEDigest.reset();
            sHAKEDigest.update(bArr, 0, bArr.length);
            sHAKEDigest.update(new byte[]{(byte) s7, (byte) (s7 >> 8)}, 0, 2);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream128init(byte[] bArr, short s7) {
            streamInit(this.digest128, bArr, s7);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream128squeezeBlocks(byte[] bArr, int i11, int i12) {
            this.digest128.doOutput(bArr, i11, i12);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream256init(byte[] bArr, short s7) {
            streamInit(this.digest256, bArr, s7);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream256squeezeBlocks(byte[] bArr, int i11, int i12) {
            this.digest256.doOutput(bArr, i11, i12);
        }
    }

    public Symmetric(int i11, int i12) {
        this.stream128BlockBytes = i11;
        this.stream256BlockBytes = i12;
    }

    public abstract void stream128init(byte[] bArr, short s7);

    public abstract void stream128squeezeBlocks(byte[] bArr, int i11, int i12);

    public abstract void stream256init(byte[] bArr, short s7);

    public abstract void stream256squeezeBlocks(byte[] bArr, int i11, int i12);
}
