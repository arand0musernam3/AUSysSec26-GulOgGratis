package w;

import android.util.Log;
import com.braze.h2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f42695k;
    public final /* synthetic */ j0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f42696m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Ref.BooleanRef booleanRef, x70.c cVar) {
        super(2, cVar);
        this.l = j0Var;
        this.f42696m = booleanRef;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        i0 i0Var = new i0(this.l, this.f42696m, cVar);
        i0Var.f42695k = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((List) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f42694j;
        Ref.BooleanRef booleanRef = this.f42696m;
        if (i11 == 0) {
            ba0.g.M(obj);
            List list = (List) this.f42695k;
            Log.d("PipePresenceSrc", "Flow emitted new camera set: ".concat(CollectionsKt.U(list, null, null, null, null, 63)));
            j0 j0Var = this.l;
            if (!j0Var.f42708h.get()) {
                bx.o.K(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
            } else if (booleanRef.element) {
                Log.i("PipePresenceSrc", "Handling first camera set, triggering fresh query.");
                ListenableFuture listenableFutureB = j0Var.b();
                this.f42694j = 1;
                if (p30.b.l(listenableFutureB, this) == aVar) {
                    return aVar;
                }
            } else {
                j0Var.a(list, null);
            }
            return Unit.f26487a;
        }
        if (i11 != 1) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        booleanRef.element = false;
        return Unit.f26487a;
    }
}
