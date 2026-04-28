package b80;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f6059a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f6060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f6061c;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            method = null;
            if (i12 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i12];
            if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                parameterTypes.getClass();
                if (Intrinsics.areEqual(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i12++;
        }
        f6060b = method2;
        int length2 = methods.length;
        while (true) {
            if (i11 >= length2) {
                break;
            }
            Method method3 = methods[i11];
            if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i11++;
        }
        f6061c = method;
    }
}
