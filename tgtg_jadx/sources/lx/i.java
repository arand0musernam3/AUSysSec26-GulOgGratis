package lx;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import oa0.h0;
import oa0.o0;
import oa0.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f28354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28356d;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public i(o0 o0Var, Class cls) {
        this.f28353a = 1;
        this.f28356d = o0Var;
        this.f28355c = cls;
        this.f28354b = new Object[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[Catch: all -> 0x0038, Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:23:0x005c, B:30:0x006f, B:37:0x0081, B:39:0x008c, B:43:0x0093, B:46:0x009f, B:48:0x00ad, B:49:0x00b7, B:36:0x007d, B:29:0x006b), top: B:73:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.i.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        oa0.p pVarB;
        oa0.p pVar;
        switch (this.f28353a) {
            case 0:
                if (yx.a.f46339a.contains(this)) {
                    return null;
                }
                try {
                    a(obj, method, objArr);
                    return Unit.f26487a;
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                    return null;
                }
            default:
                Class cls = (Class) this.f28355c;
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = (Object[]) this.f28354b;
                }
                Object[] objArr2 = objArr;
                oa0.a aVar = h0.f32292b;
                if (aVar.e(method)) {
                    return aVar.d(cls, obj, method, objArr2);
                }
                o0 o0Var = (o0) this.f28356d;
                while (true) {
                    Object objPutIfAbsent = o0Var.f32356a.get(method);
                    if (!(objPutIfAbsent instanceof oa0.p)) {
                        if (objPutIfAbsent == null) {
                            Object obj2 = new Object();
                            synchronized (obj2) {
                                try {
                                    objPutIfAbsent = o0Var.f32356a.putIfAbsent(method, obj2);
                                    if (objPutIfAbsent == null) {
                                        try {
                                            pVarB = oa0.p.b(o0Var, cls, method);
                                            o0Var.f32356a.put(method, pVarB);
                                        } catch (Throwable th3) {
                                            o0Var.f32356a.remove(method);
                                            throw th3;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        synchronized (objPutIfAbsent) {
                            try {
                                Object obj3 = o0Var.f32356a.get(method);
                                if (obj3 != null) {
                                    pVar = (oa0.p) obj3;
                                }
                            } finally {
                            }
                        }
                    } else {
                        pVarB = (oa0.p) objPutIfAbsent;
                    }
                    break;
                }
                pVar = pVarB;
                return pVar.a(new w(pVar.f32362a, obj, objArr2, pVar.f32363b, pVar.f32364c), objArr2);
        }
    }

    public i(k kVar, t tVar, Runnable runnable) {
        this.f28353a = 0;
        tVar.getClass();
        this.f28356d = kVar;
        this.f28354b = tVar;
        this.f28355c = runnable;
    }
}
