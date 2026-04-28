package z1;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.i implements i80.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ q f46451k;
    public /* synthetic */ g1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f46452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f46453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t1.i f46454o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, t1.i iVar, x70.c cVar) {
        super(4, cVar);
        this.f46453n = rVar;
        this.f46454o = iVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f46453n, this.f46454o, (x70.c) obj4);
        dVar.f46451k = (q) obj;
        dVar.l = (g1) obj2;
        dVar.f46452m = obj3;
        return dVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46450j;
        if (i11 == 0) {
            ba0.g.M(obj);
            q qVar = this.f46451k;
            g1 g1Var = this.l;
            Object obj2 = this.f46452m;
            r rVar = this.f46453n;
            float fH = rVar.f46656k.h();
            this.f46451k = null;
            this.l = null;
            this.f46450j = 1;
            if (k.b(rVar, fH, qVar, g1Var, obj2, this.f46454o, this) == aVar) {
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
