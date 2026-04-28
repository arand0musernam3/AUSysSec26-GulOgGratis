package le;

import b0.y;
import com.braze.h2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import m3.k1;
import v80.f0;
import v80.x1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f27662k;
    public final /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f27663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f27664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f27665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ he.k f27666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f27667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f27668r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, int i11, int i12, boolean z11, float f11, he.k kVar, float f12, n nVar, x70.c cVar) {
        super(1, cVar);
        this.f27662k = hVar;
        this.l = i11;
        this.f27663m = i12;
        this.f27664n = z11;
        this.f27665o = f11;
        this.f27666p = kVar;
        this.f27667q = f12;
        this.f27668r = nVar;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new d(this.f27662k, this.l, this.f27663m, this.f27664n, this.f27665o, this.f27666p, this.f27667q, this.f27668r, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f27661j;
        h hVar = this.f27662k;
        try {
            if (i11 == 0) {
                ba0.g.M(obj);
                hVar.g(this.l);
                k1 k1Var = hVar.f27677a;
                k1 k1Var2 = hVar.f27679c;
                int i12 = this.f27663m;
                k1Var2.setValue(Integer.valueOf(i12));
                hVar.f27680d.setValue(Boolean.valueOf(this.f27664n));
                k1 k1Var3 = hVar.f27682f;
                float f11 = this.f27665o;
                k1Var3.setValue(Float.valueOf(f11));
                hVar.f27681e.setValue(null);
                k1 k1Var4 = hVar.f27685i;
                he.k kVar = this.f27666p;
                k1Var4.setValue(kVar);
                hVar.h(this.f27667q);
                k1 k1Var5 = hVar.f27683g;
                Boolean bool = Boolean.FALSE;
                k1Var5.setValue(bool);
                hVar.l.setValue(Long.MIN_VALUE);
                if (kVar == null) {
                    k1Var.setValue(bool);
                    return Unit.f26487a;
                }
                if (Float.isInfinite(f11)) {
                    hVar.h(hVar.e());
                    k1Var.setValue(bool);
                    hVar.g(i12);
                    return Unit.f26487a;
                }
                k1Var.setValue(Boolean.TRUE);
                int i13 = c.$EnumSwitchMapping$0[this.f27668r.ordinal()];
                if (i13 == 1) {
                    coroutineContext = x1.f42174a;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coroutineContext = kotlin.coroutines.g.f26549a;
                }
                y yVar = new y(this.f27668r, f0.t(getContext()), this.f27663m, this.l, this.f27662k, (x70.c) null);
                this.f27661j = 1;
                if (f0.K(coroutineContext, yVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            f0.p(getContext());
            h.d(hVar, false);
            return Unit.f26487a;
        } catch (Throwable th2) {
            h.d(hVar, false);
            throw th2;
        }
    }
}
