package hp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u70.j[] f22300b = {u70.l.a(u70.m.PUBLICATION, new f0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22301a;

    public /* synthetic */ l0(int i11, List list) {
        if (1 == (i11 & 1)) {
            this.f22301a = list;
        } else {
            m90.c1.j(i11, 1, j0.f22295a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.areEqual(this.f22301a, ((l0) obj).f22301a);
    }

    public final int hashCode() {
        return this.f22301a.hashCode();
    }

    public final String toString() {
        return e0.f.m("RecipeGeneratorUploadResponse(urls=", ")", this.f22301a);
    }
}
