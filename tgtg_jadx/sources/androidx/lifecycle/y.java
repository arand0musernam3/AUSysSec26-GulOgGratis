package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f3549k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, x70.c cVar) {
        super(2, cVar);
        this.f3549k = zVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        y yVar = new y(this.f3549k, cVar);
        yVar.f3548j = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        v80.b0 b0Var = (v80.b0) this.f3548j;
        z zVar = this.f3549k;
        Lifecycle lifecycle = zVar.f3550a;
        if (lifecycle.b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            lifecycle.a(zVar);
        } else {
            v80.f0.i(b0Var.getCoroutineContext(), null);
        }
        return Unit.f26487a;
    }
}
