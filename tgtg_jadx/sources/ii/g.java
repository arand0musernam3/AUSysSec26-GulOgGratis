package ii;

import com.app.tgtg.R;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class g extends h {

    @NotNull
    public static final g INSTANCE = new g(R.drawable.ic_nav_profile_selected, R.drawable.ic_nav_profile_deselected, R.string.charity_tab_account);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Object f23895e = u70.l.a(u70.m.PUBLICATION, new hw.f(24));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g);
    }

    public final int hashCode() {
        return 1771603413;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f23895e.getValue();
    }

    public final String toString() {
        return "Profile";
    }
}
