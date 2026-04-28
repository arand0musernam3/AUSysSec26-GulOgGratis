package z1;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.FloatRef f46455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t1.j f46456k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f46457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f46458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q2 f46459o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(float f11, e0 e0Var, q2 q2Var, x70.c cVar) {
        super(2, cVar);
        this.f46457m = f11;
        this.f46458n = e0Var;
        this.f46459o = q2Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d0(this.f46457m, this.f46458n, this.f46459o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        float f11;
        Ref.FloatRef floatRef;
        t1.j jVar;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.l;
        if (i11 == 0) {
            ba0.g.M(obj);
            f11 = this.f46457m;
            if (Math.abs(f11) > 1.0f) {
                floatRef = new Ref.FloatRef();
                floatRef.element = f11;
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                t1.j jVarB = t1.c.b(0.0f, f11, 28);
                try {
                    e0 e0Var = this.f46458n;
                    t1.s sVar = e0Var.f46477a;
                    yj.k kVar = new yj.k(floatRef2, this.f46459o, floatRef, e0Var);
                    this.f46455j = floatRef;
                    this.f46456k = jVarB;
                    this.l = 1;
                    if (t1.j1.d(jVarB, sVar, false, kVar, this) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused) {
                    jVar = jVarB;
                    floatRef.element = ((Number) jVar.b()).floatValue();
                }
                f11 = floatRef.element;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = this.f46456k;
            floatRef = this.f46455j;
            try {
                ba0.g.M(obj);
            } catch (CancellationException unused2) {
                floatRef.element = ((Number) jVar.b()).floatValue();
            }
            f11 = floatRef.element;
        }
        return new Float(f11);
    }
}
