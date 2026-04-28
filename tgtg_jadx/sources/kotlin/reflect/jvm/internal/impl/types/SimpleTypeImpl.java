package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class SimpleTypeImpl extends SimpleType {

    @NotNull
    private final List<TypeProjection> arguments;

    @NotNull
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;

    @NotNull
    private final MemberScope memberScope;

    @NotNull
    private final Function1<KotlinTypeRefiner, SimpleType> refinedTypeFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTypeImpl(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z11, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        this.constructor = typeConstructor;
        this.arguments = list;
        this.isMarkedNullable = z11;
        this.memberScope = memberScope;
        this.refinedTypeFactory = function1;
        if (!(getMemberScope() instanceof ErrorScope) || (getMemberScope() instanceof ThrowingScope)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
        sb2.append(getMemberScope());
        TypeConstructor constructor = getConstructor();
        sb2.append('\n');
        sb2.append(constructor);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 == isMarkedNullable() ? this : z11 ? new NullableSimpleType(this) : new NotNullSimpleType(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public SimpleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        SimpleType simpleType = (SimpleType) this.refinedTypeFactory.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes.isEmpty() ? this : new SimpleTypeWithAttributes(this, typeAttributes);
    }
}
