package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaAnnotationMapper {

    @NotNull
    private static final Name DEPRECATED_ANNOTATION_MESSAGE;

    @NotNull
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();

    @NotNull
    private static final Name RETENTION_ANNOTATION_VALUE;

    @NotNull
    private static final Name TARGET_ANNOTATION_ALLOWED_TARGETS;

    @NotNull
    private static final Map<FqName, FqName> kotlinToJavaNameMap;

    static {
        Name nameIdentifier = Name.identifier(InAppMessageBase.MESSAGE);
        nameIdentifier.getClass();
        DEPRECATED_ANNOTATION_MESSAGE = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("allowedTargets");
        nameIdentifier2.getClass();
        TARGET_ANNOTATION_ALLOWED_TARGETS = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("value");
        nameIdentifier3.getClass();
        RETENTION_ANNOTATION_VALUE = nameIdentifier3;
        kotlinToJavaNameMap = x0.e(new Pair(StandardNames.FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), new Pair(StandardNames.FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), new Pair(StandardNames.FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    private JavaAnnotationMapper() {
    }

    public static /* synthetic */ AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z11);
    }

    @Nullable
    public final AnnotationDescriptor findMappedJavaAnnotation(@NotNull FqName fqName, @NotNull JavaAnnotationOwner javaAnnotationOwner, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        JavaAnnotation javaAnnotationFindAnnotation;
        fqName.getClass();
        javaAnnotationOwner.getClass();
        lazyJavaResolverContext.getClass();
        if (Intrinsics.areEqual(fqName, StandardNames.FqNames.deprecated)) {
            FqName fqName2 = JvmAnnotationNames.DEPRECATED_ANNOTATION;
            fqName2.getClass();
            JavaAnnotation javaAnnotationFindAnnotation2 = javaAnnotationOwner.findAnnotation(fqName2);
            if (javaAnnotationFindAnnotation2 != null || javaAnnotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationFindAnnotation2, lazyJavaResolverContext);
            }
        }
        FqName fqName3 = kotlinToJavaNameMap.get(fqName);
        if (fqName3 == null || (javaAnnotationFindAnnotation = javaAnnotationOwner.findAnnotation(fqName3)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, javaAnnotationFindAnnotation, lazyJavaResolverContext, false, 4, null);
    }

    @NotNull
    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    @NotNull
    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    @NotNull
    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    @Nullable
    public final AnnotationDescriptor mapOrResolveJavaAnnotation(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext, boolean z11) {
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        ClassId classId = javaAnnotation.getClassId();
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.mustBeDocumented);
        }
        if (Intrinsics.areEqual(classId, ClassId.topLevel(JvmAnnotationNames.DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, z11);
    }
}
