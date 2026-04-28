package zendesk.android;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lzendesk/android/ZendeskUser;", "", "id", "", "externalId", "authenticationType", "Lzendesk/android/ZendeskAuthenticationType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/android/ZendeskAuthenticationType;)V", "getId", "()Ljava/lang/String;", "getExternalId", "getAuthenticationType", "()Lzendesk/android/ZendeskAuthenticationType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ZendeskUser {

    @NotNull
    private final ZendeskAuthenticationType authenticationType;

    @Nullable
    private final String externalId;

    @NotNull
    private final String id;

    @InternalZendeskApi
    public ZendeskUser(@NotNull String str, @Nullable String str2, @NotNull ZendeskAuthenticationType zendeskAuthenticationType) {
        str.getClass();
        zendeskAuthenticationType.getClass();
        this.id = str;
        this.externalId = str2;
        this.authenticationType = zendeskAuthenticationType;
    }

    public static /* synthetic */ ZendeskUser copy$default(ZendeskUser zendeskUser, String str, String str2, ZendeskAuthenticationType zendeskAuthenticationType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zendeskUser.id;
        }
        if ((i11 & 2) != 0) {
            str2 = zendeskUser.externalId;
        }
        if ((i11 & 4) != 0) {
            zendeskAuthenticationType = zendeskUser.authenticationType;
        }
        return zendeskUser.copy(str, str2, zendeskAuthenticationType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ZendeskAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    @NotNull
    public final ZendeskUser copy(@NotNull String id2, @Nullable String externalId, @NotNull ZendeskAuthenticationType authenticationType) {
        id2.getClass();
        authenticationType.getClass();
        return new ZendeskUser(id2, externalId, authenticationType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZendeskUser)) {
            return false;
        }
        ZendeskUser zendeskUser = (ZendeskUser) other;
        return Intrinsics.areEqual(this.id, zendeskUser.id) && Intrinsics.areEqual(this.externalId, zendeskUser.externalId) && this.authenticationType == zendeskUser.authenticationType;
    }

    @NotNull
    public final ZendeskAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    @Nullable
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.externalId;
        return this.authenticationType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.externalId;
        ZendeskAuthenticationType zendeskAuthenticationType = this.authenticationType;
        StringBuilder sbT = f.t("ZendeskUser(id=", str, ", externalId=", str2, ", authenticationType=");
        sbT.append(zendeskAuthenticationType);
        sbT.append(")");
        return sbT.toString();
    }
}
