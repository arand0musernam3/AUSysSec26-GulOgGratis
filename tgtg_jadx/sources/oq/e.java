package oq;

import com.app.tgtg.model.local.GenericErrors;
import com.braze.h2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ y80.j f32925k;

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = new e(3, (x70.c) obj3);
        eVar.f32925k = (y80.j) obj;
        return eVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y80.j jVar = this.f32925k;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f32924j;
        if (i11 == 0) {
            ba0.g.M(obj);
            q qVar = new q(GenericErrors.Generic.INSTANCE);
            this.f32925k = null;
            this.f32924j = 1;
            if (jVar.emit(qVar, this) == aVar) {
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
