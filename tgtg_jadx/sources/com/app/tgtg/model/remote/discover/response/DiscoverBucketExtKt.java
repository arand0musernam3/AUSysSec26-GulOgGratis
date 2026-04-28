package com.app.tgtg.model.remote.discover.response;

import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qh.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "Lqh/a;", "toBucketListUIData", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)Lqh/a;", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class DiscoverBucketExtKt {
    @NotNull
    public static final a toBucketListUIData(@NotNull DiscoverBucket discoverBucket) {
        discoverBucket.getClass();
        String title = discoverBucket.getTitle();
        if (title == null) {
            title = "";
        }
        String description = discoverBucket.getDescription();
        String str = description != null ? description : "";
        ArrayList<BasicItem> items = discoverBucket.getItems();
        if (items == null) {
            items = new ArrayList<>();
        }
        return new a(title, str, items, discoverBucket.getFillerType());
    }
}
