package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33242c;
    private long cL;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f33243x0;
    private long x0L;

    public GOST3410ValidationParameters(int i11, int i12) {
        this.f33243x0 = i11;
        this.f33242c = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f33242c == this.f33242c && gOST3410ValidationParameters.f33243x0 == this.f33243x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f33242c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f33243x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i11 = this.f33243x0 ^ this.f33242c;
        long j9 = this.x0L;
        int i12 = (i11 ^ ((int) j9)) ^ ((int) (j9 >> 32));
        long j11 = this.cL;
        return (i12 ^ ((int) j11)) ^ ((int) (j11 >> 32));
    }

    public GOST3410ValidationParameters(long j9, long j11) {
        this.x0L = j9;
        this.cL = j11;
    }
}
