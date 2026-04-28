package com.app.tgtg.model.remote.user.requests;

import a80.a;
import com.app.tgtg.R;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = DietaryPreferencesSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;", "", "res", "", "<init>", "(Ljava/lang/String;II)V", "getRes", "()I", "EVERYTHING", "VEGETARIAN", "VEGAN", "NOT_SPECIFIED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DietaryPreferences {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DietaryPreferences[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int res;
    public static final DietaryPreferences EVERYTHING = new DietaryPreferences("EVERYTHING", 0, R.string.profile_menu_dietary_everything);
    public static final DietaryPreferences VEGETARIAN = new DietaryPreferences("VEGETARIAN", 1, R.string.profile_menu_dietary_veggie);
    public static final DietaryPreferences VEGAN = new DietaryPreferences("VEGAN", 2, R.string.profile_menu_dietary_vegan);
    public static final DietaryPreferences NOT_SPECIFIED = new DietaryPreferences("NOT_SPECIFIED", 3, R.string.profile_menu_dietary_not_specified);
    public static final DietaryPreferences UNKNOWN = new DietaryPreferences("UNKNOWN", 4, 0);

    private static final /* synthetic */ DietaryPreferences[] $values() {
        return new DietaryPreferences[]{EVERYTHING, VEGETARIAN, VEGAN, NOT_SPECIFIED, UNKNOWN};
    }

    static {
        DietaryPreferences[] dietaryPreferencesArr$values = $values();
        $VALUES = dietaryPreferencesArr$values;
        $ENTRIES = n.w(dietaryPreferencesArr$values);
        INSTANCE = new Companion(null);
    }

    private DietaryPreferences(String str, int i11, int i12) {
        this.res = i12;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static DietaryPreferences valueOf(String str) {
        return (DietaryPreferences) Enum.valueOf(DietaryPreferences.class, str);
    }

    public static DietaryPreferences[] values() {
        return (DietaryPreferences[]) $VALUES.clone();
    }

    public final int getRes() {
        return this.res;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/DietaryPreferences;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DietaryPreferencesSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
