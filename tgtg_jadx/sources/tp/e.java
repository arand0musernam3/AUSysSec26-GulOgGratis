package tp;

import i80.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f40394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f40396c;

    public e(List list, boolean z11, Function1 function1) {
        this.f40394a = list;
        this.f40395b = z11;
        this.f40396c = function1;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        f2.d dVar = (f2.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        n nVar = (n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
        }
        s sVar = (s) nVar;
        if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
            op.c cVar = (op.c) this.f40394a.get(iIntValue);
            sVar.a0(780291776);
            b.c(cVar, this.f40395b, this.f40396c, sVar, 0);
            sVar.q(false);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
