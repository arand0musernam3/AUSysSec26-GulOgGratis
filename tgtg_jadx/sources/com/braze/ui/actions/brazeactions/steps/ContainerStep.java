package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import c50.w;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import h7.h0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import n80.p;
import o80.r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/ContainerStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "<init>", "()V", "STEPS", "", "isValid", "", Bayeux.KEY_DATA, "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "getChildStepIterator", "", "Lorg/json/JSONObject;", "getChildStepIterator$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContainerStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerStep.kt\ncom/braze/ui/actions/brazeactions/steps/ContainerStep\n+ 2 JsonUtils.kt\ncom/braze/support/JsonUtils\n*L\n1#1,27:1\n322#2,9:28\n*S KotlinDebug\n*F\n+ 1 ContainerStep.kt\ncom/braze/ui/actions/brazeactions/steps/ContainerStep\n*L\n25#1:28,9\n*E\n"})
public final class ContainerStep extends BaseBrazeActionStep {

    @NotNull
    public static final ContainerStep INSTANCE = new ContainerStep();

    @NotNull
    public static final String STEPS = "steps";

    private ContainerStep() {
        super(null);
    }

    public final Iterator getChildStepIterator$android_sdk_ui_release(StepData data) {
        data.getClass();
        final JSONArray jSONArray = data.getSrcJson().getJSONArray(STEPS);
        if (jSONArray != null) {
            return new h0(r.m(r.h(CollectionsKt.F(p.j(0, jSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$1
                public final Boolean invoke(int i11) {
                    return Boolean.valueOf(jSONArray.opt(i11) instanceof JSONObject);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }), new Function1<Integer, JSONObject>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2
                public final JSONObject invoke(int i11) throws JSONException {
                    Object obj = jSONArray.get(i11);
                    if (obj != null) {
                        return (JSONObject) obj;
                    }
                    w.l("null cannot be cast to non-null type org.json.JSONObject");
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }));
        }
        n0.f26529a.getClass();
        return m0.f26528a;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(@NotNull StepData data) {
        data.getClass();
        return data.getSrcJson().has(STEPS);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(@NotNull Context context, @NotNull StepData data) {
        context.getClass();
        data.getClass();
        Iterator childStepIterator$android_sdk_ui_release = getChildStepIterator$android_sdk_ui_release(data);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            BrazeActionParser.INSTANCE.parse$android_sdk_ui_release(context, StepData.copy$default(data, (JSONObject) childStepIterator$android_sdk_ui_release.next(), null, 2, null));
        }
    }
}
