package kj;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f26455j;

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        h hVar = new h(2, cVar);
        hVar.f26455j = ((Boolean) obj).booleanValue();
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((h) create(bool, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.f26455j;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        return Boolean.valueOf(!z11);
    }
}
