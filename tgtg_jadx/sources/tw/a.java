package tw;

import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.StepData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeActionParser.ActionType f40483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StepData f40484c;

    public /* synthetic */ a(BrazeActionParser.ActionType actionType, StepData stepData, int i11) {
        this.f40482a = i11;
        this.f40483b = actionType;
        this.f40484c = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40482a) {
            case 0:
                return BrazeActionParser.getActionType$lambda$9(this.f40483b, this.f40484c);
            default:
                return BrazeActionParser.parse$lambda$5(this.f40483b, this.f40484c);
        }
    }
}
