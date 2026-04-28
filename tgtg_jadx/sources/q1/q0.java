package q1;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r0 f35810k;
    public s0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f35811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f35814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s0 f35815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r0 f35816r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, r0 r0Var, x70.c cVar) {
        super(2, cVar);
        this.f35815q = s0Var;
        this.f35816r = r0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        q0 q0Var = new q0(this.f35815q, this.f35816r, cVar);
        q0Var.f35814p = obj;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        s0 s0Var;
        long[] jArr;
        int i11;
        r0 r0Var;
        o80.k kVar;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i12 = this.f35813o;
        if (i12 == 0) {
            ba0.g.M(obj);
            o80.k kVar2 = (o80.k) this.f35814p;
            s0Var = this.f35815q;
            p0 p0Var = s0Var.f35828b;
            jArr = p0Var.f35739c;
            i11 = p0Var.f35741e;
            r0Var = this.f35816r;
            kVar = kVar2;
        } else {
            if (i12 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = this.f35812n;
            long[] jArr2 = this.f35811m;
            s0 s0Var2 = this.l;
            r0Var = this.f35810k;
            kVar = (o80.k) this.f35814p;
            ba0.g.M(obj);
            i11 = i13;
            s0Var = s0Var2;
            jArr = jArr2;
        }
        while (i11 != Integer.MAX_VALUE) {
            int i14 = (int) ((jArr[i11] >> 31) & 2147483647L);
            r0Var.f35819b = i11;
            Object obj2 = s0Var.f35828b.f35738b[i11];
            this.f35814p = kVar;
            this.f35810k = r0Var;
            this.l = s0Var;
            this.f35811m = jArr;
            this.f35812n = i14;
            this.f35813o = 1;
            if (kVar.a(obj2, this) == aVar) {
                return aVar;
            }
            i11 = i14;
        }
        return Unit.f26487a;
    }
}
