package xh;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class c0 {

    @NotNull
    public static final c0 INSTANCE = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f44311a = u70.l.a(u70.m.PUBLICATION, new d(11));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c0);
    }

    public final int hashCode() {
        return -593251070;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f44311a.getValue();
    }

    public final String toString() {
        return "CharityConnectGraph";
    }
}
