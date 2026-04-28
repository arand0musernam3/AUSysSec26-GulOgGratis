package k00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25692a;

    public t0(boolean z11) {
        this.f25692a = z11;
    }

    @Override // k00.y0
    public final int a() {
        return y0.e((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        int iA = y0Var.a();
        int iE = y0.e((byte) -32);
        if (iE != iA) {
            return iE - y0Var.a();
        }
        return (true != this.f25692a ? 20 : 21) - (true != ((t0) y0Var).f25692a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t0.class == obj.getClass() && this.f25692a == ((t0) obj).f25692a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y0.e((byte) -32)), Boolean.valueOf(this.f25692a)});
    }

    public final String toString() {
        return Boolean.toString(this.f25692a);
    }
}
