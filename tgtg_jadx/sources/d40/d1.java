package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f14135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f14139e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f14139e == 1 && (f1Var = this.f14135a) != null && (str = this.f14136b) != null && (str2 = this.f14137c) != null) {
            return new e1(f1Var, str, str2, this.f14138d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f14135a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f14136b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f14137c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f14139e) == 0) {
            sb2.append(" templateVersion");
        }
        com.braze.h2.b(w.a0.q("Missing required properties:", sb2));
        return null;
    }
}
