package x2;

import a3.b1;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f43775j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43776k;
    public final /* synthetic */ w l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w4.y f43777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f43778n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w4.y yVar, w wVar, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f43777m = yVar;
        this.l = wVar;
        this.f43778n = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f43775j) {
            case 0:
                return new u(this.f43777m, this.l, this.f43778n, cVar);
            default:
                return new u(this.l, this.f43777m, this.f43778n, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f43775j) {
        }
        return ((u) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43775j) {
            case 0:
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f43776k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    boolean z11 = this.f43778n;
                    w wVar = this.l;
                    c40.i iVar = new c40.i(wVar, z11);
                    m2.g gVar = new m2.g(wVar, 6);
                    this.f43776k = 1;
                    Object objE = z3.e(this.f43777m, new b1(iVar, gVar, (x70.c) null, 5), this);
                    if (objE != obj2) {
                        objE = Unit.f26487a;
                    }
                    if (objE == obj2) {
                    }
                }
                break;
            default:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f43776k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f43776k = 1;
                    if (w.b(this.l, this.f43777m, this.f43778n, this) == aVar) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, w4.y yVar, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.l = wVar;
        this.f43777m = yVar;
        this.f43778n = z11;
    }
}
