package ui;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class z0 extends o2 {

    @NotNull
    public static final z0 INSTANCE = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f41304b = u70.l.a(u70.m.PUBLICATION, new o(16));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z0);
    }

    public final int hashCode() {
        return 1935829241;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f41304b.getValue();
    }

    public final String toString() {
        return "Retry";
    }
}
