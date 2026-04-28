package ii;

import com.app.tgtg.R;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f extends h {

    @NotNull
    public static final f INSTANCE = new f(R.drawable.ic_calendar_selected, R.drawable.ic_calendar, R.string.charity_tab_plan);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Object f23892e = u70.l.a(u70.m.PUBLICATION, new hw.f(23));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f);
    }

    public final int hashCode() {
        return -2102665603;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f23892e.getValue();
    }

    public final String toString() {
        return "Plan";
    }
}
