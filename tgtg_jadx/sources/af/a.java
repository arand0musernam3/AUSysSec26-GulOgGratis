package af;

import android.view.View;
import b5.r1;
import b5.s1;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import h2.a0;
import j2.g;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import um.u;
import v80.b0;
import v80.f0;
import ym.z;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1265k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1268o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1264j = i11;
        this.f1265k = obj;
        this.l = obj2;
        this.f1266m = obj3;
        this.f1267n = obj4;
        this.f1268o = obj5;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1264j) {
            case 0:
                return new a((View) this.f1265k, (Pair) this.l, (d) this.f1266m, (List) this.f1267n, (kf.b) this.f1268o, cVar, 0);
            case 1:
                a aVar = new a((g) this.l, (s1) this.f1266m, (r1) this.f1267n, (a0.g) this.f1268o, cVar, 1);
                aVar.f1265k = obj;
                return aVar;
            case 2:
                a aVar2 = new a((Function0) this.l, (b1) this.f1266m, (b1) this.f1267n, (b1) this.f1268o, cVar, 2);
                aVar2.f1265k = obj;
                return aVar2;
            default:
                return new a((BasketItem) this.f1265k, (z) this.l, (u) this.f1266m, (b1) this.f1267n, (b1) this.f1268o, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f1264j) {
        }
        return ((a) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f1264j;
        Object obj2 = this.f1266m;
        Object obj3 = this.l;
        Object obj4 = this.f1268o;
        Object obj5 = this.f1267n;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0 b0Var = (b0) this.f1265k;
                g gVar = (g) obj3;
                x70.c cVar = null;
                f0.B(b0Var, null, null, new a0(gVar, (s1) obj2, (r1) obj5, cVar, 13), 3);
                break;
            case 2:
                b0 b0Var2 = (b0) this.f1265k;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                f0.B(b0Var2, null, null, new os.c((Function0) obj3, (b1) obj2, (b1) obj5, (b1) obj4, (x70.c) null), 3);
                break;
            default:
                BasketItem basketItem = (BasketItem) this.f1265k;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) ((b1) obj5).getValue()).booleanValue()) {
                    ((BasketManager) ((b1) obj4).getValue()).setQuantity(basketItem.getItemId(), 0, LatestBasketInteraction.SWIPE_TO_REMOVE, LatestInteractionOrigin.SCREEN_BASKET);
                    ((z) obj3).i(ItemId.m198constructorimpl(basketItem.getItemId()), 0, false);
                    ((u) obj2).r();
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1264j = i11;
        this.l = obj;
        this.f1266m = obj2;
        this.f1267n = obj3;
        this.f1268o = obj4;
    }
}
