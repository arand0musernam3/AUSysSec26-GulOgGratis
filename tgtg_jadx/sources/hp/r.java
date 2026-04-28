package hp;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class r extends y {

    @NotNull
    public static final r INSTANCE = new r("intro");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Object f22320c = u70.l.a(u70.m.PUBLICATION, new h60.b(21));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r);
    }

    public final int hashCode() {
        return 2017493359;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f22320c.getValue();
    }

    public final String toString() {
        return "IntroScreen";
    }
}
