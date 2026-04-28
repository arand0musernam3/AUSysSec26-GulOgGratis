package e;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import v80.b0;
import y80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.BooleanRef f15288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15289k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, x70.c cVar) {
        super(2, cVar);
        this.l = jVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new i(this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f15289k;
        if (i11 == 0) {
            ba0.g.M(obj);
            j jVar = this.l;
            if (jVar.n()) {
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Function2 function2 = jVar.f15291d;
                x80.i iVar = jVar.f15292e;
                iVar.getClass();
                u uVar = new u(new y80.d(iVar, true), new h(booleanRef2, null));
                this.f15288j = booleanRef2;
                this.f15289k = 1;
                if (function2.invoke(uVar, this) == aVar) {
                    return aVar;
                }
                booleanRef = booleanRef2;
            }
            return Unit.f26487a;
        }
        if (i11 != 1) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        booleanRef = this.f15288j;
        ba0.g.M(obj);
        if (!booleanRef.element) {
            h2.b("You must collect the progress flow");
            return null;
        }
        return Unit.f26487a;
    }
}
