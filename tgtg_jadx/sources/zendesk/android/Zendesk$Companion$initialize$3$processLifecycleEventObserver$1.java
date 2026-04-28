package zendesk.android;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.Zendesk$Companion$initialize$3$processLifecycleEventObserver$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "<anonymous>", "(Lv80/b0;)Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;"}, k = 3, mv = {2, 1, 0})
public final class Zendesk$Companion$initialize$3$processLifecycleEventObserver$1 extends i implements Function2<b0, c<? super ProcessLifecycleEventObserver>, Object> {
    int label;

    public Zendesk$Companion$initialize$3$processLifecycleEventObserver$1(c<? super Zendesk$Companion$initialize$3$processLifecycleEventObserver$1> cVar) {
        super(2, cVar);
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new Zendesk$Companion$initialize$3$processLifecycleEventObserver$1(cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super ProcessLifecycleEventObserver> cVar) {
        return ((Zendesk$Companion$initialize$3$processLifecycleEventObserver$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            g.M(obj);
            return ProcessLifecycleEventObserver.INSTANCE.newInstance();
        }
        h2.b("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
