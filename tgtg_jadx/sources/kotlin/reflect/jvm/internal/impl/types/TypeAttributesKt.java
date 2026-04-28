package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class TypeAttributesKt {
    @NotNull
    public static final TypeAttributes replaceAnnotations(@NotNull TypeAttributes typeAttributes, @NotNull Annotations annotations) {
        TypeAttributes typeAttributesRemove;
        typeAttributes.getClass();
        annotations.getClass();
        if (AnnotationsTypeAttributeKt.getAnnotations(typeAttributes) == annotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsAttribute = AnnotationsTypeAttributeKt.getAnnotationsAttribute(typeAttributes);
        if (annotationsAttribute != null && (typeAttributesRemove = typeAttributes.remove(annotationsAttribute)) != null) {
            typeAttributes = typeAttributesRemove;
        }
        return (annotations.iterator().hasNext() || !annotations.isEmpty()) ? typeAttributes.plus(new AnnotationsTypeAttribute(annotations)) : typeAttributes;
    }

    @NotNull
    public static final TypeAttributes toDefaultAttributes(@NotNull Annotations annotations) {
        annotations.getClass();
        return TypeAttributeTranslator.DefaultImpls.toAttributes$default(DefaultTypeAttributeTranslator.INSTANCE, annotations, null, null, 6, null);
    }
}
