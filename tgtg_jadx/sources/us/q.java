package us;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ss.d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f41549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t5.a f41550c;

    public /* synthetic */ q(d1 d1Var, t5.a aVar, int i11, int i12) {
        this.f41548a = i12;
        this.f41549b = d1Var;
        this.f41550c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41548a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.q(this.f41549b, this.f41550c, nVar, m3.i.F(1));
                break;
            default:
                a.g(this.f41549b, this.f41550c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
