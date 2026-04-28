package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18901a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f18903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f18904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f18907g;

    public /* synthetic */ j7(b4.t tVar, long j9, long j11, i80.n nVar, Function2 function2, Function2 function22, int i11) {
        this.f18902b = tVar;
        this.f18906f = j9;
        this.f18907g = j11;
        this.f18905e = nVar;
        this.f18903c = function2;
        this.f18904d = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18901a) {
            case 0:
                u3.d dVar = (u3.d) this.f18902b;
                m5.u0 u0Var = (m5.u0) this.f18905e;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.a0(-168976609);
                    l7.a(dVar, this.f18903c, this.f18904d, u0Var, this.f18906f, this.f18907g, sVar, 0);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                l7.a((u3.d) this.f18902b, this.f18903c, this.f18904d, (m5.u0) this.f18905e, this.f18906f, this.f18907g, (m3.n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                b9.b((b4.t) this.f18902b, this.f18906f, this.f18907g, (i80.n) this.f18905e, this.f18903c, this.f18904d, (m3.n) obj, m3.i.F(1572871));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j7(Function2 function2, u3.d dVar, Function2 function22, m5.u0 u0Var, long j9, long j11) {
        this.f18903c = function2;
        this.f18902b = dVar;
        this.f18904d = function22;
        this.f18905e = u0Var;
        this.f18906f = j9;
        this.f18907g = j11;
    }

    public /* synthetic */ j7(u3.d dVar, Function2 function2, Function2 function22, m5.u0 u0Var, long j9, long j11, int i11) {
        this.f18902b = dVar;
        this.f18903c = function2;
        this.f18904d = function22;
        this.f18905e = u0Var;
        this.f18906f = j9;
        this.f18907g = j11;
    }
}
