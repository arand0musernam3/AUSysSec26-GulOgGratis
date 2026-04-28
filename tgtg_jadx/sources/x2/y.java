package x2;

import bg.a1;
import g9.c0;
import kotlin.Unit;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m2.h0;
import m3.b1;
import w2.g0;
import z1.g2;
import z1.k3;
import z1.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f43813e;

    public /* synthetic */ y(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f43809a = i11;
        this.f43810b = obj;
        this.f43811c = obj2;
        this.f43812d = obj3;
        this.f43813e = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43809a) {
            case 0:
                Function0 function0 = (Function0) this.f43810b;
                Function0 function02 = (Function0) this.f43811c;
                w wVar = (w) this.f43812d;
                b0 b0Var = (b0) this.f43813e;
                p2.g gVar = (p2.g) obj;
                function0.invoke();
                if (function02 != null ? ((Boolean) function02.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                wVar.w(b0Var);
                break;
            case 1:
                String str = (String) this.f43810b;
                yi.r rVar = (yi.r) this.f43811c;
                b1 b1Var = (b1) this.f43812d;
                b1 b1Var2 = (b1) this.f43813e;
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                g0 g0Var = new g0(15);
                g0 g0Var2 = new g0(16);
                g0 g0Var3 = new g0(17);
                g0 g0Var4 = new g0(18);
                h0 h0Var = new h0(rVar, b1Var, b1Var2, 28);
                n0 n0Var = n0.f26529a;
                c0 c0Var2 = new c0(c0Var.f20108g, str, "checkout_flow");
                h0Var.invoke(c0Var2);
                g9.b0 b0VarI = c0Var2.i();
                n0Var.getClass();
                m0 m0Var = m0.f26528a;
                m0Var.getClass();
                m0Var.getClass();
                if (b0VarI instanceof i9.f) {
                    i9.f fVar = (i9.f) b0VarI;
                    fVar.f23507i = g0Var;
                    fVar.f23508j = g0Var2;
                    fVar.f23509k = g0Var3;
                    fVar.l = g0Var4;
                }
                c0Var.f20111j.add(b0VarI);
                break;
            default:
                Ref.FloatRef floatRef = (Ref.FloatRef) this.f43810b;
                g2 g2Var = (g2) this.f43811c;
                k3 k3Var = (k3) this.f43812d;
                a1 a1Var = (a1) this.f43813e;
                t1.h hVar = (t1.h) obj;
                float fFloatValue = ((Number) hVar.f39447e.getValue()).floatValue() - floatRef.element;
                if (!y1.a(fFloatValue)) {
                    if (!y1.a(fFloatValue - g2Var.c(k3Var, fFloatValue))) {
                        hVar.a();
                    } else {
                        floatRef.element += fFloatValue;
                    }
                }
                if (((Boolean) a1Var.invoke(Float.valueOf(floatRef.element))).booleanValue()) {
                    hVar.a();
                }
                break;
        }
        return Unit.f26487a;
    }
}
