package t1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ float f39418j;

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        e0 e0Var = new e0(2, cVar);
        e0Var.f39418j = ((Number) obj).floatValue();
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create(Float.valueOf(((Number) obj).floatValue()), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        return Boolean.valueOf(this.f39418j > 0.0f);
    }
}
