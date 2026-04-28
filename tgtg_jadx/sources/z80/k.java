package z80;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f47378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f47379k;
    public final /* synthetic */ l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y80.j f47380m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, y80.j jVar, x70.c cVar) {
        super(2, cVar);
        this.l = lVar;
        this.f47380m = jVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        k kVar = new k(this.l, this.f47380m, cVar);
        kVar.f47379k = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f47378j;
        if (i11 == 0) {
            ba0.g.M(obj);
            b0 b0Var = (b0) this.f47379k;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            l lVar = this.l;
            y80.i iVar = lVar.f47369d;
            j jVar = new j(objectRef, b0Var, lVar, this.f47380m);
            this.f47378j = 1;
            if (iVar.collect(jVar, this) == aVar) {
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
