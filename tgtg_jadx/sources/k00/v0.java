package k00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25697a;

    public v0(long j9) {
        this.f25697a = j9;
    }

    @Override // k00.y0
    public final int a() {
        return y0.e(this.f25697a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        if (a() != y0Var.a()) {
            return a() - y0Var.a();
        }
        long jAbs = Math.abs(this.f25697a);
        long jAbs2 = Math.abs(((v0) y0Var).f25697a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v0.class == obj.getClass() && this.f25697a == ((v0) obj).f25697a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.f25697a)});
    }

    public final String toString() {
        return Long.toString(this.f25697a);
    }
}
