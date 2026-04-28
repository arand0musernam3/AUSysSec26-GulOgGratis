package am;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f extends m {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1609b;

    public /* synthetic */ f(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f1609b = str;
        } else {
            c1.j(i11, 1, d.f1608a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f1609b, ((f) obj).f1609b);
    }

    public final int hashCode() {
        return this.f1609b.hashCode();
    }

    public final String toString() {
        return a0.p("CountryScreen(email=", this.f1609b, ")");
    }

    public f(String str) {
        str.getClass();
        this.f1609b = str;
    }
}
