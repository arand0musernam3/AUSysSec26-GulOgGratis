package zendesk.ui.android.conversation.articleviewer.feedbackbanner;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\u0018J9\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "", "textColor", "", "backgroundColor", "buttonColor", "options", "", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "<init>", "(IIILjava/util/List;)V", "getTextColor$zendesk_ui_ui_android", "()I", "getBackgroundColor$zendesk_ui_ui_android", "getButtonColor$zendesk_ui_ui_android", "getOptions$zendesk_ui_ui_android", "()Ljava/util/List;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "copy", "equals", "", "other", "hashCode", "toString", "", "FeedbackOptionStatus", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleFeedbackBannerState {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final int buttonColor;

    @Nullable
    private final List<QuickReplyOption> options;
    private final int textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState$FeedbackOptionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "YES", "NO", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedbackOptionStatus {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ FeedbackOptionStatus[] $VALUES;
        public static final FeedbackOptionStatus YES = new FeedbackOptionStatus("YES", 0);
        public static final FeedbackOptionStatus NO = new FeedbackOptionStatus("NO", 1);

        private static final /* synthetic */ FeedbackOptionStatus[] $values() {
            return new FeedbackOptionStatus[]{YES, NO};
        }

        static {
            FeedbackOptionStatus[] feedbackOptionStatusArr$values = $values();
            $VALUES = feedbackOptionStatusArr$values;
            $ENTRIES = n.w(feedbackOptionStatusArr$values);
        }

        private FeedbackOptionStatus(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static FeedbackOptionStatus valueOf(String str) {
            return (FeedbackOptionStatus) Enum.valueOf(FeedbackOptionStatus.class, str);
        }

        public static FeedbackOptionStatus[] values() {
            return (FeedbackOptionStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ArticleFeedbackBannerState(int i11, int i12, int i13, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleFeedbackBannerState copy$default(ArticleFeedbackBannerState articleFeedbackBannerState, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = articleFeedbackBannerState.textColor;
        }
        if ((i14 & 2) != 0) {
            i12 = articleFeedbackBannerState.backgroundColor;
        }
        if ((i14 & 4) != 0) {
            i13 = articleFeedbackBannerState.buttonColor;
        }
        if ((i14 & 8) != 0) {
            list = articleFeedbackBannerState.options;
        }
        return articleFeedbackBannerState.copy(i11, i12, i13, list);
    }

    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final int getButtonColor() {
        return this.buttonColor;
    }

    @Nullable
    public final List<QuickReplyOption> component4$zendesk_ui_ui_android() {
        return this.options;
    }

    @NotNull
    public final ArticleFeedbackBannerState copy(int textColor, int backgroundColor, int buttonColor, @Nullable List<QuickReplyOption> options) {
        return new ArticleFeedbackBannerState(textColor, backgroundColor, buttonColor, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleFeedbackBannerState)) {
            return false;
        }
        ArticleFeedbackBannerState articleFeedbackBannerState = (ArticleFeedbackBannerState) other;
        return this.textColor == articleFeedbackBannerState.textColor && this.backgroundColor == articleFeedbackBannerState.backgroundColor && this.buttonColor == articleFeedbackBannerState.buttonColor && Intrinsics.areEqual(this.options, articleFeedbackBannerState.options);
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getButtonColor$zendesk_ui_ui_android() {
        return this.buttonColor;
    }

    @Nullable
    public final List<QuickReplyOption> getOptions$zendesk_ui_ui_android() {
        return this.options;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        int iB = k.b(this.buttonColor, k.b(this.backgroundColor, Integer.hashCode(this.textColor) * 31, 31), 31);
        List<QuickReplyOption> list = this.options;
        return iB + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.textColor;
        int i12 = this.backgroundColor;
        int i13 = this.buttonColor;
        List<QuickReplyOption> list = this.options;
        StringBuilder sbR = k.r(i11, i12, "ArticleFeedbackBannerState(textColor=", ", backgroundColor=", ", buttonColor=");
        sbR.append(i13);
        sbR.append(", options=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public ArticleFeedbackBannerState(int i11, int i12, int i13, @Nullable List<QuickReplyOption> list) {
        this.textColor = i11;
        this.backgroundColor = i12;
        this.buttonColor = i13;
        this.options = list;
    }

    public ArticleFeedbackBannerState() {
        this(0, 0, 0, null, 15, null);
    }
}
