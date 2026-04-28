package i2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22814k;
    public final /* synthetic */ e0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f22815m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i11, x70.c cVar, int i12) {
        super(2, cVar);
        this.f22813j = i12;
        this.l = e0Var;
        this.f22815m = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22813j) {
            case 0:
                return new d0(this.l, this.f22815m, cVar, 0);
            default:
                return new d0(this.l, this.f22815m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22813j) {
            case 0:
                return ((d0) create((q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((d0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22813j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f22814k;
                e0 e0Var = this.l;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f22814k = 1;
                    if (e0Var.i(this) == aVar) {
                    }
                }
                double d3 = 0.0f;
                if (-0.5d > d3 || d3 > 0.5d) {
                    c2.a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                e0Var.v(e0Var.k(this.f22815m), 0.0f, true);
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f22814k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f22814k = 1;
                    if (this.l.f(this.f22815m, t1.c.j(0.0f, 0.0f, null, 7), this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
