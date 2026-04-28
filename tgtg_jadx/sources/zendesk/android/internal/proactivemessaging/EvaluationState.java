package zendesk.android.internal.proactivemessaging;

import e0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J>\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0011R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lzendesk/android/internal/proactivemessaging/EvaluationState;", "", "", "Lzendesk/android/internal/proactivemessaging/EvaluationResult;", "evaluationResults", "Lv80/i1;", "job", "", "startTime", "remainingSeconds", "<init>", "(Ljava/util/List;Lv80/i1;JJ)V", "component1", "()Ljava/util/List;", "component2", "()Lv80/i1;", "component3", "()J", "component4", "copy", "(Ljava/util/List;Lv80/i1;JJ)Lzendesk/android/internal/proactivemessaging/EvaluationState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvaluationResults", "Lv80/i1;", "getJob", "setJob", "(Lv80/i1;)V", "J", "getStartTime", "getRemainingSeconds", "setRemainingSeconds", "(J)V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EvaluationState {

    @NotNull
    private final List<EvaluationResult> evaluationResults;

    @NotNull
    private i1 job;
    private long remainingSeconds;
    private final long startTime;

    public EvaluationState(@NotNull List<EvaluationResult> list, @NotNull i1 i1Var, long j9, long j11) {
        list.getClass();
        i1Var.getClass();
        this.evaluationResults = list;
        this.job = i1Var;
        this.startTime = j9;
        this.remainingSeconds = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationState copy$default(EvaluationState evaluationState, List list, i1 i1Var, long j9, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = evaluationState.evaluationResults;
        }
        if ((i11 & 2) != 0) {
            i1Var = evaluationState.job;
        }
        if ((i11 & 4) != 0) {
            j9 = evaluationState.startTime;
        }
        if ((i11 & 8) != 0) {
            j11 = evaluationState.remainingSeconds;
        }
        long j12 = j11;
        return evaluationState.copy(list, i1Var, j9, j12);
    }

    @NotNull
    public final List<EvaluationResult> component1() {
        return this.evaluationResults;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final i1 getJob() {
        return this.job;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRemainingSeconds() {
        return this.remainingSeconds;
    }

    @NotNull
    public final EvaluationState copy(@NotNull List<EvaluationResult> evaluationResults, @NotNull i1 job, long startTime, long remainingSeconds) {
        evaluationResults.getClass();
        job.getClass();
        return new EvaluationState(evaluationResults, job, startTime, remainingSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluationState)) {
            return false;
        }
        EvaluationState evaluationState = (EvaluationState) other;
        return Intrinsics.areEqual(this.evaluationResults, evaluationState.evaluationResults) && Intrinsics.areEqual(this.job, evaluationState.job) && this.startTime == evaluationState.startTime && this.remainingSeconds == evaluationState.remainingSeconds;
    }

    @NotNull
    public final List<EvaluationResult> getEvaluationResults() {
        return this.evaluationResults;
    }

    @NotNull
    public final i1 getJob() {
        return this.job;
    }

    public final long getRemainingSeconds() {
        return this.remainingSeconds;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Long.hashCode(this.remainingSeconds) + f.b((this.job.hashCode() + (this.evaluationResults.hashCode() * 31)) * 31, 31, this.startTime);
    }

    public final void setJob(@NotNull i1 i1Var) {
        i1Var.getClass();
        this.job = i1Var;
    }

    public final void setRemainingSeconds(long j9) {
        this.remainingSeconds = j9;
    }

    @NotNull
    public String toString() {
        return "EvaluationState(evaluationResults=" + this.evaluationResults + ", job=" + this.job + ", startTime=" + this.startTime + ", remainingSeconds=" + this.remainingSeconds + ")";
    }

    public /* synthetic */ EvaluationState(List list, i1 i1Var, long j9, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i1Var, j9, (i11 & 8) != 0 ? -1L : j11);
    }
}
