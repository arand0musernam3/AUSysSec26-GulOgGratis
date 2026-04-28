package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18457a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f18458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f18459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2.z1 f18460d;

    public /* synthetic */ d6(Function2 function2, Function2 function22, d2.z1 z1Var) {
        this.f18458b = function2;
        this.f18459c = function22;
        this.f18460d = z1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f18457a) {
            case 0:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g6.b(this.f18458b, this.f18459c, this.f18460d, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                num.getClass();
                g6.b(this.f18458b, this.f18459c, this.f18460d, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d6(Function2 function2, Function2 function22, d2.z1 z1Var, int i11) {
        this.f18458b = function2;
        this.f18459c = function22;
        this.f18460d = z1Var;
    }
}
