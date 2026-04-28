package com.braze.ui.actions.brazeactions.steps;

import c50.w;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import h7.h0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import n80.p;
import o80.o;
import o80.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u70.j;
import u70.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u000e\b\u0080\b\u0018\u0000 82\u00020\u0001:\u00018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001fR!\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00104\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u00103R\u001d\u00107\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u00103¨\u00069"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "Lorg/json/JSONObject;", "srcJson", "Lcom/braze/enums/Channel;", "channel", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)V", "", "index", "getArg$android_sdk_ui_release", "(I)Ljava/lang/Object;", "getArg", "Lcom/braze/models/outgoing/BrazeProperties;", "coerceArgToPropertiesOrNull", "(I)Lcom/braze/models/outgoing/BrazeProperties;", "fixedArgCount", "Lkotlin/ranges/IntRange;", "rangedArgCount", "", "isArgCountInBounds", "(ILkotlin/ranges/IntRange;)Z", "isArgString", "(I)Z", "isArgOptionalJsonObject", "", "toString", "()Ljava/lang/String;", "component1", "()Lorg/json/JSONObject;", "component2", "()Lcom/braze/enums/Channel;", "copy", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)Lcom/braze/ui/actions/brazeactions/steps/StepData;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/json/JSONObject;", "getSrcJson", "Lcom/braze/enums/Channel;", "getChannel", "", "args$delegate", "Lu70/j;", "getArgs", "()Ljava/util/List;", StepData.ARGS, "firstArg$delegate", "getFirstArg", "()Ljava/lang/Object;", "firstArg", "secondArg$delegate", "getSecondArg", "secondArg", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepData.kt\ncom/braze/ui/actions/brazeactions/steps/StepData\n+ 2 JsonUtils.kt\ncom/braze/support/JsonUtils\n*L\n1#1,96:1\n322#2,9:97\n*S KotlinDebug\n*F\n+ 1 StepData.kt\ncom/braze/ui/actions/brazeactions/steps/StepData\n*L\n21#1:97,9\n*E\n"})
public final /* data */ class StepData {

    @NotNull
    public static final String ARGS = "args";

    /* JADX INFO: renamed from: args$delegate, reason: from kotlin metadata */
    @NotNull
    private final j args;

    @NotNull
    private final Channel channel;

    /* JADX INFO: renamed from: firstArg$delegate, reason: from kotlin metadata */
    @NotNull
    private final j firstArg;

    /* JADX INFO: renamed from: secondArg$delegate, reason: from kotlin metadata */
    @NotNull
    private final j secondArg;

    @NotNull
    private final JSONObject srcJson;

    public StepData(@NotNull JSONObject jSONObject, @NotNull Channel channel) {
        jSONObject.getClass();
        channel.getClass();
        this.srcJson = jSONObject;
        this.channel = channel;
        this.args = l.b(new a(2, this));
        this.firstArg = l.b(new a(3, this));
        this.secondArg = l.b(new a(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List args_delegate$lambda$0(StepData stepData) {
        Iterator h0Var;
        final JSONArray jSONArrayOptJSONArray = stepData.srcJson.optJSONArray(ARGS);
        if (jSONArrayOptJSONArray == null) {
            n0.f26529a.getClass();
            h0Var = m0.f26528a;
        } else {
            h0Var = new h0(r.m(r.h(CollectionsKt.F(p.j(0, jSONArrayOptJSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$1
                public final Boolean invoke(int i11) {
                    return Boolean.valueOf(Objects.nonNull(jSONArrayOptJSONArray.opt(i11)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }), new Function1<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$2
                public final Object invoke(int i11) throws JSONException {
                    Object obj = jSONArrayOptJSONArray.get(i11);
                    if (obj != null) {
                        return obj;
                    }
                    w.l("null cannot be cast to non-null type kotlin.Any");
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }));
        }
        return r.o(o.b(h0Var));
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i11 & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object firstArg_delegate$lambda$1(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(0);
    }

    private final List<Object> getArgs() {
        return (List) this.args.getValue();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i11, IntRange intRange, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        if ((i12 & 2) != 0) {
            intRange = null;
        }
        return stepData.isArgCountInBounds(i11, intRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$3(int i11, StepData stepData) {
        return "Expected " + i11 + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$4(IntRange intRange, StepData stepData) {
        return "Expected " + intRange + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgOptionalJsonObject$lambda$6(int i11, StepData stepData) {
        return "Argument [" + i11 + "] is not a JSONObject. Source: " + stepData.srcJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgString$lambda$5(int i11, StepData stepData) {
        return "Argument [" + i11 + "] is not a String. Source: " + stepData.srcJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object secondArg_delegate$lambda$2(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(1);
    }

    @Nullable
    public final BrazeProperties coerceArgToPropertiesOrNull(int index) {
        Object objQ = CollectionsKt.Q(index, getArgs());
        if (objQ == null || !(objQ instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) objQ);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    @NotNull
    public final StepData copy(@NotNull JSONObject srcJson, @NotNull Channel channel) {
        srcJson.getClass();
        channel.getClass();
        return new StepData(srcJson, channel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return Intrinsics.areEqual(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    @Nullable
    public final Object getArg$android_sdk_ui_release(int index) {
        return CollectionsKt.Q(index, getArgs());
    }

    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }

    @Nullable
    public final Object getFirstArg() {
        return this.firstArg.getValue();
    }

    @Nullable
    public final Object getSecondArg() {
        return this.secondArg.getValue();
    }

    @NotNull
    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public int hashCode() {
        return this.channel.hashCode() + (this.srcJson.hashCode() * 31);
    }

    public final boolean isArgCountInBounds(int fixedArgCount, @Nullable IntRange rangedArgCount) {
        if (fixedArgCount != -1 && getArgs().size() != fixedArgCount) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(fixedArgCount, this, 2), 7, (Object) null);
            return false;
        }
        if (rangedArgCount == null) {
            return true;
        }
        int size = getArgs().size();
        if (rangedArgCount.f26553a <= size && size <= rangedArgCount.f26554b) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bs.b(15, rangedArgCount, this), 7, (Object) null);
        return false;
    }

    public final boolean isArgOptionalJsonObject(int index) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(index);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(index, this, 1), 7, (Object) null);
        return false;
    }

    public final boolean isArgString(int index) {
        if (getArg$android_sdk_ui_release(index) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(index, this, 0), 7, (Object) null);
        return false;
    }

    @NotNull
    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i11 & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
