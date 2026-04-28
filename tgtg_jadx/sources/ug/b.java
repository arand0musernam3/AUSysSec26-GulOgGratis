package ug;

import b4.q;
import b4.t;
import com.app.tgtg.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.m;
import m3.n;
import m3.s;
import o00.x0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41123a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tg.i f41124b;

    public /* synthetic */ b(tg.i iVar) {
        this.f41124b = iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41123a;
        tg.i iVar = this.f41124b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                c.b(iVar, (n) obj, m3.i.F(1));
                break;
            default:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n4.b bVarZ = x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0);
                    String strU = f0.U(sVar, R.string.browse_list_error_no_results_discover_search_action_text);
                    t tVarD = d2.c.D(q.f5711a, 0.0f, 0.0f, lv.t.f28251e, 0.0f, 11);
                    boolean zH = sVar.h(iVar);
                    Object objM = sVar.M();
                    if (zH || objM == m.f29332a) {
                        objM = new f(iVar, 1);
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

    public /* synthetic */ b(tg.i iVar, int i11) {
        this.f41124b = iVar;
    }
}
