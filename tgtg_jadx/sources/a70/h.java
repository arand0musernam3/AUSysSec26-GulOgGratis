package a70;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.f0;
import y80.j;
import y80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f963k;
    public final /* synthetic */ u l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, Ref.ObjectRef objectRef, x70.c cVar) {
        super(2, cVar);
        this.l = uVar;
        this.f964m = objectRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        h hVar = new h(this.l, this.f964m, cVar);
        hVar.f963k = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        j jVar = (j) this.f963k;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f962j;
        if (i11 == 0) {
            ba0.g.M(obj);
            g gVar = new g(this.l, this.f964m, jVar, null);
            this.f963k = null;
            this.f962j = 1;
            if (f0.n(gVar, this) == aVar) {
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
