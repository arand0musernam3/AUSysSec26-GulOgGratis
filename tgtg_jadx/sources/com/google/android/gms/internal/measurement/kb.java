package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class kb implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RuntimeException f11572f;

    public kb(long j9, String str, int i11, long j11, Object obj) {
        na0.a.Y(((j9 > 0L ? 1 : (j9 == 0L ? 0 : -1)) == 0) == (str != null));
        this.f11567a = j9;
        this.f11568b = str;
        this.f11569c = i11;
        this.f11570d = j11;
        this.f11571e = obj;
        if (i11 != 5) {
            this.f11572f = null;
            return;
        }
        if (obj == null) {
            this.f11572f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof u0)) {
            this.f11572f = null;
        } else {
            this.f11572f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i11 = this.f11569c;
        if (i11 == 0) {
            return Boolean.FALSE;
        }
        if (i11 == 1) {
            return Boolean.TRUE;
        }
        long j9 = this.f11570d;
        if (i11 == 2) {
            return Long.valueOf(j9);
        }
        if (i11 == 3) {
            return Double.valueOf(Double.longBitsToDouble(j9));
        }
        Object obj = this.f11571e;
        if (i11 == 4) {
            obj.getClass();
            return obj;
        }
        if (i11 != 5) {
            i4.a.d("Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((u0) obj).m();
        } catch (Throwable th2) {
            RuntimeException runtimeException = this.f11572f;
            if (runtimeException != null) {
                th2.addSuppressed(runtimeException);
            }
            throw th2;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kb kbVar = (kb) obj;
        long j9 = kbVar.f11567a;
        long j11 = this.f11567a;
        int iCompare = Long.compare(j11, j9);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j11 != 0) {
            return 0;
        }
        String str = this.f11568b;
        str.getClass();
        String str2 = kbVar.f11568b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return this.f11567a == kbVar.f11567a && Objects.equals(this.f11568b, kbVar.f11568b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11567a), this.f11568b);
    }

    public final String toString() {
        String string = this.f11568b;
        if (string == null) {
            string = Long.toString(this.f11567a);
        }
        String strValueOf = String.valueOf(a());
        return e0.f.n(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
