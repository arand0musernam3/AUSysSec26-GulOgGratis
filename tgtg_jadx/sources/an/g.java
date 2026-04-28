package an;

import com.app.tgtg.model.remote.item.response.HeaderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1634a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeaderItem f1635b;

    public /* synthetic */ g(HeaderItem headerItem) {
        this.f1635b = headerItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f1634a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h0.c(this.f1635b, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                num.getClass();
                h0.c(this.f1635b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g(HeaderItem headerItem, int i11) {
        this.f1635b = headerItem;
    }
}
