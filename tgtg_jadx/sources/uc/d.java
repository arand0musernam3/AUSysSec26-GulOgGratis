package uc;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import tc.n;
import v80.b0;
import zc.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f41016k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f41018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f41019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ pc.b f41021q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, k kVar, Object obj, Ref.ObjectRef objectRef3, pc.b bVar, x70.c cVar) {
        super(2, cVar);
        this.f41016k = hVar;
        this.l = objectRef;
        this.f41017m = objectRef2;
        this.f41018n = kVar;
        this.f41019o = obj;
        this.f41020p = objectRef3;
        this.f41021q = bVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f41016k, this.l, this.f41017m, this.f41018n, this.f41019o, this.f41020p, this.f41021q, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f41015j;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        n nVar = (n) this.l.element;
        pc.a aVar2 = (pc.a) this.f41017m.element;
        zc.n nVar2 = (zc.n) this.f41020p.element;
        this.f41015j = 1;
        Object objA = h.a(this.f41016k, nVar, aVar2, this.f41018n, this.f41019o, nVar2, this.f41021q, this);
        return objA == aVar ? aVar : objA;
    }
}
