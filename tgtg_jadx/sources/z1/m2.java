package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46605k;
    public final /* synthetic */ float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t1.i f46606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f46607n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(float f11, t1.i iVar, Ref.FloatRef floatRef, x70.c cVar) {
        super(2, cVar);
        this.l = f11;
        this.f46606m = iVar;
        this.f46607n = floatRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        m2 m2Var = new m2(this.l, this.f46606m, this.f46607n, cVar);
        m2Var.f46605k = obj;
        return m2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m2) create((q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46604j;
        if (i11 == 0) {
            ba0.g.M(obj);
            rk.a0 a0Var = new rk.a0(23, this.f46607n, (q2) this.f46605k);
            this.f46604j = 1;
            if (t1.j1.c(0.0f, this.l, this.f46606m, a0Var, this, 4) == aVar) {
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
