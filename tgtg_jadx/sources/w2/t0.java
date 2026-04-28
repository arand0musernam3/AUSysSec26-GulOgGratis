package w2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f43048k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, x70.c cVar) {
        super(2, cVar);
        this.f43048k = v0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new t0(this.f43048k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f43047j;
        if (i11 == 0) {
            ba0.g.M(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 1;
            v0 v0Var = this.f43048k;
            at.o oVarD = m3.i.D(new us.j(11, v0Var, intRef));
            b0.a1 a1Var = new b0.a1(v0Var, null);
            this.f43047j = 1;
            if (y80.r.i(oVarD, a1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
