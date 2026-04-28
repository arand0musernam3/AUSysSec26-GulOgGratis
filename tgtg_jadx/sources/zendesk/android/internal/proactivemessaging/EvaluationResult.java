package zendesk.android.internal.proactivemessaging;

import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.internal.proactivemessaging.model.Campaign;
import zendesk.android.internal.proactivemessaging.model.Path;
import zendesk.android.pageviewevents.PageView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lzendesk/android/internal/proactivemessaging/EvaluationResult;", "", "campaign", "Lzendesk/android/internal/proactivemessaging/model/Campaign;", "successfulPaths", "", "Lzendesk/android/internal/proactivemessaging/model/Path;", "event", "Lzendesk/android/pageviewevents/PageView;", "<init>", "(Lzendesk/android/internal/proactivemessaging/model/Campaign;Ljava/util/List;Lzendesk/android/pageviewevents/PageView;)V", "getCampaign", "()Lzendesk/android/internal/proactivemessaging/model/Campaign;", "getSuccessfulPaths", "()Ljava/util/List;", "getEvent", "()Lzendesk/android/pageviewevents/PageView;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EvaluationResult {

    @NotNull
    private final Campaign campaign;

    @NotNull
    private final PageView event;

    @NotNull
    private final List<Path> successfulPaths;

    public EvaluationResult(@NotNull Campaign campaign, @NotNull List<Path> list, @NotNull PageView pageView) {
        campaign.getClass();
        list.getClass();
        pageView.getClass();
        this.campaign = campaign;
        this.successfulPaths = list;
        this.event = pageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationResult copy$default(EvaluationResult evaluationResult, Campaign campaign, List list, PageView pageView, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            campaign = evaluationResult.campaign;
        }
        if ((i11 & 2) != 0) {
            list = evaluationResult.successfulPaths;
        }
        if ((i11 & 4) != 0) {
            pageView = evaluationResult.event;
        }
        return evaluationResult.copy(campaign, list, pageView);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final List<Path> component2() {
        return this.successfulPaths;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PageView getEvent() {
        return this.event;
    }

    @NotNull
    public final EvaluationResult copy(@NotNull Campaign campaign, @NotNull List<Path> successfulPaths, @NotNull PageView event) {
        campaign.getClass();
        successfulPaths.getClass();
        event.getClass();
        return new EvaluationResult(campaign, successfulPaths, event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluationResult)) {
            return false;
        }
        EvaluationResult evaluationResult = (EvaluationResult) other;
        return Intrinsics.areEqual(this.campaign, evaluationResult.campaign) && Intrinsics.areEqual(this.successfulPaths, evaluationResult.successfulPaths) && Intrinsics.areEqual(this.event, evaluationResult.event);
    }

    @NotNull
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final PageView getEvent() {
        return this.event;
    }

    @NotNull
    public final List<Path> getSuccessfulPaths() {
        return this.successfulPaths;
    }

    public int hashCode() {
        return this.event.hashCode() + f.c(this.successfulPaths, this.campaign.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "EvaluationResult(campaign=" + this.campaign + ", successfulPaths=" + this.successfulPaths + ", event=" + this.event + ")";
    }
}
