package zendesk.android.messaging.model;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\"\u0018\u00002\u00020\u0001B½\u0001\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b!\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0015R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0015R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lzendesk/android/messaging/model/UserColors;", "", "onMessage", "", InAppMessageBase.MESSAGE, "action", "onAction", "primary", "onPrimary", "onBusinessMessage", "businessMessage", "background", "onBackground", "onSecondaryAction", StatusResponseUtils.RESULT_ERROR, "onError", "notify", "onNotify", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOnMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "getAction", "getOnAction", "getPrimary", "getOnPrimary", "getOnBusinessMessage", "getBusinessMessage", "getBackground", "getOnBackground", "getOnSecondaryAction", "getError", "getOnError", "getNotify", "getOnNotify", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserColors {

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
    private final Integer onSecondaryAction;

    @Nullable
    private final Integer primary;

    public /* synthetic */ UserColors(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4, (i11 & 16) != 0 ? null : num5, (i11 & 32) != 0 ? null : num6, (i11 & 64) != 0 ? null : num7, (i11 & 128) != 0 ? null : num8, (i11 & 256) != 0 ? null : num9, (i11 & 512) != 0 ? null : num10, (i11 & 1024) != 0 ? null : num11, (i11 & NewHope.SENDB_BYTES) != 0 ? null : num12, (i11 & 4096) != 0 ? null : num13, (i11 & 8192) != 0 ? null : num14, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : num15);
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
    public final Integer getOnSecondaryAction() {
        return this.onSecondaryAction;
    }

    @Nullable
    public final Integer getPrimary() {
        return this.primary;
    }

    public UserColors(@Nullable Integer num) {
        this(num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2) {
        this(num, num2, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this(num, num2, num3, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this(num, num2, num3, num4, null, null, null, null, null, null, null, null, null, null, null, 32752, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this(num, num2, num3, num4, num5, null, null, null, null, null, null, null, null, null, null, 32736, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        this(num, num2, num3, num4, num5, num6, null, null, null, null, null, null, null, null, null, 32704, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7) {
        this(num, num2, num3, num4, num5, num6, num7, null, null, null, null, null, null, null, null, 32640, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8) {
        this(num, num2, num3, num4, num5, num6, num7, num8, null, null, null, null, null, null, null, 32512, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, null, null, null, null, null, null, 32256, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, null, null, null, null, null, 31744, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, null, null, null, null, 30720, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, null, null, null, 28672, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, null, null, 24576, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, null, BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE, null);
    }

    public UserColors(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15) {
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
        this.onSecondaryAction = num11;
        this.error = num12;
        this.onError = num13;
        this.notify = num14;
        this.onNotify = num15;
    }

    public UserColors() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
