package j30;

import java.io.Serializable;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements l, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24524a;

    public o(Object obj) {
        this.f24524a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return u.B(this.f24524a, ((o) obj).f24524a);
        }
        return false;
    }

    @Override // j30.l
    public final Object get() {
        return this.f24524a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24524a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f24524a + ")";
    }
}
