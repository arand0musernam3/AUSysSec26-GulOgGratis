package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    @NotNull
    private final TypeConstructor constructor;

    @NotNull
    private final MemberScope memberScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(@NotNull NewTypeVariableConstructor newTypeVariableConstructor, boolean z11, @NotNull TypeConstructor typeConstructor) {
        super(newTypeVariableConstructor, z11);
        newTypeVariableConstructor.getClass();
        typeConstructor.getClass();
        this.constructor = typeConstructor;
        this.memberScope = newTypeVariableConstructor.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    public AbstractStubType materialize(boolean z11) {
        return new StubTypeForBuilderInference(getOriginalTypeVariable(), z11, getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Stub (BI): ");
        sb2.append(getOriginalTypeVariable());
        sb2.append(isMarkedNullable() ? "?" : "");
        return sb2.toString();
    }
}
