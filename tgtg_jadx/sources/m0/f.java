package m0;

import android.graphics.Matrix;
import s0.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2 f28497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f28500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28501e;

    public f(k2 k2Var, long j9, int i11, Matrix matrix, int i12) {
        if (k2Var == null) {
            c50.w.l("Null tagBundle");
            throw null;
        }
        this.f28497a = k2Var;
        this.f28498b = j9;
        this.f28499c = i11;
        if (matrix == null) {
            c50.w.l("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.f28500d = matrix;
        this.f28501e = i12;
    }

    @Override // m0.k0
    public final k2 b() {
        return this.f28497a;
    }

    @Override // m0.k0
    public final int c() {
        return this.f28501e;
    }

    @Override // m0.k0
    public final void d(v0.i iVar) {
        iVar.d(this.f28499c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f28497a.equals(fVar.f28497a) && this.f28498b == fVar.f28498b && this.f28499c == fVar.f28499c && this.f28500d.equals(fVar.f28500d) && this.f28501e == fVar.f28501e) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.k0
    public final long getTimestamp() {
        return this.f28498b;
    }

    public final int hashCode() {
        int iHashCode = (this.f28497a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f28498b;
        return ((((((iHashCode ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f28499c) * 1000003) ^ this.f28500d.hashCode()) * 1000003) ^ this.f28501e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb2.append(this.f28497a);
        sb2.append(", timestamp=");
        sb2.append(this.f28498b);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f28499c);
        sb2.append(", sensorToBufferTransformMatrix=");
        sb2.append(this.f28500d);
        sb2.append(", flashState=");
        return r8.k.i(this.f28501e, "}", sb2);
    }
}
