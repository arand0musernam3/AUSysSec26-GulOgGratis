package ap;

import android.net.Uri;
import b0.z;
import b4.q;
import bp.v;
import com.app.tgtg.R;
import i80.o;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.s;
import o30.f0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f4526b;

    public /* synthetic */ d(n nVar, int i11) {
        this.f4525a = i11;
        this.f4526b = nVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws IOException {
        int i11 = this.f4525a;
        n nVar = this.f4526b;
        switch (i11) {
            case 0:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                zz.f.f(R.string.rating_category_title_collection, v.COLLECTION, nVar, (m3.n) obj3, 48);
                break;
            case 1:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                zz.f.f(R.string.rating_category_title_quality, v.QUALITY, nVar, (m3.n) obj3, 48);
                break;
            case 2:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                zz.f.f(R.string.rating_category_title_variety, v.VARIETY, nVar, (m3.n) obj3, 48);
                break;
            case 3:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                zz.f.f(R.string.rating_category_title_quantity, v.QUANTITY, nVar, (m3.n) obj3, 48);
                break;
            case 4:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                z.p(nVar, (m3.n) obj3, 0);
                break;
            case 5:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                bx.o.G(nVar, (m3.n) obj3, 0);
                break;
            case 6:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                bx.k.l(nVar, (m3.n) obj3, 0);
                break;
            case 7:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                b0.a0.f(bp.b.SHOPPED_BEFORE, nVar, (m3.n) obj3, 6);
                break;
            case 8:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                b0.a0.f(bp.b.RETURN_FOR_SURPRISE_BAG, nVar, (m3.n) obj3, 6);
                break;
            case 9:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                b0.a0.f(bp.b.BOUGHT_MORE, nVar, (m3.n) obj3, 6);
                break;
            case 10:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                a.a.j(nVar, (m3.n) obj3, 0);
                break;
            case 11:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                b0.a0.f(bp.b.BUY_AGAIN, nVar, (m3.n) obj3, 6);
                break;
            default:
                Uri uri = (Uri) obj2;
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                q qVar = q.f5711a;
                m3.f fVar = m3.m.f29332a;
                if (uri == null) {
                    s sVar = (s) nVar2;
                    sVar.a0(1021787417);
                    String strU = f0.U(sVar, R.string.rating_cta_skip_question);
                    boolean zH = sVar.h(nVar);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new h(nVar, 7);
                        sVar.k0(objM);
                    }
                    v0.n.o(qVar, strU, null, null, null, false, (Function0) objM, sVar, 6, 0, 1020);
                    sVar.q(false);
                } else {
                    s sVar2 = (s) nVar2;
                    sVar2.a0(1022045182);
                    String strU2 = f0.U(sVar2, R.string.rating_cta_continue);
                    boolean zH2 = sVar2.h(nVar);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new h(nVar, 4);
                        sVar2.k0(objM2);
                    }
                    v0.n.l(qVar, strU2, null, null, null, false, false, null, null, (Function0) objM2, sVar2, 6, 508);
                    sVar2.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
