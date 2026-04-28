package kotlin.reflect.jvm.internal.impl.types;

import a40.d0;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    @NotNull
    private static final Function1<KotlinTypeRefiner, SimpleType> EMPTY_REFINED_TYPE_FACTORY = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return null;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ExpandedTypeOrRefinedConstructor {

        @Nullable
        private final SimpleType expandedType;

        @Nullable
        private final TypeConstructor refinedConstructor;

        public ExpandedTypeOrRefinedConstructor(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.expandedType = simpleType;
            this.refinedConstructor = typeConstructor;
        }

        @Nullable
        public final SimpleType getExpandedType() {
            return this.expandedType;
        }

        @Nullable
        public final TypeConstructor getRefinedConstructor() {
            return this.refinedConstructor;
        }
    }

    private KotlinTypeFactory() {
    }

    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAliasDescriptor.getClass();
        list.getClass();
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, list), TypeAttributes.Companion.getEmpty());
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = typeConstructor.mo977getDeclarationDescriptor();
        if (classifierDescriptorMo977getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo977getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (classifierDescriptorMo977getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo977getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo977getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((TypeAliasDescriptor) classifierDescriptorMo977getDeclarationDescriptor).getName().toString();
            string.getClass();
            return ErrorUtils.createErrorScope(errorScopeKind, true, string);
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        d0.r("Unsupported classifier: ", classifierDescriptorMo977getDeclarationDescriptor, " for constructor: ", typeConstructor);
        return null;
    }

    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return Intrinsics.areEqual(simpleType, simpleType2) ? simpleType : new FlexibleTypeImpl(simpleType, simpleType2);
    }

    @NotNull
    public static final SimpleType integerLiteralType(@NotNull TypeAttributes typeAttributes, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z11) {
        typeAttributes.getClass();
        integerLiteralTypeConstructor.getClass();
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, integerLiteralTypeConstructor, n0.f26529a, z11, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExpandedTypeOrRefinedConstructor refineConstructor(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor;
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = typeConstructor.mo977getDeclarationDescriptor();
        if (classifierDescriptorMo977getDeclarationDescriptor == null || (classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo977getDeclarationDescriptor)) == null) {
            return null;
        }
        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
            return new ExpandedTypeOrRefinedConstructor(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), null);
        }
        TypeConstructor typeConstructorRefine = classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        typeConstructorRefine.getClass();
        return new ExpandedTypeOrRefinedConstructor(null, typeConstructorRefine);
    }

    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull TypeAttributes typeAttributes, @NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeProjection> list) {
        typeAttributes.getClass();
        classDescriptor.getClass();
        list.getClass();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return simpleType$default(typeAttributes, typeConstructor, (List) list, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull final TypeAttributes typeAttributes, @NotNull final TypeConstructor typeConstructor, @NotNull final List<? extends TypeProjection> list, final boolean z11, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        if (!typeAttributes.isEmpty() || !list.isEmpty() || z11 || typeConstructor.mo977getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, list, z11, INSTANCE.computeMemberScope(typeConstructor, list, kotlinTypeRefiner), new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner2) {
                    kotlinTypeRefiner2.getClass();
                    ExpandedTypeOrRefinedConstructor expandedTypeOrRefinedConstructorRefineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(typeConstructor, kotlinTypeRefiner2, list);
                    if (expandedTypeOrRefinedConstructorRefineConstructor == null) {
                        return null;
                    }
                    SimpleType expandedType = expandedTypeOrRefinedConstructorRefineConstructor.getExpandedType();
                    if (expandedType != null) {
                        return expandedType;
                    }
                    TypeAttributes typeAttributes2 = typeAttributes;
                    TypeConstructor refinedConstructor = expandedTypeOrRefinedConstructorRefineConstructor.getRefinedConstructor();
                    refinedConstructor.getClass();
                    return KotlinTypeFactory.simpleType(typeAttributes2, refinedConstructor, list, z11, kotlinTypeRefiner2);
                }
            });
        }
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = typeConstructor.mo977getDeclarationDescriptor();
        classifierDescriptorMo977getDeclarationDescriptor.getClass();
        SimpleType defaultType = classifierDescriptorMo977getDeclarationDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i11 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i11 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i11 & 16) != 0) {
            z11 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z11);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull final TypeAttributes typeAttributes, @NotNull final TypeConstructor typeConstructor, @NotNull final List<? extends TypeProjection> list, final boolean z11, @NotNull final MemberScope memberScope) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z11, memberScope, new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
                kotlinTypeRefiner.getClass();
                ExpandedTypeOrRefinedConstructor expandedTypeOrRefinedConstructorRefineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(typeConstructor, kotlinTypeRefiner, list);
                if (expandedTypeOrRefinedConstructorRefineConstructor == null) {
                    return null;
                }
                SimpleType expandedType = expandedTypeOrRefinedConstructorRefineConstructor.getExpandedType();
                if (expandedType != null) {
                    return expandedType;
                }
                TypeAttributes typeAttributes2 = typeAttributes;
                TypeConstructor refinedConstructor = expandedTypeOrRefinedConstructorRefineConstructor.getRefinedConstructor();
                refinedConstructor.getClass();
                return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes2, refinedConstructor, list, z11, memberScope);
            }
        });
        return typeAttributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z11, KotlinTypeRefiner kotlinTypeRefiner, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z11, kotlinTypeRefiner);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z11, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z11, memberScope, function1);
        return typeAttributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z11) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return simpleType$default(typeAttributes, typeConstructor, list, z11, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull SimpleType simpleType, @NotNull TypeAttributes typeAttributes, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z11) {
        simpleType.getClass();
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return simpleType$default(typeAttributes, typeConstructor, list, z11, (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
