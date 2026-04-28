package us;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import ss.c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f41538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t5.a f41539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f41540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b4.t f41541e;

    public /* synthetic */ m(c1 c1Var, t5.a aVar, b1 b1Var, b4.t tVar, int i11, int i12) {
        this.f41537a = i12;
        this.f41538b = c1Var;
        this.f41539c = aVar;
        this.f41540d = b1Var;
        this.f41541e = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41537a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(385);
                a.p(this.f41538b, this.f41539c, this.f41540d, this.f41541e, (m3.n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(385);
                a.f(this.f41538b, this.f41539c, this.f41540d, this.f41541e, (m3.n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
