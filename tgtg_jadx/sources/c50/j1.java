package c50;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7592c;

    public /* synthetic */ j1(int i11, long j9, long j11, long j12) {
        if (1 != (i11 & 1)) {
            m90.c1.j(i11, 1, h1.f7573a.getDescriptor());
            throw null;
        }
        this.f7590a = j9;
        this.f7591b = (i11 & 2) == 0 ? ((long) 1000) * j9 : j11;
        if ((i11 & 4) == 0) {
            this.f7592c = j9 / ((long) 1000);
        } else {
            this.f7592c = j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && this.f7590a == ((j1) obj).f7590a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7590a);
    }

    public final String toString() {
        return w.a0.r(new StringBuilder("Time(ms="), this.f7590a, ')');
    }

    public j1(long j9) {
        this.f7590a = j9;
        long j11 = 1000;
        this.f7591b = j9 * j11;
        this.f7592c = j9 / j11;
    }
}
