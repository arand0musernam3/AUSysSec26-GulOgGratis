package co;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.g1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8771j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f8772k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8774n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j9, b1 b1Var, b1 b1Var2, g1 g1Var, x70.c cVar) {
        super(2, cVar);
        this.f8772k = j9;
        this.l = b1Var;
        this.f8773m = b1Var2;
        this.f8774n = g1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8771j) {
            case 0:
                return new m(this.f8772k, (b1) this.l, (b1) this.f8773m, (g1) this.f8774n, cVar);
            case 1:
                m mVar = new m(this.f8772k, (b1) this.l, (b1) this.f8773m, cVar);
                mVar.f8774n = obj;
                return mVar;
            default:
                m mVar2 = new m((String) this.f8773m, (String) this.f8774n, this.f8772k, cVar);
                mVar2.l = obj;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8771j) {
            case 0:
                return ((m) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((m) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((m) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8771j;
        long j9 = this.f8772k;
        Object obj2 = this.f8773m;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((g1) this.f8774n).i(((c) ((b1) this.l).getValue()).a((q) ((b1) obj2).getValue(), (int) (j9 >> 32)));
                break;
            case 1:
                b0 b0Var = (b0) this.f8774n;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.d.v(b0Var, this.f8772k, new bm.j((b1) this.l, 3), new y((b1) obj2, null, 0), 2);
                break;
            default:
                h8.a aVar3 = (h8.a) this.l;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVar = ft.o.f17948h;
                aVar3.f(ft.o.f17948h, (String) obj2);
                aVar3.f(ft.o.f17949i, (String) this.f8774n);
                aVar3.f(ft.o.f17950j, new Long(j9));
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j9, b1 b1Var, b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f8772k = j9;
        this.l = b1Var;
        this.f8773m = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, long j9, x70.c cVar) {
        super(2, cVar);
        this.f8773m = str;
        this.f8774n = str2;
        this.f8772k = j9;
    }
}
