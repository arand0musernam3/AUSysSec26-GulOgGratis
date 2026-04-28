package ki;

import b4.q;
import b4.t;
import c5.d2;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.CharityItem;
import d2.m2;
import d2.w;
import d2.y;
import g3.r9;
import g3.s0;
import i4.g0;
import i80.n;
import kotlin.Unit;
import lv.v;
import m3.s;
import o30.f0;
import s1.z;
import x5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityItem f26377b;

    public /* synthetic */ b(CharityItem charityItem, int i11) {
        this.f26376a = i11;
        this.f26377b = charityItem;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f26376a;
        q qVar = q.f5711a;
        CharityItem charityItem = this.f26377b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, nVar, 0);
                s sVar = (s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                t tVarC = b4.a.c(qVar, nVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, nVar);
                m3.i.C(iVarL, b5.i.f5842e, nVar);
                m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar);
                t tVarJ = d2.j(qVar, "Allergens");
                String strU = f0.U(nVar, R.string.webview_ingredients_and_allergens_title);
                AllergensInfo allergensInfo = charityItem.getInformation().getAllergensInfo();
                String strU2 = f0.U(nVar, (allergensInfo != null ? allergensInfo.getUrl() : null) != null ? R.string.charity_item_allergens : R.string.charity_item_no_allergens);
                AllergensInfo allergensInfo2 = charityItem.getInformation().getAllergensInfo();
                j.e(tVarJ, strU, strU2, allergensInfo2 != null ? allergensInfo2.getUrl() : null, false, nVar, 24582, 0);
                s0.g(d2.j(qVar, "AllergensDivider"), 1, lv.s.H, nVar, 438, 0);
                sVar.q(true);
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                t tVarD = d2.c.D(v1.n.j(m2.d(m2.t(qVar, 3), 1.0f), lv.s.J, g0.f23254b), 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7);
                String storeNameAndBranch = mv.d.m(charityItem).getStoreNameAndBranch();
                if (storeNameAndBranch == null) {
                    storeNameAndBranch = "";
                }
                r9.d(storeNameAndBranch, tVarD, lv.s.C, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28270i, nVar2, 432, 12582912, 130040);
                break;
        }
        return Unit.f26487a;
    }
}
