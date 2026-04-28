package zendesk.core.ui.android.internal.model;

import a80.a;
import b3.i;
import e0.f;
import j4.s;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;
import w2.l1;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/core/ui/android/internal/model/ConversationEntry;", "", "id", "", "dateTimeStamp", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "getDateTimeStamp", "()Ljava/util/Date;", "ConversationItem", "LoadMore", "LoadMoreStatus", "Companion", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalZendeskUIApi
public abstract class ConversationEntry {

    @Nullable
    private final Date dateTimeStamp;

    @NotNull
    private final String id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String LOAD_MORE_ID = s.e();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0011\u001a\u00020\r\u0012\b\b\u0001\u0010\u0012\u001a\u00020\r\u0012\b\b\u0001\u0010\u0013\u001a\u00020\r\u0012\b\b\u0001\u0010\u0014\u001a\u00020\r\u0012\b\b\u0001\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\t\u0010:\u001a\u00020\rHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J·\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\r2\b\b\u0003\u0010\u0012\u001a\u00020\r2\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0015\u001a\u00020\rHÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\rHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#¨\u0006D"}, d2 = {"Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "id", "", "dateTimeStamp", "Ljava/util/Date;", "formattedDateTimeStampString", "participantName", "conversationTitle", "avatarUrl", "latestMessage", "latestMessageOwner", "unreadMessages", "", "accessibilityTitle", "unreadMessagesCountBackgroundColor", "unreadMessagesCountTextColor", "dateTimestampTextColor", "lastMessageTextColor", "conversationParticipantsTextColor", "conversationTitleTextColor", "conversationCellDividerColor", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIIIIII)V", "getId", "()Ljava/lang/String;", "getDateTimeStamp", "()Ljava/util/Date;", "getFormattedDateTimeStampString", "getParticipantName", "getConversationTitle", "getAvatarUrl", "getLatestMessage", "getLatestMessageOwner", "getUnreadMessages", "()I", "getAccessibilityTitle", "getUnreadMessagesCountBackgroundColor", "getUnreadMessagesCountTextColor", "getDateTimestampTextColor", "getLastMessageTextColor", "getConversationParticipantsTextColor", "getConversationTitleTextColor", "getConversationCellDividerColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "", "hashCode", "toString", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationItem extends ConversationEntry {
        public static final int $stable = 0;

        @NotNull
        private final String accessibilityTitle;

        @NotNull
        private final String avatarUrl;
        private final int conversationCellDividerColor;
        private final int conversationParticipantsTextColor;

        @NotNull
        private final String conversationTitle;
        private final int conversationTitleTextColor;

        @Nullable
        private final Date dateTimeStamp;
        private final int dateTimestampTextColor;

        @NotNull
        private final String formattedDateTimeStampString;

        @NotNull
        private final String id;
        private final int lastMessageTextColor;

        @NotNull
        private final String latestMessage;

        @Nullable
        private final String latestMessageOwner;

