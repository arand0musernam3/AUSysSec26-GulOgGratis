package zendesk.android.internal.proactivemessaging.model;

import com.braze.models.inappmessage.InAppMessageBase;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.internal.proactivemessaging.model.TriggerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Trigger;", "", "Lzendesk/android/internal/proactivemessaging/model/TriggerType;", "type", "", InAppMessageBase.DURATION, "<init>", "(Lzendesk/android/internal/proactivemessaging/model/TriggerType;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/internal/proactivemessaging/model/TriggerType;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/model/Trigger;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/internal/proactivemessaging/model/TriggerType;", "component2", "()Ljava/lang/Integer;", "copy", "(Lzendesk/android/internal/proactivemessaging/model/TriggerType;Ljava/lang/Integer;)Lzendesk/android/internal/proactivemessaging/model/Trigger;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/internal/proactivemessaging/model/TriggerType;", "getType", "Ljava/lang/Integer;", "getDuration", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Trigger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer duration;

    @NotNull
    private final TriggerType type;

    public /* synthetic */ Trigger(int i11, TriggerType triggerType, Integer num, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, Trigger$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = triggerType;
        if ((i11 & 2) == 0) {
            this.duration = null;
        } else {
            this.duration = num;
        }
    }

    public static /* synthetic */ Trigger copy$default(Trigger trigger, TriggerType triggerType, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            triggerType = trigger.type;
        }
        if ((i11 & 2) != 0) {
            num = trigger.duration;
        }
        return trigger.copy(triggerType, num);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(Trigger self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, TriggerType.TriggerTypeSerializer.INSTANCE, self.type);
        if (!output.C(serialDesc) && self.duration == null) {
            return;
        }
        output.r(serialDesc, 1, l0.f29821a, self.duration);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TriggerType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @NotNull
    public final Trigger copy(@NotNull TriggerType type, @Nullable Integer duration) {
        type.getClass();
        return new Trigger(type, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) other;
        return this.type == trigger.type && Intrinsics.areEqual(this.duration, trigger.duration);
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @NotNull
    public final TriggerType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.duration;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "Trigger(type=" + this.type + ", duration=" + this.duration + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Trigger$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Trigger;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Trigger$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Trigger(@NotNull TriggerType triggerType, @Nullable Integer num) {
        triggerType.getClass();
        this.type = triggerType;
        this.duration = num;
    }

    public /* synthetic */ Trigger(TriggerType triggerType, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(triggerType, (i11 & 2) != 0 ? null : num);
    }
}
