package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1620#3,3:280\n1559#3:283\n1590#3,4:284\n1559#3:288\n1590#3,4:289\n1864#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeAliasExpander NON_REPORTING = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    @NotNull
    private final TypeAliasExpansionReportStrategy reportStrategy;
    private final boolean shouldCheckBounds;

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z11) {
        typeAliasExpansionReportStrategy.getClass();
        this.reportStrategy = typeAliasExpansionReportStrategy;
        this.shouldCheckBounds = z11;
    }

    private final void checkRepeatedAnnotations(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.reportStrategy.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    private final void checkTypeArgumentsSubstitution(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(kotlinType2);
        typeSubstitutorCreate.getClass();
        int i11 = 0;
        for (Object obj : kotlinType2.getArguments()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.isStarProjection()) {
                KotlinType type = typeProjection.getType();
                type.getClass();
                if (!TypeUtilsKt.containsTypeAliasParameters(type)) {
                    TypeProjection typeProjection2 = kotlinType.getArguments().get(i11);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.getConstructor().getParameters().get(i11);
                    if (this.shouldCheckBounds) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.reportStrategy;
                        KotlinType type2 = typeProjection2.getType();
                        type2.getClass();
                        KotlinType type3 = typeProjection.getType();
                        type3.getClass();
                        typeParameterDescriptor.getClass();
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(typeSubstitutorCreate, type2, type3, typeParameterDescriptor);
                    }
                }
            }
            i11 = i12;
        }
    }

    private final SimpleType combineAttributes(SimpleType simpleType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.isError(simpleType) ? simpleType : TypeSubstitutionKt.replace$default(simpleType, null, createdCombinedAttributes(simpleType, typeAttributes), 1, null);
    }

    private final SimpleType combineNullability(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleType, kotlinType.isMarkedNullable());
        simpleTypeMakeNullableIfNeeded.getClass();
        return simpleTypeMakeNullableIfNeeded;
    }

    private final SimpleType combineNullabilityAndAnnotations(SimpleType simpleType, KotlinType kotlinType) {
        return combineAttributes(combineNullability(simpleType, kotlinType), kotlinType.getAttributes());
    }

    private final SimpleType createAbbreviation(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z11) {
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        typeConstructor.getClass();
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z11, MemberScope.Empty.INSTANCE);
    }

    private final TypeAttributes createdCombinedAttributes(KotlinType kotlinType, TypeAttributes typeAttributes) {
        return KotlinTypeKt.isError(kotlinType) ? kotlinType.getAttributes() : typeAttributes.add(kotlinType.getAttributes());
    }

    private final TypeProjection expandNonArgumentTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i11) {
        UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
        if (!DynamicTypesKt.isDynamic(unwrappedTypeUnwrap)) {
            SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap);
            if (!KotlinTypeKt.isError(simpleTypeAsSimpleType) && TypeUtilsKt.requiresTypeAliasExpansion(simpleTypeAsSimpleType)) {
                TypeConstructor constructor = simpleTypeAsSimpleType.getConstructor();
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = constructor.mo977getDeclarationDescriptor();
                constructor.getParameters().size();
                simpleTypeAsSimpleType.getArguments().size();
                if (!(classifierDescriptorMo977getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                    if (!(classifierDescriptorMo977getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                        SimpleType simpleTypeSubstituteArguments = substituteArguments(simpleTypeAsSimpleType, typeAliasExpansion, i11);
                        checkTypeArgumentsSubstitution(simpleTypeAsSimpleType, simpleTypeSubstituteArguments);
                        return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeSubstituteArguments);
                    }
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo977getDeclarationDescriptor;
                    if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                        this.reportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                        Variance variance = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String string = typeAliasDescriptor.getName().toString();
                        string.getClass();
                        return new TypeProjectionImpl(variance, ErrorUtils.createErrorType(errorTypeKind, string));
                    }
                    List<TypeProjection> arguments = simpleTypeAsSimpleType.getArguments();
                    ArrayList arrayList = new ArrayList(e0.o(arguments, 10));
                    int i12 = 0;
                    for (Object obj : arguments) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            d0.n();
                            throw null;
                        }
                        arrayList.add(expandTypeProjection((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i12), i11 + 1));
                        i12 = i13;
                    }
                    SimpleType simpleTypeExpandRecursively = expandRecursively(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeAsSimpleType.getAttributes(), simpleTypeAsSimpleType.isMarkedNullable(), i11 + 1, false);
                    SimpleType simpleTypeSubstituteArguments2 = substituteArguments(simpleTypeAsSimpleType, typeAliasExpansion, i11);
                    if (!DynamicTypesKt.isDynamic(simpleTypeExpandRecursively)) {
                        simpleTypeExpandRecursively = SpecialTypesKt.withAbbreviation(simpleTypeExpandRecursively, simpleTypeSubstituteArguments2);
                    }
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeExpandRecursively);
                }
            }
        }
        return typeProjection;
    }

    private final SimpleType expandRecursively(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z11, int i11, boolean z12) {
        TypeProjection typeProjectionExpandTypeProjection = expandTypeProjection(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i11);
        KotlinType type = typeProjectionExpandTypeProjection.getType();
        type.getClass();
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            return simpleTypeAsSimpleType;
        }
        typeProjectionExpandTypeProjection.getProjectionKind();
        checkRepeatedAnnotations(simpleTypeAsSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(combineAttributes(simpleTypeAsSimpleType, typeAttributes), z11);
        simpleTypeMakeNullableIfNeeded.getClass();
        return z12 ? SpecialTypesKt.withAbbreviation(simpleTypeMakeNullableIfNeeded, createAbbreviation(typeAliasExpansion, typeAttributes, z11)) : simpleTypeMakeNullableIfNeeded;
    }

    private final TypeProjection expandTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i11) {
        Variance variance;
        Variance variance2;
        Variance variance3;
        Companion.assertRecursionDepth(i11, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            typeParameterDescriptor.getClass();
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            typeProjectionMakeStarProjection.getClass();
            return typeProjectionMakeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        type.getClass();
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        if (replacement == null) {
            return expandNonArgumentTypeProjection(typeProjection, typeAliasExpansion, i11);
        }
        if (replacement.isStarProjection()) {
            typeParameterDescriptor.getClass();
            TypeProjection typeProjectionMakeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
            typeProjectionMakeStarProjection2.getClass();
            return typeProjectionMakeStarProjection2;
        }
        UnwrappedType unwrappedTypeUnwrap = replacement.getType().unwrap();
        Variance projectionKind = replacement.getProjectionKind();
        projectionKind.getClass();
        Variance projectionKind2 = typeProjection.getProjectionKind();
        projectionKind2.getClass();
        if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
            if (projectionKind == variance3) {
                projectionKind = projectionKind2;
            } else {
                this.reportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
            }
        }
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            variance = Variance.INVARIANT;
        }
        variance.getClass();
        if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
            if (projectionKind == variance2) {
                projectionKind = variance2;
            } else {
                this.reportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
            }
        }
        checkRepeatedAnnotations(type.getAnnotations(), unwrappedTypeUnwrap.getAnnotations());
        return new TypeProjectionImpl(projectionKind, unwrappedTypeUnwrap instanceof DynamicType ? combineAttributes((DynamicType) unwrappedTypeUnwrap, type.getAttributes()) : combineNullabilityAndAnnotations(TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap), type));
    }

    private final SimpleType substituteArguments(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i11) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(e0.o(arguments, 10));
        int i12 = 0;
        for (Object obj : arguments) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                d0.n();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionExpandTypeProjection = expandTypeProjection(typeProjection, typeAliasExpansion, constructor.getParameters().get(i12), i11 + 1);
            if (!typeProjectionExpandTypeProjection.isStarProjection()) {
                typeProjectionExpandTypeProjection = new TypeProjectionImpl(typeProjectionExpandTypeProjection.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionExpandTypeProjection.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionExpandTypeProjection);
            i12 = i13;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes typeAttributes) {
        typeAliasExpansion.getClass();
        typeAttributes.getClass();
        return expandRecursively(typeAliasExpansion, typeAttributes, false, 0, true);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assertRecursionDepth(int i11, TypeAliasDescriptor typeAliasDescriptor) {
            if (i11 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }

        private Companion() {
        }
    }

    private final DynamicType combineAttributes(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.replaceAttributes(createdCombinedAttributes(dynamicType, typeAttributes));
    }
}
