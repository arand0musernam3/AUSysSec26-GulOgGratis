package sj;

import f70.h;
import mv.y;
import mv.z;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f39040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f39041b;

    public b(z zVar, y yVar) {
        zVar.getClass();
        yVar.getClass();
        this.f39040a = zVar;
        this.f39041b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f39040a == bVar.f39040a && this.f39041b == bVar.f39041b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k.e((this.f39041b.hashCode() + (this.f39040a.hashCode() * 31)) * 31, 31, false);
    }

    public final String toString() {
        return "GoToMainActivity(destination=" + this.f39040a + ", action=" + this.f39041b + ", transition=false, finishAffinity=true)";
    }
}
