package rk;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;
import m3.i1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f38103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f38104k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f38105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Long f38106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i1 f38107o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Long l, i1 i1Var, x70.c cVar) {
        super(2, cVar);
        this.f38106n = l;
        this.f38107o = i1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        s sVar = new s(this.f38106n, this.f38107o, cVar);
        sVar.f38105m = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        long jCurrentTimeMillis;
        v80.b0 b0Var = (v80.b0) this.f38105m;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.l;
        if (i11 == 0) {
            ba0.g.M(obj);
            Long l = this.f38106n;
            jLongValue = (l != null ? l.longValue() : LongCompanionObject.MAX_VALUE) / 1000;
            jCurrentTimeMillis = 1000 - (System.currentTimeMillis() % 1000);
            this.f38105m = b0Var;
            this.f38103j = jLongValue;
            this.f38104k = jCurrentTimeMillis;
            this.l = 1;
            if (f0.o(jCurrentTimeMillis, this) != aVar) {
            }
            return aVar;
        }
        if (i11 != 1 && i11 != 2) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jCurrentTimeMillis = this.f38104k;
        jLongValue = this.f38103j;
        ba0.g.M(obj);
        while (f0.y(b0Var)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            this.f38107o.i(jCurrentTimeMillis2);
            if (jCurrentTimeMillis2 >= jLongValue) {
                break;
            }
            this.f38105m = b0Var;
            this.f38103j = jLongValue;
            this.f38104k = jCurrentTimeMillis;
            this.l = 2;
            if (f0.o(1000L, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f26487a;
    }
}
