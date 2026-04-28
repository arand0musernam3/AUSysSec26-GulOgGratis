package aa;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f1180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1181k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f1182m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Ref.ObjectRef objectRef, a0 a0Var, x70.c cVar) {
        super(2, cVar);
        this.l = objectRef;
        this.f1182m = a0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new z(this.l, this.f1182m, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        T t9;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f1181k;
        if (i11 == 0) {
            ba0.g.M(obj);
            Ref.ObjectRef objectRef2 = this.l;
            this.f1180j = objectRef2;
            this.f1181k = 1;
            Object objA = this.f1182m.a(this);
            if (objA == aVar) {
                return aVar;
            }
            objectRef = objectRef2;
            t9 = objA;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = this.f1180j;
            ba0.g.M(obj);
            t9 = obj;
        }
        objectRef.element = t9;
        return Unit.f26487a;
    }
}
