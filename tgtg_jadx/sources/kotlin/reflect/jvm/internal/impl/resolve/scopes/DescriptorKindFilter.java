package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import e0.f;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1855#2,2:262\n1726#2,3:264\n288#2,2:267\n1603#2,9:269\n1855#2:278\n1856#2:280\n1612#2:281\n1603#2,9:286\n1855#2:295\n1856#2:297\n1612#2:298\n766#2:303\n857#2,2:304\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:279\n1#3:296\n1#3:316\n210#4:282\n210#4:299\n3792#5:283\n4307#5,2:284\n3792#5:300\n4307#5,2:301\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n*L\n98#1:262,2\n103#1:264,3\n129#1:267,2\n131#1:269,9\n131#1:278\n131#1:280\n131#1:281\n197#1:286,9\n197#1:295\n197#1:297\n197#1:298\n203#1:303\n203#1:304,2\n204#1:306,9\n204#1:315\n204#1:317\n204#1:318\n131#1:279\n197#1:296\n204#1:316\n196#1:282\n202#1:299\n196#1:283\n196#1:284,2\n202#1:300\n202#1:301,2\n*E\n"})
public final class DescriptorKindFilter {

    @NotNull
    public static final DescriptorKindFilter ALL;
    private static final int ALL_KINDS_MASK;

    @NotNull
    public static final DescriptorKindFilter CALLABLES;
    private static final int CALLABLES_MASK;

    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;
    private static final int CLASSIFIERS_MASK;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final List<Companion.MaskToName> DEBUG_MASK_BIT_NAMES;

    @NotNull
    private static final List<Companion.MaskToName> DEBUG_PREDEFINED_FILTERS_MASK_NAMES;

    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;
    private static final int FUNCTIONS_MASK;

    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    private static final int NON_SINGLETON_CLASSIFIERS_MASK;

    @NotNull
    public static final DescriptorKindFilter PACKAGES;
    private static final int PACKAGES_MASK;

    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    private static final int SINGLETON_CLASSIFIERS_MASK;

    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;
    private static final int TYPE_ALIASES_MASK;

    @NotNull
    public static final DescriptorKindFilter VALUES;
    private static final int VALUES_MASK;

    @NotNull
    public static final DescriptorKindFilter VARIABLES;
    private static final int VARIABLES_MASK;
    private static int nextMaskValue;

    @NotNull
    private final List<DescriptorKindExclude> excludes;
    private final int kindMask;

    static {
        Companion.MaskToName maskToName;
        Companion.MaskToName maskToName2;
        Companion companion = new Companion(null);
        Companion = companion;
        nextMaskValue = 1;
        int iNextMask = companion.nextMask();
        NON_SINGLETON_CLASSIFIERS_MASK = iNextMask;
        int iNextMask2 = companion.nextMask();
        SINGLETON_CLASSIFIERS_MASK = iNextMask2;
        int iNextMask3 = companion.nextMask();
        TYPE_ALIASES_MASK = iNextMask3;
        int iNextMask4 = companion.nextMask();
        PACKAGES_MASK = iNextMask4;
        int iNextMask5 = companion.nextMask();
        FUNCTIONS_MASK = iNextMask5;
        int iNextMask6 = companion.nextMask();
        VARIABLES_MASK = iNextMask6;
        int iNextMask7 = companion.nextMask() - 1;
        ALL_KINDS_MASK = iNextMask7;
        int i11 = iNextMask | iNextMask2 | iNextMask3;
        CLASSIFIERS_MASK = i11;
        int i12 = iNextMask2 | iNextMask5 | iNextMask6;
        VALUES_MASK = i12;
        int i13 = iNextMask5 | iNextMask6;
        CALLABLES_MASK = i13;
        ALL = new DescriptorKindFilter(iNextMask7, null, 2, null);
        CALLABLES = new DescriptorKindFilter(i13, null, 2, null);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iNextMask, null, 2, null);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iNextMask2, null, 2, null);
        TYPE_ALIASES = new DescriptorKindFilter(iNextMask3, null, 2, null);
        CLASSIFIERS = new DescriptorKindFilter(i11, null, 2, null);
        PACKAGES = new DescriptorKindFilter(iNextMask4, null, 2, null);
        FUNCTIONS = new DescriptorKindFilter(iNextMask5, null, 2, null);
        VARIABLES = new DescriptorKindFilter(iNextMask6, null, 2, null);
        VALUES = new DescriptorKindFilter(i12, null, 2, null);
        Field[] fields = DescriptorKindFilter.class.getFields();
        fields.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i14 = descriptorKindFilter.kindMask;
                String name = field2.getName();
                name.getClass();
                maskToName2 = new Companion.MaskToName(i14, name);
            } else {
                maskToName2 = null;
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.areEqual(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                maskToName = new Companion.MaskToName(iIntValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        DEBUG_MASK_BIT_NAMES = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i11, @NotNull List<? extends DescriptorKindExclude> list) {
        list.getClass();
        this.excludes = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i11 &= ~((DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.kindMask = i11;
    }

    public final boolean acceptsKinds(int i11) {
        return (i11 & this.kindMask) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(DescriptorKindFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.areEqual(this.excludes, descriptorKindFilter.excludes) && this.kindMask == descriptorKindFilter.kindMask;
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public int hashCode() {
        return (this.excludes.hashCode() * 31) + this.kindMask;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int i11) {
        int i12 = i11 & this.kindMask;
        if (i12 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i12, this.excludes);
    }

    @NotNull
    public String toString() {
        Object next;
        Iterator<T> it = DEBUG_PREDEFINED_FILTERS_MASK_NAMES.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Companion.MaskToName) next).getMask() == this.kindMask) {
                break;
            }
        }
        Companion.MaskToName maskToName = (Companion.MaskToName) next;
        String name = maskToName != null ? maskToName.getName() : null;
        if (name == null) {
            List<Companion.MaskToName> list = DEBUG_MASK_BIT_NAMES;
            ArrayList arrayList = new ArrayList();
            for (Companion.MaskToName maskToName2 : list) {
                String name2 = acceptsKinds(maskToName2.getMask()) ? maskToName2.getName() : null;
                if (name2 != null) {
                    arrayList.add(name2);
                }
            }
            name = CollectionsKt.U(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbS = f.s("DescriptorKindFilter(", name, ", ");
        sbS.append(this.excludes);
        sbS.append(')');
        return sbS.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1#2:262\n3792#3:263\n4307#3,2:264\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n*L\n210#1:263\n210#1:264,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        public static final class MaskToName {
            private final int mask;

            @NotNull
            private final String name;

            public MaskToName(int i11, @NotNull String str) {
                str.getClass();
                this.mask = i11;
                this.name = str;
            }

            public final int getMask() {
                return this.mask;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nextMask() {
            int i11 = DescriptorKindFilter.nextMaskValue;
            DescriptorKindFilter.nextMaskValue <<= 1;
            return i11;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.ALL_KINDS_MASK;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.CLASSIFIERS_MASK;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.FUNCTIONS_MASK;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.NON_SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.PACKAGES_MASK;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.SINGLETON_CLASSIFIERS_MASK;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.TYPE_ALIASES_MASK;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.VARIABLES_MASK;
        }

        private Companion() {
        }
    }

    public DescriptorKindFilter(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? n0.f26529a : list);
    }
}
