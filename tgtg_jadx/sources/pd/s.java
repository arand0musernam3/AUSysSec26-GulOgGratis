package pd;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.i f34717a;

    public /* synthetic */ s(ia0.i iVar) {
        this.f34717a = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34717a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Intrinsics.areEqual(this.f34717a, ((s) obj).f34717a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34717a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f34717a + ")";
    }
}
