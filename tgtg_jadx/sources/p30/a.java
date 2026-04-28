package p30;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34204c;

    public a(long j9, long j11, long j12) {
        this.f34202a = j9;
        this.f34203b = j11;
        this.f34204c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f34202a == aVar.f34202a && this.f34203b == aVar.f34203b && this.f34204c == aVar.f34204c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f34202a;
        long j11 = this.f34203b;
        int i11 = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f34204c;
        return i11 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f34202a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f34203b);
        sb2.append(", uptimeMillis=");
        return a0.j(this.f34204c, "}", sb2);
    }
}
