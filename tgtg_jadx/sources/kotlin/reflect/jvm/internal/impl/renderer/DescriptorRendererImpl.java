package kotlin.reflect.jvm.internal.impl.renderer;

import b3.i;
import e0.f;
import e40.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.i1;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import w.a0;
import wy.o;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDescriptorRendererImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1205:1\n2624#2,3:1206\n766#2:1209\n857#2,2:1210\n1549#2:1212\n1620#2,3:1213\n766#2:1216\n857#2,2:1217\n1549#2:1219\n1620#2,3:1220\n1549#2:1223\n1620#2,3:1224\n2624#2,3:1228\n2624#2,3:1231\n766#2:1234\n857#2,2:1235\n1620#2,3:1237\n1#3:1227\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererImpl\n*L\n183#1:1206,3\n483#1:1209\n483#1:1210,2\n484#1:1212\n484#1:1213,3\n486#1:1216\n486#1:1217,2\n486#1:1219\n486#1:1220,3\n488#1:1223\n488#1:1224,3\n587#1:1228,3\n589#1:1231,3\n805#1:1234\n805#1:1235,2\n828#1:1237,3\n*E\n"})
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    @NotNull
    private final j functionTypeAnnotationsRenderer$delegate;

    @NotNull
    private final DescriptorRendererOptionsImpl options;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        descriptorRendererOptionsImpl.getClass();
        this.options = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.isLocked();
        this.functionTypeAnnotationsRenderer$delegate = l.b(new Function0<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DescriptorRendererImpl invoke() {
                DescriptorRenderer descriptorRendererWithOptions = this.this$0.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2.1
                    public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                        descriptorRendererOptions.getClass();
                        descriptorRendererOptions.setExcludedTypeAnnotationClasses(i1.h(descriptorRendererOptions.getExcludedTypeAnnotationClasses(), d0.h(StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams)));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DescriptorRendererOptions) obj);
                        return Unit.f26487a;
                    }
                });
                descriptorRendererWithOptions.getClass();
                return (DescriptorRendererImpl) descriptorRendererWithOptions;
            }
        });
    }

    private final void appendDefinedIn(StringBuilder sb2, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (containingDeclaration = declarationDescriptor.getContainingDeclaration()) == null || (containingDeclaration instanceof ModuleDescriptor)) {
            return;
        }
        sb2.append(" ");
        sb2.append(renderMessage("defined in"));
        sb2.append(" ");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
        fqName.getClass();
        sb2.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
        if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
            sb2.append(" ");
            sb2.append(renderMessage("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final void appendTypeProjections(StringBuilder sb2, List<? extends TypeProjection> list) {
        CollectionsKt.T(list, sb2, ", ", null, null, new Function1<TypeProjection, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.appendTypeProjections.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull TypeProjection typeProjection) {
                typeProjection.getClass();
                if (typeProjection.isStarProjection()) {
                    return "*";
                }
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                KotlinType type = typeProjection.getType();
                type.getClass();
                String strRenderType = descriptorRendererImpl.renderType(type);
                if (typeProjection.getProjectionKind() == Variance.INVARIANT) {
                    return strRenderType;
                }
                return typeProjection.getProjectionKind() + ' ' + strRenderType;
            }
        }, 60);
    }

    private final String arrow() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return escape("->");
        }
        if (i11 == 2) {
            return "&rarr;";
        }
        a.f();
        return null;
    }

    private final String escape(String str) {
        return getTextFormat().escape(str);
    }

    private final DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        return (DescriptorRendererImpl) this.functionTypeAnnotationsRenderer$delegate.getValue();
    }

    private final String gt() {
        return escape(">");
    }

    private final boolean hasModifiersOrAnnotations(KotlinType kotlinType) {
        return FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    private final Modality implicitModalityWithoutExtensions(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
            return Modality.FINAL;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Modality modality2 = Modality.ABSTRACT;
        return modality == modality2 ? modality2 : Modality.OPEN;
    }

    private final boolean isParameterName(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.areEqual(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName);
    }

    private final String lt() {
        return escape("<");
    }

    private final boolean overridesSomething(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final void renderAbbreviatedTypeExpansion(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        renderNormalizedTypeAsIs(sb2, abbreviatedType.getExpandedType());
        sb2.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAccessorModifiers(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2) {
        renderMemberModifiers(propertyAccessorDescriptor, sb2);
    }

    private final void renderAdditionalModifiers(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        boolean z11;
        boolean z12 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            overriddenDescriptors.getClass();
            Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((FunctionDescriptor) it.next()).isOperator()) {
                        if (getAlwaysRenderModifiers()) {
                            break;
                        }
                    }
                }
                z11 = false;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (functionDescriptor.isInfix()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
            overriddenDescriptors2.getClass();
            Collection<? extends FunctionDescriptor> collection2 = overriddenDescriptors2;
            if (collection2.isEmpty()) {
                z12 = true;
            } else {
                Iterator<T> it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((FunctionDescriptor) it2.next()).isInfix()) {
                        if (getAlwaysRenderModifiers()) {
                            break;
                        }
                    }
                }
            }
        }
        renderModifier(sb2, functionDescriptor.isTailrec(), "tailrec");
        renderSuspendModifier(functionDescriptor, sb2);
        renderModifier(sb2, functionDescriptor.isInline(), "inline");
        renderModifier(sb2, z12, "infix");
        renderModifier(sb2, z11, "operator");
    }

    private final List<String> renderAndSortAnnotationArguments(AnnotationDescriptor annotationDescriptor) {
        ClassConstructorDescriptor classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        List list = null;
        ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
        if (annotationClass != null && (classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor = annotationClass.mo970getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = n0.f26529a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            Name name = (Name) obj2;
            name.getClass();
            if (!allValueArguments.containsKey(name)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(e0.o(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Name) it2.next()).asString() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
        ArrayList arrayList5 = new ArrayList(e0.o(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Name name2 = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name2.asString());
            sb2.append(" = ");
            sb2.append(!list.contains(name2) ? renderConstant(constantValue) : "...");
            arrayList5.add(sb2.toString());
        }
        return CollectionsKt.k0(CollectionsKt.d0(arrayList5, arrayList4));
    }

    private final void renderAnnotations(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.I(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !isParameterName(annotationDescriptor) && (annotationFilter == null || ((Boolean) annotationFilter.invoke(annotationDescriptor)).booleanValue())) {
                    sb2.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    public static /* synthetic */ void renderAnnotations$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.renderAnnotations(sb2, annotated, annotationUseSiteTarget);
    }

    private final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        parameters.getClass();
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb2.append(" /*captured type parameters: ");
            renderTypeParameterList(sb2, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderClass(ClassDescriptor classDescriptor, StringBuilder sb2) {
        ClassConstructorDescriptor classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor;
        boolean z11 = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!getStartFromName()) {
            renderAnnotations$default(this, sb2, classDescriptor, null, 2, null);
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            contextReceivers.getClass();
            renderContextReceivers(contextReceivers, sb2);
            if (!z11) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                visibility.getClass();
                renderVisibility(visibility, sb2);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                modality.getClass();
                renderModality(modality, sb2, implicitModalityWithoutExtensions(classDescriptor));
            }
            renderMemberModifiers(classDescriptor, sb2);
            renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), Bayeux.KEY_DATA);
            renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue(), "value");
            renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun(), "fun");
            renderClassKindPrefix(classDescriptor, sb2);
        }
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            renderCompanionObjectName(classDescriptor, sb2);
        } else {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb2);
            }
            renderName(classDescriptor, sb2, true);
        }
        if (z11) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        renderTypeParameters(declaredTypeParameters, sb2, false);
        renderCapturedTypeParametersIfRequired(classDescriptor, sb2);
        if (!classDescriptor.getKind().isSingleton() && getClassWithPrimaryConstructor() && (classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor = classDescriptor.mo970getUnsubstitutedPrimaryConstructor()) != null) {
            sb2.append(" ");
            renderAnnotations$default(this, sb2, classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor, null, 2, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor.getVisibility();
            visibility2.getClass();
            renderVisibility(visibility2, sb2);
            sb2.append(renderKeyword("constructor"));
            List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor.getValueParameters();
            valueParameters.getClass();
            renderValueParameters(valueParameters, classConstructorDescriptorMo970getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb2);
        }
        renderSuperTypes(classDescriptor, sb2);
        renderWhereSuffix(declaredTypeParameters, sb2);
    }

    private final void renderClassKindPrefix(ClassDescriptor classDescriptor, StringBuilder sb2) {
        sb2.append(renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final void renderCompanionObjectName(DeclarationDescriptor declarationDescriptor, StringBuilder sb2) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb2.append("companion object");
            }
            renderSpaceIfNeeded(sb2);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb2.append("of ");
                Name name = containingDeclaration.getName();
                name.getClass();
                sb2.append(renderName(name, false));
            }
        }
        if (getVerbose() || !Intrinsics.areEqual(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb2);
            }
            Name name2 = declarationDescriptor.getName();
            name2.getClass();
            sb2.append(renderName(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String renderConstant(ConstantValue<?> constantValue) {
        if (constantValue instanceof ArrayValue) {
            return CollectionsKt.U(((ArrayValue) constantValue).getValue(), ", ", "{", "}", new Function1<ConstantValue<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderConstant.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull ConstantValue<?> constantValue2) {
                    constantValue2.getClass();
                    return DescriptorRendererImpl.this.renderConstant(constantValue2);
                }
            }, 24);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.N(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value = ((KClassValue) constantValue).getValue();
        if (value instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value).getType() + "::class";
        }
        if (!(value instanceof KClassValue.Value.NormalClass)) {
            a.f();
            return null;
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        strAsString.getClass();
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i11 = 0; i11 < arrayDimensions; i11++) {
            strAsString = f.g('>', "kotlin.Array<", strAsString);
        }
        return strAsString.concat("::class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r10, java.lang.StringBuilder r11) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.StringBuilder):void");
    }

    private final void renderContextReceivers(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        int i11 = 0;
        for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
            int i12 = i11 + 1;
            renderAnnotations(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            type.getClass();
            sb2.append(renderForReceiver(type));
            if (i11 == list.size() - 1) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i11 = i12;
        }
    }

    private final void renderDefaultType(StringBuilder sb2, KotlinType kotlinType) {
        renderAnnotations$default(this, sb2, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(kotlinType)) {
            if (TypeUtilsKt.isUnresolvedType(kotlinType) && getPresentableUnresolvedTypes()) {
                sb2.append(renderError(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(kotlinType)));
            } else {
                if (!(kotlinType instanceof ErrorType) || getInformativeErrorType()) {
                    sb2.append(kotlinType.getConstructor().toString());
                } else {
                    sb2.append(((ErrorType) kotlinType).getDebugMessage());
                }
                sb2.append(renderTypeArguments(kotlinType.getArguments()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            renderTypeConstructorAndArguments$default(this, sb2, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            sb2.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb2.append(" & Any");
        }
    }

    private final String renderError(String str) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return str;
        }
        if (i11 == 2) {
            return a0.p("<font color=red><b>", str, "</b></font>");
        }
        a.f();
        return null;
    }

    private final String renderForReceiver(KotlinType kotlinType) {
        String strRenderType = renderType(kotlinType);
        return ((!shouldRenderAsPrettyFunctionType(kotlinType) || TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) ? strRenderType : f.g(')', "(", strRenderType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFunction(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        FunctionDescriptor functionDescriptor2;
        StringBuilder sb3;
        if (getStartFromName()) {
            functionDescriptor2 = functionDescriptor;
            sb3 = sb2;
        } else {
            if (getStartFromDeclarationKeyword()) {
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
            } else {
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
                renderAnnotations$default(this, sb3, functionDescriptor2, null, 2, null);
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor2.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                renderContextReceivers(contextReceiverParameters, sb3);
                DescriptorVisibility visibility = functionDescriptor2.getVisibility();
                visibility.getClass();
                renderVisibility(visibility, sb3);
                renderModalityForCallable(functionDescriptor2, sb3);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor2, sb3);
                }
                renderOverride(functionDescriptor2, sb3);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor2, sb3);
                } else {
                    renderSuspendModifier(functionDescriptor2, sb3);
                }
                renderMemberKind(functionDescriptor2, sb3);
                if (getVerbose()) {
                    if (functionDescriptor2.isHiddenToOvercomeSignatureClash()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor2.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(renderKeyword("fun"));
            sb3.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor2.getTypeParameters();
            typeParameters.getClass();
            renderTypeParameters(typeParameters, sb3, true);
            renderReceiver(functionDescriptor2, sb3);
        }
        renderName(functionDescriptor2, sb3, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor2.getValueParameters();
        valueParameters.getClass();
        renderValueParameters(valueParameters, functionDescriptor2.hasSynthesizedParameterNames(), sb3);
        renderReceiverAfterName(functionDescriptor2, sb3);
        KotlinType returnType = functionDescriptor2.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb3.append(": ");
            sb3.append(returnType == null ? "[NULL]" : renderType(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor2.getTypeParameters();
        typeParameters2.getClass();
        renderWhereSuffix(typeParameters2, sb3);
    }

    private final void renderFunctionType(StringBuilder sb2, KotlinType kotlinType) {
        Name nameExtractParameterNameFromFunctionTypeArgument;
        int length = sb2.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb2, kotlinType, null, 2, null);
        boolean z11 = sb2.length() != length;
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb2.append("context(");
            Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, d0.g(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                renderNormalizedType(sb2, it.next());
                sb2.append(", ");
            }
            renderNormalizedType(sb2, (KotlinType) CollectionsKt.W(contextReceiverTypesFromFunctionType));
            sb2.append(") ");
        }
        boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean zIsMarkedNullable = kotlinType.isMarkedNullable();
        boolean z12 = zIsMarkedNullable || (z11 && receiverTypeFromFunctionType != null);
        if (z12) {
            if (zIsSuspendFunctionType) {
                sb2.insert(length, '(');
            } else {
                if (z11) {
                    CharsKt.b(b0.w(sb2));
                    if (sb2.charAt(sb2.length() - 2) != ')') {
                        sb2.insert(sb2.length() - 1, "()");
                    }
                }
                sb2.append("(");
            }
        }
        renderModifier(sb2, zIsSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            boolean z13 = (shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || hasModifiersOrAnnotations(receiverTypeFromFunctionType) || (receiverTypeFromFunctionType instanceof DefinitelyNotNullType);
            if (z13) {
                sb2.append("(");
            }
            renderNormalizedType(sb2, receiverTypeFromFunctionType);
            if (z13) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!FunctionTypesKt.isBuiltinExtensionFunctionalType(kotlinType) || kotlinType.getArguments().size() > 1) {
            int i11 = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
                int i12 = i11 + 1;
                if (i11 > 0) {
                    sb2.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type = typeProjection.getType();
                    type.getClass();
                    nameExtractParameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    nameExtractParameterNameFromFunctionTypeArgument = null;
                }
                if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                    sb2.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                    sb2.append(": ");
                }
                sb2.append(renderTypeProjection(typeProjection));
                i11 = i12;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(arrow());
        sb2.append(" ");
        renderNormalizedType(sb2, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z12) {
            sb2.append(")");
        }
        if (zIsMarkedNullable) {
            sb2.append("?");
        }
    }

    private final void renderInitializer(VariableDescriptor variableDescriptor, StringBuilder sb2) {
        ConstantValue<?> constantValueMo972getCompileTimeInitializer;
        if (!getIncludePropertyConstant() || (constantValueMo972getCompileTimeInitializer = variableDescriptor.mo972getCompileTimeInitializer()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(escape(renderConstant(constantValueMo972getCompileTimeInitializer)));
    }

    private final String renderKeyword(String str) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return str;
        }
        if (i11 == 2) {
            return getBoldOnlyForNamesInHtml() ? str : a0.p("<b>", str, "</b>");
        }
        a.f();
        return null;
    }

    private final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    private final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        renderModifier(sb2, memberDescriptor.isExternal(), "external");
        boolean z11 = false;
        renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z11 = true;
        }
        renderModifier(sb2, z11, "actual");
    }

    private final void renderModality(Modality modality, StringBuilder sb2, Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    private final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && overridesSomething(callableMemberDescriptor)) {
            return;
        }
        Modality modality = callableMemberDescriptor.getModality();
        modality.getClass();
        renderModality(modality, sb2, implicitModalityWithoutExtensions(callableMemberDescriptor));
    }

    private final void renderModifier(StringBuilder sb2, boolean z11, String str) {
        if (z11) {
            sb2.append(renderKeyword(str));
            sb2.append(" ");
        }
    }

    private final void renderNormalizedType(StringBuilder sb2, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrappedTypeUnwrap instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeUnwrap : null;
        if (abbreviatedType == null) {
            renderNormalizedTypeAsIs(sb2, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            renderNormalizedTypeAsIs(sb2, abbreviatedType.getExpandedType());
            return;
        }
        renderNormalizedTypeAsIs(sb2, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            renderAbbreviatedTypeExpansion(sb2, abbreviatedType);
        }
    }

    private final void renderNormalizedTypeAsIs(StringBuilder sb2, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
        } else if (unwrappedTypeUnwrap instanceof SimpleType) {
            renderSimpleType(sb2, (SimpleType) unwrappedTypeUnwrap);
        }
    }

    private final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(sb2, true, "override");
            if (getVerbose()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageFragment(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", sb2);
        if (getDebugMode()) {
            sb2.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), sb2, false);
        }
    }

    private final void renderPackageHeader(FqName fqName, String str, StringBuilder sb2) {
        sb2.append(renderKeyword(str));
        FqNameUnsafe unsafe = fqName.toUnsafe();
        unsafe.getClass();
        String strRenderFqName = renderFqName(unsafe);
        if (strRenderFqName.length() > 0) {
            sb2.append(" ");
            sb2.append(strRenderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageView(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        renderPackageHeader(packageViewDescriptor.getFqName(), "package", sb2);
        if (getDebugMode()) {
            sb2.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), sb2, false);
        }
    }

    private final void renderPossiblyInnerType(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            renderPossiblyInnerType(sb2, outerType);
            sb2.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            name.getClass();
            sb2.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            typeConstructor.getClass();
            sb2.append(renderTypeConstructor(typeConstructor));
        }
        sb2.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderProperty(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        PropertyDescriptor propertyDescriptor2;
        StringBuilder sb3;
        if (getStartFromName()) {
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
        } else {
            if (!getStartFromDeclarationKeyword()) {
                renderPropertyAnnotations(propertyDescriptor, sb2);
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                renderContextReceivers(contextReceiverParameters, sb2);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                visibility.getClass();
                renderVisibility(visibility, sb2);
                boolean z11 = false;
                renderModifier(sb2, getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                renderMemberModifiers(propertyDescriptor, sb2);
                renderModalityForCallable(propertyDescriptor, sb2);
                renderOverride(propertyDescriptor, sb2);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z11 = true;
                }
                renderModifier(sb2, z11, "lateinit");
                renderMemberKind(propertyDescriptor, sb2);
            }
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
            renderValVarPrefix$default(this, propertyDescriptor2, sb3, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor2.getTypeParameters();
            typeParameters.getClass();
            renderTypeParameters(typeParameters, sb3, true);
            renderReceiver(propertyDescriptor2, sb3);
        }
        renderName(propertyDescriptor2, sb3, true);
        sb3.append(": ");
        KotlinType type = propertyDescriptor2.getType();
        type.getClass();
        sb3.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor2, sb3);
        renderInitializer(propertyDescriptor2, sb3);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor2.getTypeParameters();
        typeParameters2.getClass();
        renderWhereSuffix(typeParameters2, sb3);
    }

    private final void renderPropertyAnnotations(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            renderAnnotations$default(this, sb2, propertyDescriptor, null, 2, null);
            FieldDescriptor backingField = propertyDescriptor.getBackingField();
            if (backingField != null) {
                renderAnnotations(sb2, backingField, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
            if (delegateField != null) {
                renderAnnotations(sb2, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    renderAnnotations(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    renderAnnotations(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                    valueParameters.getClass();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.h0(valueParameters);
                    valueParameterDescriptor.getClass();
                    renderAnnotations(sb2, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void renderReceiver(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb2, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            type.getClass();
            sb2.append(renderForReceiver(type));
            sb2.append(".");
        }
    }

    private final void renderReceiverAfterName(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb2.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            type.getClass();
            sb2.append(renderType(type));
        }
    }

    private final void renderSimpleType(StringBuilder sb2, SimpleType simpleType) {
        if (Intrinsics.areEqual(simpleType, TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb2.append("???");
            return;
        }
        if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
            if (!getUninferredTypeParameterAsName()) {
                sb2.append("???");
                return;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            constructor.getClass();
            sb2.append(renderError(((ErrorTypeConstructor) constructor).getParam(0)));
            return;
        }
        if (KotlinTypeKt.isError(simpleType)) {
            renderDefaultType(sb2, simpleType);
        } else if (shouldRenderAsPrettyFunctionType(simpleType)) {
            renderFunctionType(sb2, simpleType);
        } else {
            renderDefaultType(sb2, simpleType);
        }
    }

    private final void renderSpaceIfNeeded(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void renderSuperTypes(ClassDescriptor classDescriptor, StringBuilder sb2) {
        if (getWithoutSuperTypes() || KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            return;
        }
        Collection<KotlinType> collectionMo978getSupertypes = classDescriptor.getTypeConstructor().mo978getSupertypes();
        collectionMo978getSupertypes.getClass();
        if (collectionMo978getSupertypes.isEmpty()) {
            return;
        }
        if (collectionMo978getSupertypes.size() == 1 && KotlinBuiltIns.isAnyOrNullableAny(collectionMo978getSupertypes.iterator().next())) {
            return;
        }
        renderSpaceIfNeeded(sb2);
        sb2.append(": ");
        CollectionsKt.T(collectionMo978getSupertypes, sb2, ", ", null, null, new Function1<KotlinType, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderSuperTypes.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(KotlinType kotlinType) {
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                kotlinType.getClass();
                return descriptorRendererImpl.renderType(kotlinType);
            }
        }, 60);
    }

    private final void renderSuspendModifier(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        renderModifier(sb2, functionDescriptor.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeAlias(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        renderAnnotations$default(this, sb2, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        visibility.getClass();
        renderVisibility(visibility, sb2);
        renderMemberModifiers(typeAliasDescriptor, sb2);
        sb2.append(renderKeyword("typealias"));
        sb2.append(" ");
        renderName(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        renderTypeParameters(declaredTypeParameters, sb2, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void renderTypeConstructorAndArguments(StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (possiblyInnerTypeBuildPossiblyInnerType != null) {
            renderPossiblyInnerType(sb2, possiblyInnerTypeBuildPossiblyInnerType);
        } else {
            sb2.append(renderTypeConstructor(typeConstructor));
            sb2.append(renderTypeArguments(kotlinType.getArguments()));
        }
    }

    public static /* synthetic */ void renderTypeConstructorAndArguments$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(sb2, kotlinType, typeConstructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(lt());
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        renderModifier(sb2, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z12 = true;
        renderModifier(sb2, label.length() > 0, label);
        renderAnnotations$default(this, sb2, typeParameterDescriptor, null, 2, null);
        renderName(typeParameterDescriptor, sb2, z11);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z11) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb2.append(" : ");
                next.getClass();
                sb2.append(renderType(next));
            }
        } else if (z11) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    kotlinType.getClass();
                    sb2.append(renderType(kotlinType));
                    z12 = false;
                }
            }
        }
        if (z11) {
            sb2.append(gt());
        }
    }

    private final void renderTypeParameterList(StringBuilder sb2, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final void renderTypeParameters(List<? extends TypeParameterDescriptor> list, StringBuilder sb2, boolean z11) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb2.append(lt());
        renderTypeParameterList(sb2, list);
        sb2.append(gt());
        if (z11) {
            sb2.append(" ");
        }
    }

    private final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z11) {
        if (z11 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb2.append(renderKeyword(variableDescriptor.isVar() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public static /* synthetic */ void renderValVarPrefix$default(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        descriptorRendererImpl.renderValVarPrefix(variableDescriptor, sb2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.renderKeyword(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.getVerbose()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            renderAnnotations$default(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.isCrossinline()
            java.lang.String r3 = "crossinline"
            r8.renderModifier(r11, r2, r3)
            boolean r2 = r9.isNoinline()
            java.lang.String r3 = "noinline"
            r8.renderModifier(r11, r2, r3)
            boolean r2 = r8.getRenderPrimaryConstructorParametersAsProperties()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r2 = r9.getContainingDeclaration()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor
            if (r3 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.isPrimary()
            if (r2 != r7) goto L60
            r5 = r7
            goto L61
        L60:
            r5 = r6
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.getActualPropertiesInPrimaryConstructor()
            java.lang.String r3 = "actual"
            r8.renderModifier(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.renderVariable(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function1 r0 = r8.getDefaultParameterValueRenderer()
            if (r0 == 0) goto L8c
            boolean r0 = r8.getDebugMode()
            if (r0 == 0) goto L85
            boolean r0 = r9.declaresDefaultValue()
            goto L89
        L85:
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = r7
        L8c:
            if (r6 == 0) goto Lac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " = "
            r0.<init>(r2)
            kotlin.jvm.functions.Function1 r2 = r8.getDefaultParameterValueRenderer()
            r2.getClass()
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final void renderValueParameters(Collection<? extends ValueParameterDescriptor> collection, boolean z11, StringBuilder sb2) {
        boolean zShouldRenderParameterNames = shouldRenderParameterNames(z11);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb2);
        int i11 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i11, size, sb2);
            renderValueParameter(valueParameterDescriptor, zShouldRenderParameterNames, sb2, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i11, size, sb2);
            i11++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb2);
    }

    private final void renderVariable(VariableDescriptor variableDescriptor, boolean z11, StringBuilder sb2, boolean z12, boolean z13) {
        KotlinType type = variableDescriptor.getType();
        type.getClass();
        ValueParameterDescriptor valueParameterDescriptor = variableDescriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) variableDescriptor : null;
        KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        KotlinType kotlinType = varargElementType == null ? type : varargElementType;
        renderModifier(sb2, varargElementType != null, "vararg");
        if (z13 || (z12 && !getStartFromName())) {
            renderValVarPrefix(variableDescriptor, sb2, z13);
        }
        if (z11) {
            renderName(variableDescriptor, sb2, z12);
            sb2.append(": ");
        }
        sb2.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, sb2);
        if (!getVerbose() || varargElementType == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(renderType(type));
        sb2.append("*/");
    }

    private final boolean renderVisibility(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb2.append(renderKeyword(descriptorVisibility.getInternalDisplayName()));
        sb2.append(" ");
        return true;
    }

    private final void renderWhereSuffix(List<? extends TypeParameterDescriptor> list, StringBuilder sb2) {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            for (KotlinType kotlinType : CollectionsKt.J(1, upperBounds)) {
                StringBuilder sb3 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                name.getClass();
                sb3.append(renderName(name, false));
                sb3.append(" : ");
                kotlinType.getClass();
                sb3.append(renderType(kotlinType));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(renderKeyword("where"));
        sb2.append(" ");
        CollectionsKt.T(arrayList, sb2, ", ", null, null, null, 124);
    }

    private final boolean shouldRenderAsPrettyFunctionType(KotlinType kotlinType) {
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if (arguments != null && arguments.isEmpty()) {
            return true;
        }
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).isStarProjection()) {
                return false;
            }
        }
        return true;
    }

    private final boolean shouldRenderParameterNames(boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return !z11;
        }
        if (i11 == 3) {
            return false;
        }
        a.f();
        return false;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.options.getInformativeErrorType();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb2);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb2, declarationDescriptor);
        }
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) {
        annotationDescriptor.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        KotlinType type = annotationDescriptor.getType();
        sb2.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> listRenderAndSortAnnotationArguments = renderAndSortAnnotationArguments(annotationDescriptor);
            if (getIncludeEmptyAnnotationArguments() || !listRenderAndSortAnnotationArguments.isEmpty()) {
                CollectionsKt.T(listRenderAndSortAnnotationArguments, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo977getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return ErrorUtils.isError(classifierDescriptor) ? classifierDescriptor.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFlexibleType(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        str.getClass();
        str2.getClass();
        kotlinBuiltIns.getClass();
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(str, str2)) {
            return y.p(str2, "(", false) ? a0.p("(", str, ")!") : str.concat("!");
        }
        ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        ClassDescriptor collection = kotlinBuiltIns.getCollection();
        collection.getClass();
        String strZ = StringsKt.Z(classifierNamePolicy.renderClassifier(collection, this), "Collection");
        String strReplacePrefixesInTypeRepresentations = RenderingUtilsKt.replacePrefixesInTypeRepresentations(str, strZ.concat("Mutable"), str2, strZ, strZ.concat("(Mutable)"));
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strReplacePrefixesInTypeRepresentations2 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(str, strZ.concat("MutableMap.MutableEntry"), str2, strZ.concat("Map.Entry"), strZ.concat("(Mutable)Map.(Mutable)Entry"));
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        ClassDescriptor array = kotlinBuiltIns.getArray();
        array.getClass();
        String strZ2 = StringsKt.Z(classifierNamePolicy2.renderClassifier(array, this), "Array");
        StringBuilder sbO = i.o(strZ2);
        sbO.append(escape("Array<"));
        String string = sbO.toString();
        StringBuilder sbO2 = i.o(strZ2);
        sbO2.append(escape("Array<out "));
        String string2 = sbO2.toString();
        StringBuilder sbO3 = i.o(strZ2);
        sbO3.append(escape("Array<(out) "));
        String strReplacePrefixesInTypeRepresentations3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(str, string, str2, string2, sbO3.toString());
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        List<Name> listPathSegments = fqNameUnsafe.pathSegments();
        listPathSegments.getClass();
        return renderFqName(listPathSegments);
    }

    @NotNull
    public String renderMessage(@NotNull String str) {
        str.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i11 == 1) {
            return str;
        }
        if (i11 == 2) {
            return a0.p("<i>", str, "</i>");
        }
        a.f();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderName(@NotNull Name name, boolean z11) {
        name.getClass();
        String strEscape = escape(RenderingUtilsKt.render(name));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == RenderingFormat.HTML && z11) ? a0.p("<b>", strEscape, "</b>") : strEscape;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        StringBuilder sb2 = new StringBuilder();
        renderNormalizedType(sb2, (KotlinType) getTypeNormalizer().invoke(kotlinType));
        return sb2.toString();
    }

    @NotNull
    public String renderTypeArguments(@NotNull List<? extends TypeProjection> list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lt());
        appendTypeProjections(sb2, list);
        sb2.append(gt());
        return sb2.toString();
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = typeConstructor.mo977getDeclarationDescriptor();
        if (classifierDescriptorMo977getDeclarationDescriptor instanceof TypeParameterDescriptor ? true : classifierDescriptorMo977getDeclarationDescriptor instanceof ClassDescriptor ? true : classifierDescriptorMo977getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            return renderClassifierName(classifierDescriptorMo977getDeclarationDescriptor);
        }
        if (classifierDescriptorMo977getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(new Function1<KotlinType, Object>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderTypeConstructor.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Object invoke(@NotNull KotlinType kotlinType) {
                    kotlinType.getClass();
                    return kotlinType instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable() : kotlinType;
                }
            }) : typeConstructor.toString();
        }
        o.h(classifierDescriptorMo977getDeclarationDescriptor.getClass(), "Unexpected classifier: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection) {
        typeProjection.getClass();
        StringBuilder sb2 = new StringBuilder();
        appendTypeProjections(sb2, c0.c(typeProjection));
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z11) {
        this.options.setDebugMode(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        set.getClass();
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.options.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z11) {
        this.options.setReceiverAfterName(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z11) {
        this.options.setRenderCompanionObjectName(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z11) {
        this.options.setStartFromName(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.options.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z11) {
        this.options.setVerbose(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z11) {
        this.options.setWithDefinedIn(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z11) {
        this.options.setWithoutSuperTypes(z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z11) {
        this.options.setWithoutTypeParameters(z11);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void visitPropertyAccessorDescriptor(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                visitFunctionDescriptor2((FunctionDescriptor) propertyAccessorDescriptor, sb2);
                return;
            }
            DescriptorRendererImpl.this.renderAccessorModifiers(propertyAccessorDescriptor, sb2);
            sb2.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            correspondingProperty.getClass();
            descriptorRendererImpl.renderProperty(correspondingProperty, sb2);
        }

        /* JADX INFO: renamed from: visitClassDescriptor, reason: avoid collision after fix types in other method */
        public void visitClassDescriptor2(@NotNull ClassDescriptor classDescriptor, @NotNull StringBuilder sb2) {
            classDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderClass(classDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitConstructorDescriptor, reason: avoid collision after fix types in other method */
        public void visitConstructorDescriptor2(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder sb2) {
            constructorDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitFunctionDescriptor, reason: avoid collision after fix types in other method */
        public void visitFunctionDescriptor2(@NotNull FunctionDescriptor functionDescriptor, @NotNull StringBuilder sb2) {
            functionDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderFunction(functionDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitModuleDeclaration, reason: avoid collision after fix types in other method */
        public void visitModuleDeclaration2(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StringBuilder sb2) {
            moduleDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderName(moduleDescriptor, sb2, true);
        }

        /* JADX INFO: renamed from: visitPackageFragmentDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageFragmentDescriptor2(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull StringBuilder sb2) {
            packageFragmentDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderPackageFragment(packageFragmentDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitPackageViewDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageViewDescriptor2(@NotNull PackageViewDescriptor packageViewDescriptor, @NotNull StringBuilder sb2) {
            packageViewDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderPackageView(packageViewDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitPropertyDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyDescriptor2(@NotNull PropertyDescriptor propertyDescriptor, @NotNull StringBuilder sb2) {
            propertyDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderProperty(propertyDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitPropertyGetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyGetterDescriptor2(@NotNull PropertyGetterDescriptor propertyGetterDescriptor, @NotNull StringBuilder sb2) {
            propertyGetterDescriptor.getClass();
            sb2.getClass();
            visitPropertyAccessorDescriptor(propertyGetterDescriptor, sb2, "getter");
        }

        /* JADX INFO: renamed from: visitPropertySetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertySetterDescriptor2(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull StringBuilder sb2) {
            propertySetterDescriptor.getClass();
            sb2.getClass();
            visitPropertyAccessorDescriptor(propertySetterDescriptor, sb2, "setter");
        }

        /* JADX INFO: renamed from: visitReceiverParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitReceiverParameterDescriptor2(@NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @NotNull StringBuilder sb2) {
            receiverParameterDescriptor.getClass();
            sb2.getClass();
            sb2.append(receiverParameterDescriptor.getName());
        }

        /* JADX INFO: renamed from: visitTypeAliasDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeAliasDescriptor2(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull StringBuilder sb2) {
            typeAliasDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderTypeAlias(typeAliasDescriptor, sb2);
        }

        /* JADX INFO: renamed from: visitTypeParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeParameterDescriptor2(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull StringBuilder sb2) {
            typeParameterDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderTypeParameter(typeParameterDescriptor, sb2, true);
        }

        /* JADX INFO: renamed from: visitValueParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitValueParameterDescriptor2(@NotNull ValueParameterDescriptor valueParameterDescriptor, @NotNull StringBuilder sb2) {
            valueParameterDescriptor.getClass();
            sb2.getClass();
            DescriptorRendererImpl.this.renderValueParameter(valueParameterDescriptor, true, sb2, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb2) {
            visitClassDescriptor2(classDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) {
            visitConstructorDescriptor2(constructorDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
            visitFunctionDescriptor2(functionDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
            visitPackageFragmentDescriptor2(packageFragmentDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
            visitPackageViewDescriptor2(packageViewDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
            visitPropertyDescriptor2(propertyDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb2) {
            visitPropertyGetterDescriptor2(propertyGetterDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb2) {
            visitPropertySetterDescriptor2(propertySetterDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
            visitTypeAliasDescriptor2(typeAliasDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb2) {
            visitModuleDeclaration2(moduleDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2) {
            visitTypeParameterDescriptor2(typeParameterDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb2) {
            visitValueParameterDescriptor2(valueParameterDescriptor, sb2);
            return Unit.f26487a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb2) {
            visitReceiverParameterDescriptor2(receiverParameterDescriptor, sb2);
            return Unit.f26487a;
        }
    }

    private final String renderFqName(List<Name> list) {
        return escape(RenderingUtilsKt.renderFqName(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z11) {
        Name name = declarationDescriptor.getName();
        name.getClass();
        sb2.append(renderName(name, z11));
    }
}
