package zendesk.conversationkit.android.model;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lzendesk/conversationkit/android/model/RestRetryPolicy;", "", "regular", "", "aggressive", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "backoffMultiplier", "maxRetries", "<init>", "(IILjava/util/concurrent/TimeUnit;II)V", "getRegular", "()I", "getAggressive", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "getBackoffMultiplier", "getMaxRetries", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RestRetryPolicy {
    private final int aggressive;
    private final int backoffMultiplier;
    private final int maxRetries;
    private final int regular;

    @NotNull
    private final TimeUnit timeUnit;

    public /* synthetic */ RestRetryPolicy(int i11, int i12, TimeUnit timeUnit, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 60 : i11, (i15 & 2) != 0 ? 15 : i12, (i15 & 4) != 0 ? TimeUnit.SECONDS : timeUnit, (i15 & 8) != 0 ? 2 : i13, (i15 & 16) != 0 ? 5 : i14);
    }

    public static /* synthetic */ RestRetryPolicy copy$default(RestRetryPolicy restRetryPolicy, int i11, int i12, TimeUnit timeUnit, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = restRetryPolicy.regular;
        }
        if ((i15 & 2) != 0) {
            i12 = restRetryPolicy.aggressive;
        }
        if ((i15 & 4) != 0) {
            timeUnit = restRetryPolicy.timeUnit;
        }
        if ((i15 & 8) != 0) {
            i13 = restRetryPolicy.backoffMultiplier;
        }
        if ((i15 & 16) != 0) {
            i14 = restRetryPolicy.maxRetries;
        }
        int i16 = i14;
        TimeUnit timeUnit2 = timeUnit;
        return restRetryPolicy.copy(i11, i12, timeUnit2, i13, i16);
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
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    @NotNull
    public final RestRetryPolicy copy(int regular, int aggressive, @NotNull TimeUnit timeUnit, int backoffMultiplier, int maxRetries) {
        timeUnit.getClass();
        return new RestRetryPolicy(regular, aggressive, timeUnit, backoffMultiplier, maxRetries);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestRetryPolicy)) {
            return false;
        }
        RestRetryPolicy restRetryPolicy = (RestRetryPolicy) other;
        return this.regular == restRetryPolicy.regular && this.aggressive == restRetryPolicy.aggressive && this.timeUnit == restRetryPolicy.timeUnit && this.backoffMultiplier == restRetryPolicy.backoffMultiplier && this.maxRetries == restRetryPolicy.maxRetries;
    }

    public final int getAggressive() {
        return this.aggressive;
    }

    public final int getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRegular() {
        return this.regular;
    }

    @NotNull
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxRetries) + k.b(this.backoffMultiplier, (this.timeUnit.hashCode() + k.b(this.aggressive, Integer.hashCode(this.regular) * 31, 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.regular;
        int i12 = this.aggressive;
        TimeUnit timeUnit = this.timeUnit;
        int i13 = this.backoffMultiplier;
        int i14 = this.maxRetries;
        StringBuilder sbR = k.r(i11, i12, "RestRetryPolicy(regular=", ", aggressive=", ", timeUnit=");
        sbR.append(timeUnit);
        sbR.append(", backoffMultiplier=");
        sbR.append(i13);
        sbR.append(", maxRetries=");
        return k.i(i14, ")", sbR);
    }

    public RestRetryPolicy(int i11, int i12, @NotNull TimeUnit timeUnit, int i13, int i14) {
        timeUnit.getClass();
        this.regular = i11;
        this.aggressive = i12;
        this.timeUnit = timeUnit;
        this.backoffMultiplier = i13;
        this.maxRetries = i14;
    }

    public RestRetryPolicy() {
        this(0, 0, null, 0, 0, 31, null);
    }
}
