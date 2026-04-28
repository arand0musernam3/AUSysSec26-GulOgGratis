package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18650a = 0;

    static {
        int i11 = l3.g1.f26963a;
        float f11 = l3.v0.f27164a;
        int i12 = l3.d0.f26930a;
        int i13 = l3.z.f27257a;
        int i14 = l3.f1.f26957a;
    }

    public static f2 a(p0 p0Var, long j9) {
        f2 f2Var = p0Var.f19263c0;
        if (f2Var != null) {
            return f2Var;
        }
        long j11 = i4.v.f23314g;
        f2 f2Var2 = new f2(j11, j9, j11, i4.v.b(l3.x0.f27213a, j9));
        p0Var.f19263c0 = f2Var2;
        return f2Var2;
    }
}
