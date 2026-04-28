package pp;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f35594b;

    public /* synthetic */ c(int i11, String str, f fVar) {
        if ((i11 & 1) == 0) {
            this.f35593a = null;
        } else {
            this.f35593a = str;
        }
        if ((i11 & 2) == 0) {
            this.f35594b = null;
        } else {
            this.f35594b = fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f35593a, cVar.f35593a) && Intrinsics.areEqual(this.f35594b, cVar.f35594b);
    }

    public final int hashCode() {
        String str = this.f35593a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.f35594b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "MetroSearchRequest(query=" + this.f35593a + ", paging=" + this.f35594b + ")";
    }

    public c(String str, f fVar) {
        this.f35593a = str;
        this.f35594b = fVar;
    }
}
