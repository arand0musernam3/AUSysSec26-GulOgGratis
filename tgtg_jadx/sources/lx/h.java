package lx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f28352a;

    public h(Runnable runnable) {
        this.f28352a = runnable;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AtomicBoolean atomicBoolean;
        Method methodG;
        AtomicBoolean atomicBoolean2;
        Set set = yx.a.f46339a;
        if (!set.contains(this)) {
            try {
                obj.getClass();
                method.getClass();
                if (Intrinsics.areEqual(method.getName(), "onBillingSetupFinished")) {
                    Object objD = objArr != null ? y.D(0, objArr) : null;
                    Class clsE = u.E("com.android.billingclient.api.BillingResult");
                    if (clsE != null && (methodG = u.G(clsE, "getResponseCode", new Class[0])) != null && Intrinsics.areEqual(u.I(clsE, objD, methodG, new Object[0]), (Object) 0)) {
                        o oVar = k.l;
                        if (set.contains(k.class)) {
                            atomicBoolean2 = null;
                            atomicBoolean2.set(true);
                            this.f28352a.run();
                        } else {
                            try {
                                atomicBoolean2 = k.f28359n;
                            } catch (Throwable th2) {
                                yx.a.a(k.class, th2);
                                atomicBoolean2 = null;
                            }
                            atomicBoolean2.set(true);
                            this.f28352a.run();
                        }
                    }
                } else {
                    String name = method.getName();
                    name.getClass();
                    if (kotlin.text.y.j(name, "onBillingServiceDisconnected", false)) {
                        o oVar2 = k.l;
                        if (set.contains(k.class)) {
                            atomicBoolean = null;
                            atomicBoolean.set(false);
                        } else {
                            try {
                                atomicBoolean = k.f28359n;
                            } catch (Throwable th3) {
                                yx.a.a(k.class, th3);
                                atomicBoolean = null;
                            }
                            atomicBoolean.set(false);
                        }
                    }
                }
            } catch (Throwable th4) {
                yx.a.a(this, th4);
                return null;
            }
        }
        return null;
    }
}
