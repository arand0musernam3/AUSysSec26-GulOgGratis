package hp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22255a;

    public /* synthetic */ b0(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f22255a = str;
        } else {
            m90.c1.j(i11, 1, z.f22337a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.areEqual(this.f22255a, ((b0) obj).f22255a);
    }

    public final int hashCode() {
        return this.f22255a.hashCode();
    }

    public final String toString() {
        return w.a0.p("RecipeGeneratorPollingRequest(pollingId=", this.f22255a, ")");
    }

    public b0(String str) {
        str.getClass();
        this.f22255a = str;
    }
}
