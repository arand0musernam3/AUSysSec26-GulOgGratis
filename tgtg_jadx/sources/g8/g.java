package g8;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import c50.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z {
    private static final g DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private a0 strings_ = y0.f3062d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        z.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        a0 a0Var = gVar.strings_;
        if (!((y0) a0Var).f3063a) {
            y0 y0Var = (y0) a0Var;
            int i11 = y0Var.f3065c;
            gVar.strings_ = y0Var.d(i11 == 0 ? 10 : i11 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = b0.f2930a;
        if (iterable instanceof d0) {
            List underlyingElements = ((d0) iterable).getUnderlyingElements();
            if (randomAccess != null) {
                org.bouncycastle.jce.provider.a.c();
                return;
            }
            ((y0) randomAccess).getClass();
            Iterator it = underlyingElements.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.f) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.f.d(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof v0) {
            ((y0) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((y0) randomAccess).f3065c);
        }
        y0 y0Var2 = (y0) randomAccess;
        int i12 = y0Var2.f3065c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (y0Var2.f3065c - i12) + " is null.";
                for (int i13 = y0Var2.f3065c - 1; i13 >= i12; i13--) {
                    y0Var2.remove(i13);
                }
                w.l(str);
                return;
            }
            y0Var2.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((androidx.datastore.preferences.protobuf.w) DEFAULT_INSTANCE.c(y.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object c(y yVar) {
        u0 xVar;
        switch (b.f20092a[yVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return new z0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (g.class) {
                    try {
                        xVar = PARSER;
                        if (xVar == null) {
                            xVar = new x();
                            PARSER = xVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return xVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                w.d();
                return null;
        }
    }

    public final a0 n() {
        return this.strings_;
    }
}
