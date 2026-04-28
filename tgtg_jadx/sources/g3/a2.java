package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f18308c;

    public /* synthetic */ a2(int i11, int i12, Function0 function0) {
        this.f18306a = i12;
        this.f18308c = function0;
        this.f18307b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f18306a) {
            case 0:
                num.getClass();
                s0.k(this.f18308c, nVar, m3.i.F(this.f18307b | 1));
                break;
            case 1:
                num.getClass();
                jk.d.e(this.f18307b, this.f18308c, nVar, m3.i.F(1));
                break;
            case 2:
                num.getClass();
                w0.e.h(this.f18307b, this.f18308c, nVar, m3.i.F(1));
                break;
            case 3:
                num.getClass();
                ox.h.i(this.f18307b, this.f18308c, nVar, m3.i.F(1));
                break;
            case 4:
                num.getClass();
                nn.q.j(this.f18307b, this.f18308c, nVar, m3.i.F(1));
                break;
            case 5:
                num.getClass();
                oo.a.b(this.f18308c, nVar, m3.i.F(this.f18307b | 1));
                break;
            case 6:
                num.getClass();
                oo.a.i(this.f18308c, nVar, m3.i.F(this.f18307b | 1));
                break;
            case 7:
                num.getClass();
                oo.a.V(this.f18307b, this.f18308c, nVar, m3.i.F(1));
                break;
            case 8:
                num.intValue();
                p30.b.h(this.f18308c, nVar, m3.i.F(this.f18307b | 1));
                break;
            default:
                num.intValue();
                u00.d.j(this.f18308c, nVar, m3.i.F(this.f18307b | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a2(int i11, Function0 function0, int i12, int i13) {
        this.f18306a = i13;
        this.f18307b = i11;
        this.f18308c = function0;
    }
}
