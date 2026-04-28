package zendesk.android.settings.internal.model;

import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lzendesk/android/settings/internal/model/RetryIntervalDto;", "", "", "regular", "aggressive", "<init>", "(II)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/RetryIntervalDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lzendesk/android/settings/internal/model/RetryIntervalDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRegular", "getAggressive", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RetryIntervalDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int aggressive;
    private final int regular;

    public /* synthetic */ RetryIntervalDto(int i11, int i12, int i13, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, RetryIntervalDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.regular = i12;
        this.aggressive = i13;
    }

    public static /* synthetic */ RetryIntervalDto copy$default(RetryIntervalDto retryIntervalDto, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = retryIntervalDto.regular;
        }
        if ((i13 & 2) != 0) {
            i12 = retryIntervalDto.aggressive;
        }
        return retryIntervalDto.copy(i11, i12);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(RetryIntervalDto self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.regular, serialDesc);
        output.m(1, self.aggressive, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRegular() {
        return this.regular;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAggressive() {
        return this.aggressive;
    }

    @NotNull
    public final RetryIntervalDto copy(int regular, int aggressive) {
        return new RetryIntervalDto(regular, aggressive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryIntervalDto)) {
            return false;
        }
        RetryIntervalDto retryIntervalDto = (RetryIntervalDto) other;
        return this.regular == retryIntervalDto.regular && this.aggressive == retryIntervalDto.aggressive;
    }

    public final int getAggressive() {
        return this.aggressive;
    }

    public final int getRegular() {
        return this.regular;
    }

    public int hashCode() {
        return Integer.hashCode(this.aggressive) + (Integer.hashCode(this.regular) * 31);
    }

    @NotNull
    public String toString() {
        return k.g(this.regular, this.aggressive, "RetryIntervalDto(regular=", ", aggressive=", ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/RetryIntervalDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/RetryIntervalDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return RetryIntervalDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RetryIntervalDto(int i11, int i12) {
        this.regular = i11;
        this.aggressive = i12;
    }
}
