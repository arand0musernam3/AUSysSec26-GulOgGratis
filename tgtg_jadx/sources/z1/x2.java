package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46765k;
    public final /* synthetic */ l3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f46766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f46767n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(l3 l3Var, long j9, Ref.FloatRef floatRef, x70.c cVar) {
        super(2, cVar);
        this.l = l3Var;
        this.f46766m = j9;
        this.f46767n = floatRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        x2 x2Var = new x2(this.l, this.f46766m, this.f46767n, cVar);
        x2Var.f46765k = obj;
        return x2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x2) create((k3) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46764j;
        if (i11 == 0) {
            ba0.g.M(obj);
            k3 k3Var = (k3) this.f46765k;
            long j9 = this.f46766m;
            l3 l3Var = this.l;
            float fG = l3Var.g(j9);
            rs.b bVar = new rs.b(this.f46767n, l3Var, k3Var, 18);
            this.f46764j = 1;
            if (t1.j1.c(0.0f, fG, null, bVar, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
