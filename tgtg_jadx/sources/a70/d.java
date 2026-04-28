package a70;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f952k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f951j = i12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f951j) {
            case 0:
                return new d(2, cVar, 0);
            case 1:
                return new d(2, cVar, 1);
            default:
                d dVar = new d(2, cVar, 2);
                dVar.f952k = ((Number) obj).intValue();
                return dVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f951j) {
            case 0:
                return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((d) create(Integer.valueOf(((Number) obj).intValue()), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f951j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f952k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    this.f952k = 1;
                    if (f0.o(500L, this) == aVar) {
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
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f952k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f952k = 1;
                    if (f0.o(3000L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                return Boolean.valueOf(this.f952k > 0);
        }
    }
}
