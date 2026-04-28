package zendesk.android.internal.usercolors;

import b3.i;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.models.inappmessage.InAppMessageBase;
import i90.h;
import j4.s;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0002MLB»\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B±\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019JÄ\u0001\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\bA\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bC\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bD\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bE\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bF\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bG\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bH\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bI\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010\u0019¨\u0006N"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsPersistence;", "", "", "onMessage", InAppMessageBase.MESSAGE, "action", "onAction", "primary", "onPrimary", "onBusinessMessage", "businessMessage", "background", "onBackground", "secondaryAction", StatusResponseUtils.RESULT_ERROR, "onError", "notify", "onNotify", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm90/m1;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/android/internal/usercolors/UserColorsPersistence;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/usercolors/UserColorsPersistence;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getOnMessage", "getMessage", "getAction", "getOnAction", "getPrimary", "getOnPrimary", "getOnBusinessMessage", "getBusinessMessage", "getBackground", "getOnBackground", "getSecondaryAction", "getError", "getOnError", "getNotify", "getOnNotify", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserColorsPersistence {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer action;

    @Nullable
    private final Integer background;

    @Nullable
    private final Integer businessMessage;

    @Nullable
    private final Integer error;

    @Nullable
    private final Integer message;

    @Nullable
    private final Integer notify;

    @Nullable
    private final Integer onAction;

    @Nullable
    private final Integer onBackground;

    @Nullable
    private final Integer onBusinessMessage;

    @Nullable
    private final Integer onError;

    @Nullable
    private final Integer onMessage;

    @Nullable
    private final Integer onNotify;

    @Nullable
    private final Integer onPrimary;

    @Nullable
    private final Integer primary;

    @Nullable
    private final Integer secondaryAction;

    public /* synthetic */ UserColorsPersistence(int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, m1 m1Var) {
        if (32767 != (i11 & 32767)) {
            c1.j(i11, 32767, UserColorsPersistence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.onMessage = num;
        this.message = num2;
        this.action = num3;
        this.onAction = num4;
        this.primary = num5;
        this.onPrimary = num6;
        this.onBusinessMessage = num7;
        this.businessMessage = num8;
        this.background = num9;
        this.onBackground = num10;
        this.secondaryAction = num11;
        this.error = num12;
        this.onError = num13;
        this.notify = num14;
        this.onNotify = num15;
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(UserColorsPersistence self, b output, SerialDescriptor serialDesc) {
        l0 l0Var = l0.f29821a;
        output.r(serialDesc, 0, l0Var, self.onMessage);
        output.r(serialDesc, 1, l0Var, self.message);
        output.r(serialDesc, 2, l0Var, self.action);
        output.r(serialDesc, 3, l0Var, self.onAction);
        output.r(serialDesc, 4, l0Var, self.primary);
        output.r(serialDesc, 5, l0Var, self.onPrimary);
        output.r(serialDesc, 6, l0Var, self.onBusinessMessage);
        output.r(serialDesc, 7, l0Var, self.businessMessage);
        output.r(serialDesc, 8, l0Var, self.background);
        output.r(serialDesc, 9, l0Var, self.onBackground);
        output.r(serialDesc, 10, l0Var, self.secondaryAction);
        output.r(serialDesc, 11, l0Var, self.error);
        output.r(serialDesc, 12, l0Var, self.onError);
        output.r(serialDesc, 13, l0Var, self.notify);
        output.r(serialDesc, 14, l0Var, self.onNotify);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOnMessage() {
        return this.onMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getOnBackground() {
        return this.onBackground;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getSecondaryAction() {
        return this.secondaryAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getOnError() {
        return this.onError;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getNotify() {
        return this.notify;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getOnNotify() {
        return this.onNotify;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOnAction() {
        return this.onAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPrimary() {
        return this.primary;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getOnPrimary() {
        return this.onPrimary;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getOnBusinessMessage() {
        return this.onBusinessMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getBusinessMessage() {
        return this.businessMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getBackground() {
        return this.background;
    }

    @NotNull
    public final UserColorsPersistence copy(@Nullable Integer onMessage, @Nullable Integer message, @Nullable Integer action, @Nullable Integer onAction, @Nullable Integer primary, @Nullable Integer onPrimary, @Nullable Integer onBusinessMessage, @Nullable Integer businessMessage, @Nullable Integer background, @Nullable Integer onBackground, @Nullable Integer secondaryAction, @Nullable Integer error, @Nullable Integer onError, @Nullable Integer notify, @Nullable Integer onNotify) {
        return new UserColorsPersistence(onMessage, message, action, onAction, primary, onPrimary, onBusinessMessage, businessMessage, background, onBackground, secondaryAction, error, onError, notify, onNotify);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserColorsPersistence)) {
            return false;
        }
        UserColorsPersistence userColorsPersistence = (UserColorsPersistence) other;
        return Intrinsics.areEqual(this.onMessage, userColorsPersistence.onMessage) && Intrinsics.areEqual(this.message, userColorsPersistence.message) && Intrinsics.areEqual(this.action, userColorsPersistence.action) && Intrinsics.areEqual(this.onAction, userColorsPersistence.onAction) && Intrinsics.areEqual(this.primary, userColorsPersistence.primary) && Intrinsics.areEqual(this.onPrimary, userColorsPersistence.onPrimary) && Intrinsics.areEqual(this.onBusinessMessage, userColorsPersistence.onBusinessMessage) && Intrinsics.areEqual(this.businessMessage, userColorsPersistence.businessMessage) && Intrinsics.areEqual(this.background, userColorsPersistence.background) && Intrinsics.areEqual(this.onBackground, userColorsPersistence.onBackground) && Intrinsics.areEqual(this.secondaryAction, userColorsPersistence.secondaryAction) && Intrinsics.areEqual(this.error, userColorsPersistence.error) && Intrinsics.areEqual(this.onError, userColorsPersistence.onError) && Intrinsics.areEqual(this.notify, userColorsPersistence.notify) && Intrinsics.areEqual(this.onNotify, userColorsPersistence.onNotify);
    }

    @Nullable
    public final Integer getAction() {
        return this.action;
    }

    @Nullable
    public final Integer getBackground() {
        return this.background;
    }

    @Nullable
    public final Integer getBusinessMessage() {
        return this.businessMessage;
    }

    @Nullable
    public final Integer getError() {
        return this.error;
    }

    @Nullable
    public final Integer getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getNotify() {
        return this.notify;
    }

    @Nullable
    public final Integer getOnAction() {
        return this.onAction;
    }

    @Nullable
    public final Integer getOnBackground() {
        return this.onBackground;
    }

    @Nullable
    public final Integer getOnBusinessMessage() {
        return this.onBusinessMessage;
    }

    @Nullable
    public final Integer getOnError() {
        return this.onError;
    }

    @Nullable
    public final Integer getOnMessage() {
        return this.onMessage;
    }

    @Nullable
    public final Integer getOnNotify() {
        return this.onNotify;
    }

    @Nullable
    public final Integer getOnPrimary() {
        return this.onPrimary;
    }

    @Nullable
    public final Integer getPrimary() {
        return this.primary;
    }

    @Nullable
    public final Integer getSecondaryAction() {
        return this.secondaryAction;
    }

    public int hashCode() {
        Integer num = this.onMessage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.message;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.action;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.onAction;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.primary;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.onPrimary;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.onBusinessMessage;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.businessMessage;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.background;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.onBackground;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.secondaryAction;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.error;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.onError;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.notify;
        int iHashCode14 = (iHashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.onNotify;
        return iHashCode14 + (num15 != null ? num15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.onMessage;
        Integer num2 = this.message;
        Integer num3 = this.action;
        Integer num4 = this.onAction;
        Integer num5 = this.primary;
        Integer num6 = this.onPrimary;
        Integer num7 = this.onBusinessMessage;
        Integer num8 = this.businessMessage;
        Integer num9 = this.background;
        Integer num10 = this.onBackground;
        Integer num11 = this.secondaryAction;
        Integer num12 = this.error;
        Integer num13 = this.onError;
        Integer num14 = this.notify;
        Integer num15 = this.onNotify;
        StringBuilder sb2 = new StringBuilder("UserColorsPersistence(onMessage=");
        sb2.append(num);
        sb2.append(", message=");
        sb2.append(num2);
        sb2.append(", action=");
        s.z(sb2, num3, ", onAction=", num4, ", primary=");
        s.z(sb2, num5, ", onPrimary=", num6, ", onBusinessMessage=");
        s.z(sb2, num7, ", businessMessage=", num8, ", background=");
        s.z(sb2, num9, ", onBackground=", num10, ", secondaryAction=");
        s.z(sb2, num11, ", error=", num12, ", onError=");
        s.z(sb2, num13, ", notify=", num14, ", onNotify=");
        return i.m(sb2, num15, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsPersistence$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/usercolors/UserColorsPersistence;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserColorsPersistence$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserColorsPersistence(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15) {
        this.onMessage = num;
        this.message = num2;
        this.action = num3;
        this.onAction = num4;
        this.primary = num5;
        this.onPrimary = num6;
        this.onBusinessMessage = num7;
        this.businessMessage = num8;
        this.background = num9;
        this.onBackground = num10;
        this.secondaryAction = num11;
        this.error = num12;
        this.onError = num13;
        this.notify = num14;
        this.onNotify = num15;
    }
}
