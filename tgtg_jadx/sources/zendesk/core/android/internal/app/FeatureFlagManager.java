package zendesk.core.android.internal.app;

import b3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lzendesk/core/android/internal/app/FeatureFlagManager;", "", "isConversationExtensionBackButtonEnabled", "", "enableConversationFieldValidator", "enableEndConversationFeature", "enableDownloadingTranscriptFeature", "<init>", "(ZZZZ)V", "()Z", "getEnableConversationFieldValidator", "getEnableEndConversationFeature", "getEnableDownloadingTranscriptFeature", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FeatureFlagManager {
    private final boolean enableConversationFieldValidator;
    private final boolean enableDownloadingTranscriptFeature;
    private final boolean enableEndConversationFeature;
    private final boolean isConversationExtensionBackButtonEnabled;

    public /* synthetic */ FeatureFlagManager(boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14);
    }

    public static /* synthetic */ FeatureFlagManager copy$default(FeatureFlagManager featureFlagManager, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = featureFlagManager.isConversationExtensionBackButtonEnabled;
        }
        if ((i11 & 2) != 0) {
            z12 = featureFlagManager.enableConversationFieldValidator;
        }
        if ((i11 & 4) != 0) {
            z13 = featureFlagManager.enableEndConversationFeature;
        }
        if ((i11 & 8) != 0) {
            z14 = featureFlagManager.enableDownloadingTranscriptFeature;
        }
        return featureFlagManager.copy(z11, z12, z13, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsConversationExtensionBackButtonEnabled() {
        return this.isConversationExtensionBackButtonEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableConversationFieldValidator() {
        return this.enableConversationFieldValidator;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableEndConversationFeature() {
        return this.enableEndConversationFeature;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnableDownloadingTranscriptFeature() {
        return this.enableDownloadingTranscriptFeature;
    }

    @NotNull
    public final FeatureFlagManager copy(boolean isConversationExtensionBackButtonEnabled, boolean enableConversationFieldValidator, boolean enableEndConversationFeature, boolean enableDownloadingTranscriptFeature) {
        return new FeatureFlagManager(isConversationExtensionBackButtonEnabled, enableConversationFieldValidator, enableEndConversationFeature, enableDownloadingTranscriptFeature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlagManager)) {
            return false;
        }
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) other;
        return this.isConversationExtensionBackButtonEnabled == featureFlagManager.isConversationExtensionBackButtonEnabled && this.enableConversationFieldValidator == featureFlagManager.enableConversationFieldValidator && this.enableEndConversationFeature == featureFlagManager.enableEndConversationFeature && this.enableDownloadingTranscriptFeature == featureFlagManager.enableDownloadingTranscriptFeature;
    }

    public final boolean getEnableConversationFieldValidator() {
        return this.enableConversationFieldValidator;
    }

    public final boolean getEnableDownloadingTranscriptFeature() {
        return this.enableDownloadingTranscriptFeature;
    }

    public final boolean getEnableEndConversationFeature() {
        return this.enableEndConversationFeature;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableDownloadingTranscriptFeature) + k.e(k.e(Boolean.hashCode(this.isConversationExtensionBackButtonEnabled) * 31, 31, this.enableConversationFieldValidator), 31, this.enableEndConversationFeature);
    }

    public final boolean isConversationExtensionBackButtonEnabled() {
        return this.isConversationExtensionBackButtonEnabled;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isConversationExtensionBackButtonEnabled;
        boolean z12 = this.enableConversationFieldValidator;
        boolean z13 = this.enableEndConversationFeature;
        boolean z14 = this.enableDownloadingTranscriptFeature;
        StringBuilder sbP = i.p("FeatureFlagManager(isConversationExtensionBackButtonEnabled=", z11, ", enableConversationFieldValidator=", z12, ", enableEndConversationFeature=");
        sbP.append(z13);
        sbP.append(", enableDownloadingTranscriptFeature=");
        sbP.append(z14);
        sbP.append(")");
        return sbP.toString();
    }

    public FeatureFlagManager(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.isConversationExtensionBackButtonEnabled = z11;
        this.enableConversationFieldValidator = z12;
        this.enableEndConversationFeature = z13;
        this.enableDownloadingTranscriptFeature = z14;
    }

    public FeatureFlagManager() {
        this(false, false, false, false, 15, null);
    }
}
