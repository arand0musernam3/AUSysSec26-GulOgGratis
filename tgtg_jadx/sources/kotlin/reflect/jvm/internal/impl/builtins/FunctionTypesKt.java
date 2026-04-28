package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1#2:294\n1549#3:295\n1620#3,3:296\n223#3,2:299\n1549#3:301\n1620#3,3:302\n1549#3:305\n1620#3,3:306\n1590#3,4:309\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n152#1:295\n152#1:296,3\n187#1:299,2\n192#1:301\n192#1:302,3\n214#1:305\n214#1:306,3\n217#1:309,4\n*E\n"})
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        AnnotationDescriptor annotationDescriptorMo971findAnnotation = kotlinType.getAnnotations().mo971findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (annotationDescriptorMo971findAnnotation == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) x0.c(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, annotationDescriptorMo971findAnnotation.getAllValueArguments());
        constantValue.getClass();
        return ((IntValue) constantValue).getValue().intValue();
    }

    @NotNull
    public static final SimpleType createFunctionType(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull Annotations annotations, @Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, boolean z11) {
        kotlinBuiltIns.getClass();
        annotations.getClass();
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, list3, kotlinType2, kotlinBuiltIns);
        ClassDescriptor functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, list.size() + list2.size() + (kotlinType == null ? 0 : 1), z11);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, kotlinBuiltIns);
        }
        if (!list.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, kotlinBuiltIns, list.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    @Nullable
    public static final Name extractParameterNameFromFunctionTypeArgument(@NotNull KotlinType kotlinType) {
        String value;
        kotlinType.getClass();
        AnnotationDescriptor annotationDescriptorMo971findAnnotation = kotlinType.getAnnotations().mo971findAnnotation(StandardNames.FqNames.parameterName);
        if (annotationDescriptorMo971findAnnotation == null) {
            return null;
        }
        Object objI0 = CollectionsKt.i0(annotationDescriptorMo971findAnnotation.getAllValueArguments().values());
        StringValue stringValue = objI0 instanceof StringValue ? (StringValue) objI0 : null;
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return Name.identifier(value);
            }
        }
        return null;
    }

    @NotNull
    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        int iContextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (iContextFunctionTypeParamsCount == 0) {
            return n0.f26529a;
        }
        List<TypeProjection> listSubList = kotlinType.getArguments().subList(0, iContextFunctionTypeParamsCount);
        ArrayList arrayList = new ArrayList(e0.o(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            KotlinType type = ((TypeProjection) it.next()).getType();
            type.getClass();
            arrayList.add(type);
        }
        return arrayList;
    }

    @NotNull
    public static final ClassDescriptor getFunctionDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, int i11, boolean z11) {
        kotlinBuiltIns.getClass();
        ClassDescriptor suspendFunction = z11 ? kotlinBuiltIns.getSuspendFunction(i11) : kotlinBuiltIns.getFunction(i11);
        suspendFunction.getClass();
        return suspendFunction;
    }

    @NotNull
    public static final List<TypeProjection> getFunctionTypeArgumentProjections(@Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> list, @NotNull List<? extends KotlinType> list2, @Nullable List<Name> list3, @NotNull KotlinType kotlinType2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        Name name;
        list.getClass();
        list2.getClass();
        kotlinType2.getClass();
        kotlinBuiltIns.getClass();
        int i11 = 0;
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + (kotlinType != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(e0.o(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.asTypeProjection((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            KotlinType kotlinTypeReplaceAnnotations = (KotlinType) obj;
            if (list3 == null || (name = list3.get(i11)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name nameIdentifier = Name.identifier("name");
                String strAsString = name.asString();
                strAsString.getClass();
                kotlinTypeReplaceAnnotations = TypeUtilsKt.replaceAnnotations(kotlinTypeReplaceAnnotations, Annotations.Companion.create(CollectionsKt.c0(kotlinTypeReplaceAnnotations.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, w0.b(new Pair(nameIdentifier, new StringValue(strAsString)))))));
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinTypeReplaceAnnotations));
            i11 = i12;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType2));
        return arrayList;
    }

    private static final FunctionClassKind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Companion;
        String strAsString = fqNameUnsafe.shortName().asString();
        strAsString.getClass();
        FqName fqNameParent = fqNameUnsafe.toSafe().parent();
        fqNameParent.getClass();
        return companion.getFunctionalClassKind(strAsString, fqNameParent);
    }

    @Nullable
    public static final KotlinType getReceiverTypeFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        if (!isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    @NotNull
    public static final KotlinType getReturnTypeFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.W(kotlinType.getArguments())).getType();
        type.getClass();
        return type;
    }

    @NotNull
    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        isBuiltinFunctionalType(kotlinType);
        return kotlinType.getArguments().subList((isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0) + contextFunctionTypeParamsCount(kotlinType), r0.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FunctionClassKind functionalClassKind = getFunctionalClassKind(declarationDescriptor);
        return functionalClassKind == FunctionClassKind.Function || functionalClassKind == FunctionClassKind.SuspendFunction;
    }

    public static final boolean isBuiltinFunctionalType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = kotlinType.getConstructor().mo977getDeclarationDescriptor();
        return classifierDescriptorMo977getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(classifierDescriptorMo977getDeclarationDescriptor);
    }

    public static final boolean isFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = kotlinType.getConstructor().mo977getDeclarationDescriptor();
        return (classifierDescriptorMo977getDeclarationDescriptor != null ? getFunctionalClassKind(classifierDescriptorMo977getDeclarationDescriptor) : null) == FunctionClassKind.Function;
    }

    public static final boolean isSuspendFunctionType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = kotlinType.getConstructor().mo977getDeclarationDescriptor();
        return (classifierDescriptorMo977getDeclarationDescriptor != null ? getFunctionalClassKind(classifierDescriptorMo977getDeclarationDescriptor) : null) == FunctionClassKind.SuspendFunction;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo971findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    @NotNull
    public static final Annotations withContextReceiversFunctionAnnotation(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns, int i11) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        return annotations.hasAnnotation(fqName) ? annotations : Annotations.Companion.create(CollectionsKt.c0(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, w0.b(new Pair(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i11))))));
    }

    @NotNull
    public static final Annotations withExtensionFunctionAnnotation(@NotNull Annotations annotations, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        annotations.getClass();
        kotlinBuiltIns.getClass();
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        if (annotations.hasAnnotation(fqName)) {
            return annotations;
        }
        Annotations.Companion companion = Annotations.Companion;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        return companion.create(CollectionsKt.c0(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, o0Var)));
    }

    @Nullable
    public static final FunctionClassKind getFunctionalClassKind(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }
}
