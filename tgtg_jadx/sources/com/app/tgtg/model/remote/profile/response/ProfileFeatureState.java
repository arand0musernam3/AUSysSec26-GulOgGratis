package com.app.tgtg.model.remote.profile.response;

import a80.a;
import i90.h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = ProfileFeatureStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "ACTIVE", "ENDED_WITH_REFERRALS", "ENDED_NO_REFERRALS", "COMPLETED", "CLOSE_TO_EXPIRE", "EXPIRED", "SINGLE_CLAIMED_REWARD", "MULTIPLE_CLAIMED_REWARDS", "SINGLE_REWARD_CLOSE_TO_EXPIRE", "COMPLETED_CONFIRMED", "END", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileFeatureState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProfileFeatureState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ProfileFeatureState INITIAL = new ProfileFeatureState("INITIAL", 0);
    public static final ProfileFeatureState ACTIVE = new ProfileFeatureState("ACTIVE", 1);
    public static final ProfileFeatureState ENDED_WITH_REFERRALS = new ProfileFeatureState("ENDED_WITH_REFERRALS", 2);
    public static final ProfileFeatureState ENDED_NO_REFERRALS = new ProfileFeatureState("ENDED_NO_REFERRALS", 3);
    public static final ProfileFeatureState COMPLETED = new ProfileFeatureState("COMPLETED", 4);
    public static final ProfileFeatureState CLOSE_TO_EXPIRE = new ProfileFeatureState("CLOSE_TO_EXPIRE", 5);
    public static final ProfileFeatureState EXPIRED = new ProfileFeatureState("EXPIRED", 6);
    public static final ProfileFeatureState SINGLE_CLAIMED_REWARD = new ProfileFeatureState("SINGLE_CLAIMED_REWARD", 7);
    public static final ProfileFeatureState MULTIPLE_CLAIMED_REWARDS = new ProfileFeatureState("MULTIPLE_CLAIMED_REWARDS", 8);
    public static final ProfileFeatureState SINGLE_REWARD_CLOSE_TO_EXPIRE = new ProfileFeatureState("SINGLE_REWARD_CLOSE_TO_EXPIRE", 9);
    public static final ProfileFeatureState COMPLETED_CONFIRMED = new ProfileFeatureState("COMPLETED_CONFIRMED", 10);
    public static final ProfileFeatureState END = new ProfileFeatureState("END", 11);
    public static final ProfileFeatureState UNKNOWN = new ProfileFeatureState("UNKNOWN", 12);

    private static final /* synthetic */ ProfileFeatureState[] $values() {
        return new ProfileFeatureState[]{INITIAL, ACTIVE, ENDED_WITH_REFERRALS, ENDED_NO_REFERRALS, COMPLETED, CLOSE_TO_EXPIRE, EXPIRED, SINGLE_CLAIMED_REWARD, MULTIPLE_CLAIMED_REWARDS, SINGLE_REWARD_CLOSE_TO_EXPIRE, COMPLETED_CONFIRMED, END, UNKNOWN};
    }

    static {
        ProfileFeatureState[] profileFeatureStateArr$values = $values();
        $VALUES = profileFeatureStateArr$values;
        $ENTRIES = n.w(profileFeatureStateArr$values);
        INSTANCE = new Companion(null);
    }

    private ProfileFeatureState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ProfileFeatureState valueOf(String str) {
        return (ProfileFeatureState) Enum.valueOf(ProfileFeatureState.class, str);
    }

    public static ProfileFeatureState[] values() {
        return (ProfileFeatureState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState$Companion;", "", "<init>", "()V", "findByKey", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureState;", "key", "", "default", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nProfileFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileFeature.kt\ncom/app/tgtg/model/remote/profile/response/ProfileFeatureState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ProfileFeatureState findByKey$default(Companion companion, String str, ProfileFeatureState profileFeatureState, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                profileFeatureState = ProfileFeatureState.UNKNOWN;
            }
            return companion.findByKey(str, profileFeatureState);
        }

        @NotNull
        public final ProfileFeatureState findByKey(@NotNull String key, @NotNull ProfileFeatureState profileFeatureState) {
            Object next;
            key.getClass();
            profileFeatureState.getClass();
            Iterator<E> it = ProfileFeatureState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (y.k(((ProfileFeatureState) next).name(), key, true)) {
                    break;
                }
            }
            ProfileFeatureState profileFeatureState2 = (ProfileFeatureState) next;
            return profileFeatureState2 == null ? profileFeatureState : profileFeatureState2;
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileFeatureStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
