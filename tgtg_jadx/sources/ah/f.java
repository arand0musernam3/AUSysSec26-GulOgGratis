package ah;

import a3.c0;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f extends i {

    @NotNull
    public static final f INSTANCE = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f1462b = u70.l.a(u70.m.PUBLICATION, new c0(10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f);
    }

    public final int hashCode() {
        return -1930793872;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f1462b.getValue();
    }

    public final String toString() {
        return "EnterEmailScreen";
    }
}
