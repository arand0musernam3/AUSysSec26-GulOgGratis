package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeRefinementSupport {
    private final boolean isEnabled;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Enabled extends TypeRefinementSupport {

        @NotNull
        private final KotlinTypeRefiner typeRefiner;

        @NotNull
        public final KotlinTypeRefiner getTypeRefiner() {
            return this.typeRefiner;
        }
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
