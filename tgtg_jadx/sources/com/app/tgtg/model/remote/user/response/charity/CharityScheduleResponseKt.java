package com.app.tgtg.model.remote.user.response.charity;

import com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"available", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule$Available;", "Lcom/app/tgtg/model/remote/user/response/charity/CharityDaySchedule;", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class CharityScheduleResponseKt {
    @Nullable
    public static final CharityDaySchedule.Available available(@NotNull CharityDaySchedule charityDaySchedule) {
        charityDaySchedule.getClass();
        if (charityDaySchedule instanceof CharityDaySchedule.Available) {
            return (CharityDaySchedule.Available) charityDaySchedule;
        }
        return null;
    }
}
