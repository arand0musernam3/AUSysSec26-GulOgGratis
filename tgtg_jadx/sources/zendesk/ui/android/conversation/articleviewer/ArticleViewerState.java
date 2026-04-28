package zendesk.ui.android.conversation.articleviewer;

import b3.i;
import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b3J\u000e\u00104\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b5J\u000e\u00106\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b;J\u000e\u0010<\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b?J\u000e\u0010@\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\bAJ\u000e\u0010B\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\bCJ\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÀ\u0003¢\u0006\u0002\bEJ\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\u0016\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011HÀ\u0003¢\u0006\u0002\bJJ\u000e\u0010K\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\bLJ¹\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0003\u0010\u0013\u001a\u00020\u00072\b\b\u0003\u0010\u0014\u001a\u00020\u00072\b\b\u0003\u0010\u0015\u001a\u00020\u00072\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u000eHÆ\u0001J\u0013\u0010N\u001a\u00020\u000e2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0007HÖ\u0001J\t\u0010Q\u001a\u00020RHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\t\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0014\u0010\n\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0014\u0010\u000b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0014\u0010\f\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0014\u0010\u0018\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'¨\u0006S"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "", "articleData", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;", "contentState", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "iconColor", "", "backgroundColor", "buttonBackgroundColor", "textColor", "buttonColor", "indicatorColor", "showBackButton", "", "showShareButton", "attachmentList", "", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "attachmentListTextColor", "navigationButtonBackgroundColor", "focusedStateBorderColor", "feedBackBannerOptions", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "shouldShowFeedbackBanner", "<init>", "(Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;IIIIIIZZLjava/util/List;IIILjava/util/List;Z)V", "getArticleData$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleData;", "getContentState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "getIconColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "getButtonBackgroundColor$zendesk_ui_ui_android", "getTextColor$zendesk_ui_ui_android", "getButtonColor$zendesk_ui_ui_android", "getIndicatorColor$zendesk_ui_ui_android", "getShowBackButton$zendesk_ui_ui_android", "()Z", "getShowShareButton$zendesk_ui_ui_android", "getAttachmentList$zendesk_ui_ui_android", "()Ljava/util/List;", "getAttachmentListTextColor", "getNavigationButtonBackgroundColor", "getFocusedStateBorderColor", "getFeedBackBannerOptions$zendesk_ui_ui_android", "getShouldShowFeedbackBanner$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "component12", "component13", "component14", "component15", "component15$zendesk_ui_ui_android", "component16", "component16$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleViewerState {
    public static final int $stable = 8;

    @Nullable
    private final ArticleContentState.ArticleData articleData;

    @NotNull
    private final List<ArticleAttachmentItem> attachmentList;
    private final int attachmentListTextColor;
    private final int backgroundColor;
    private final int buttonBackgroundColor;
    private final int buttonColor;

    @NotNull
    private final ArticleContentState.ArticleLoadingStatus contentState;

    @Nullable
    private final List<QuickReplyOption> feedBackBannerOptions;
    private final int focusedStateBorderColor;
    private final int iconColor;
    private final int indicatorColor;
    private final int navigationButtonBackgroundColor;
    private final boolean shouldShowFeedbackBanner;
    private final boolean showBackButton;
    private final boolean showShareButton;
    private final int textColor;

    public ArticleViewerState(ArticleContentState.ArticleData articleData, ArticleContentState.ArticleLoadingStatus articleLoadingStatus, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, List list, int i17, int i18, int i19, List list2, boolean z13, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? null : articleData, (i21 & 2) != 0 ? ArticleContentState.ArticleLoadingStatus.IDLE : articleLoadingStatus, (i21 & 4) != 0 ? 0 : i11, (i21 & 8) != 0 ? 0 : i12, (i21 & 16) != 0 ? 0 : i13, (i21 & 32) != 0 ? 0 : i14, (i21 & 64) != 0 ? 0 : i15, (i21 & 128) != 0 ? 0 : i16, (i21 & 256) != 0 ? false : z11, (i21 & 512) != 0 ? false : z12, (i21 & 1024) != 0 ? n0.f26529a : list, (i21 & NewHope.SENDB_BYTES) != 0 ? 0 : i17, (i21 & 4096) != 0 ? 0 : i18, (i21 & 8192) != 0 ? 0 : i19, (i21 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : list2, (i21 & 32768) != 0 ? false : z13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final ArticleContentState.ArticleData getArticleData() {
        return this.articleData;
    }

    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowShareButton() {
        return this.showShareButton;
    }

    @NotNull
    public final List<ArticleAttachmentItem> component11$zendesk_ui_ui_android() {
        return this.attachmentList;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAttachmentListTextColor() {
        return this.attachmentListTextColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    @Nullable
    public final List<QuickReplyOption> component15$zendesk_ui_ui_android() {
        return this.feedBackBannerOptions;
    }

    /* JADX INFO: renamed from: component16$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShouldShowFeedbackBanner() {
        return this.shouldShowFeedbackBanner;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final ArticleContentState.ArticleLoadingStatus getContentState() {
        return this.contentState;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final int getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final int getButtonColor() {
        return this.buttonColor;
    }

    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final int getIndicatorColor() {
        return this.indicatorColor;
    }

    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    @NotNull
    public final ArticleViewerState copy(@Nullable ArticleContentState.ArticleData articleData, @NotNull ArticleContentState.ArticleLoadingStatus contentState, int iconColor, int backgroundColor, int buttonBackgroundColor, int textColor, int buttonColor, int indicatorColor, boolean showBackButton, boolean showShareButton, @NotNull List<ArticleAttachmentItem> attachmentList, int attachmentListTextColor, int navigationButtonBackgroundColor, int focusedStateBorderColor, @Nullable List<QuickReplyOption> feedBackBannerOptions, boolean shouldShowFeedbackBanner) {
        contentState.getClass();
        attachmentList.getClass();
        return new ArticleViewerState(articleData, contentState, iconColor, backgroundColor, buttonBackgroundColor, textColor, buttonColor, indicatorColor, showBackButton, showShareButton, attachmentList, attachmentListTextColor, navigationButtonBackgroundColor, focusedStateBorderColor, feedBackBannerOptions, shouldShowFeedbackBanner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleViewerState)) {
            return false;
        }
        ArticleViewerState articleViewerState = (ArticleViewerState) other;
        return Intrinsics.areEqual(this.articleData, articleViewerState.articleData) && this.contentState == articleViewerState.contentState && this.iconColor == articleViewerState.iconColor && this.backgroundColor == articleViewerState.backgroundColor && this.buttonBackgroundColor == articleViewerState.buttonBackgroundColor && this.textColor == articleViewerState.textColor && this.buttonColor == articleViewerState.buttonColor && this.indicatorColor == articleViewerState.indicatorColor && this.showBackButton == articleViewerState.showBackButton && this.showShareButton == articleViewerState.showShareButton && Intrinsics.areEqual(this.attachmentList, articleViewerState.attachmentList) && this.attachmentListTextColor == articleViewerState.attachmentListTextColor && this.navigationButtonBackgroundColor == articleViewerState.navigationButtonBackgroundColor && this.focusedStateBorderColor == articleViewerState.focusedStateBorderColor && Intrinsics.areEqual(this.feedBackBannerOptions, articleViewerState.feedBackBannerOptions) && this.shouldShowFeedbackBanner == articleViewerState.shouldShowFeedbackBanner;
    }

    @Nullable
    public final ArticleContentState.ArticleData getArticleData$zendesk_ui_ui_android() {
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

    public final int getButtonBackgroundColor$zendesk_ui_ui_android() {
        return this.buttonBackgroundColor;
    }

    public final int getButtonColor$zendesk_ui_ui_android() {
        return this.buttonColor;
    }

    @NotNull
    public final ArticleContentState.ArticleLoadingStatus getContentState$zendesk_ui_ui_android() {
        return this.contentState;
    }

    @Nullable
    public final List<QuickReplyOption> getFeedBackBannerOptions$zendesk_ui_ui_android() {
        return this.feedBackBannerOptions;
    }

    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    public final int getIconColor$zendesk_ui_ui_android() {
        return this.iconColor;
    }

    public final int getIndicatorColor$zendesk_ui_ui_android() {
        return this.indicatorColor;
    }

    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    public final boolean getShouldShowFeedbackBanner$zendesk_ui_ui_android() {
        return this.shouldShowFeedbackBanner;
    }

    public final boolean getShowBackButton$zendesk_ui_ui_android() {
        return this.showBackButton;
    }

    public final boolean getShowShareButton$zendesk_ui_ui_android() {
        return this.showShareButton;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        ArticleContentState.ArticleData articleData = this.articleData;
        int iB = k.b(this.focusedStateBorderColor, k.b(this.navigationButtonBackgroundColor, k.b(this.attachmentListTextColor, f.c(this.attachmentList, k.e(k.e(k.b(this.indicatorColor, k.b(this.buttonColor, k.b(this.textColor, k.b(this.buttonBackgroundColor, k.b(this.backgroundColor, k.b(this.iconColor, (this.contentState.hashCode() + ((articleData == null ? 0 : articleData.hashCode()) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.showBackButton), 31, this.showShareButton), 31), 31), 31), 31);
        List<QuickReplyOption> list = this.feedBackBannerOptions;
        return Boolean.hashCode(this.shouldShowFeedbackBanner) + ((iB + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ArticleContentState.ArticleData articleData = this.articleData;
        ArticleContentState.ArticleLoadingStatus articleLoadingStatus = this.contentState;
        int i11 = this.iconColor;
        int i12 = this.backgroundColor;
        int i13 = this.buttonBackgroundColor;
        int i14 = this.textColor;
        int i15 = this.buttonColor;
        int i16 = this.indicatorColor;
        boolean z11 = this.showBackButton;
        boolean z12 = this.showShareButton;
        List<ArticleAttachmentItem> list = this.attachmentList;
        int i17 = this.attachmentListTextColor;
        int i18 = this.navigationButtonBackgroundColor;
        int i19 = this.focusedStateBorderColor;
        List<QuickReplyOption> list2 = this.feedBackBannerOptions;
        boolean z13 = this.shouldShowFeedbackBanner;
        StringBuilder sb2 = new StringBuilder("ArticleViewerState(articleData=");
        sb2.append(articleData);
        sb2.append(", contentState=");
        sb2.append(articleLoadingStatus);
        sb2.append(", iconColor=");
        f.C(sb2, i11, ", backgroundColor=", i12, ", buttonBackgroundColor=");
        f.C(sb2, i13, ", textColor=", i14, ", buttonColor=");
        f.C(sb2, i15, ", indicatorColor=", i16, ", showBackButton=");
        i.C(sb2, z11, ", showShareButton=", z12, ", attachmentList=");
        sb2.append(list);
        sb2.append(", attachmentListTextColor=");
        sb2.append(i17);
        sb2.append(", navigationButtonBackgroundColor=");
        f.C(sb2, i18, ", focusedStateBorderColor=", i19, ", feedBackBannerOptions=");
        sb2.append(list2);
        sb2.append(", shouldShowFeedbackBanner=");
        sb2.append(z13);
        sb2.append(")");
        return sb2.toString();
    }

    public ArticleViewerState(@Nullable ArticleContentState.ArticleData articleData, @NotNull ArticleContentState.ArticleLoadingStatus articleLoadingStatus, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, @NotNull List<ArticleAttachmentItem> list, int i17, int i18, int i19, @Nullable List<QuickReplyOption> list2, boolean z13) {
        articleLoadingStatus.getClass();
        list.getClass();
        this.articleData = articleData;
        this.contentState = articleLoadingStatus;
        this.iconColor = i11;
        this.backgroundColor = i12;
        this.buttonBackgroundColor = i13;
        this.textColor = i14;
        this.buttonColor = i15;
        this.indicatorColor = i16;
        this.showBackButton = z11;
        this.showShareButton = z12;
        this.attachmentList = list;
        this.attachmentListTextColor = i17;
        this.navigationButtonBackgroundColor = i18;
        this.focusedStateBorderColor = i19;
        this.feedBackBannerOptions = list2;
        this.shouldShowFeedbackBanner = z13;
    }

    public ArticleViewerState() {
        this(null, null, 0, 0, 0, 0, 0, 0, false, false, null, 0, 0, 0, null, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }
}
