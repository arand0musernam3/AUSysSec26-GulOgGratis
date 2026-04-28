package kt;

import com.app.tgtg.model.remote.user.requests.AuthByRequestPinRequest;
import com.app.tgtg.model.remote.user.requests.AuthByRequestPollingIdRequest;
import com.app.tgtg.model.remote.user.requests.AuthByRequestTokenRequest;
import com.app.tgtg.model.remote.user.requests.DirectWebToAppLoginRequest;
import com.app.tgtg.model.remote.user.requests.EmailAuthenticateRequest;
import com.app.tgtg.model.remote.user.requests.LoginByThirdPartyRequest;
import com.app.tgtg.model.remote.user.requests.SignUpByEmailRequest;
import com.app.tgtg.model.remote.user.requests.SignUpByThirdPartyRequest;
import com.app.tgtg.model.remote.user.response.EmailAuthenticateResponse;
import com.app.tgtg.model.remote.user.response.EmailSignupResponse;
import com.app.tgtg.model.remote.user.response.LoginResponse;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lkt/b;", "", "Lcom/app/tgtg/model/remote/user/requests/EmailAuthenticateRequest;", Bayeux.KEY_DATA, "Lu70/q;", "Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/app/tgtg/model/remote/user/requests/EmailAuthenticateRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPollingIdRequest;", "Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "e", "(Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPollingIdRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest;", "f", "(Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest;", "h", "(Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest;", "i", "(Lcom/app/tgtg/model/remote/user/requests/DirectWebToAppLoginRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/LoginByThirdPartyRequest;", "c", "(Lcom/app/tgtg/model/remote/user/requests/LoginByThirdPartyRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest;", "Lcom/app/tgtg/model/remote/user/response/EmailSignupResponse;", "b", "(Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;", "date", "g", "(Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;Lx70/c;)Ljava/lang/Object;", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @ra0.o("api/auth/v5/logout")
    @Nullable
    Object a(@NotNull x70.c<? super Unit> cVar);

    @ra0.o("api/auth/v5/signUpByEmail")
    @Nullable
    Object b(@NotNull @ra0.a SignUpByEmailRequest signUpByEmailRequest, @NotNull x70.c<? super q<EmailSignupResponse>> cVar);

    @ra0.o("api/auth/v5/loginByThirdParty")
    @Nullable
    Object c(@NotNull @ra0.a LoginByThirdPartyRequest loginByThirdPartyRequest, @NotNull x70.c<? super q<LoginResponse>> cVar);

    @ra0.k({"withoutAuthorization: true"})
    @ra0.o("api/auth/v5/authByEmail")
    @Nullable
    Object d(@NotNull @ra0.a EmailAuthenticateRequest emailAuthenticateRequest, @NotNull x70.c<? super q<EmailAuthenticateResponse>> cVar);

    @ra0.o("api/auth/v5/authByRequestPollingId")
    @Nullable
    Object e(@NotNull @ra0.a AuthByRequestPollingIdRequest authByRequestPollingIdRequest, @NotNull x70.c<? super q<LoginResponse>> cVar);

    @ra0.o("api/auth/v5/authByRequestPin")
    @Nullable
    Object f(@NotNull @ra0.a AuthByRequestPinRequest authByRequestPinRequest, @NotNull x70.c<? super q<LoginResponse>> cVar);

    @ra0.o("api/auth/v5/signUpByThirdParty")
    @Nullable
    Object g(@NotNull @ra0.a SignUpByThirdPartyRequest signUpByThirdPartyRequest, @NotNull x70.c<? super q<LoginResponse>> cVar);

    @ra0.o("api/auth/v5/authByRequestToken")
    @Nullable
    Object h(@NotNull @ra0.a AuthByRequestTokenRequest authByRequestTokenRequest, @NotNull x70.c<? super q<LoginResponse>> cVar);

    @ra0.o("api/auth/v5/loginByDirectWebToAppLoginToken")
    @Nullable
    Object i(@NotNull @ra0.a DirectWebToAppLoginRequest directWebToAppLoginRequest, @NotNull x70.c<? super q<LoginResponse>> cVar);
}
