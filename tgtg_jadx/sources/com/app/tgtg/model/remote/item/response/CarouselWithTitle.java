package com.app.tgtg.model.remote.item.response;

import kotlin.Metadata;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/CarouselWithTitle;", "", MessageBundle.TITLE_ENTRY, "", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "modularFeedAction", "Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "getModularFeedAction", "()Lcom/app/tgtg/model/remote/item/response/ModularFeedAction;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface CarouselWithTitle {
    @Nullable
    ModularFeedAction getModularFeedAction();

    @Nullable
    String getSubtitle();

    @Nullable
    String getTitle();
}
