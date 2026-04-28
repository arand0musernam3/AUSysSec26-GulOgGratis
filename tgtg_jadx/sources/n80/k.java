package n80;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class k implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final j f30717d = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30720c;

    public k(long j9, long j11, long j12) {
        if (j12 == 0) {
            i4.a.f("Step must be non-zero.");
            throw null;
        }
        if (j12 == Long.MIN_VALUE) {
            i4.a.f("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f30718a = j9;
        if (j12 > 0) {
            if (j9 < j11) {
                long j13 = j11 % j12;
                long j14 = j9 % j12;
                long j15 = ((j13 < 0 ? j13 + j12 : j13) - (j14 < 0 ? j14 + j12 : j14)) % j12;
                j11 -= j15 < 0 ? j15 + j12 : j15;
            }
        } else {
            if (j12 >= 0) {
                i4.a.f("Step is zero.");
                throw null;
            }
            if (j9 > j11) {
                long j16 = -j12;
                long j17 = j9 % j16;
                long j18 = j11 % j16;
                long j19 = ((j17 < 0 ? j17 + j16 : j17) - (j18 < 0 ? j18 + j16 : j18)) % j16;
                j11 += j19 < 0 ? j19 + j16 : j19;
            }
        }
        this.f30719b = j11;
        this.f30720c = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (isEmpty() && ((k) obj).isEmpty()) {
            return true;
        }
        k kVar = (k) obj;
        return this.f30718a == kVar.f30718a && this.f30719b == kVar.f30719b && this.f30720c == kVar.f30720c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j9 = 31;
        long j11 = this.f30718a;
        long j12 = this.f30719b;
        long j13 = (((j11 ^ (j11 >>> 32)) * j9) + (j12 ^ (j12 >>> 32))) * j9;
        long j14 = this.f30720c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j9 = this.f30720c;
        long j11 = this.f30719b;
        long j12 = this.f30718a;
        return j9 > 0 ? j12 > j11 : j12 < j11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this.f30718a, this.f30719b, this.f30720c);
    }

    public String toString() {
        StringBuilder sb2;
        long j9 = this.f30720c;
        long j11 = this.f30719b;
        long j12 = this.f30718a;
        if (j9 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append("..");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(j9);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append(" downTo ");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(-j9);
        }
        return sb2.toString();
    }
}
