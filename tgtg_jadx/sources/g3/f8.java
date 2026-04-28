package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18620a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18626g;

    public /* synthetic */ f8(g9 g9Var, boolean z11, boolean z12, b2.k kVar, d9 d9Var, i4.v0 v0Var, int i11) {
        g9 g9Var2 = g9.f18691a;
        g9 g9Var3 = g9.f18691a;
        this.f18623d = g9Var;
        this.f18621b = z11;
        this.f18622c = z12;
        this.f18624e = kVar;
        this.f18625f = d9Var;
        this.f18626g = v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f18620a;
        Object obj3 = this.f18623d;
        Object obj4 = this.f18625f;
        Object obj5 = this.f18626g;
        Object obj6 = this.f18624e;
        switch (i11) {
            case 0:
                b4.t tVar = (b4.t) obj3;
                v1.e1 e1Var = (v1.e1) obj6;
                Function0 function0 = (Function0) obj4;
                u3.d dVar = (u3.d) obj5;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b4.t tVarD = d2.m2.d(k2.c.a(tVar, this.f18621b, null, e1Var, this.f18622c, new j5.j(4), function0), 1.0f);
                    d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarD, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    dVar.invoke(d2.z.f13980a, sVar, 6);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                g9 g9Var = g9.f18691a;
                g9 g9Var2 = g9.f18691a;
                ((Integer) obj2).getClass();
                ((g9) obj3).a(this.f18621b, this.f18622c, (b2.k) obj6, (d9) obj4, (i4.v0) obj5, (m3.n) obj, m3.i.F(114822145));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ii.l.k(this.f18621b, this.f18622c, (Function0) obj4, (Function0) obj3, (Function0) obj6, (Function0) obj5, (m3.n) obj, m3.i.F(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                po.c.e((w6) obj3, (Function0) obj4, this.f18621b, this.f18622c, (Function1) obj6, (Function1) obj5, (m3.n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                v1.n.a((d6.i0) obj6, (u3.d) obj5, (v1.u) obj4, (b4.t) obj3, this.f18621b, this.f18622c, (m3.n) obj, m3.i.F(1572913));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f8(d6.i0 i0Var, u3.d dVar, v1.u uVar, b4.t tVar, boolean z11, boolean z12, int i11) {
        this.f18624e = i0Var;
        this.f18626g = dVar;
        this.f18625f = uVar;
        this.f18623d = tVar;
        this.f18621b = z11;
        this.f18622c = z12;
    }

    public /* synthetic */ f8(w6 w6Var, Function0 function0, boolean z11, boolean z12, Function1 function1, Function1 function12, int i11) {
        this.f18623d = w6Var;
        this.f18625f = function0;
        this.f18621b = z11;
        this.f18622c = z12;
        this.f18624e = function1;
        this.f18626g = function12;
    }

    public /* synthetic */ f8(b4.t tVar, boolean z11, t5 t5Var, boolean z12, Function0 function0, u3.d dVar) {
        this.f18623d = tVar;
        this.f18621b = z11;
        this.f18624e = t5Var;
        this.f18622c = z12;
        this.f18625f = function0;
        this.f18626g = dVar;
    }

    public /* synthetic */ f8(boolean z11, boolean z12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i11) {
        this.f18621b = z11;
        this.f18622c = z12;
        this.f18625f = function0;
        this.f18623d = function02;
        this.f18624e = function03;
        this.f18626g = function04;
    }
}
