package com.app.tgtg.model.remote.user.requests;

import a80.a;
import com.app.tgtg.R;
import i90.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/UserGender;", "", "res", "", "<init>", "(Ljava/lang/String;II)V", "getRes", "()I", "FEMALE", "MALE", "NON_BINARY", "OTHER", "PREFER_NOT_TO_SAY", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h(with = UserGenderSerializer.class)
@SourceDebugExtension({"SMAP\nUserGender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGender.kt\ncom/app/tgtg/model/remote/user/requests/UserGender\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n777#2:38\n873#2,2:39\n*S KotlinDebug\n*F\n+ 1 UserGender.kt\ncom/app/tgtg/model/remote/user/requests/UserGender\n*L\n19#1:38\n19#1:39,2\n*E\n"})
public final class UserGender {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserGender[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UserGender FEMALE = new UserGender("FEMALE", 0, R.string.profile_menu_gender_female);
    public static final UserGender MALE = new UserGender("MALE", 1, R.string.profile_menu_gender_male);
    public static final UserGender NON_BINARY = new UserGender("NON_BINARY", 2, R.string.profile_menu_gender_non_binary);
    public static final UserGender OTHER = new UserGender("OTHER", 3, R.string.profile_menu_gender_other);
    public static final UserGender PREFER_NOT_TO_SAY = new UserGender("PREFER_NOT_TO_SAY", 4, R.string.profile_menu_gender_prefer_not_to_say);
    public static final UserGender UNKNOWN = new UserGender("UNKNOWN", 5, 0);

    @NotNull
    private static final List<UserGender> allGenders;

    @NotNull
    private static final List<UserGender> japaneseGenders;
    private final int res;

    private static final /* synthetic */ UserGender[] $values() {
        return new UserGender[]{FEMALE, MALE, NON_BINARY, OTHER, PREFER_NOT_TO_SAY, UNKNOWN};
    }

    static {
        UserGender[] userGenderArr$values = $values();
        $VALUES = userGenderArr$values;
        $ENTRIES = n.w(userGenderArr$values);
        INSTANCE = new Companion(null);
        a entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((UserGender) obj) != UNKNOWN) {
                arrayList.add(obj);
            }
        }
        allGenders = arrayList;
        japaneseGenders = d0.h(MALE, FEMALE, PREFER_NOT_TO_SAY);
    }

    private UserGender(String str, int i11, int i12) {
        this.res = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static UserGender valueOf(String str) {
        return (UserGender) Enum.valueOf(UserGender.class, str);
    }

    public static UserGender[] values() {
        return (UserGender[]) $VALUES.clone();
    }

    public final int getRes() {
        return this.res;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/UserGender$Companion;", "", "<init>", "()V", "allGenders", "", "Lcom/app/tgtg/model/remote/user/requests/UserGender;", "japaneseGenders", "filterByCountry", "userCountry", "", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<UserGender> filterByCountry(@Nullable String userCountry) {
            String upperCase;
            if (userCountry != null) {
                upperCase = userCountry.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            return Intrinsics.areEqual(upperCase, "JP") ? UserGender.japaneseGenders : UserGender.allGenders;
        }

        @NotNull
        public final KSerializer serializer() {
            return UserGenderSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
