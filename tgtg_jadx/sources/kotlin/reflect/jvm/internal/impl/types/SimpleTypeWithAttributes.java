package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {

    @NotNull
    private final TypeAttributes attributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(@NotNull SimpleType simpleType, @NotNull TypeAttributes typeAttributes) {
        super(simpleType);
        simpleType.getClass();
        typeAttributes.getClass();
        this.attributes = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleTypeWithAttributes replaceDelegate(@NotNull SimpleType simpleType) {
        simpleType.getClass();
        return new SimpleTypeWithAttributes(simpleType, getAttributes());
    }
}
