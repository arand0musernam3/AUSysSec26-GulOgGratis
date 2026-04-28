package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @NotNull
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;

    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    @NotNull
    private static final ClassId REFLECTION_FACTORY_IMPL;

    @NotNull
    private static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId classId = ClassId.topLevel(fqName);
        classId.getClass();
        JVM_FIELD_ANNOTATION_CLASS_ID = classId;
        ClassId classId2 = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        classId2.getClass();
        REFLECTION_FACTORY_IMPL = classId2;
        ClassId classIdFromString = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        classIdFromString.getClass();
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = classIdFromString;
    }

    private JvmAbi() {
    }

    @NotNull
    public static final String getterName(@NotNull String str) {
        str.getClass();
        if (startsWithIsPrefix(str)) {
            return str;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
    }

    public static final boolean isGetterName(@NotNull String str) {
        str.getClass();
        return y.p(str, "get", false) || y.p(str, "is", false);
    }

    public static final boolean isSetterName(@NotNull String str) {
        str.getClass();
        return y.p(str, "set", false);
    }

    @NotNull
    public static final String setterName(@NotNull String str) {
        str.getClass();
        StringBuilder sb2 = new StringBuilder("set");
        sb2.append(startsWithIsPrefix(str) ? str.substring(2) : CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        return sb2.toString();
    }

    public static final boolean startsWithIsPrefix(@NotNull String str) {
        str.getClass();
        if (y.p(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (Intrinsics.compare(97, (int) cCharAt) > 0 || Intrinsics.compare((int) cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }
}
