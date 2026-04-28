package zendesk.ui.android.conversation.imagecell;

import android.net.Uri;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.ui.android.conversation.actionbutton.ActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b:J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b<J\u0010\u0010=\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b>J\u0010\u0010?\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b@J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\bBJ\u000e\u0010C\u001a\u00020\nHÀ\u0003¢\u0006\u0002\bDJ\u000e\u0010E\u001a\u00020\nHÀ\u0003¢\u0006\u0002\bFJ\u0016\u0010G\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÀ\u0003¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bJJ\u000e\u0010K\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bLJ\u000e\u0010M\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bNJ\u000e\u0010O\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bPJ\u000e\u0010Q\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bRJ\u000e\u0010S\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bTJ\u000e\u0010U\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bVJ\u000e\u0010W\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bXJ\u000e\u0010Y\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020\u001bHÀ\u0003¢\u0006\u0002\b^J\u0010\u0010_\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b`Jç\u0001\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00102\b\b\u0003\u0010\u0014\u001a\u00020\u00102\b\b\u0003\u0010\u0015\u001a\u00020\u00102\b\b\u0003\u0010\u0016\u001a\u00020\u00102\b\b\u0003\u0010\u0017\u001a\u00020\u00102\b\b\u0003\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010b\u001a\u00020\n2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\u0010HÖ\u0001J\t\u0010e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0014\u0010\u0012\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0014\u0010\u0013\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0014\u0010\u0014\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0014\u0010\u0015\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0014\u0010\u0016\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0014\u0010\u0017\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0014\u0010\u0018\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#¨\u0006f"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "", "uri", "Landroid/net/Uri;", "localUri", "imageType", "", "messageText", "richTextMessage", "isError", "", "isPending", "actions", "", "Lzendesk/ui/android/conversation/actionbutton/ActionButton;", "textColor", "", "errorTextColor", "errorColorOverlay", "errorBackgroundColor", "backgroundColor", "actionColor", "actionTextColor", "htmlCodeBlockTextColorInt", "htmlCodeBlockBackgroundColorInt", "errorText", "imageCellDirection", "Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "authorizationToken", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;IIIIIIIIILjava/lang/String;Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;Ljava/lang/String;)V", "getUri$zendesk_ui_ui_android", "()Landroid/net/Uri;", "getLocalUri$zendesk_ui_ui_android", "getImageType$zendesk_ui_ui_android", "()Ljava/lang/String;", "getMessageText$zendesk_ui_ui_android", "getRichTextMessage$zendesk_ui_ui_android", "isError$zendesk_ui_ui_android", "()Z", "isPending$zendesk_ui_ui_android", "getActions$zendesk_ui_ui_android", "()Ljava/util/List;", "getTextColor$zendesk_ui_ui_android", "()I", "getErrorTextColor$zendesk_ui_ui_android", "getErrorColorOverlay$zendesk_ui_ui_android", "getErrorBackgroundColor$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "getActionColor$zendesk_ui_ui_android", "getActionTextColor$zendesk_ui_ui_android", "getHtmlCodeBlockTextColorInt$zendesk_ui_ui_android", "getHtmlCodeBlockBackgroundColorInt$zendesk_ui_ui_android", "getErrorText$zendesk_ui_ui_android", "getImageCellDirection$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "getAuthorizationToken$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "component12", "component12$zendesk_ui_ui_android", "component13", "component13$zendesk_ui_ui_android", "component14", "component14$zendesk_ui_ui_android", "component15", "component15$zendesk_ui_ui_android", "component16", "component16$zendesk_ui_ui_android", "component17", "component17$zendesk_ui_ui_android", "component18", "component18$zendesk_ui_ui_android", "component19", "component19$zendesk_ui_ui_android", "component20", "component20$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageCellState {
    public static final int $stable = 8;
    private final int actionColor;
    private final int actionTextColor;

    @Nullable
    private final List<ActionButton> actions;

    @Nullable
    private final String authorizationToken;
    private final int backgroundColor;
    private final int errorBackgroundColor;
    private final int errorColorOverlay;

    @Nullable
    private final String errorText;
    private final int errorTextColor;
    private final int htmlCodeBlockBackgroundColorInt;
    private final int htmlCodeBlockTextColorInt;

    @NotNull
    private final ImageCellDirection imageCellDirection;

    @Nullable
    private final String imageType;
    private final boolean isError;
    private final boolean isPending;

    @Nullable
    private final Uri localUri;

    @Nullable
    private final String messageText;

    @Nullable
    private final String richTextMessage;
    private final int textColor;

    @Nullable
    private final Uri uri;

    public /* synthetic */ ImageCellState(Uri uri, Uri uri2, String str, String str2, String str3, boolean z11, boolean z12, List list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String str4, ImageCellDirection imageCellDirection, String str5, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? null : uri, (i21 & 2) != 0 ? null : uri2, (i21 & 4) != 0 ? null : str, (i21 & 8) != 0 ? "" : str2, (i21 & 16) != 0 ? null : str3, (i21 & 32) != 0 ? false : z11, (i21 & 64) != 0 ? false : z12, (i21 & 128) != 0 ? null : list, (i21 & 256) != 0 ? 0 : i11, (i21 & 512) != 0 ? 0 : i12, (i21 & 1024) != 0 ? 0 : i13, (i21 & NewHope.SENDB_BYTES) != 0 ? 0 : i14, (i21 & 4096) != 0 ? 0 : i15, (i21 & 8192) != 0 ? 0 : i16, (i21 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? 0 : i17, (i21 & 32768) != 0 ? 0 : i18, (i21 & 65536) != 0 ? 0 : i19, (i21 & 131072) == 0 ? str4 : "", (i21 & 262144) != 0 ? ImageCellDirection.INBOUND_SINGLE : imageCellDirection, (i21 & 524288) != 0 ? null : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageCellState copy$default(ImageCellState imageCellState, Uri uri, Uri uri2, String str, String str2, String str3, boolean z11, boolean z12, List list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String str4, ImageCellDirection imageCellDirection, String str5, int i21, Object obj) {
        String str6;
        ImageCellDirection imageCellDirection2;
        Uri uri3 = (i21 & 1) != 0 ? imageCellState.uri : uri;
        Uri uri4 = (i21 & 2) != 0 ? imageCellState.localUri : uri2;
        String str7 = (i21 & 4) != 0 ? imageCellState.imageType : str;
        String str8 = (i21 & 8) != 0 ? imageCellState.messageText : str2;
        String str9 = (i21 & 16) != 0 ? imageCellState.richTextMessage : str3;
        boolean z13 = (i21 & 32) != 0 ? imageCellState.isError : z11;
        boolean z14 = (i21 & 64) != 0 ? imageCellState.isPending : z12;
        List list2 = (i21 & 128) != 0 ? imageCellState.actions : list;
        int i22 = (i21 & 256) != 0 ? imageCellState.textColor : i11;
        int i23 = (i21 & 512) != 0 ? imageCellState.errorTextColor : i12;
        int i24 = (i21 & 1024) != 0 ? imageCellState.errorColorOverlay : i13;
        int i25 = (i21 & NewHope.SENDB_BYTES) != 0 ? imageCellState.errorBackgroundColor : i14;
        int i26 = (i21 & 4096) != 0 ? imageCellState.backgroundColor : i15;
        int i27 = (i21 & 8192) != 0 ? imageCellState.actionColor : i16;
        Uri uri5 = uri3;
        int i28 = (i21 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? imageCellState.actionTextColor : i17;
        int i29 = (i21 & 32768) != 0 ? imageCellState.htmlCodeBlockTextColorInt : i18;
        int i31 = (i21 & 65536) != 0 ? imageCellState.htmlCodeBlockBackgroundColorInt : i19;
        String str10 = (i21 & 131072) != 0 ? imageCellState.errorText : str4;
        ImageCellDirection imageCellDirection3 = (i21 & 262144) != 0 ? imageCellState.imageCellDirection : imageCellDirection;
        if ((i21 & 524288) != 0) {
            imageCellDirection2 = imageCellDirection3;
            str6 = imageCellState.authorizationToken;
        } else {
            str6 = str5;
            imageCellDirection2 = imageCellDirection3;
        }
        return imageCellState.copy(uri5, uri4, str7, str8, str9, z13, z14, list2, i22, i23, i24, i25, i26, i27, i28, i29, i31, str10, imageCellDirection2, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final int getErrorTextColor() {
        return this.errorTextColor;
    }

    /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
    public final int getErrorColorOverlay() {
        return this.errorColorOverlay;
    }

    /* JADX INFO: renamed from: component12$zendesk_ui_ui_android, reason: from getter */
    public final int getErrorBackgroundColor() {
        return this.errorBackgroundColor;
    }

    /* JADX INFO: renamed from: component13$zendesk_ui_ui_android, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component14$zendesk_ui_ui_android, reason: from getter */
    public final int getActionColor() {
        return this.actionColor;
    }

    /* JADX INFO: renamed from: component15$zendesk_ui_ui_android, reason: from getter */
    public final int getActionTextColor() {
        return this.actionTextColor;
    }

    /* JADX INFO: renamed from: component16$zendesk_ui_ui_android, reason: from getter */
    public final int getHtmlCodeBlockTextColorInt() {
        return this.htmlCodeBlockTextColorInt;
    }

    /* JADX INFO: renamed from: component17$zendesk_ui_ui_android, reason: from getter */
    public final int getHtmlCodeBlockBackgroundColorInt() {
        return this.htmlCodeBlockBackgroundColorInt;
    }

    @Nullable
    /* JADX INFO: renamed from: component18$zendesk_ui_ui_android, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @NotNull
    /* JADX INFO: renamed from: component19$zendesk_ui_ui_android, reason: from getter */
    public final ImageCellDirection getImageCellDirection() {
        return this.imageCellDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final Uri getLocalUri() {
        return this.localUri;
    }

    @Nullable
    /* JADX INFO: renamed from: component20$zendesk_ui_ui_android, reason: from getter */
    public final String getAuthorizationToken() {
        return this.authorizationToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component3$zendesk_ui_ui_android, reason: from getter */
    public final String getImageType() {
        return this.imageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4$zendesk_ui_ui_android, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final String getRichTextMessage() {
        return this.richTextMessage;
    }

    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final boolean getIsPending() {
        return this.isPending;
    }

    @Nullable
    public final List<ActionButton> component8$zendesk_ui_ui_android() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final ImageCellState copy(@Nullable Uri uri, @Nullable Uri localUri, @Nullable String imageType, @Nullable String messageText, @Nullable String richTextMessage, boolean isError, boolean isPending, @Nullable List<ActionButton> actions, int textColor, int errorTextColor, int errorColorOverlay, int errorBackgroundColor, int backgroundColor, int actionColor, int actionTextColor, int htmlCodeBlockTextColorInt, int htmlCodeBlockBackgroundColorInt, @Nullable String errorText, @NotNull ImageCellDirection imageCellDirection, @Nullable String authorizationToken) {
        imageCellDirection.getClass();
        return new ImageCellState(uri, localUri, imageType, messageText, richTextMessage, isError, isPending, actions, textColor, errorTextColor, errorColorOverlay, errorBackgroundColor, backgroundColor, actionColor, actionTextColor, htmlCodeBlockTextColorInt, htmlCodeBlockBackgroundColorInt, errorText, imageCellDirection, authorizationToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageCellState)) {
            return false;
        }
        ImageCellState imageCellState = (ImageCellState) other;
        return Intrinsics.areEqual(this.uri, imageCellState.uri) && Intrinsics.areEqual(this.localUri, imageCellState.localUri) && Intrinsics.areEqual(this.imageType, imageCellState.imageType) && Intrinsics.areEqual(this.messageText, imageCellState.messageText) && Intrinsics.areEqual(this.richTextMessage, imageCellState.richTextMessage) && this.isError == imageCellState.isError && this.isPending == imageCellState.isPending && Intrinsics.areEqual(this.actions, imageCellState.actions) && this.textColor == imageCellState.textColor && this.errorTextColor == imageCellState.errorTextColor && this.errorColorOverlay == imageCellState.errorColorOverlay && this.errorBackgroundColor == imageCellState.errorBackgroundColor && this.backgroundColor == imageCellState.backgroundColor && this.actionColor == imageCellState.actionColor && this.actionTextColor == imageCellState.actionTextColor && this.htmlCodeBlockTextColorInt == imageCellState.htmlCodeBlockTextColorInt && this.htmlCodeBlockBackgroundColorInt == imageCellState.htmlCodeBlockBackgroundColorInt && Intrinsics.areEqual(this.errorText, imageCellState.errorText) && this.imageCellDirection == imageCellState.imageCellDirection && Intrinsics.areEqual(this.authorizationToken, imageCellState.authorizationToken);
    }

    public final int getActionColor$zendesk_ui_ui_android() {
        return this.actionColor;
    }

    public final int getActionTextColor$zendesk_ui_ui_android() {
        return this.actionTextColor;
    }

    @Nullable
    public final List<ActionButton> getActions$zendesk_ui_ui_android() {
        return this.actions;
    }

    @Nullable
    public final String getAuthorizationToken$zendesk_ui_ui_android() {
        return this.authorizationToken;
    }

    public final int getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    public final int getErrorBackgroundColor$zendesk_ui_ui_android() {
        return this.errorBackgroundColor;
    }

    public final int getErrorColorOverlay$zendesk_ui_ui_android() {
        return this.errorColorOverlay;
    }

    @Nullable
    public final String getErrorText$zendesk_ui_ui_android() {
        return this.errorText;
    }

    public final int getErrorTextColor$zendesk_ui_ui_android() {
        return this.errorTextColor;
    }

    public final int getHtmlCodeBlockBackgroundColorInt$zendesk_ui_ui_android() {
        return this.htmlCodeBlockBackgroundColorInt;
    }

    public final int getHtmlCodeBlockTextColorInt$zendesk_ui_ui_android() {
        return this.htmlCodeBlockTextColorInt;
    }

    @NotNull
    public final ImageCellDirection getImageCellDirection$zendesk_ui_ui_android() {
        return this.imageCellDirection;
    }

    @Nullable
    public final String getImageType$zendesk_ui_ui_android() {
        return this.imageType;
    }

    @Nullable
    public final Uri getLocalUri$zendesk_ui_ui_android() {
        return this.localUri;
    }

    @Nullable
    public final String getMessageText$zendesk_ui_ui_android() {
        return this.messageText;
    }

    @Nullable
    public final String getRichTextMessage$zendesk_ui_ui_android() {
        return this.richTextMessage;
    }

    public final int getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    @Nullable
    public final Uri getUri$zendesk_ui_ui_android() {
        return this.uri;
    }

    public int hashCode() {
        Uri uri = this.uri;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.localUri;
        int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str = this.imageType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.richTextMessage;
        int iE = k.e(k.e((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isError), 31, this.isPending);
        List<ActionButton> list = this.actions;
        int iB = k.b(this.htmlCodeBlockBackgroundColorInt, k.b(this.htmlCodeBlockTextColorInt, k.b(this.actionTextColor, k.b(this.actionColor, k.b(this.backgroundColor, k.b(this.errorBackgroundColor, k.b(this.errorColorOverlay, k.b(this.errorTextColor, k.b(this.textColor, (iE + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str4 = this.errorText;
        int iHashCode5 = (this.imageCellDirection.hashCode() + ((iB + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.authorizationToken;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isError$zendesk_ui_ui_android() {
        return this.isError;
    }

    public final boolean isPending$zendesk_ui_ui_android() {
        return this.isPending;
    }

    @NotNull
    public String toString() {
        Uri uri = this.uri;
        Uri uri2 = this.localUri;
        String str = this.imageType;
        String str2 = this.messageText;
        String str3 = this.richTextMessage;
        boolean z11 = this.isError;
        boolean z12 = this.isPending;
        List<ActionButton> list = this.actions;
        int i11 = this.textColor;
        int i12 = this.errorTextColor;
        int i13 = this.errorColorOverlay;
        int i14 = this.errorBackgroundColor;
        int i15 = this.backgroundColor;
        int i16 = this.actionColor;
        int i17 = this.actionTextColor;
        int i18 = this.htmlCodeBlockTextColorInt;
        int i19 = this.htmlCodeBlockBackgroundColorInt;
        String str4 = this.errorText;
        ImageCellDirection imageCellDirection = this.imageCellDirection;
        String str5 = this.authorizationToken;
        StringBuilder sb2 = new StringBuilder("ImageCellState(uri=");
        sb2.append(uri);
        sb2.append(", localUri=");
        sb2.append(uri2);
        sb2.append(", imageType=");
        s.A(sb2, str, ", messageText=", str2, ", richTextMessage=");
        k.z(sb2, str3, ", isError=", z11, ", isPending=");
        sb2.append(z12);
        sb2.append(", actions=");
        sb2.append(list);
        sb2.append(", textColor=");
        f.C(sb2, i11, ", errorTextColor=", i12, ", errorColorOverlay=");
        f.C(sb2, i13, ", errorBackgroundColor=", i14, ", backgroundColor=");
        f.C(sb2, i15, ", actionColor=", i16, ", actionTextColor=");
        f.C(sb2, i17, ", htmlCodeBlockTextColorInt=", i18, ", htmlCodeBlockBackgroundColorInt=");
        sb2.append(i19);
        sb2.append(", errorText=");
        sb2.append(str4);
        sb2.append(", imageCellDirection=");
        sb2.append(imageCellDirection);
        sb2.append(", authorizationToken=");
        sb2.append(str5);
        sb2.append(")");
        return sb2.toString();
    }

    public ImageCellState(@Nullable Uri uri, @Nullable Uri uri2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11, boolean z12, @Nullable List<ActionButton> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @Nullable String str4, @NotNull ImageCellDirection imageCellDirection, @Nullable String str5) {
        imageCellDirection.getClass();
        this.uri = uri;
        this.localUri = uri2;
        this.imageType = str;
        this.messageText = str2;
        this.richTextMessage = str3;
        this.isError = z11;
        this.isPending = z12;
        this.actions = list;
        this.textColor = i11;
        this.errorTextColor = i12;
        this.errorColorOverlay = i13;
        this.errorBackgroundColor = i14;
        this.backgroundColor = i15;
        this.actionColor = i16;
        this.actionTextColor = i17;
        this.htmlCodeBlockTextColorInt = i18;
        this.htmlCodeBlockBackgroundColorInt = i19;
        this.errorText = str4;
        this.imageCellDirection = imageCellDirection;
        this.authorizationToken = str5;
    }

    public ImageCellState() {
        this(null, null, null, null, null, false, false, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 1048575, null);
    }
}
