package t1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39565j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39566k;
    public final /* synthetic */ y0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f39567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q1 f39568n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(y0 y0Var, Object obj, q1 q1Var, x70.c cVar) {
        super(1, cVar);
        this.l = y0Var;
        this.f39567m = obj;
        this.f39568n = q1Var;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f39565j) {
            case 0:
                return new s0(this.f39568n, this.l, this.f39567m, cVar);
            default:
                return new s0(this.l, this.f39567m, this.f39568n, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f39565j) {
        }
        return ((s0) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39565j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f39566k;
                q1 q1Var = this.f39568n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    af.b bVar = new af.b(this.l, this.f39567m, q1Var, (x70.c) null, 16);
                    this.f39566k = 1;
                    if (v80.f0.n(bVar, this) == aVar) {
                    }
                }
                q1Var.j();
                break;
            default:
                y0 y0Var = this.l;
                m3.k1 k1Var = y0Var.f39606c;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39566k;
                q1 q1Var2 = this.f39568n;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y0Var.w();
                    y0Var.f39615m = Long.MIN_VALUE;
                    y0Var.A(0.0f);
                    Object value = y0Var.f39607d.getValue();
                    Object obj2 = this.f39567m;
                    float f11 = Intrinsics.areEqual(obj2, value) ? -4.0f : Intrinsics.areEqual(obj2, k1Var.getValue()) ? -5.0f : -3.0f;
                    q1Var2.q(obj2);
                    q1Var2.o(0L);
                    k1Var.setValue(obj2);
                    y0Var.A(0.0f);
                    y0Var.m(obj2);
                    q1Var2.k(f11);
                    if (f11 == -3.0f) {
                        this.f39566k = 1;
                        if (y0.t(y0Var, this) == aVar2) {
                        }
                    }
                }
                q1Var2.j();
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q1 q1Var, y0 y0Var, Object obj, x70.c cVar) {
        super(1, cVar);
        this.f39568n = q1Var;
        this.l = y0Var;
        this.f39567m = obj;
    }
}
