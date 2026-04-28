package org.bouncycastle.crypto.digests;

import i4.a;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Blake2xsDigest implements Xof {
    private static final int DIGEST_LENGTH = 32;
    private static final long MAX_NUMBER_BLOCKS = 4294967296L;
    public static final int UNKNOWN_DIGEST_LENGTH = 65535;
    private long blockPos;
    private byte[] buf;
    private int bufPos;
    private int digestLength;
    private int digestPos;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private byte[] f33060h0;
    private Blake2sDigest hash;
    private long nodeOffset;
    private final CryptoServicePurpose purpose;

    public Blake2xsDigest(Blake2xsDigest blake2xsDigest) {
        this.f33060h0 = null;
        this.buf = new byte[32];
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        this.digestLength = blake2xsDigest.digestLength;
        this.hash = new Blake2sDigest(blake2xsDigest.hash);
        this.f33060h0 = Arrays.clone(blake2xsDigest.f33060h0);
        this.buf = Arrays.clone(blake2xsDigest.buf);
        this.bufPos = blake2xsDigest.bufPos;
        this.digestPos = blake2xsDigest.digestPos;
        this.blockPos = blake2xsDigest.blockPos;
        this.nodeOffset = blake2xsDigest.nodeOffset;
        this.purpose = blake2xsDigest.purpose;
    }

    private long computeNodeOffset() {
        return ((long) this.digestLength) * MAX_NUMBER_BLOCKS;
    }

    private int computeStepLength() {
        int i11 = this.digestLength;
        if (i11 == 65535) {
            return 32;
        }
        return Math.min(32, i11 - this.digestPos);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i11, int i12) {
        int iDoOutput = doOutput(bArr, i11, i12);
        reset();
        return iDoOutput;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // org.bouncycastle.crypto.Xof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doOutput(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r8.length
            int r0 = r0 - r10
            if (r9 > r0) goto L85
            byte[] r0 = r7.f33060h0
            r1 = 0
            if (r0 != 0) goto L18
            org.bouncycastle.crypto.digests.Blake2sDigest r0 = r7.hash
            int r0 = r0.getDigestSize()
            byte[] r0 = new byte[r0]
            r7.f33060h0 = r0
            org.bouncycastle.crypto.digests.Blake2sDigest r2 = r7.hash
            r2.doFinal(r0, r1)
        L18:
            int r0 = r7.digestLength
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r2) goto L2c
            int r2 = r7.digestPos
            int r2 = r2 + r10
            if (r2 > r0) goto L25
            goto L38
        L25:
            java.lang.String r8 = "Output length is above the digest length"
        L27:
            i4.a.f(r8)
        L2a:
            r8 = 0
            return r8
        L2c:
            long r2 = r7.blockPos
            r0 = 5
            long r2 = r2 << r0
            long r4 = r7.getUnknownMaxLength()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L82
        L38:
            r0 = r1
        L39:
            if (r0 >= r10) goto L81
            int r2 = r7.bufPos
            r3 = 32
            if (r2 < r3) goto L6a
            org.bouncycastle.crypto.digests.Blake2sDigest r2 = new org.bouncycastle.crypto.digests.Blake2sDigest
            int r4 = r7.computeStepLength()
            long r5 = r7.nodeOffset
            r2.<init>(r4, r3, r5)
            byte[] r3 = r7.f33060h0
            int r4 = r3.length
            r2.update(r3, r1, r4)
            byte[] r3 = r7.buf
            org.bouncycastle.util.Arrays.fill(r3, r1)
            byte[] r3 = r7.buf
            r2.doFinal(r3, r1)
            r7.bufPos = r1
            long r2 = r7.nodeOffset
            r4 = 1
            long r2 = r2 + r4
            r7.nodeOffset = r2
            long r2 = r7.blockPos
            long r2 = r2 + r4
            r7.blockPos = r2
        L6a:
            int r2 = r9 + r0
            byte[] r3 = r7.buf
            int r4 = r7.bufPos
            r3 = r3[r4]
            r8[r2] = r3
            int r4 = r4 + 1
            r7.bufPos = r4
            int r2 = r7.digestPos
            int r2 = r2 + 1
            r7.digestPos = r2
            int r0 = r0 + 1
            goto L39
        L81:
            return r10
        L82:
            java.lang.String r8 = "Maximum length is 2^32 blocks of 32 bytes"
            goto L27
        L85:
            java.lang.String r8 = "output buffer too short"
            m0.i1.r(r8)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.digests.Blake2xsDigest.doOutput(byte[], int, int):int");
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2xs";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.hash.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    public long getUnknownMaxLength() {
        return 137438953472L;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.hash.reset();
        this.f33060h0 = null;
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        this.nodeOffset = computeNodeOffset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        this.hash.update(b8);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        this.hash.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        return doFinal(bArr, i11, this.digestLength);
    }

    public Blake2xsDigest(int i11) {
        this(i11, CryptoServicePurpose.ANY);
    }

    public Blake2xsDigest(int i11, CryptoServicePurpose cryptoServicePurpose) {
        this(i11, null, null, null, cryptoServicePurpose);
    }

    public Blake2xsDigest(int i11, byte[] bArr) {
        this(i11, bArr, null, null, CryptoServicePurpose.ANY);
    }

    public Blake2xsDigest(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, CryptoServicePurpose cryptoServicePurpose) {
        this.f33060h0 = null;
        this.buf = new byte[32];
        this.bufPos = 32;
        this.digestPos = 0;
        this.blockPos = 0L;
        if (i11 < 1 || i11 > 65535) {
            a.f("BLAKE2xs digest length must be between 1 and 2^16-1");
            throw null;
        }
        this.digestLength = i11;
        long jComputeNodeOffset = computeNodeOffset();
        this.nodeOffset = jComputeNodeOffset;
        this.purpose = cryptoServicePurpose;
        this.hash = new Blake2sDigest(32, bArr, bArr2, bArr3, jComputeNodeOffset, cryptoServicePurpose);
    }

    public Blake2xsDigest() {
        this(UNKNOWN_DIGEST_LENGTH, CryptoServicePurpose.ANY);
    }
}
