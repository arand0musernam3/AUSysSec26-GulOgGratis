package g8;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z {
    private static final e DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private l0 preferences_ = l0.f3008b;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.j(e.class, eVar);
    }

    public static l0 l(e eVar) {
        l0 l0Var = eVar.preferences_;
        if (!l0Var.f3009a) {
            eVar.preferences_ = l0Var.b();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((w) DEFAULT_INSTANCE.c(y.NEW_BUILDER));
    }

    public static e o(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.h hVar = new androidx.datastore.preferences.protobuf.h(fileInputStream);
        n nVarA = n.a();
        z zVarI = eVar.i();
        try {
            x0 x0Var = x0.f3059c;
            x0Var.getClass();
            a1 a1VarA = x0Var.a(zVarI.getClass());
            androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) hVar.f2988b;
            if (kVar == null) {
                kVar = new androidx.datastore.preferences.protobuf.k(hVar);
            }
            a1VarA.h(zVarI, kVar, nVarA);
            a1VarA.c(zVarI);
            if (z.f(zVarI, true)) {
                return (e) zVarI;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e5) {
            if (e5.f2927a) {
                throw new InvalidProtocolBufferException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (UninitializedMessageException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object c(y yVar) {
        u0 xVar;
        switch (b.f20092a[yVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new c(DEFAULT_INSTANCE);
            case 3:
                return new z0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f20093a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (e.class) {
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
                c50.w.d();
                return null;
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
