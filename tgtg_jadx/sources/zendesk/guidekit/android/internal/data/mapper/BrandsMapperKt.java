package zendesk.guidekit.android.internal.data.mapper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.guidekit.android.internal.rest.model.BrandDto;
import zendesk.guidekit.android.model.Brand;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toBrand", "Lzendesk/guidekit/android/model/Brand;", "Lzendesk/guidekit/android/internal/rest/model/BrandDto;", "zendesk.guidekit_guidekit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BrandsMapperKt {
    @NotNull
    public static final Brand toBrand(@NotNull BrandDto brandDto) {
        brandDto.getClass();
        return new Brand(brandDto.getChannelId(), brandDto.getSubdomain(), brandDto.getHostMapping());
    }
}
