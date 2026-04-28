package rq;

import ba0.g;
import com.app.tgtg.model.local.GenericErrors;
import i80.n;
import kotlin.Unit;
import oq.q;
import y80.a2;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends i implements n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f38158j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, x70.c cVar) {
        super(3, cVar);
        this.f38158j = dVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new c(this.f38158j, (x70.c) obj3).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        g.M(obj);
        a2 a2Var = this.f38158j.f38160b;
        q qVar = new q(GenericErrors.Generic.INSTANCE);
        a2Var.getClass();
        a2Var.k(null, qVar);
        return Unit.f26487a;
    }
}
