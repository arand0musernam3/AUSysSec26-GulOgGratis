package zendesk.android.settings.internal.model;

import b3.i;
import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0081\b\u0018\u0000 k2\u00020\u0001:\u0002lkB\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017BÙ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJÎ\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010C\u0012\u0004\bH\u0010F\u001a\u0004\bG\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010C\u0012\u0004\bJ\u0010F\u001a\u0004\bI\u0010\u001eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010C\u0012\u0004\bL\u0010F\u001a\u0004\bK\u0010\u001eR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bN\u0010F\u001a\u0004\bM\u0010\u001eR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010C\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010C\u0012\u0004\bR\u0010F\u001a\u0004\bQ\u0010\u001eR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bT\u0010F\u001a\u0004\bS\u0010\u001eR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010C\u0012\u0004\bV\u0010F\u001a\u0004\bU\u0010\u001eR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bX\u0010F\u001a\u0004\bW\u0010\u001eR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010C\u0012\u0004\bZ\u0010F\u001a\u0004\bY\u0010\u001eR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\b\\\u0010F\u001a\u0004\b[\u0010\u001eR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010C\u0012\u0004\b^\u0010F\u001a\u0004\b]\u0010\u001eR \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010C\u0012\u0004\b`\u0010F\u001a\u0004\b_\u0010\u001eR \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010C\u0012\u0004\bb\u0010F\u001a\u0004\ba\u0010\u001eR \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bd\u0010F\u001a\u0004\bc\u0010\u001eR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bf\u0010F\u001a\u0004\be\u0010\u001eR \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010C\u0012\u0004\bh\u0010F\u001a\u0004\bg\u0010\u001eR \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010C\u0012\u0004\bj\u0010F\u001a\u0004\bi\u0010\u001e¨\u0006m"}, d2 = {"Lzendesk/android/settings/internal/model/ColorThemeDto;", "", "", "primaryColor", "onPrimaryColor", "messageColor", "onMessageColor", "actionColor", "onActionColor", "inboundMessageColor", "systemMessageColor", "backgroundColor", "onBackgroundColor", "elevatedColor", "notifyColor", "successColor", "dangerColor", "onDangerColor", "disabledColor", "iconColor", "actionBackgroundColor", "onActionBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzendesk/android/settings/internal/model/ColorThemeDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/ColorThemeDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getPrimaryColor", "getPrimaryColor$annotations", "()V", "getOnPrimaryColor", "getOnPrimaryColor$annotations", "getMessageColor", "getMessageColor$annotations", "getOnMessageColor", "getOnMessageColor$annotations", "getActionColor", "getActionColor$annotations", "getOnActionColor", "getOnActionColor$annotations", "getInboundMessageColor", "getInboundMessageColor$annotations", "getSystemMessageColor", "getSystemMessageColor$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getOnBackgroundColor", "getOnBackgroundColor$annotations", "getElevatedColor", "getElevatedColor$annotations", "getNotifyColor", "getNotifyColor$annotations", "getSuccessColor", "getSuccessColor$annotations", "getDangerColor", "getDangerColor$annotations", "getOnDangerColor", "getOnDangerColor$annotations", "getDisabledColor", "getDisabledColor$annotations", "getIconColor", "getIconColor$annotations", "getActionBackgroundColor", "getActionBackgroundColor$annotations", "getOnActionBackgroundColor", "getOnActionBackgroundColor$annotations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ColorThemeDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String actionBackgroundColor;

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

    public /* synthetic */ ColorThemeDto(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, m1 m1Var) {
        if (524287 != (i11 & 524287)) {
            c1.j(i11, 524287, ColorThemeDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
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
        this.actionBackgroundColor = str18;
        this.onActionBackgroundColor = str19;
    }

    public static /* synthetic */ ColorThemeDto copy$default(ColorThemeDto colorThemeDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i11, Object obj) {
        String str20;
        String str21;
        String str22 = (i11 & 1) != 0 ? colorThemeDto.primaryColor : str;
        String str23 = (i11 & 2) != 0 ? colorThemeDto.onPrimaryColor : str2;
        String str24 = (i11 & 4) != 0 ? colorThemeDto.messageColor : str3;
        String str25 = (i11 & 8) != 0 ? colorThemeDto.onMessageColor : str4;
        String str26 = (i11 & 16) != 0 ? colorThemeDto.actionColor : str5;
        String str27 = (i11 & 32) != 0 ? colorThemeDto.onActionColor : str6;
        String str28 = (i11 & 64) != 0 ? colorThemeDto.inboundMessageColor : str7;
        String str29 = (i11 & 128) != 0 ? colorThemeDto.systemMessageColor : str8;
        String str30 = (i11 & 256) != 0 ? colorThemeDto.backgroundColor : str9;
        String str31 = (i11 & 512) != 0 ? colorThemeDto.onBackgroundColor : str10;
        String str32 = (i11 & 1024) != 0 ? colorThemeDto.elevatedColor : str11;
        String str33 = (i11 & NewHope.SENDB_BYTES) != 0 ? colorThemeDto.notifyColor : str12;
        String str34 = (i11 & 4096) != 0 ? colorThemeDto.successColor : str13;
        String str35 = (i11 & 8192) != 0 ? colorThemeDto.dangerColor : str14;
        String str36 = str22;
        String str37 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? colorThemeDto.onDangerColor : str15;
        String str38 = (i11 & 32768) != 0 ? colorThemeDto.disabledColor : str16;
        String str39 = (i11 & 65536) != 0 ? colorThemeDto.iconColor : str17;
        String str40 = (i11 & 131072) != 0 ? colorThemeDto.actionBackgroundColor : str18;
        if ((i11 & 262144) != 0) {
            str21 = str40;
            str20 = colorThemeDto.onActionBackgroundColor;
        } else {
            str20 = str19;
            str21 = str40;
        }
        return colorThemeDto.copy(str36, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str37, str38, str39, str21, str20);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(ColorThemeDto self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.primaryColor);
        output.q(serialDesc, 1, self.onPrimaryColor);
        output.q(serialDesc, 2, self.messageColor);
        output.q(serialDesc, 3, self.onMessageColor);
        output.q(serialDesc, 4, self.actionColor);
        output.q(serialDesc, 5, self.onActionColor);
        output.q(serialDesc, 6, self.inboundMessageColor);
        output.q(serialDesc, 7, self.systemMessageColor);
        output.q(serialDesc, 8, self.backgroundColor);
        output.q(serialDesc, 9, self.onBackgroundColor);
        output.q(serialDesc, 10, self.elevatedColor);
        output.q(serialDesc, 11, self.notifyColor);
        output.q(serialDesc, 12, self.successColor);
        output.q(serialDesc, 13, self.dangerColor);
        output.q(serialDesc, 14, self.onDangerColor);
        output.q(serialDesc, 15, self.disabledColor);
        output.q(serialDesc, 16, self.iconColor);
        output.q(serialDesc, 17, self.actionBackgroundColor);
        output.q(serialDesc, 18, self.onActionBackgroundColor);
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
    public final String getActionBackgroundColor() {
        return this.actionBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
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
    public final ColorThemeDto copy(@NotNull String primaryColor, @NotNull String onPrimaryColor, @NotNull String messageColor, @NotNull String onMessageColor, @NotNull String actionColor, @NotNull String onActionColor, @NotNull String inboundMessageColor, @NotNull String systemMessageColor, @NotNull String backgroundColor, @NotNull String onBackgroundColor, @NotNull String elevatedColor, @NotNull String notifyColor, @NotNull String successColor, @NotNull String dangerColor, @NotNull String onDangerColor, @NotNull String disabledColor, @NotNull String iconColor, @NotNull String actionBackgroundColor, @NotNull String onActionBackgroundColor) {
        i.B(primaryColor, onPrimaryColor, messageColor, onMessageColor, actionColor);
        i.B(onActionColor, inboundMessageColor, systemMessageColor, backgroundColor, onBackgroundColor);
        i.B(elevatedColor, notifyColor, successColor, dangerColor, onDangerColor);
        disabledColor.getClass();
        iconColor.getClass();
        actionBackgroundColor.getClass();
        onActionBackgroundColor.getClass();
        return new ColorThemeDto(primaryColor, onPrimaryColor, messageColor, onMessageColor, actionColor, onActionColor, inboundMessageColor, systemMessageColor, backgroundColor, onBackgroundColor, elevatedColor, notifyColor, successColor, dangerColor, onDangerColor, disabledColor, iconColor, actionBackgroundColor, onActionBackgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorThemeDto)) {
            return false;
        }
        ColorThemeDto colorThemeDto = (ColorThemeDto) other;
        return Intrinsics.areEqual(this.primaryColor, colorThemeDto.primaryColor) && Intrinsics.areEqual(this.onPrimaryColor, colorThemeDto.onPrimaryColor) && Intrinsics.areEqual(this.messageColor, colorThemeDto.messageColor) && Intrinsics.areEqual(this.onMessageColor, colorThemeDto.onMessageColor) && Intrinsics.areEqual(this.actionColor, colorThemeDto.actionColor) && Intrinsics.areEqual(this.onActionColor, colorThemeDto.onActionColor) && Intrinsics.areEqual(this.inboundMessageColor, colorThemeDto.inboundMessageColor) && Intrinsics.areEqual(this.systemMessageColor, colorThemeDto.systemMessageColor) && Intrinsics.areEqual(this.backgroundColor, colorThemeDto.backgroundColor) && Intrinsics.areEqual(this.onBackgroundColor, colorThemeDto.onBackgroundColor) && Intrinsics.areEqual(this.elevatedColor, colorThemeDto.elevatedColor) && Intrinsics.areEqual(this.notifyColor, colorThemeDto.notifyColor) && Intrinsics.areEqual(this.successColor, colorThemeDto.successColor) && Intrinsics.areEqual(this.dangerColor, colorThemeDto.dangerColor) && Intrinsics.areEqual(this.onDangerColor, colorThemeDto.onDangerColor) && Intrinsics.areEqual(this.disabledColor, colorThemeDto.disabledColor) && Intrinsics.areEqual(this.iconColor, colorThemeDto.iconColor) && Intrinsics.areEqual(this.actionBackgroundColor, colorThemeDto.actionBackgroundColor) && Intrinsics.areEqual(this.onActionBackgroundColor, colorThemeDto.onActionBackgroundColor);
    }

    @NotNull
    public final String getActionBackgroundColor() {
        return this.actionBackgroundColor;
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
        return this.onActionBackgroundColor.hashCode() + l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(l1.b(this.primaryColor.hashCode() * 31, 31, this.onPrimaryColor), 31, this.messageColor), 31, this.onMessageColor), 31, this.actionColor), 31, this.onActionColor), 31, this.inboundMessageColor), 31, this.systemMessageColor), 31, this.backgroundColor), 31, this.onBackgroundColor), 31, this.elevatedColor), 31, this.notifyColor), 31, this.successColor), 31, this.dangerColor), 31, this.onDangerColor), 31, this.disabledColor), 31, this.iconColor), 31, this.actionBackgroundColor);
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
        String str18 = this.actionBackgroundColor;
        String str19 = this.onActionBackgroundColor;
        StringBuilder sbT = f.t("ColorThemeDto(primaryColor=", str, ", onPrimaryColor=", str2, ", messageColor=");
        s.A(sbT, str3, ", onMessageColor=", str4, ", actionColor=");
        s.A(sbT, str5, ", onActionColor=", str6, ", inboundMessageColor=");
        s.A(sbT, str7, ", systemMessageColor=", str8, ", backgroundColor=");
        s.A(sbT, str9, ", onBackgroundColor=", str10, ", elevatedColor=");
        s.A(sbT, str11, ", notifyColor=", str12, ", successColor=");
        s.A(sbT, str13, ", dangerColor=", str14, ", onDangerColor=");
        s.A(sbT, str15, ", disabledColor=", str16, ", iconColor=");
        s.A(sbT, str17, ", actionBackgroundColor=", str18, ", onActionBackgroundColor=");
        return k.p(sbT, str19, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/ColorThemeDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/ColorThemeDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ColorThemeDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("action_background_color")
    public static /* synthetic */ void getActionBackgroundColor$annotations() {
    }

    @g("action_color")
    public static /* synthetic */ void getActionColor$annotations() {
    }

    @g("background_color")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @g("danger_color")
    public static /* synthetic */ void getDangerColor$annotations() {
    }

    @g("disabled_color")
    public static /* synthetic */ void getDisabledColor$annotations() {
    }

    @g("elevated_color")
    public static /* synthetic */ void getElevatedColor$annotations() {
    }

    @g(InAppMessageBase.ICON_COLOR)
    public static /* synthetic */ void getIconColor$annotations() {
    }

    @g("inbound_message_color")
    public static /* synthetic */ void getInboundMessageColor$annotations() {
    }

    @g("message_color")
    public static /* synthetic */ void getMessageColor$annotations() {
    }

    @g("notify_color")
    public static /* synthetic */ void getNotifyColor$annotations() {
    }

    @g("on_action_background_color")
    public static /* synthetic */ void getOnActionBackgroundColor$annotations() {
    }

    @g("on_action_color")
    public static /* synthetic */ void getOnActionColor$annotations() {
    }

    @g("on_background_color")
    public static /* synthetic */ void getOnBackgroundColor$annotations() {
    }

    @g("on_danger_color")
    public static /* synthetic */ void getOnDangerColor$annotations() {
    }

    @g("on_message_color")
    public static /* synthetic */ void getOnMessageColor$annotations() {
    }

    @g("on_primary_color")
    public static /* synthetic */ void getOnPrimaryColor$annotations() {
    }

    @g("primary_color")
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }

    @g("success_color")
    public static /* synthetic */ void getSuccessColor$annotations() {
    }

    @g("system_message_color")
    public static /* synthetic */ void getSystemMessageColor$annotations() {
    }

    public ColorThemeDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19) {
        i.B(str, str2, str3, str4, str5);
        i.B(str6, str7, str8, str9, str10);
        i.B(str11, str12, str13, str14, str15);
        str16.getClass();
        str17.getClass();
        str18.getClass();
        str19.getClass();
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
        this.actionBackgroundColor = str18;
        this.onActionBackgroundColor = str19;
    }
}
