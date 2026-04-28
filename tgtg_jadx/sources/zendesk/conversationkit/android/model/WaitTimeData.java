package zendesk.conversationkit.android.model;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b2\u0010+\u001a\u0004\b\b\u0010\u001e¨\u00065"}, d2 = {"Lzendesk/conversationkit/android/model/WaitTimeData;", "", "", "queuePosition", "lowestQueuePosition", "Lzendesk/conversationkit/android/model/ResponseTimeDto;", "responseTimeDto", "", "isInitialRouting", "<init>", "(IILzendesk/conversationkit/android/model/ResponseTimeDto;Z)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIILzendesk/conversationkit/android/model/ResponseTimeDto;ZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/WaitTimeData;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Lzendesk/conversationkit/android/model/ResponseTimeDto;", "component4", "()Z", "copy", "(IILzendesk/conversationkit/android/model/ResponseTimeDto;Z)Lzendesk/conversationkit/android/model/WaitTimeData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getQueuePosition", "getQueuePosition$annotations", "()V", "getLowestQueuePosition", "getLowestQueuePosition$annotations", "Lzendesk/conversationkit/android/model/ResponseTimeDto;", "getResponseTimeDto", "getResponseTimeDto$annotations", "Z", "isInitialRouting$annotations", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WaitTimeData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isInitialRouting;
    private final int lowestQueuePosition;
    private final int queuePosition;

    @Nullable
    private final ResponseTimeDto responseTimeDto;

    public /* synthetic */ WaitTimeData(int i11, int i12, int i13, ResponseTimeDto responseTimeDto, boolean z11, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, WaitTimeData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.queuePosition = i12;
        this.lowestQueuePosition = i13;
        this.responseTimeDto = responseTimeDto;
        this.isInitialRouting = z11;
    }

    public static /* synthetic */ WaitTimeData copy$default(WaitTimeData waitTimeData, int i11, int i12, ResponseTimeDto responseTimeDto, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = waitTimeData.queuePosition;
        }
        if ((i13 & 2) != 0) {
            i12 = waitTimeData.lowestQueuePosition;
        }
        if ((i13 & 4) != 0) {
            responseTimeDto = waitTimeData.responseTimeDto;
        }
        if ((i13 & 8) != 0) {
            z11 = waitTimeData.isInitialRouting;
        }
        return waitTimeData.copy(i11, i12, responseTimeDto, z11);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(WaitTimeData self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.queuePosition, serialDesc);
        output.m(1, self.lowestQueuePosition, serialDesc);
        output.r(serialDesc, 2, ResponseTimeDto$$serializer.INSTANCE, self.responseTimeDto);
        output.p(serialDesc, 3, self.isInitialRouting);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQueuePosition() {
        return this.queuePosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLowestQueuePosition() {
        return this.lowestQueuePosition;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResponseTimeDto getResponseTimeDto() {
        return this.responseTimeDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsInitialRouting() {
        return this.isInitialRouting;
    }

    @NotNull
    public final WaitTimeData copy(int queuePosition, int lowestQueuePosition, @Nullable ResponseTimeDto responseTimeDto, boolean isInitialRouting) {
        return new WaitTimeData(queuePosition, lowestQueuePosition, responseTimeDto, isInitialRouting);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitTimeData)) {
            return false;
        }
        WaitTimeData waitTimeData = (WaitTimeData) other;
        return this.queuePosition == waitTimeData.queuePosition && this.lowestQueuePosition == waitTimeData.lowestQueuePosition && Intrinsics.areEqual(this.responseTimeDto, waitTimeData.responseTimeDto) && this.isInitialRouting == waitTimeData.isInitialRouting;
    }

    public final int getLowestQueuePosition() {
        return this.lowestQueuePosition;
    }

    public final int getQueuePosition() {
        return this.queuePosition;
    }

    @Nullable
    public final ResponseTimeDto getResponseTimeDto() {
        return this.responseTimeDto;
    }

    public int hashCode() {
        int iB = k.b(this.lowestQueuePosition, Integer.hashCode(this.queuePosition) * 31, 31);
        ResponseTimeDto responseTimeDto = this.responseTimeDto;
        return Boolean.hashCode(this.isInitialRouting) + ((iB + (responseTimeDto == null ? 0 : responseTimeDto.hashCode())) * 31);
    }

    public final boolean isInitialRouting() {
        return this.isInitialRouting;
    }

    @NotNull
    public String toString() {
        int i11 = this.queuePosition;
        int i12 = this.lowestQueuePosition;
        ResponseTimeDto responseTimeDto = this.responseTimeDto;
        boolean z11 = this.isInitialRouting;
        StringBuilder sbR = k.r(i11, i12, "WaitTimeData(queuePosition=", ", lowestQueuePosition=", ", responseTimeDto=");
        sbR.append(responseTimeDto);
        sbR.append(", isInitialRouting=");
        sbR.append(z11);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/WaitTimeData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/WaitTimeData;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return WaitTimeData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("lowest_queue_position")
    public static /* synthetic */ void getLowestQueuePosition$annotations() {
    }

    @g("queue_position")
    public static /* synthetic */ void getQueuePosition$annotations() {
    }

    @g("response_time")
    public static /* synthetic */ void getResponseTimeDto$annotations() {
    }

    @g("is_initial_routing")
    public static /* synthetic */ void isInitialRouting$annotations() {
    }

    public WaitTimeData(int i11, int i12, @Nullable ResponseTimeDto responseTimeDto, boolean z11) {
        this.queuePosition = i11;
        this.lowestQueuePosition = i12;
        this.responseTimeDto = responseTimeDto;
        this.isInitialRouting = z11;
    }
}
