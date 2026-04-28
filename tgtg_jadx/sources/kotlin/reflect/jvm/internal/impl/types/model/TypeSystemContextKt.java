package kotlin.reflect.jvm.internal.impl.types.model;

import e40.a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeSystemContextKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TypeVariance convertVariance(@NotNull Variance variance) {
        variance.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i11 == 1) {
            return TypeVariance.INV;
        }
        if (i11 == 2) {
            return TypeVariance.IN;
        }
        if (i11 == 3) {
            return TypeVariance.OUT;
        }
        a.f();
        return null;
    }
}
