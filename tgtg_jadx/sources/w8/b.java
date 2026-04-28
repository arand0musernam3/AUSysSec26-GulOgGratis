package w8;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.x0;
import com.braze.h2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import m3.t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f43284k;
    public final /* synthetic */ Lifecycle l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f43285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f43286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y80.i f43287o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, y80.i iVar, x70.c cVar) {
        super(2, cVar);
        this.l = lifecycle;
        this.f43285m = state;
        this.f43286n = coroutineContext;
        this.f43287o = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b bVar = new b(this.l, this.f43285m, this.f43286n, this.f43287o, cVar);
        bVar.f43284k = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((t1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f43283j;
        if (i11 == 0) {
            ba0.g.M(obj);
            tg.g gVar = new tg.g(this.f43286n, this.f43287o, (t1) this.f43284k, null, 8);
            this.f43283j = 1;
            if (x0.a(this.l, this.f43285m, gVar, this) == aVar) {
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
