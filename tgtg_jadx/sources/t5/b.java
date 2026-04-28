package t5;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f39794a;

    public b(Locale locale) {
        this.f39794a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(this.f39794a.toLanguageTag(), ((b) obj).f39794a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f39794a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f39794a.toLanguageTag();
    }
}
