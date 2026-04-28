package cp;

import a3.u1;
import b4.q;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13367a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f13368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f13369c;

    public /* synthetic */ b(c cVar, Function0 function0) {
        this.f13368b = cVar;
        this.f13369c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13367a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s0.b(f4.g.k(q.f5711a, 6, l2.g.b(12), false, 0L, 0L, 28), null, null, null, null, u3.e.e(1216384682, sVar, new u1(this.f13368b, this.f13369c, false, 2)), sVar, 196608, 30);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.a(this.f13368b, this.f13369c, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(c cVar, Function0 function0, int i11) {
        this.f13368b = cVar;
        this.f13369c = function0;
    }
}
