package com.app.tgtg.model.remote.profile.request;

import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureStateSerializer;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/app/tgtg/model/remote/profile/request/ProfileStateTransitionRequest;", "", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "featureType", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "featureState", "<init>", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/request/ProfileStateTransitionRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "getFeatureType", "()Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "setFeatureType", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;)V", "getFeatureType$annotations", "()V", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "getFeatureState", "()Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "setFeatureState", "(Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;)V", "getFeatureState$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileStateTransitionRequest {

    @Nullable
    private ProfileFeatureState featureState;

    @Nullable
    private ProfileFeatureType featureType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ProfileStateTransitionRequest(int i11, ProfileFeatureType profileFeatureType, ProfileFeatureState profileFeatureState, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.featureType = null;
        } else {
            this.featureType = profileFeatureType;
        }
        if ((i11 & 2) == 0) {
            this.featureState = null;
        } else {
            this.featureState = profileFeatureState;
        }
    }

    public static final /* synthetic */ void write$Self$app(ProfileStateTransitionRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.featureType != null) {
            output.r(serialDesc, 0, ProfileFeatureTypeSerializer.INSTANCE, self.featureType);
        }
        if (!output.C(serialDesc) && self.featureState == null) {
            return;
        }
        output.r(serialDesc, 1, ProfileFeatureStateSerializer.INSTANCE, self.featureState);
    }

    @Nullable
    public final ProfileFeatureState getFeatureState() {
        return this.featureState;
    }

    @Nullable
    public final ProfileFeatureType getFeatureType() {
        return this.featureType;
    }

    public final void setFeatureState(@Nullable ProfileFeatureState profileFeatureState) {
        this.featureState = profileFeatureState;
    }

    public final void setFeatureType(@Nullable ProfileFeatureType profileFeatureType) {
        this.featureType = profileFeatureType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/request/ProfileStateTransitionRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/request/ProfileStateTransitionRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileStateTransitionRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("state")
    public static /* synthetic */ void getFeatureState$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getFeatureType$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileStateTransitionRequest() {
        this((ProfileFeatureType) null, (ProfileFeatureState) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public ProfileStateTransitionRequest(@Nullable ProfileFeatureType profileFeatureType, @Nullable ProfileFeatureState profileFeatureState) {
        this.featureType = profileFeatureType;
        this.featureState = profileFeatureState;
    }

    public /* synthetic */ ProfileStateTransitionRequest(ProfileFeatureType profileFeatureType, ProfileFeatureState profileFeatureState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : profileFeatureType, (i11 & 2) != 0 ? null : profileFeatureState);
    }
}
