package yi;

import androidx.lifecycle.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f45961b;

    public /* synthetic */ b(r rVar, int i11) {
        this.f45960a = i11;
        this.f45961b = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45960a) {
            case 0:
                cj.e0 e0VarU = this.f45961b.u();
                v80.f0.B(m1.d(e0VarU), null, null, new cj.r(e0VarU, null, 4), 3);
                break;
            case 1:
                cj.e0 e0VarU2 = this.f45961b.u();
                v80.f0.B(m1.d(e0VarU2), null, null, new cj.r(e0VarU2, null, 4), 3);
                break;
            case 2:
                r rVar = this.f45961b;
                cj.q qVarV = rVar.v();
                v80.f0.B(m1.d(qVarV), null, null, new cj.j(qVarV, rVar, null), 3);
                rVar.v().r();
                break;
            case 3:
                r rVar2 = this.f45961b;
                rVar2.dismiss();
                v vVar = rVar2.f46020k;
                if (vVar != null) {
                    vVar.b();
                }
                break;
            case 4:
                r rVar3 = this.f45961b;
                cj.e0 e0VarU3 = rVar3.u();
                v80.f0.B(m1.d(e0VarU3), null, null, new cj.z(e0VarU3, false, (x70.c) null), 3);
                um.h hVar = rVar3.l;
                if (hVar != null) {
                    hVar.a();
                }
                rVar3.w();
                break;
            case 5:
                r rVar4 = this.f45961b;
                rVar4.x();
                rVar4.dismiss();
                v vVar2 = rVar4.f46020k;
                if (vVar2 != null) {
                    vVar2.b();
                }
                break;
            default:
                r rVar5 = this.f45961b;
                rVar5.u().m(cv.i.SCREEN_PUDO_LIST);
                g9.f0 f0Var = rVar5.f46018i;
                if (f0Var != null) {
                    g9.p.f(f0Var, aj.e.PARCEL_PICKUP_OPTIONS.a());
                }
                break;
        }
        return Unit.f26487a;
    }
}
