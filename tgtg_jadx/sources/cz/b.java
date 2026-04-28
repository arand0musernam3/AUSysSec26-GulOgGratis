package cz;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f13610c;

    public b(long j9, long j11, Set set) {
        this.f13608a = j9;
        this.f13609b = j11;
        this.f13610c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f13608a == bVar.f13608a && this.f13609b == bVar.f13609b && this.f13610c.equals(bVar.f13610c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f13608a;
        int i11 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f13609b;
        return ((i11 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13610c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f13608a + ", maxAllowedDelay=" + this.f13609b + ", flags=" + this.f13610c + "}";
    }
}
