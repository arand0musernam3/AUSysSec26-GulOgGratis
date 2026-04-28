package org.bouncycastle.crypto.macs;

import i4.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f33176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f33177d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f33178k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected long f33179k1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f33180m;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected long f33181v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected long f33182v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    protected long f33183v2;
    protected long v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f33180m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f33176c = 2;
        this.f33177d = 4;
    }

    public static long rotateLeft(long j9, int i11) {
        return (j9 >>> (-i11)) | (j9 << i11);
    }

    public void applySipRounds(int i11) {
        long jRotateLeft = this.f33181v0;
        long jRotateLeft2 = this.f33182v1;
        long jRotateLeft3 = this.f33183v2;
        long jRotateLeft4 = this.v3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j9 = jRotateLeft + jRotateLeft2;
            long j11 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j9;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j11;
            long j12 = j11 + jRotateLeft5;
            jRotateLeft = rotateLeft(j9, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j12;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j12, 32);
        }
        this.f33181v0 = jRotateLeft;
        this.f33182v1 = jRotateLeft2;
        this.f33183v2 = jRotateLeft3;
        this.v3 = jRotateLeft4;
    }

    public long doFinal() throws IllegalStateException, DataLengthException {
        long j9 = this.f33180m;
        int i11 = this.wordPos;
        this.f33180m = ((j9 >>> ((7 - i11) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i11)) & 255) << 56);
        processMessageWord();
        this.f33183v2 ^= 255;
        applySipRounds(this.f33177d);
        long j11 = ((this.f33181v0 ^ this.f33182v1) ^ this.f33183v2) ^ this.v3;
        reset();
        return j11;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f33176c + "-" + this.f33177d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            a.f("'params' must be an instance of KeyParameter");
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            a.f("'params' must be a 128-bit key");
            return;
        }
        this.f33178k0 = Pack.littleEndianToLong(key, 0);
        this.f33179k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.v3 ^= this.f33180m;
        applySipRounds(this.f33176c);
        this.f33181v0 ^= this.f33180m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j9 = this.f33178k0;
        this.f33181v0 = 8317987319222330741L ^ j9;
        long j11 = this.f33179k1;
        this.f33182v1 = 7237128888997146477L ^ j11;
        this.f33183v2 = j9 ^ 7816392313619706465L;
        this.v3 = 8387220255154660723L ^ j11;
        this.f33180m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) throws IllegalStateException, DataLengthException {
        int i13 = i12 & (-8);
        int i14 = this.wordPos;
        char c3 = '8';
        long j9 = 255;
        int i15 = 0;
        if (i14 == 0) {
            while (i15 < i13) {
                this.f33180m = Pack.littleEndianToLong(bArr, i11 + i15);
                processMessageWord();
                i15 += 8;
            }
            while (i15 < i12) {
                long j11 = this.f33180m >>> 8;
                this.f33180m = j11;
                this.f33180m = j11 | ((((long) bArr[i11 + i15]) & 255) << 56);
                i15++;
            }
            this.wordPos = i12 - i13;
            return;
        }
        int i16 = i14 << 3;
        int i17 = 0;
        while (i17 < i13) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i11 + i17);
            this.f33180m = (this.f33180m >>> (-i16)) | (jLittleEndianToLong << i16);
            processMessageWord();
            this.f33180m = jLittleEndianToLong;
            i17 += 8;
            c3 = c3;
            j9 = j9;
        }
        char c7 = c3;
        long j12 = j9;
        while (i17 < i12) {
            long j13 = this.f33180m >>> 8;
            this.f33180m = j13;
            this.f33180m = j13 | ((((long) bArr[i11 + i17]) & j12) << c7);
            int i18 = this.wordPos + 1;
            this.wordPos = i18;
            if (i18 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i17++;
        }
    }

    public SipHash(int i11, int i12) {
        this.f33180m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f33176c = i11;
        this.f33177d = i12;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        Pack.longToLittleEndian(doFinal(), bArr, i11);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b8) throws IllegalStateException {
        this.f33180m = (this.f33180m >>> 8) | ((((long) b8) & 255) << 56);
        int i11 = this.wordPos + 1;
        this.wordPos = i11;
        if (i11 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }
}
