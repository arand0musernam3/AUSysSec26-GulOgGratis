package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3484k;
    public final /* synthetic */ Lifecycle l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f3485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y80.i f3486n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Lifecycle lifecycle, Lifecycle.State state, y80.i iVar, x70.c cVar) {
        super(2, cVar);
        this.l = lifecycle;
        this.f3485m = state;
        this.f3486n = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        l lVar = new l(this.l, this.f3485m, this.f3486n, cVar);
        lVar.f3484k = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((x80.u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        x80.u uVar;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f3483j;
        x70.c cVar = null;
        if (i11 == 0) {
            ba0.g.M(obj);
            x80.u uVar2 = (x80.u) this.f3484k;
            a3.x xVar = new a3.x(this.f3486n, uVar2, cVar, 8);
            this.f3484k = uVar2;
            this.f3483j = 1;
            if (x0.a(this.l, this.f3485m, xVar, this) == aVar) {
                return aVar;
            }
            uVar = uVar2;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uVar = (x80.u) this.f3484k;
            ba0.g.M(obj);
        }
        ((x80.t) uVar).l0(null);
        return Unit.f26487a;
    }
}
