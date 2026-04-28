package c1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import c50.w;
import s0.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.d f6839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f6841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f6842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f6844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f6845h;

    public b(Object obj, v0.d dVar, int i11, Size size, Rect rect, int i12, Matrix matrix, y yVar) {
        if (obj == null) {
            w.l("Null data");
            throw null;
        }
        this.f6838a = obj;
        this.f6839b = dVar;
        this.f6840c = i11;
        this.f6841d = size;
        if (rect == null) {
            w.l("Null cropRect");
            throw null;
        }
        this.f6842e = rect;
        this.f6843f = i12;
        if (matrix == null) {
            w.l("Null sensorToBufferTransform");
            throw null;
        }
        this.f6844g = matrix;
        if (yVar != null) {
            this.f6845h = yVar;
        } else {
            w.l("Null cameraCaptureResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f6838a.equals(bVar.f6838a)) {
            return false;
        }
        v0.d dVar = bVar.f6839b;
        v0.d dVar2 = this.f6839b;
        if (dVar2 == null) {
            if (dVar != null) {
                return false;
            }
        } else if (!dVar2.equals(dVar)) {
            return false;
        }
        return this.f6840c == bVar.f6840c && this.f6841d.equals(bVar.f6841d) && this.f6842e.equals(bVar.f6842e) && this.f6843f == bVar.f6843f && this.f6844g.equals(bVar.f6844g) && this.f6845h.equals(bVar.f6845h);
    }

    public final int hashCode() {
        int iHashCode = (this.f6838a.hashCode() ^ 1000003) * 1000003;
        v0.d dVar = this.f6839b;
        return ((((((((((((iHashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003) ^ this.f6840c) * 1000003) ^ this.f6841d.hashCode()) * 1000003) ^ this.f6842e.hashCode()) * 1000003) ^ this.f6843f) * 1000003) ^ this.f6844g.hashCode()) * 1000003) ^ this.f6845h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f6838a + ", exif=" + this.f6839b + ", format=" + this.f6840c + ", size=" + this.f6841d + ", cropRect=" + this.f6842e + ", rotationDegrees=" + this.f6843f + ", sensorToBufferTransform=" + this.f6844g + ", cameraCaptureResult=" + this.f6845h + "}";
    }
}
