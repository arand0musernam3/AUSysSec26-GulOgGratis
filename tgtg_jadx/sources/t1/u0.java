package t1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f39576k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f39577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y0 f39578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q1 f39579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f39580p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Object obj, Object obj2, y0 y0Var, q1 q1Var, float f11, x70.c cVar) {
        super(2, cVar);
        this.l = obj;
        this.f39577m = obj2;
        this.f39578n = y0Var;
        this.f39579o = q1Var;
        this.f39580p = f11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        u0 u0Var = new u0(this.l, this.f39577m, this.f39578n, this.f39579o, this.f39580p, cVar);
        u0Var.f39576k = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f39575j;
        y0 y0Var = this.f39578n;
        if (i11 == 0) {
            ba0.g.M(obj);
            v80.b0 b0Var = (v80.b0) this.f39576k;
            Object obj2 = this.l;
            Object obj3 = this.f39577m;
            if (Intrinsics.areEqual(obj2, obj3)) {
                y0Var.f39617o = null;
                if (Intrinsics.areEqual(y0Var.f39607d.getValue(), obj2)) {
                    return Unit.f26487a;
                }
            } else {
                y0.q(y0Var);
            }
            boolean zAreEqual = Intrinsics.areEqual(obj2, obj3);
            float f11 = this.f39580p;
            if (!zAreEqual) {
                q1 q1Var = this.f39579o;
                q1Var.q(obj2);
                q1Var.o(0L);
                y0Var.f39606c.setValue(obj2);
                q1Var.k(f11);
            }
            y0Var.A(f11);
            if (y0Var.f39616n.e()) {
                v80.f0.B(b0Var, null, null, new sf.a(y0Var, null, 2), 3);
            } else {
                y0Var.f39615m = Long.MIN_VALUE;
            }
            this.f39575j = 1;
            if (y0.t(y0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        y0Var.z();
        return Unit.f26487a;
    }
}
