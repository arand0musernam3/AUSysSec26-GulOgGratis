package zendesk.android.settings.internal.model;

import b3.i;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0081\b\u0018\u0000 V2\u00020\u0001:\u0002WVBs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0086\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010?\u0012\u0004\bD\u0010B\u001a\u0004\bC\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010E\u0012\u0004\bG\u0010B\u001a\u0004\bF\u0010 R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bI\u0010B\u001a\u0004\b\t\u0010\"R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010J\u0012\u0004\bL\u0010B\u001a\u0004\bK\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bO\u0010B\u001a\u0004\bN\u0010&R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bR\u0010B\u001a\u0004\bQ\u0010(R \u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010H\u0012\u0004\bS\u0010B\u001a\u0004\b\u0010\u0010\"R \u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bT\u0010B\u001a\u0004\b\u0011\u0010\"R \u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010H\u0012\u0004\bU\u0010B\u001a\u0004\b\u0012\u0010\"¨\u0006X"}, d2 = {"Lzendesk/android/settings/internal/model/SettingsDto;", "", "", "identifier", "Lzendesk/android/settings/internal/model/ColorThemeDto;", "lightTheme", "darkTheme", "", "showZendeskLogo", "isAttachmentsEnabled", "Lzendesk/android/settings/internal/model/NativeMessagingDto;", "nativeMessaging", "Lzendesk/android/settings/internal/model/SunCoConfigDto;", "sunCoConfigDto", "Lzendesk/android/settings/internal/model/AttachmentsRulesDto;", "attachmentRulesDto", "isEndSessionEnabled", "isReopenConversationDisabled", "isConversationTranscriptEnabled", "<init>", "(Ljava/lang/String;Lzendesk/android/settings/internal/model/ColorThemeDto;Lzendesk/android/settings/internal/model/ColorThemeDto;Ljava/lang/Boolean;ZLzendesk/android/settings/internal/model/NativeMessagingDto;Lzendesk/android/settings/internal/model/SunCoConfigDto;Lzendesk/android/settings/internal/model/AttachmentsRulesDto;ZZZ)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/android/settings/internal/model/ColorThemeDto;Lzendesk/android/settings/internal/model/ColorThemeDto;Ljava/lang/Boolean;ZLzendesk/android/settings/internal/model/NativeMessagingDto;Lzendesk/android/settings/internal/model/SunCoConfigDto;Lzendesk/android/settings/internal/model/AttachmentsRulesDto;ZZZLm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/android/settings/internal/model/ColorThemeDto;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Z", "component6", "()Lzendesk/android/settings/internal/model/NativeMessagingDto;", "component7", "()Lzendesk/android/settings/internal/model/SunCoConfigDto;", "component8", "()Lzendesk/android/settings/internal/model/AttachmentsRulesDto;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lzendesk/android/settings/internal/model/ColorThemeDto;Lzendesk/android/settings/internal/model/ColorThemeDto;Ljava/lang/Boolean;ZLzendesk/android/settings/internal/model/NativeMessagingDto;Lzendesk/android/settings/internal/model/SunCoConfigDto;Lzendesk/android/settings/internal/model/AttachmentsRulesDto;ZZZ)Lzendesk/android/settings/internal/model/SettingsDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/SettingsDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIdentifier", "Lzendesk/android/settings/internal/model/ColorThemeDto;", "getLightTheme", "getLightTheme$annotations", "()V", "getDarkTheme", "getDarkTheme$annotations", "Ljava/lang/Boolean;", "getShowZendeskLogo", "getShowZendeskLogo$annotations", "Z", "isAttachmentsEnabled$annotations", "Lzendesk/android/settings/internal/model/NativeMessagingDto;", "getNativeMessaging", "getNativeMessaging$annotations", "Lzendesk/android/settings/internal/model/SunCoConfigDto;", "getSunCoConfigDto", "getSunCoConfigDto$annotations", "Lzendesk/android/settings/internal/model/AttachmentsRulesDto;", "getAttachmentRulesDto", "getAttachmentRulesDto$annotations", "isEndSessionEnabled$annotations", "isReopenConversationDisabled$annotations", "isConversationTranscriptEnabled$annotations", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SettingsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AttachmentsRulesDto attachmentRulesDto;

    @NotNull
    private final ColorThemeDto darkTheme;

    @Nullable
    private final String identifier;
    private final boolean isAttachmentsEnabled;
    private final boolean isConversationTranscriptEnabled;
    private final boolean isEndSessionEnabled;
    private final boolean isReopenConversationDisabled;

    @NotNull
    private final ColorThemeDto lightTheme;

    @NotNull
    private final NativeMessagingDto nativeMessaging;

    @Nullable
    private final Boolean showZendeskLogo;

    @Nullable
    private final SunCoConfigDto sunCoConfigDto;

    public /* synthetic */ SettingsDto(int i11, String str, ColorThemeDto colorThemeDto, ColorThemeDto colorThemeDto2, Boolean bool, boolean z11, NativeMessagingDto nativeMessagingDto, SunCoConfigDto sunCoConfigDto, AttachmentsRulesDto attachmentsRulesDto, boolean z12, boolean z13, boolean z14, m1 m1Var) {
        if (55 != (i11 & 55)) {
            c1.j(i11, 55, SettingsDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.identifier = str;
        this.lightTheme = colorThemeDto;
        this.darkTheme = colorThemeDto2;
        if ((i11 & 8) == 0) {
            this.showZendeskLogo = null;
        } else {
            this.showZendeskLogo = bool;
        }
        this.isAttachmentsEnabled = z11;
        this.nativeMessaging = nativeMessagingDto;
        if ((i11 & 64) == 0) {
            this.sunCoConfigDto = null;
        } else {
            this.sunCoConfigDto = sunCoConfigDto;
        }
        if ((i11 & 128) == 0) {
            this.attachmentRulesDto = null;
        } else {
            this.attachmentRulesDto = attachmentsRulesDto;
        }
        if ((i11 & 256) == 0) {
            this.isEndSessionEnabled = false;
        } else {
            this.isEndSessionEnabled = z12;
        }
        if ((i11 & 512) == 0) {
            this.isReopenConversationDisabled = false;
        } else {
            this.isReopenConversationDisabled = z13;
        }
        if ((i11 & 1024) == 0) {
            this.isConversationTranscriptEnabled = false;
        } else {
            this.isConversationTranscriptEnabled = z14;
        }
    }

    public static /* synthetic */ SettingsDto copy$default(SettingsDto settingsDto, String str, ColorThemeDto colorThemeDto, ColorThemeDto colorThemeDto2, Boolean bool, boolean z11, NativeMessagingDto nativeMessagingDto, SunCoConfigDto sunCoConfigDto, AttachmentsRulesDto attachmentsRulesDto, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = settingsDto.identifier;
        }
        if ((i11 & 2) != 0) {
            colorThemeDto = settingsDto.lightTheme;
        }
        if ((i11 & 4) != 0) {
            colorThemeDto2 = settingsDto.darkTheme;
        }
        if ((i11 & 8) != 0) {
            bool = settingsDto.showZendeskLogo;
        }
        if ((i11 & 16) != 0) {
            z11 = settingsDto.isAttachmentsEnabled;
        }
        if ((i11 & 32) != 0) {
            nativeMessagingDto = settingsDto.nativeMessaging;
        }
        if ((i11 & 64) != 0) {
            sunCoConfigDto = settingsDto.sunCoConfigDto;
        }
        if ((i11 & 128) != 0) {
            attachmentsRulesDto = settingsDto.attachmentRulesDto;
        }
        if ((i11 & 256) != 0) {
            z12 = settingsDto.isEndSessionEnabled;
        }
        if ((i11 & 512) != 0) {
            z13 = settingsDto.isReopenConversationDisabled;
        }
        if ((i11 & 1024) != 0) {
            z14 = settingsDto.isConversationTranscriptEnabled;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        AttachmentsRulesDto attachmentsRulesDto2 = attachmentsRulesDto;
        boolean z17 = z12;
        NativeMessagingDto nativeMessagingDto2 = nativeMessagingDto;
        SunCoConfigDto sunCoConfigDto2 = sunCoConfigDto;
        boolean z18 = z11;
        ColorThemeDto colorThemeDto3 = colorThemeDto2;
        return settingsDto.copy(str, colorThemeDto, colorThemeDto3, bool, z18, nativeMessagingDto2, sunCoConfigDto2, attachmentsRulesDto2, z17, z15, z16);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(SettingsDto self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, r1.f29848a, self.identifier);
        ColorThemeDto$$serializer colorThemeDto$$serializer = ColorThemeDto$$serializer.INSTANCE;
        output.i(serialDesc, 1, colorThemeDto$$serializer, self.lightTheme);
        output.i(serialDesc, 2, colorThemeDto$$serializer, self.darkTheme);
        if (output.C(serialDesc) || self.showZendeskLogo != null) {
            output.r(serialDesc, 3, g.f29797a, self.showZendeskLogo);
        }
        output.p(serialDesc, 4, self.isAttachmentsEnabled);
        output.i(serialDesc, 5, NativeMessagingDto$$serializer.INSTANCE, self.nativeMessaging);
        if (output.C(serialDesc) || self.sunCoConfigDto != null) {
            output.r(serialDesc, 6, SunCoConfigDto$$serializer.INSTANCE, self.sunCoConfigDto);
        }
        if (output.C(serialDesc) || self.attachmentRulesDto != null) {
            output.r(serialDesc, 7, AttachmentsRulesDto$$serializer.INSTANCE, self.attachmentRulesDto);
        }
        if (output.C(serialDesc) || self.isEndSessionEnabled) {
            output.p(serialDesc, 8, self.isEndSessionEnabled);
        }
        if (output.C(serialDesc) || self.isReopenConversationDisabled) {
            output.p(serialDesc, 9, self.isReopenConversationDisabled);
        }
        if (output.C(serialDesc) || self.isConversationTranscriptEnabled) {
            output.p(serialDesc, 10, self.isConversationTranscriptEnabled);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsReopenConversationDisabled() {
        return this.isReopenConversationDisabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsConversationTranscriptEnabled() {
        return this.isConversationTranscriptEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ColorThemeDto getLightTheme() {
        return this.lightTheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ColorThemeDto getDarkTheme() {
        return this.darkTheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShowZendeskLogo() {
        return this.showZendeskLogo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsAttachmentsEnabled() {
        return this.isAttachmentsEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final NativeMessagingDto getNativeMessaging() {
        return this.nativeMessaging;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SunCoConfigDto getSunCoConfigDto() {
        return this.sunCoConfigDto;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AttachmentsRulesDto getAttachmentRulesDto() {
        return this.attachmentRulesDto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsEndSessionEnabled() {
        return this.isEndSessionEnabled;
    }

    @NotNull
    public final SettingsDto copy(@Nullable String identifier, @NotNull ColorThemeDto lightTheme, @NotNull ColorThemeDto darkTheme, @Nullable Boolean showZendeskLogo, boolean isAttachmentsEnabled, @NotNull NativeMessagingDto nativeMessaging, @Nullable SunCoConfigDto sunCoConfigDto, @Nullable AttachmentsRulesDto attachmentRulesDto, boolean isEndSessionEnabled, boolean isReopenConversationDisabled, boolean isConversationTranscriptEnabled) {
        lightTheme.getClass();
        darkTheme.getClass();
        nativeMessaging.getClass();
        return new SettingsDto(identifier, lightTheme, darkTheme, showZendeskLogo, isAttachmentsEnabled, nativeMessaging, sunCoConfigDto, attachmentRulesDto, isEndSessionEnabled, isReopenConversationDisabled, isConversationTranscriptEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsDto)) {
            return false;
        }
        SettingsDto settingsDto = (SettingsDto) other;
        return Intrinsics.areEqual(this.identifier, settingsDto.identifier) && Intrinsics.areEqual(this.lightTheme, settingsDto.lightTheme) && Intrinsics.areEqual(this.darkTheme, settingsDto.darkTheme) && Intrinsics.areEqual(this.showZendeskLogo, settingsDto.showZendeskLogo) && this.isAttachmentsEnabled == settingsDto.isAttachmentsEnabled && Intrinsics.areEqual(this.nativeMessaging, settingsDto.nativeMessaging) && Intrinsics.areEqual(this.sunCoConfigDto, settingsDto.sunCoConfigDto) && Intrinsics.areEqual(this.attachmentRulesDto, settingsDto.attachmentRulesDto) && this.isEndSessionEnabled == settingsDto.isEndSessionEnabled && this.isReopenConversationDisabled == settingsDto.isReopenConversationDisabled && this.isConversationTranscriptEnabled == settingsDto.isConversationTranscriptEnabled;
    }

    @Nullable
    public final AttachmentsRulesDto getAttachmentRulesDto() {
        return this.attachmentRulesDto;
    }

    @NotNull
    public final ColorThemeDto getDarkTheme() {
        return this.darkTheme;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final ColorThemeDto getLightTheme() {
        return this.lightTheme;
    }

    @NotNull
    public final NativeMessagingDto getNativeMessaging() {
        return this.nativeMessaging;
    }

    @Nullable
    public final Boolean getShowZendeskLogo() {
        return this.showZendeskLogo;
    }

    @Nullable
    public final SunCoConfigDto getSunCoConfigDto() {
        return this.sunCoConfigDto;
    }

    public int hashCode() {
        String str = this.identifier;
        int iHashCode = (this.darkTheme.hashCode() + ((this.lightTheme.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        Boolean bool = this.showZendeskLogo;
        int iHashCode2 = (this.nativeMessaging.hashCode() + k.e((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isAttachmentsEnabled)) * 31;
        SunCoConfigDto sunCoConfigDto = this.sunCoConfigDto;
        int iHashCode3 = (iHashCode2 + (sunCoConfigDto == null ? 0 : sunCoConfigDto.hashCode())) * 31;
        AttachmentsRulesDto attachmentsRulesDto = this.attachmentRulesDto;
        return Boolean.hashCode(this.isConversationTranscriptEnabled) + k.e(k.e((iHashCode3 + (attachmentsRulesDto != null ? attachmentsRulesDto.hashCode() : 0)) * 31, 31, this.isEndSessionEnabled), 31, this.isReopenConversationDisabled);
    }

    public final boolean isAttachmentsEnabled() {
        return this.isAttachmentsEnabled;
    }

    public final boolean isConversationTranscriptEnabled() {
        return this.isConversationTranscriptEnabled;
    }

    public final boolean isEndSessionEnabled() {
        return this.isEndSessionEnabled;
    }

    public final boolean isReopenConversationDisabled() {
        return this.isReopenConversationDisabled;
    }

    @NotNull
    public String toString() {
        String str = this.identifier;
        ColorThemeDto colorThemeDto = this.lightTheme;
        ColorThemeDto colorThemeDto2 = this.darkTheme;
        Boolean bool = this.showZendeskLogo;
        boolean z11 = this.isAttachmentsEnabled;
        NativeMessagingDto nativeMessagingDto = this.nativeMessaging;
        SunCoConfigDto sunCoConfigDto = this.sunCoConfigDto;
        AttachmentsRulesDto attachmentsRulesDto = this.attachmentRulesDto;
        boolean z12 = this.isEndSessionEnabled;
        boolean z13 = this.isReopenConversationDisabled;
        boolean z14 = this.isConversationTranscriptEnabled;
        StringBuilder sb2 = new StringBuilder("SettingsDto(identifier=");
        sb2.append(str);
        sb2.append(", lightTheme=");
        sb2.append(colorThemeDto);
        sb2.append(", darkTheme=");
        sb2.append(colorThemeDto2);
        sb2.append(", showZendeskLogo=");
        sb2.append(bool);
        sb2.append(", isAttachmentsEnabled=");
        sb2.append(z11);
        sb2.append(", nativeMessaging=");
        sb2.append(nativeMessagingDto);
        sb2.append(", sunCoConfigDto=");
        sb2.append(sunCoConfigDto);
        sb2.append(", attachmentRulesDto=");
        sb2.append(attachmentsRulesDto);
        sb2.append(", isEndSessionEnabled=");
        i.C(sb2, z12, ", isReopenConversationDisabled=", z13, ", isConversationTranscriptEnabled=");
        return s.o(sb2, z14, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/SettingsDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/SettingsDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SettingsDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @i90.g("attachment_rules")
    public static /* synthetic */ void getAttachmentRulesDto$annotations() {
    }

    @i90.g("dark_theme")
    public static /* synthetic */ void getDarkTheme$annotations() {
    }

    @i90.g("light_theme")
    public static /* synthetic */ void getLightTheme$annotations() {
    }

    @i90.g("native_messaging")
    public static /* synthetic */ void getNativeMessaging$annotations() {
    }

    @i90.g("show_zendesk_logo")
    public static /* synthetic */ void getShowZendeskLogo$annotations() {
    }

    @i90.g("sunco_config")
    public static /* synthetic */ void getSunCoConfigDto$annotations() {
    }

    @i90.g("attachments_enabled")
    public static /* synthetic */ void isAttachmentsEnabled$annotations() {
    }

    @i90.g("conversation_transcript_enabled")
    public static /* synthetic */ void isConversationTranscriptEnabled$annotations() {
    }

    @i90.g("end_session_enabled")
    public static /* synthetic */ void isEndSessionEnabled$annotations() {
    }

    @i90.g("reopen_conversation_disabled")
    public static /* synthetic */ void isReopenConversationDisabled$annotations() {
    }

    public SettingsDto(@Nullable String str, @NotNull ColorThemeDto colorThemeDto, @NotNull ColorThemeDto colorThemeDto2, @Nullable Boolean bool, boolean z11, @NotNull NativeMessagingDto nativeMessagingDto, @Nullable SunCoConfigDto sunCoConfigDto, @Nullable AttachmentsRulesDto attachmentsRulesDto, boolean z12, boolean z13, boolean z14) {
        colorThemeDto.getClass();
        colorThemeDto2.getClass();
        nativeMessagingDto.getClass();
        this.identifier = str;
        this.lightTheme = colorThemeDto;
        this.darkTheme = colorThemeDto2;
        this.showZendeskLogo = bool;
        this.isAttachmentsEnabled = z11;
        this.nativeMessaging = nativeMessagingDto;
        this.sunCoConfigDto = sunCoConfigDto;
        this.attachmentRulesDto = attachmentsRulesDto;
        this.isEndSessionEnabled = z12;
        this.isReopenConversationDisabled = z13;
        this.isConversationTranscriptEnabled = z14;
    }

    public /* synthetic */ SettingsDto(String str, ColorThemeDto colorThemeDto, ColorThemeDto colorThemeDto2, Boolean bool, boolean z11, NativeMessagingDto nativeMessagingDto, SunCoConfigDto sunCoConfigDto, AttachmentsRulesDto attachmentsRulesDto, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, colorThemeDto, colorThemeDto2, (i11 & 8) != 0 ? null : bool, z11, nativeMessagingDto, (i11 & 64) != 0 ? null : sunCoConfigDto, (i11 & 128) != 0 ? null : attachmentsRulesDto, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? false : z13, (i11 & 1024) != 0 ? false : z14);
    }
}
