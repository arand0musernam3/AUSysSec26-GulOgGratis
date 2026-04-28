package cn;

import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.app.tgtg.model.remote.item.response.CategoryCarouselMnuV2;
import com.app.tgtg.model.remote.manufacturer.request.CardsType;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8584d;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i11) {
        this.f8581a = i11;
        this.f8583c = obj;
        this.f8584d = obj2;
        this.f8582b = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8581a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                ym.y yVar = (ym.y) this.f8582b;
                CategoryCard categoryCard = (CategoryCard) this.f8584d;
                m3.s sVar = (m3.s) nVar;
                if (!sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.U();
                } else if (((CategoryCarouselMnuV2) this.f8583c).getCardsType() == CardsType.BRANDS) {
                    sVar.a0(-279014724);
                    jf.e.k(categoryCard, yVar, sVar, 0);
                    sVar.q(false);
                } else {
                    sVar.a0(-278848967);
                    na0.a.Q(categoryCard, yVar, sVar, 0);
                    sVar.q(false);
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lx.u.j((BaseItemMnuV2) this.f8583c, (String) this.f8584d, (ym.y) this.f8582b, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            default:
                String strM229unboximpl = ((ParcelDeliveryOptionId) obj).m229unboximpl();
                strM229unboximpl.getClass();
                ((i80.n) this.f8583c).invoke(ParcelDeliveryOptionId.m221boximpl(strM229unboximpl), (DeliveryOptionMethod) obj2, CollectionsKt.r0((List) this.f8584d));
                ((g9.d0) this.f8582b).invoke(null);
                break;
        }
        return Unit.f26487a;
    }
}
