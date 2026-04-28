package p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f33962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f33963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f33964c;

    public o2(Method method, Method method2, Method method3) {
        this.f33962a = method;
        this.f33963b = method2;
        this.f33964c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
