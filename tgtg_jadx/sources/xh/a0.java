package xh;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class a0 extends b0 {

    @NotNull
    public static final a0 INSTANCE = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f44307b = u70.l.a(u70.m.PUBLICATION, new d(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a0);
    }

    public final int hashCode() {
        return -1390682564;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f44307b.getValue();
    }

    public final String toString() {
        return "SuccessfulCollectionScreen";
    }
}
