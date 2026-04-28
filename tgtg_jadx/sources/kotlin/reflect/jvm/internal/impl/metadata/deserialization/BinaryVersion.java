package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.adyen.checkout.components.core.PaymentMethodTypes;
import i4.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.w;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;

    @NotNull
    private final int[] numbers;
    private final int patch;

    @NotNull
    private final List<Integer> rest;

    public BinaryVersion(@NotNull int... iArr) {
        List<Integer> listR0;
        iArr.getClass();
        this.numbers = iArr;
        Integer numC = y.C(0, iArr);
        this.major = numC != null ? numC.intValue() : -1;
        Integer numC2 = y.C(1, iArr);
        this.minor = numC2 != null ? numC2.intValue() : -1;
        Integer numC3 = y.C(2, iArr);
        this.patch = numC3 != null ? numC3.intValue() : -1;
        if (iArr.length <= 3) {
            listR0 = n0.f26529a;
        } else {
            if (iArr.length > 1024) {
                a.f(k.o(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listR0 = CollectionsKt.r0(new w(iArr).subList(3, iArr.length));
        }
        this.rest = listR0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i11 = this.major;
        int i12 = (i11 * 31) + this.minor + i11;
        int i13 = (i12 * 31) + this.patch + i12;
        return this.rest.hashCode() + (i13 * 31) + i13;
    }

    public final boolean isAtLeast(int i11, int i12, int i13) {
        int i14 = this.major;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        int i15 = this.minor;
        if (i15 > i12) {
            return true;
        }
        return i15 >= i12 && this.patch >= i13;
    }

    public final boolean isAtMost(int i11, int i12, int i13) {
        int i14 = this.major;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        int i15 = this.minor;
        if (i15 < i12) {
            return true;
        }
        return i15 <= i12 && this.patch <= i13;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        int i11 = this.major;
        return i11 == 0 ? binaryVersion.major == 0 && this.minor == binaryVersion.minor : i11 == binaryVersion.major && this.minor <= binaryVersion.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i11 : array) {
            if (i11 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList.isEmpty() ? PaymentMethodTypes.UNKNOWN : CollectionsKt.U(arrayList, ".", null, null, null, 62);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean isAtLeast(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isAtLeast(binaryVersion.major, binaryVersion.minor, binaryVersion.patch);
    }
}
