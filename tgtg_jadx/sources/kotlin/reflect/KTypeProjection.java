package kotlin.reflect;

import i4.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\bF\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0083\u0004J\f\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0083\u0004J\"\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0081\u0004J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "<init>", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getVariance", "()Lkotlin/reflect/KVariance;", "getType", "()Lkotlin/reflect/KType;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final KTypeProjection star = new KTypeProjection(null, null);

    @Nullable
    private final KType type;

    @Nullable
    private final KVariance variance;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeProjection(@Nullable KVariance kVariance, @Nullable KType kType) {
        String str;
        this.variance = kVariance;
        this.type = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        a.i(str);
        throw null;
    }

    @NotNull
    public static final KTypeProjection contravariant(@NotNull KType kType) {
        return INSTANCE.contravariant(kType);
    }

    public static /* synthetic */ KTypeProjection copy$default(KTypeProjection kTypeProjection, KVariance kVariance, KType kType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVariance = kTypeProjection.variance;
        }
        if ((i11 & 2) != 0) {
            kType = kTypeProjection.type;
        }
        return kTypeProjection.copy(kVariance, kType);
    }

    @NotNull
    public static final KTypeProjection covariant(@NotNull KType kType) {
        return INSTANCE.covariant(kType);
    }

    @NotNull
    public static final KTypeProjection invariant(@NotNull KType kType) {
        return INSTANCE.invariant(kType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KVariance getVariance() {
        return this.variance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KType getType() {
        return this.type;
    }

    @NotNull
    public final KTypeProjection copy(@Nullable KVariance variance, @Nullable KType type) {
        return new KTypeProjection(variance, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.variance == kTypeProjection.variance && Intrinsics.areEqual(this.type, kTypeProjection.type);
    }

    @Nullable
    public final KType getType() {
        return this.type;
    }

    @Nullable
    public final KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        KVariance kVariance = this.variance;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.type;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        KVariance kVariance = this.variance;
        int i11 = kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i11 == -1) {
            return "*";
        }
        if (i11 == 1) {
            return String.valueOf(this.type);
        }
        if (i11 == 2) {
            return "in " + this.type;
        }
        if (i11 != 3) {
            e40.a.f();
            return null;
        }
        return "out " + this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0080\u0004J\u0012\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0080\u0004J\u0012\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0080\u0004R\u0017\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0084\b¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00058FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "<init>", "()V", "star", "Lkotlin/reflect/KTypeProjection;", "getStar$annotations", "STAR", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "invariant", "type", "Lkotlin/reflect/KType;", "contravariant", "covariant", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KTypeProjection contravariant(@NotNull KType type) {
            type.getClass();
            return new KTypeProjection(KVariance.IN, type);
        }

        @NotNull
        public final KTypeProjection covariant(@NotNull KType type) {
            type.getClass();
            return new KTypeProjection(KVariance.OUT, type);
        }

        @NotNull
        public final KTypeProjection getSTAR() {
            return KTypeProjection.star;
        }

        @NotNull
        public final KTypeProjection invariant(@NotNull KType type) {
            type.getClass();
            return new KTypeProjection(KVariance.INVARIANT, type);
        }

        private Companion() {
        }

        public static /* synthetic */ void getStar$annotations() {
        }
    }
}
