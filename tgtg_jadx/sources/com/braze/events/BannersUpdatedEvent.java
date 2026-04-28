package com.braze.events;

import com.braze.models.Banner;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/braze/events/BannersUpdatedEvent;", "", "banners", "", "Lcom/braze/models/Banner;", "<init>", "(Ljava/util/List;)V", "getBanners", "()Ljava/util/List;", "isEmpty", "", "()Z", "getBanner", "placementId", "", "toString", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannersUpdatedEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Banner> banners;

    public BannersUpdatedEvent(List<Banner> list) {
        list.getClass();
        this.banners = list;
    }

    public static final BannersUpdatedEvent getEmptyUpdate() {
        return INSTANCE.getEmptyUpdate();
    }

    public final Banner getBanner(String placementId) {
        Object next;
        placementId.getClass();
        Iterator<T> it = this.banners.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Banner) next).getPlacementId(), placementId)) {
                break;
            }
        }
        return (Banner) next;
    }

    public final List<Banner> getBanners() {
        return this.banners;
    }

    public final boolean isEmpty() {
        return this.banners.isEmpty();
    }

    public String toString() {
        return k.h(this.banners.size(), "BannersUpdatedEvent{banner count=", "}");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/braze/events/BannersUpdatedEvent$Companion;", "", "<init>", "()V", "emptyUpdate", "Lcom/braze/events/BannersUpdatedEvent;", "getEmptyUpdate$annotations", "getEmptyUpdate", "()Lcom/braze/events/BannersUpdatedEvent;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BannersUpdatedEvent getEmptyUpdate() {
            return new BannersUpdatedEvent(n0.f26529a);
        }

        private Companion() {
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }
    }
}
