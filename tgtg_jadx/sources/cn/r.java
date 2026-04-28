package cn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym.y f8578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8580e;

    public /* synthetic */ r(List list, ym.y yVar, int i11, Object obj, int i12) {
        this.f8576a = i12;
        this.f8577b = list;
        this.f8578c = yVar;
        this.f8579d = i11;
        this.f8580e = obj;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        CategoryCard categoryCard;
        int i12;
        switch (this.f8576a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                CategoryCarouselMnuV2 categoryCarouselMnuV2 = (CategoryCarouselMnuV2) this.f8580e;
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
                    CategoryCard categoryCard2 = (CategoryCard) this.f8577b.get(iIntValue);
                    sVar.a0(594744331);
                    ym.y yVar = this.f8578c;
                    boolean zH = sVar.h(yVar) | sVar.h(categoryCard2);
                    if ((((i11 & 112) ^ 48) <= 32 || !sVar.d(iIntValue)) && (i11 & 48) != 32) {
                        z11 = false;
                    }
                    boolean zD = zH | z11 | sVar.d(this.f8579d) | sVar.h(categoryCarouselMnuV2);
                    Object objM = sVar.M();
                    if (zD || objM == m3.m.f29332a) {
                        categoryCard = categoryCard2;
                        objM = new p(this.f8578c, categoryCard, iIntValue, this.f8579d, categoryCarouselMnuV2);
                        sVar.k0(objM);
                    } else {
                        categoryCard = categoryCard2;
                    }
                    nv.c.a((Function0) objM, u3.e.e(-1393267867, sVar, new s(categoryCarouselMnuV2, categoryCard, yVar, 0)), sVar, 48);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            default:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((m3.s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((m3.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                boolean z12 = true;
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f8577b.get(iIntValue3);
                    sVar2.a0(306557833);
                    ym.y yVar2 = this.f8578c;
                    boolean zH2 = sVar2.h(yVar2) | sVar2.h(baseItemMnuV2);
                    if ((((i12 & 112) ^ 48) <= 32 || !sVar2.d(iIntValue3)) && (i12 & 48) != 32) {
                        z12 = false;
                    }
                    int i13 = this.f8579d;
                    boolean zD2 = zH2 | z12 | sVar2.d(i13);
                    Object objM2 = sVar2.M();
                    if (zD2 || objM2 == m3.m.f29332a) {
                        objM2 = new t(yVar2, baseItemMnuV2, iIntValue3, i13);
                        sVar2.k0(objM2);
                    }
                    nv.c.a((Function0) objM2, u3.e.e(1768629126, sVar2, new s(baseItemMnuV2, (String) this.f8580e, yVar2, 1)), sVar2, 48);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
