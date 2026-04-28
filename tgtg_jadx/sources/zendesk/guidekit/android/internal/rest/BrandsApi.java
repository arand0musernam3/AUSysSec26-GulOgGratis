package zendesk.guidekit.android.internal.rest;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.f;
import ra0.t;
import x70.c;
import zendesk.guidekit.android.internal.rest.model.BrandsDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/guidekit/android/internal/rest/BrandsApi;", "", "", "channelId", "Lzendesk/guidekit/android/internal/rest/model/BrandsDto;", "getBrands", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BrandsApi {
    @f("/embeddable/brands.json")
    @Nullable
    Object getBrands(@t("channel_id") @NotNull String str, @NotNull c<? super BrandsDto> cVar);
}
