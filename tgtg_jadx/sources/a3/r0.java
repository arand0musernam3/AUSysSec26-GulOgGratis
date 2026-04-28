package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u3.d f544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j2 f545d;

    public /* synthetic */ r0(j2 j2Var, s2 s2Var, u3.d dVar) {
        this.f545d = j2Var;
        this.f543b = s2Var;
        this.f544c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f542a;
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s2 s2Var = this.f543b;
                    u3.d dVar = this.f544c;
                    j2 j2Var = this.f545d;
                    m2.g0.g(j2Var, u3.e.e(-284825865, sVar, new r0(s2Var, dVar, j2Var)), sVar, 48);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m3.i.a(t2.f577a.a(this.f543b), u3.e.e(610483127, sVar2, new o0(this.f544c, this.f545d)), sVar2, 56);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ r0(s2 s2Var, u3.d dVar, j2 j2Var) {
        this.f543b = s2Var;
        this.f544c = dVar;
        this.f545d = j2Var;
    }
}
