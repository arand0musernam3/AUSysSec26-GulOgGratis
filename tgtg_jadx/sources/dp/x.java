package dp;

import ao.p2;
import c5.t1;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import g3.q3;
import g3.w6;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m3.h1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15136d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i11) {
        this.f15133a = i11;
        this.f15136d = obj;
        this.f15134b = obj2;
        this.f15135c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15133a) {
            case 0:
                ap.n nVar = (ap.n) this.f15136d;
                b1 b1Var = (b1) this.f15134b;
                List list = (List) b1Var.getValue();
                String str = (String) ((b1) this.f15135c).getValue();
                if (!((List) b1Var.getValue()).contains(bp.s.USP_QUESTION_OTHER)) {
                    str = null;
                }
                list.getClass();
                nVar.f4559b0 = list;
                nVar.f4561c0 = str;
                nVar.e();
                break;
            case 1:
                b1 b1Var2 = (b1) this.f15134b;
                boolean z11 = !((Boolean) b1Var2.getValue()).booleanValue();
                b1Var2.setValue(Boolean.valueOf(z11));
                ((b1) this.f15135c).setValue(Boolean.valueOf(z11));
                ((Function0) this.f15136d).invoke();
                break;
            case 2:
                ((h1) this.f15135c).i(1);
                ((b1) this.f15134b).setValue(Boolean.TRUE);
                ((Function0) this.f15136d).invoke();
                break;
            case 3:
                b0 b0Var = (b0) this.f15136d;
                w6 w6Var = (w6) this.f15134b;
                f0.B(b0Var, null, null, new q3(w6Var, null, 12), 3).J(new p2(16, w6Var, (Function0) this.f15135c));
                break;
            case 4:
                f0.B((b0) this.f15136d, null, null, new mn.g((t1) this.f15135c, (b1) this.f15134b, null, 19), 3);
                break;
            case 5:
                BasketManager basketManager = (BasketManager) this.f15136d;
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f15134b;
                basketManager.setQuantity(baseItemMnuV2.m393getItemIdFvU5WIY(), 1, LatestBasketInteraction.ADD, LatestInteractionOrigin.SCREEN_BASKET);
                ((um.u) this.f15135c).o(baseItemMnuV2.m393getItemIdFvU5WIY());
                break;
            default:
                ((b1) this.f15134b).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                Function1 function1 = (Function1) this.f15136d;
                if (function1 != null) {
                    function1.invoke((BasicItem) this.f15135c);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ x(Object obj, Object obj2, b1 b1Var, int i11) {
        this.f15133a = i11;
        this.f15136d = obj;
        this.f15135c = obj2;
        this.f15134b = b1Var;
    }
}
