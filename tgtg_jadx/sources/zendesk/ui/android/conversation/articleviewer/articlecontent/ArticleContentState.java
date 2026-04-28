package zendesk.ui.android.conversation.articleviewer.articlecontent;

import android.net.Uri;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;
import w2.l1;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u000256Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0003\u0010\r\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b(J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÀ\u0003¢\u0006\u0002\b*J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003Jk\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u00067"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "", "articleData", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;", "textColor", "", "backgroundColor", "indicatorColor", "status", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "attachmentList", "", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "attachmentListTextColor", "navigationButtonBackgroundColor", "focusedStateBorderColor", "<init>", "(Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;IIILzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;Ljava/util/List;III)V", "getArticleData$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;", "getTextColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "getIndicatorColor$zendesk_ui_ui_android", "getStatus$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "getAttachmentList$zendesk_ui_ui_android", "()Ljava/util/List;", "getAttachmentListTextColor", "getNavigationButtonBackgroundColor", "getFocusedStateBorderColor", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "ArticleData", "ArticleLoadingStatus", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleContentState {
    public static final int $stable = 8;

    @Nullable
    private final ArticleData articleData;

    @NotNull
    private final List<ArticleAttachmentItem> attachmentList;
    private final int attachmentListTextColor;
    private final int backgroundColor;
    private final int focusedStateBorderColor;
    private final int indicatorColor;
    private final int navigationButtonBackgroundColor;

    @NotNull
    private final ArticleLoadingStatus status;
    private final int textColor;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;", "", "htmlUrl", "Landroid/net/Uri;", MessageBundle.TITLE_ENTRY, "", "htmlBody", "baseUrl", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHtmlUrl", "()Landroid/net/Uri;", "getTitle", "()Ljava/lang/String;", "getHtmlBody", "getBaseUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ArticleData {
        public static final int $stable = 8;

        @NotNull
        private final String baseUrl;

        @NotNull
        private final String htmlBody;

        @NotNull
        private final Uri htmlUrl;

        @NotNull
        private final String title;

        public ArticleData(@NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            uri.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.htmlUrl = uri;
            this.title = str;
            this.htmlBody = str2;
            this.baseUrl = str3;
        }

        public static /* synthetic */ ArticleData copy$default(ArticleData articleData, Uri uri, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uri = articleData.htmlUrl;
            }
            if ((i11 & 2) != 0) {
                str = articleData.title;
            }
            if ((i11 & 4) != 0) {
                str2 = articleData.htmlBody;
            }
            if ((i11 & 8) != 0) {
                str3 = articleData.baseUrl;
            }
            return articleData.copy(uri, str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Uri getHtmlUrl() {
            return this.htmlUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHtmlBody() {
            return this.htmlBody;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        @NotNull
        public final ArticleData copy(@NotNull Uri htmlUrl, @NotNull String title, @NotNull String htmlBody, @NotNull String baseUrl) {
            htmlUrl.getClass();
            title.getClass();
            htmlBody.getClass();
            baseUrl.getClass();
            return new ArticleData(htmlUrl, title, htmlBody, baseUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArticleData)) {
                return false;
            }
            ArticleData articleData = (ArticleData) other;
            return Intrinsics.areEqual(this.htmlUrl, articleData.htmlUrl) && Intrinsics.areEqual(this.title, articleData.title) && Intrinsics.areEqual(this.htmlBody, articleData.htmlBody) && Intrinsics.areEqual(this.baseUrl, articleData.baseUrl);
        }

        @NotNull
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        @NotNull
        public final String getHtmlBody() {
            return this.htmlBody;
        }

        @NotNull
        public final Uri getHtmlUrl() {
            return this.htmlUrl;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.baseUrl.hashCode() + l1.b(l1.b(this.htmlUrl.hashCode() * 31, 31, this.title), 31, this.htmlBody);
        }

        @NotNull
        public String toString() {
            Uri uri = this.htmlUrl;
            String str = this.title;
            String str2 = this.htmlBody;
            String str3 = this.baseUrl;
            StringBuilder sb2 = new StringBuilder("ArticleData(htmlUrl=");
            sb2.append(uri);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", htmlBody=");
            return f.o(sb2, str2, ", baseUrl=", str3, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "LOADING", "FAILED", "SUCCESS", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ArticleLoadingStatus {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ ArticleLoadingStatus[] $VALUES;
        public static final ArticleLoadingStatus IDLE = new ArticleLoadingStatus("IDLE", 0);
        public static final ArticleLoadingStatus LOADING = new ArticleLoadingStatus("LOADING", 1);
        public static final ArticleLoadingStatus FAILED = new ArticleLoadingStatus("FAILED", 2);
        public static final ArticleLoadingStatus SUCCESS = new ArticleLoadingStatus("SUCCESS", 3);

        private static final /* synthetic */ ArticleLoadingStatus[] $values() {
            return new ArticleLoadingStatus[]{IDLE, LOADING, FAILED, SUCCESS};
        }

        static {
            ArticleLoadingStatus[] articleLoadingStatusArr$values = $values();
            $VALUES = articleLoadingStatusArr$values;
            $ENTRIES = n.w(articleLoadingStatusArr$values);
        }

        private ArticleLoadingStatus(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static ArticleLoadingStatus valueOf(String str) {
            return (ArticleLoadingStatus) Enum.valueOf(ArticleLoadingStatus.class, str);
        }

        public static ArticleLoadingStatus[] values() {
            return (ArticleLoadingStatus[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ArticleContentState(zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState.ArticleData r2, int r3, int r4, int r5, zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState.ArticleLoadingStatus r6, java.util.List r7, int r8, int r9, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r2 = 0
        L5:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lb
            r3 = r0
        Lb:
            r12 = r11 & 4
            if (r12 == 0) goto L10
            r4 = r0
        L10:
            r12 = r11 & 8
            if (r12 == 0) goto L15
            r5 = r0
        L15:
            r12 = r11 & 16
            if (r12 == 0) goto L1b
            zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState$ArticleLoadingStatus r6 = zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState.ArticleLoadingStatus.IDLE
        L1b:
            r12 = r11 & 32
            if (r12 == 0) goto L21
            kotlin.collections.n0 r7 = kotlin.collections.n0.f26529a
        L21:
            r12 = r11 & 64
            if (r12 == 0) goto L26
            r8 = r0
        L26:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L2b
            r9 = r0
        L2b:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3a
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L44
        L3a:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L44:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState.<init>(zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState$ArticleData, int, int, int, zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState$ArticleLoadingStatus, java.util.List, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleContentState copy$default(ArticleContentState articleContentState, ArticleData articleData, int i11, int i12, int i13, ArticleLoadingStatus articleLoadingStatus, List list, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            articleData = articleContentState.articleData;
        }
        if ((i17 & 2) != 0) {
            i11 = articleContentState.textColor;
        }
        if ((i17 & 4) != 0) {
            i12 = articleContentState.backgroundColor;
        }
        if ((i17 & 8) != 0) {
            i13 = articleContentState.indicatorColor;
        }
        if ((i17 & 16) != 0) {
            articleLoadingStatus = articleContentState.status;
        }
        if ((i17 & 32) != 0) {
            list = articleContentState.attachmentList;
        }
        if ((i17 & 64) != 0) {
            i14 = articleContentState.attachmentListTextColor;
        }
        if ((i17 & 128) != 0) {
            i15 = articleContentState.navigationButtonBackgroundColor;
        }
        if ((i17 & 256) != 0) {
            i16 = articleContentState.focusedStateBorderColor;
        }
        int i18 = i15;
        int i19 = i16;
        List list2 = list;
        int i21 = i14;
        ArticleLoadingStatus articleLoadingStatus2 = articleLoadingStatus;
        int i22 = i12;
        return articleContentState.copy(articleData, i11, i22, i13, articleLoadingStatus2, list2, i21, i18, i19);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final ArticleData getArticleData() {
        return this.articleData;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getIndicatorColor() {
        return this.indicatorColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final ArticleLoadingStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final List<ArticleAttachmentItem> component6$zendesk_ui_ui_android() {
        return this.attachmentList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAttachmentListTextColor() {
        return this.attachmentListTextColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    @NotNull
    public final ArticleContentState copy(@Nullable ArticleData articleData, int textColor, int backgroundColor, int indicatorColor, @NotNull ArticleLoadingStatus status, @NotNull List<ArticleAttachmentItem> attachmentList, int attachmentListTextColor, int navigationButtonBackgroundColor, int focusedStateBorderColor) {
        status.getClass();
        attachmentList.getClass();
        return new ArticleContentState(articleData, textColor, backgroundColor, indicatorColor, status, attachmentList, attachmentListTextColor, navigationButtonBackgroundColor, focusedStateBorderColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleContentState)) {
            return false;
        }
        ArticleContentState articleContentState = (ArticleContentState) other;
        return Intrinsics.areEqual(this.articleData, articleContentState.articleData) && this.textColor == articleContentState.textColor && this.backgroundColor == articleContentState.backgroundColor && this.indicatorColor == articleContentState.indicatorColor && this.status == articleContentState.status && Intrinsics.areEqual(this.attachmentList, articleContentState.attachmentList) && this.attachmentListTextColor == articleContentState.attachmentListTextColor && this.navigationButtonBackgroundColor == articleContentState.navigationButtonBackgroundColor && this.focusedStateBorderColor == articleContentState.focusedStateBorderColor;
    }

    @Nullable
    public final ArticleData getArticleData$zendesk_ui_ui_android() {
        return this.articleData;
    }

    @NotNull
    public final List<ArticleAttachmentItem> getAttachmentList$zendesk_ui_ui_android() {
        return this.attachmentList;
    }

    public final int getAttachmentListTextColor() {
        return this.attachmentListTextColor;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    public final int getIndicatorColor$zendesk_ui_ui_android() {
        return this.indicatorColor;
    }

    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    @NotNull
    public final ArticleLoadingStatus getStatus$zendesk_ui_ui_android() {
        return this.status;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        ArticleData articleData = this.articleData;
        return Integer.hashCode(this.focusedStateBorderColor) + k.b(this.navigationButtonBackgroundColor, k.b(this.attachmentListTextColor, f.c(this.attachmentList, (this.status.hashCode() + k.b(this.indicatorColor, k.b(this.backgroundColor, k.b(this.textColor, (articleData == null ? 0 : articleData.hashCode()) * 31, 31), 31), 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        ArticleData articleData = this.articleData;
        int i11 = this.textColor;
        int i12 = this.backgroundColor;
        int i13 = this.indicatorColor;
        ArticleLoadingStatus articleLoadingStatus = this.status;
        List<ArticleAttachmentItem> list = this.attachmentList;
        int i14 = this.attachmentListTextColor;
        int i15 = this.navigationButtonBackgroundColor;
        int i16 = this.focusedStateBorderColor;
        StringBuilder sb2 = new StringBuilder("ArticleContentState(articleData=");
        sb2.append(articleData);
        sb2.append(", textColor=");
        sb2.append(i11);
        sb2.append(", backgroundColor=");
        f.C(sb2, i12, ", indicatorColor=", i13, ", status=");
        sb2.append(articleLoadingStatus);
        sb2.append(", attachmentList=");
        sb2.append(list);
        sb2.append(", attachmentListTextColor=");
        f.C(sb2, i14, ", navigationButtonBackgroundColor=", i15, ", focusedStateBorderColor=");
        return k.i(i16, ")", sb2);
    }

    public ArticleContentState(@Nullable ArticleData articleData, int i11, int i12, int i13, @NotNull ArticleLoadingStatus articleLoadingStatus, @NotNull List<ArticleAttachmentItem> list, int i14, int i15, int i16) {
        articleLoadingStatus.getClass();
        list.getClass();
        this.articleData = articleData;
        this.textColor = i11;
        this.backgroundColor = i12;
        this.indicatorColor = i13;
        this.status = articleLoadingStatus;
        this.attachmentList = list;
        this.attachmentListTextColor = i14;
        this.navigationButtonBackgroundColor = i15;
        this.focusedStateBorderColor = i16;
    }

    public ArticleContentState() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 511, null);
    }
}
