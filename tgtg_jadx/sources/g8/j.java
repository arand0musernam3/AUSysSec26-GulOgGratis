package g8;

import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile u0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        z.j(j.class, jVar);
    }

    public static h D() {
        return (h) ((w) DEFAULT_INSTANCE.c(y.NEW_BUILDER));
    }

    public static void l(j jVar, long j9) {
        jVar.valueCase_ = 4;
        jVar.value_ = Long.valueOf(j9);
    }

    public static void m(j jVar, String str) {
        jVar.getClass();
        jVar.valueCase_ = 5;
        jVar.value_ = str;
    }

    public static void n(j jVar, g gVar) {
        jVar.getClass();
        jVar.value_ = gVar;
        jVar.valueCase_ = 6;
    }

    public static void o(j jVar, double d3) {
        jVar.valueCase_ = 7;
        jVar.value_ = Double.valueOf(d3);
    }

    public static void p(j jVar, androidx.datastore.preferences.protobuf.f fVar) {
        jVar.getClass();
        jVar.valueCase_ = 8;
        jVar.value_ = fVar;
    }

    public static void q(j jVar, boolean z11) {
        jVar.valueCase_ = 1;
        jVar.value_ = Boolean.valueOf(z11);
    }

    public static void r(j jVar, float f11) {
        jVar.valueCase_ = 2;
        jVar.value_ = Float.valueOf(f11);
    }

    public static void s(j jVar, int i11) {
        jVar.valueCase_ = 3;
        jVar.value_ = Integer.valueOf(i11);
    }

    public static j v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
    }

    public final i C() {
        switch (this.valueCase_) {
            case 0:
                return i.VALUE_NOT_SET;
            case 1:
                return i.BOOLEAN;
            case 2:
                return i.FLOAT;
            case 3:
                return i.INTEGER;
            case 4:
                return i.LONG;
            case 5:
                return i.STRING;
            case 6:
                return i.STRING_SET;
            case 7:
                return i.DOUBLE;
            case 8:
                return i.BYTES;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object c(y yVar) {
        u0 xVar;
        switch (b.f20092a[yVar.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return new z0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (j.class) {
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

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.f u() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.f) this.value_ : androidx.datastore.preferences.protobuf.f.f2956c;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
