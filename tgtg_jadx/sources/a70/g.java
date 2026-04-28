package a70;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.b0;
import y80.j;
import y80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f959k;
    public final /* synthetic */ u l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f961n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, Ref.ObjectRef objectRef, j jVar, x70.c cVar) {
        super(2, cVar);
        this.l = uVar;
        this.f960m = objectRef;
        this.f961n = jVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g gVar = new g(this.l, this.f960m, this.f961n, cVar);
        gVar.f959k = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f959k;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f958j;
        if (i11 == 0) {
            ba0.g.M(obj);
            f fVar = new f(this.f960m, this.f961n, b0Var);
            this.f959k = null;
            this.f958j = 1;
            if (this.l.collect(fVar, this) == aVar) {
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
