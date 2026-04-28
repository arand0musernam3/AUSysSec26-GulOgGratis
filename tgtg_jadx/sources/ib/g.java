package ib;

import androidx.work.CoroutineWorker;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f23724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23725k;
    public final /* synthetic */ CoroutineWorker l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CoroutineWorker coroutineWorker, x70.c cVar, int i11) {
        super(2, cVar);
        this.f23724j = i11;
        this.l = coroutineWorker;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f23724j) {
            case 0:
                return new g(this.l, cVar, 0);
            default:
                return new g(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f23724j) {
            case 0:
                g gVar = (g) create(b0Var, cVar);
                Unit unit = Unit.f26487a;
                gVar.invokeSuspend(unit);
                return unit;
            default:
                return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23724j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f23725k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f23725k = 1;
                    h2.b("Not implemented");
                } else {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f23725k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f23725k = 1;
                    Object objD = this.l.d(this);
                    return objD == aVar2 ? aVar2 : objD;
                }
                if (i12 == 1) {
                    ba0.g.M(obj);
                    return obj;
                }
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
