package m90;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import b0.n2;
import b0.o2;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements n1, b1, x.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29841b;

    public q(Function1 function1) {
        this.f29841b = function1;
        this.f29840a = new r();
    }

    @Override // x.k
    public float a() {
        Object upper = ((Range) this.f29840a).getUpper();
        upper.getClass();
        return ((Number) upper).floatValue();
    }

    @Override // x.k
    public float d() {
        Object lower = ((Range) this.f29840a).getLower();
        lower.getClass();
        return ((Number) lower).floatValue();
    }

    @Override // x.k
    public v80.i0 f(o2 o2Var) {
        o2Var.getClass();
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        key.getClass();
        ArrayList arrayListJ = kotlin.collections.d0.j(key);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            key2.getClass();
            arrayListJ.add(key2);
        }
        return o2Var.j(arrayListJ, n2.DEFAULT);
    }

    @Override // x.k
    public v80.i0 g(o2 o2Var) {
        o2Var.getClass();
        float fD = d();
        if (1.0f > a() || fD > 1.0f) {
            i4.a.f("Failed requirement.");
            return null;
        }
        LinkedHashMap linkedHashMapF = kotlin.collections.x0.f(new Pair(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f)));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            e0.u uVar = e0.v.f15412i0;
            e0.v vVar = ((b0.n) this.f29841b).f5321b;
            uVar.getClass();
            vVar.getClass();
            if (i11 >= 34 && f0.a0.c(vVar)) {
                h7.i0.x(linkedHashMapF);
            }
        }
        return o2.k(o2Var, linkedHashMapF);
    }

    @Override // m90.b1
    public Object k(KClass kClass, ArrayList arrayList) {
        Object pVar;
        Object obj = ((r) this.f29840a).get(y9.w.v(kClass));
        obj.getClass();
        u0 u0Var = (u0) obj;
        Object a1Var = u0Var.f29866a.get();
        if (a1Var == null) {
            synchronized (u0Var) {
                a1Var = u0Var.f29866a.get();
                if (a1Var == null) {
                    a1Var = new a1();
                    u0Var.f29866a = new SoftReference(a1Var);
                }
            }
        }
        a1 a1Var2 = (a1) a1Var;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = a1Var2.f29756a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                u70.o oVar = u70.q.f40850b;
                pVar = (KSerializer) ((Function2) this.f29841b).invoke(kClass, arrayList);
            } catch (Throwable th2) {
                u70.o oVar2 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            u70.q qVar = new u70.q(pVar);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, qVar);
            obj2 = objPutIfAbsent == null ? qVar : objPutIfAbsent;
        }
        return ((u70.q) obj2).f40851a;
    }

    @Override // m90.n1
    public KSerializer r(KClass kClass) {
        Object objInvoke;
        Object obj = ((r) this.f29840a).get(y9.w.v(kClass));
        obj.getClass();
        u0 u0Var = (u0) obj;
        Object obj2 = u0Var.f29866a.get();
        if (obj2 == null) {
            bn.b0 b0Var = new bn.b0(15, this, kClass);
            synchronized (u0Var) {
                objInvoke = u0Var.f29866a.get();
                if (objInvoke == null) {
                    objInvoke = b0Var.invoke();
                    u0Var.f29866a = new SoftReference(objInvoke);
                }
            }
            obj2 = objInvoke;
        }
        return ((k) obj2).f29817a;
    }

    public q(Function2 function2) {
        this.f29841b = function2;
        this.f29840a = new r();
    }

    public q(b0.n nVar, Range range) {
        this.f29841b = nVar;
        this.f29840a = range;
    }
}
