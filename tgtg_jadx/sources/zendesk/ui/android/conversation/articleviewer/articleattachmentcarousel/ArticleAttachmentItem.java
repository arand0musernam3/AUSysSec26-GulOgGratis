package zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "", "id", "", MessageBundle.TITLE_ENTRY, "", "type", "size", "contentUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getType", "getSize", "getContentUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleAttachmentItem {
    public static final int $stable = 0;

    @NotNull
    private final String contentUrl;
    private final long id;
    private final long size;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    public ArticleAttachmentItem(long j9, @NotNull String str, @NotNull String str2, long j11, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.id = j9;
        this.title = str;
        this.type = str2;
        this.size = j11;
        this.contentUrl = str3;
    }

    public static /* synthetic */ ArticleAttachmentItem copy$default(ArticleAttachmentItem articleAttachmentItem, long j9, String str, String str2, long j11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = articleAttachmentItem.id;
        }
        long j12 = j9;
        if ((i11 & 2) != 0) {
            str = articleAttachmentItem.title;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = articleAttachmentItem.type;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            j11 = articleAttachmentItem.size;
        }
        long j13 = j11;
        if ((i11 & 16) != 0) {
            str3 = articleAttachmentItem.contentUrl;
        }
        return articleAttachmentItem.copy(j12, str4, str5, j13, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    @NotNull
    public final ArticleAttachmentItem copy(long id2, @NotNull String title, @NotNull String type, long size, @NotNull String contentUrl) {
        title.getClass();
        type.getClass();
        contentUrl.getClass();
        return new ArticleAttachmentItem(id2, title, type, size, contentUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleAttachmentItem)) {
            return false;
        }
        ArticleAttachmentItem articleAttachmentItem = (ArticleAttachmentItem) other;
        return this.id == articleAttachmentItem.id && Intrinsics.areEqual(this.title, articleAttachmentItem.title) && Intrinsics.areEqual(this.type, articleAttachmentItem.type) && this.size == articleAttachmentItem.size && Intrinsics.areEqual(this.contentUrl, articleAttachmentItem.contentUrl);
    }

    @NotNull
    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.contentUrl.hashCode() + f.b(l1.b(l1.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.type), 31, this.size);
    }

    @NotNull
    public String toString() {
        return "ArticleAttachmentItem(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", size=" + this.size + ", contentUrl=" + this.contentUrl + ")";
    }
}
