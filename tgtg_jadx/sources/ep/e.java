package ep;

import a3.p0;
import android.content.Context;
import androidx.lifecycle.l1;
import com.google.android.gms.internal.measurement.cg;
import g9.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16266a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f16267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f16268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f16269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16275j;

    public /* synthetic */ e(d0 d0Var, c3 c3Var, f0 f0Var, Context context, k8.d dVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4) {
        this.f16269d = d0Var;
        this.f16270e = c3Var;
        this.f16271f = f0Var;
        this.f16272g = context;
        this.f16273h = dVar;
        this.f16267b = b1Var;
        this.f16268c = b1Var2;
        this.f16274i = b1Var3;
        this.f16275j = b1Var4;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        yk.h hVar;
        switch (this.f16266a) {
            case 0:
                d0 d0Var = (d0) this.f16269d;
                c3 c3Var = (c3) this.f16270e;
                f0 f0Var = (f0) this.f16271f;
                Context context = (Context) this.f16272g;
                k8.d dVar = (k8.d) this.f16273h;
                b1 b1Var = (b1) this.f16274i;
                b1 b1Var2 = (b1) this.f16275j;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                Unit unit = Unit.f26487a;
                m3.s sVar = (m3.s) ((m3.n) obj3);
                boolean zH = sVar.h(d0Var);
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (zH || objM == fVar) {
                    objM = new n(d0Var, null, 0);
                    sVar.k0(objM);
                }
                m3.i.h(unit, (Function2) objM, sVar);
                boolean zF = sVar.f(c3Var) | sVar.h(f0Var) | sVar.h(d0Var) | sVar.h(context);
                Object objM2 = sVar.M();
                if (zF || objM2 == fVar) {
                    h hVar2 = new h(f0Var, d0Var, context, c3Var, this.f16267b, this.f16268c, 0);
                    sVar.k0(hVar2);
                    objM2 = hVar2;
                }
                Function1 function1 = (Function1) objM2;
                boolean zH2 = sVar.h(dVar);
                Object objM3 = sVar.M();
                if (zH2 || objM3 == fVar) {
                    objM3 = new cw.b(dVar, 10);
                    sVar.k0(objM3);
                }
                Function0 function0 = (Function0) objM3;
                boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new p0(b1Var2, 8);
                    sVar.k0(objM4);
                }
                Function1 function12 = (Function1) objM4;
                boolean zH3 = sVar.h(d0Var);
                Object objM5 = sVar.M();
                if (zH3 || objM5 == fVar) {
                    objM5 = new i(d0Var, 0);
                    sVar.k0(objM5);
                }
                lp.c.a(null, function1, function0, zBooleanValue, function12, (Function0) objM5, sVar, 24576);
                return unit;
            default:
                final tg.i iVar = (tg.i) this.f16269d;
                yk.h hVar3 = (yk.h) this.f16270e;
                Function0 function02 = (Function0) this.f16271f;
                String str = (String) this.f16272g;
                Function0 function03 = (Function0) this.f16273h;
                np.b bVar = (np.b) this.f16274i;
                vg.a aVar = (vg.a) this.f16275j;
                yk.j jVar = (yk.j) obj2;
                m3.n nVar = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                jVar.getClass();
                int i11 = yk.c.$EnumSwitchMapping$1[jVar.ordinal()];
                final b1 b1Var3 = this.f16267b;
                m3.f fVar2 = m3.m.f29332a;
                if (i11 == 1) {
                    m3.s sVar2 = (m3.s) nVar;
                    sVar2.a0(-754706441);
                    boolean zH4 = sVar2.h(iVar);
                    Object objM6 = sVar2.M();
                    if (zH4 || objM6 == fVar2) {
                        final int i12 = 1;
                        objM6 = new Function0() { // from class: yk.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        iVar.k(new vg.g(null, null, null, null, 15));
                                        b1Var3.setValue(j.SELECT_AREA);
                                        break;
                                    case 1:
                                        iVar.k(new vg.g(null, null, null, null, 15));
                                        b1Var3.setValue(j.SELECT_AREA);
                                        break;
                                    default:
                                        vg.f fVar3 = vg.f.SELECT_AREA_SEARCH_BOX;
                                        tg.i iVar2 = iVar;
                                        iVar2.j(fVar3, ((vg.a) iVar2.f40168g.getValue()).f42318b);
                                        b1Var3.setValue(j.SELECTED_ADDRESS_PICKER);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar2.k0(objM6);
                    }
                    Function0 function04 = (Function0) objM6;
                    boolean zH5 = sVar2.h(hVar3) | sVar2.h(iVar);
                    Object objM7 = sVar2.M();
                    if (zH5 || objM7 == fVar2) {
                        objM7 = new yj.l((Object) hVar3, (Object) iVar, b1Var3, 2);
                        sVar2.k0(objM7);
                    }
                    Function0 function05 = (Function0) objM7;
                    boolean zF2 = sVar2.f(function02);
                    Object objM8 = sVar2.M();
                    if (zF2 || objM8 == fVar2) {
                        objM8 = new vm.r(26, function02);
                        sVar2.k0(objM8);
                    }
                    z20.b.a(iVar, true, function04, function05, null, (Function0) objM8, str, sVar2, 48, 16);
                    sVar2.q(false);
                } else if (i11 != 2) {
                    b1 b1Var4 = this.f16268c;
                    if (i11 == 3) {
                        m3.s sVar3 = (m3.s) nVar;
                        sVar3.a0(-752200804);
                        Object objM9 = sVar3.M();
                        if (objM9 == fVar2) {
                            objM9 = new xq.b(b1Var3, 5);
                            sVar3.k0(objM9);
                        }
                        Function0 function06 = (Function0) objM9;
                        Object objM10 = sVar3.M();
                        if (objM10 == fVar2) {
                            objM10 = new co.d(b1Var3, b1Var4, 5);
                            sVar3.k0(objM10);
                        }
                        Function0 function07 = (Function0) objM10;
                        boolean zF3 = sVar3.f(function02);
                        Object objM11 = sVar3.M();
                        if (zF3 || objM11 == fVar2) {
                            objM11 = new vm.r(28, function02);
                            sVar3.k0(objM11);
                        }
                        lx.u.p(bVar, true, function06, function07, (Function0) objM11, str, sVar3, 3504);
                        sVar3.q(false);
                    } else {
                        if (i11 != 4) {
                            throw e0.f.v((m3.s) nVar, 114203569, false);
                        }
                        m3.s sVar4 = (m3.s) nVar;
                        sVar4.a0(-751415233);
                        boolean zBooleanValue2 = ((Boolean) b1Var4.getValue()).booleanValue();
                        boolean zH6 = sVar4.h(iVar);
                        Object objM12 = sVar4.M();
                        if (zH6 || objM12 == fVar2) {
                            final int i13 = 2;
                            objM12 = new Function0() { // from class: yk.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            iVar.k(new vg.g(null, null, null, null, 15));
                                            b1Var3.setValue(j.SELECT_AREA);
                                            break;
                                        case 1:
                                            iVar.k(new vg.g(null, null, null, null, 15));
                                            b1Var3.setValue(j.SELECT_AREA);
                                            break;
                                        default:
                                            vg.f fVar3 = vg.f.SELECT_AREA_SEARCH_BOX;
                                            tg.i iVar2 = iVar;
                                            iVar2.j(fVar3, ((vg.a) iVar2.f40168g.getValue()).f42318b);
                                            b1Var3.setValue(j.SELECTED_ADDRESS_PICKER);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar4.k0(objM12);
                        }
                        Function0 function08 = (Function0) objM12;
                        boolean zF4 = sVar4.f(function03);
                        Object objM13 = sVar4.M();
                        if (zF4 || objM13 == fVar2) {
                            objM13 = new vm.r(29, function03);
                            sVar4.k0(objM13);
                        }
                        Function0 function09 = (Function0) objM13;
                        boolean zH7 = sVar4.h(hVar3) | sVar4.h(iVar) | sVar4.f(aVar);
                        Object objM14 = sVar4.M();
                        if (zH7 || objM14 == fVar2) {
                            hVar = hVar3;
                            y1.d dVar2 = new y1.d(3, hVar, b1Var3, iVar, aVar);
                            sVar4.k0(dVar2);
                            objM14 = dVar2;
                        } else {
                            hVar = hVar3;
                        }
                        i80.n nVar2 = (i80.n) objM14;
                        Object objM15 = sVar4.M();
                        if (objM15 == fVar2) {
                            objM15 = new xq.b(b1Var4, 6);
                            sVar4.k0(objM15);
                        }
                        cg.h(hVar, bVar, function02, function08, function09, nVar2, str, zBooleanValue2, (Function0) objM15, sVar4, 100663296);
                        sVar4.q(false);
                    }
                } else {
                    m3.s sVar5 = (m3.s) nVar;
                    sVar5.a0(-753493783);
                    boolean zH8 = sVar5.h(iVar);
                    Object objM16 = sVar5.M();
                    if (zH8 || objM16 == fVar2) {
                        final int i14 = 0;
                        objM16 = new Function0() { // from class: yk.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        iVar.k(new vg.g(null, null, null, null, 15));
                                        b1Var3.setValue(j.SELECT_AREA);
                                        break;
                                    case 1:
                                        iVar.k(new vg.g(null, null, null, null, 15));
                                        b1Var3.setValue(j.SELECT_AREA);
                                        break;
                                    default:
                                        vg.f fVar3 = vg.f.SELECT_AREA_SEARCH_BOX;
                                        tg.i iVar2 = iVar;
                                        iVar2.j(fVar3, ((vg.a) iVar2.f40168g.getValue()).f42318b);
                                        b1Var3.setValue(j.SELECTED_ADDRESS_PICKER);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar5.k0(objM16);
                    }
                    Function0 function010 = (Function0) objM16;
                    Object objM17 = sVar5.M();
                    if (objM17 == fVar2) {
                        objM17 = new xw.a(22);
                        sVar5.k0(objM17);
                    }
                    Function0 function011 = (Function0) objM17;
                    boolean zH9 = sVar5.h(iVar) | sVar5.h(hVar3) | sVar5.f(function03);
                    Object objM18 = sVar5.M();
                    if (zH9 || objM18 == fVar2) {
                        objM18 = new yj.l(iVar, hVar3, function03, 1);
                        sVar5.k0(objM18);
                    }
                    Function0 function012 = (Function0) objM18;
                    boolean zF5 = sVar5.f(function02);
                    Object objM19 = sVar5.M();
                    if (zF5 || objM19 == fVar2) {
                        objM19 = new vm.r(27, function02);
                        sVar5.k0(objM19);
                    }
                    z20.b.a(iVar, true, function010, function011, function012, (Function0) objM19, str, sVar5, 3120, 0);
                    sVar5.q(false);
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ e(tg.i iVar, yk.h hVar, Function0 function0, String str, Function0 function02, np.b bVar, vg.a aVar, b1 b1Var, b1 b1Var2) {
        this.f16269d = iVar;
        this.f16270e = hVar;
        this.f16271f = function0;
        this.f16272g = str;
        this.f16273h = function02;
        this.f16274i = bVar;
        this.f16275j = aVar;
        this.f16267b = b1Var;
        this.f16268c = b1Var2;
    }
}
