package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f46496a;

    public f0(g0 g0Var) {
        this.f46496a = g0Var;
    }

    @Override // z1.q2
    public final float a(float f11) {
        if (Float.isNaN(f11)) {
            return 0.0f;
        }
        g0 g0Var = this.f46496a;
        float fFloatValue = ((Number) g0Var.f46514a.invoke(Float.valueOf(f11))).floatValue();
        g0Var.f46518e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        g0Var.f46519f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
