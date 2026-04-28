package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends v2 {
    @Override // com.google.android.gms.internal.measurement.v2
    public final void b(Object obj, long j9, byte b8) {
        if (w2.f11993f) {
            w2.b(obj, j9, b8);
        } else {
            w2.c(obj, j9, b8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final boolean d(long j9, Object obj) {
        return w2.f11993f ? w2.n(j9, obj) : w2.o(j9, obj);
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void g(Object obj, long j9, boolean z11) {
        if (w2.f11993f) {
            w2.b(obj, j9, z11 ? (byte) 1 : (byte) 0);
        } else {
            w2.c(obj, j9, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final float h(long j9, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f11956a).getInt(obj, j9));
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void j(Object obj, long j9, float f11) {
        ((Unsafe) this.f11956a).putInt(obj, j9, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final double k(long j9, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f11956a).getLong(obj, j9));
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void l(Object obj, long j9, double d3) {
        ((Unsafe) this.f11956a).putLong(obj, j9, Double.doubleToLongBits(d3));
    }
}
