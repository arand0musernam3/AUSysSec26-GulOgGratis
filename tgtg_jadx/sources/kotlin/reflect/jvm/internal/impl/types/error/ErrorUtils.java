package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.g1;
import kotlin.collections.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorUtils {

    @NotNull
    private static final ErrorClassDescriptor errorClass;

    @NotNull
    private static final PropertyDescriptor errorProperty;

    @NotNull
    private static final Set<PropertyDescriptor> errorPropertyGroup;

    @NotNull
    private static final KotlinType errorPropertyType;

    @NotNull
    private static final KotlinType errorTypeForLoopInSupertypes;

    @NotNull
    public static final ErrorUtils INSTANCE = new ErrorUtils();

    @NotNull
    private static final ModuleDescriptor errorModule = ErrorModuleDescriptor.INSTANCE;

    static {
        Name nameSpecial = Name.special(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        nameSpecial.getClass();
        errorClass = new ErrorClassDescriptor(nameSpecial);
        errorTypeForLoopInSupertypes = createErrorType(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        errorPropertyType = createErrorType(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        ErrorPropertyDescriptor errorPropertyDescriptor = new ErrorPropertyDescriptor();
        errorProperty = errorPropertyDescriptor;
        errorPropertyGroup = g1.b(errorPropertyDescriptor);
    }

    private ErrorUtils() {
    }

    @NotNull
    public static final ErrorScope createErrorScope(@NotNull ErrorScopeKind errorScopeKind, boolean z11, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return z11 ? new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean isError(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        ErrorUtils errorUtils = INSTANCE;
        return errorUtils.isErrorClass(declarationDescriptor) || errorUtils.isErrorClass(declarationDescriptor.getContainingDeclaration()) || declarationDescriptor == errorModule;
    }

    private final boolean isErrorClass(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    public static final boolean isUninferredTypeVariable(@Nullable KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        return (constructor instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) constructor).getKind() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @NotNull
    public final ErrorType createErrorType(@NotNull ErrorTypeKind errorTypeKind, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(errorTypeKind, n0.f26529a, typeConstructor, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorTypeConstructor createErrorTypeConstructor(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return new ErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorType createErrorTypeWithArguments(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull TypeConstructor typeConstructor, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        typeConstructor.getClass();
        strArr.getClass();
        return new ErrorType(typeConstructor, createErrorScope(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorClassDescriptor getErrorClass() {
        return errorClass;
    }

    @NotNull
    public final ModuleDescriptor getErrorModule() {
        return errorModule;
    }

    @NotNull
    public final Set<PropertyDescriptor> getErrorPropertyGroup() {
        return errorPropertyGroup;
    }

    @NotNull
    public final KotlinType getErrorPropertyType() {
        return errorPropertyType;
    }

    @NotNull
    public final KotlinType getErrorTypeForLoopInSupertypes() {
        return errorTypeForLoopInSupertypes;
    }

    @NotNull
    public final String unresolvedTypeAsItIs(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        TypeUtilsKt.isUnresolvedType(kotlinType);
        TypeConstructor constructor = kotlinType.getConstructor();
        constructor.getClass();
        return ((ErrorTypeConstructor) constructor).getParam(0);
    }

    @NotNull
    public static final ErrorType createErrorType(@NotNull ErrorTypeKind errorTypeKind, @NotNull String... strArr) {
        errorTypeKind.getClass();
        strArr.getClass();
        return INSTANCE.createErrorTypeWithArguments(errorTypeKind, n0.f26529a, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public static final ErrorScope createErrorScope(@NotNull ErrorScopeKind errorScopeKind, @NotNull String... strArr) {
        errorScopeKind.getClass();
        strArr.getClass();
        return createErrorScope(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final ErrorType createErrorTypeWithArguments(@NotNull ErrorTypeKind errorTypeKind, @NotNull List<? extends TypeProjection> list, @NotNull String... strArr) {
        errorTypeKind.getClass();
        list.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(errorTypeKind, list, createErrorTypeConstructor(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
