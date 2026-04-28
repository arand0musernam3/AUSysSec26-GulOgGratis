package ph;

import ad.j;
import bn.b0;
import com.app.tgtg.model.remote.item.response.BasicItem;
import d40.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicItem f35342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f35343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jd.f f35344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35345d;

    public e(BasicItem basicItem, boolean z11, jd.f fVar, String str) {
        this.f35342a = basicItem;
        this.f35343b = z11;
        this.f35344c = fVar;
        this.f35345d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        int iIntValue = ((Number) obj2).intValue();
        s sVar = (s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            jd.f fVar = this.f35344c;
            boolean zH = sVar.h(fVar);
            BasicItem basicItem = this.f35342a;
            boolean zH2 = zH | sVar.h(basicItem);
            String str = this.f35345d;
            boolean zF = zH2 | sVar.f(str);
            Object objM = sVar.M();
            m3.f fVar2 = m.f29332a;
            if (zF || objM == fVar2) {
                objM = new j(fVar, basicItem, str, 2);
                sVar.k0(objM);
            }
            Function1 function1 = (Function1) objM;
            boolean zH3 = sVar.h(fVar) | sVar.h(basicItem);
            Object objM2 = sVar.M();
            if (zH3 || objM2 == fVar2) {
                objM2 = new b0(16, fVar, basicItem);
                sVar.k0(objM2);
            }
            t1.m(null, this.f35342a, false, false, false, this.f35343b, function1, (Function0) objM2, null, sVar, 0, 285);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
