package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import e40.a;
import j4.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCapturedTypeApproximation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1747#2,3:179\n1549#2:183\n1620#2,3:184\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n*L\n158#1:179,3\n167#1:183\n167#1:184,3\n*E\n"})
public final class CapturedTypeApproximationKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(@NotNull KotlinType kotlinType) {
        Object objReplaceTypeArguments;
        kotlinType.getClass();
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType));
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), kotlinType), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), kotlinType));
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            constructor.getClass();
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type = projection.getType();
            type.getClass();
            KotlinType kotlinTypeApproximateCapturedTypes$makeNullableIfNeeded = approximateCapturedTypes$makeNullableIfNeeded(type, kotlinType);
            int i11 = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i11 == 2) {
                SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
                nullableAnyType.getClass();
                return new ApproximationBounds<>(kotlinTypeApproximateCapturedTypes$makeNullableIfNeeded, nullableAnyType);
            }
            if (i11 != 3) {
                d.s(projection, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            SimpleType nothingType = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
            nothingType.getClass();
            return new ApproximationBounds<>(approximateCapturedTypes$makeNullableIfNeeded(nothingType, kotlinType), kotlinTypeApproximateCapturedTypes$makeNullableIfNeeded);
        }
        if (kotlinType.getArguments().isEmpty() || kotlinType.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = kotlinType.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        parameters.getClass();
        for (Pair pair : CollectionsKt.y0(arguments, parameters)) {
            TypeProjection typeProjection = (TypeProjection) pair.f26485a;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.f26486b;
            typeParameterDescriptor.getClass();
            TypeArgument typeArgument = toTypeArgument(typeProjection, typeParameterDescriptor);
            if (typeProjection.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                ApproximationBounds<TypeArgument> approximationBoundsApproximateProjection = approximateProjection(typeArgument);
                TypeArgument typeArgumentComponent1 = approximationBoundsApproximateProjection.component1();
                TypeArgument typeArgumentComponent2 = approximationBoundsApproximateProjection.component2();
                arrayList.add(typeArgumentComponent1);
                arrayList2.add(typeArgumentComponent2);
            }
        }
        boolean z11 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((TypeArgument) it.next()).isConsistent()) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            objReplaceTypeArguments = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
            objReplaceTypeArguments.getClass();
        } else {
            objReplaceTypeArguments = replaceTypeArguments(kotlinType, arrayList);
        }
        return new ApproximationBounds<>(objReplaceTypeArguments, replaceTypeArguments(kotlinType, arrayList2));
    }

    private static final KotlinType approximateCapturedTypes$makeNullableIfNeeded(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(kotlinType, kotlinType2.isMarkedNullable());
        kotlinTypeMakeNullableIfNeeded.getClass();
        return kotlinTypeMakeNullableIfNeeded;
    }

    @Nullable
    public static final TypeProjection approximateCapturedTypesIfNecessary(@Nullable TypeProjection typeProjection, boolean z11) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            if (TypeUtils.contains(type, new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(UnwrappedType unwrappedType) {
                    unwrappedType.getClass();
                    return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
                }
            })) {
                Variance projectionKind = typeProjection.getProjectionKind();
                projectionKind.getClass();
                return projectionKind == Variance.OUT_VARIANCE ? new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper()) : z11 ? new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower()) : substituteCapturedTypesWithProjections(typeProjection);
            }
        }
        return typeProjection;
    }

    private static final ApproximationBounds<TypeArgument> approximateProjection(TypeArgument typeArgument) {
        ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(typeArgument.getInProjection());
        KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes.component1();
        KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes.component2();
        ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(typeArgument.getOutProjection());
        return new ApproximationBounds<>(new TypeArgument(typeArgument.getTypeParameter(), kotlinTypeComponent2, approximationBoundsApproximateCapturedTypes2.component1()), new TypeArgument(typeArgument.getTypeParameter(), kotlinTypeComponent1, approximationBoundsApproximateCapturedTypes2.component2()));
    }

    private static final KotlinType replaceTypeArguments(KotlinType kotlinType, List<TypeArgument> list) {
        kotlinType.getArguments().size();
        list.size();
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toTypeProjection((TypeArgument) it.next()));
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList, null, null, 6, null);
    }

    private static final TypeProjection substituteCapturedTypesWithProjections(TypeProjection typeProjection) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            public TypeProjection get(@NotNull TypeConstructor typeConstructor) {
                typeConstructor.getClass();
                CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) typeConstructor : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
            }
        });
        typeSubstitutorCreate.getClass();
        return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
    }

    private static final TypeArgument toTypeArgument(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i11 == 1) {
            KotlinType type = typeProjection.getType();
            type.getClass();
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            return new TypeArgument(typeParameterDescriptor, type, type2);
        }
        if (i11 == 2) {
            KotlinType type3 = typeProjection.getType();
            type3.getClass();
            SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            nullableAnyType.getClass();
            return new TypeArgument(typeParameterDescriptor, type3, nullableAnyType);
        }
        if (i11 != 3) {
            a.f();
            return null;
        }
        SimpleType nothingType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
        nothingType.getClass();
        KotlinType type4 = typeProjection.getType();
        type4.getClass();
        return new TypeArgument(typeParameterDescriptor, nothingType, type4);
    }

    private static final TypeProjection toTypeProjection(TypeArgument typeArgument) {
        typeArgument.isConsistent();
        if (!Intrinsics.areEqual(typeArgument.getInProjection(), typeArgument.getOutProjection())) {
            Variance variance = typeArgument.getTypeParameter().getVariance();
            Variance variance2 = Variance.IN_VARIANCE;
            if (variance != variance2) {
                return (!KotlinBuiltIns.isNothing(typeArgument.getInProjection()) || typeArgument.getTypeParameter().getVariance() == variance2) ? KotlinBuiltIns.isNullableAny(typeArgument.getOutProjection()) ? new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(typeArgument, variance2), typeArgument.getInProjection()) : new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(typeArgument, Variance.OUT_VARIANCE), typeArgument.getOutProjection()) : new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(typeArgument, Variance.OUT_VARIANCE), typeArgument.getOutProjection());
            }
        }
        return new TypeProjectionImpl(typeArgument.getInProjection());
    }

    private static final Variance toTypeProjection$removeProjectionIfRedundant(TypeArgument typeArgument, Variance variance) {
        return variance == typeArgument.getTypeParameter().getVariance() ? Variance.INVARIANT : variance;
    }
}
