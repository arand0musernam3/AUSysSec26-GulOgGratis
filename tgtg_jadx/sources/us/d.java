package us;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ss.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f41516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t5.a f41517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4.t f41518d;

    public /* synthetic */ d(j1 j1Var, t5.a aVar, b4.t tVar, int i11, int i12) {
        this.f41515a = i12;
        this.f41516b = j1Var;
        this.f41517c = aVar;
        this.f41518d = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41515a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.o(this.f41516b, this.f41517c, this.f41518d, nVar, m3.i.F(1));
                break;
            default:
                a.e(this.f41516b, this.f41517c, this.f41518d, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
