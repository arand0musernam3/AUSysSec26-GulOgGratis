package zendesk.ui.android.conversation.imagerviewer;

import android.net.Uri;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b&Jb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006."}, d2 = {"Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;", "", "uri", "", MessageBundle.TITLE_ENTRY, "description", "logo", "Landroid/net/Uri;", "toolbarColor", "", "statusBarColor", "authorizationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getUri$zendesk_ui_ui_android", "()Ljava/lang/String;", "getTitle$zendesk_ui_ui_android", "getDescription$zendesk_ui_ui_android", "getLogo$zendesk_ui_ui_android", "()Landroid/net/Uri;", "getToolbarColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusBarColor$zendesk_ui_ui_android", "getAuthorizationToken$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageViewerState {
    public static final int $stable = 8;

    @Nullable
    private final String authorizationToken;

    @Nullable
    private final String description;

    @Nullable
    private final Uri logo;

    @Nullable
    private final Integer statusBarColor;

    @Nullable
    private final String title;

    @Nullable
    private final Integer toolbarColor;

    @Nullable
    private final String uri;

    public /* synthetic */ ImageViewerState(String str, String str2, String str3, Uri uri, Integer num, Integer num2, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : uri, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : num2, (i11 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ ImageViewerState copy$default(ImageViewerState imageViewerState, String str, String str2, String str3, Uri uri, Integer num, Integer num2, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageViewerState.uri;
        }
        if ((i11 & 2) != 0) {
            str2 = imageViewerState.title;
        }
        if ((i11 & 4) != 0) {
            str3 = imageViewerState.description;
        }
        if ((i11 & 8) != 0) {
            uri = imageViewerState.logo;
        }
        if ((i11 & 16) != 0) {
            num = imageViewerState.toolbarColor;
        }
        if ((i11 & 32) != 0) {
            num2 = imageViewerState.statusBarColor;
        }
        if ((i11 & 64) != 0) {
            str4 = imageViewerState.authorizationToken;
        }
        Integer num3 = num2;
        String str5 = str4;
        Integer num4 = num;
        String str6 = str3;
        return imageViewerState.copy(str, str2, str6, uri, num4, num3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final Uri getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    @NotNull
    public final ImageViewerState copy(@Nullable String uri, @Nullable String title, @Nullable String description, @Nullable Uri logo, @Nullable Integer toolbarColor, @Nullable Integer statusBarColor, @Nullable String authorizationToken) {
        return new ImageViewerState(uri, title, description, logo, toolbarColor, statusBarColor, authorizationToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageViewerState)) {
            return false;
        }
        ImageViewerState imageViewerState = (ImageViewerState) other;
        return Intrinsics.areEqual(this.uri, imageViewerState.uri) && Intrinsics.areEqual(this.title, imageViewerState.title) && Intrinsics.areEqual(this.description, imageViewerState.description) && Intrinsics.areEqual(this.logo, imageViewerState.logo) && Intrinsics.areEqual(this.toolbarColor, imageViewerState.toolbarColor) && Intrinsics.areEqual(this.statusBarColor, imageViewerState.statusBarColor) && Intrinsics.areEqual(this.authorizationToken, imageViewerState.authorizationToken);
    }

    @Nullable
    public final String getAuthorizationToken$zendesk_ui_ui_android() {
        return this.authorizationToken;
    }

    @Nullable
    public final String getDescription$zendesk_ui_ui_android() {
        return this.description;
    }

    @Nullable
    public final Uri getLogo$zendesk_ui_ui_android() {
        return this.logo;
    }

    @Nullable
    public final Integer getStatusBarColor$zendesk_ui_ui_android() {
        return this.statusBarColor;
    }

    @Nullable
    public final String getTitle$zendesk_ui_ui_android() {
        return this.title;
    }

    @Nullable
    public final Integer getToolbarColor$zendesk_ui_ui_android() {
        return this.toolbarColor;
    }

    @Nullable
    public final String getUri$zendesk_ui_ui_android() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.logo;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        Integer num = this.toolbarColor;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.statusBarColor;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.authorizationToken;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uri;
        String str2 = this.title;
        String str3 = this.description;
        Uri uri = this.logo;
        Integer num = this.toolbarColor;
        Integer num2 = this.statusBarColor;
        String str4 = this.authorizationToken;
        StringBuilder sbT = f.t("ImageViewerState(uri=", str, ", title=", str2, ", description=");
        sbT.append(str3);
        sbT.append(", logo=");
        sbT.append(uri);
        sbT.append(", toolbarColor=");
        s.z(sbT, num, ", statusBarColor=", num2, ", authorizationToken=");
        return k.p(sbT, str4, ")");
    }

    public ImageViewerState(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Uri uri, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4) {
        this.uri = str;
        this.title = str2;
        this.description = str3;
        this.logo = uri;
        this.toolbarColor = num;
        this.statusBarColor = num2;
        this.authorizationToken = str4;
    }

    public ImageViewerState() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
