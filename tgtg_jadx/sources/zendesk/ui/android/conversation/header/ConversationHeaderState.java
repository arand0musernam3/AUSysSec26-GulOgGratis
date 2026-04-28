package zendesk.ui.android.conversation.header;

import android.net.Uri;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b$\u0010\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b&\u0010\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b(\u0010\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b*\u0010\u0016Jj\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016¨\u00062"}, d2 = {"Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "", MessageBundle.TITLE_ENTRY, "", "description", "imageUrl", "Landroid/net/Uri;", "accessibilityTitle", "backgroundColor", "", "statusBarColor", "titleColor", "backButtonColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTitle$zendesk_ui_ui_android", "()Ljava/lang/String;", "getDescription$zendesk_ui_ui_android", "getImageUrl$zendesk_ui_ui_android", "()Landroid/net/Uri;", "getAccessibilityTitle$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusBarColor$zendesk_ui_ui_android", "getTitleColor$zendesk_ui_ui_android", "getBackButtonColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationHeaderState {
    public static final int $stable = 8;

    @NotNull
    private final String accessibilityTitle;

    @Nullable
    private final Integer backButtonColor;

    @Nullable
    private final Integer backgroundColor;

    @Nullable
    private final String description;

    @Nullable
    private final Uri imageUrl;

    @Nullable
    private final Integer statusBarColor;

    @NotNull
    private final String title;

    @Nullable
    private final Integer titleColor;

    public /* synthetic */ ConversationHeaderState(String str, String str2, Uri uri, String str3, Integer num, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : uri, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : num2, (i11 & 64) != 0 ? null : num3, (i11 & 128) != 0 ? null : num4);
    }

    public static /* synthetic */ ConversationHeaderState copy$default(ConversationHeaderState conversationHeaderState, String str, String str2, Uri uri, String str3, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = conversationHeaderState.title;
        }
        if ((i11 & 2) != 0) {
            str2 = conversationHeaderState.description;
        }
        if ((i11 & 4) != 0) {
            uri = conversationHeaderState.imageUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = conversationHeaderState.accessibilityTitle;
        }
        if ((i11 & 16) != 0) {
            num = conversationHeaderState.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            num2 = conversationHeaderState.statusBarColor;
        }
        if ((i11 & 64) != 0) {
            num3 = conversationHeaderState.titleColor;
        }
        if ((i11 & 128) != 0) {
            num4 = conversationHeaderState.backButtonColor;
        }
        Integer num5 = num3;
        Integer num6 = num4;
        Integer num7 = num;
        Integer num8 = num2;
        return conversationHeaderState.copy(str, str2, uri, str3, num7, num8, num5, num6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final String getAccessibilityTitle() {
        return this.accessibilityTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackButtonColor() {
        return this.backButtonColor;
    }

    @NotNull
    public final ConversationHeaderState copy(@NotNull String title, @Nullable String description, @Nullable Uri imageUrl, @NotNull String accessibilityTitle, @Nullable Integer backgroundColor, @Nullable Integer statusBarColor, @Nullable Integer titleColor, @Nullable Integer backButtonColor) {
        title.getClass();
        accessibilityTitle.getClass();
        return new ConversationHeaderState(title, description, imageUrl, accessibilityTitle, backgroundColor, statusBarColor, titleColor, backButtonColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationHeaderState)) {
            return false;
        }
        ConversationHeaderState conversationHeaderState = (ConversationHeaderState) other;
        return Intrinsics.areEqual(this.title, conversationHeaderState.title) && Intrinsics.areEqual(this.description, conversationHeaderState.description) && Intrinsics.areEqual(this.imageUrl, conversationHeaderState.imageUrl) && Intrinsics.areEqual(this.accessibilityTitle, conversationHeaderState.accessibilityTitle) && Intrinsics.areEqual(this.backgroundColor, conversationHeaderState.backgroundColor) && Intrinsics.areEqual(this.statusBarColor, conversationHeaderState.statusBarColor) && Intrinsics.areEqual(this.titleColor, conversationHeaderState.titleColor) && Intrinsics.areEqual(this.backButtonColor, conversationHeaderState.backButtonColor);
    }

    @NotNull
    public final String getAccessibilityTitle$zendesk_ui_ui_android() {
        return this.accessibilityTitle;
    }

    @Nullable
    public final Integer getBackButtonColor$zendesk_ui_ui_android() {
        return this.backButtonColor;
    }

    @Nullable
    public final Integer getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getDescription$zendesk_ui_ui_android() {
        return this.description;
    }

    @Nullable
    public final Uri getImageUrl$zendesk_ui_ui_android() {
        return this.imageUrl;
    }

    @Nullable
    public final Integer getStatusBarColor$zendesk_ui_ui_android() {
        return this.statusBarColor;
    }

    @NotNull
    public final String getTitle$zendesk_ui_ui_android() {
        return this.title;
    }

    @Nullable
    public final Integer getTitleColor$zendesk_ui_ui_android() {
        return this.titleColor;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.imageUrl;
        int iB = l1.b((iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.accessibilityTitle);
        Integer num = this.backgroundColor;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.statusBarColor;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.titleColor;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.backButtonColor;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Uri uri = this.imageUrl;
        String str3 = this.accessibilityTitle;
        Integer num = this.backgroundColor;
        Integer num2 = this.statusBarColor;
        Integer num3 = this.titleColor;
        Integer num4 = this.backButtonColor;
        StringBuilder sbT = f.t("ConversationHeaderState(title=", str, ", description=", str2, ", imageUrl=");
        sbT.append(uri);
        sbT.append(", accessibilityTitle=");
        sbT.append(str3);
        sbT.append(", backgroundColor=");
        s.z(sbT, num, ", statusBarColor=", num2, ", titleColor=");
        sbT.append(num3);
        sbT.append(", backButtonColor=");
        sbT.append(num4);
        sbT.append(")");
        return sbT.toString();
    }

    public ConversationHeaderState(@NotNull String str, @Nullable String str2, @Nullable Uri uri, @NotNull String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        str.getClass();
        str3.getClass();
        this.title = str;
        this.description = str2;
        this.imageUrl = uri;
        this.accessibilityTitle = str3;
        this.backgroundColor = num;
        this.statusBarColor = num2;
        this.titleColor = num3;
        this.backButtonColor = num4;
    }

    public ConversationHeaderState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
