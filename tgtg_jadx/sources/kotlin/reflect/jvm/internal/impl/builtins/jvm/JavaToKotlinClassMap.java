package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import e0.f;
import j4.s;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n49#1,2:221\n49#1,2:223\n49#1,2:225\n49#1,2:227\n49#1,2:229\n49#1,2:231\n49#1,2:233\n49#1,2:235\n1#2:220\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n54#1:221,2\n55#1:223,2\n56#1:225,2\n57#1:227,2\n58#1:229,2\n59#1:231,2\n60#1:233,2\n61#1:235,2\n*E\n"})
public final class JavaToKotlinClassMap {

    @NotNull
    private static final ClassId CLASS_CLASS_ID;

    @NotNull
    private static final ClassId FUNCTION_N_CLASS_ID;

    @NotNull
    private static final FqName FUNCTION_N_FQ_NAME;

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;

    @NotNull
    private static final ClassId K_CLASS_CLASS_ID;

    @NotNull
    private static final ClassId K_FUNCTION_CLASS_ID;

    @NotNull
    private static final String NUMBERED_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_K_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> javaToKotlin;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> kotlinToJava;

    @NotNull
    private static final List<PlatformMutabilityMapping> mutabilityMappings;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> mutableToReadOnly;

    @NotNull
    private static final HashMap<ClassId, ClassId> mutableToReadOnlyClassId;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> readOnlyToMutable;

    @NotNull
    private static final HashMap<ClassId, ClassId> readOnlyToMutableClassId;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class PlatformMutabilityMapping {

        @NotNull
        private final ClassId javaClass;

        @NotNull
        private final ClassId kotlinMutable;

        @NotNull
        private final ClassId kotlinReadOnly;

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            classId.getClass();
            classId2.getClass();
            classId3.getClass();
            this.javaClass = classId;
            this.kotlinReadOnly = classId2;
            this.kotlinMutable = classId3;
        }

        @NotNull
        public final ClassId component1() {
            return this.javaClass;
        }

