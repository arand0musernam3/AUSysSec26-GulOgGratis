package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i11) {
        nameResolver.getClass();
        ClassId classIdFromString = ClassId.fromString(nameResolver.getQualifiedClassName(i11), nameResolver.isLocalClassName(i11));
        classIdFromString.getClass();
        return classIdFromString;
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i11) {
        nameResolver.getClass();
        Name nameGuessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i11));
        nameGuessByFirstCharacter.getClass();
        return nameGuessByFirstCharacter;
    }
}
