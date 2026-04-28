package en;

import androidx.lifecycle.o0;
import com.app.tgtg.model.remote.item.ManufacturerItemInformation;
import com.app.tgtg.model.remote.item.requests.ExtendedPriceSpecificationContext;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.braze.h2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ui.m3;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f16156k;
    public final /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f16157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, int i11, int i12, x70.c cVar) {
        super(2, cVar);
        this.f16156k = oVar;
        this.l = i11;
        this.f16157m = i12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new m(this.f16156k, this.l, this.f16157m, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        o oVar = this.f16156k;
        o0 o0Var = oVar.f16184t;
        o0 o0Var2 = oVar.f16182r;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f16155j;
        if (i11 == 0) {
            ba0.g.M(obj);
            o0Var2.k(Boolean.TRUE);
            m3 m3Var = oVar.f16170e;
            ManufacturerItem manufacturerItem = (ManufacturerItem) oVar.f16177m.d();
            ManufacturerItemInformation information = manufacturerItem != null ? manufacturerItem.getInformation() : null;
            information.getClass();
            String strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
            ExtendedPriceSpecificationContext extendedPriceSpecificationContext = ExtendedPriceSpecificationContext.BASKET;
            this.f16155j = 1;
            obj = m3Var.m(strMo340getItemIdFvU5WIY, this.l, this.f16157m, null, extendedPriceSpecificationContext, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        ui.k kVar = (ui.k) obj;
        if (kVar instanceof ui.h) {
            o0Var2.k(Boolean.FALSE);
            o0Var.k(Boolean.TRUE);
        } else if (kVar instanceof ui.i) {
            o0Var2.k(Boolean.FALSE);
            oVar.d(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c("SOLD_OUT"))));
            o0Var.k(Boolean.TRUE);
        } else {
            if (!(kVar instanceof ui.j)) {
                e40.a.f();
                return null;
            }
            o0Var2.k(Boolean.FALSE);
            oVar.f16178n.i(((ui.j) kVar).f41222a);
        }
        return Unit.f26487a;
    }
}
