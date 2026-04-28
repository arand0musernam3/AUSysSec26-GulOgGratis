package zendesk.ui.android.conversation.composer;

import b3.i;
import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\b\u0012\b\b\u0003\u0010\f\u001a\u00020\b\u0012\b\b\u0003\u0010\r\u001a\u00020\b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\b\u0012\b\b\u0003\u0010\u000f\u001a\u00020\b\u0012\b\b\u0003\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010&\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b3J\u000e\u00104\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b5J\u000e\u00106\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b7J\u000e\u00108\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b;J\u000e\u0010<\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b?J\u000e\u0010@\u001a\u00020\u0012HÀ\u0003¢\u0006\u0002\bAJ\u0095\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\bHÖ\u0001J\t\u0010F\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\n\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006G"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerState;", "", FeatureFlag.ENABLED, "", "cameraSupported", "gallerySupported", "showAttachment", "visibility", "", "inputMaxLength", "sendButtonColor", "attachButtonColor", "borderColor", "focusedBorderColor", "textColor", "menuTextColor", "menuBackgroundColor", "composerText", "", "<init>", "(ZZZZIIIIIIIIILjava/lang/String;)V", "getEnabled$zendesk_ui_ui_android", "()Z", "getCameraSupported$zendesk_ui_ui_android", "getGallerySupported$zendesk_ui_ui_android", "getShowAttachment$zendesk_ui_ui_android", "getVisibility$zendesk_ui_ui_android", "()I", "getInputMaxLength$zendesk_ui_ui_android", "getSendButtonColor$zendesk_ui_ui_android", "getAttachButtonColor$zendesk_ui_ui_android", "getBorderColor$zendesk_ui_ui_android", "getFocusedBorderColor$zendesk_ui_ui_android", "getTextColor$zendesk_ui_ui_android", "getMenuTextColor$zendesk_ui_ui_android", "getMenuBackgroundColor$zendesk_ui_ui_android", "getComposerText$zendesk_ui_ui_android", "()Ljava/lang/String;", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "component12", "component12$zendesk_ui_ui_android", "component13", "component13$zendesk_ui_ui_android", "component14", "component14$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageComposerState {
    public static final int $stable = 0;
    private final int attachButtonColor;
    private final int borderColor;
    private final boolean cameraSupported;

    @NotNull
    private final String composerText;
    private final boolean enabled;
    private final int focusedBorderColor;
    private final boolean gallerySupported;
    private final int inputMaxLength;
    private final int menuBackgroundColor;
    private final int menuTextColor;
    private final int sendButtonColor;
    private final boolean showAttachment;
    private final int textColor;
    private final int visibility;

    public /* synthetic */ MessageComposerState(boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String str, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? true : z11, (i21 & 2) != 0 ? true : z12, (i21 & 4) == 0 ? z13 : true, (i21 & 8) != 0 ? false : z14, (i21 & 16) != 0 ? 0 : i11, (i21 & 32) != 0 ? Integer.MAX_VALUE : i12, (i21 & 64) != 0 ? 0 : i13, (i21 & 128) != 0 ? 0 : i14, (i21 & 256) != 0 ? 0 : i15, (i21 & 512) != 0 ? 0 : i16, (i21 & 1024) != 0 ? 0 : i17, (i21 & NewHope.SENDB_BYTES) != 0 ? 0 : i18, (i21 & 4096) == 0 ? i19 : 0, (i21 & 8192) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final int getFocusedBorderColor() {
        return this.focusedBorderColor;
    }

    /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component12$zendesk_ui_ui_android, reason: from getter */
    public final int getMenuTextColor() {
        return this.menuTextColor;
    }

    /* JADX INFO: renamed from: component13$zendesk_ui_ui_android, reason: from getter */
    public final int getMenuBackgroundColor() {
        return this.menuBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component14$zendesk_ui_ui_android, reason: from getter */
    public final String getComposerText() {
        return this.composerText;
    }

    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final boolean getCameraSupported() {
        return this.cameraSupported;
    }

    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final boolean getGallerySupported() {
        return this.gallerySupported;
    }

    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowAttachment() {
        return this.showAttachment;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final int getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final int getInputMaxLength() {
        return this.inputMaxLength;
    }

    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final int getSendButtonColor() {
        return this.sendButtonColor;
    }

    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final int getAttachButtonColor() {
        return this.attachButtonColor;
    }

    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final MessageComposerState copy(boolean enabled, boolean cameraSupported, boolean gallerySupported, boolean showAttachment, int visibility, int inputMaxLength, int sendButtonColor, int attachButtonColor, int borderColor, int focusedBorderColor, int textColor, int menuTextColor, int menuBackgroundColor, @NotNull String composerText) {
        composerText.getClass();
        return new MessageComposerState(enabled, cameraSupported, gallerySupported, showAttachment, visibility, inputMaxLength, sendButtonColor, attachButtonColor, borderColor, focusedBorderColor, textColor, menuTextColor, menuBackgroundColor, composerText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposerState)) {
            return false;
        }
        MessageComposerState messageComposerState = (MessageComposerState) other;
        return this.enabled == messageComposerState.enabled && this.cameraSupported == messageComposerState.cameraSupported && this.gallerySupported == messageComposerState.gallerySupported && this.showAttachment == messageComposerState.showAttachment && this.visibility == messageComposerState.visibility && this.inputMaxLength == messageComposerState.inputMaxLength && this.sendButtonColor == messageComposerState.sendButtonColor && this.attachButtonColor == messageComposerState.attachButtonColor && this.borderColor == messageComposerState.borderColor && this.focusedBorderColor == messageComposerState.focusedBorderColor && this.textColor == messageComposerState.textColor && this.menuTextColor == messageComposerState.menuTextColor && this.menuBackgroundColor == messageComposerState.menuBackgroundColor && Intrinsics.areEqual(this.composerText, messageComposerState.composerText);
    }

    public final int getAttachButtonColor$zendesk_ui_ui_android() {
        return this.attachButtonColor;
    }

    public final int getBorderColor$zendesk_ui_ui_android() {
        return this.borderColor;
    }

    public final boolean getCameraSupported$zendesk_ui_ui_android() {
        return this.cameraSupported;
    }

    @NotNull
    public final String getComposerText$zendesk_ui_ui_android() {
        return this.composerText;
    }

    public final boolean getEnabled$zendesk_ui_ui_android() {
        return this.enabled;
    }

    public final int getFocusedBorderColor$zendesk_ui_ui_android() {
        return this.focusedBorderColor;
    }

    public final boolean getGallerySupported$zendesk_ui_ui_android() {
        return this.gallerySupported;
    }

    public final int getInputMaxLength$zendesk_ui_ui_android() {
        return this.inputMaxLength;
    }

    public final int getMenuBackgroundColor$zendesk_ui_ui_android() {
        return this.menuBackgroundColor;
    }

    public final int getMenuTextColor$zendesk_ui_ui_android() {
        return this.menuTextColor;
    }

    public final int getSendButtonColor$zendesk_ui_ui_android() {
        return this.sendButtonColor;
    }

    public final boolean getShowAttachment$zendesk_ui_ui_android() {
        return this.showAttachment;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public final int getVisibility$zendesk_ui_ui_android() {
        return this.visibility;
    }

    public int hashCode() {
        return this.composerText.hashCode() + k.b(this.menuBackgroundColor, k.b(this.menuTextColor, k.b(this.textColor, k.b(this.focusedBorderColor, k.b(this.borderColor, k.b(this.attachButtonColor, k.b(this.sendButtonColor, k.b(this.inputMaxLength, k.b(this.visibility, k.e(k.e(k.e(Boolean.hashCode(this.enabled) * 31, 31, this.cameraSupported), 31, this.gallerySupported), 31, this.showAttachment), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enabled;
        boolean z12 = this.cameraSupported;
        boolean z13 = this.gallerySupported;
        boolean z14 = this.showAttachment;
        int i11 = this.visibility;
        int i12 = this.inputMaxLength;
        int i13 = this.sendButtonColor;
        int i14 = this.attachButtonColor;
        int i15 = this.borderColor;
        int i16 = this.focusedBorderColor;
        int i17 = this.textColor;
        int i18 = this.menuTextColor;
        int i19 = this.menuBackgroundColor;
        String str = this.composerText;
        StringBuilder sbP = i.p("MessageComposerState(enabled=", z11, ", cameraSupported=", z12, ", gallerySupported=");
        i.C(sbP, z13, ", showAttachment=", z14, ", visibility=");
        e0.f.C(sbP, i11, ", inputMaxLength=", i12, ", sendButtonColor=");
        e0.f.C(sbP, i13, ", attachButtonColor=", i14, ", borderColor=");
        e0.f.C(sbP, i15, ", focusedBorderColor=", i16, ", textColor=");
        e0.f.C(sbP, i17, ", menuTextColor=", i18, ", menuBackgroundColor=");
        sbP.append(i19);
        sbP.append(", composerText=");
        sbP.append(str);
        sbP.append(")");
        return sbP.toString();
    }

    public MessageComposerState(boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @NotNull String str) {
        str.getClass();
        this.enabled = z11;
        this.cameraSupported = z12;
        this.gallerySupported = z13;
        this.showAttachment = z14;
        this.visibility = i11;
        this.inputMaxLength = i12;
        this.sendButtonColor = i13;
        this.attachButtonColor = i14;
        this.borderColor = i15;
        this.focusedBorderColor = i16;
        this.textColor = i17;
        this.menuTextColor = i18;
        this.menuBackgroundColor = i19;
        this.composerText = str;
    }

    public MessageComposerState() {
        this(false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 16383, null);
    }
}
