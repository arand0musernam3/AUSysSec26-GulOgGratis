package vi;

import b4.t;
import i4.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f42367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f42368c;

    public /* synthetic */ g(t tVar, k0 k0Var, int i11, int i12) {
        this.f42366a = i12;
        this.f42367b = tVar;
        this.f42368c = k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f42366a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                c.n(this.f42367b, this.f42368c, nVar, m3.i.F(1));
                break;
            default:
                c.k(this.f42367b, this.f42368c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
