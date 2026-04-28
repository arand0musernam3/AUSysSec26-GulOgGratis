package ab;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1201c;

    public d(KClass kClass, eb.b bVar) {
        this.f1199a = 0;
        kClass.getClass();
        this.f1200b = kClass;
        this.f1201c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[Catch: all -> 0x002f, Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:22:0x004b, B:29:0x005d, B:36:0x006f, B:38:0x007a, B:42:0x0081, B:45:0x008d, B:35:0x006b, B:28:0x0059), top: B:56:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.String r0 = "productId"
            java.lang.Class<lx.k> r1 = lx.k.class
            java.lang.Object r2 = r6.f1201c
            lx.k r2 = (lx.k) r2
            java.util.Set r3 = yx.a.f46339a
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L12
            goto La5
        L12:
            r7.getClass()     // Catch: java.lang.Throwable -> L2f
            r8.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r8.getName()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "onSkuDetailsResponse"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L26
            goto La5
        L26:
            r7 = 0
            if (r9 == 0) goto L32
            r8 = 1
            java.lang.Object r8 = kotlin.collections.y.D(r8, r9)     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r7 = move-exception
            goto La6
        L32:
            r8 = r7
        L33:
            if (r8 == 0) goto La5
            boolean r9 = r8 instanceof java.util.List     // Catch: java.lang.Throwable -> L2f
            if (r9 != 0) goto L3b
            goto La5
        L3b:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2f
        L41:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r9 == 0) goto L9e
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L2f
            java.util.Set r3 = yx.a.f46339a     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            boolean r3 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            if (r3 == 0) goto L55
        L53:
            r3 = r7
            goto L5d
        L55:
            java.lang.Class r3 = r2.f28365c     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r3 = move-exception
            yx.a.a(r1, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            goto L53
        L5d:
            java.util.Set r4 = yx.a.f46339a     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            boolean r4 = r4.contains(r1)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            if (r4 == 0) goto L67
        L65:
            r4 = r7
            goto L6f
        L67:
            java.lang.reflect.Method r4 = r2.f28369g     // Catch: java.lang.Throwable -> L6a
            goto L6f
        L6a:
            r4 = move-exception
            yx.a.a(r1, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            goto L65
        L6f:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            java.lang.Object r9 = lx.u.I(r3, r9, r4, r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            boolean r3 = r9 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            if (r3 == 0) goto L7d
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            goto L7e
        L7d:
            r9 = r7
        L7e:
            if (r9 != 0) goto L81
            goto L41
        L81:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            boolean r9 = r3.has(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            if (r9 != 0) goto L8d
            goto L41
        L8d:
            java.lang.String r9 = r3.getString(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            lx.o r4 = lx.k.l     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            java.util.concurrent.ConcurrentHashMap r4 = lx.o.h()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            r9.getClass()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            r4.put(r9, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L41
            goto L41
        L9e:
            java.lang.Object r7 = r6.f1200b     // Catch: java.lang.Throwable -> L2f
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L2f
            r7.run()     // Catch: java.lang.Throwable -> L2f
        La5:
            return
        La6:
            yx.a.a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.d.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f1199a) {
            case 0:
                eb.b bVar = (eb.b) this.f1201c;
                obj.getClass();
                method.getClass();
                if (Intrinsics.areEqual(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    Object objCast = KClasses.cast((KClass) this.f1200b, objArr[0]);
                    objCast.getClass();
                    bVar.invoke(objCast);
                    return Unit.f26487a;
                }
                if (Intrinsics.areEqual(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(obj == objArr[0]);
                }
                if (Intrinsics.areEqual(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(bVar.hashCode());
                }
                if (Intrinsics.areEqual(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return bVar.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            case 1:
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
                Object[] objArr2 = (Object[]) this.f1200b;
                lx.l lVar = (lx.l) this.f1201c;
                obj.getClass();
                method.getClass();
                String name = method.getName();
                if (name == null) {
                    return null;
                }
                switch (name.hashCode()) {
                    case -1642587947:
                        if (!name.equals("onPurchaseHistoryResponse") || yx.a.f46339a.contains(lx.l.class)) {
                            return null;
                        }
                        try {
                            lVar.j(objArr2, objArr);
                            return null;
                        } catch (Throwable th3) {
                            yx.a.a(lx.l.class, th3);
                            return null;
                        }
                    case -1599362358:
                        if (!name.equals("onQueryPurchasesResponse") || yx.a.f46339a.contains(lx.l.class)) {
                            return null;
                        }
                        try {
                            lVar.k(objArr2, objArr);
                            return null;
                        } catch (Throwable th4) {
                            yx.a.a(lx.l.class, th4);
                            return null;
                        }
                    case -79406125:
                        if (!name.equals("onBillingSetupFinished") || yx.a.f46339a.contains(lx.l.class)) {
                            return null;
                        }
                        try {
                            lVar.h(objArr2, objArr);
                            return null;
                        } catch (Throwable th5) {
                            yx.a.a(lx.l.class, th5);
                            return null;
                        }
                    case 1227540564:
                        if (!name.equals("onBillingServiceDisconnected")) {
                            return null;
                        }
                        Set set = yx.a.f46339a;
                        if (set.contains(lx.l.class)) {
                            return null;
                        }
                        try {
                            if (set.contains(lVar)) {
                                return null;
                            }
                            try {
                                lx.l.H.set(false);
                                return null;
                            } catch (Throwable th6) {
                                yx.a.a(lVar, th6);
                                return null;
                            }
                        } catch (Throwable th7) {
                            yx.a.a(lx.l.class, th7);
                            return null;
                        }
                    case 1940131955:
                        if (!name.equals("onProductDetailsResponse") || yx.a.f46339a.contains(lx.l.class)) {
                            return null;
                        }
                        try {
                            lVar.i(objArr2, objArr);
                            return null;
                        } catch (Throwable th8) {
                            yx.a.a(lx.l.class, th8);
                            return null;
                        }
                    default:
                        return null;
                }
        }
    }

    public /* synthetic */ d(lx.g gVar, Object obj, int i11) {
        this.f1199a = i11;
        this.f1201c = gVar;
        this.f1200b = obj;
    }
}
