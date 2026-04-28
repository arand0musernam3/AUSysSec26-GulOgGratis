package h0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20977j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Ref.ObjectRef objectRef, x70.c cVar) {
        super(2, cVar);
        this.f20977j = objectRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new j(this.f20977j, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((Unit) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        this.f20977j.element = null;
        return Unit.f26487a;
    }
}
