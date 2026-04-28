package cn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.y f8535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TypedItemCardsCarouselMnu f8537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym.z f8540g;

    public h0(List list, ym.y yVar, int i11, TypedItemCardsCarouselMnu typedItemCardsCarouselMnu, int i12, boolean z11, ym.z zVar) {
        this.f8534a = list;
        this.f8535b = yVar;
        this.f8536c = i11;
        this.f8537d = typedItemCardsCarouselMnu;
        this.f8538e = i12;
        this.f8539f = z11;
        this.f8540g = zVar;
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
            BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f8534a.get(iIntValue);
            sVar.a0(2019749262);
            boolean zH = sVar.h(this.f8535b) | sVar.h(baseItemMnuV2);
            if ((((i11 & 112) ^ 48) <= 32 || !sVar.d(iIntValue)) && (i11 & 48) != 32) {
                z11 = false;
            }
            boolean zD = zH | z11 | sVar.d(this.f8536c);
            TypedItemCardsCarouselMnu typedItemCardsCarouselMnu = this.f8537d;
            boolean zH2 = zD | sVar.h(typedItemCardsCarouselMnu);
            Object objM = sVar.M();
            if (zH2 || objM == m3.m.f29332a) {
                objM = new p(this.f8535b, baseItemMnuV2, iIntValue, this.f8536c, typedItemCardsCarouselMnu);
                sVar.k0(objM);
            }
            nv.c.a((Function0) objM, u3.e.e(-739893784, sVar, new g0(baseItemMnuV2, this.f8538e, this.f8539f, this.f8535b, this.f8540g)), sVar, 48);
            sVar.q(false);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
