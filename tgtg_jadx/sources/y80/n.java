package y80;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f45537k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Ref.ObjectRef objectRef, x70.c cVar, j jVar) {
        super(1, cVar);
        this.f45537k = jVar;
        this.l = objectRef;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new n(this.l, cVar, this.f45537k);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f45536j;
        Ref.ObjectRef objectRef = this.l;
        if (i11 == 0) {
            ba0.g.M(obj);
            a90.v vVar = z80.b.f47357b;
            Object obj2 = objectRef.element;
            if (obj2 == vVar) {
                obj2 = null;
            }
            this.f45536j = 1;
            if (this.f45537k.emit(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        objectRef.element = null;
        return Unit.f26487a;
    }
}
