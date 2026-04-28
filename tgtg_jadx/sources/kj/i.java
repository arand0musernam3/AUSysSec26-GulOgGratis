package kj;

import at.o;
import com.braze.h2;
import f2.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.c3;
import m3.h1;
import n80.p;
import v80.b0;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26457k;
    public final /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f26458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f26460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f26461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c0 f26462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c3 f26463r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i11, h1 h1Var, int i12, int i13, int i14, c0 c0Var, c3 c3Var, x70.c cVar) {
        super(2, cVar);
        this.l = i11;
        this.f26458m = h1Var;
        this.f26459n = i12;
        this.f26460o = i13;
        this.f26461p = i14;
        this.f26462q = c0Var;
        this.f26463r = c3Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new i(this.l, this.f26458m, this.f26459n, this.f26460o, this.f26461p, this.f26462q, this.f26463r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int iC;
        int i11;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i12 = this.f26457k;
        c0 c0Var = this.f26462q;
        h1 h1Var = this.f26458m;
        int i13 = this.l;
        if (i12 == 0) {
            ba0.g.M(obj);
            if (i13 == h1Var.h()) {
                return Unit.f26487a;
            }
            o oVarD = m3.i.D(new f2.f(c0Var, 4));
            h hVar = new h(2, null);
            this.f26457k = 1;
            if (r.p(oVarD, hVar, this) != aVar) {
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i11 = this.f26456j;
            ba0.g.M(obj);
            iC = i11;
            h1Var.i(iC);
            return Unit.f26487a;
        }
        ba0.g.M(obj);
        iC = p.c(i13, 0, 23);
        c3 c3Var = this.f26463r;
        int iIntValue = ((Number) c3Var.getValue()).intValue() % this.f26459n;
        if (iIntValue != iC) {
            int iC2 = p.c(((((Number) c3Var.getValue()).intValue() - iIntValue) + iC) - this.f26460o, 0, this.f26461p - 1);
            this.f26456j = iC;
            this.f26457k = 2;
            ub.a aVar2 = c0.f17087x;
            if (c0Var.f(iC2, 0, this) != aVar) {
                i11 = iC;
                iC = i11;
            }
            return aVar;
        }
        h1Var.i(iC);
        return Unit.f26487a;
    }
}
