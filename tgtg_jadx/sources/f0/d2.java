package f0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16610j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Ref.ObjectRef objectRef, x70.c cVar) {
        super(1, cVar);
        this.f16610j = objectRef;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new d2(this.f16610j, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d2) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
        this.f16610j.element = null;
        return new a3(null, new e0.l(13), 1);
    }
}
