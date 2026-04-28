package zr;

import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.RemoveHiddenStoreRequest;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.request.UnlockHiddenStoreRequest;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.response.RemoveHiddenStoreResponse;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.network.model.response.UnlockHiddenStoreResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.o;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lzr/b;", "", "Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/UnlockHiddenStoreRequest;", "request", "Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/response/UnlockHiddenStoreResponse;", "b", "(Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/UnlockHiddenStoreRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest;", "Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/response/RemoveHiddenStoreResponse;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/feature/tabprofile/manageaccount/hiddenstores/network/model/request/RemoveHiddenStoreRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("api/hiddenstore/v2/remove")
    @Nullable
    Object a(@NotNull @ra0.a RemoveHiddenStoreRequest removeHiddenStoreRequest, @NotNull c<? super RemoveHiddenStoreResponse> cVar);

    @o("api/hiddenstore/v2/unlock")
    @Nullable
    Object b(@NotNull @ra0.a UnlockHiddenStoreRequest unlockHiddenStoreRequest, @NotNull c<? super UnlockHiddenStoreResponse> cVar);
}
