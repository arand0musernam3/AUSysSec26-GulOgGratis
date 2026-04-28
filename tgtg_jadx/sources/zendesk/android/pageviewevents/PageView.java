package zendesk.android.pageviewevents;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/android/pageviewevents/PageView;", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "pageTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getPageTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PageView {

    @NotNull
    private final String pageTitle;

    @NotNull
    private final String url;

    public PageView(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.url = str;
        this.pageTitle = str2;
    }

    public static /* synthetic */ PageView copy$default(PageView pageView, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pageView.url;
        }
        if ((i11 & 2) != 0) {
            str2 = pageView.pageTitle;
        }
        return pageView.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @NotNull
    public final PageView copy(@NotNull String url, @NotNull String pageTitle) {
        url.getClass();
        pageTitle.getClass();
        return new PageView(url, pageTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageView)) {
            return false;
        }
        PageView pageView = (PageView) other;
        return Intrinsics.areEqual(this.url, pageView.url) && Intrinsics.areEqual(this.pageTitle, pageView.pageTitle);
    }

    @NotNull
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.pageTitle.hashCode() + (this.url.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("PageView(url=", this.url, ", pageTitle=", this.pageTitle, ")");
    }
}
