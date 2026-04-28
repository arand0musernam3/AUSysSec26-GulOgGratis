package kt;

import com.app.tgtg.model.remote.support.request.BusinessSupportRequest;
import com.app.tgtg.model.remote.support.request.ConsumerSupportRequest;
import com.app.tgtg.model.remote.support.response.ConsumerRefundChoiceRequest;
import com.app.tgtg.model.remote.support.response.ConsumerSupportResponse;
import com.app.tgtg.model.remote.support.response.RefundResponse;
import com.app.tgtg.model.remote.support.response.SupportPictureUploadResponse;
import com.braze.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.a0;
import q90.r0;
import ra0.s;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lkt/m;", "", "Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest;", "request", "Lu70/q;", "Lcom/app/tgtg/model/remote/support/response/ConsumerSupportResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/app/tgtg/model/remote/support/request/ConsumerSupportRequest;Lx70/c;)Ljava/lang/Object;", "", "supportRequestId", "Lq90/r0;", "b", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/support/request/BusinessSupportRequest;Lx70/c;)Ljava/lang/Object;", "", "Lq90/a0;", "imageFile", "Lcom/app/tgtg/model/remote/support/response/SupportPictureUploadResponse;", "e", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest;", "Lcom/app/tgtg/model/remote/support/response/RefundResponse;", "c", "(Lcom/app/tgtg/model/remote/support/response/ConsumerRefundChoiceRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m {
    @ra0.o("api/support/v1/business/")
    @Nullable
    Object a(@NotNull @ra0.a BusinessSupportRequest businessSupportRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/support/v2/consumer/{supportRequestId}/confirm")
    @Nullable
    Object b(@s(encoded = true, value = "supportRequestId") @Nullable String str, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/support/v2/consumer/refund/choice")
    @Nullable
    Object c(@NotNull @ra0.a ConsumerRefundChoiceRequest consumerRefundChoiceRequest, @NotNull x70.c<? super q<RefundResponse>> cVar);

    @ra0.o("api/support/v2/consumer/")
    @Nullable
    Object d(@NotNull @ra0.a ConsumerSupportRequest consumerSupportRequest, @NotNull x70.c<? super q<ConsumerSupportResponse>> cVar);

    @ra0.o("api/support/v2/uploading/files")
    @ra0.l
    @Nullable
    Object e(@Nullable @ra0.q List<a0> list, @NotNull x70.c<? super q<SupportPictureUploadResponse>> cVar);
}
