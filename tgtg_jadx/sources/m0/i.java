package m0;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f28528b;

    public i(int i11, Surface surface) {
        this.f28527a = i11;
        if (surface != null) {
            this.f28528b = surface;
        } else {
            c50.w.l("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f28527a == iVar.f28527a && this.f28528b.equals(iVar.f28528b);
    }

    public final int hashCode() {
        return ((this.f28527a ^ 1000003) * 1000003) ^ this.f28528b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f28527a + ", surface=" + this.f28528b + "}";
    }
}
