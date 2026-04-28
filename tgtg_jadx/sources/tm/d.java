package tm;

import android.net.Uri;
import ao.r1;
import b2.h;
import b2.l;
import ba0.g;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.local.SnackBarType;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.manufacturer.request.BasketRequest;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.mapService.request.LocationRequest;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.support.RefundType;
import com.braze.h2;
import f2.c0;
import g3.g7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.y0;
import m3.b1;
import org.bouncycastle.iana.AEADAlgorithm;
import u70.o;
import u70.p;
import u70.q;
import ui.m3;
import uk.r;
import um.t;
import v80.i1;
import w2.b0;
import w2.s1;
import w2.z;
import xj.k;
import y80.e1;
import y9.p0;
import ym.w;
import z1.n;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f40303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40304k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f40305m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40303j = i11;
        this.l = obj;
        this.f40305m = obj2;
    }

    private final Object a(Object obj) {
        Object obj2;
        LatestBasketInteraction latestBasketInteraction;
        w wVar = (w) this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f40304k;
        if (i11 == 0) {
            g.M(obj);
            r1 r1Var = wVar.f46253a;
            BasketRequest basketRequest = (BasketRequest) this.f40305m;
            this.f40304k = 1;
            Object objI = r1Var.i(basketRequest, this);
            if (objI == aVar) {
                return aVar;
            }
            obj2 = objI;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            obj2 = ((q) obj).f40851a;
        }
        o oVar = q.f40850b;
        if (!(obj2 instanceof p)) {
            BasketResponse basketResponse = (BasketResponse) obj2;
            int i12 = 127;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            long j9 = 0;
            long j11 = 0;
            int i13 = 0;
            LatestBasketInteraction latestBasketInteraction2 = null;
            LatestInteractionOrigin latestInteractionOrigin = null;
            wVar.f46273v = new BasketManager(null, str, j9, j11, i13, latestBasketInteraction2, latestInteractionOrigin, i12, defaultConstructorMarker).restoreBasketManager(wVar.f46272u, wVar.b());
            BasketManager basketManagerRestoreBasketManager = new BasketManager(null, str, j9, j11, i13, latestBasketInteraction2, latestInteractionOrigin, i12, defaultConstructorMarker).restoreBasketManager(wVar.c(), wVar.b());
            if (basketManagerRestoreBasketManager != null && (latestBasketInteraction = basketManagerRestoreBasketManager.getLatestBasketInteraction()) != null) {
                cv.b bVar = wVar.f46255c;
                cv.i iVar = cv.i.ACTION_CALL_BASKET;
                Pair pair = new Pair(dv.a.BASKET_ID, new dv.c(basketManagerRestoreBasketManager.m184getBasketIdM00Rnn0(wVar.f46254b.m().m285getUserId8nKqa5U())));
                dv.a aVar2 = dv.a.ITEMS;
                List<dv.b> trackingItem = basketResponse.getTrackingItem(basketResponse.getBasketItems());
                trackingItem.getClass();
                ArrayList arrayList = new ArrayList(e0.o(trackingItem, 10));
                Iterator<T> it = trackingItem.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dv.b) it.next()).c());
                }
                Pair pair2 = new Pair(aVar2, new dv.c(arrayList));
                dv.a aVar3 = dv.a.SCREEN;
                LatestInteractionOrigin latestInteractionOrigin2 = basketManagerRestoreBasketManager.getLatestInteractionOrigin();
                Pair pair3 = new Pair(aVar3, new dv.c(latestInteractionOrigin2 != null ? latestInteractionOrigin2.getTrackingValue() : null));
                Pair pair4 = new Pair(dv.a.ACTION_TYPE, new dv.c(latestBasketInteraction.getTrackingValue()));
                dv.a aVar4 = dv.a.CURRENCY;
                Price basketSubtotalPrice = basketResponse.getBasketSubtotalPrice();
                Pair pair5 = new Pair(aVar4, new dv.c(basketSubtotalPrice != null ? basketSubtotalPrice.getCurrency() : null));
                Pair pair6 = new Pair(dv.a.TOTAL_QUANTITY, new dv.c(Integer.valueOf(basketManagerRestoreBasketManager.getTotalBasketItems())));
                dv.a aVar5 = dv.a.TOTAL_PRICE;
                Price basketSubtotalPrice2 = basketResponse.getBasketSubtotalPrice();
                Pair pair7 = new Pair(aVar5, new dv.c(basketSubtotalPrice2 != null ? Double.valueOf(basketSubtotalPrice2.getValue()) : null));
                dv.a aVar6 = dv.a.MOV_THRESHOLD;
                Price requiredAmountToCheckout = basketResponse.getRequiredAmountToCheckout();
                Pair pair8 = new Pair(aVar6, new dv.c(requiredAmountToCheckout != null ? Double.valueOf(requiredAmountToCheckout.getValue()) : null));
                dv.a aVar7 = dv.a.IS_MOV_ACHIEVED;
                Price basketSubtotalPrice3 = basketResponse.getBasketSubtotalPrice();
                double value = basketSubtotalPrice3 != null ? basketSubtotalPrice3.getValue() : 0.0d;
                Price requiredAmountToCheckout2 = basketResponse.getRequiredAmountToCheckout();
                Pair pair9 = new Pair(aVar7, new dv.c(Boolean.valueOf(value >= (requiredAmountToCheckout2 != null ? requiredAmountToCheckout2.getValue() : 0.0d))));
                dv.a aVar8 = dv.a.FREE_DELIVERY_THRESHOLD;
                Price requiredAmountToFreeDelivery = basketResponse.getRequiredAmountToFreeDelivery();
                Pair pair10 = new Pair(aVar8, new dv.c(requiredAmountToFreeDelivery != null ? Double.valueOf(requiredAmountToFreeDelivery.getValue()) : null));
                dv.a aVar9 = dv.a.IS_FREE_DELIVERY_ACHIEVED;
                Price basketSubtotalPrice4 = basketResponse.getBasketSubtotalPrice();
                double value2 = basketSubtotalPrice4 != null ? basketSubtotalPrice4.getValue() : 0.0d;
                Price requiredAmountToFreeDelivery2 = basketResponse.getRequiredAmountToFreeDelivery();
                bVar.c(iVar, h0.g.E(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair(aVar9, new dv.c(Boolean.valueOf(value2 >= (requiredAmountToFreeDelivery2 != null ? requiredAmountToFreeDelivery2.getValue() : 0.0d))))));
            }
            wVar.l.i(new qt.a(basketResponse));
        }
        o oVar2 = q.f40850b;
        wVar.f46262j.i(Boolean.FALSE);
        return Unit.f26487a;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f40303j) {
            case 0:
                return new d((e) this.l, (BasicItem) this.f40305m, cVar, 0);
            case 1:
                return new d((tr.g) this.l, (String) this.f40305m, cVar, 1);
            case 2:
                return new d((tr.g) this.l, (RefundType) this.f40305m, cVar, 2);
            case 3:
                return new d((tr.g) this.l, (BriefOrder) this.f40305m, cVar, 3);
            case 4:
                return new d((u9.a) this.l, (Uri) this.f40305m, cVar, 4);
            case 5:
                return new d((m3) this.l, (String) this.f40305m, cVar, 5);
            case 6:
                return new d((r) this.l, (LocationRequest) this.f40305m, cVar, 6);
            case 7:
                return new d((t) this.l, (um.g) this.f40305m, cVar, 7);
            case 8:
                return new d((i2.e0) this.l, (t5.a) this.f40305m, cVar, 8);
            case 9:
                return new d((l) this.l, (h) this.f40305m, cVar, 9);
            case 10:
                return new d((l) this.l, (b2.i) this.f40305m, cVar, 10);
            case 11:
                return new d((w2.b) this.l, (z) this.f40305m, cVar, 11);
            case 12:
                return new d((s1) this.l, (ub.a) this.f40305m, cVar, 12);
            case 13:
                return new d((e1) this.l, (ub.a) this.f40305m, cVar, 13);
            case 14:
                return new d((i1) this.l, (w2.q) this.f40305m, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new d((b0) this.l, (os.c) this.f40305m, cVar, 15);
            case 16:
                return new d((y0) this.l, (w2.e1) this.f40305m, cVar, 16);
            case 17:
                d dVar = new d((w2.e1) this.f40305m, cVar, 17);
                dVar.l = obj;
                return dVar;
            case 18:
                d dVar2 = new d((x2.i) this.f40305m, cVar, 18);
                dVar2.l = obj;
                return dVar2;
            case 19:
                return new d((k) this.l, (SnackBarType) this.f40305m, cVar, 19);
            case 20:
                return new d((t1.b) this.l, (xo.b) this.f40305m, cVar, 20);
            case 21:
                return new d((p0) this.l, (Function0) this.f40305m, cVar, 21);
            case 22:
                return new d((yi.r) this.l, (g7) this.f40305m, cVar, 22);
            case 23:
                return new d((yi.r) this.l, (b1) this.f40305m, cVar, 23);
            case 24:
                return new d((cj.q) this.l, (yi.r) this.f40305m, cVar, 24);
            case 25:
                return new d((c0) this.l, (k) this.f40305m, cVar, 25);
            case 26:
                return new d((yk.h) this.f40305m, cVar, 26);
            case 27:
                return new d((w) this.l, (BasketRequest) this.f40305m, cVar, 27);
            case 28:
                return new d((List) this.l, (z.c) this.f40305m, cVar, 28);
            default:
                return new d((n) this.l, (z1.p0) this.f40305m, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40303j) {
        }
        return ((d) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0226, code lost:
    
        if (v80.f0.o(400, r29) == r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0638, code lost:
    
        if (r1.s(r29) == r0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0643, code lost:
    
        if (r1.f(r29) == r0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x064e, code lost:
    
        if (r1.e(false, r29) == r0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06e5, code lost:
    
        if (v80.f0.o(500, r29) != r0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0739, code lost:
    
        if (r1.collect(r2, r29) == r0) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x07c0, code lost:
    
        if (y80.m1.k((y80.m1) r1, r2, r29) == r0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r0.B(r29) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
    
        if (r2.e(r29) == r0) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06dc A[Catch: all -> 0x0698, TryCatch #0 {all -> 0x0698, blocks: (B:321:0x0694, B:349:0x06e9, B:342:0x06d3, B:345:0x06dc, B:326:0x069f, B:327:0x06a3, B:340:0x06cd, B:341:0x06d2, B:335:0x06bd, B:337:0x06c4), top: B:565:0x068a }] */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r14v65 */
    /* JADX WARN: Type inference failed for: r14v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v74, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:346:0x06e5 -> B:349:0x06e9). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 3010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40303j = i11;
        this.f40305m = obj;
    }
}
