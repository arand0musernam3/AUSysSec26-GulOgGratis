package dx;

import ax.a0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(List list, int i11) {
        super(2);
        this.f15209a = i11;
        this.f15210b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15209a) {
            case 0:
                try {
                    a0.c().execute(new com.google.firebase.messaging.r(9, (Integer) obj2, this.f15210b));
                    break;
                } catch (Exception unused) {
                }
                break;
            default:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f15210b;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Function2 function2 = (Function2) list.get(i11);
                        int iHashCode = Long.hashCode(sVar.T);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5840c;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar);
                        } else {
                            sVar.n0();
                        }
                        m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                        function2.invoke(sVar, 0);
                        sVar.q(true);
                    }
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
