package kt;

import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.specialrewards.response.SpecialRewardsResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.s;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\nJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lkt/l;", "", "Lu70/q;", "Lcom/app/tgtg/model/remote/specialrewards/response/SpecialRewardsResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "Lcom/app/tgtg/model/remote/specialrewards/SpecialReward;", "b", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "c", "e", "Lcom/app/tgtg/model/remote/RewardId;", "rewardId", Constants.BRAZE_PUSH_CONTENT_KEY, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface l {
    @ra0.o("/api/user/rewards/v2/{rewardId}/redeem")
    @Nullable
    Object a(@s("rewardId") @NotNull String str, @NotNull x70.c<? super q<SpecialReward>> cVar);

    @ra0.o("/api/user/rewards/v2/order/{orderId}")
    @Nullable
    Object b(@s("orderId") @NotNull String str, @NotNull x70.c<? super q<SpecialReward>> cVar);

    @ra0.o("/api/user/rewards/v2/order/{orderId}/reserve")
    @Nullable
    Object c(@s("orderId") @NotNull String str, @NotNull x70.c<? super q<SpecialReward>> cVar);

    @ra0.o("/api/user/rewards/v2")
    @Nullable
    Object d(@NotNull x70.c<? super q<SpecialRewardsResponse>> cVar);

    @ra0.o("/api/user/rewards/v2/order/{orderId}/claim")
    @Nullable
    Object e(@s("orderId") @NotNull String str, @NotNull x70.c<? super q<SpecialReward>> cVar);
}
