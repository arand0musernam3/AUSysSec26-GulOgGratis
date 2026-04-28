package co;

import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import ss.e1;
import ss.f1;
import ss.g1;
import ss.l1;
import ss.y0;
import ss.z0;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f8767k;
    public final /* synthetic */ b1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(b1 b1Var, b1 b1Var2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8766j = i11;
        this.f8767k = b1Var;
        this.l = b1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8766j) {
            case 0:
                return new k(this.f8767k, this.l, cVar, 0);
            case 1:
                return new k(this.f8767k, this.l, cVar, 1);
            default:
                return new k(this.f8767k, this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8766j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8766j;
        b1 b1Var = this.l;
        b1 b1Var2 = this.f8767k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Boolean bool = (Boolean) b1Var2.getValue();
                bool.booleanValue();
                b1Var.setValue(bool);
                if (!((Boolean) b1Var2.getValue()).booleanValue()) {
                    b1Var2.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                int i12 = VoucherActivity.f9440h;
                if (!(((l1) b1Var2.getValue()) instanceof g1) && !(((l1) b1Var2.getValue()) instanceof f1)) {
                    b1Var.setValue((l1) b1Var2.getValue());
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                int i13 = VoucherExperienceActivity.f9443h;
                if (!(((e1) b1Var2.getValue()) instanceof z0) && !(((e1) b1Var2.getValue()) instanceof y0)) {
                    b1Var.setValue((e1) b1Var2.getValue());
                }
                break;
        }
        return Unit.f26487a;
    }
}
