package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f14310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f14311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f14312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i2 f14313f;

    public p0(long j9, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f14308a = j9;
        this.f14309b = str;
        this.f14310c = d2Var;
        this.f14311d = e2Var;
        this.f14312e = f2Var;
        this.f14313f = i2Var;
    }

    public final o0 a() {
        o0 o0Var = new o0();
        o0Var.f14297a = this.f14308a;
        o0Var.f14298b = this.f14309b;
        o0Var.f14299c = this.f14310c;
        o0Var.f14300d = this.f14311d;
        o0Var.f14301e = this.f14312e;
        o0Var.f14302f = this.f14313f;
        o0Var.f14303g = (byte) 1;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            if (this.f14308a == p0Var.f14308a && this.f14309b.equals(p0Var.f14309b) && this.f14310c.equals(p0Var.f14310c) && this.f14311d.equals(p0Var.f14311d)) {
                f2 f2Var = p0Var.f14312e;
                f2 f2Var2 = this.f14312e;
                if (f2Var2 != null ? f2Var2.equals(f2Var) : f2Var == null) {
                    i2 i2Var = p0Var.f14313f;
                    i2 i2Var2 = this.f14313f;
                    if (i2Var2 != null ? i2Var2.equals(i2Var) : i2Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f14308a;
        int iHashCode = (((((((((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * 1000003) ^ this.f14309b.hashCode()) * 1000003) ^ this.f14310c.hashCode()) * 1000003) ^ this.f14311d.hashCode()) * 1000003;
        f2 f2Var = this.f14312e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f14313f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f14308a + ", type=" + this.f14309b + ", app=" + this.f14310c + ", device=" + this.f14311d + ", log=" + this.f14312e + ", rollouts=" + this.f14313f + "}";
    }
}
