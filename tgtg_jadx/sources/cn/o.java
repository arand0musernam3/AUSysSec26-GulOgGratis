package cn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.y f8561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdapterItemType f8562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ElementMnuV2 f8564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8565f;

    public o(List list, ym.y yVar, AdapterItemType adapterItemType, int i11, ElementMnuV2 elementMnuV2, String str) {
        this.f8560a = list;
        this.f8561b = yVar;
        this.f8562c = adapterItemType;
        this.f8563d = i11;
        this.f8564e = elementMnuV2;
        this.f8565f = str;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        f2.d dVar = (f2.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        m3.n nVar = (m3.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((m3.s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
        }
        boolean z11 = true;
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
            BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f8560a.get(iIntValue);
            sVar.a0(-259965004);
            ym.y yVar = this.f8561b;
            boolean zH = sVar.h(yVar) | sVar.d(this.f8562c.ordinal()) | sVar.h(baseItemMnuV2);
            if ((((i11 & 112) ^ 48) <= 32 || !sVar.d(iIntValue)) && (i11 & 48) != 32) {
                z11 = false;
            }
            boolean zD = zH | z11 | sVar.d(this.f8563d);
            Object objM = sVar.M();
            if (zD || objM == m3.m.f29332a) {
                objM = new p(this.f8561b, this.f8562c, baseItemMnuV2, iIntValue, this.f8563d);
                sVar.k0(objM);
            }
            nv.c.a((Function0) objM, u3.e.e(1917882208, sVar, new q(this.f8564e, baseItemMnuV2, this.f8565f, yVar)), sVar, 48);
            sVar.q(false);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
