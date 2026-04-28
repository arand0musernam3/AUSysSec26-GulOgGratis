package da;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y9.d0;
import y9.e0;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f14795k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f14797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f14798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f14799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f14800q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z11, boolean z12, v vVar, x70.c cVar, Function1 function1, int i11) {
        super(2, cVar);
        this.f14794j = i11;
        this.f14797n = z11;
        this.f14798o = z12;
        this.f14799p = vVar;
        this.f14800q = function1;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f14794j) {
            case 0:
                b bVar = new b(this.f14797n, this.f14798o, this.f14799p, cVar, this.f14800q, 0);
                bVar.f14796m = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f14797n, this.f14798o, this.f14799p, cVar, this.f14800q, 1);
                bVar2.f14796m = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f14794j) {
        }
        return ((b) create(e0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
