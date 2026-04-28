package zendesk.conversationkit.android.model;

import j4.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.faye.WsResponseTimeDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\"J\u0084\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"¨\u00067"}, d2 = {"Lzendesk/conversationkit/android/model/ActivityEvent;", "", "conversationId", "", "activityData", "Lzendesk/conversationkit/android/model/ActivityData;", "userId", "userName", "userAvatarUrl", "role", "Lzendesk/conversationkit/android/model/AuthorType;", "lastRead", "Ljava/util/Date;", "responseTime", "Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;", "queuePosition", "", "lowestQueuePosition", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/AuthorType;Ljava/util/Date;Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;Ljava/lang/Long;Ljava/lang/Long;)V", "getConversationId", "()Ljava/lang/String;", "getActivityData", "()Lzendesk/conversationkit/android/model/ActivityData;", "getUserId", "getUserName", "getUserAvatarUrl", "getRole", "()Lzendesk/conversationkit/android/model/AuthorType;", "getLastRead", "()Ljava/util/Date;", "getResponseTime", "()Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;", "getQueuePosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLowestQueuePosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/AuthorType;Ljava/util/Date;Lzendesk/conversationkit/android/internal/faye/WsResponseTimeDto;Ljava/lang/Long;Ljava/lang/Long;)Lzendesk/conversationkit/android/model/ActivityEvent;", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivityEvent {

    @Nullable
    private final ActivityData activityData;

    @NotNull
    private final String conversationId;

    @Nullable
    private final Date lastRead;

    @Nullable
    private final Long lowestQueuePosition;

    @Nullable
    private final Long queuePosition;

    @Nullable
    private final WsResponseTimeDto responseTime;

    @Nullable
    private final AuthorType role;

    @Nullable
    private final String userAvatarUrl;

    @Nullable
    private final String userId;

    @Nullable
    private final String userName;

    public /* synthetic */ ActivityEvent(String str, ActivityData activityData, String str2, String str3, String str4, AuthorType authorType, Date date, WsResponseTimeDto wsResponseTimeDto, Long l, Long l7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, activityData, str2, str3, str4, authorType, date, (i11 & 128) != 0 ? null : wsResponseTimeDto, l, l7);
    }

    public static /* synthetic */ ActivityEvent copy$default(ActivityEvent activityEvent, String str, ActivityData activityData, String str2, String str3, String str4, AuthorType authorType, Date date, WsResponseTimeDto wsResponseTimeDto, Long l, Long l7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = activityEvent.conversationId;
        }
        if ((i11 & 2) != 0) {
            activityData = activityEvent.activityData;
        }
        if ((i11 & 4) != 0) {
            str2 = activityEvent.userId;
        }
        if ((i11 & 8) != 0) {
            str3 = activityEvent.userName;
        }
        if ((i11 & 16) != 0) {
            str4 = activityEvent.userAvatarUrl;
        }
        if ((i11 & 32) != 0) {
            authorType = activityEvent.role;
        }
        if ((i11 & 64) != 0) {
            date = activityEvent.lastRead;
        }
        if ((i11 & 128) != 0) {
            wsResponseTimeDto = activityEvent.responseTime;
        }
        if ((i11 & 256) != 0) {
            l = activityEvent.queuePosition;
        }
        if ((i11 & 512) != 0) {
            l7 = activityEvent.lowestQueuePosition;
        }
        Long l11 = l;
        Long l12 = l7;
        Date date2 = date;
        WsResponseTimeDto wsResponseTimeDto2 = wsResponseTimeDto;
        String str5 = str4;
        AuthorType authorType2 = authorType;
        return activityEvent.copy(str, activityData, str2, str3, str5, authorType2, date2, wsResponseTimeDto2, l11, l12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getLowestQueuePosition() {
        return this.lowestQueuePosition;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActivityData getActivityData() {
        return this.activityData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AuthorType getRole() {
        return this.role;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getLastRead() {
        return this.lastRead;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WsResponseTimeDto getResponseTime() {
        return this.responseTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getQueuePosition() {
        return this.queuePosition;
    }

    @NotNull
    public final ActivityEvent copy(@NotNull String conversationId, @Nullable ActivityData activityData, @Nullable String userId, @Nullable String userName, @Nullable String userAvatarUrl, @Nullable AuthorType role, @Nullable Date lastRead, @Nullable WsResponseTimeDto responseTime, @Nullable Long queuePosition, @Nullable Long lowestQueuePosition) {
        conversationId.getClass();
        return new ActivityEvent(conversationId, activityData, userId, userName, userAvatarUrl, role, lastRead, responseTime, queuePosition, lowestQueuePosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityEvent)) {
            return false;
        }
        ActivityEvent activityEvent = (ActivityEvent) other;
        return Intrinsics.areEqual(this.conversationId, activityEvent.conversationId) && this.activityData == activityEvent.activityData && Intrinsics.areEqual(this.userId, activityEvent.userId) && Intrinsics.areEqual(this.userName, activityEvent.userName) && Intrinsics.areEqual(this.userAvatarUrl, activityEvent.userAvatarUrl) && this.role == activityEvent.role && Intrinsics.areEqual(this.lastRead, activityEvent.lastRead) && Intrinsics.areEqual(this.responseTime, activityEvent.responseTime) && Intrinsics.areEqual(this.queuePosition, activityEvent.queuePosition) && Intrinsics.areEqual(this.lowestQueuePosition, activityEvent.lowestQueuePosition);
    }

    @Nullable
    public final ActivityData getActivityData() {
        return this.activityData;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final Date getLastRead() {
        return this.lastRead;
    }

    @Nullable
    public final Long getLowestQueuePosition() {
        return this.lowestQueuePosition;
    }

    @Nullable
    public final Long getQueuePosition() {
        return this.queuePosition;
    }

    @Nullable
    public final WsResponseTimeDto getResponseTime() {
        return this.responseTime;
    }

    @Nullable
    public final AuthorType getRole() {
        return this.role;
    }

    @Nullable
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = this.conversationId.hashCode() * 31;
        ActivityData activityData = this.activityData;
        int iHashCode2 = (iHashCode + (activityData == null ? 0 : activityData.hashCode())) * 31;
        String str = this.userId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userAvatarUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AuthorType authorType = this.role;
        int iHashCode6 = (iHashCode5 + (authorType == null ? 0 : authorType.hashCode())) * 31;
        Date date = this.lastRead;
        int iHashCode7 = (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        WsResponseTimeDto wsResponseTimeDto = this.responseTime;
        int iHashCode8 = (iHashCode7 + (wsResponseTimeDto == null ? 0 : wsResponseTimeDto.hashCode())) * 31;
        Long l = this.queuePosition;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l7 = this.lowestQueuePosition;
        return iHashCode9 + (l7 != null ? l7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.conversationId;
        ActivityData activityData = this.activityData;
        String str2 = this.userId;
        String str3 = this.userName;
        String str4 = this.userAvatarUrl;
        AuthorType authorType = this.role;
        Date date = this.lastRead;
        WsResponseTimeDto wsResponseTimeDto = this.responseTime;
        Long l = this.queuePosition;
        Long l7 = this.lowestQueuePosition;
        StringBuilder sb2 = new StringBuilder("ActivityEvent(conversationId=");
        sb2.append(str);
        sb2.append(", activityData=");
        sb2.append(activityData);
        sb2.append(", userId=");
        s.A(sb2, str2, ", userName=", str3, ", userAvatarUrl=");
        sb2.append(str4);
        sb2.append(", role=");
        sb2.append(authorType);
        sb2.append(", lastRead=");
        sb2.append(date);
        sb2.append(", responseTime=");
        sb2.append(wsResponseTimeDto);
        sb2.append(", queuePosition=");
        sb2.append(l);
        sb2.append(", lowestQueuePosition=");
        sb2.append(l7);
        sb2.append(")");
        return sb2.toString();
    }

    public ActivityEvent(@NotNull String str, @Nullable ActivityData activityData, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable AuthorType authorType, @Nullable Date date, @Nullable WsResponseTimeDto wsResponseTimeDto, @Nullable Long l, @Nullable Long l7) {
        str.getClass();
        this.conversationId = str;
        this.activityData = activityData;
        this.userId = str2;
        this.userName = str3;
        this.userAvatarUrl = str4;
        this.role = authorType;
        this.lastRead = date;
        this.responseTime = wsResponseTimeDto;
        this.queuePosition = l;
        this.lowestQueuePosition = l7;
    }
}
