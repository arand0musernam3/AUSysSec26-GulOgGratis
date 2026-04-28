package com.app.tgtg.model.local;

import com.app.tgtg.R;
import e40.a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"getSnackBarInfo", "Lcom/app/tgtg/model/local/SnackBarInfo;", "snackBarType", "Lcom/app/tgtg/model/local/SnackBarType;", "snackBarTypeName", "", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class SnackBarTypeKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackBarType.values().length];
            try {
                iArr[SnackBarType.ADDED_TO_FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackBarType.ITEM_VIEW_ADDED_TO_FAVORITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackBarType.FAVORITE_REMINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SnackBarType.FAVORITE_REMINDER_OFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SnackBarType.FAVORITE_REMINDER_UPDATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SnackBarType.FAVORITE_CUSTOM_REMINDER_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SnackBarType.SOLD_OUT_ONE_TIME_REMINDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SnackBarType.SOLD_OUT_RECURRING_REMINDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SnackBarType.ADD_TO_FAVORITES_FROM_FAVORITES_CAROUSEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SnackBarType.REMOVED_FROM_FAVORITES_CAROUSEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SnackBarType.SOMETHING_WENT_WRONG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final SnackBarInfo getSnackBarInfo(SnackBarType snackBarType) {
        Integer numValueOf = Integer.valueOf(R.drawable.system_icon_heart_active_neutral_10);
        Integer numValueOf2 = Integer.valueOf(R.drawable.ic_custom_reminder_bell_on);
        switch (WhenMappings.$EnumSwitchMapping$0[snackBarType.ordinal()]) {
            case 1:
                return new SnackBarInfo(numValueOf, R.string.added_to_favorites_snack_message, null, 0L, 0L, 28, null);
            case 2:
                return new SnackBarInfo(numValueOf, R.string.item_view_added_to_favorites_toast, null, 0L, 0L, 28, null);
            case 3:
                return new SnackBarInfo(numValueOf2, R.string.favorite_notification_message_bar_body, null, 0L, 0L, 28, null);
            case 4:
                return new SnackBarInfo(Integer.valueOf(R.drawable.ic_custom_reminder_bell_off), R.string.custom_favorite_reminder_turned_off_message, Integer.valueOf(R.string.custom_favorite_reminder_turned_off_message_voice_over), 0L, 0L, 24, null);
            case 5:
                return new SnackBarInfo(numValueOf2, R.string.custom_favorite_reminder_update_message, Integer.valueOf(R.string.custom_favorite_reminder_update_message_voice_over), 0L, 0L, 24, null);
            case 6:
                return new SnackBarInfo(numValueOf2, R.string.custom_favorite_reminder_set_message, Integer.valueOf(R.string.custom_favorite_reminder_set_message_voice_over), 0L, 0L, 24, null);
            case 7:
                return new SnackBarInfo(null, R.string.custom_favorite_reminder_sold_out_item_one_time_message, Integer.valueOf(R.string.custom_favorite_reminder_sold_out_item_one_time_message_voice_over), 0L, 0L, 25, null);
            case 8:
                return new SnackBarInfo(null, R.string.custom_favorite_reminder_sold_out_item_recurring_message, Integer.valueOf(R.string.custom_favorite_reminder_sold_out_item_recurring_message_voice_over), 0L, 0L, 25, null);
            case 9:
                return new SnackBarInfo(null, R.string.favorites_recent_orders_snack_bar_add, Integer.valueOf(R.string.screen_reader_favorites_recent_orders_snack_bar_add), 0L, 0L, 25, null);
            case 10:
                return new SnackBarInfo(null, R.string.favorites_recent_orders_snack_bar_delete, Integer.valueOf(R.string.screen_reader_favorites_recent_orders_snack_bar_delete), 0L, 0L, 25, null);
            case 11:
                return new SnackBarInfo(null, R.string.generic_err_undefined_error, null, 0L, 0L, 29, null);
            default:
                a.f();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.app.tgtg.model.local.SnackBarInfo getSnackBarInfo(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r2.getClass()
            r0 = 0
            boolean r1 = kotlin.text.StringsKt.H(r2)     // Catch: java.lang.IllegalArgumentException -> L10
            if (r1 == 0) goto Lb
            goto L10
        Lb:
            com.app.tgtg.model.local.SnackBarType r2 = com.app.tgtg.model.local.SnackBarType.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L10
            goto L11
        L10:
            r2 = r0
        L11:
            if (r2 == 0) goto L17
            com.app.tgtg.model.local.SnackBarInfo r0 = getSnackBarInfo(r2)
        L17:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.local.SnackBarTypeKt.getSnackBarInfo(java.lang.String):com.app.tgtg.model.local.SnackBarInfo");
    }
}
