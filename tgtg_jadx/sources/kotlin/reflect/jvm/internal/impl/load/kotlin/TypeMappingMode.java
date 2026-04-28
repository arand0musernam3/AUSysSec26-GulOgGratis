package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeMappingMode {

    @NotNull
    public static final TypeMappingMode CLASS_DECLARATION;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final TypeMappingMode DEFAULT;

    @NotNull
    public static final TypeMappingMode DEFAULT_UAST;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;

    @NotNull
    public static final TypeMappingMode RETURN_TYPE_BOXED;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;

    @NotNull
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;

    @Nullable
    private final TypeMappingMode genericArgumentMode;

    @Nullable
    private final TypeMappingMode genericContravariantArgumentMode;

    @Nullable
    private final TypeMappingMode genericInvariantArgumentMode;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean mapTypeAliases;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z11, z12, z13, z14, z15, null, false, null, null, z16, 1023, null);
        GENERIC_ARGUMENT = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z16, false, false, null, false, null, null, true, 511, null);
        GENERIC_ARGUMENT_UAST = typeMappingMode2;
        RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        DEFAULT = new TypeMappingMode(z11, z12, z13, z14, z15, typeMappingMode, false, null, null, z16, 988, null);
        DEFAULT_UAST = new TypeMappingMode(false, false, z16, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z17 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        CLASS_DECLARATION = new TypeMappingMode(z11, true, z13, z14, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 988, defaultConstructorMarker);
        boolean z18 = false;
        boolean z19 = true;
        SUPER_TYPE = new TypeMappingMode(z11, z18, z13, z19, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z11, z18, z13, z19, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z11, z18, true, false, z15, typeMappingMode, z17, typeMappingMode3, typeMappingMode4, z16, 984, defaultConstructorMarker);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, TypeMappingMode typeMappingMode, boolean z16, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i11 & 1) != 0 ? true : z11;
        z12 = (i11 & 2) != 0 ? true : z12;
        z13 = (i11 & 4) != 0 ? false : z13;
        z14 = (i11 & 8) != 0 ? false : z14;
        z15 = (i11 & 16) != 0 ? false : z15;
        typeMappingMode = (i11 & 32) != 0 ? null : typeMappingMode;
        this(z11, z12, z13, z14, z15, typeMappingMode, (i11 & 64) != 0 ? true : z16, (i11 & 128) != 0 ? typeMappingMode : typeMappingMode2, (i11 & 256) != 0 ? typeMappingMode : typeMappingMode3, (i11 & 512) != 0 ? false : z17);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    public final boolean getMapTypeAliases() {
        return this.mapTypeAliases;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    @NotNull
    public final TypeMappingMode toGenericArgumentMode(@NotNull Variance variance, boolean z11) {
        variance.getClass();
        if (!z11 || !this.isForAnnotationParameter) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
            if (i11 == 1) {
                TypeMappingMode typeMappingMode = this.genericContravariantArgumentMode;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i11 != 2) {
                TypeMappingMode typeMappingMode2 = this.genericArgumentMode;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.genericInvariantArgumentMode;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    @NotNull
    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode, false, 512, null);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TypeMappingMode(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @Nullable TypeMappingMode typeMappingMode, boolean z16, @Nullable TypeMappingMode typeMappingMode2, @Nullable TypeMappingMode typeMappingMode3, boolean z17) {
        this.needPrimitiveBoxing = z11;
        this.needInlineClassWrapping = z12;
        this.isForAnnotationParameter = z13;
        this.skipDeclarationSiteWildcards = z14;
        this.skipDeclarationSiteWildcardsIfPossible = z15;
        this.genericArgumentMode = typeMappingMode;
        this.kotlinCollectionsToJavaCollections = z16;
        this.genericContravariantArgumentMode = typeMappingMode2;
        this.genericInvariantArgumentMode = typeMappingMode3;
        this.mapTypeAliases = z17;
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }
}
