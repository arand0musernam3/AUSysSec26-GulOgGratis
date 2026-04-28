package ra;

import a40.d0;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q1.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f37817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f37818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f37819c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f37817a = eVar;
        this.f37818b = eVar2;
        this.f37819c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        e eVar = this.f37819c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        e eVar = this.f37817a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        e eVar = this.f37818b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i11);

    public final int f(int i11, int i12) {
        return !e(i12) ? i11 : ((b) this).f37821e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i11) {
        if (!e(i11)) {
            return parcelable;
        }
        return ((b) this).f37821e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String string = ((b) this).f37821e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e5) {
            d0.o("VersionedParcel encountered ClassNotFoundException", e5);
            return null;
        } catch (IllegalAccessException e11) {
            d0.o("VersionedParcel encountered IllegalAccessException", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            d0.o("VersionedParcel encountered NoSuchMethodException", e12);
            return null;
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            d0.o("VersionedParcel encountered InvocationTargetException", e13);
            return null;
        }
    }

    public abstract void i(int i11);

    public final void j(int i11, int i12) {
        i(i12);
        ((b) this).f37821e.writeInt(i11);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f37821e.writeString(null);
            return;
        }
        try {
            ((b) this).f37821e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                Parcel parcel = bVarA.f37821e;
                int i11 = bVarA.f37825i;
                if (i11 >= 0) {
                    int i12 = bVarA.f37820d.get(i11);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i12);
                    parcel.writeInt(iDataPosition - i12);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e5) {
                d0.o("VersionedParcel encountered ClassNotFoundException", e5);
            } catch (IllegalAccessException e11) {
                d0.o("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                d0.o("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (e13.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e13.getCause());
                }
                d0.o("VersionedParcel encountered InvocationTargetException", e13);
            }
        } catch (ClassNotFoundException e14) {
            d0.o(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
