package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f44901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44902b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44903c = a();

    public k4(l4 l4Var) {
        this.f44901a = l4Var;
    }

    public final long a() {
        l4 l4Var = this.f44901a;
        com.google.android.gms.common.internal.i0.h(l4Var);
        long jLongValue = ((Long) g0.f44812v.a(null)).longValue();
        long jLongValue2 = ((Long) g0.f44814w.a(null)).longValue();
        for (int i11 = 1; i11 < this.f44902b; i11++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        l4Var.c().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
