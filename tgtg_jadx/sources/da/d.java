package da;

import com.braze.h2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import u70.q;
import v80.b0;
import v80.f0;
import w2.z;
import y80.m1;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14806j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14807k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f14808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f14809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f14810o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f14811p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CoroutineContext coroutineContext, v vVar, boolean z11, boolean z12, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f14809n = coroutineContext;
        this.f14810o = vVar;
        this.l = z11;
        this.f14808m = z12;
        this.f14811p = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14806j) {
            case 0:
                return new d((CoroutineContext) this.f14809n, (v) this.f14810o, this.l, this.f14808m, (Function1) this.f14811p, cVar);
            default:
                return new d((ni.e) this.f14809n, this.l, this.f14808m, (String) this.f14810o, (String) this.f14811p, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f14806j) {
        }
        return ((d) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        d dVar;
        switch (this.f14806j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f14807k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                CoroutineContext coroutineContext = (CoroutineContext) this.f14809n;
                c cVar = new c((v) this.f14810o, this.l, this.f14808m, (Function1) this.f14811p, (x70.c) null);
                this.f14807k = 1;
                Object objK = f0.K(coroutineContext, cVar, this);
                return objK == aVar ? aVar : objK;
            default:
                ni.e eVar = (ni.e) this.f14809n;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f14807k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    z zVar = eVar.f30876b;
                    String str = (String) this.f14810o;
                    String str2 = (String) this.f14811p;
                    this.f14807k = 1;
                    dVar = this;
                    if (zVar.E(this.l, this.f14808m, str, str2, null, dVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            ba0.g.M(obj);
                            return Unit.f26487a;
                        }
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    ((q) obj).getClass();
                    dVar = this;
                }
                m1 m1Var = eVar.f30881g;
                dVar.f14807k = 2;
                if (m1Var.emit(ni.a.f30856a, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ni.e eVar, boolean z11, boolean z12, String str, String str2, x70.c cVar) {
        super(2, cVar);
        this.f14809n = eVar;
        this.l = z11;
        this.f14808m = z12;
        this.f14810o = str;
        this.f14811p = str2;
    }
}
