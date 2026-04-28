package cj;

import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements i80.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ UserAddress f8276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f8277k;
    public /* synthetic */ String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f8278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f8279n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, e0 e0Var, x70.c cVar) {
        super(5, cVar);
        this.f8278m = qVar;
        this.f8279n = e0Var;
    }

    @Override // i80.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UserAddress userAddress = (UserAddress) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) obj3;
        String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
        l lVar = new l(this.f8278m, this.f8279n, (x70.c) obj5);
        lVar.f8276j = userAddress;
        lVar.f8277k = zBooleanValue;
        lVar.l = strM229unboximpl;
        return lVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        UserAddress userAddress = this.f8276j;
        boolean z11 = this.f8277k;
        String str = this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        int i11 = k.$EnumSwitchMapping$0[this.f8278m.g().ordinal()];
        e0 e0Var = this.f8279n;
        boolean z12 = false;
        if (i11 == 1 ? userAddress == null || z11 || (e0Var.o() && str == null) : i11 == 2 && (userAddress == null || e0Var.j())) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
