package vi;

import com.braze.h2;
import f2.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f42401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42402k;
    public final /* synthetic */ c0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f42403m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i11, c0 c0Var, x70.c cVar) {
        super(2, cVar);
        this.f42401j = 0;
        this.f42403m = i11;
        this.l = c0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f42401j) {
            case 0:
                return new n(this.f42403m, this.l, cVar);
            case 1:
                return new n(this.f42403m, 1, this.l, cVar);
            default:
                return new n(this.f42403m, 2, this.l, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f42401j) {
        }
        return ((n) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f42401j;
        int i12 = this.f42403m;
        c0 c0Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f42402k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    if (i12 != -1) {
                        this.f42402k = 1;
                        ub.a aVar2 = c0.f17087x;
                        if (c0Var.f(i12, 0, this) == aVar) {
                        }
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 1:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f42402k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    this.f42402k = 1;
                    ub.a aVar4 = c0.f17087x;
                    if (c0Var.f(i12 + 1, 0, this) == aVar3) {
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f42402k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    this.f42402k = 1;
                    ub.a aVar6 = c0.f17087x;
                    if (c0Var.f(i12 - 1, 0, this) == aVar5) {
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i11, int i12, c0 c0Var, x70.c cVar) {
        super(2, cVar);
        this.f42401j = i12;
        this.l = c0Var;
        this.f42403m = i11;
    }
}
