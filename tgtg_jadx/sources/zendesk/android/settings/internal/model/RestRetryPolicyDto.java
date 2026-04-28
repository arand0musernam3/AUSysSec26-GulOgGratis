package zendesk.android.settings.internal.model;

import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lzendesk/android/settings/internal/model/RestRetryPolicyDto;", "", "Lzendesk/android/settings/internal/model/RetryIntervalDto;", "intervals", "", "backoffMultiplier", "maxRetries", "<init>", "(Lzendesk/android/settings/internal/model/RetryIntervalDto;II)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/settings/internal/model/RetryIntervalDto;IILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/RestRetryPolicyDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/settings/internal/model/RetryIntervalDto;", "component2", "()I", "component3", "copy", "(Lzendesk/android/settings/internal/model/RetryIntervalDto;II)Lzendesk/android/settings/internal/model/RestRetryPolicyDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/settings/internal/model/RetryIntervalDto;", "getIntervals", "I", "getBackoffMultiplier", "getMaxRetries", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RestRetryPolicyDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int backoffMultiplier;

    @NotNull
    private final RetryIntervalDto intervals;
    private final int maxRetries;

    public /* synthetic */ RestRetryPolicyDto(int i11, RetryIntervalDto retryIntervalDto, int i12, int i13, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, RestRetryPolicyDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.intervals = retryIntervalDto;
        this.backoffMultiplier = i12;
        this.maxRetries = i13;
    }

    public static /* synthetic */ RestRetryPolicyDto copy$default(RestRetryPolicyDto restRetryPolicyDto, RetryIntervalDto retryIntervalDto, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            retryIntervalDto = restRetryPolicyDto.intervals;
        }
        if ((i13 & 2) != 0) {
            i11 = restRetryPolicyDto.backoffMultiplier;
        }
        if ((i13 & 4) != 0) {
            i12 = restRetryPolicyDto.maxRetries;
        }
        return restRetryPolicyDto.copy(retryIntervalDto, i11, i12);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(RestRetryPolicyDto self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, RetryIntervalDto$$serializer.INSTANCE, self.intervals);
        output.m(1, self.backoffMultiplier, serialDesc);
        output.m(2, self.maxRetries, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RetryIntervalDto getIntervals() {
        return this.intervals;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    @NotNull
    public final RestRetryPolicyDto copy(@NotNull RetryIntervalDto intervals, int backoffMultiplier, int maxRetries) {
        intervals.getClass();
        return new RestRetryPolicyDto(intervals, backoffMultiplier, maxRetries);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestRetryPolicyDto)) {
            return false;
        }
        RestRetryPolicyDto restRetryPolicyDto = (RestRetryPolicyDto) other;
        return Intrinsics.areEqual(this.intervals, restRetryPolicyDto.intervals) && this.backoffMultiplier == restRetryPolicyDto.backoffMultiplier && this.maxRetries == restRetryPolicyDto.maxRetries;
    }

    public final int getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    @NotNull
    public final RetryIntervalDto getIntervals() {
        return this.intervals;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxRetries) + k.b(this.backoffMultiplier, this.intervals.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        RetryIntervalDto retryIntervalDto = this.intervals;
        int i11 = this.backoffMultiplier;
        int i12 = this.maxRetries;
        StringBuilder sb2 = new StringBuilder("RestRetryPolicyDto(intervals=");
        sb2.append(retryIntervalDto);
        sb2.append(", backoffMultiplier=");
        sb2.append(i11);
        sb2.append(", maxRetries=");
        return k.i(i12, ")", sb2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/RestRetryPolicyDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/RestRetryPolicyDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return RestRetryPolicyDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RestRetryPolicyDto(@NotNull RetryIntervalDto retryIntervalDto, int i11, int i12) {
        retryIntervalDto.getClass();
        this.intervals = retryIntervalDto;
        this.backoffMultiplier = i11;
        this.maxRetries = i12;
    }
}
