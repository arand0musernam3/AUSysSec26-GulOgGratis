package ld;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import td.o;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f27613k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f27614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ td.i f27615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f27616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f27617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ fd.g f27618q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, td.i iVar, Object obj, Ref.ObjectRef objectRef3, fd.g gVar2, x70.c cVar) {
        super(2, cVar);
        this.f27613k = gVar;
        this.l = objectRef;
        this.f27614m = objectRef2;
        this.f27615n = iVar;
        this.f27616o = obj;
        this.f27617p = objectRef3;
        this.f27618q = gVar2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f27613k, this.l, this.f27614m, this.f27615n, this.f27616o, this.f27617p, this.f27618q, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f27612j;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        kd.k kVar = (kd.k) this.l.element;
        fd.e eVar = (fd.e) this.f27614m.element;
        o oVar = (o) this.f27617p.element;
        this.f27612j = 1;
        Object objA = g.a(this.f27613k, kVar, eVar, this.f27615n, this.f27616o, oVar, this.f27618q, this);
        return objA == aVar ? aVar : objA;
    }
}
