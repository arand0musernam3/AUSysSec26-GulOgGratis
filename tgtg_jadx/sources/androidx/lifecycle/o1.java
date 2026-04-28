package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.braze.h2;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o1 f3504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qb.e f3505d = new qb.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f3506b;

    public o1(Application application) {
        this.f3506b = application;
    }

    public final l1 a(Class cls, Application application) {
        if (!b.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            l1 l1Var = (l1) cls.getConstructor(Application.class).newInstance(application);
            l1Var.getClass();
            return l1Var;
        } catch (IllegalAccessException e5) {
            a40.d0.o(w.a0.k(cls, "Cannot create an instance of "), e5);
            return null;
        } catch (InstantiationException e11) {
            a40.d0.o(w.a0.k(cls, "Cannot create an instance of "), e11);
            return null;
        } catch (NoSuchMethodException e12) {
            a40.d0.o(w.a0.k(cls, "Cannot create an instance of "), e12);
            return null;
        } catch (InvocationTargetException e13) {
            a40.d0.o(w.a0.k(cls, "Cannot create an instance of "), e13);
            return null;
        }
    }

    @Override // androidx.lifecycle.p1, androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        if (this.f3506b != null) {
            return create(cls);
        }
        Application application = (Application) creationExtras.a(f3505d);
        if (application != null) {
            return a(cls, application);
        }
        if (!b.class.isAssignableFrom(cls)) {
            return w.b.E(cls);
        }
        i4.a.f("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // androidx.lifecycle.p1, androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls) {
        cls.getClass();
        Application application = this.f3506b;
        if (application != null) {
            return a(cls, application);
        }
        h2.a("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
