package zendesk.messaging.android.internal.model;

import android.content.Context;
import android.graphics.Color;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.android.messaging.model.ColorTheme;
import zendesk.android.messaging.model.UserColors;
import zendesk.messaging.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bR\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 [2\u00020\u0001:\u0001[B\u008b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u008d\u0002\u0010T\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u0003HÖ\u0001J\t\u0010Y\u001a\u00020ZHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006\\"}, d2 = {"Lzendesk/messaging/android/internal/model/MessagingTheme;", "", "primaryColor", "", "onPrimaryColor", "messageColor", "onMessageColor", "actionColor", "onActionColor", "inboundMessageColor", "onBusinessMessageColor", "cardColor", "onCardColor", "backgroundColor", "onBackgroundColor", "elevatedColor", "onElevatedColor", "notifyColor", "onNotifyColor", "successColor", "onSuccessColor", "errorColor", "onErrorColor", "disabledColor", "iconColor", "secondaryActionColor", "onSecondaryAction", "onInputColor", "inputColor", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIIII)V", "getPrimaryColor", "()I", "getOnPrimaryColor", "getMessageColor", "getOnMessageColor", "getActionColor", "getOnActionColor", "getInboundMessageColor", "getOnBusinessMessageColor", "getCardColor", "getOnCardColor", "getBackgroundColor", "getOnBackgroundColor", "getElevatedColor", "getOnElevatedColor", "getNotifyColor", "getOnNotifyColor", "getSuccessColor", "getOnSuccessColor", "getErrorColor", "getOnErrorColor", "getDisabledColor", "getIconColor", "getSecondaryActionColor", "getOnSecondaryAction", "getOnInputColor", "getInputColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessagingTheme {
    private final int actionColor;
    private final int backgroundColor;
    private final int cardColor;
    private final int disabledColor;
    private final int elevatedColor;
    private final int errorColor;
    private final int iconColor;
    private final int inboundMessageColor;
    private final int inputColor;
    private final int messageColor;
    private final int notifyColor;
    private final int onActionColor;
    private final int onBackgroundColor;
    private final int onBusinessMessageColor;
    private final int onCardColor;
    private final int onElevatedColor;
    private final int onErrorColor;
    private final int onInputColor;
    private final int onMessageColor;
    private final int onNotifyColor;
    private final int onPrimaryColor;
    private final int onSecondaryAction;
    private final int onSuccessColor;
    private final int primaryColor;
    private final int secondaryActionColor;
    private final int successColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int defaultColour = 0;

    @NotNull
    private static final MessagingTheme DEFAULT = new MessagingTheme(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

    public MessagingTheme(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
        this.primaryColor = i11;
        this.onPrimaryColor = i12;
        this.messageColor = i13;
        this.onMessageColor = i14;
        this.actionColor = i15;
        this.onActionColor = i16;
        this.inboundMessageColor = i17;
        this.onBusinessMessageColor = i18;
        this.cardColor = i19;
        this.onCardColor = i21;
        this.backgroundColor = i22;
        this.onBackgroundColor = i23;
        this.elevatedColor = i24;
        this.onElevatedColor = i25;
        this.notifyColor = i26;
        this.onNotifyColor = i27;
        this.successColor = i28;
        this.onSuccessColor = i29;
        this.errorColor = i31;
        this.onErrorColor = i32;
        this.disabledColor = i33;
        this.iconColor = i34;
        this.secondaryActionColor = i35;
        this.onSecondaryAction = i36;
        this.onInputColor = i37;
        this.inputColor = i38;
    }

    public static /* synthetic */ MessagingTheme copy$default(MessagingTheme messagingTheme, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, Object obj) {
        int i41;
        int i42;
        int i43 = (i39 & 1) != 0 ? messagingTheme.primaryColor : i11;
        int i44 = (i39 & 2) != 0 ? messagingTheme.onPrimaryColor : i12;
        int i45 = (i39 & 4) != 0 ? messagingTheme.messageColor : i13;
        int i46 = (i39 & 8) != 0 ? messagingTheme.onMessageColor : i14;
        int i47 = (i39 & 16) != 0 ? messagingTheme.actionColor : i15;
        int i48 = (i39 & 32) != 0 ? messagingTheme.onActionColor : i16;
        int i49 = (i39 & 64) != 0 ? messagingTheme.inboundMessageColor : i17;
        int i51 = (i39 & 128) != 0 ? messagingTheme.onBusinessMessageColor : i18;
        int i52 = (i39 & 256) != 0 ? messagingTheme.cardColor : i19;
        int i53 = (i39 & 512) != 0 ? messagingTheme.onCardColor : i21;
        int i54 = (i39 & 1024) != 0 ? messagingTheme.backgroundColor : i22;
        int i55 = (i39 & NewHope.SENDB_BYTES) != 0 ? messagingTheme.onBackgroundColor : i23;
        int i56 = (i39 & 4096) != 0 ? messagingTheme.elevatedColor : i24;
        int i57 = (i39 & 8192) != 0 ? messagingTheme.onElevatedColor : i25;
        int i58 = i43;
        int i59 = (i39 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? messagingTheme.notifyColor : i26;
        int i61 = (i39 & 32768) != 0 ? messagingTheme.onNotifyColor : i27;
        int i62 = (i39 & 65536) != 0 ? messagingTheme.successColor : i28;
        int i63 = (i39 & 131072) != 0 ? messagingTheme.onSuccessColor : i29;
        int i64 = (i39 & 262144) != 0 ? messagingTheme.errorColor : i31;
        int i65 = (i39 & 524288) != 0 ? messagingTheme.onErrorColor : i32;
        int i66 = (i39 & 1048576) != 0 ? messagingTheme.disabledColor : i33;
        int i67 = (i39 & 2097152) != 0 ? messagingTheme.iconColor : i34;
        int i68 = (i39 & 4194304) != 0 ? messagingTheme.secondaryActionColor : i35;
        int i69 = (i39 & 8388608) != 0 ? messagingTheme.onSecondaryAction : i36;
        int i71 = (i39 & 16777216) != 0 ? messagingTheme.onInputColor : i37;
        if ((i39 & 33554432) != 0) {
            i42 = i71;
            i41 = messagingTheme.inputColor;
        } else {
            i41 = i38;
            i42 = i71;
        }
        return messagingTheme.copy(i58, i44, i45, i46, i47, i48, i49, i51, i52, i53, i54, i55, i56, i57, i59, i61, i62, i63, i64, i65, i66, i67, i68, i69, i42, i41);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOnCardColor() {
        return this.onCardColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getOnBackgroundColor() {
        return this.onBackgroundColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getElevatedColor() {
        return this.elevatedColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getOnElevatedColor() {
        return this.onElevatedColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getNotifyColor() {
        return this.notifyColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getOnNotifyColor() {
        return this.onNotifyColor;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getSuccessColor() {
        return this.successColor;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getOnSuccessColor() {
        return this.onSuccessColor;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getErrorColor() {
        return this.errorColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOnPrimaryColor() {
        return this.onPrimaryColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getOnErrorColor() {
        return this.onErrorColor;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getDisabledColor() {
        return this.disabledColor;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getSecondaryActionColor() {
        return this.secondaryActionColor;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getOnSecondaryAction() {
        return this.onSecondaryAction;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getOnInputColor() {
        return this.onInputColor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getInputColor() {
        return this.inputColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMessageColor() {
        return this.messageColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOnMessageColor() {
        return this.onMessageColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getActionColor() {
        return this.actionColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOnActionColor() {
        return this.onActionColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getInboundMessageColor() {
        return this.inboundMessageColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOnBusinessMessageColor() {
        return this.onBusinessMessageColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCardColor() {
        return this.cardColor;
    }

    @NotNull
    public final MessagingTheme copy(int primaryColor, int onPrimaryColor, int messageColor, int onMessageColor, int actionColor, int onActionColor, int inboundMessageColor, int onBusinessMessageColor, int cardColor, int onCardColor, int backgroundColor, int onBackgroundColor, int elevatedColor, int onElevatedColor, int notifyColor, int onNotifyColor, int successColor, int onSuccessColor, int errorColor, int onErrorColor, int disabledColor, int iconColor, int secondaryActionColor, int onSecondaryAction, int onInputColor, int inputColor) {
        return new MessagingTheme(primaryColor, onPrimaryColor, messageColor, onMessageColor, actionColor, onActionColor, inboundMessageColor, onBusinessMessageColor, cardColor, onCardColor, backgroundColor, onBackgroundColor, elevatedColor, onElevatedColor, notifyColor, onNotifyColor, successColor, onSuccessColor, errorColor, onErrorColor, disabledColor, iconColor, secondaryActionColor, onSecondaryAction, onInputColor, inputColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagingTheme)) {
            return false;
        }
        MessagingTheme messagingTheme = (MessagingTheme) other;
        return this.primaryColor == messagingTheme.primaryColor && this.onPrimaryColor == messagingTheme.onPrimaryColor && this.messageColor == messagingTheme.messageColor && this.onMessageColor == messagingTheme.onMessageColor && this.actionColor == messagingTheme.actionColor && this.onActionColor == messagingTheme.onActionColor && this.inboundMessageColor == messagingTheme.inboundMessageColor && this.onBusinessMessageColor == messagingTheme.onBusinessMessageColor && this.cardColor == messagingTheme.cardColor && this.onCardColor == messagingTheme.onCardColor && this.backgroundColor == messagingTheme.backgroundColor && this.onBackgroundColor == messagingTheme.onBackgroundColor && this.elevatedColor == messagingTheme.elevatedColor && this.onElevatedColor == messagingTheme.onElevatedColor && this.notifyColor == messagingTheme.notifyColor && this.onNotifyColor == messagingTheme.onNotifyColor && this.successColor == messagingTheme.successColor && this.onSuccessColor == messagingTheme.onSuccessColor && this.errorColor == messagingTheme.errorColor && this.onErrorColor == messagingTheme.onErrorColor && this.disabledColor == messagingTheme.disabledColor && this.iconColor == messagingTheme.iconColor && this.secondaryActionColor == messagingTheme.secondaryActionColor && this.onSecondaryAction == messagingTheme.onSecondaryAction && this.onInputColor == messagingTheme.onInputColor && this.inputColor == messagingTheme.inputColor;
    }

    public final int getActionColor() {
        return this.actionColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCardColor() {
        return this.cardColor;
    }

    public final int getDisabledColor() {
        return this.disabledColor;
    }

    public final int getElevatedColor() {
        return this.elevatedColor;
    }

    public final int getErrorColor() {
        return this.errorColor;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final int getInboundMessageColor() {
        return this.inboundMessageColor;
    }

    public final int getInputColor() {
        return this.inputColor;
    }

    public final int getMessageColor() {
        return this.messageColor;
    }

    public final int getNotifyColor() {
        return this.notifyColor;
    }

    public final int getOnActionColor() {
        return this.onActionColor;
    }

    public final int getOnBackgroundColor() {
        return this.onBackgroundColor;
    }

    public final int getOnBusinessMessageColor() {
        return this.onBusinessMessageColor;
    }

    public final int getOnCardColor() {
        return this.onCardColor;
    }

    public final int getOnElevatedColor() {
        return this.onElevatedColor;
    }

    public final int getOnErrorColor() {
        return this.onErrorColor;
    }

    public final int getOnInputColor() {
        return this.onInputColor;
    }

    public final int getOnMessageColor() {
        return this.onMessageColor;
    }

    public final int getOnNotifyColor() {
        return this.onNotifyColor;
    }

    public final int getOnPrimaryColor() {
        return this.onPrimaryColor;
    }

    public final int getOnSecondaryAction() {
        return this.onSecondaryAction;
    }

    public final int getOnSuccessColor() {
        return this.onSuccessColor;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getSecondaryActionColor() {
        return this.secondaryActionColor;
    }

    public final int getSuccessColor() {
        return this.successColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.inputColor) + k.b(this.onInputColor, k.b(this.onSecondaryAction, k.b(this.secondaryActionColor, k.b(this.iconColor, k.b(this.disabledColor, k.b(this.onErrorColor, k.b(this.errorColor, k.b(this.onSuccessColor, k.b(this.successColor, k.b(this.onNotifyColor, k.b(this.notifyColor, k.b(this.onElevatedColor, k.b(this.elevatedColor, k.b(this.onBackgroundColor, k.b(this.backgroundColor, k.b(this.onCardColor, k.b(this.cardColor, k.b(this.onBusinessMessageColor, k.b(this.inboundMessageColor, k.b(this.onActionColor, k.b(this.actionColor, k.b(this.onMessageColor, k.b(this.messageColor, k.b(this.onPrimaryColor, Integer.hashCode(this.primaryColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.primaryColor;
        int i12 = this.onPrimaryColor;
        int i13 = this.messageColor;
        int i14 = this.onMessageColor;
        int i15 = this.actionColor;
        int i16 = this.onActionColor;
        int i17 = this.inboundMessageColor;
        int i18 = this.onBusinessMessageColor;
        int i19 = this.cardColor;
        int i21 = this.onCardColor;
        int i22 = this.backgroundColor;
        int i23 = this.onBackgroundColor;
        int i24 = this.elevatedColor;
        int i25 = this.onElevatedColor;
        int i26 = this.notifyColor;
        int i27 = this.onNotifyColor;
        int i28 = this.successColor;
        int i29 = this.onSuccessColor;
        int i31 = this.errorColor;
        int i32 = this.onErrorColor;
        int i33 = this.disabledColor;
        int i34 = this.iconColor;
        int i35 = this.secondaryActionColor;
        int i36 = this.onSecondaryAction;
        int i37 = this.onInputColor;
        int i38 = this.inputColor;
        StringBuilder sbR = k.r(i11, i12, "MessagingTheme(primaryColor=", ", onPrimaryColor=", ", messageColor=");
        f.C(sbR, i13, ", onMessageColor=", i14, ", actionColor=");
        f.C(sbR, i15, ", onActionColor=", i16, ", inboundMessageColor=");
        f.C(sbR, i17, ", onBusinessMessageColor=", i18, ", cardColor=");
        f.C(sbR, i19, ", onCardColor=", i21, ", backgroundColor=");
        f.C(sbR, i22, ", onBackgroundColor=", i23, ", elevatedColor=");
        f.C(sbR, i24, ", onElevatedColor=", i25, ", notifyColor=");
        f.C(sbR, i26, ", onNotifyColor=", i27, ", successColor=");
        f.C(sbR, i28, ", onSuccessColor=", i29, ", errorColor=");
        f.C(sbR, i31, ", onErrorColor=", i32, ", disabledColor=");
        f.C(sbR, i33, ", iconColor=", i34, ", secondaryActionColor=");
        f.C(sbR, i35, ", onSecondaryAction=", i36, ", onInputColor=");
        sbR.append(i37);
        sbR.append(", inputColor=");
        sbR.append(i38);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/model/MessagingTheme$Companion;", "", "<init>", "()V", "defaultColour", "", "DEFAULT", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getDEFAULT", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "from", "context", "Landroid/content/Context;", "colorTheme", "Lzendesk/android/messaging/model/ColorTheme;", "userColors", "Lzendesk/android/messaging/model/UserColors;", "parseColor", "colorCode", "", "defaultColorResId", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int parseColor(Context context, String colorCode, int defaultColorResId) {
            try {
                return Color.parseColor(colorCode);
            } catch (IllegalArgumentException unused) {
                return context.getColor(defaultColorResId);
            } catch (StringIndexOutOfBoundsException unused2) {
                return context.getColor(defaultColorResId);
            }
        }

        @NotNull
        public final MessagingTheme from(@NotNull Context context, @NotNull ColorTheme colorTheme, @NotNull UserColors userColors) {
            context.getClass();
            colorTheme.getClass();
            userColors.getClass();
            Integer primary = userColors.getPrimary();
            int iIntValue = primary != null ? primary.intValue() : parseColor(context, colorTheme.getPrimaryColor(), R.color.zma_color_primary);
            Integer onPrimary = userColors.getOnPrimary();
            int iIntValue2 = onPrimary != null ? onPrimary.intValue() : parseColor(context, colorTheme.getOnPrimaryColor(), R.color.zma_color_on_primary);
            Integer message = userColors.getMessage();
            int iIntValue3 = message != null ? message.intValue() : parseColor(context, colorTheme.getMessageColor(), R.color.zma_color_message);
            Integer onMessage = userColors.getOnMessage();
            int iIntValue4 = onMessage != null ? onMessage.intValue() : parseColor(context, colorTheme.getOnMessageColor(), R.color.zma_color_on_message);
            Integer action = userColors.getAction();
            int iIntValue5 = action != null ? action.intValue() : parseColor(context, colorTheme.getActionColor(), R.color.zma_color_action);
            Integer onAction = userColors.getOnAction();
            int iIntValue6 = onAction != null ? onAction.intValue() : parseColor(context, colorTheme.getOnActionColor(), R.color.zma_color_on_action);
            Integer businessMessage = userColors.getBusinessMessage();
            int iIntValue7 = businessMessage != null ? businessMessage.intValue() : parseColor(context, colorTheme.getInboundMessageColor(), R.color.zma_color_inbound_message);
            int color = parseColor(context, colorTheme.getSystemMessageColor(), R.color.zma_color_system_message);
            int color2 = parseColor(context, colorTheme.getOnBackgroundColor(), R.color.zma_color_on_background);
            Integer background = userColors.getBackground();
            int iIntValue8 = background != null ? background.intValue() : parseColor(context, colorTheme.getBackgroundColor(), R.color.zma_color_background);
            Integer onBackground = userColors.getOnBackground();
            int iIntValue9 = onBackground != null ? onBackground.intValue() : parseColor(context, colorTheme.getOnBackgroundColor(), R.color.zma_color_on_background);
            int color3 = parseColor(context, colorTheme.getElevatedColor(), R.color.zma_color_elevated);
            int color4 = parseColor(context, colorTheme.getOnBackgroundColor(), R.color.zma_color_background);
            Integer notify = userColors.getNotify();
            int iIntValue10 = notify != null ? notify.intValue() : parseColor(context, colorTheme.getNotifyColor(), R.color.zma_color_notify);
            Integer onNotify = userColors.getOnNotify();
            int iIntValue11 = onNotify != null ? onNotify.intValue() : context.getColor(R.color.zma_color_on_notify);
            int color5 = parseColor(context, colorTheme.getSuccessColor(), R.color.zma_color_success);
            int color6 = parseColor(context, colorTheme.getBackgroundColor(), R.color.zma_color_background);
            Integer error = userColors.getError();
            int iIntValue12 = error != null ? error.intValue() : parseColor(context, colorTheme.getDangerColor(), R.color.zma_color_danger);
            Integer onError = userColors.getOnError();
            int iIntValue13 = onError != null ? onError.intValue() : parseColor(context, colorTheme.getOnDangerColor(), R.color.zma_color_on_danger);
            int color7 = parseColor(context, colorTheme.getDisabledColor(), R.color.zma_color_disabled);
            int color8 = parseColor(context, colorTheme.getIconColor(), R.color.zma_color_icon_color_default);
            int color9 = context.getColor(R.color.zma_color_action_background);
            Integer onSecondaryAction = userColors.getOnSecondaryAction();
            int iIntValue14 = onSecondaryAction != null ? onSecondaryAction.intValue() : parseColor(context, colorTheme.getOnActionBackgroundColor(), R.color.zma_color_on_secondary_action);
            Integer onBusinessMessage = userColors.getOnBusinessMessage();
            return new MessagingTheme(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, onBusinessMessage != null ? onBusinessMessage.intValue() : parseColor(context, colorTheme.getOnBackgroundColor(), R.color.zma_color_on_background), color, color2, iIntValue8, iIntValue9, color3, color4, iIntValue10, iIntValue11, color5, color6, iIntValue12, iIntValue13, color7, color8, color9, iIntValue14, parseColor(context, colorTheme.getOnBackgroundColor(), R.color.zma_color_on_background), parseColor(context, colorTheme.getBackgroundColor(), R.color.zma_color_background));
        }

        @NotNull
        public final MessagingTheme getDEFAULT() {
            return MessagingTheme.DEFAULT;
        }

        private Companion() {
        }
    }
}
