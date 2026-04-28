package c50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7521b;

    public /* synthetic */ e0(int i11, int i12, String str) {
        if (3 != (i11 & 3)) {
            m90.c1.j(i11, 3, c0.f7506a.getDescriptor());
            throw null;
        }
        this.f7520a = i12;
        this.f7521b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f7520a == e0Var.f7520a && Intrinsics.areEqual(this.f7521b, e0Var.f7521b);
    }

    public final int hashCode() {
        return this.f7521b.hashCode() + (Integer.hashCode(this.f7520a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f7520a);
        sb2.append(", uuid=");
        return w2.l1.f(sb2, this.f7521b, ')');
    }

    public e0(int i11, String str) {
        str.getClass();
        this.f7520a = i11;
        this.f7521b = str;
    }
}
