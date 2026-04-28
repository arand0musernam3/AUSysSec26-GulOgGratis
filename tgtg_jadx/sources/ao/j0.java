package ao;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4320k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(long j9, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4319j = i11;
        this.l = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4319j) {
            case 0:
                j0 j0Var = new j0(this.l, cVar, 0);
                j0Var.f4320k = obj;
                return j0Var;
            case 1:
                j0 j0Var2 = new j0(this.l, cVar, 1);
                j0Var2.f4320k = obj;
                return j0Var2;
            default:
                j0 j0Var3 = new j0(this.l, cVar, 2);
                j0Var3.f4320k = obj;
                return j0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4319j) {
            case 0:
                return ((j0) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((j0) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((j0) create((z1.k3) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4319j;
        long j9 = this.l;
        switch (i11) {
            case 0:
                h8.a aVar = (h8.a) this.f4320k;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVar = m0.f4349k;
                aVar.f(m0.f4349k, new Long(j9));
                break;
            case 1:
                h8.a aVar3 = (h8.a) this.f4320k;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVar2 = m0.f4349k;
                aVar3.f(m0.l, new Long(j9));
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                z1.l3 l3Var = ((z1.k3) this.f4320k).f46577a;
                l3Var.c(l3Var.f46594k, j9, 1);
                break;
        }
        return Unit.f26487a;
    }
}
