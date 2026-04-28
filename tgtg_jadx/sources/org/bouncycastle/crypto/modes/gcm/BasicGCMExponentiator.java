package org.bouncycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes3.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long[] f33200x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j9, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j9 > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f33200x, jArr);
            do {
                if ((1 & j9) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j9 >>>= 1;
            } while (j9 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f33200x = GCMUtil.asLongs(bArr);
    }
}
