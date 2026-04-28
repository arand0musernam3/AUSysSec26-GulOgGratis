package ss;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39247k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y80.i f39248m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(y80.i iVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f39246j = i11;
        this.f39248m = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f39246j) {
            case 0:
                u0 u0Var = new u0(this.f39248m, cVar, 0);
                u0Var.l = obj;
                return u0Var;
            default:
                u0 u0Var2 = new u0(this.f39248m, cVar, 1);
                u0Var2.l = obj;
                return u0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39246j) {
            case 0:
                return ((u0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((u0) create((x80.u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39246j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f39247k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    o0 o0Var = new o0((y80.j) this.l, 4);
                    this.l = null;
                    this.f39247k = 1;
                    if (this.f39248m.collect(o0Var, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f39247k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    androidx.lifecycle.k kVar = new androidx.lifecycle.k((x80.u) this.l, 1);
                    this.f39247k = 1;
                    if (this.f39248m.collect(kVar, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
