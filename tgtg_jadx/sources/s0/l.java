package s0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f38374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0.c0 f38378e;

    public l(x0 x0Var, List list, int i11, int i12, m0.c0 c0Var) {
        this.f38374a = x0Var;
        this.f38375b = list;
        this.f38376c = i11;
        this.f38377d = i12;
        this.f38378e = c0Var;
    }

    public static androidx.lifecycle.n1 a(x0 x0Var) {
        androidx.lifecycle.n1 n1Var = new androidx.lifecycle.n1();
        if (x0Var == null) {
            c50.w.l("Null surface");
            return null;
        }
        n1Var.f3499a = x0Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            c50.w.l("Null sharedSurfaces");
            return null;
        }
        n1Var.f3500b = list;
        n1Var.f3501c = -1;
        n1Var.f3502d = -1;
        n1Var.f3503e = m0.c0.f28478d;
        return n1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f38374a.equals(lVar.f38374a) && this.f38375b.equals(lVar.f38375b) && this.f38376c == lVar.f38376c && this.f38377d == lVar.f38377d && this.f38378e.equals(lVar.f38378e);
    }

    public final int hashCode() {
        return ((((((((this.f38374a.hashCode() ^ 1000003) * 1000003) ^ this.f38375b.hashCode()) * (-721379959)) ^ this.f38376c) * 1000003) ^ this.f38377d) * 1000003) ^ this.f38378e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f38374a + ", sharedSurfaces=" + this.f38375b + ", physicalCameraId=null, mirrorMode=" + this.f38376c + ", surfaceGroupId=" + this.f38377d + ", dynamicRange=" + this.f38378e + "}";
    }
}
