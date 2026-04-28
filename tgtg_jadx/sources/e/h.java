package e;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f15287j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Ref.BooleanRef booleanRef, x70.c cVar) {
        super(3, cVar);
        this.f15287j = booleanRef;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new h(this.f15287j, (x70.c) obj3).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        this.f15287j.element = true;
        return Unit.f26487a;
    }
}
