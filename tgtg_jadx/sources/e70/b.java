package e70;

import a3.x1;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.x0;
import ba0.g;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f15844k;
    public final /* synthetic */ Lifecycle.State l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f15845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f15846n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ComponentActivity componentActivity, Lifecycle.State state, c cVar, Function1 function1, x70.c cVar2) {
        super(2, cVar2);
        this.f15844k = componentActivity;
        this.l = state;
        this.f15845m = cVar;
        this.f15846n = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new b(this.f15844k, this.l, this.f15845m, this.f15846n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f15843j;
        if (i11 == 0) {
            g.M(obj);
            c cVar = this.f15845m;
            Function1 function1 = this.f15846n;
            ComponentActivity componentActivity = this.f15844k;
            x1 x1Var = new x1(cVar, function1, componentActivity, (x70.c) null, 18);
            this.f15843j = 1;
            if (x0.b(componentActivity, this.l, x1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        return Unit.f26487a;
    }
}
