package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f14146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14149d;

    public e1(f1 f1Var, String str, String str2, long j9) {
        this.f14146a = f1Var;
        this.f14147b = str;
        this.f14148c = str2;
        this.f14149d = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f14146a.equals(e1Var.f14146a) && this.f14147b.equals(e1Var.f14147b) && this.f14148c.equals(e1Var.f14148c) && this.f14149d == e1Var.f14149d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f14146a.hashCode() ^ 1000003) * 1000003) ^ this.f14147b.hashCode()) * 1000003) ^ this.f14148c.hashCode()) * 1000003;
        long j9 = this.f14149d;
        return iHashCode ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f14146a);
        sb2.append(", parameterKey=");
        sb2.append(this.f14147b);
        sb2.append(", parameterValue=");
        sb2.append(this.f14148c);
        sb2.append(", templateVersion=");
        return w.a0.j(this.f14149d, "}", sb2);
    }
}
