package m0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f28505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f28506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0.i0 f28507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28509e;

    public g(Size size, Rect rect, s0.i0 i0Var, int i11, boolean z11) {
        if (size == null) {
            c50.w.l("Null inputSize");
            throw null;
        }
        this.f28505a = size;
        if (rect == null) {
            c50.w.l("Null inputCropRect");
            throw null;
        }
        this.f28506b = rect;
        this.f28507c = i0Var;
        this.f28508d = i11;
        this.f28509e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f28505a.equals(gVar.f28505a) && this.f28506b.equals(gVar.f28506b)) {
                s0.i0 i0Var = gVar.f28507c;
                s0.i0 i0Var2 = this.f28507c;
                if (i0Var2 != null ? i0Var2.equals(i0Var) : i0Var == null) {
                    if (this.f28508d == gVar.f28508d && this.f28509e == gVar.f28509e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f28505a.hashCode() ^ 1000003) * 1000003) ^ this.f28506b.hashCode()) * 1000003;
        s0.i0 i0Var = this.f28507c;
        return ((((iHashCode ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003) ^ this.f28508d) * 1000003) ^ (this.f28509e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInputInfo{inputSize=");
        sb2.append(this.f28505a);
        sb2.append(", inputCropRect=");
        sb2.append(this.f28506b);
        sb2.append(", cameraInternal=");
        sb2.append(this.f28507c);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f28508d);
        sb2.append(", mirroring=");
        return j4.s.o(sb2, this.f28509e, "}");
    }
}
