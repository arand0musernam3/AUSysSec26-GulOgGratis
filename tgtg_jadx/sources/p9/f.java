package p9;

import cj.q;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.n;
import t1.y0;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34607a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f34608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34611e;

    public /* synthetic */ f(w6 w6Var, q qVar, Function0 function0, float f11, int i11) {
        this.f34609c = w6Var;
        this.f34610d = qVar;
        this.f34611e = function0;
        this.f34608b = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34607a) {
            case 0:
                b0 b0Var = (b0) this.f34609c;
                y0 y0Var = (y0) this.f34610d;
                o9.d dVar = (o9.d) this.f34611e;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                f0.B(b0Var, null, null, new g(fFloatValue, this.f34608b, y0Var, dVar, null), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                vi.c.s((w6) this.f34609c, (q) this.f34610d, (Function0) this.f34611e, this.f34608b, (n) obj, iF);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(b0 b0Var, float f11, y0 y0Var, o9.d dVar) {
        this.f34609c = b0Var;
        this.f34608b = f11;
        this.f34610d = y0Var;
        this.f34611e = dVar;
    }
}
