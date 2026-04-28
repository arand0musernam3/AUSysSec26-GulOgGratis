package zendesk.android.messaging.model;

import b3.i;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J½\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006C"}, d2 = {"Lzendesk/android/messaging/model/ColorTheme;", "", "primaryColor", "", "onPrimaryColor", "messageColor", "onMessageColor", "actionColor", "onActionColor", "inboundMessageColor", "systemMessageColor", "backgroundColor", "onBackgroundColor", "elevatedColor", "notifyColor", "successColor", "dangerColor", "onDangerColor", "disabledColor", "iconColor", "onActionBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryColor", "()Ljava/lang/String;", "getOnPrimaryColor", "getMessageColor", "getOnMessageColor", "getActionColor", "getOnActionColor", "getInboundMessageColor", "getSystemMessageColor", "getBackgroundColor", "getOnBackgroundColor", "getElevatedColor", "getNotifyColor", "getSuccessColor", "getDangerColor", "getOnDangerColor", "getDisabledColor", "getIconColor", "getOnActionBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ColorTheme {

    @NotNull
    private final String actionColor;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String dangerColor;

    @NotNull
    private final String disabledColor;

    @NotNull
    private final String elevatedColor;

    @NotNull
    private final String iconColor;

    @NotNull
    private final String inboundMessageColor;

    @NotNull
    private final String messageColor;

    @NotNull
    private final String notifyColor;

    @NotNull
    private final String onActionBackgroundColor;

    @NotNull
    private final String onActionColor;

    @NotNull
    private final String onBackgroundColor;

    @NotNull
    private final String onDangerColor;

    @NotNull
    private final String onMessageColor;

    @NotNull
    private final String onPrimaryColor;

    @NotNull
    private final String primaryColor;

    @NotNull
    private final String successColor;

    @NotNull
    private final String systemMessageColor;

    @InternalZendeskApi
    public ColorTheme(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        i.B(str, str2, str3, str4, str5);
        i.B(str6, str7, str8, str9, str10);
        i.B(str11, str12, str13, str14, str15);
        a0.C(str16, str17, str18);
        this.primaryColor = str;
        this.onPrimaryColor = str2;
        this.messageColor = str3;
        this.onMessageColor = str4;
        this.actionColor = str5;
        this.onActionColor = str6;
        this.inboundMessageColor = str7;
        this.systemMessageColor = str8;
        this.backgroundColor = str9;
        this.onBackgroundColor = str10;
        this.elevatedColor = str11;
        this.notifyColor = str12;
        this.successColor = str13;
        this.dangerColor = str14;
        this.onDangerColor = str15;
        this.disabledColor = str16;
        this.iconColor = str17;
        this.onActionBackgroundColor = str18;
    }

    public static /* synthetic */ ColorTheme copy$default(ColorTheme colorTheme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i11, Object obj) {
        String str19;
        String str20;
        String str21 = (i11 & 1) != 0 ? colorTheme.primaryColor : str;
        String str22 = (i11 & 2) != 0 ? colorTheme.onPrimaryColor : str2;
        String str23 = (i11 & 4) != 0 ? colorTheme.messageColor : str3;
        String str24 = (i11 & 8) != 0 ? colorTheme.onMessageColor : str4;
        String str25 = (i11 & 16) != 0 ? colorTheme.actionColor : str5;
        String str26 = (i11 & 32) != 0 ? colorTheme.onActionColor : str6;
        String str27 = (i11 & 64) != 0 ? colorTheme.inboundMessageColor : str7;
        String str28 = (i11 & 128) != 0 ? colorTheme.systemMessageColor : str8;
        String str29 = (i11 & 256) != 0 ? colorTheme.backgroundColor : str9;
        String str30 = (i11 & 512) != 0 ? colorTheme.onBackgroundColor : str10;
        String str31 = (i11 & 1024) != 0 ? colorTheme.elevatedColor : str11;
        String str32 = (i11 & NewHope.SENDB_BYTES) != 0 ? colorTheme.notifyColor : str12;
        String str33 = (i11 & 4096) != 0 ? colorTheme.successColor : str13;
        String str34 = (i11 & 8192) != 0 ? colorTheme.dangerColor : str14;
        String str35 = str21;
        String str36 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? colorTheme.onDangerColor : str15;
        String str37 = (i11 & 32768) != 0 ? colorTheme.disabledColor : str16;
        String str38 = (i11 & 65536) != 0 ? colorTheme.iconColor : str17;
        if ((i11 & 131072) != 0) {
            str20 = str38;
            str19 = colorTheme.onActionBackgroundColor;
        } else {
            str19 = str18;
            str20 = str38;
        }
        return colorTheme.copy(str35, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str36, str37, str20, str19);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOnBackgroundColor() {
        return this.onBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getElevatedColor() {
        return this.elevatedColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNotifyColor() {
        return this.notifyColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSuccessColor() {
        return this.successColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDangerColor() {
        return this.dangerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOnDangerColor() {
        return this.onDangerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDisabledColor() {
        return this.disabledColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getOnActionBackgroundColor() {
        return this.onActionBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOnPrimaryColor() {
        return this.onPrimaryColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageColor() {
        return this.messageColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOnMessageColor() {
        return this.onMessageColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActionColor() {
        return this.actionColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOnActionColor() {
        return this.onActionColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInboundMessageColor() {
        return this.inboundMessageColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSystemMessageColor() {
        return this.systemMessageColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ColorTheme copy(@NotNull String primaryColor, @NotNull String onPrimaryColor, @NotNull String messageColor, @NotNull String onMessageColor, @NotNull String actionColor, @NotNull String onActionColor, @NotNull String inboundMessageColor, @NotNull String systemMessageColor, @NotNull String backgroundColor, @NotNull String onBackgroundColor, @NotNull String elevatedColor, @NotNull String notifyColor, @NotNull String successColor, @NotNull String dangerColor, @NotNull String onDangerColor, @NotNull String disabledColor, @NotNull String iconColor, @NotNull String onActionBackgroundColor) {
        i.B(primaryColor, onPrimaryColor, messageColor, onMessageColor, actionColor);
        i.B(onActionColor, inboundMessageColor, systemMessageColor, backgroundColor, onBackgroundColor);
        i.B(elevatedColor, notifyColor, successColor, dangerColor, onDangerColor);
        disabledColor.getClass();
        iconColor.getClass();
        onActionBackgroundColor.getClass();
        return new ColorTheme(primaryColor, onPrimaryColor, messageColor, onMessageColor, actionColor, onActionColor, inboundMessageColor, systemMessageColor, backgroundColor, onBackgroundColor, elevatedColor, notifyColor, successColor, dangerColor, onDangerColor, disabledColor, iconColor, onActionBackgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorTheme)) {
            return false;
        }
        ColorTheme colorTheme = (ColorTheme) other;
        return Intrinsics.areEqual(this.primaryColor, colorTheme.primaryColor) && Intrinsics.areEqual(this.onPrimaryColor, colorTheme.onPrimaryColor) && Intrinsics.areEqual(this.messageColor, colorTheme.messageColor) && Intrinsics.areEqual(this.onMessageColor, colorTheme.onMessageColor) && Intrinsics.areEqual(this.actionColor, colorTheme.actionColor) && Intrinsics.areEqual(this.onActionColor, colorTheme.onActionColor) && Intrinsics.areEqual(this.inboundMessageColor, colorTheme.inboundMessageColor) && Intrinsics.areEqual(this.systemMessageColor, colorTheme.systemMessageColor) && Intrinsics.areEqual(this.backgroundColor, colorTheme.backgroundColor) && Intrinsics.areEqual(this.onBackgroundColor, colorTheme.onBackgroundColor) && Intrinsics.areEqual(this.elevatedColor, colorTheme.elevatedColor) && Intrinsics.areEqual(this.notifyColor, colorTheme.notifyColor) && Intrinsics.areEqual(this.successColor, colorTheme.successColor) && Intrinsics.areEqual(this.dangerColor, colorTheme.dangerColor) && Intrinsics.areEqual(this.onDangerColor, colorTheme.onDangerColor) && Intrinsics.areEqual(this.disabledColor, colorTheme.disabledColor) && Intrinsics.areEqual(this.iconColor, colorTheme.iconColor) && Intrinsics.areEqual(this.onActionBackgroundColor, colorTheme.onActionBackgroundColor);
    }

    @NotNull
    public final String getActionColor() {
        return this.actionColor;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getDangerColor() {
        return this.dangerColor;
    }

    @NotNull
    public final String getDisabledColor() {
        return this.disabledColor;
    }

    @NotNull
    public final String getElevatedColor() {
        return this.elevatedColor;
    }

    @NotNull
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    public final String getInboundMessageColor() {
        return this.inboundMessageColor;
    }

    @NotNull
    public final String getMessageColor() {
        return this.messageColor;
    }

    @NotNull
    public final String getNotifyColor() {
        return this.notifyColor;
    }

    @NotNull
    public final String getOnActionBackgroundColor() {
        return this.onActionBackgroundColor;
    }

    @NotNull
    public final String getOnActionColor() {
        return this.onActionColor;
    }

    @NotNull
    public final String getOnBackgroundColor() {
        return this.onBackgroundColor;
    }

    @NotNull
    public final String getOnDangerColor() {
        return this.onDangerColor;
    }

    @NotNull
    public final String getOnMessageColor() {
        return this.onMessageColor;
    }

    @NotNull
    public final String getOnPrimaryColor() {
        return this.onPrimaryColor;
    }

    @NotNull
    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    @NotNull
    public final String getSuccessColor() {
        return this.successColor;
    }

    @NotNull
    public final String getSystemMessageColor() {
        return this.systemMessageColor;
    }

    public int hashCode() {
        return this.onActionBackgroundColor.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(this.primaryColor.hashCode() * 31, 31, this.onPrimaryColor), 31, this.messageColor), 31, this.onMessageColor), 31, this.actionColor), 31, this.onActionColor), 31, this.inboundMessageColor), 31, this.systemMessageColor), 31, this.backgroundColor), 31, this.onBackgroundColor), 31, this.elevatedColor), 31, this.notifyColor), 31, this.successColor), 31, this.dangerColor), 31, this.onDangerColor), 31, this.disabledColor), 31, this.iconColor);
    }

    @NotNull
    public String toString() {
        String str = this.primaryColor;
        String str2 = this.onPrimaryColor;
        String str3 = this.messageColor;
        String str4 = this.onMessageColor;
        String str5 = this.actionColor;
        String str6 = this.onActionColor;
        String str7 = this.inboundMessageColor;
        String str8 = this.systemMessageColor;
        String str9 = this.backgroundColor;
        String str10 = this.onBackgroundColor;
        String str11 = this.elevatedColor;
        String str12 = this.notifyColor;
        String str13 = this.successColor;
        String str14 = this.dangerColor;
        String str15 = this.onDangerColor;
        String str16 = this.disabledColor;
        String str17 = this.iconColor;
        String str18 = this.onActionBackgroundColor;
        StringBuilder sbT = f.t("ColorTheme(primaryColor=", str, ", onPrimaryColor=", str2, ", messageColor=");
        s.A(sbT, str3, ", onMessageColor=", str4, ", actionColor=");
        s.A(sbT, str5, ", onActionColor=", str6, ", inboundMessageColor=");
        s.A(sbT, str7, ", systemMessageColor=", str8, ", backgroundColor=");
        s.A(sbT, str9, ", onBackgroundColor=", str10, ", elevatedColor=");
        s.A(sbT, str11, ", notifyColor=", str12, ", successColor=");
        s.A(sbT, str13, ", dangerColor=", str14, ", onDangerColor=");
        s.A(sbT, str15, ", disabledColor=", str16, ", iconColor=");
        return f.o(sbT, str17, ", onActionBackgroundColor=", str18, ")");
    }
}
