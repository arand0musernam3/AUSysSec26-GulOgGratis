package t1;

import com.google.android.gms.internal.measurement.cg;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f39404a = c.j(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f39405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f39406c;

    static {
        Object obj = d2.f39417a;
        f39405b = c.j(0.0f, 0.0f, new z5.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        IntCompanionObject intCompanionObject = IntCompanionObject.INSTANCE;
        f39406c = c.j(0.0f, 0.0f, 1, 3);
    }

    public static final c3 a(float f11, x xVar, String str, m3.n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            xVar = f39405b;
        }
        x xVar2 = xVar;
        if ((i12 & 4) != 0) {
            str = "DpAnimation";
        }
        return d(new z5.f(f11), c.l, xVar2, null, str, null, nVar, ((i11 << 3) & 896) | ((i11 << 6) & 57344), 8);
    }

    public static final c3 b(float f11, i iVar, String str, Function1 function1, m3.n nVar, int i11, int i12) {
        i iVar2;
        int i13 = i12 & 2;
        b1 b1Var = f39404a;
        if (i13 != 0) {
            iVar = b1Var;
        }
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (iVar == b1Var) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(1144089983);
            boolean zC = sVar.c(0.01f);
            Object objM = sVar.M();
            if (zC || objM == m3.m.f29332a) {
                objM = c.j(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                sVar.k0(objM);
            }
            sVar.q(false);
            iVar2 = (b1) objM;
        } else {
            m3.s sVar2 = (m3.s) nVar;
            sVar2.a0(1144199909);
            sVar2.q(false);
            iVar2 = iVar;
        }
        Float fValueOf = Float.valueOf(f11);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return d(fValueOf, c.f39389j, iVar2, Float.valueOf(0.01f), str2, function12, nVar, (i11 << 3) & 516096, 0);
    }

    public static final c3 c(int i11, u1 u1Var, String str, m3.n nVar, int i12) {
        i iVar = u1Var;
        if ((i12 & 2) != 0) {
            iVar = f39406c;
        }
        Integer numValueOf = Integer.valueOf(i11);
        IntCompanionObject intCompanionObject = IntCompanionObject.INSTANCE;
        return d(numValueOf, c.f39390k, iVar, null, str, null, nVar, 24576, 8);
    }

    public static final c3 d(Object obj, v1 v1Var, i iVar, Float f11, String str, Function1 function1, m3.n nVar, int i11, int i12) {
        if ((i12 & 8) != 0) {
            f11 = null;
        }
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = m3.i.w(null);
            sVar.k0(objM);
        }
        m3.b1 b1Var = (m3.b1) objM;
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = new b(obj, v1Var, f11);
            sVar.k0(objM2);
        }
        b bVar = (b) objM2;
        m3.b1 b1VarB = m3.i.B(function1, sVar);
        if (f11 != null && (iVar instanceof b1)) {
            b1 b1Var2 = (b1) iVar;
            if (!Intrinsics.areEqual(b1Var2.f39374c, f11)) {
                iVar = new b1(b1Var2.f39372a, b1Var2.f39373b, f11);
            }
        }
        m3.b1 b1VarB2 = m3.i.B(iVar, sVar);
        Object objM3 = sVar.M();
        if (objM3 == fVar) {
            objM3 = cg.a(-1, null, null, 6);
            sVar.k0(objM3);
        }
        x80.m mVar = (x80.m) objM3;
        boolean zH = sVar.h(mVar) | ((((i11 & 14) ^ 6) > 4 && sVar.h(obj)) || (i11 & 6) == 4);
        Object objM4 = sVar.M();
        if (zH || objM4 == fVar) {
            objM4 = new qw.b(21, mVar, obj);
            sVar.k0(objM4);
        }
        m3.i.j((Function0) objM4, sVar);
        boolean zH2 = sVar.h(mVar) | sVar.h(bVar) | sVar.f(b1VarB2) | sVar.f(b1VarB);
        Object objM5 = sVar.M();
        if (zH2 || objM5 == fVar) {
            al.j jVar = new al.j(mVar, bVar, b1VarB2, b1VarB, null, 9);
            sVar.k0(jVar);
            objM5 = jVar;
        }
        m3.i.h(mVar, (Function2) objM5, sVar);
        c3 c3Var = (c3) b1Var.getValue();
        return c3Var == null ? bVar.f39359c : c3Var;
    }
}
