package a70;

import i80.n;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends z70.i implements n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f950j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Ref.ObjectRef objectRef, x70.c cVar) {
        super(3, cVar);
        this.f950j = objectRef;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new c(this.f950j, (x70.c) obj3).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ((i1) this.f950j.element).a(null);
        return Unit.f26487a;
    }
}
