package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ProactiveParams;", "", "proactiveNotificationId", "", "hasSendReferralInfo", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProactiveNotificationId", "()Ljava/lang/Integer;", "setProactiveNotificationId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHasSendReferralInfo", "setHasSendReferralInfo", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/messaging/android/internal/conversationscreen/ProactiveParams;", "equals", "", "other", "hashCode", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProactiveParams {

    @Nullable
    private Integer hasSendReferralInfo;

    @Nullable
    private Integer proactiveNotificationId;

    public /* synthetic */ ProactiveParams(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
    }

    public static /* synthetic */ ProactiveParams copy$default(ProactiveParams proactiveParams, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = proactiveParams.proactiveNotificationId;
        }
        if ((i11 & 2) != 0) {
            num2 = proactiveParams.hasSendReferralInfo;
        }
        return proactiveParams.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getProactiveNotificationId() {
        return this.proactiveNotificationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHasSendReferralInfo() {
        return this.hasSendReferralInfo;
    }

    @NotNull
    public final ProactiveParams copy(@Nullable Integer proactiveNotificationId, @Nullable Integer hasSendReferralInfo) {
        return new ProactiveParams(proactiveNotificationId, hasSendReferralInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveParams)) {
            return false;
        }
        ProactiveParams proactiveParams = (ProactiveParams) other;
        return Intrinsics.areEqual(this.proactiveNotificationId, proactiveParams.proactiveNotificationId) && Intrinsics.areEqual(this.hasSendReferralInfo, proactiveParams.hasSendReferralInfo);
    }

    @Nullable
    public final Integer getHasSendReferralInfo() {
        return this.hasSendReferralInfo;
    }

    @Nullable
    public final Integer getProactiveNotificationId() {
        return this.proactiveNotificationId;
    }

    public int hashCode() {
        Integer num = this.proactiveNotificationId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.hasSendReferralInfo;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setHasSendReferralInfo(@Nullable Integer num) {
        this.hasSendReferralInfo = num;
    }

    public final void setProactiveNotificationId(@Nullable Integer num) {
        this.proactiveNotificationId = num;
    }

    @NotNull
    public String toString() {
        return "ProactiveParams(proactiveNotificationId=" + this.proactiveNotificationId + ", hasSendReferralInfo=" + this.hasSendReferralInfo + ")";
    }

    public ProactiveParams(@Nullable Integer num, @Nullable Integer num2) {
        this.proactiveNotificationId = num;
        this.hasSendReferralInfo = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProactiveParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
