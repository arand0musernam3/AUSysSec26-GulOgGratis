package zendesk.guidekit.android.model;

import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lzendesk/guidekit/android/model/GuideArticle;", "", "id", "", "locale", "", "htmlUrl", MessageBundle.TITLE_ENTRY, "htmlBody", "attachments", "", "Lzendesk/guidekit/android/model/GuideAttachment;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()J", "getLocale", "()Ljava/lang/String;", "getHtmlUrl", "getTitle", "getHtmlBody", "getAttachments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuideArticle {

    @NotNull
    private final List<GuideAttachment> attachments;

    @Nullable
    private final String htmlBody;

    @Nullable
    private final String htmlUrl;
    private final long id;

    @NotNull
    private final String locale;

    @Nullable
    private final String title;

    public GuideArticle(long j9, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<GuideAttachment> list) {
        str.getClass();
        list.getClass();
        this.id = j9;
        this.locale = str;
        this.htmlUrl = str2;
        this.title = str3;
        this.htmlBody = str4;
        this.attachments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuideArticle copy$default(GuideArticle guideArticle, long j9, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = guideArticle.id;
        }
        long j11 = j9;
        if ((i11 & 2) != 0) {
            str = guideArticle.locale;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = guideArticle.htmlUrl;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = guideArticle.title;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = guideArticle.htmlBody;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            list = guideArticle.attachments;
        }
        return guideArticle.copy(j11, str5, str6, str7, str8, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHtmlBody() {
        return this.htmlBody;
    }

    @NotNull
    public final List<GuideAttachment> component6() {
        return this.attachments;
    }

    @NotNull
    public final GuideArticle copy(long id2, @NotNull String locale, @Nullable String htmlUrl, @Nullable String title, @Nullable String htmlBody, @NotNull List<GuideAttachment> attachments) {
        locale.getClass();
        attachments.getClass();
        return new GuideArticle(id2, locale, htmlUrl, title, htmlBody, attachments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideArticle)) {
            return false;
        }
        GuideArticle guideArticle = (GuideArticle) other;
        return this.id == guideArticle.id && Intrinsics.areEqual(this.locale, guideArticle.locale) && Intrinsics.areEqual(this.htmlUrl, guideArticle.htmlUrl) && Intrinsics.areEqual(this.title, guideArticle.title) && Intrinsics.areEqual(this.htmlBody, guideArticle.htmlBody) && Intrinsics.areEqual(this.attachments, guideArticle.attachments);
    }

    @NotNull
    public final List<GuideAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final String getHtmlBody() {
        return this.htmlBody;
    }

    @Nullable
    public final String getHtmlUrl() {
        return this.htmlUrl;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iB = l1.b(Long.hashCode(this.id) * 31, 31, this.locale);
        String str = this.htmlUrl;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.htmlBody;
        return this.attachments.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j9 = this.id;
        String str = this.locale;
        String str2 = this.htmlUrl;
        String str3 = this.title;
        String str4 = this.htmlBody;
        List<GuideAttachment> list = this.attachments;
        StringBuilder sb2 = new StringBuilder("GuideArticle(id=");
        sb2.append(j9);
        sb2.append(", locale=");
        sb2.append(str);
        s.A(sb2, ", htmlUrl=", str2, ", title=", str3);
        sb2.append(", htmlBody=");
        sb2.append(str4);
        sb2.append(", attachments=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }
}
