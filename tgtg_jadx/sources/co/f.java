package co;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8736j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8737k;
    public final /* synthetic */ b1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f8738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function0 function0, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f8738m = function0;
        this.l = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8736j) {
            case 0:
                return new f(this.f8738m, this.l, cVar);
            default:
                return new f(this.l, this.f8738m, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8736j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8736j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f8737k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8737k = 1;
                    if (f0.o(100L, this) == aVar) {
                    }
                }
                this.l.setValue(yn.d.f46279a);
                this.f8738m.invoke();
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8737k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    if (this.l.getValue() instanceof gi.g) {
                        this.f8737k = 1;
                        if (f0.o(5000L, this) == aVar2) {
                        }
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                this.f8738m.invoke();
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b1 b1Var, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.l = b1Var;
        this.f8738m = function0;
    }
}
