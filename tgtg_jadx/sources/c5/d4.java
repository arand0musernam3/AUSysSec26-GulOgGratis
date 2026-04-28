package c5;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7168k;
    public final /* synthetic */ Ref.ObjectRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m3.b2 f7169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f7170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4 f7171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f7172p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Ref.ObjectRef objectRef, m3.b2 b2Var, LifecycleOwner lifecycleOwner, e4 e4Var, View view, x70.c cVar) {
        super(2, cVar);
        this.l = objectRef;
        this.f7169m = b2Var;
        this.f7170n = lifecycleOwner;
        this.f7171o = e4Var;
        this.f7172p = view;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        d4 d4Var = new d4(this.l, this.f7169m, this.f7170n, this.f7171o, this.f7172p, cVar);
        d4Var.f7168k = obj;
        return d4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d4) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [v80.i1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        ?? r12;
        v80.i1 i1VarB;
        Object obj2 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f7167j;
        e4 e4Var = this.f7171o;
        LifecycleOwner lifecycleOwner = this.f7170n;
        x70.c cVar = null;
        try {
            if (i11 == 0) {
                ba0.g.M(obj);
                v80.b0 b0Var = (v80.b0) this.f7168k;
                try {
                    u2 u2Var = (u2) this.l.element;
                    if (u2Var != null) {
                        y80.y1 y1VarA = g4.a(this.f7172p.getContext().getApplicationContext());
                        u2Var.f7386a.i(((Number) y1VarA.getValue()).floatValue());
                        i1VarB = v80.f0.B(b0Var, null, null, new a3.x(y1VarA, u2Var, cVar, 22), 3);
                    } else {
                        i1VarB = null;
                    }
                    m3.b2 b2Var = this.f7169m;
                    this.f7168k = i1VarB;
                    this.f7167j = 1;
                    Object objK = v80.f0.K(b2Var.f29225a, new af.b(b2Var, new m3.a2(b2Var, null), m3.i.u(getContext()), (x70.c) null, 8), this);
                    if (objK != obj2) {
                        objK = Unit.f26487a;
                    }
                    if (objK != obj2) {
                        objK = Unit.f26487a;
                    }
                    if (objK == obj2) {
                        return obj2;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    r12 = 0;
                    if (r12 != 0) {
                        r12.a(null);
                    }
                    lifecycleOwner.getLifecycle().d(e4Var);
                    throw th2;
                }
            } else {
                if (i11 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i1VarB = (v80.i1) this.f7168k;
                ba0.g.M(obj);
            }
            if (i1VarB != null) {
                i1VarB.a(null);
            }
            lifecycleOwner.getLifecycle().d(e4Var);
            return Unit.f26487a;
        } catch (Throwable th4) {
            th2 = th4;
            r12 = i11;
        }
    }
}
