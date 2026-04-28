package kotlin.reflect.jvm.internal.impl.types.checker;

import com.braze.h2;
import e40.a;
import j4.s;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RawTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    SimpleTypeMarker asSimpleType(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    KotlinTypeMarker createFlexibleType(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker withNullability(@NotNull SimpleTypeMarker simpleTypeMarker, boolean z11);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @SourceDebugExtension({"SMAP\nClassicTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 6 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n1#1,951:1\n1#2:952\n945#3:953\n945#3:954\n945#3:955\n945#3:956\n945#3:957\n945#3:958\n945#3:959\n945#3:960\n945#3:961\n945#3:962\n945#3:963\n945#3:964\n945#3:965\n945#3:966\n945#3:967\n945#3:968\n945#3:969\n945#3:970\n945#3:971\n945#3:972\n945#3:973\n945#3:974\n945#3:975\n945#3:976\n945#3:977\n945#3:978\n945#3:979\n945#3:980\n945#3:981\n945#3:982\n945#3:983\n945#3:984\n945#3:985\n945#3:986\n945#3:987\n945#3:988\n945#3:989\n945#3:990\n945#3:991\n945#3:992\n945#3:993\n945#3:994\n945#3:995\n945#3:996\n945#3:997\n945#3:998\n945#3:999\n945#3:1000\n945#3:1001\n945#3:1002\n945#3:1003\n945#3:1004\n945#3:1005\n945#3:1006\n945#3:1007\n945#3:1008\n945#3:1009\n945#3:1010\n945#3:1011\n945#3:1012\n945#3:1013\n945#3:1014\n945#3:1015\n945#3:1016\n945#3:1017\n945#3:1018\n945#3:1019\n945#3:1020\n945#3:1021\n945#3:1022\n945#3:1023\n945#3:1024\n945#3:1025\n945#3:1029\n945#3:1030\n945#3:1031\n945#3:1032\n945#3:1033\n945#3:1034\n945#3:1035\n945#3:1036\n945#3:1042\n945#3:1043\n945#3:1044\n945#3:1045\n945#3:1046\n945#3:1047\n945#3:1054\n945#3:1055\n945#3:1056\n945#3:1071\n945#3:1072\n945#3:1073\n945#3:1074\n945#3:1075\n945#3:1076\n945#3:1090\n945#3:1091\n945#3:1092\n945#3:1093\n945#3:1094\n945#3:1095\n945#3:1096\n945#3:1097\n945#3:1098\n945#3:1099\n945#3:1100\n945#3:1101\n945#3:1102\n945#3:1103\n945#3:1104\n945#3:1105\n945#3:1106\n945#3:1107\n945#3:1108\n945#3:1109\n945#3:1110\n945#3:1111\n945#3:1112\n945#3:1113\n945#3:1114\n945#3:1115\n945#3:1116\n819#4:1026\n847#4,2:1027\n766#4:1039\n857#4,2:1040\n1549#4:1050\n1620#4,3:1051\n1549#4:1057\n1620#4,3:1058\n2661#4,7:1061\n819#4:1068\n847#4,2:1069\n819#4:1077\n847#4,2:1078\n1549#4:1080\n1620#4,3:1081\n1271#4,2:1084\n1285#4,4:1086\n20#5,2:1037\n280#6,2:1048\n*S KotlinDebug\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n*L\n40#1:953\n45#1:954\n58#1:955\n63#1:956\n69#1:957\n75#1:958\n80#1:959\n85#1:960\n90#1:961\n95#1:962\n100#1:963\n105#1:964\n110#1:965\n119#1:966\n125#1:967\n130#1:968\n135#1:969\n136#1:970\n141#1:971\n146#1:972\n151#1:973\n156#1:974\n161#1:975\n166#1:976\n171#1:977\n176#1:978\n184#1:979\n189#1:980\n194#1:981\n199#1:982\n204#1:983\n209#1:984\n214#1:985\n219#1:986\n224#1:987\n229#1:988\n230#1:989\n235#1:990\n241#1:991\n246#1:992\n251#1:993\n256#1:994\n261#1:995\n266#1:996\n271#1:997\n276#1:998\n281#1:999\n286#1:1000\n287#1:1001\n293#1:1002\n294#1:1003\n299#1:1004\n304#1:1005\n309#1:1006\n315#1:1007\n323#1:1008\n329#1:1009\n334#1:1010\n339#1:1011\n344#1:1012\n349#1:1013\n354#1:1014\n368#1:1015\n378#1:1016\n383#1:1017\n409#1:1018\n414#1:1019\n419#1:1020\n420#1:1021\n460#1:1022\n466#1:1023\n471#1:1024\n476#1:1025\n482#1:1029\n487#1:1030\n504#1:1031\n510#1:1032\n515#1:1033\n520#1:1034\n527#1:1035\n538#1:1036\n561#1:1042\n566#1:1043\n571#1:1044\n578#1:1045\n583#1:1046\n589#1:1047\n595#1:1054\n617#1:1055\n618#1:1056\n674#1:1071\n679#1:1072\n684#1:1073\n689#1:1074\n694#1:1075\n699#1:1076\n737#1:1090\n742#1:1091\n747#1:1092\n752#1:1093\n757#1:1094\n762#1:1095\n767#1:1096\n772#1:1097\n777#1:1098\n782#1:1099\n787#1:1100\n792#1:1101\n797#1:1102\n802#1:1103\n807#1:1104\n812#1:1105\n817#1:1106\n822#1:1107\n827#1:1108\n836#1:1109\n837#1:1110\n848#1:1111\n853#1:1112\n858#1:1113\n863#1:1114\n881#1:1115\n888#1:1116\n477#1:1026\n477#1:1027,2\n546#1:1039\n546#1:1040,2\n591#1:1050\n591#1:1051,3\n660#1:1057\n660#1:1058,3\n660#1:1061,7\n666#1:1068\n666#1:1069,2\n700#1:1077\n700#1:1078,2\n725#1:1080\n725#1:1081,3\n726#1:1084,2\n726#1:1086,4\n540#1:1037,2\n591#1:1048,2\n*E\n"})
    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
            typeConstructorMarker.getClass();
            typeConstructorMarker2.getClass();
            if (!(typeConstructorMarker instanceof TypeConstructor)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(typeConstructorMarker);
                a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
                return false;
            }
            if (typeConstructorMarker2 instanceof TypeConstructor) {
                return Intrinsics.areEqual(typeConstructorMarker, typeConstructorMarker2);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(typeConstructorMarker2);
            a.m(sb3, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker2.getClass()));
            return false;
        }

        public static int argumentsCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().size();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return 0;
        }

        @NotNull
        public static TypeArgumentListMarker asArgumentList(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return (TypeArgumentListMarker) simpleTypeMarker;
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return null;
        }

        @Nullable
        public static CapturedTypeMarker asCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
                return null;
            }
            if (simpleTypeMarker instanceof SimpleTypeWithEnhancement) {
                return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
            }
            if (simpleTypeMarker instanceof NewCapturedType) {
                return (NewCapturedType) simpleTypeMarker;
            }
            return null;
        }

        @Nullable
        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
                return null;
            }
            if (simpleTypeMarker instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) simpleTypeMarker;
            }
            return null;
        }

        @Nullable
        public static DynamicTypeMarker asDynamicType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof DynamicType) {
                    return (DynamicType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(flexibleTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            return null;
        }

        @Nullable
        public static FlexibleTypeMarker asFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) kotlinTypeMarker).unwrap();
                if (unwrappedTypeUnwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @Nullable
        public static RawTypeMarker asRawType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof RawType) {
                    return (RawType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(flexibleTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            return null;
        }

        @Nullable
        public static SimpleTypeMarker asSimpleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) kotlinTypeMarker).unwrap();
                if (unwrappedTypeUnwrap instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static TypeArgumentMarker asTypeArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @Nullable
        public static SimpleTypeMarker captureFromArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull CaptureStatus captureStatus) {
            simpleTypeMarker.getClass();
            captureStatus.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) simpleTypeMarker, captureStatus);
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static CaptureStatus captureStatus(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getCaptureStatus();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(capturedTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker createFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
            simpleTypeMarker.getClass();
            simpleTypeMarker2.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(classicTypeSystemContext);
                a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass()));
                return null;
            }
            if (simpleTypeMarker2 instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) simpleTypeMarker, (SimpleType) simpleTypeMarker2);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(classicTypeSystemContext);
            a.m(sb3, ", ", Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass()));
            return null;
        }

        @NotNull
        public static TypeArgumentMarker getArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, int i11) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().get(i11);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static List<TypeArgumentMarker> getArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static FqNameUnsafe getClassFqNameUnsafe(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                classifierDescriptorMo977getDeclarationDescriptor.getClass();
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        public static TypeParameterMarker getParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker, int i11) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) typeConstructorMarker).getParameters().get(i11);
                typeParameterDescriptor.getClass();
                return typeParameterDescriptor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        public static List<TypeParameterMarker> getParameters(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                parameters.getClass();
                return parameters;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @Nullable
        public static PrimitiveType getPrimitiveArrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                classifierDescriptorMo977getDeclarationDescriptor.getClass();
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @Nullable
        public static PrimitiveType getPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                classifierDescriptorMo977getDeclarationDescriptor.getClass();
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker getRepresentativeUpperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) typeParameterMarker);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker getType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).getType().unwrap();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeArgumentMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeArgumentMarker.getClass()));
            return null;
        }

        @Nullable
        public static TypeParameterMarker getTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            typeVariableTypeConstructorMarker.getClass();
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).getOriginalTypeParameter();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeVariableTypeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeVariableTypeConstructorMarker.getClass()));
            return null;
        }

        @Nullable
        public static TypeParameterMarker getTypeParameterClassifier(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                if (classifierDescriptorMo977getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo977getDeclarationDescriptor;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @Nullable
        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static List<KotlinTypeMarker> getUpperBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) typeParameterMarker).getUpperBounds();
                upperBounds.getClass();
                return upperBounds;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) typeArgumentMarker).getProjectionKind();
                projectionKind.getClass();
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeArgumentMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeArgumentMarker.getClass()));
            return null;
        }

        public static boolean hasAnnotation(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
            kotlinTypeMarker.getClass();
            fqName.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getAnnotations().hasAnnotation(fqName);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return false;
        }

        public static boolean hasRecursiveBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
            typeParameterMarker.getClass();
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(typeParameterMarker);
                a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
                return false;
            }
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default((TypeParameterDescriptor) typeParameterMarker, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(typeParameterMarker);
            a.m(sb3, ", ", Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            return false;
        }

        public static boolean identicalArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
            simpleTypeMarker.getClass();
            simpleTypeMarker2.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
                return false;
            }
            if (simpleTypeMarker2 instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).getArguments() == ((SimpleType) simpleTypeMarker2).getArguments();
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker2, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker2.getClass()));
            return false;
        }

        @NotNull
        public static KotlinTypeMarker intersectTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull List<? extends KotlinTypeMarker> list) {
            list.getClass();
            return IntersectionTypeKt.intersectTypes(list);
        }

        public static boolean isAnyConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.any);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isClassTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isCommonFinalClassConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo977getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isDenotable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).isDenotable();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isError(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return false;
        }

        public static boolean isInlineClass(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo977getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isIntegerLiteralTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isIntersection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isMarkedNullable(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).isMarkedNullable();
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return false;
        }

        public static boolean isNotNullTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return kotlinTypeMarker instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.nothing);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        public static boolean isNullableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return false;
        }

        public static boolean isOldCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            return capturedTypeMarker instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) simpleTypeMarker);
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return false;
        }

        public static boolean isProjectionNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).isProjectionNotNull();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(capturedTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (!(simpleTypeMarker instanceof SimpleType)) {
                y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
                return false;
            }
            if (KotlinTypeKt.isError((KotlinType) simpleTypeMarker)) {
                return false;
            }
            SimpleType simpleType = (SimpleType) simpleTypeMarker;
            if (simpleType.getConstructor().mo977getDeclarationDescriptor() instanceof TypeAliasDescriptor) {
                return false;
            }
            return simpleType.getConstructor().mo977getDeclarationDescriptor() != null || (simpleTypeMarker instanceof CapturedType) || (simpleTypeMarker instanceof NewCapturedType) || (simpleTypeMarker instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor) || isSingleClassifierTypeWithEnhancement(classicTypeSystemContext, simpleTypeMarker);
        }

        private static boolean isSingleClassifierTypeWithEnhancement(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
        }

        public static boolean isStarProjection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).isStarProjection();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeArgumentMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeArgumentMarker.getClass()));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) simpleTypeMarker);
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) simpleTypeMarker);
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return false;
        }

        public static boolean isTypeVariableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof UnwrappedType) && (((UnwrappedType) kotlinTypeMarker).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo977getDeclarationDescriptor();
                return classifierDescriptorMo977getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(classifierDescriptorMo977getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return false;
        }

        @NotNull
        public static SimpleTypeMarker lowerBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getLowerBound();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(flexibleTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            return null;
        }

        @Nullable
        public static KotlinTypeMarker lowerType(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getLowerType();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(capturedTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof UnwrappedType) {
                return ClassicTypeSystemContextKt.makeDefinitelyNotNullOrNotNullInternal((UnwrappedType) kotlinTypeMarker);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static TypeCheckerState newTypeCheckerState(@NotNull ClassicTypeSystemContext classicTypeSystemContext, boolean z11, boolean z12) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z11, z12, classicTypeSystemContext, null, null, 24, null);
        }

        @NotNull
        public static SimpleTypeMarker original(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            definitelyNotNullTypeMarker.getClass();
            if (definitelyNotNullTypeMarker instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) definitelyNotNullTypeMarker).getOriginal();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(definitelyNotNullTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(definitelyNotNullTypeMarker.getClass()));
            return null;
        }

        public static int parametersCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return 0;
        }

        @NotNull
        public static Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = classicTypeSystemContext.typeConstructor(simpleTypeMarker);
            if (typeConstructorMarkerTypeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerTypeConstructor).getPossibleTypes();
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static TypeArgumentMarker projection(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
            capturedTypeConstructorMarker.getClass();
            if (capturedTypeConstructorMarker instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) capturedTypeConstructorMarker).getProjection();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(capturedTypeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(capturedTypeConstructorMarker.getClass()));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) simpleTypeMarker).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    @NotNull
                    /* JADX INFO: renamed from: transformType */
                    public SimpleTypeMarker mo981transformType(@NotNull TypeCheckerState typeCheckerState, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                        typeCheckerState.getClass();
                        kotlinTypeMarker.getClass();
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        TypeSubstitutor typeSubstitutor = typeSubstitutorBuildSubstitutor;
                        Object objLowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(kotlinTypeMarker);
                        objLowerBoundIfFlexible.getClass();
                        KotlinType kotlinTypeSafeSubstitute = typeSubstitutor.safeSubstitute((KotlinType) objLowerBoundIfFlexible, Variance.INVARIANT);
                        kotlinTypeSafeSubstitute.getClass();
                        SimpleTypeMarker simpleTypeMarkerAsSimpleType = classicTypeSystemContext2.asSimpleType(kotlinTypeSafeSubstitute);
                        simpleTypeMarkerAsSimpleType.getClass();
                        return simpleTypeMarkerAsSimpleType;
                    }
                };
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static Collection<KotlinTypeMarker> supertypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                Collection<KotlinType> collectionMo978getSupertypes = ((TypeConstructor) typeConstructorMarker).mo978getSupertypes();
                collectionMo978getSupertypes.getClass();
                return collectionMo978getSupertypes;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            return null;
        }

        @NotNull
        public static CapturedTypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getConstructor();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(capturedTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static SimpleTypeMarker upperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getUpperBound();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(flexibleTypeMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static KotlinTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull KotlinTypeMarker kotlinTypeMarker, boolean z11) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof SimpleTypeMarker) {
                return classicTypeSystemContext.withNullability((SimpleTypeMarker) kotlinTypeMarker, z11);
            }
            if (kotlinTypeMarker instanceof FlexibleTypeMarker) {
                FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
                return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability(classicTypeSystemContext.lowerBound(flexibleTypeMarker), z11), classicTypeSystemContext.withNullability(classicTypeSystemContext.upperBound(flexibleTypeMarker), z11));
            }
            h2.b("sealed");
            return null;
        }

        @NotNull
        public static TypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).getConstructor();
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return null;
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) typeParameterMarker).getVariance();
                variance.getClass();
                return TypeSystemContextKt.convertVariance(variance);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterMarker);
            a.m(sb2, ", ", Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            return null;
        }

        @NotNull
        public static SimpleTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker, boolean z11) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                return ((SimpleType) simpleTypeMarker).makeNullableAsSpecified(z11);
            }
            y.k(s.q("ClassicTypeSystemContext couldn't handle: ", simpleTypeMarker, ", "), Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            return null;
        }
    }
}
