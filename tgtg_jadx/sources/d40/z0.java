package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14410d;

    public z0(int i11, int i12, String str, boolean z11) {
        this.f14407a = str;
        this.f14408b = i11;
        this.f14409c = i12;
        this.f14410d = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            z0 z0Var = (z0) ((c2) obj);
            if (this.f14407a.equals(z0Var.f14407a) && this.f14408b == z0Var.f14408b && this.f14409c == z0Var.f14409c && this.f14410d == z0Var.f14410d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14407a.hashCode() ^ 1000003) * 1000003) ^ this.f14408b) * 1000003) ^ this.f14409c) * 1000003) ^ (this.f14410d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f14407a);
        sb2.append(", pid=");
        sb2.append(this.f14408b);
        sb2.append(", importance=");
        sb2.append(this.f14409c);
        sb2.append(", defaultProcess=");
        return j4.s.o(sb2, this.f14410d, "}");
    }
}
