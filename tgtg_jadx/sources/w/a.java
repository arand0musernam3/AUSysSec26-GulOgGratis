package w;

import b0.l1;
import b0.l2;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e6.i f42638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42639k;
    public final /* synthetic */ e6.i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l2 f42640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f42641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f42642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l2 f42643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f42644q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e6.i iVar, x70.c cVar, l2 l2Var, int i11, c cVar2) {
        super(2, cVar);
        this.l = iVar;
        this.f42640m = l2Var;
        this.f42641n = i11;
        this.f42642o = cVar2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new a(this.l, cVar, this.f42640m, this.f42641n, this.f42642o);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        e6.i iVar;
        int i11;
        l2 l2Var;
        e6.i iVar2;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i12 = this.f42639k;
        if (i12 == 0) {
            ba0.g.M(obj);
            l1 l1Var = this.f42642o.f42650c;
            iVar = this.l;
            this.f42638j = iVar;
            l2 l2Var2 = this.f42640m;
            this.f42643p = l2Var2;
            i11 = this.f42641n;
            this.f42644q = i11;
            this.f42639k = 1;
            obj = l1Var.c(this);
            if (obj != aVar) {
                l2Var = l2Var2;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar2 = this.f42638j;
            ba0.g.M(obj);
            iVar2.b(obj);
            return Unit.f26487a;
        }
        int i13 = this.f42644q;
        l2Var = this.f42643p;
        e6.i iVar3 = this.f42638j;
        ba0.g.M(obj);
        i11 = i13;
        iVar = iVar3;
        int iIntValue = ((Number) obj).intValue();
        this.f42638j = iVar;
        this.f42643p = null;
        this.f42639k = 2;
        obj = ((b0.o) l2Var.f5302k.getValue()).c(i11, iIntValue);
        if (obj != aVar) {
            iVar2 = iVar;
            iVar2.b(obj);
            return Unit.f26487a;
        }
        return aVar;
    }
}
