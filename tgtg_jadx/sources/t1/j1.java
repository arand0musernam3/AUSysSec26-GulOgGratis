package t1;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static final Object a(float f11, float f12, float f13, i iVar, Function2 function2, z70.i iVar2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        v1 v1Var = c.f39389j;
        Float f14 = new Float(f11);
        Float f15 = new Float(f12);
        Float f16 = new Float(f13);
        Function1 function1 = v1Var.f39591a;
        o oVarC = (o) function1.invoke(f16);
        if (oVarC == null) {
            oVarC = ((o) function1.invoke(f14)).c();
        }
        o oVar = oVarC;
        Object objB = b(new j(v1Var, f14, oVar, 56), new k1(iVar, v1Var, f14, f15, oVar), Long.MIN_VALUE, new sg.c(function2, 3), iVar2);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objB != aVar) {
            objB = Unit.f26487a;
        }
        return objB == aVar ? objB : Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, t1.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(t1.j r22, t1.e r23, long r24, final kotlin.jvm.functions.Function1 r26, z70.c r27) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.j1.b(t1.j, t1.e, long, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(float f11, float f12, i iVar, Function2 function2, z70.i iVar2, int i11) {
        if ((i11 & 8) != 0) {
            iVar = c.j(0.0f, 0.0f, null, 7);
        }
        return a(f11, f12, 0.0f, iVar, function2, iVar2);
    }

    public static final Object d(j jVar, s sVar, boolean z11, Function1 function1, z70.c cVar) {
        Object objB = b(jVar, new dy.j(sVar, jVar.f39463a, jVar.f39464b.getValue(), jVar.f39465c), z11 ? jVar.f39466d : Long.MIN_VALUE, function1, cVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public static final Object e(j jVar, Float f11, i iVar, boolean z11, Function1 function1, z70.c cVar) {
        Object objB = b(jVar, new k1(iVar, jVar.f39463a, jVar.f39464b.getValue(), f11, jVar.f39465c), z11 ? jVar.f39466d : Long.MIN_VALUE, function1, cVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public static /* synthetic */ Object f(j jVar, Float f11, i iVar, boolean z11, Function1 function1, z70.c cVar, int i11) {
        if ((i11 & 2) != 0) {
            iVar = c.j(0.0f, 0.0f, null, 7);
        }
        i iVar2 = iVar;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            function1 = new rk.z(10);
        }
        return e(jVar, f11, iVar2, z12, function1, cVar);
    }

    public static final void g(h hVar, long j9, float f11, e eVar, j jVar, Function1 function1) {
        long jB = f11 == 0.0f ? eVar.b() : (long) ((j9 - hVar.f39445c) / f11);
        hVar.f39449g = j9;
        hVar.f39447e.setValue(eVar.f(jB));
        hVar.f39448f = eVar.d(jB);
        if (eVar.e(jB)) {
            hVar.f39450h = hVar.f39449g;
            hVar.f39451i.setValue(Boolean.FALSE);
        }
        i(hVar, jVar);
        function1.invoke(hVar);
    }

    public static final float h(CoroutineContext coroutineContext) {
        b4.u uVar = (b4.u) coroutineContext.get(b4.d.f5697p);
        float fG = uVar != null ? uVar.G() : 1.0f;
        if (fG >= 0.0f) {
            return fG;
        }
        o0.b("negative scale factor");
        return fG;
    }

    public static final void i(h hVar, j jVar) {
        jVar.f39464b.setValue(hVar.f39447e.getValue());
        o oVar = jVar.f39465c;
        o oVar2 = hVar.f39448f;
        int iB = oVar.b();
        for (int i11 = 0; i11 < iB; i11++) {
            oVar.e(oVar2.a(i11), i11);
        }
        jVar.f39467e = hVar.f39450h;
        jVar.f39466d = hVar.f39449g;
        jVar.f39468f = ((Boolean) hVar.f39451i.getValue()).booleanValue();
    }
}
