package j0;

import android.util.Log;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.f0;
import v80.i1;
import v80.j2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24289k;
    public final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f24288j = i11;
        this.l = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f24288j) {
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
        switch (this.f24288j) {
        }
        return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24288j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f24289k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    Log.d("CXCP", "Cancelling CameraPipe root Job...");
                    i1 i1Var = this.l.f24290a;
                    this.f24289k = 1;
                    if (f0.k(i1Var, this) == aVar) {
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
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f24289k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                g gVar = new g(this.l, null, 0);
                this.f24289k = 1;
                Object objC = j2.c(3000L, gVar, this);
                return objC == aVar2 ? aVar2 : objC;
        }
    }
}
