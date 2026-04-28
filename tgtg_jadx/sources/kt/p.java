package kt;

import com.app.tgtg.model.remote.voucher.request.AddVoucherRequest;
import com.app.tgtg.model.remote.voucher.response.AddNewVoucherResponse;
import com.app.tgtg.model.remote.voucher.response.BasicDiscountVoucherList;
import com.app.tgtg.model.remote.voucher.response.BasicVoucherList;
import com.app.tgtg.model.remote.voucher.response.DiscountVoucherDetails;
import com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountList;
import com.app.tgtg.model.remote.voucher.response.VoucherDetails;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.s;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0005J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\r\u0010\u000bJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0005J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0005J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0017\u0010\u000bJ\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0018\u0010\u000bJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0005J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0005¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lkt/p;", "", "Lu70/q;", "Lcom/app/tgtg/model/remote/voucher/response/BasicVoucherList;", "h", "(Lx70/c;)Ljava/lang/Object;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lcom/app/tgtg/model/remote/VoucherId;", "voucherId", "Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;", "j", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/voucher/response/VoucherFilterResponse;", "c", "Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest;", "request", "Lcom/app/tgtg/model/remote/voucher/response/AddNewVoucherResponse;", "f", "(Lcom/app/tgtg/model/remote/voucher/request/AddVoucherRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/voucher/response/BasicDiscountVoucherList;", "e", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/app/tgtg/model/remote/voucher/response/DiscountVoucherDetails;", "g", "k", "Lcom/app/tgtg/model/remote/voucher/response/VoucherAndDiscountList;", "i", "b", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface p {
    @ra0.o("api/payment/userdiscount/v1/used")
    @Nullable
    Object a(@NotNull x70.c<? super q<BasicDiscountVoucherList>> cVar);

    @ra0.o("api/user/discount/v1/used")
    @Nullable
    Object b(@NotNull x70.c<? super q<VoucherAndDiscountList>> cVar);

    @ra0.o("api/voucher/v4/{voucherId}/storeFilterList")
    @Nullable
    Object c(@s(encoded = true, value = "voucherId") @Nullable String str, @NotNull x70.c<? super q<VoucherFilterResponse>> cVar);

    @ra0.o("api/voucher/v4/used")
    @Nullable
    Object d(@NotNull x70.c<? super q<BasicVoucherList>> cVar);

    @ra0.o("api/payment/userdiscount/v1/active")
    @Nullable
    Object e(@NotNull x70.c<? super q<BasicDiscountVoucherList>> cVar);

    @ra0.o("api/voucher/v4/add")
    @Nullable
    Object f(@NotNull @ra0.a AddVoucherRequest addVoucherRequest, @NotNull x70.c<? super q<AddNewVoucherResponse>> cVar);

    @ra0.o("api/payment/userdiscount/v1/{voucherId}")
    @Nullable
    Object g(@s(encoded = true, value = "voucherId") @Nullable String str, @NotNull x70.c<? super q<DiscountVoucherDetails>> cVar);

    @ra0.o("api/voucher/v4/active")
    @Nullable
    Object h(@NotNull x70.c<? super q<BasicVoucherList>> cVar);

    @ra0.o("api/user/discount/v1/active")
    @Nullable
    Object i(@NotNull x70.c<? super q<VoucherAndDiscountList>> cVar);

    @ra0.o("api/voucher/v4/{voucherId}")
    @Nullable
    Object j(@s(encoded = true, value = "voucherId") @Nullable String str, @NotNull x70.c<? super q<VoucherDetails>> cVar);

    @ra0.o("api/payment/userdiscount/v1/{voucherId}/storeFilterList")
    @Nullable
    Object k(@s(encoded = true, value = "voucherId") @Nullable String str, @NotNull x70.c<? super q<VoucherFilterResponse>> cVar);
}
