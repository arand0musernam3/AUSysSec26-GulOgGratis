package hp;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class q extends y {

    @NotNull
    public static final q INSTANCE = new q(StatusResponseUtils.RESULT_ERROR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Object f22319c = u70.l.a(u70.m.PUBLICATION, new h60.b(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q);
    }

    public final int hashCode() {
        return 878299147;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f22319c.getValue();
    }

    public final String toString() {
        return "ErrorScreen";
    }
}
