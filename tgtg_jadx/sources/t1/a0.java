package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f39353b;

    public a0(float f11, float f12, float f13) {
        this.f39352a = f13;
        a1 a1Var = new a1();
        a1Var.f39354a = 1.0f;
        a1Var.f39355b = Math.sqrt(50.0d);
        a1Var.f39356c = 1.0f;
        if (f11 < 0.0f) {
            o0.a("Damping ratio must be non-negative");
        }
        a1Var.f39356c = f11;
        double d3 = a1Var.f39355b;
        if (((float) (d3 * d3)) <= 0.0f) {
            o0.a("Spring stiffness constant must be positive.");
        }
        a1Var.f39355b = Math.sqrt(f12);
        this.f39353b = a1Var;
    }

    @Override // t1.y
    public final float b(float f11, float f12, long j9, float f13) {
        a1 a1Var = this.f39353b;
        a1Var.f39354a = f12;
        return Float.intBitsToFloat((int) (a1Var.a(f11, f13, j9 / 1000000) >> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // t1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r33, float r34, float r35) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.a0.c(float, float, float):long");
    }

    @Override // t1.y
    public final float d(float f11, float f12, float f13) {
        return 0.0f;
    }

    @Override // t1.y
    public final float e(float f11, float f12, long j9, float f13) {
        a1 a1Var = this.f39353b;
        a1Var.f39354a = f12;
        return Float.intBitsToFloat((int) (a1Var.a(f11, f13, j9 / 1000000) & 4294967295L));
    }
}
