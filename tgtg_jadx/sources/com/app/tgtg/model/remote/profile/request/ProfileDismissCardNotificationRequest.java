package com.app.tgtg.model.remote.profile.request;

import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureTypeSerializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0005¨\u0006\u001c"}, d2 = {"Lcom/app/tgtg/model/remote/profile/request/ProfileDismissCardNotificationRequest;", "", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "featureType", "<init>", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/request/ProfileDismissCardNotificationRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "getFeatureType", "()Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "setFeatureType", "getFeatureType$annotations", "()V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileDismissCardNotificationRequest {

    @Nullable
    private ProfileFeatureType featureType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ProfileDismissCardNotificationRequest(int i11, ProfileFeatureType profileFeatureType, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.featureType = null;
        } else {
            this.featureType = profileFeatureType;
        }
    }

    public static final /* synthetic */ void write$Self$app(ProfileDismissCardNotificationRequest self, b output, SerialDescriptor serialDesc) {
        if (!output.C(serialDesc) && self.featureType == null) {
            return;
        }
        output.r(serialDesc, 0, ProfileFeatureTypeSerializer.INSTANCE, self.featureType);
    }

    @Nullable
    public final ProfileFeatureType getFeatureType() {
        return this.featureType;
    }

    public final void setFeatureType(@Nullable ProfileFeatureType profileFeatureType) {
        this.featureType = profileFeatureType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/request/ProfileDismissCardNotificationRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/request/ProfileDismissCardNotificationRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileDismissCardNotificationRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileDismissCardNotificationRequest() {
        this((ProfileFeatureType) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProfileDismissCardNotificationRequest(@Nullable ProfileFeatureType profileFeatureType) {
        this.featureType = profileFeatureType;
    }

    @g("type")
    public static /* synthetic */ void getFeatureType$annotations() {
    }

    public /* synthetic */ ProfileDismissCardNotificationRequest(ProfileFeatureType profileFeatureType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : profileFeatureType);
    }
}