        @NotNull
        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        @NotNull
        public final ClassId component3() {
            return this.kotlinMutable;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.areEqual(this.javaClass, platformMutabilityMapping.javaClass) && Intrinsics.areEqual(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && Intrinsics.areEqual(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.javaClass;
        }

        public int hashCode() {
            return this.kotlinMutable.hashCode() + ((this.kotlinReadOnly.hashCode() + (this.javaClass.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.javaClass + ", kotlinReadOnly=" + this.kotlinReadOnly + ", kotlinMutable=" + this.kotlinMutable + ')';
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb2.append(functionClassKind.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb3.append(functionClassKind2.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind2.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb4.append(functionClassKind3.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind3.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb5.append(functionClassKind4.getPackageFqName().toString());
        sb5.append('.');
        sb5.append(functionClassKind4.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb5.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        classId.getClass();
        FUNCTION_N_CLASS_ID = classId;
        FqName fqNameAsSingleFqName = classId.asSingleFqName();
        fqNameAsSingleFqName.getClass();
        FUNCTION_N_FQ_NAME = fqNameAsSingleFqName;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        K_FUNCTION_CLASS_ID = standardClassIds.getKFunction();
        K_CLASS_CLASS_ID = standardClassIds.getKClass();
        CLASS_CLASS_ID = javaToKotlinClassMap.classId(Class.class);
        javaToKotlin = new HashMap<>();
        kotlinToJava = new HashMap<>();
        mutableToReadOnly = new HashMap<>();
        readOnlyToMutable = new HashMap<>();
        mutableToReadOnlyClassId = new HashMap<>();
        readOnlyToMutableClassId = new HashMap<>();
        ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.iterable);
        classId2.getClass();
        FqName fqName = StandardNames.FqNames.mutableIterable;
        FqName packageFqName = classId2.getPackageFqName();
        FqName packageFqName2 = classId2.getPackageFqName();
        packageFqName2.getClass();
        FqName fqNameTail = FqNamesUtilKt.tail(fqName, packageFqName2);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), classId2, new ClassId(packageFqName, fqNameTail, false));
        ClassId classId3 = ClassId.topLevel(StandardNames.FqNames.iterator);
        classId3.getClass();
        FqName fqName2 = StandardNames.FqNames.mutableIterator;
        FqName packageFqName3 = classId3.getPackageFqName();
        FqName packageFqName4 = classId3.getPackageFqName();
        packageFqName4.getClass();
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterator.class), classId3, new ClassId(packageFqName3, FqNamesUtilKt.tail(fqName2, packageFqName4), false));
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.collection);
        classId4.getClass();
        FqName fqName3 = StandardNames.FqNames.mutableCollection;
        FqName packageFqName5 = classId4.getPackageFqName();
        FqName packageFqName6 = classId4.getPackageFqName();
        packageFqName6.getClass();
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Collection.class), classId4, new ClassId(packageFqName5, FqNamesUtilKt.tail(fqName3, packageFqName6), false));
        ClassId classId5 = ClassId.topLevel(StandardNames.FqNames.list);
        classId5.getClass();
        FqName fqName4 = StandardNames.FqNames.mutableList;
        FqName packageFqName7 = classId5.getPackageFqName();
        FqName packageFqName8 = classId5.getPackageFqName();
        packageFqName8.getClass();
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(List.class), classId5, new ClassId(packageFqName7, FqNamesUtilKt.tail(fqName4, packageFqName8), false));
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.set);
        classId6.getClass();
        FqName fqName5 = StandardNames.FqNames.mutableSet;
        FqName packageFqName9 = classId6.getPackageFqName();
        FqName packageFqName10 = classId6.getPackageFqName();
        packageFqName10.getClass();
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Set.class), classId6, new ClassId(packageFqName9, FqNamesUtilKt.tail(fqName5, packageFqName10), false));
        ClassId classId7 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        classId7.getClass();
        FqName fqName6 = StandardNames.FqNames.mutableListIterator;
        FqName packageFqName11 = classId7.getPackageFqName();
        FqName packageFqName12 = classId7.getPackageFqName();
        packageFqName12.getClass();
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(ListIterator.class), classId7, new ClassId(packageFqName11, FqNamesUtilKt.tail(fqName6, packageFqName12), false));
        FqName fqName7 = StandardNames.FqNames.map;
        ClassId classId8 = ClassId.topLevel(fqName7);
        classId8.getClass();
        FqName fqName8 = StandardNames.FqNames.mutableMap;
        FqName packageFqName13 = classId8.getPackageFqName();
        FqName packageFqName14 = classId8.getPackageFqName();
        packageFqName14.getClass();
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.class), classId8, new ClassId(packageFqName13, FqNamesUtilKt.tail(fqName8, packageFqName14), false));
        ClassId classIdCreateNestedClassId = ClassId.topLevel(fqName7).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        classIdCreateNestedClassId.getClass();
        FqName fqName9 = StandardNames.FqNames.mutableMapEntry;
        FqName packageFqName15 = classIdCreateNestedClassId.getPackageFqName();
        FqName packageFqName16 = classIdCreateNestedClassId.getPackageFqName();
        packageFqName16.getClass();
        List<PlatformMutabilityMapping> listH = d0.h(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.Entry.class), classIdCreateNestedClassId, new ClassId(packageFqName15, FqNamesUtilKt.tail(fqName9, packageFqName16), false)));
        mutabilityMappings = listH;
        javaToKotlinClassMap.addTopLevel(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.addTopLevel(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.addTopLevel(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.addTopLevel(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.addTopLevel(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.addTopLevel(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.addTopLevel(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.addTopLevel(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.addTopLevel(Annotation.class, StandardNames.FqNames.annotation);
        Iterator<PlatformMutabilityMapping> it = listH.iterator();
        while (it.hasNext()) {
            INSTANCE.addMapping(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId9 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            classId9.getClass();
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            ClassId classId10 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            classId10.getClass();
            javaToKotlinClassMap2.add(classId9, classId10);
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId12 = ClassId.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject"));
            classId12.getClass();
            ClassId classIdCreateNestedClassId2 = classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            classIdCreateNestedClassId2.getClass();
            javaToKotlinClassMap3.add(classId12, classIdCreateNestedClassId2);
        }
        for (int i11 = 0; i11 < 23; i11++) {
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            ClassId classId13 = ClassId.topLevel(new FqName(s.f(i11, "kotlin.jvm.functions.Function")));
            classId13.getClass();
            javaToKotlinClassMap4.add(classId13, StandardNames.getFunctionClassId(i11));
            javaToKotlinClassMap4.addKotlinToJava(new FqName(f.h(i11, NUMBERED_K_FUNCTION_PREFIX, new StringBuilder())), K_FUNCTION_CLASS_ID);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            INSTANCE.addKotlinToJava(new FqName((functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix()) + i12), K_FUNCTION_CLASS_ID);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        safe.getClass();
        javaToKotlinClassMap5.addKotlinToJava(safe, javaToKotlinClassMap5.classId(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    private final void add(ClassId classId, ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        FqName fqNameAsSingleFqName = classId2.asSingleFqName();
        fqNameAsSingleFqName.getClass();
        addKotlinToJava(fqNameAsSingleFqName, classId);
    }

    private final void addJavaToKotlin(ClassId classId, ClassId classId2) {
        HashMap<FqNameUnsafe, ClassId> map = javaToKotlin;
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        unsafe.getClass();
        map.put(unsafe, classId2);
    }

    private final void addKotlinToJava(FqName fqName, ClassId classId) {
        HashMap<FqNameUnsafe, ClassId> map = kotlinToJava;
        FqNameUnsafe unsafe = fqName.toUnsafe();
        unsafe.getClass();
        map.put(unsafe, classId);
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdComponent1 = platformMutabilityMapping.component1();
        ClassId classIdComponent2 = platformMutabilityMapping.component2();
        ClassId classIdComponent3 = platformMutabilityMapping.component3();
        add(classIdComponent1, classIdComponent2);
        FqName fqNameAsSingleFqName = classIdComponent3.asSingleFqName();
        fqNameAsSingleFqName.getClass();
        addKotlinToJava(fqNameAsSingleFqName, classIdComponent1);
        mutableToReadOnlyClassId.put(classIdComponent3, classIdComponent2);
        readOnlyToMutableClassId.put(classIdComponent2, classIdComponent3);
        FqName fqNameAsSingleFqName2 = classIdComponent2.asSingleFqName();
        fqNameAsSingleFqName2.getClass();
        FqName fqNameAsSingleFqName3 = classIdComponent3.asSingleFqName();
        fqNameAsSingleFqName3.getClass();
        HashMap<FqNameUnsafe, FqName> map = mutableToReadOnly;
        FqNameUnsafe unsafe = classIdComponent3.asSingleFqName().toUnsafe();
        unsafe.getClass();
        map.put(unsafe, fqNameAsSingleFqName2);
        HashMap<FqNameUnsafe, FqName> map2 = readOnlyToMutable;
        FqNameUnsafe unsafe2 = fqNameAsSingleFqName2.toUnsafe();
        unsafe2.getClass();
        map2.put(unsafe2, fqNameAsSingleFqName3);
    }

    private final void addTopLevel(Class<?> cls, FqName fqName) {
        ClassId classId = classId(cls);
        ClassId classId2 = ClassId.topLevel(fqName);
        classId2.getClass();
        add(classId, classId2);
    }

    private final ClassId classId(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId classId = ClassId.topLevel(new FqName(cls.getCanonicalName()));
            classId.getClass();
            return classId;
        }
        ClassId classIdCreateNestedClassId = classId(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
        classIdCreateNestedClassId.getClass();
        return classIdCreateNestedClassId;
    }

    private final boolean isKotlinFunctionWithBigArity(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String strAsString = fqNameUnsafe.asString();
        strAsString.getClass();
        String strV = StringsKt.V(strAsString, str, "");
        return strV.length() > 0 && !StringsKt.T(strV, '0') && (intOrNull = StringsKt.toIntOrNull(strV)) != null && intOrNull.intValue() >= 23;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.containsKey(fqNameUnsafe);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        fqName.getClass();
        return javaToKotlin.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_FUNCTION_PREFIX) ? FUNCTION_N_CLASS_ID : isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_SUSPEND_FUNCTION_PREFIX) ? FUNCTION_N_CLASS_ID : isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_FUNCTION_PREFIX) ? K_FUNCTION_CLASS_ID : isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_SUSPEND_FUNCTION_PREFIX) ? K_FUNCTION_CLASS_ID : kotlinToJava.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.get(fqNameUnsafe);
    }

    private final void addTopLevel(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        safe.getClass();
        addTopLevel(cls, safe);
    }
}
