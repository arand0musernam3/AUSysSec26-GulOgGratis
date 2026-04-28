package w8;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f43290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f43291k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Lifecycle.State state, x70.c cVar) {
        super(2, cVar);
        this.f43290j = aVar;
        this.f43291k = state;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new h(this.f43290j, this.f43291k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        Lifecycle.State state = this.f43291k;
        a aVar2 = this.f43290j;
        aVar2.f43282c = state;
        aVar2.a();
        return Unit.f26487a;
    }
}
