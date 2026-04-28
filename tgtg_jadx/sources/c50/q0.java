package c50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7616d;

    public /* synthetic */ q0(int i11, String str, String str2, int i12, long j9) {
        if (15 != (i11 & 15)) {
            m90.c1.j(i11, 15, o0.f7610a.getDescriptor());
            throw null;
        }
        this.f7613a = str;
        this.f7614b = str2;
        this.f7615c = i12;
        this.f7616d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f7613a, q0Var.f7613a) && Intrinsics.areEqual(this.f7614b, q0Var.f7614b) && this.f7615c == q0Var.f7615c && this.f7616d == q0Var.f7616d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7616d) + r8.k.b(this.f7615c, w2.l1.b(this.f7613a.hashCode() * 31, 31, this.f7614b), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionDetails(sessionId=");
        sb2.append(this.f7613a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f7614b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f7615c);
        sb2.append(", sessionStartTimestampUs=");
        return w.a0.r(sb2, this.f7616d, ')');
    }

    public q0(String str, long j9, int i11, String str2) {
        this.f7613a = str;
        this.f7614b = str2;
        this.f7615c = i11;
        this.f7616d = j9;
    }
}
