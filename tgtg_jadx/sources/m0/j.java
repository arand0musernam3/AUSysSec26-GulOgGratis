package m0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f28530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f28534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28535f;

    public j(Rect rect, int i11, int i12, boolean z11, Matrix matrix, boolean z12) {
        if (rect == null) {
            c50.w.l("Null getCropRect");
            throw null;
        }
        this.f28530a = rect;
        this.f28531b = i11;
        this.f28532c = i12;
        this.f28533d = z11;
        if (matrix == null) {
            c50.w.l("Null getSensorToBufferTransform");
            throw null;
        }
        this.f28534e = matrix;
        this.f28535f = z12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f28530a.equals(jVar.f28530a) && this.f28531b == jVar.f28531b && this.f28532c == jVar.f28532c && this.f28533d == jVar.f28533d && this.f28534e.equals(jVar.f28534e) && this.f28535f == jVar.f28535f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f28530a.hashCode() ^ 1000003) * 1000003) ^ this.f28531b) * 1000003) ^ this.f28532c) * 1000003) ^ (this.f28533d ? 1231 : 1237)) * 1000003) ^ this.f28534e.hashCode()) * 1000003) ^ (this.f28535f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo{getCropRect=");
        sb2.append(this.f28530a);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f28531b);
        sb2.append(", getTargetRotation=");
        sb2.append(this.f28532c);
        sb2.append(", hasCameraTransform=");
        sb2.append(this.f28533d);
        sb2.append(", getSensorToBufferTransform=");
        sb2.append(this.f28534e);
        sb2.append(", isMirroring=");
        return j4.s.o(sb2, this.f28535f, "}");
    }
}
