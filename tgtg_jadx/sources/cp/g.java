package cp;

import b4.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o30.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f13380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13381c;

    public /* synthetic */ g(String str, t tVar, int i11, int i12) {
        this.f13379a = i12;
        this.f13380b = tVar;
        this.f13381c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f13379a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.d(this.f13380b, this.f13381c, nVar, m3.i.F(1));
                break;
            case 1:
                a.d(this.f13380b, this.f13381c, nVar, m3.i.F(1));
                break;
            case 2:
                gn.a.a(this.f13380b, this.f13381c, nVar, m3.i.F(7));
                break;
            case 3:
                gn.a.d(this.f13380b, this.f13381c, nVar, m3.i.F(1));
                break;
            case 4:
                gn.a.d(this.f13380b, this.f13381c, nVar, m3.i.F(1));
                break;
            case 5:
                ji.i.a(this.f13380b, this.f13381c, nVar, m3.i.F(1));
                break;
            default:
                e0.f(this.f13380b, this.f13381c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
