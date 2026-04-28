package kotlin.reflect.jvm.internal.impl.builtins;

import j4.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d0;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class StandardNames {

    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name BACKING_FIELD;

    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;

    @NotNull
    public static final Name CHAR_CODE;

    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;

    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;

    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;

    @NotNull
    public static final Name DATA_CLASS_COPY;

    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;

    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;

    @NotNull
    public static final Name ENUM_ENTRIES;

    @NotNull
    public static final Name ENUM_VALUES;

    @NotNull
    public static final Name ENUM_VALUE_OF;

    @NotNull
    public static final Name HASHCODE_NAME;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;

    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @NotNull
    public static final Name NEXT_CHAR;

    @NotNull
    private static final FqName NON_EXISTENT_CLASS;

    @NotNull
    public static final List<String> PREFIXES;

    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName RESULT_FQ_NAME;

    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @SourceDebugExtension({"SMAP\nStandardNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,295:1\n11670#2,3:296\n11670#2,3:299\n*S KotlinDebug\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n*L\n191#1:296,3\n195#1:299,3\n*E\n"})
    public static final class FqNames {

        @NotNull
        public static final FqNames INSTANCE;

        @NotNull
        public static final FqNameUnsafe _boolean;

        @NotNull
        public static final FqNameUnsafe _byte;

        @NotNull
        public static final FqNameUnsafe _char;

        @NotNull
        public static final FqNameUnsafe _double;

        @NotNull
        public static final FqNameUnsafe _enum;

        @NotNull
        public static final FqNameUnsafe _float;

        @NotNull
        public static final FqNameUnsafe _int;

        @NotNull
        public static final FqNameUnsafe _long;

        @NotNull
        public static final FqNameUnsafe _short;

        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;

        @NotNull
        public static final FqName annotation;

        @NotNull
        public static final FqName annotationRetention;

        @NotNull
        public static final FqName annotationTarget;

        @NotNull
        public static final FqNameUnsafe any;

        @NotNull
        public static final FqNameUnsafe array;

        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @NotNull
        public static final FqNameUnsafe charSequence;

        @NotNull
        public static final FqNameUnsafe cloneable;

        @NotNull
        public static final FqName collection;

        @NotNull
        public static final FqName comparable;

        @NotNull
        public static final FqName contextFunctionTypeParams;

        @NotNull
        public static final FqName deprecated;

        @NotNull
        public static final FqName deprecatedSinceKotlin;

        @NotNull
        public static final FqName deprecationLevel;

        @NotNull
        public static final FqName extensionFunctionType;

        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @NotNull
        public static final FqNameUnsafe functionSupertype;

        @NotNull
        public static final FqNameUnsafe intRange;

        @NotNull
        public static final FqName iterable;

        @NotNull
        public static final FqName iterator;

        @NotNull
        public static final FqNameUnsafe kCallable;

        @NotNull
        public static final FqNameUnsafe kClass;

        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;

        @NotNull
        public static final FqNameUnsafe kMutableProperty0;

        @NotNull
        public static final FqNameUnsafe kMutableProperty1;

        @NotNull
        public static final FqNameUnsafe kMutableProperty2;

        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;

        @NotNull
        public static final ClassId kProperty;

        @NotNull
        public static final FqNameUnsafe kProperty0;

        @NotNull
        public static final FqNameUnsafe kProperty1;

        @NotNull
        public static final FqNameUnsafe kProperty2;

        @NotNull
        public static final FqNameUnsafe kPropertyFqName;

        @NotNull
        public static final FqName list;

        @NotNull
        public static final FqName listIterator;

        @NotNull
        public static final FqNameUnsafe longRange;

        @NotNull
        public static final FqName map;

        @NotNull
        public static final FqName mapEntry;

        @NotNull
        public static final FqName mustBeDocumented;

        @NotNull
        public static final FqName mutableCollection;

        @NotNull
        public static final FqName mutableIterable;

        @NotNull
        public static final FqName mutableIterator;

        @NotNull
        public static final FqName mutableList;

        @NotNull
        public static final FqName mutableListIterator;

        @NotNull
        public static final FqName mutableMap;

        @NotNull
        public static final FqName mutableMapEntry;

        @NotNull
        public static final FqName mutableSet;

        @NotNull
        public static final FqNameUnsafe nothing;

        @NotNull
        public static final FqNameUnsafe number;

        @NotNull
        public static final FqName parameterName;

        @NotNull
        public static final ClassId parameterNameClassId;

        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;

        @NotNull
        public static final Set<Name> primitiveTypeShortNames;

        @NotNull
        public static final FqName publishedApi;

        @NotNull
        public static final FqName repeatable;

        @NotNull
        public static final ClassId repeatableClassId;

        @NotNull
        public static final FqName replaceWith;

        @NotNull
        public static final FqName retention;

        @NotNull
        public static final ClassId retentionClassId;

        @NotNull
        public static final FqName set;

        @NotNull
        public static final FqNameUnsafe string;

        @NotNull
        public static final FqName suppress;

        @NotNull
        public static final FqName target;

        @NotNull
        public static final ClassId targetClassId;

        @NotNull
        public static final FqName throwable;

        @NotNull
        public static final ClassId uByte;

        @NotNull
        public static final FqName uByteArrayFqName;

        @NotNull
        public static final FqName uByteFqName;

        @NotNull
        public static final ClassId uInt;

        @NotNull
        public static final FqName uIntArrayFqName;

        @NotNull
        public static final FqName uIntFqName;

        @NotNull
        public static final ClassId uLong;

        @NotNull
        public static final FqName uLongArrayFqName;

        @NotNull
        public static final FqName uLongFqName;

        @NotNull
        public static final ClassId uShort;

        @NotNull
        public static final FqName uShortArrayFqName;

        @NotNull
        public static final FqName uShortFqName;

        @NotNull
        public static final FqNameUnsafe unit;

        @NotNull
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe("Any");
            nothing = fqNames.fqNameUnsafe("Nothing");
            cloneable = fqNames.fqNameUnsafe("Cloneable");
            suppress = fqNames.fqName("Suppress");
            unit = fqNames.fqNameUnsafe("Unit");
            charSequence = fqNames.fqNameUnsafe("CharSequence");
            string = fqNames.fqNameUnsafe("String");
            array = fqNames.fqNameUnsafe("Array");
            _boolean = fqNames.fqNameUnsafe("Boolean");
            _char = fqNames.fqNameUnsafe("Char");
            _byte = fqNames.fqNameUnsafe("Byte");
            _short = fqNames.fqNameUnsafe("Short");
            _int = fqNames.fqNameUnsafe("Int");
            _long = fqNames.fqNameUnsafe("Long");
            _float = fqNames.fqNameUnsafe("Float");
            _double = fqNames.fqNameUnsafe("Double");
            number = fqNames.fqNameUnsafe("Number");
            _enum = fqNames.fqNameUnsafe("Enum");
            functionSupertype = fqNames.fqNameUnsafe("Function");
            throwable = fqNames.fqName("Throwable");
            comparable = fqNames.fqName("Comparable");
            intRange = fqNames.rangesFqName("IntRange");
            longRange = fqNames.rangesFqName("LongRange");
            deprecated = fqNames.fqName("Deprecated");
            deprecatedSinceKotlin = fqNames.fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.fqName("DeprecationLevel");
            replaceWith = fqNames.fqName("ReplaceWith");
            extensionFunctionType = fqNames.fqName("ExtensionFunctionType");
            contextFunctionTypeParams = fqNames.fqName("ContextFunctionTypeParams");
            FqName fqName = fqNames.fqName("ParameterName");
            parameterName = fqName;
            ClassId classId = ClassId.topLevel(fqName);
            classId.getClass();
            parameterNameClassId = classId;
            annotation = fqNames.fqName("Annotation");
            FqName fqNameAnnotationName = fqNames.annotationName("Target");
            target = fqNameAnnotationName;
            ClassId classId2 = ClassId.topLevel(fqNameAnnotationName);
            classId2.getClass();
            targetClassId = classId2;
            annotationTarget = fqNames.annotationName("AnnotationTarget");
            annotationRetention = fqNames.annotationName("AnnotationRetention");
            FqName fqNameAnnotationName2 = fqNames.annotationName("Retention");
            retention = fqNameAnnotationName2;
            ClassId classId3 = ClassId.topLevel(fqNameAnnotationName2);
            classId3.getClass();
            retentionClassId = classId3;
            FqName fqNameAnnotationName3 = fqNames.annotationName("Repeatable");
            repeatable = fqNameAnnotationName3;
            ClassId classId4 = ClassId.topLevel(fqNameAnnotationName3);
            classId4.getClass();
            repeatableClassId = classId4;
            mustBeDocumented = fqNames.annotationName("MustBeDocumented");
            unsafeVariance = fqNames.fqName("UnsafeVariance");
            publishedApi = fqNames.fqName("PublishedApi");
            accessibleLateinitPropertyLiteral = fqNames.internalName("AccessibleLateinitPropertyLiteral");
            iterator = fqNames.collectionsFqName("Iterator");
            iterable = fqNames.collectionsFqName("Iterable");
            collection = fqNames.collectionsFqName("Collection");
            list = fqNames.collectionsFqName("List");
            listIterator = fqNames.collectionsFqName("ListIterator");
            set = fqNames.collectionsFqName("Set");
            FqName fqNameCollectionsFqName = fqNames.collectionsFqName("Map");
            map = fqNameCollectionsFqName;
            mapEntry = s.u("Entry", fqNameCollectionsFqName);
            mutableIterator = fqNames.collectionsFqName("MutableIterator");
            mutableIterable = fqNames.collectionsFqName("MutableIterable");
            mutableCollection = fqNames.collectionsFqName("MutableCollection");
            mutableList = fqNames.collectionsFqName("MutableList");
            mutableListIterator = fqNames.collectionsFqName("MutableListIterator");
            mutableSet = fqNames.collectionsFqName("MutableSet");
            FqName fqNameCollectionsFqName2 = fqNames.collectionsFqName("MutableMap");
            mutableMap = fqNameCollectionsFqName2;
            mutableMapEntry = s.u("MutableEntry", fqNameCollectionsFqName2);
            kClass = reflect("KClass");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            ClassId classId5 = ClassId.topLevel(fqNameUnsafeReflect.toSafe());
            classId5.getClass();
            kProperty = classId5;
            kDeclarationContainer = reflect("KDeclarationContainer");
            FqName fqName2 = fqNames.fqName("UByte");
            uByteFqName = fqName2;
            FqName fqName3 = fqNames.fqName("UShort");
            uShortFqName = fqName3;
            FqName fqName4 = fqNames.fqName("UInt");
            uIntFqName = fqName4;
            FqName fqName5 = fqNames.fqName("ULong");
            uLongFqName = fqName5;
            ClassId classId6 = ClassId.topLevel(fqName2);
            classId6.getClass();
            uByte = classId6;
            ClassId classId7 = ClassId.topLevel(fqName3);
            classId7.getClass();
            uShort = classId7;
            ClassId classId8 = ClassId.topLevel(fqName4);
            classId8.getClass();
            uInt = classId8;
            ClassId classId9 = ClassId.topLevel(fqName5);
            classId9.getClass();
            uLong = classId9;
            uByteArrayFqName = fqNames.fqName("UByteArray");
            uShortArrayFqName = fqNames.fqName("UShortArray");
            uIntArrayFqName = fqNames.fqName("UIntArray");
            uLongArrayFqName = fqNames.fqName("ULongArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strAsString = primitiveType3.getTypeName().asString();
                strAsString.getClass();
                mapNewHashMapWithExpectedSize.put(fqNames2.fqNameUnsafe(strAsString), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String strAsString2 = primitiveType4.getArrayTypeName().asString();
                strAsString2.getClass();
                mapNewHashMapWithExpectedSize2.put(fqNames3.fqNameUnsafe(strAsString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName annotationName(String str) {
            return s.u(str, StandardNames.ANNOTATION_PACKAGE_FQ_NAME);
        }

        private final FqName collectionsFqName(String str) {
            return s.u(str, StandardNames.COLLECTIONS_PACKAGE_FQ_NAME);
        }

        private final FqName fqName(String str) {
            return s.u(str, StandardNames.BUILT_INS_PACKAGE_FQ_NAME);
        }

        private final FqNameUnsafe fqNameUnsafe(String str) {
            FqNameUnsafe unsafe = fqName(str).toUnsafe();
            unsafe.getClass();
            return unsafe;
        }

        private final FqName internalName(String str) {
            return s.u(str, StandardNames.KOTLIN_INTERNAL_FQ_NAME);
        }

        private final FqNameUnsafe rangesFqName(String str) {
            FqNameUnsafe unsafe = StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            unsafe.getClass();
            return unsafe;
        }

        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String str) {
            str.getClass();
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            unsafe.getClass();
            return unsafe;
        }
    }

    static {
        Name nameIdentifier = Name.identifier("field");
        nameIdentifier.getClass();
        BACKING_FIELD = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("value");
        nameIdentifier2.getClass();
        DEFAULT_VALUE_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("values");
        nameIdentifier3.getClass();
        ENUM_VALUES = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("entries");
        nameIdentifier4.getClass();
        ENUM_ENTRIES = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("valueOf");
        nameIdentifier5.getClass();
        ENUM_VALUE_OF = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("copy");
        nameIdentifier6.getClass();
        DATA_CLASS_COPY = nameIdentifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name nameIdentifier7 = Name.identifier("hashCode");
        nameIdentifier7.getClass();
        HASHCODE_NAME = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("code");
        nameIdentifier8.getClass();
        CHAR_CODE = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("nextChar");
        nameIdentifier9.getClass();
        NEXT_CHAR = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("count");
        nameIdentifier10.getClass();
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = nameIdentifier10;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        CONTINUATION_INTERFACE_FQ_NAME = s.u("Continuation", fqName);
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = d0.h("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameIdentifier11 = Name.identifier("kotlin");
        nameIdentifier11.getClass();
        BUILT_INS_PACKAGE_NAME = nameIdentifier11;
        FqName fqName3 = FqName.topLevel(nameIdentifier11);
        fqName3.getClass();
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName fqNameU = s.u("annotation", fqName3);
        ANNOTATION_PACKAGE_FQ_NAME = fqNameU;
        FqName fqNameU2 = s.u("collections", fqName3);
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameU2;
        FqName fqNameU3 = s.u("ranges", fqName3);
        RANGES_PACKAGE_FQ_NAME = fqNameU3;
        TEXT_PACKAGE_FQ_NAME = s.u(TextBundle.TEXT_ENTRY, fqName3);
        FqName fqNameU4 = s.u("internal", fqName3);
        KOTLIN_INTERNAL_FQ_NAME = fqNameU4;
        NON_EXISTENT_CLASS = new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = y.W(new FqName[]{fqName3, fqNameU2, fqNameU3, fqNameU, fqName2, fqNameU4, fqName});
    }

    private StandardNames() {
    }

    @NotNull
    public static final ClassId getFunctionClassId(int i11) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i11)));
    }

    @NotNull
    public static final String getFunctionName(int i11) {
        return s.f(i11, "Function");
    }

    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        FqName fqNameChild = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        fqNameChild.getClass();
        return fqNameChild;
    }

    @NotNull
    public static final String getSuspendFunctionName(int i11) {
        return FunctionClassKind.SuspendFunction.getClassNamePrefix() + i11;
    }

    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }
}
