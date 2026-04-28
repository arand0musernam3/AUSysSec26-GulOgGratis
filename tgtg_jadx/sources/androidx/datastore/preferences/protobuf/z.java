package androidx.datastore.preferences.protobuf;

import com.braze.h2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected h1 unknownFields;

    public z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = h1.f2981f;
    }

    public static z d(Class cls) {
        z zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                wy.o.k("Class initialization cannot fail.", e5);
                return null;
            }
        }
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = (z) ((z) n1.d(cls)).c(y.GET_DEFAULT_INSTANCE);
        if (zVar2 != null) {
            defaultInstanceMap.put(cls, zVar2);
            return zVar2;
        }
        qc.y.e();
        return null;
    }

    public static Object e(Method method, z zVar, Object... objArr) {
        try {
            return method.invoke(zVar, objArr);
        } catch (IllegalAccessException e5) {
            a40.d0.o("Couldn't use Java reflection to implement protocol message reflection.", e5);
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            a40.d0.o("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean f(z zVar, boolean z11) {
        byte bByteValue = ((Byte) zVar.c(y.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        x0 x0Var = x0.f3059c;
        x0Var.getClass();
        boolean zD = x0Var.a(zVar.getClass()).d(zVar);
        if (z11) {
            zVar.c(y.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zD;
    }

    public static void j(Class cls, z zVar) {
        zVar.h();
        defaultInstanceMap.put(cls, zVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(a1 a1Var) {
        int iE;
        int iE2;
        if (g()) {
            if (a1Var == null) {
                x0 x0Var = x0.f3059c;
                x0Var.getClass();
                iE2 = x0Var.a(getClass()).e(this);
            } else {
                iE2 = a1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            h2.b(j4.s.f(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i11 = this.memoizedSerializedSize;
        if ((i11 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i11 & Integer.MAX_VALUE;
        }
        if (a1Var == null) {
            x0 x0Var2 = x0.f3059c;
            x0Var2.getClass();
            iE = x0Var2.a(getClass()).e(this);
        } else {
            iE = a1Var.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(l lVar) {
        x0 x0Var = x0.f3059c;
        x0Var.getClass();
        a1 a1VarA = x0Var.a(getClass());
        i0 i0Var = lVar.f3003a;
        if (i0Var == null) {
            i0Var = new i0(lVar);
        }
        a1VarA.b(this, i0Var);
    }

    public abstract Object c(y yVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x0 x0Var = x0.f3059c;
        x0Var.getClass();
        return x0Var.a(getClass()).g(this, (z) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            x0 x0Var = x0.f3059c;
            x0Var.getClass();
            return x0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            x0 x0Var2 = x0.f3059c;
            x0Var2.getClass();
            this.memoizedHashCode = x0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final z i() {
        return (z) c(y.NEW_MUTABLE_INSTANCE);
    }

    public final void k(int i11) {
        if (i11 < 0) {
            h2.b(j4.s.f(i11, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = p0.f3026a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        p0.c(this, sb2, 0);
        return sb2.toString();
    }
}
