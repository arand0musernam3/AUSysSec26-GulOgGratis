package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f19124b;

    public /* synthetic */ n(w6 w6Var, int i11) {
        this.f19123a = i11;
        this.f19124b = w6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19123a) {
            case 0:
                i4.s0 s0Var = (i4.s0) obj;
                z1.r rVar = this.f19124b.f19706e;
                float fH = rVar.f46655j.h();
                float fE = ((z1.a0) rVar.d()).e();
                float f11 = fH < fE ? fE - fH : 0.0f;
                s0Var.p(f11 > 0.0f ? (Float.intBitsToFloat((int) (s0Var.f23297q & 4294967295L)) + f11) / Float.intBitsToFloat((int) (4294967295L & s0Var.f23297q)) : 1.0f);
                s0Var.w(i4.g0.h(0.5f, 0.0f));
                return Unit.f26487a;
            case 1:
                i4.s0 s0Var2 = (i4.s0) obj;
                z1.r rVar2 = this.f19124b.f19706e;
                float fH2 = rVar2.f46655j.h();
                float fE2 = ((z1.a0) rVar2.d()).e();
                float f12 = fH2 < fE2 ? fE2 - fH2 : 0.0f;
                s0Var2.p(f12 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (s0Var2.f23297q & 4294967295L)) + f12) / Float.intBitsToFloat((int) (s0Var2.f23297q & 4294967295L))) : 1.0f);
                s0Var2.w(i4.g0.h(0.5f, 0.0f));
                return Unit.f26487a;
            default:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) this.f19124b.f19703b.invoke()).floatValue());
        }
    }
}
