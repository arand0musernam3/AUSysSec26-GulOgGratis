package g2;

import com.app.tgtg.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o00.x0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18169b;

    public /* synthetic */ h(Function1 function1, int i11) {
        this.f18168a = i11;
        this.f18169b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f18168a;
        Function1 function1 = this.f18169b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                function1.invoke(obj);
                break;
            default:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n4.b bVarZ = x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0);
                    String strU = f0.U(sVar, R.string.browse_list_error_no_results_discover_search_action_text);
                    b4.t tVarD = d2.c.D(b4.q.f5711a, 0.0f, 0.0f, lv.t.f28251e, 0.0f, 11);
                    boolean zF = sVar.f(function1);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new qr.f(function1, 9);
                        sVar.k0(objM);
                    }
                    v1.n.d(bVarZ, strU, androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15), null, null, 0.0f, null, sVar, 8, 120);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
