package w2;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c5.u3;
import c5.x2;
import com.braze.h2;
import com.google.android.gms.internal.measurement.te;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f42897k;
    public final /* synthetic */ y80.e1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s1 f42898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o1 f42899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ub.a f42900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c5.x0 f42901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r5.m f42902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function1 f42903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function0 f42904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u3 f42905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f42906u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y80.e1 e1Var, s1 s1Var, o1 o1Var, ub.a aVar, c5.x0 x0Var, r5.m mVar, Function1 function1, Function0 function0, u3 u3Var, Function1 function12, x70.c cVar) {
        super(2, cVar);
        this.l = e1Var;
        this.f42898m = s1Var;
        this.f42899n = o1Var;
        this.f42900o = aVar;
        this.f42901p = x0Var;
        this.f42902q = mVar;
        this.f42903r = function1;
        this.f42904s = function0;
        this.f42905t = u3Var;
        this.f42906u = function12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        g gVar = new g(this.l, this.f42898m, this.f42899n, this.f42900o, this.f42901p, this.f42902q, this.f42903r, this.f42904s, this.f42905t, this.f42906u, cVar);
        gVar.f42897k = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f42896j;
        if (i11 == 0) {
            ba0.g.M(obj);
            v80.b0 b0Var = (v80.b0) this.f42897k;
            v80.d0 d0Var = v80.d0.UNDISPATCHED;
            s1 s1Var = this.f42898m;
            ub.a aVar2 = this.f42900o;
            x70.c cVar = null;
            v80.f0.B(b0Var, null, d0Var, new tm.d(s1Var, aVar2, cVar, 12), 1);
            y80.e1 e1Var = this.l;
            if (e1Var != null) {
                v80.f0.B(b0Var, null, null, new tm.d(e1Var, aVar2, cVar, 13), 3);
            }
            final oa0.m0 m0Var = new oa0.m0(s1Var, this.f42899n, aVar2, b0Var);
            final s1 s1Var2 = this.f42898m;
            final r5.m mVar = this.f42902q;
            final ub.a aVar3 = this.f42900o;
            final Function1 function1 = this.f42903r;
            final o1 o1Var = this.f42899n;
            final Function0 function0 = this.f42904s;
            final u3 u3Var = this.f42905t;
            final Function1 function12 = this.f42906u;
            x2 x2Var = new x2() { // from class: w2.e
                @Override // c5.x2
                public final InputConnection a(EditorInfo editorInfo) {
                    s1 s1Var3 = s1Var2;
                    a3.j jVar = new a3.j(s1Var3);
                    te teVar = new te();
                    teVar.f11895c = jVar;
                    teVar.f11896d = s1Var3;
                    teVar.f11897e = aVar3;
                    teVar.f11898f = function1;
                    teVar.f11899g = m0Var;
                    teVar.f11900h = o1Var;
                    teVar.f11901i = function0;
                    teVar.f11893a = u3Var;
                    teVar.f11902j = function12;
                    teVar.f11894b = jVar;
                    c0.z(editorInfo, s1Var3.d(), s1Var3.d().f41929d, mVar);
                    return new p0(teVar, editorInfo);
                }
            };
            this.f42896j = 1;
            if (this.f42901p.a(x2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        qc.y.m();
        return null;
    }
}
