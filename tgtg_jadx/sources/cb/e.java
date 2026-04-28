package cb;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j4.s;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f7871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.f f7872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab.f f7873c;

    public e(ClassLoader classLoader, ab.f fVar) {
        this.f7871a = classLoader;
        this.f7872b = fVar;
        this.f7873c = new ab.f(classLoader, 1);
    }

    public static final boolean d(e eVar) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = eVar.f7871a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    public final WindowLayoutComponent a() {
        int iA;
        ab.f fVar = this.f7873c;
        fVar.getClass();
        boolean zC = false;
        try {
            fVar.f1205a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (zz.f.E("WindowExtensionsProvider#getWindowExtensions is not valid", new y.a(fVar, 18)) && zz.f.E("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 0)) && zz.f.E("FoldingFeature class is not valid", new d(this, 1)) && (iA = ab.g.a()) >= 1) {
                if (iA == 1) {
                    zC = b();
                } else if (iA < 5) {
                    zC = c();
                } else if (c() && zz.f.E("DisplayFoldFeature is not valid", new d(this, 3)) && zz.f.E("SupportedWindowFeatures is not valid", new d(this, 2)) && zz.f.E("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new d(this, 4))) {
                    zC = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zC) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return zz.f.E(s.h(Activity.class, new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener("), ", java.util.function.Consumer) is not valid"), new d(this, 5));
    }

    public final boolean c() {
        return b() && zz.f.E(s.h(Context.class, new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener("), ", androidx.window.extensions.core.util.function.Consumer) is not valid"), new d(this, 6));
    }
}
