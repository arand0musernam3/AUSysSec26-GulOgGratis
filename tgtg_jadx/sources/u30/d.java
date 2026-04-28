package u30;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements t40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40678b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f40677a = i11;
        this.f40678b = obj;
    }

    @Override // t40.b
    public final Object get() {
        switch (this.f40677a) {
            case 0:
                String str = (String) this.f40678b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e5) {
                    throw new InvalidRegistrarException(a0.p("Could not instantiate ", str, "."), e5);
                } catch (InstantiationException e11) {
                    throw new InvalidRegistrarException(a0.p("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new InvalidRegistrarException(e0.f.k("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new InvalidRegistrarException(e0.f.k("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f40678b;
            default:
                return new v40.c((p30.g) this.f40678b);
        }
    }
}
