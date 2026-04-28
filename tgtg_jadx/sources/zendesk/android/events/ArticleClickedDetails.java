package zendesk.android.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lzendesk/android/events/ArticleClickedDetails;", "", "articleId", "", "articleTitle", "", "<init>", "(JLjava/lang/String;)V", "getArticleId", "()J", "getArticleTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleClickedDetails {
    private final long articleId;

    @NotNull
    private final String articleTitle;

    @InternalZendeskApi
    public ArticleClickedDetails(long j9, @NotNull String str) {
        str.getClass();
        this.articleId = j9;
        this.articleTitle = str;
    }

    public static /* synthetic */ ArticleClickedDetails copy$default(ArticleClickedDetails articleClickedDetails, long j9, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = articleClickedDetails.articleId;
        }
        if ((i11 & 2) != 0) {
            str = articleClickedDetails.articleTitle;
        }
        return articleClickedDetails.copy(j9, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getArticleId() {
        return this.articleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    @NotNull
    public final ArticleClickedDetails copy(long articleId, @NotNull String articleTitle) {
        articleTitle.getClass();
        return new ArticleClickedDetails(articleId, articleTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleClickedDetails)) {
            return false;
        }
        ArticleClickedDetails articleClickedDetails = (ArticleClickedDetails) other;
        return this.articleId == articleClickedDetails.articleId && Intrinsics.areEqual(this.articleTitle, articleClickedDetails.articleTitle);
    }

    public final long getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getArticleTitle() {
        return this.articleTitle;
    }

    public int hashCode() {
        return this.articleTitle.hashCode() + (Long.hashCode(this.articleId) * 31);
    }

    @NotNull
    public String toString() {
        return "ArticleClickedDetails(articleId=" + this.articleId + ", articleTitle=" + this.articleTitle + ")";
    }
}