        @NotNull
        private final String participantName;
        private final int unreadMessages;
        private final int unreadMessagesCountBackgroundColor;
        private final int unreadMessagesCountTextColor;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ConversationItem(java.lang.String r22, java.util.Date r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
            /*
                r21 = this;
                r0 = r39
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L9
                r5 = r2
                goto Lb
            L9:
                r5 = r23
            Lb:
                r1 = r0 & 4
                java.lang.String r3 = ""
                if (r1 == 0) goto L13
                r6 = r3
                goto L15
            L13:
                r6 = r24
            L15:
                r1 = r0 & 8
                if (r1 == 0) goto L1b
                r7 = r3
                goto L1d
            L1b:
                r7 = r25
            L1d:
                r1 = r0 & 16
                if (r1 == 0) goto L23
                r8 = r3
                goto L25
            L23:
                r8 = r26
            L25:
                r1 = r0 & 32
                if (r1 == 0) goto L2b
                r9 = r3
                goto L2d
            L2b:
                r9 = r27
            L2d:
                r1 = r0 & 64
                if (r1 == 0) goto L33
                r10 = r3
                goto L35
            L33:
                r10 = r28
            L35:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L3b
                r11 = r2
                goto L3d
            L3b:
                r11 = r29
            L3d:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L44
                r1 = 0
                r12 = r1
                goto L46
            L44:
                r12 = r30
            L46:
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 == 0) goto L5e
                r13 = r3
                r4 = r22
                r14 = r32
                r15 = r33
                r16 = r34
                r17 = r35
                r18 = r36
                r19 = r37
                r20 = r38
                r3 = r21
                goto L72
            L5e:
                r13 = r31
                r3 = r21
                r4 = r22
                r14 = r32
                r15 = r33
                r16 = r34
                r17 = r35
                r18 = r36
                r19 = r37
                r20 = r38
            L72:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.core.ui.android.internal.model.ConversationEntry.ConversationItem.<init>(java.lang.String, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ ConversationItem copy$default(ConversationItem conversationItem, String str, Date date, String str2, String str3, String str4, String str5, String str6, String str7, int i11, String str8, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
            int i21;
            int i22;
            String str9;
            ConversationItem conversationItem2;
            int i23;
            Date date2;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            int i24;
            String str16;
            int i25;
            int i26;
            int i27;
            int i28;
            String str17 = (i19 & 1) != 0 ? conversationItem.id : str;
            Date date3 = (i19 & 2) != 0 ? conversationItem.dateTimeStamp : date;
            String str18 = (i19 & 4) != 0 ? conversationItem.formattedDateTimeStampString : str2;
            String str19 = (i19 & 8) != 0 ? conversationItem.participantName : str3;
            String str20 = (i19 & 16) != 0 ? conversationItem.conversationTitle : str4;
            String str21 = (i19 & 32) != 0 ? conversationItem.avatarUrl : str5;
            String str22 = (i19 & 64) != 0 ? conversationItem.latestMessage : str6;
            String str23 = (i19 & 128) != 0 ? conversationItem.latestMessageOwner : str7;
            int i29 = (i19 & 256) != 0 ? conversationItem.unreadMessages : i11;
            String str24 = (i19 & 512) != 0 ? conversationItem.accessibilityTitle : str8;
            int i31 = (i19 & 1024) != 0 ? conversationItem.unreadMessagesCountBackgroundColor : i12;
            int i32 = (i19 & NewHope.SENDB_BYTES) != 0 ? conversationItem.unreadMessagesCountTextColor : i13;
            int i33 = (i19 & 4096) != 0 ? conversationItem.dateTimestampTextColor : i14;
            int i34 = (i19 & 8192) != 0 ? conversationItem.lastMessageTextColor : i15;
            String str25 = str17;
            int i35 = (i19 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationItem.conversationParticipantsTextColor : i16;
            int i36 = (i19 & 32768) != 0 ? conversationItem.conversationTitleTextColor : i17;
            if ((i19 & 65536) != 0) {
                i22 = i36;
                i21 = conversationItem.conversationCellDividerColor;
                i23 = i35;
                date2 = date3;
                str10 = str18;
                str11 = str19;
                str12 = str20;
                str13 = str21;
                str14 = str22;
                str15 = str23;
                i24 = i29;
                str16 = str24;
                i25 = i31;
                i26 = i32;
                i27 = i33;
                i28 = i34;
                str9 = str25;
                conversationItem2 = conversationItem;
            } else {
                i21 = i18;
                i22 = i36;
                str9 = str25;
                conversationItem2 = conversationItem;
                i23 = i35;
                date2 = date3;
                str10 = str18;
                str11 = str19;
                str12 = str20;
                str13 = str21;
                str14 = str22;
                str15 = str23;
                i24 = i29;
                str16 = str24;
                i25 = i31;
                i26 = i32;
                i27 = i33;
                i28 = i34;
            }
            return conversationItem2.copy(str9, date2, str10, str11, str12, str13, str14, str15, i24, str16, i25, i26, i27, i28, i23, i22, i21);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getAccessibilityTitle() {
            return this.accessibilityTitle;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final int getUnreadMessagesCountBackgroundColor() {
            return this.unreadMessagesCountBackgroundColor;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final int getUnreadMessagesCountTextColor() {
            return this.unreadMessagesCountTextColor;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getDateTimestampTextColor() {
            return this.dateTimestampTextColor;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final int getLastMessageTextColor() {
            return this.lastMessageTextColor;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getConversationParticipantsTextColor() {
            return this.conversationParticipantsTextColor;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final int getConversationTitleTextColor() {
            return this.conversationTitleTextColor;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final int getConversationCellDividerColor() {
            return this.conversationCellDividerColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Date getDateTimeStamp() {
            return this.dateTimeStamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFormattedDateTimeStampString() {
            return this.formattedDateTimeStampString;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getParticipantName() {
            return this.participantName;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getConversationTitle() {
            return this.conversationTitle;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getLatestMessage() {
            return this.latestMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getLatestMessageOwner() {
            return this.latestMessageOwner;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int getUnreadMessages() {
            return this.unreadMessages;
        }

        @NotNull
        public final ConversationItem copy(@NotNull String id2, @Nullable Date dateTimeStamp, @NotNull String formattedDateTimeStampString, @NotNull String participantName, @NotNull String conversationTitle, @NotNull String avatarUrl, @NotNull String latestMessage, @Nullable String latestMessageOwner, int unreadMessages, @NotNull String accessibilityTitle, int unreadMessagesCountBackgroundColor, int unreadMessagesCountTextColor, int dateTimestampTextColor, int lastMessageTextColor, int conversationParticipantsTextColor, int conversationTitleTextColor, int conversationCellDividerColor) {
            i.B(id2, formattedDateTimeStampString, participantName, conversationTitle, avatarUrl);
            latestMessage.getClass();
            accessibilityTitle.getClass();
            return new ConversationItem(id2, dateTimeStamp, formattedDateTimeStampString, participantName, conversationTitle, avatarUrl, latestMessage, latestMessageOwner, unreadMessages, accessibilityTitle, unreadMessagesCountBackgroundColor, unreadMessagesCountTextColor, dateTimestampTextColor, lastMessageTextColor, conversationParticipantsTextColor, conversationTitleTextColor, conversationCellDividerColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationItem)) {
                return false;
            }
            ConversationItem conversationItem = (ConversationItem) other;
            return Intrinsics.areEqual(this.id, conversationItem.id) && Intrinsics.areEqual(this.dateTimeStamp, conversationItem.dateTimeStamp) && Intrinsics.areEqual(this.formattedDateTimeStampString, conversationItem.formattedDateTimeStampString) && Intrinsics.areEqual(this.participantName, conversationItem.participantName) && Intrinsics.areEqual(this.conversationTitle, conversationItem.conversationTitle) && Intrinsics.areEqual(this.avatarUrl, conversationItem.avatarUrl) && Intrinsics.areEqual(this.latestMessage, conversationItem.latestMessage) && Intrinsics.areEqual(this.latestMessageOwner, conversationItem.latestMessageOwner) && this.unreadMessages == conversationItem.unreadMessages && Intrinsics.areEqual(this.accessibilityTitle, conversationItem.accessibilityTitle) && this.unreadMessagesCountBackgroundColor == conversationItem.unreadMessagesCountBackgroundColor && this.unreadMessagesCountTextColor == conversationItem.unreadMessagesCountTextColor && this.dateTimestampTextColor == conversationItem.dateTimestampTextColor && this.lastMessageTextColor == conversationItem.lastMessageTextColor && this.conversationParticipantsTextColor == conversationItem.conversationParticipantsTextColor && this.conversationTitleTextColor == conversationItem.conversationTitleTextColor && this.conversationCellDividerColor == conversationItem.conversationCellDividerColor;
        }

        @NotNull
        public final String getAccessibilityTitle() {
            return this.accessibilityTitle;
        }

        @NotNull
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final int getConversationCellDividerColor() {
            return this.conversationCellDividerColor;
        }

        public final int getConversationParticipantsTextColor() {
            return this.conversationParticipantsTextColor;
        }

        @NotNull
        public final String getConversationTitle() {
            return this.conversationTitle;
        }

        public final int getConversationTitleTextColor() {
            return this.conversationTitleTextColor;
        }

        @Override // zendesk.core.ui.android.internal.model.ConversationEntry
        @Nullable
        public Date getDateTimeStamp() {
            return this.dateTimeStamp;
        }

        public final int getDateTimestampTextColor() {
            return this.dateTimestampTextColor;
        }

        @NotNull
        public final String getFormattedDateTimeStampString() {
            return this.formattedDateTimeStampString;
        }

        @Override // zendesk.core.ui.android.internal.model.ConversationEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        public final int getLastMessageTextColor() {
            return this.lastMessageTextColor;
        }

        @NotNull
        public final String getLatestMessage() {
            return this.latestMessage;
        }

        @Nullable
        public final String getLatestMessageOwner() {
            return this.latestMessageOwner;
        }

        @NotNull
        public final String getParticipantName() {
            return this.participantName;
        }

        public final int getUnreadMessages() {
            return this.unreadMessages;
        }

        public final int getUnreadMessagesCountBackgroundColor() {
            return this.unreadMessagesCountBackgroundColor;
        }

        public final int getUnreadMessagesCountTextColor() {
            return this.unreadMessagesCountTextColor;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Date date = this.dateTimeStamp;
            int iB = l1.b(l1.b(l1.b(l1.b(l1.b((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.formattedDateTimeStampString), 31, this.participantName), 31, this.conversationTitle), 31, this.avatarUrl), 31, this.latestMessage);
            String str = this.latestMessageOwner;
            return Integer.hashCode(this.conversationCellDividerColor) + k.b(this.conversationTitleTextColor, k.b(this.conversationParticipantsTextColor, k.b(this.lastMessageTextColor, k.b(this.dateTimestampTextColor, k.b(this.unreadMessagesCountTextColor, k.b(this.unreadMessagesCountBackgroundColor, l1.b(k.b(this.unreadMessages, (iB + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.accessibilityTitle), 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            Date date = this.dateTimeStamp;
            String str2 = this.formattedDateTimeStampString;
            String str3 = this.participantName;
            String str4 = this.conversationTitle;
            String str5 = this.avatarUrl;
            String str6 = this.latestMessage;
            String str7 = this.latestMessageOwner;
            int i11 = this.unreadMessages;
            String str8 = this.accessibilityTitle;
            int i12 = this.unreadMessagesCountBackgroundColor;
            int i13 = this.unreadMessagesCountTextColor;
            int i14 = this.dateTimestampTextColor;
            int i15 = this.lastMessageTextColor;
            int i16 = this.conversationParticipantsTextColor;
            int i17 = this.conversationTitleTextColor;
            int i18 = this.conversationCellDividerColor;
            StringBuilder sb2 = new StringBuilder("ConversationItem(id=");
            sb2.append(str);
            sb2.append(", dateTimeStamp=");
            sb2.append(date);
            sb2.append(", formattedDateTimeStampString=");
            s.A(sb2, str2, ", participantName=", str3, ", conversationTitle=");
            s.A(sb2, str4, ", avatarUrl=", str5, ", latestMessage=");
            s.A(sb2, str6, ", latestMessageOwner=", str7, ", unreadMessages=");
            sb2.append(i11);
            sb2.append(", accessibilityTitle=");
            sb2.append(str8);
            sb2.append(", unreadMessagesCountBackgroundColor=");
            f.C(sb2, i12, ", unreadMessagesCountTextColor=", i13, ", dateTimestampTextColor=");
            f.C(sb2, i14, ", lastMessageTextColor=", i15, ", conversationParticipantsTextColor=");
            f.C(sb2, i16, ", conversationTitleTextColor=", i17, ", conversationCellDividerColor=");
            return k.i(i18, ")", sb2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationItem(@NotNull String str, @Nullable Date date, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7, int i11, @NotNull String str8, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            super(str, date, null);
            i.B(str, str2, str3, str4, str5);
            str6.getClass();
            str8.getClass();
            this.id = str;
            this.dateTimeStamp = date;
            this.formattedDateTimeStampString = str2;
            this.participantName = str3;
            this.conversationTitle = str4;
            this.avatarUrl = str5;
            this.latestMessage = str6;
            this.latestMessageOwner = str7;
            this.unreadMessages = i11;
            this.accessibilityTitle = str8;
            this.unreadMessagesCountBackgroundColor = i12;
            this.unreadMessagesCountTextColor = i13;
            this.dateTimestampTextColor = i14;
            this.lastMessageTextColor = i15;
            this.conversationParticipantsTextColor = i16;
            this.conversationTitleTextColor = i17;
            this.conversationCellDividerColor = i18;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "FAILED", "NONE", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadMoreStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LoadMoreStatus[] $VALUES;
        public static final LoadMoreStatus LOADING = new LoadMoreStatus("LOADING", 0);
        public static final LoadMoreStatus FAILED = new LoadMoreStatus("FAILED", 1);
        public static final LoadMoreStatus NONE = new LoadMoreStatus("NONE", 2);

        private static final /* synthetic */ LoadMoreStatus[] $values() {
            return new LoadMoreStatus[]{LOADING, FAILED, NONE};
        }

        static {
            LoadMoreStatus[] loadMoreStatusArr$values = $values();
            $VALUES = loadMoreStatusArr$values;
            $ENTRIES = n.w(loadMoreStatusArr$values);
        }

        private LoadMoreStatus(String str, int i11) {
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static LoadMoreStatus valueOf(String str) {
            return (LoadMoreStatus) Enum.valueOf(LoadMoreStatus.class, str);
        }

        public static LoadMoreStatus[] values() {
            return (LoadMoreStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ConversationEntry(String str, Date date, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : date, null);
    }

    @Nullable
    public Date getDateTimeStamp() {
        return this.dateTimeStamp;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzendesk/core/ui/android/internal/model/ConversationEntry$Companion;", "", "<init>", "()V", "LOAD_MORE_ID", "", "getLOAD_MORE_ID", "()Ljava/lang/String;", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getLOAD_MORE_ID() {
            return ConversationEntry.LOAD_MORE_ID;
        }

        private Companion() {
        }
    }

    private ConversationEntry(String str, Date date) {
        this.id = str;
        this.dateTimeStamp = date;
    }

    public /* synthetic */ ConversationEntry(String str, Date date, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "id", "", "failedRetryTextColor", "", "progressBarColor", "status", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "retryText", "<init>", "(Ljava/lang/String;IILzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFailedRetryTextColor", "()I", "getProgressBarColor", "getStatus", "()Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "getRetryText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadMore extends ConversationEntry {
        public static final int $stable = 0;
        private final int failedRetryTextColor;

        @NotNull
        private final String id;
        private final int progressBarColor;

        @NotNull
        private final String retryText;

        @NotNull
        private final LoadMoreStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LoadMore(@NotNull String str, int i11, int i12, @NotNull LoadMoreStatus loadMoreStatus, @NotNull String str2) {
            super(str, null, 2, 0 == true ? 1 : 0);
            str.getClass();
            loadMoreStatus.getClass();
            str2.getClass();
            this.id = str;
            this.failedRetryTextColor = i11;
            this.progressBarColor = i12;
            this.status = loadMoreStatus;
            this.retryText = str2;
        }

        public static /* synthetic */ LoadMore copy$default(LoadMore loadMore, String str, int i11, int i12, LoadMoreStatus loadMoreStatus, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = loadMore.id;
            }
            if ((i13 & 2) != 0) {
                i11 = loadMore.failedRetryTextColor;
            }
            if ((i13 & 4) != 0) {
                i12 = loadMore.progressBarColor;
            }
            if ((i13 & 8) != 0) {
                loadMoreStatus = loadMore.status;
            }
            if ((i13 & 16) != 0) {
                str2 = loadMore.retryText;
            }
            String str3 = str2;
            int i14 = i12;
            return loadMore.copy(str, i11, i14, loadMoreStatus, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getFailedRetryTextColor() {
            return this.failedRetryTextColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getProgressBarColor() {
            return this.progressBarColor;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final LoadMoreStatus getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getRetryText() {
            return this.retryText;
        }

        @NotNull
        public final LoadMore copy(@NotNull String id2, int failedRetryTextColor, int progressBarColor, @NotNull LoadMoreStatus status, @NotNull String retryText) {
            id2.getClass();
            status.getClass();
            retryText.getClass();
            return new LoadMore(id2, failedRetryTextColor, progressBarColor, status, retryText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMore)) {
                return false;
            }
            LoadMore loadMore = (LoadMore) other;
            return Intrinsics.areEqual(this.id, loadMore.id) && this.failedRetryTextColor == loadMore.failedRetryTextColor && this.progressBarColor == loadMore.progressBarColor && this.status == loadMore.status && Intrinsics.areEqual(this.retryText, loadMore.retryText);
        }

        public final int getFailedRetryTextColor() {
            return this.failedRetryTextColor;
        }

        @Override // zendesk.core.ui.android.internal.model.ConversationEntry
        @NotNull
        public String getId() {
            return this.id;
        }

        public final int getProgressBarColor() {
            return this.progressBarColor;
        }

        @NotNull
        public final String getRetryText() {
            return this.retryText;
        }

        @NotNull
        public final LoadMoreStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.retryText.hashCode() + ((this.status.hashCode() + k.b(this.progressBarColor, k.b(this.failedRetryTextColor, this.id.hashCode() * 31, 31), 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            int i11 = this.failedRetryTextColor;
            int i12 = this.progressBarColor;
            LoadMoreStatus loadMoreStatus = this.status;
            String str2 = this.retryText;
            StringBuilder sb2 = new StringBuilder("LoadMore(id=");
            sb2.append(str);
            sb2.append(", failedRetryTextColor=");
            sb2.append(i11);
            sb2.append(", progressBarColor=");
            sb2.append(i12);
            sb2.append(", status=");
            sb2.append(loadMoreStatus);
            sb2.append(", retryText=");
            return k.p(sb2, str2, ")");
        }

        public /* synthetic */ LoadMore(String str, int i11, int i12, LoadMoreStatus loadMoreStatus, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? ConversationEntry.INSTANCE.getLOAD_MORE_ID() : str, i11, i12, loadMoreStatus, str2);
        }
    }
}
