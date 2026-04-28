package y80;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f45543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45544k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f45545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f45546n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Ref.ObjectRef objectRef, x70.c cVar, j jVar) {
        super(2, cVar);
        this.f45545m = objectRef;
        this.f45546n = jVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        o oVar = new o(this.f45545m, cVar, this.f45546n);
        oVar.l = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create(new x80.p(((x80.p) obj).f44078a), (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, a90.v] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f45544k;
        if (i11 == 0) {
            ba0.g.M(obj);
            ?? r72 = ((x80.p) this.l).f44078a;
            boolean z11 = r72 instanceof x80.o;
            objectRef = this.f45545m;
            if (!z11) {
                objectRef.element = r72;
            }
            if (z11) {
                x80.n nVar = r72 instanceof x80.n ? (x80.n) r72 : null;
                Throwable th2 = nVar != null ? nVar.f44076a : null;
                if (th2 != null) {
                    throw th2;
                }
                Object obj2 = objectRef.element;
                if (obj2 != null) {
                    Object obj3 = obj2 != z80.b.f47357b ? obj2 : null;
                    this.l = r72;
                    this.f45543j = objectRef;
                    this.f45544k = 1;
                    if (this.f45546n.emit(obj3, this) == aVar) {
                        return aVar;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.element = z80.b.f47359d;
            }
            return Unit.f26487a;
        }
        if (i11 != 1) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        objectRef2 = this.f45543j;
        ba0.g.M(obj);
        objectRef = objectRef2;
        objectRef.element = z80.b.f47359d;
        return Unit.f26487a;
    }
}
