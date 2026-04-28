package lx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28357a;

    public /* synthetic */ j(int i11) {
        this.f28357a = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lx.l a(android.content.Context r45) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.j.a(android.content.Context):lx.l");
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f28357a) {
            case 0:
                if (!yx.a.f46339a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                    } catch (Throwable th2) {
                        yx.a.a(this, th2);
                        return null;
                    }
                    break;
                }
                break;
            default:
                obj.getClass();
                method.getClass();
                break;
        }
        return null;
    }
}
