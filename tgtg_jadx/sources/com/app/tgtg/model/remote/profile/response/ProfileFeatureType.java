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
@h(with = ProfileFeatureTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "", "<init>", "(Ljava/lang/String;I)V", "LOYALTY_CARD", "C2C_REFERRAL", "BADGES", "ORDERS", "IMPACT_TRACKER", "SPECIAL_REWARDS", "ALWAYS_ON", "C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED", "STORE_SIGNUP", "RECIPE", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileFeatureType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProfileFeatureType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ProfileFeatureType LOYALTY_CARD = new ProfileFeatureType("LOYALTY_CARD", 0);
    public static final ProfileFeatureType C2C_REFERRAL = new ProfileFeatureType("C2C_REFERRAL", 1);
    public static final ProfileFeatureType BADGES = new ProfileFeatureType("BADGES", 2);
    public static final ProfileFeatureType ORDERS = new ProfileFeatureType("ORDERS", 3);
    public static final ProfileFeatureType IMPACT_TRACKER = new ProfileFeatureType("IMPACT_TRACKER", 4);
    public static final ProfileFeatureType SPECIAL_REWARDS = new ProfileFeatureType("SPECIAL_REWARDS", 5);
    public static final ProfileFeatureType ALWAYS_ON = new ProfileFeatureType("ALWAYS_ON", 6);
    public static final ProfileFeatureType C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED = new ProfileFeatureType("C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED", 7);
    public static final ProfileFeatureType STORE_SIGNUP = new ProfileFeatureType("STORE_SIGNUP", 8);
    public static final ProfileFeatureType RECIPE = new ProfileFeatureType("RECIPE", 9);
    public static final ProfileFeatureType UNKNOWN = new ProfileFeatureType("UNKNOWN", 10);

    private static final /* synthetic */ ProfileFeatureType[] $values() {
        return new ProfileFeatureType[]{LOYALTY_CARD, C2C_REFERRAL, BADGES, ORDERS, IMPACT_TRACKER, SPECIAL_REWARDS, ALWAYS_ON, C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED, STORE_SIGNUP, RECIPE, UNKNOWN};
    }

    static {
        ProfileFeatureType[] profileFeatureTypeArr$values = $values();
        $VALUES = profileFeatureTypeArr$values;
        $ENTRIES = n.w(profileFeatureTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ProfileFeatureType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ProfileFeatureType valueOf(String str) {
        return (ProfileFeatureType) Enum.valueOf(ProfileFeatureType.class, str);
    }

    public static ProfileFeatureType[] values() {
        return (ProfileFeatureType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType$Companion;", "", "<init>", "()V", "findByKey", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeatureType;", "key", "", "default", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nProfileFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileFeature.kt\ncom/app/tgtg/model/remote/profile/response/ProfileFeatureType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ProfileFeatureType findByKey$default(Companion companion, String str, ProfileFeatureType profileFeatureType, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                profileFeatureType = ProfileFeatureType.UNKNOWN;
            }
            return companion.findByKey(str, profileFeatureType);
        }

        @NotNull
        public final ProfileFeatureType findByKey(@NotNull String key, @NotNull ProfileFeatureType profileFeatureType) {
            Object next;
            key.getClass();
            profileFeatureType.getClass();
            Iterator<E> it = ProfileFeatureType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (y.k(((ProfileFeatureType) next).name(), key, true)) {
                    break;
                }
            }
            ProfileFeatureType profileFeatureType2 = (ProfileFeatureType) next;
            return profileFeatureType2 == null ? profileFeatureType : profileFeatureType2;
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileFeatureTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
