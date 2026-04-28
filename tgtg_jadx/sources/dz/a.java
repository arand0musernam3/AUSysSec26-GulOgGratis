package dz;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15239f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15244e;

    public a(long j9, int i11, int i12, long j11, int i13) {
        this.f15240a = j9;
        this.f15241b = i11;
        this.f15242c = i12;
        this.f15243d = j11;
        this.f15244e = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f15240a == aVar.f15240a && this.f15241b == aVar.f15241b && this.f15242c == aVar.f15242c && this.f15243d == aVar.f15243d && this.f15244e == aVar.f15244e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f15240a;
        int i11 = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f15241b) * 1000003) ^ this.f15242c) * 1000003;
        long j11 = this.f15243d;
        return ((i11 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f15244e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f15240a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f15241b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f15242c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f15243d);
        sb2.append(", maxBlobByteSizePerRow=");
        return k.i(this.f15244e, "}", sb2);
    }
}
