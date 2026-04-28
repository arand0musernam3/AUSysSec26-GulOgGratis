package dm;

import b4.t;
import ki.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f14980c;

    public /* synthetic */ g(t tVar, Function0 function0, int i11, int i12) {
        this.f14978a = i12;
        this.f14979b = tVar;
        this.f14980c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f14978a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                z20.b.g(i.F(1), this.f14979b, this.f14980c, nVar);
                break;
            case 1:
                jh.f.f(i.F(1), this.f14979b, this.f14980c, nVar);
                break;
            case 2:
                j.k(i.F(7), this.f14979b, this.f14980c, nVar);
                break;
            default:
                qi.a.a(i.F(1), this.f14979b, this.f14980c, nVar);
                break;
        }
        return Unit.f26487a;
    }
}
