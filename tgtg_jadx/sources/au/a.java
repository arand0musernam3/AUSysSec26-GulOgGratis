package au;

import b0.u1;
import b3.a0;
import b3.b0;
import b3.c;
import b3.f;
import b3.h;
import b3.j;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.braze.models.cards.Card;
import i4.g0;
import i4.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.d3;
import m3.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.internal.rest.model.AppUserDto;
import zendesk.conversationkit.android.internal.rest.model.AppUserRequestDto;
import zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4839a;

    public /* synthetic */ a(int i11) {
        this.f4839a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4839a) {
            case 0:
                return DiscoverBucket._childSerializers$_anonymous_$2();
            case 1:
                return Card._set_isIndicatorHighlighted_$lambda$0();
            case 2:
                return Card.isValidCard$lambda$13();
            case 3:
                return Card._set_isDismissed_$lambda$1();
            case 4:
                return Card._set_isDismissed_$lambda$3();
            case 5:
                return new u1();
            case 6:
                long jD = g0.d(4284612846L);
                long jD2 = g0.d(4281794739L);
                long jD3 = g0.d(4278442694L);
                long jD4 = g0.d(4278290310L);
                long j9 = v.f23310c;
                long jD5 = g0.d(4289724448L);
                long j11 = v.f23309b;
                return new b3.a(jD, jD2, jD3, jD4, j9, j9, jD5, j9, j11, j11, j11, j9, true);
            case 7:
                e0 e0Var = c.f5597a;
                return Float.valueOf(1.0f);
            case 8:
                d3 d3Var = h.f5602a;
                return f.f5600a;
            case 9:
                return new z5.f(0);
            case 10:
                return new j();
            case 11:
                return b0.f5595a;
            case 12:
                return new a0();
            case 13:
                return Unit.f26487a;
            case 14:
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return AppUserDto._childSerializers$_anonymous_();
            case 16:
                return AppUserDto._childSerializers$_anonymous_$0();
            case 17:
                return AppUserDto._childSerializers$_anonymous_$1();
            case 18:
                return AppUserRequestDto._childSerializers$_anonymous_();
            case 19:
                return AppUserRequestDto._childSerializers$_anonymous_$0();
            case 20:
                return AppUserRequestDto._childSerializers$_anonymous_$1();
            case 21:
                return AppUserResponseDto._childSerializers$_anonymous_();
            case 22:
                return AppUserResponseDto._childSerializers$_anonymous_$0();
            case 23:
                return ConversationDto._childSerializers$_anonymous_();
            case 24:
                return ConversationDto._childSerializers$_anonymous_$0();
            case 25:
                return ConversationDto._childSerializers$_anonymous_$1();
            case 26:
                return ConversationDto._childSerializers$_anonymous_$2();
            case 27:
                return ConversationResponseDto._childSerializers$_anonymous_();
            case 28:
                return ConversationResponseDto._childSerializers$_anonymous_$0();
            default:
                return ConversationsResponseDto._childSerializers$_anonymous_();
        }
    }
}
