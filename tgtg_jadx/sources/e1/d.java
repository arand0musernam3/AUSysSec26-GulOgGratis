package e1;

import android.opengl.EGLSurface;
import c50.w;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f15444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15446c;

    public d(EGLSurface eGLSurface, int i11, int i12) {
        if (eGLSurface == null) {
            w.l("Null eglSurface");
            throw null;
        }
        this.f15444a = eGLSurface;
        this.f15445b = i11;
        this.f15446c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f15444a.equals(dVar.f15444a) && this.f15445b == dVar.f15445b && this.f15446c == dVar.f15446c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15444a.hashCode() ^ 1000003) * 1000003) ^ this.f15445b) * 1000003) ^ this.f15446c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f15444a);
        sb2.append(", width=");
        sb2.append(this.f15445b);
        sb2.append(", height=");
        return k.i(this.f15446c, "}", sb2);
    }
}
