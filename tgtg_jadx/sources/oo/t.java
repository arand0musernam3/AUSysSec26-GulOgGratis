package oo;

import android.os.Parcelable;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.order.Order;
import d2.j2;
import d2.m2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32863a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f32866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32869g;

    public /* synthetic */ t(b4.t tVar, Order order, v80.b0 b0Var, Function0 function0, int i11, fo.b bVar) {
        this.f32865c = tVar;
        this.f32866d = order;
        this.f32867e = b0Var;
        this.f32868f = function0;
        this.f32864b = i11;
        this.f32869g = bVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f32863a) {
            case 0:
                b4.t tVar = (b4.t) this.f32865c;
                Order order = (Order) this.f32866d;
                v80.b0 b0Var = (v80.b0) this.f32867e;
                Function0 function0 = (Function0) this.f32868f;
                fo.b bVar = (fo.b) this.f32869g;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (objM == fVar) {
                        objM = u.f32870a;
                        sVar.k0(objM);
                    }
                    i80.n nVar2 = (i80.n) ((KFunction) objM);
                    b4.t tVarT = m2.t(m2.d(tVar, 1.0f), 3);
                    boolean zH = sVar.h(order) | sVar.h(b0Var) | sVar.f(function0);
                    int i11 = this.f32864b;
                    boolean zD = zH | sVar.d(i11) | sVar.h(bVar);
                    Object objM2 = sVar.M();
                    if (zD || objM2 == fVar) {
                        objM2 = new d2.x(order, b0Var, function0, i11, bVar, 4);
                        sVar.k0(objM2);
                    }
                    c6.l.b(nVar2, tVarT, (Function1) objM2, sVar, 6, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                BasketItem basketItem = (BasketItem) this.f32865c;
                BasketManager basketManager = (BasketManager) this.f32866d;
                um.u uVar = (um.u) this.f32867e;
                Map map = (Map) this.f32868f;
                i80.n nVar3 = (i80.n) this.f32869g;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar2 = (m3.s) nVar4;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    na0.a.E(basketItem, basketManager, this.f32864b, uVar, map, nVar3, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ t(BasketItem basketItem, BasketManager basketManager, int i11, um.u uVar, Map map, i80.n nVar) {
        this.f32865c = basketItem;
        this.f32866d = basketManager;
        this.f32864b = i11;
        this.f32867e = uVar;
        this.f32868f = map;
        this.f32869g = nVar;
    }
}
