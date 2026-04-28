package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface PlatformDependentTypeTransformer {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class None implements PlatformDependentTypeTransformer {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer
        @NotNull
        public SimpleType transformPlatformType(@NotNull ClassId classId, @NotNull SimpleType simpleType) {
            classId.getClass();
            simpleType.getClass();
            return simpleType;
        }
    }

    @NotNull
    SimpleType transformPlatformType(@NotNull ClassId classId, @NotNull SimpleType simpleType);
}
