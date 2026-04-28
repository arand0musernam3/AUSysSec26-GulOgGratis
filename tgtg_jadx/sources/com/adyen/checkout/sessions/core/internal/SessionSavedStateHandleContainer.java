package com.adyen.checkout.sessions.core.internal;

import androidx.lifecycle.c1;
import com.adyen.checkout.components.core.internal.SavedStateHandleContainer;
import com.adyen.checkout.components.core.internal.SavedStateHandleProperty;
import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.SessionModel;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetails;
import com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsKt;
import i4.a;
import j4.s;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/SessionSavedStateHandleContainer;", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleContainer;", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "<init>", "(Landroidx/lifecycle/c1;Lcom/adyen/checkout/sessions/core/CheckoutSession;)V", "", "sessionData", "", "updateSessionData", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/sessions/core/SessionModel;", "getSessionModel", "()Lcom/adyen/checkout/sessions/core/SessionModel;", "Landroidx/lifecycle/c1;", "getSavedStateHandle", "()Landroidx/lifecycle/c1;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;", "<set-?>", "sessionDetails$delegate", "Lcom/adyen/checkout/components/core/internal/SavedStateHandleProperty;", "getSessionDetails", "()Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;", "setSessionDetails", "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;)V", "sessionDetails", "", "isFlowTakenOver$delegate", "isFlowTakenOver", "()Ljava/lang/Boolean;", "setFlowTakenOver", "(Ljava/lang/Boolean;)V", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SessionSavedStateHandleContainer implements SavedStateHandleContainer {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {s.t(SessionSavedStateHandleContainer.class, "sessionDetails", "getSessionDetails()Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetails;", 0), s.t(SessionSavedStateHandleContainer.class, "isFlowTakenOver", "isFlowTakenOver()Ljava/lang/Boolean;", 0)};

    @NotNull
    private static final String IS_SESSIONS_FLOW_TAKEN_OVER_KEY = "IS_SESSIONS_FLOW_TAKEN_OVER_KEY";

    @NotNull
    private static final String SESSION_KEY = "SESSION_KEY";

    /* JADX INFO: renamed from: isFlowTakenOver$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty isFlowTakenOver;

    @NotNull
    private final c1 savedStateHandle;

    /* JADX INFO: renamed from: sessionDetails$delegate, reason: from kotlin metadata */
    @NotNull
    private final SavedStateHandleProperty sessionDetails;

    public SessionSavedStateHandleContainer(@NotNull c1 c1Var, @NotNull CheckoutSession checkoutSession) {
        c1Var.getClass();
        checkoutSession.getClass();
        this.savedStateHandle = c1Var;
        this.sessionDetails = new SavedStateHandleProperty(SESSION_KEY);
        this.isFlowTakenOver = new SavedStateHandleProperty(IS_SESSIONS_FLOW_TAKEN_OVER_KEY);
        if (getSessionDetails() == null) {
            setSessionDetails(SessionDetailsKt.mapToDetails(checkoutSession));
        }
        if (isFlowTakenOver() == null) {
            setFlowTakenOver(Boolean.FALSE);
        }
    }

    private final SessionDetails getSessionDetails() {
        return (SessionDetails) this.sessionDetails.getValue((SavedStateHandleContainer) this, $$delegatedProperties[0]);
    }

    private final void setSessionDetails(SessionDetails sessionDetails) {
        this.sessionDetails.setValue((SavedStateHandleContainer) this, $$delegatedProperties[0], sessionDetails);
    }

    @Override // com.adyen.checkout.components.core.internal.SavedStateHandleContainer
    @NotNull
    public c1 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @NotNull
    public final SessionModel getSessionModel() {
        SessionDetails sessionDetails = getSessionDetails();
        if (sessionDetails != null) {
            return SessionDetailsKt.mapToModel(sessionDetails);
        }
        a.f("Required value was null.");
        return null;
    }

    @Nullable
    public final Boolean isFlowTakenOver() {
        return (Boolean) this.isFlowTakenOver.getValue((SavedStateHandleContainer) this, $$delegatedProperties[1]);
    }

    public final void setFlowTakenOver(@Nullable Boolean bool) {
        this.isFlowTakenOver.setValue((SavedStateHandleContainer) this, $$delegatedProperties[1], bool);
    }

    public final void updateSessionData(@NotNull String sessionData) {
        sessionData.getClass();
        SessionDetails sessionDetails = getSessionDetails();
        setSessionDetails(sessionDetails != null ? SessionDetails.copy$default(sessionDetails, null, sessionData, null, null, null, null, null, null, null, 509, null) : null);
    }
}
