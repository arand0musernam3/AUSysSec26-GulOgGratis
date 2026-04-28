package ng;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.x0;
import com.braze.h2;
import h2.b1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f30831k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, x70.c cVar) {
        super(2, cVar);
        this.f30831k = dVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new c(this.f30831k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f30830j;
        if (i11 == 0) {
            ba0.g.M(obj);
            Lifecycle.State state = Lifecycle.State.STARTED;
            d dVar = this.f30831k;
            b1 b1Var = new b1(dVar, null, 16);
            this.f30830j = 1;
            if (x0.b(dVar, state, b1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
