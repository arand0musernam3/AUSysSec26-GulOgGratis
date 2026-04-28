package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i11) {
        super(unsafe);
        this.f3000b = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(long j9, Object obj) {
        switch (this.f3000b) {
            case 0:
                if (!n1.f3022g) {
                }
                break;
            default:
                if (!n1.f3022g) {
                }
                break;
        }
        return n1.c(j9, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double d(long j9, Object obj) {
        switch (this.f3000b) {
        }
        return Double.longBitsToDouble(g(j9, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float e(long j9, Object obj) {
        switch (this.f3000b) {
        }
        return Float.intBitsToFloat(f(j9, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj, long j9, boolean z11) {
        switch (this.f3000b) {
            case 0:
                if (!n1.f3022g) {
                    n1.l(obj, j9, z11 ? (byte) 1 : (byte) 0);
                } else {
                    n1.k(obj, j9, z11 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!n1.f3022g) {
                    n1.l(obj, j9, z11 ? (byte) 1 : (byte) 0);
                } else {
                    n1.k(obj, j9, z11 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j9, byte b8) {
        switch (this.f3000b) {
            case 0:
                if (!n1.f3022g) {
                    n1.l(obj, j9, b8);
                } else {
                    n1.k(obj, j9, b8);
                }
                break;
            default:
                if (!n1.f3022g) {
                    n1.l(obj, j9, b8);
                } else {
                    n1.k(obj, j9, b8);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j9, double d3) {
        switch (this.f3000b) {
            case 0:
                o(obj, j9, Double.doubleToLongBits(d3));
                break;
            default:
                o(obj, j9, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j9, float f11) {
        switch (this.f3000b) {
            case 0:
                n(Float.floatToIntBits(f11), j9, obj);
                break;
            default:
                n(Float.floatToIntBits(f11), j9, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean r() {
        switch (this.f3000b) {
        }
        return false;
    }
}
