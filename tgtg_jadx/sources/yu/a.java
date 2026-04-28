package yu;

import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import com.app.tgtg.model.remote.voucher.response.VoucherAndDiscountList;
import com.app.tgtg.model.remote.voucher.response.VoucherDetails;
import com.app.tgtg.model.remote.voucher.response.VoucherFilterResponse;
import com.braze.ui.support.ViewUtils;
import com.braze.ui.support.WebViewUtilsKt;
import j4.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import u6.b;
import u70.t;
import z1.y0;
import zendesk.analyticskit.android.model.AnalyticsValueType;
import zendesk.analyticskit.android.model.Value;
import zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage;
import zendesk.android.messaging.MessagingScreen;
import zendesk.conversationkit.android.internal.faye.WsConversationDto;
import zendesk.conversationkit.android.internal.faye.WsFayeMessageType;
import zendesk.faye.internal.HandshakeRequest;
import zendesk.messaging.android.DefaultMessagingFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46338a;

    public /* synthetic */ a(int i11) {
        this.f46338a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46338a) {
            case 0:
                return VoucherAndDiscountList._childSerializers$_anonymous_();
            case 1:
                return VoucherDetails._childSerializers$_anonymous_();
            case 2:
                return VoucherFilterResponse._childSerializers$_anonymous_();
            case 3:
                return VoucherFilterResponse._childSerializers$_anonymous_$0();
            case 4:
                return ViewUtils.setFocusableInTouchModeAndRequestFocus$lambda$3();
            case 5:
                return ViewUtils.isCurrentOrientationValid$lambda$5();
            case 6:
                return ViewUtils.isCurrentOrientationValid$lambda$6();
            case 7:
                return ViewUtils.removeViewFromParent$lambda$0();
            case 8:
                return ViewUtils.removeViewFromParent$lambda$2();
            case 9:
                return WebViewUtilsKt.setWebViewSettings$lambda$0();
            case 10:
                t tVar = BackportedFixQuirk.f2219a;
                return new b();
            case 11:
                return Unit.f26487a;
            case 12:
                float f11 = y0.f46771a;
                return Boolean.TRUE;
            case 13:
                e0 e0Var = z8.a.f47351a;
                return null;
            case 14:
                return AnalyticsValueType._init_$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return AnalyticsValueType.DefaultValueType._init_$_anonymous_();
            case 16:
                return Value._childSerializers$_anonymous_();
            case 17:
                return SendOnceCampaignsStorage._childSerializers$_anonymous_();
            case 18:
                return MessagingScreen._init_$_anonymous_();
            case 19:
                return MessagingScreen.Conversation._childSerializers$_anonymous_();
            case 20:
                return MessagingScreen.ConversationsList._init_$_anonymous_();
            case 21:
                return MessagingScreen.ExitAction._init_$_anonymous_();
            case 22:
                return MessagingScreen.MostRecentActiveConversation._childSerializers$_anonymous_();
            case 23:
                return MessagingScreen.NewConversation._childSerializers$_anonymous_();
            case 24:
                return WsConversationDto._childSerializers$_anonymous_();
            case 25:
                return WsConversationDto._childSerializers$_anonymous_$0();
            case 26:
                return WsFayeMessageType._init_$_anonymous_();
            case 27:
                return HandshakeRequest._childSerializers$_anonymous_();
            case 28:
                return DefaultMessagingFactory.create$lambda$0();
            default:
                return s.e();
        }
    }
}
