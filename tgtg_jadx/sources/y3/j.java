package y3;

import b3.n;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.CharsKt;
import m3.m;
import m3.s;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ub.a f45410a = new ub.a(28, new u60.a(22), new g0(11));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ub.a b(Function2 function2, Function1 function1) {
        return new ub.a(28, new n(19, function2), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
    }

    public static final Object c(Object[] objArr, Function0 function0, m3.n nVar) {
        return e(Arrays.copyOf(objArr, objArr.length), f45410a, function0, nVar, 3456, 0);
    }

    public static final Object d(Object[] objArr, i iVar, Function0 function0, m3.n nVar, int i11) {
        return e(Arrays.copyOf(objArr, objArr.length), iVar, function0, nVar, (i11 & 112) | MLKEMEngine.KyberPolyBytes | ((i11 << 3) & 7168), 0);
    }

    public static final Object e(Object[] objArr, i iVar, Function0 function0, m3.n nVar, int i11, int i12) {
        Object[] objArr2;
        Object obj;
        Object objC;
        if ((i12 & 2) != 0) {
            iVar = f45410a;
        }
        i iVar2 = iVar;
        s sVar = (s) nVar;
        String string = Long.toString(sVar.T, CharsKt.checkRadix(36));
        string.getClass();
        iVar2.getClass();
        e eVar = (e) sVar.j(g.f45406a);
        Object objM = sVar.M();
        m3.f fVar = m.f29332a;
        if (objM == fVar) {
            Object objE = (eVar == null || (objC = eVar.c(string)) == null) ? null : iVar2.e(objC);
            if (objE == null) {
                objE = function0.invoke();
            }
            objArr2 = objArr;
            a aVar = new a(iVar2, eVar, string, objE, objArr2);
            sVar.k0(aVar);
            objM = aVar;
        } else {
            objArr2 = objArr;
        }
        a aVar2 = (a) objM;
        Object objInvoke = Arrays.equals(objArr2, aVar2.f45395e) ? aVar2.f45394d : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zH = sVar.h(aVar2) | ((((i11 & 112) ^ 48) > 32 && sVar.h(iVar2)) || (i11 & 48) == 32) | sVar.h(eVar) | sVar.f(string) | sVar.h(objInvoke) | sVar.h(objArr2);
        Object objM2 = sVar.M();
        if (zH || objM2 == fVar) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            li.b bVar = new li.b(aVar2, iVar2, eVar, string, obj, objArr3, 2);
            sVar.k0(bVar);
            objM2 = bVar;
        } else {
            obj = objInvoke;
        }
        m3.i.j((Function0) objM2, sVar);
        return obj;
    }

    public static final c f(m3.n nVar) {
        s sVar = (s) nVar;
        sVar.a0(1967007413);
        Object[] objArr = new Object[0];
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            objM = new xw.a(4);
            sVar.k0(objM);
        }
        c cVar = (c) d(objArr, c.f45398e, (Function0) objM, sVar, MLKEMEngine.KyberPolyBytes);
        cVar.f45401c = (e) sVar.j(g.f45406a);
        sVar.q(false);
        return cVar;
    }
}
