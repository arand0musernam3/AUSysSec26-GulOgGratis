package zendesk.guidekit.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lzendesk/guidekit/android/model/GuideKitSettings;", "", "baseUrl", "", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBaseUrl$zendesk_guidekit_guidekit_android", "()Ljava/lang/String;", "getChannelId$zendesk_guidekit_guidekit_android", "component1", "component1$zendesk_guidekit_guidekit_android", "component2", "component2$zendesk_guidekit_guidekit_android", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuideKitSettings {

    @NotNull
    private final String baseUrl;

    @NotNull
    private final String channelId;

    public GuideKitSettings(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.baseUrl = str;
        this.channelId = str2;
    }

    public static /* synthetic */ GuideKitSettings copy$default(GuideKitSettings guideKitSettings, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = guideKitSettings.baseUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = guideKitSettings.channelId;
        }
        return guideKitSettings.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_guidekit_guidekit_android, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_guidekit_guidekit_android, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final GuideKitSettings copy(@NotNull String baseUrl, @NotNull String channelId) {
        baseUrl.getClass();
        channelId.getClass();
        return new GuideKitSettings(baseUrl, channelId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideKitSettings)) {
            return false;
        }
        GuideKitSettings guideKitSettings = (GuideKitSettings) other;
        return Intrinsics.areEqual(this.baseUrl, guideKitSettings.baseUrl) && Intrinsics.areEqual(this.channelId, guideKitSettings.channelId);
    }

    @NotNull
    public final String getBaseUrl$zendesk_guidekit_guidekit_android() {
        return this.baseUrl;
    }

    @NotNull
    public final String getChannelId$zendesk_guidekit_guidekit_android() {
        return this.channelId;
    }

    public int hashCode() {
        return this.channelId.hashCode() + (this.baseUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("GuideKitSettings(baseUrl=", this.baseUrl, ", channelId=", this.channelId, ")");
    }
}
