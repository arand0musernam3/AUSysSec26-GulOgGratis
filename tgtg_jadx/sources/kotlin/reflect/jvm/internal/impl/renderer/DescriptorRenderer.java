package kotlin.reflect.jvm.internal.impl.renderer;

import com.braze.h2;
import e40.a;
import j4.d;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DescriptorRenderer {

    @NotNull
    public static final DescriptorRenderer COMPACT;

    @NotNull
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;

    @NotNull
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS;

    @NotNull
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES;

    @NotNull
    public static final Companion Companion;

    @NotNull
    public static final DescriptorRenderer DEBUG_TEXT;

    @NotNull
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES;

    @NotNull
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;

    @NotNull
    public static final DescriptorRenderer HTML;

    @NotNull
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;

    @NotNull
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface ValueParametersHandler {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        public static final class DEFAULT implements ValueParametersHandler {

            @NotNull
            public static final DEFAULT INSTANCE = new DEFAULT();

            private DEFAULT() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i11, int i12, @NotNull StringBuilder sb2) {
                valueParameterDescriptor.getClass();
                sb2.getClass();
                if (i11 != i12 - 1) {
                    sb2.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameters(int i11, @NotNull StringBuilder sb2) {
                sb2.getClass();
                sb2.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i11, int i12, @NotNull StringBuilder sb2) {
                valueParameterDescriptor.getClass();
                sb2.getClass();
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameters(int i11, @NotNull StringBuilder sb2) {
                sb2.getClass();
                sb2.append("(");
            }
        }

        void appendAfterValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i11, int i12, @NotNull StringBuilder sb2);

        void appendAfterValueParameters(int i11, @NotNull StringBuilder sb2);

        void appendBeforeValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor, int i11, int i12, @NotNull StringBuilder sb2);

        void appendBeforeValueParameters(int i11, @NotNull StringBuilder sb2);
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        COMPACT_WITH_MODIFIERS = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }

            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setWithDefinedIn(false);
            }
        });
        COMPACT = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setWithDefinedIn(false);
                descriptorRendererOptions.setModifiers(p0.f26531a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        COMPACT_WITHOUT_SUPERTYPES = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setWithDefinedIn(false);
                descriptorRendererOptions.setModifiers(p0.f26531a);
                descriptorRendererOptions.setWithoutSuperTypes(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        COMPACT_WITH_SHORT_TYPES = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setModifiers(p0.f26531a);
                descriptorRendererOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                descriptorRendererOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        ONLY_NAMES_WITH_SHORT_TYPES = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setWithDefinedIn(false);
                descriptorRendererOptions.setModifiers(p0.f26531a);
                descriptorRendererOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                descriptorRendererOptions.setWithoutTypeParameters(true);
                descriptorRendererOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
                descriptorRendererOptions.setReceiverAfterName(true);
                descriptorRendererOptions.setRenderCompanionObjectName(true);
                descriptorRendererOptions.setWithoutSuperTypes(true);
                descriptorRendererOptions.setStartFromName(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        FQ_NAMES_IN_TYPES = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        SHORT_NAMES_IN_TYPES = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                descriptorRendererOptions.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        DEBUG_TEXT = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$DEBUG_TEXT$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setDebugMode(true);
                descriptorRendererOptions.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
                descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
        HTML = companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$HTML$1
            public final void invoke(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.getClass();
                descriptorRendererOptions.setTextFormat(RenderingFormat.HTML);
                descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DescriptorRendererOptions) obj);
                return Unit.f26487a;
            }
        });
    }

    public static /* synthetic */ String renderAnnotation$default(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i11, Object obj) {
        if (obj != null) {
            h2.a("Super calls with default arguments not supported in this target, function: renderAnnotation");
            return null;
        }
        if ((i11 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }

    @NotNull
    public abstract String render(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public abstract String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    public abstract String renderFlexibleType(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns);

    @NotNull
    public abstract String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe);

    @NotNull
    public abstract String renderName(@NotNull Name name, boolean z11);

    @NotNull
    public abstract String renderType(@NotNull KotlinType kotlinType);

    @NotNull
    public abstract String renderTypeProjection(@NotNull TypeProjection typeProjection);

    @NotNull
    public final DescriptorRenderer withOptions(@NotNull Function1<? super DescriptorRendererOptions, Unit> function1) {
        function1.getClass();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplCopy = ((DescriptorRendererImpl) this).getOptions().copy();
        function1.invoke(descriptorRendererOptionsImplCopy);
        descriptorRendererOptionsImplCopy.lock();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplCopy);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getClassifierKindPrefix(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
            classifierDescriptorWithTypeParameters.getClass();
            if (classifierDescriptorWithTypeParameters instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifierDescriptorWithTypeParameters instanceof ClassDescriptor)) {
                d.s(classifierDescriptorWithTypeParameters, "Unexpected classifier: ");
                return null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorWithTypeParameters;
            if (classDescriptor.isCompanionObject()) {
                return "companion object";
            }
            switch (WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    a.f();
                    return null;
            }
        }

        @NotNull
        public final DescriptorRenderer withOptions(@NotNull Function1<? super DescriptorRendererOptions, Unit> function1) {
            function1.getClass();
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            function1.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        private Companion() {
        }
    }
}
