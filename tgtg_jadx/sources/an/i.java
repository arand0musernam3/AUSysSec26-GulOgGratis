package an;

import b4.q;
import b4.t;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import d2.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import ym.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ElementMnuV2 f1644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f1647e;

    public /* synthetic */ i(ElementMnuV2 elementMnuV2, String str, int i11, y yVar, int i12) {
        this.f1643a = i12;
        this.f1644b = elementMnuV2;
        this.f1645c = str;
        this.f1646d = i11;
        this.f1647e = yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1643a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jf.e.g(this.f1644b, this.f1645c, this.f1646d, this.f1647e, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f11 = 24;
                    t tVarB = f4.g.b(q.f5711a, l2.g.c(f11, 0.0f, 0.0f, f11, 6));
                    d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    t tVarC = b4.a.c(tVarB, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar2);
                    jf.e.h(this.f1644b, this.f1645c, this.f1646d, this.f1647e, sVar2, 0);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                jf.e.g(this.f1644b, this.f1645c, this.f1646d, this.f1647e, (n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                jf.e.h(this.f1644b, this.f1645c, this.f1646d, this.f1647e, (n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i(ElementMnuV2 elementMnuV2, String str, int i11, y yVar, int i12, int i13) {
        this.f1643a = i13;
        this.f1644b = elementMnuV2;
        this.f1645c = str;
        this.f1646d = i11;
        this.f1647e = yVar;
    }
}
