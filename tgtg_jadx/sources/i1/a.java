package i1;

import c50.w;
import m0.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f22755b;

    public a(int i11, p pVar) {
        this.f22754a = i11;
        if (pVar != null) {
            this.f22755b = pVar;
        } else {
            w.l("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f22754a == aVar.f22754a && this.f22755b.equals(aVar.f22755b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22754a ^ 1000003) * 1000003) ^ this.f22755b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.f22754a + ", cameraIdentifier=" + this.f22755b + "}";
    }
}
