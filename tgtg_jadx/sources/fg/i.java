package fg;

import a3.f3;
import com.app.tgtg.model.remote.item.response.BasicItem;
import f0.f2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ok.t;
import v80.f0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17708c;

    public /* synthetic */ i(Object obj, boolean z11, int i11) {
        this.f17706a = i11;
        this.f17708c = obj;
        this.f17707b = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17706a) {
            case 0:
                Function1 function1 = (Function1) this.f17708c;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(!this.f17707b));
                }
                break;
            case 1:
                if (!this.f17707b) {
                    ((Function0) this.f17708c).invoke();
                }
                break;
            case 2:
                ((m1) ((f2) ((m1.a) this.f17708c).f28697a).f16653f).i(new t(!this.f17707b));
                break;
            case 3:
                if (!this.f17707b) {
                    ((lw.o) this.f17708c).invoke();
                }
                break;
            default:
                cj.q qVar = (cj.q) this.f17708c;
                boolean z11 = this.f17707b;
                boolean z12 = !z11;
                qVar.getClass();
                String str = !z11 ? "ON" : "OFF";
                cv.i iVar = cv.i.TEMP_USE_VOUCHER_TOGGLE;
                Pair pair = new Pair(dv.a.SWITCH_TO_STATE, new dv.c(str));
                dv.a aVar = dv.a.ITEM_TYPE;
                BasicItem basicItemF = qVar.f();
                String strName = basicItemF != null ? basicItemF.getItemType().name() : null;
                if (strName == null) {
                    strName = "";
                }
                qVar.s(iVar, h0.g.E(pair, new Pair(aVar, new dv.c(strName))));
                f0.B(androidx.lifecycle.m1.d(qVar), null, null, new f3(z12, qVar, null), 3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i(boolean z11, Function0 function0, int i11) {
        this.f17706a = i11;
        this.f17707b = z11;
        this.f17708c = function0;
    }
}
