package kotlin.reflect.jvm.internal.impl.descriptors;

import c5.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.Sequence;
import o80.f;
import o80.g;
import o80.i;
import o80.q;
import o80.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n15#2,2:101\n1549#3:103\n1620#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
public final class TypeParameterUtilsKt {
    private static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i11) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i11;
        if (classifierDescriptorWithTypeParameters.isInner()) {
            List<TypeProjection> listSubList = kotlinType.getArguments().subList(i11, size);
            DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, buildPossiblyInnerType(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
        }
        if (size != kotlinType.getArguments().size()) {
            DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i11, kotlinType.getArguments().size()), null);
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i11) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i11);
    }

    @NotNull
    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> parameters;
        Object next;
        TypeConstructor typeConstructor;
        classifierDescriptorWithTypeParameters.getClass();
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        Sequence<DeclarationDescriptor> parents = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters);
        TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1 = new Function1<DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
                declarationDescriptor.getClass();
                return Boolean.valueOf(declarationDescriptor instanceof CallableDescriptor);
            }
        };
        parents.getClass();
        typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.getClass();
        f fVarH = r.h(new i(parents, typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1), new Function1<DeclarationDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
                declarationDescriptor.getClass();
                return Boolean.valueOf(!(declarationDescriptor instanceof ConstructorDescriptor));
            }
        });
        TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 = new Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Sequence<TypeParameterDescriptor> invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
                declarationDescriptor.getClass();
                List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
                typeParameters.getClass();
                return new l3(typeParameters, 3);
            }
        };
        typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3.getClass();
        List listO = r.o(new g(fVarH, typeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3, q.f32131a));
        Iterator it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            parameters = typeConstructor.getParameters();
        }
        if (parameters == null) {
            parameters = n0.f26529a;
        }
        if (listO.isEmpty() && parameters.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            declaredTypeParameters2.getClass();
            return declaredTypeParameters2;
        }
        ArrayList<TypeParameterDescriptor> arrayListD0 = CollectionsKt.d0(parameters, listO);
        ArrayList arrayList = new ArrayList(e0.o(arrayListD0, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : arrayListD0) {
            typeParameterDescriptor.getClass();
            arrayList.add(capturedCopyForInnerDeclaration(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return CollectionsKt.d0(arrayList, declaredTypeParameters);
    }

    @Nullable
    public static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = kotlinType.getConstructor().mo977getDeclarationDescriptor();
        return buildPossiblyInnerType(kotlinType, classifierDescriptorMo977getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo977getDeclarationDescriptor : null, 0);
    }
}
