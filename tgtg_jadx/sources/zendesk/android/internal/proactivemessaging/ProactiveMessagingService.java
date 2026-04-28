package zendesk.android.internal.proactivemessaging;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.a;
import ra0.f;
import ra0.o;
import ra0.s;
import x70.c;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsRequestDto;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsResponseDto;
import zendesk.android.internal.proactivemessaging.model.Campaign;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzendesk/android/internal/proactivemessaging/ProactiveMessagingService;", "", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsRequestDto;", "ctsRequest", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto;", "getProactiveMessage", "(Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsRequestDto;Lx70/c;)Ljava/lang/Object;", "", "integrationId", "", "Lzendesk/android/internal/proactivemessaging/model/Campaign;", "getCampaigns", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ProactiveMessagingService {
    @f("/embeddable/campaigns/{integrationId}")
    @Nullable
    Object getCampaigns(@s("integrationId") @NotNull String str, @NotNull c<? super List<Campaign>> cVar);

    @o("/api/v2/cts/proactive_message")
    @Nullable
    Object getProactiveMessage(@NotNull @a CtsRequestDto ctsRequestDto, @NotNull c<? super CtsResponseDto> cVar);
}
