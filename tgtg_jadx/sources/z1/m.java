package z1;

import g3.u6;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f46597k;
    public final /* synthetic */ n l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f46598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f46599n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Ref.FloatRef floatRef, float f11, x70.c cVar) {
        super(3, cVar);
        this.l = nVar;
        this.f46598m = floatRef;
        this.f46599n = f11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ref.FloatRef floatRef = this.f46598m;
        float f11 = this.f46599n;
        m mVar = new m(this.l, floatRef, f11, (x70.c) obj3);
        mVar.f46597k = (q) obj;
        return mVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f46596j;
        if (i11 == 0) {
            ba0.g.M(obj);
            q qVar = (q) this.f46597k;
            n nVar = this.l;
            u6 u6Var = new u6(1, nVar, qVar);
            l1 l1Var = nVar.L;
            if (l1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resolvedFlingBehavior");
                l1Var = null;
            }
            Ref.FloatRef floatRef2 = this.f46598m;
            this.f46597k = floatRef2;
            this.f46596j = 1;
            obj = l1Var.a(u6Var, this.f46599n, this);
            if (obj == aVar) {
                return aVar;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            floatRef = (Ref.FloatRef) this.f46597k;
            ba0.g.M(obj);
        }
        floatRef.element = ((Number) obj).floatValue();
        return Unit.f26487a;
    }
}
