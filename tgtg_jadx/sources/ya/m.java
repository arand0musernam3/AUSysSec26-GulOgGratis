package ya;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f45801a;

    static {
        n dVar;
        try {
            dVar = new t10.c((WebViewProviderFactoryBoundaryInterface) na0.a.W(WebViewProviderFactoryBoundaryInterface.class, h0.g.o()));
        } catch (ClassNotFoundException unused) {
            dVar = new d();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            return;
        }
        f45801a = dVar;
    }
}
