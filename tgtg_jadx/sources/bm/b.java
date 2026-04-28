package bm;

import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6351b;

    public /* synthetic */ b(t tVar, int i11, int i12) {
        this.f6350a = i12;
        this.f6351b = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6350a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.c(this.f6351b, nVar, m3.i.F(1));
                break;
            case 1:
                gi.a.d(this.f6351b, nVar, m3.i.F(1));
                break;
            case 2:
                gi.a.c(this.f6351b, nVar, m3.i.F(1));
                break;
            case 3:
                gi.a.f(this.f6351b, nVar, m3.i.F(1));
                break;
            case 4:
                gi.a.a(this.f6351b, nVar, m3.i.F(1));
                break;
            case 5:
                gi.a.e(this.f6351b, nVar, m3.i.F(1));
                break;
            case 6:
                gi.a.b(this.f6351b, nVar, m3.i.F(1));
                break;
            case 7:
                lp.d.n(this.f6351b, nVar, m3.i.F(7));
                break;
            case 8:
                u00.d.e(this.f6351b, nVar, m3.i.F(7));
                break;
            case 9:
                v0.n.b(this.f6351b, nVar, m3.i.F(7));
                break;
            default:
                a.a.e(this.f6351b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
