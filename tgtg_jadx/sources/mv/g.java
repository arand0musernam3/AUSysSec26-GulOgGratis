package mv;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f30185k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j9, x70.c cVar) {
        super(2, cVar);
        this.l = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g gVar = new g(this.l, cVar);
        gVar.f30185k = ((Number) obj).longValue();
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(Long.valueOf(((Number) obj).longValue()), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        long j9 = this.f30185k;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f30184j;
        if (i11 == 0) {
            ba0.g.M(obj);
            if (j9 != this.l) {
                this.f30185k = j9;
                this.f30184j = 1;
                if (v80.f0.o(1000L, this) == aVar) {
                    return aVar;
                }
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
