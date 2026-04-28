package zendesk.android.messaging.model;

import b3.i;
import com.braze.models.FeatureFlag;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J¿\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001c¨\u0006A"}, d2 = {"Lzendesk/android/messaging/model/MessagingSettings;", "", "integrationId", "", FeatureFlag.ENABLED, "", "brand", MessageBundle.TITLE_ENTRY, "description", "logoUrl", "lightTheme", "Lzendesk/android/messaging/model/ColorTheme;", "darkTheme", "canUserCreateMoreConversations", "isMultiConversationsEnabled", "hipaaAttachmentFlag", "identifier", "canUserSeeConversationList", "shouldTrackInternalAnalyticEvents", "isMultiAttachmentsEnabled", "isEndSessionEnabled", "isReopenConversationDisabled", "isConversationTranscriptEnabled", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/android/messaging/model/ColorTheme;Lzendesk/android/messaging/model/ColorTheme;ZZZLjava/lang/String;ZZZZZZ)V", "getIntegrationId", "()Ljava/lang/String;", "getEnabled", "()Z", "getBrand", "getTitle", "getDescription", "getLogoUrl", "getLightTheme", "()Lzendesk/android/messaging/model/ColorTheme;", "getDarkTheme", "getCanUserCreateMoreConversations", "getHipaaAttachmentFlag", "getIdentifier", "getCanUserSeeConversationList", "getShouldTrackInternalAnalyticEvents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessagingSettings {

    @NotNull
    private final String brand;
    private final boolean canUserCreateMoreConversations;
    private final boolean canUserSeeConversationList;

    @NotNull
    private final ColorTheme darkTheme;

    @NotNull
    private final String description;
    private final boolean enabled;
    private final boolean hipaaAttachmentFlag;

    @NotNull
    private final String identifier;

    @Nullable
    private final String integrationId;
    private final boolean isConversationTranscriptEnabled;
    private final boolean isEndSessionEnabled;
    private final boolean isMultiAttachmentsEnabled;
    private final boolean isMultiConversationsEnabled;
    private final boolean isReopenConversationDisabled;

    @NotNull
    private final ColorTheme lightTheme;

    @NotNull
    private final String logoUrl;
    private final boolean shouldTrackInternalAnalyticEvents;

    @NotNull
    private final String title;

    public /* synthetic */ MessagingSettings(String str, boolean z11, String str2, String str3, String str4, String str5, ColorTheme colorTheme, ColorTheme colorTheme2, boolean z12, boolean z13, boolean z14, String str6, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, str2, str3, str4, str5, colorTheme, colorTheme2, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? false : z13, (i11 & 1024) != 0 ? false : z14, str6, (i11 & 4096) != 0 ? true : z15, z16, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? false : z17, (32768 & i11) != 0 ? false : z18, (65536 & i11) != 0 ? false : z19, (i11 & 131072) != 0 ? false : z21);
    }

    public static /* synthetic */ MessagingSettings copy$default(MessagingSettings messagingSettings, String str, boolean z11, String str2, String str3, String str4, String str5, ColorTheme colorTheme, ColorTheme colorTheme2, boolean z12, boolean z13, boolean z14, String str6, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, Object obj) {
        boolean z22;
        boolean z23;
        String str7 = (i11 & 1) != 0 ? messagingSettings.integrationId : str;
        boolean z24 = (i11 & 2) != 0 ? messagingSettings.enabled : z11;
        String str8 = (i11 & 4) != 0 ? messagingSettings.brand : str2;
        String str9 = (i11 & 8) != 0 ? messagingSettings.title : str3;
        String str10 = (i11 & 16) != 0 ? messagingSettings.description : str4;
        String str11 = (i11 & 32) != 0 ? messagingSettings.logoUrl : str5;
        ColorTheme colorTheme3 = (i11 & 64) != 0 ? messagingSettings.lightTheme : colorTheme;
        ColorTheme colorTheme4 = (i11 & 128) != 0 ? messagingSettings.darkTheme : colorTheme2;
        boolean z25 = (i11 & 256) != 0 ? messagingSettings.canUserCreateMoreConversations : z12;
        boolean z26 = (i11 & 512) != 0 ? messagingSettings.isMultiConversationsEnabled : z13;
        boolean z27 = (i11 & 1024) != 0 ? messagingSettings.hipaaAttachmentFlag : z14;
        String str12 = (i11 & NewHope.SENDB_BYTES) != 0 ? messagingSettings.identifier : str6;
        boolean z28 = (i11 & 4096) != 0 ? messagingSettings.canUserSeeConversationList : z15;
        boolean z29 = (i11 & 8192) != 0 ? messagingSettings.shouldTrackInternalAnalyticEvents : z16;
        String str13 = str7;
        boolean z31 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? messagingSettings.isMultiAttachmentsEnabled : z17;
        boolean z32 = (i11 & 32768) != 0 ? messagingSettings.isEndSessionEnabled : z18;
        boolean z33 = (i11 & 65536) != 0 ? messagingSettings.isReopenConversationDisabled : z19;
        if ((i11 & 131072) != 0) {
            z23 = z33;
            z22 = messagingSettings.isConversationTranscriptEnabled;
        } else {
            z22 = z21;
            z23 = z33;
        }
        return messagingSettings.copy(str13, z24, str8, str9, str10, str11, colorTheme3, colorTheme4, z25, z26, z27, str12, z28, z29, z31, z32, z23, z22);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIntegrationId() {
        return this.integrationId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsMultiConversationsEnabled() {
        return this.isMultiConversationsEnabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHipaaAttachmentFlag() {
        return this.hipaaAttachmentFlag;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShouldTrackInternalAnalyticEvents() {
        return this.shouldTrackInternalAnalyticEvents;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsMultiAttachmentsEnabled() {
        return this.isMultiAttachmentsEnabled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsEndSessionEnabled() {
        return this.isEndSessionEnabled;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsReopenConversationDisabled() {
        return this.isReopenConversationDisabled;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsConversationTranscriptEnabled() {
        return this.isConversationTranscriptEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ColorTheme getLightTheme() {
        return this.lightTheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ColorTheme getDarkTheme() {
        return this.darkTheme;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    @NotNull
    public final MessagingSettings copy(@Nullable String integrationId, boolean enabled, @NotNull String brand, @NotNull String title, @NotNull String description, @NotNull String logoUrl, @NotNull ColorTheme lightTheme, @NotNull ColorTheme darkTheme, boolean canUserCreateMoreConversations, boolean isMultiConversationsEnabled, boolean hipaaAttachmentFlag, @NotNull String identifier, boolean canUserSeeConversationList, boolean shouldTrackInternalAnalyticEvents, boolean isMultiAttachmentsEnabled, boolean isEndSessionEnabled, boolean isReopenConversationDisabled, boolean isConversationTranscriptEnabled) {
        brand.getClass();
        title.getClass();
        description.getClass();
        logoUrl.getClass();
        lightTheme.getClass();
        darkTheme.getClass();
        identifier.getClass();
        return new MessagingSettings(integrationId, enabled, brand, title, description, logoUrl, lightTheme, darkTheme, canUserCreateMoreConversations, isMultiConversationsEnabled, hipaaAttachmentFlag, identifier, canUserSeeConversationList, shouldTrackInternalAnalyticEvents, isMultiAttachmentsEnabled, isEndSessionEnabled, isReopenConversationDisabled, isConversationTranscriptEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagingSettings)) {
            return false;
        }
        MessagingSettings messagingSettings = (MessagingSettings) other;
        return Intrinsics.areEqual(this.integrationId, messagingSettings.integrationId) && this.enabled == messagingSettings.enabled && Intrinsics.areEqual(this.brand, messagingSettings.brand) && Intrinsics.areEqual(this.title, messagingSettings.title) && Intrinsics.areEqual(this.description, messagingSettings.description) && Intrinsics.areEqual(this.logoUrl, messagingSettings.logoUrl) && Intrinsics.areEqual(this.lightTheme, messagingSettings.lightTheme) && Intrinsics.areEqual(this.darkTheme, messagingSettings.darkTheme) && this.canUserCreateMoreConversations == messagingSettings.canUserCreateMoreConversations && this.isMultiConversationsEnabled == messagingSettings.isMultiConversationsEnabled && this.hipaaAttachmentFlag == messagingSettings.hipaaAttachmentFlag && Intrinsics.areEqual(this.identifier, messagingSettings.identifier) && this.canUserSeeConversationList == messagingSettings.canUserSeeConversationList && this.shouldTrackInternalAnalyticEvents == messagingSettings.shouldTrackInternalAnalyticEvents && this.isMultiAttachmentsEnabled == messagingSettings.isMultiAttachmentsEnabled && this.isEndSessionEnabled == messagingSettings.isEndSessionEnabled && this.isReopenConversationDisabled == messagingSettings.isReopenConversationDisabled && this.isConversationTranscriptEnabled == messagingSettings.isConversationTranscriptEnabled;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    public final boolean getCanUserSeeConversationList() {
        return this.canUserSeeConversationList;
    }

    @NotNull
    public final ColorTheme getDarkTheme() {
        return this.darkTheme;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getHipaaAttachmentFlag() {
        return this.hipaaAttachmentFlag;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @NotNull
    public final ColorTheme getLightTheme() {
        return this.lightTheme;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean getShouldTrackInternalAnalyticEvents() {
        return this.shouldTrackInternalAnalyticEvents;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.integrationId;
        return Boolean.hashCode(this.isConversationTranscriptEnabled) + k.e(k.e(k.e(k.e(k.e(l1.b(k.e(k.e(k.e((this.darkTheme.hashCode() + ((this.lightTheme.hashCode() + l1.b(l1.b(l1.b(l1.b(k.e((str == null ? 0 : str.hashCode()) * 31, 31, this.enabled), 31, this.brand), 31, this.title), 31, this.description), 31, this.logoUrl)) * 31)) * 31, 31, this.canUserCreateMoreConversations), 31, this.isMultiConversationsEnabled), 31, this.hipaaAttachmentFlag), 31, this.identifier), 31, this.canUserSeeConversationList), 31, this.shouldTrackInternalAnalyticEvents), 31, this.isMultiAttachmentsEnabled), 31, this.isEndSessionEnabled), 31, this.isReopenConversationDisabled);
    }

    public final boolean isConversationTranscriptEnabled() {
        return this.isConversationTranscriptEnabled;
    }

    public final boolean isEndSessionEnabled() {
        return this.isEndSessionEnabled;
    }

    public final boolean isMultiAttachmentsEnabled() {
        return this.isMultiAttachmentsEnabled;
    }

    public final boolean isMultiConversationsEnabled() {
        return this.isMultiConversationsEnabled;
    }

    public final boolean isReopenConversationDisabled() {
        return this.isReopenConversationDisabled;
    }

    @NotNull
    public String toString() {
        String str = this.integrationId;
        boolean z11 = this.enabled;
        String str2 = this.brand;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.logoUrl;
        ColorTheme colorTheme = this.lightTheme;
        ColorTheme colorTheme2 = this.darkTheme;
        boolean z12 = this.canUserCreateMoreConversations;
        boolean z13 = this.isMultiConversationsEnabled;
        boolean z14 = this.hipaaAttachmentFlag;
        String str6 = this.identifier;
        boolean z15 = this.canUserSeeConversationList;
        boolean z16 = this.shouldTrackInternalAnalyticEvents;
        boolean z17 = this.isMultiAttachmentsEnabled;
        boolean z18 = this.isEndSessionEnabled;
        boolean z19 = this.isReopenConversationDisabled;
        boolean z21 = this.isConversationTranscriptEnabled;
        StringBuilder sb2 = new StringBuilder("MessagingSettings(integrationId=");
        sb2.append(str);
        sb2.append(", enabled=");
        sb2.append(z11);
        sb2.append(", brand=");
        s.A(sb2, str2, ", title=", str3, ", description=");
        s.A(sb2, str4, ", logoUrl=", str5, ", lightTheme=");
        sb2.append(colorTheme);
        sb2.append(", darkTheme=");
        sb2.append(colorTheme2);
        sb2.append(", canUserCreateMoreConversations=");
        i.C(sb2, z12, ", isMultiConversationsEnabled=", z13, ", hipaaAttachmentFlag=");
        sb2.append(z14);
        sb2.append(", identifier=");
        sb2.append(str6);
        sb2.append(", canUserSeeConversationList=");
        i.C(sb2, z15, ", shouldTrackInternalAnalyticEvents=", z16, ", isMultiAttachmentsEnabled=");
        i.C(sb2, z17, ", isEndSessionEnabled=", z18, ", isReopenConversationDisabled=");
        sb2.append(z19);
        sb2.append(", isConversationTranscriptEnabled=");
        sb2.append(z21);
        sb2.append(")");
        return sb2.toString();
    }

    public MessagingSettings(@Nullable String str, boolean z11, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ColorTheme colorTheme, @NotNull ColorTheme colorTheme2, boolean z12, boolean z13, boolean z14, @NotNull String str6, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        colorTheme.getClass();
        colorTheme2.getClass();
        str6.getClass();
        this.integrationId = str;
        this.enabled = z11;
        this.brand = str2;
        this.title = str3;
        this.description = str4;
        this.logoUrl = str5;
        this.lightTheme = colorTheme;
        this.darkTheme = colorTheme2;
        this.canUserCreateMoreConversations = z12;
        this.isMultiConversationsEnabled = z13;
        this.hipaaAttachmentFlag = z14;
        this.identifier = str6;
        this.canUserSeeConversationList = z15;
        this.shouldTrackInternalAnalyticEvents = z16;
        this.isMultiAttachmentsEnabled = z17;
        this.isEndSessionEnabled = z18;
        this.isReopenConversationDisabled = z19;
        this.isConversationTranscriptEnabled = z21;
    }
}
