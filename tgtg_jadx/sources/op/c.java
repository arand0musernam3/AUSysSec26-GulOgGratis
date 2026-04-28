package op;

import j4.s;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32900e;

    public /* synthetic */ c(int i11, long j9, String str, String str2, String str3, String str4) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, a.f32895a.getDescriptor());
            throw null;
        }
        this.f32896a = j9;
        this.f32897b = str;
        this.f32898c = str2;
        this.f32899d = str3;
        this.f32900e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f32896a == cVar.f32896a && Intrinsics.areEqual(this.f32897b, cVar.f32897b) && Intrinsics.areEqual(this.f32898c, cVar.f32898c) && Intrinsics.areEqual(this.f32899d, cVar.f32899d) && Intrinsics.areEqual(this.f32900e, cVar.f32900e);
    }

    public final int hashCode() {
        return this.f32900e.hashCode() + l1.b(l1.b(l1.b(Long.hashCode(this.f32896a) * 31, 31, this.f32897b), 31, this.f32898c), 31, this.f32899d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Line(id=");
        sb2.append(this.f32896a);
        sb2.append(", name=");
        sb2.append(this.f32897b);
        s.A(sb2, ", nameNative=", this.f32898c, ", code=", this.f32899d);
        return e0.f.n(sb2, ", color=", this.f32900e, ")");
    }
}
