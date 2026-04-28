package com.app.tgtg.model.remote.mapService.request;

import com.app.tgtg.model.PickupIntervalDateObject;
import com.app.tgtg.model.local.CollectionDayModel;
import com.app.tgtg.model.local.SearchFilter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\"\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a&\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"getPickupIntervals", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/PickupIntervalDateObject;", "Lkotlin/collections/ArrayList;", "filters", "Lcom/app/tgtg/model/local/SearchFilter;", "getCollectionTimePickupIntervals", "startHour", "", "endHour", "getTime", "Ljava/util/Calendar;", "rawTime", "", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class MapClustersRequestKt {
    @NotNull
    public static final ArrayList<PickupIntervalDateObject> getCollectionTimePickupIntervals(int i11, int i12) {
        ArrayList<PickupIntervalDateObject> arrayList = new ArrayList<>();
        Calendar time = getTime(i11);
        Calendar time2 = getTime(i12);
        arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
        time.add(5, 1);
        time2.add(5, 1);
        arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
        return arrayList;
    }

    @Nullable
    public static final ArrayList<PickupIntervalDateObject> getPickupIntervals(@NotNull SearchFilter searchFilter) {
        searchFilter.getClass();
        if (!searchFilter.isPickupTimeSet() && searchFilter.getCollectionDays().isEmpty()) {
            return null;
        }
        ArrayList<PickupIntervalDateObject> arrayList = new ArrayList<>();
        Calendar time = getTime(searchFilter.getCollectionTimes().getRawStartTime());
        Calendar time2 = getTime(searchFilter.getCollectionTimes().getRawEndTime());
        ArrayList<CollectionDayModel> collectionDays = searchFilter.getCollectionDays();
        CollectionDayModel collectionDayModel = CollectionDayModel.TODAY;
        if (collectionDays.contains(collectionDayModel) && collectionDays.contains(CollectionDayModel.TOMORROW)) {
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            time.add(5, 1);
            time2.add(5, 1);
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            return arrayList;
        }
        if (collectionDays.contains(collectionDayModel)) {
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            return arrayList;
        }
        if (collectionDays.contains(CollectionDayModel.TOMORROW)) {
            time.add(5, 1);
            time2.add(5, 1);
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            return arrayList;
        }
        if (searchFilter.isPickupTimeSet()) {
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
            time.add(5, 1);
            time2.add(5, 1);
            arrayList.add(new PickupIntervalDateObject(time.getTime(), time2.getTime()));
        }
        return arrayList;
    }

    private static final Calendar getTime(float f11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.set(13, 0);
        calendar.set(11, (int) f11);
        calendar.set(12, f11 % ((float) 1) != 0.0f ? 30 : 0);
        return calendar;
    }
}
