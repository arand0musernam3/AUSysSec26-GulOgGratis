package i2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements z1.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f22866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1.u f22867c;

    public k(e0 e0Var, z1.u uVar) {
        this.f22866b = e0Var;
        this.f22867c = uVar;
    }

    @Override // z1.u
    public final float a(float f11, float f12, float f13) {
        float fA = this.f22867c.a(f11, f12, f13);
        boolean z11 = false;
        if (f11 <= 0.0f ? f11 + f12 <= 0.0f : f11 + f12 > f13) {
            z11 = true;
        }
        float fAbs = Math.abs(fA);
        e0 e0Var = this.f22866b;
        if (fAbs == 0.0f || !z11) {
            if (Math.abs(e0Var.f22824f) < 1.0E-6d) {
                return 0.0f;
            }
            float fQ = e0Var.f22824f * (-1.0f);
            if (((Boolean) e0Var.G.getValue()).booleanValue()) {
                fQ += e0Var.q();
            }
            return n80.p.b(fQ, -f13, f13);
        }
        float fQ2 = e0Var.f22824f * (-1);
        while (fA > 0.0f && fQ2 < fA) {
            fQ2 += e0Var.q();
        }
        while (fA < 0.0f && fQ2 > fA) {
            fQ2 -= e0Var.q();
        }
        return fQ2;
    }
}
