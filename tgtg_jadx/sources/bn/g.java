package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6459b;

    public /* synthetic */ g(BaseItemMnuV2 baseItemMnuV2, int i11, int i12) {
        this.f6458a = i12;
        this.f6459b = baseItemMnuV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6458a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                jb.u.p(this.f6459b, nVar, m3.i.F(1));
                break;
            case 1:
                jb.u.k(this.f6459b, nVar, m3.i.F(1));
                break;
            case 2:
                jb.u.j(this.f6459b, nVar, m3.i.F(1));
                break;
            case 3:
                lx.u.f(this.f6459b, nVar, m3.i.F(1));
                break;
            case 4:
                lx.u.e(this.f6459b, nVar, m3.i.F(1));
                break;
            case 5:
                lx.u.o(this.f6459b, nVar, m3.i.F(1));
                break;
            case 6:
                m0.c.H(this.f6459b, nVar, m3.i.F(1));
                break;
            case 7:
                m0.c.E(this.f6459b, nVar, m3.i.F(1));
                break;
            case 8:
                o30.e0.g(this.f6459b, nVar, m3.i.F(1));
                break;
            case 9:
                o30.e0.d(this.f6459b, nVar, m3.i.F(1));
                break;
            default:
                o30.e0.n(this.f6459b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
