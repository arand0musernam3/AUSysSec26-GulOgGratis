package pm;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f35562k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f35563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b1 f35564n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z11, boolean z12, boolean z13, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f35562k = z11;
        this.l = z12;
        this.f35563m = z13;
        this.f35564n = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new x(this.f35562k, this.l, this.f35563m, this.f35564n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f35561j;
        b1 b1Var = this.f35564n;
        if (i11 == 0) {
            ba0.g.M(obj);
            if (this.f35562k || !this.l || !this.f35563m) {
                b1Var.setValue(Boolean.FALSE);
                return Unit.f26487a;
            }
            this.f35561j = 1;
            if (f0.o(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        b1Var.setValue(Boolean.TRUE);
        return Unit.f26487a;
    }
}
