package fn;

import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f17825b;

    public /* synthetic */ g(t tVar, int i11) {
        this.f17824a = i11;
        this.f17825b = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17824a) {
            case 0:
                lq.m mVar = (lq.m) obj;
                lq.l lVar = (lq.l) obj2;
                mVar.getClass();
                lVar.getClass();
                if (((mVar instanceof bq.k) || (mVar instanceof lq.p) || (mVar instanceof lq.s)) && (mVar.getItem() instanceof BasicItem)) {
                    mq.a item = mVar.getItem();
                    item.getClass();
                    BasicItem basicItem = (BasicItem) item;
                    String str = lVar.f28142g;
                    String str2 = null;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("displayType");
                        str = null;
                    }
                    String str3 = lVar.f28143h;
                    if (str3 != null) {
                        str2 = str3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("fillerType");
                    }
                    c cVarS = this.f17825b.s();
                    String strMo340getItemIdFvU5WIY = basicItem.getInformation().mo340getItemIdFvU5WIY();
                    f70.i iVar = f70.i.SCREEN_DISCOVER;
                    cVarS.getClass();
                    strMo340getItemIdFvU5WIY.getClass();
                    str2.getClass();
                    iVar.getClass();
                    cVarS.f17804k.b(strMo340getItemIdFvU5WIY, iVar, str2, str);
                }
                break;
            case 1:
                mq.a aVar = (mq.a) obj;
                lq.j jVar = (lq.j) obj2;
                aVar.getClass();
                jVar.getClass();
                if (aVar instanceof FlashSalesItem) {
                    c cVarS2 = this.f17825b.s();
                    String strMo340getItemIdFvU5WIY2 = ((FlashSalesItem) aVar).getInformation().mo340getItemIdFvU5WIY();
                    String str4 = jVar.f28129c;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fillerType");
                        str4 = null;
                    }
                    f70.i iVar2 = f70.i.UNKNOWN;
                    cVarS2.getClass();
                    strMo340getItemIdFvU5WIY2.getClass();
                    str4.getClass();
                    iVar2.getClass();
                    cVarS2.f17804k.b(strMo340getItemIdFvU5WIY2, iVar2, str4, null);
                }
                break;
            case 2:
                Order order = (Order) obj;
                int iIntValue = ((Integer) obj2).intValue();
                order.getClass();
                this.f17825b.s().f(order, iIntValue);
                break;
            case 3:
                BasicItem basicItem2 = (BasicItem) obj;
                String str5 = (String) obj2;
                basicItem2.getClass();
                str5.getClass();
                c cVarS3 = this.f17825b.s();
                String strMo340getItemIdFvU5WIY3 = basicItem2.getInformation().mo340getItemIdFvU5WIY();
                f70.i iVar3 = f70.i.HERO_COMPONENT;
                cVarS3.getClass();
                strMo340getItemIdFvU5WIY3.getClass();
                iVar3.getClass();
                cVarS3.f17804k.b(strMo340getItemIdFvU5WIY3, iVar3, str5, str5);
                break;
            case 4:
                mq.a aVar2 = (mq.a) obj;
                lq.j jVar2 = (lq.j) obj2;
                aVar2.getClass();
                jVar2.getClass();
                if (aVar2 instanceof FlashSalesItem) {
                    c cVarS4 = this.f17825b.s();
                    String strMo340getItemIdFvU5WIY4 = ((FlashSalesItem) aVar2).getInformation().mo340getItemIdFvU5WIY();
                    String str6 = jVar2.f28129c;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fillerType");
                        str6 = null;
                    }
                    f70.i iVar4 = f70.i.UNKNOWN;
                    cVarS4.getClass();
                    strMo340getItemIdFvU5WIY4.getClass();
                    str6.getClass();
                    iVar4.getClass();
                    cVarS4.f17804k.b(strMo340getItemIdFvU5WIY4, iVar4, str6, null);
                }
                break;
            default:
                m3.n nVar = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t tVar = this.f17825b;
                    boolean zBooleanValue = ((Boolean) tVar.f17851j.getValue()).booleanValue();
                    boolean zH = sVar.h(tVar);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zH || objM == fVar) {
                        objM = new e(tVar, 12);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(tVar);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new e(tVar, 13);
                        sVar.k0(objM2);
                    }
                    ox.h.f(null, null, zBooleanValue, function0, (Function0) objM2, null, null, null, sVar, 0, 227);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
