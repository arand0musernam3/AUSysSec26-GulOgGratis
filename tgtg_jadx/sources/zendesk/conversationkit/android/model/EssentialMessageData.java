package zendesk.conversationkit.android.model;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Ju\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00065"}, d2 = {"Lzendesk/conversationkit/android/model/EssentialMessageData;", "", "id", "", "author", "Lzendesk/conversationkit/android/model/Author;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", "received", "Ljava/util/Date;", "created", "content", "Lzendesk/conversationkit/android/model/MessageContent;", "metadata", "", "sourceId", "localId", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Author;Lzendesk/conversationkit/android/model/MessageStatus;Ljava/util/Date;Ljava/util/Date;Lzendesk/conversationkit/android/model/MessageContent;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "(Lzendesk/conversationkit/android/model/Message;)V", "getId", "()Ljava/lang/String;", "getAuthor", "()Lzendesk/conversationkit/android/model/Author;", "getStatus", "()Lzendesk/conversationkit/android/model/MessageStatus;", "getReceived", "()Ljava/util/Date;", "getCreated", "getContent", "()Lzendesk/conversationkit/android/model/MessageContent;", "getMetadata", "()Ljava/util/Map;", "getSourceId", "getLocalId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EssentialMessageData {

    @NotNull
    private final Author author;

    @NotNull
    private final MessageContent content;

    @Nullable
    private final Date created;

    @NotNull
    private final String id;

    @NotNull
    private final String localId;

    @Nullable
    private final Map<String, Object> metadata;

    @NotNull
    private final Date received;

    @Nullable
    private final String sourceId;

    @NotNull
    private final MessageStatus status;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EssentialMessageData(@NotNull Message message) {
        this(message.getId(), message.getAuthor(), message.getStatus(), message.getReceived(), message.getCreated(), message.getContent(), message.getMetadata(), message.getSourceId(), message.getLocalId());
        message.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EssentialMessageData copy$default(EssentialMessageData essentialMessageData, String str, Author author, MessageStatus messageStatus, Date date, Date date2, MessageContent messageContent, Map map, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = essentialMessageData.id;
        }
        if ((i11 & 2) != 0) {
            author = essentialMessageData.author;
        }
        if ((i11 & 4) != 0) {
            messageStatus = essentialMessageData.status;
        }
        if ((i11 & 8) != 0) {
            date = essentialMessageData.received;
        }
        if ((i11 & 16) != 0) {
            date2 = essentialMessageData.created;
        }
        if ((i11 & 32) != 0) {
            messageContent = essentialMessageData.content;
        }
        if ((i11 & 64) != 0) {
            map = essentialMessageData.metadata;
        }
        if ((i11 & 128) != 0) {
            str2 = essentialMessageData.sourceId;
        }
        if ((i11 & 256) != 0) {
            str3 = essentialMessageData.localId;
        }
        String str4 = str2;
        String str5 = str3;
        MessageContent messageContent2 = messageContent;
        Map map2 = map;
        Date date3 = date2;
        MessageStatus messageStatus2 = messageStatus;
        return essentialMessageData.copy(str, author, messageStatus2, date, date3, messageContent2, map2, str4, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Author getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getReceived() {
        return this.received;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated() {
        return this.created;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MessageContent getContent() {
        return this.content;
    }

    @Nullable
    public final Map<String, Object> component7() {
        return this.metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    @NotNull
    public final EssentialMessageData copy(@NotNull String id2, @NotNull Author author, @NotNull MessageStatus status, @NotNull Date received, @Nullable Date created, @NotNull MessageContent content, @Nullable Map<String, ? extends Object> metadata, @Nullable String sourceId, @NotNull String localId) {
        id2.getClass();
        author.getClass();
        status.getClass();
        received.getClass();
        content.getClass();
        localId.getClass();
        return new EssentialMessageData(id2, author, status, received, created, content, metadata, sourceId, localId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EssentialMessageData)) {
            return false;
        }
        EssentialMessageData essentialMessageData = (EssentialMessageData) other;
        return Intrinsics.areEqual(this.id, essentialMessageData.id) && Intrinsics.areEqual(this.author, essentialMessageData.author) && Intrinsics.areEqual(this.status, essentialMessageData.status) && Intrinsics.areEqual(this.received, essentialMessageData.received) && Intrinsics.areEqual(this.created, essentialMessageData.created) && Intrinsics.areEqual(this.content, essentialMessageData.content) && Intrinsics.areEqual(this.metadata, essentialMessageData.metadata) && Intrinsics.areEqual(this.sourceId, essentialMessageData.sourceId) && Intrinsics.areEqual(this.localId, essentialMessageData.localId);
    }

    @NotNull
    public final Author getAuthor() {
        return this.author;
    }

    @NotNull
    public final MessageContent getContent() {
        return this.content;
    }

    @Nullable
    public final Date getCreated() {
        return this.created;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLocalId() {
        return this.localId;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Date getReceived() {
        return this.received;
    }

    @Nullable
    public final String getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final MessageStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.received.hashCode() + ((this.status.hashCode() + ((this.author.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31;
        Date date = this.created;
        int iHashCode2 = (this.content.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31;
        Map<String, Object> map = this.metadata;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.sourceId;
        return this.localId.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Author author = this.author;
        MessageStatus messageStatus = this.status;
        Date date = this.received;
        Date date2 = this.created;
        MessageContent messageContent = this.content;
        Map<String, Object> map = this.metadata;
        String str2 = this.sourceId;
        String str3 = this.localId;
        StringBuilder sb2 = new StringBuilder("EssentialMessageData(id=");
        sb2.append(str);
        sb2.append(", author=");
        sb2.append(author);
        sb2.append(", status=");
        sb2.append(messageStatus);
        sb2.append(", received=");
        sb2.append(date);
        sb2.append(", created=");
        sb2.append(date2);
        sb2.append(", content=");
        sb2.append(messageContent);
        sb2.append(", metadata=");
        sb2.append(map);
        sb2.append(", sourceId=");
        sb2.append(str2);
        sb2.append(", localId=");
        return k.p(sb2, str3, ")");
    }

    public EssentialMessageData(@NotNull String str, @NotNull Author author, @NotNull MessageStatus messageStatus, @NotNull Date date, @Nullable Date date2, @NotNull MessageContent messageContent, @Nullable Map<String, ? extends Object> map, @Nullable String str2, @NotNull String str3) {
        str.getClass();
        author.getClass();
        messageStatus.getClass();
        date.getClass();
        messageContent.getClass();
        str3.getClass();
        this.id = str;
        this.author = author;
        this.status = messageStatus;
        this.received = date;
        this.created = date2;
        this.content = messageContent;
        this.metadata = map;
        this.sourceId = str2;
        this.localId = str3;
    }
}
