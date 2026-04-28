package com.app.tgtg.model.local;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/local/SnackBarType;", "", "<init>", "(Ljava/lang/String;I)V", "ADDED_TO_FAVORITE", "ITEM_VIEW_ADDED_TO_FAVORITE", "FAVORITE_REMINDER", "FAVORITE_REMINDER_OFF", "FAVORITE_REMINDER_UPDATED", "FAVORITE_CUSTOM_REMINDER_SET", "SOLD_OUT_ONE_TIME_REMINDER", "SOLD_OUT_RECURRING_REMINDER", "ADD_TO_FAVORITES_FROM_FAVORITES_CAROUSEL", "REMOVED_FROM_FAVORITES_CAROUSEL", "SOMETHING_WENT_WRONG", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SnackBarType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SnackBarType[] $VALUES;
    public static final SnackBarType ADDED_TO_FAVORITE = new SnackBarType("ADDED_TO_FAVORITE", 0);
    public static final SnackBarType ITEM_VIEW_ADDED_TO_FAVORITE = new SnackBarType("ITEM_VIEW_ADDED_TO_FAVORITE", 1);
    public static final SnackBarType FAVORITE_REMINDER = new SnackBarType("FAVORITE_REMINDER", 2);
    public static final SnackBarType FAVORITE_REMINDER_OFF = new SnackBarType("FAVORITE_REMINDER_OFF", 3);
    public static final SnackBarType FAVORITE_REMINDER_UPDATED = new SnackBarType("FAVORITE_REMINDER_UPDATED", 4);
    public static final SnackBarType FAVORITE_CUSTOM_REMINDER_SET = new SnackBarType("FAVORITE_CUSTOM_REMINDER_SET", 5);
    public static final SnackBarType SOLD_OUT_ONE_TIME_REMINDER = new SnackBarType("SOLD_OUT_ONE_TIME_REMINDER", 6);
    public static final SnackBarType SOLD_OUT_RECURRING_REMINDER = new SnackBarType("SOLD_OUT_RECURRING_REMINDER", 7);
    public static final SnackBarType ADD_TO_FAVORITES_FROM_FAVORITES_CAROUSEL = new SnackBarType("ADD_TO_FAVORITES_FROM_FAVORITES_CAROUSEL", 8);
    public static final SnackBarType REMOVED_FROM_FAVORITES_CAROUSEL = new SnackBarType("REMOVED_FROM_FAVORITES_CAROUSEL", 9);
    public static final SnackBarType SOMETHING_WENT_WRONG = new SnackBarType("SOMETHING_WENT_WRONG", 10);

    private static final /* synthetic */ SnackBarType[] $values() {
        return new SnackBarType[]{ADDED_TO_FAVORITE, ITEM_VIEW_ADDED_TO_FAVORITE, FAVORITE_REMINDER, FAVORITE_REMINDER_OFF, FAVORITE_REMINDER_UPDATED, FAVORITE_CUSTOM_REMINDER_SET, SOLD_OUT_ONE_TIME_REMINDER, SOLD_OUT_RECURRING_REMINDER, ADD_TO_FAVORITES_FROM_FAVORITES_CAROUSEL, REMOVED_FROM_FAVORITES_CAROUSEL, SOMETHING_WENT_WRONG};
    }

    static {
        SnackBarType[] snackBarTypeArr$values = $values();
        $VALUES = snackBarTypeArr$values;
        $ENTRIES = n.w(snackBarTypeArr$values);
    }

    private SnackBarType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static SnackBarType valueOf(String str) {
        return (SnackBarType) Enum.valueOf(SnackBarType.class, str);
    }

    public static SnackBarType[] values() {
        return (SnackBarType[]) $VALUES.clone();
    }
}
