package a3;

import atd.g.BuildConfig;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem$$serializer;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.android.settings.internal.model.SunCoConfigDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291a;

    public /* synthetic */ c0(int i11) {
        this.f291a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        switch (this.f291a) {
            case 0:
                c90.f fVar = v80.p0.f42144a;
                return c90.e.f7834b;
            case 1:
                return new s2(1L);
            case 2:
                m3.e0 e0Var = t2.f577a;
                return null;
            case 3:
                return u3.f589b;
            case 4:
                m3.d3 d3Var = a4.i.f686a;
                return null;
            case 5:
                m3.d3 d3Var2 = a4.j.f687a;
                return null;
            case 6:
                return SunCoConfigDto._childSerializers$_anonymous_();
            case 7:
                try {
                    return android.support.v4.media.session.a.L(o80.r.o(o80.o.b(Arrays.asList(new sd.e()).iterator())));
                } finally {
                }
            case 8:
                try {
                    return android.support.v4.media.session.a.L(o80.r.o(o80.o.b(Arrays.asList(new wd.b()).iterator())));
                } finally {
                }
            case 9:
                return new i90.f("com.app.tgtg.feature.authentication.ui.AuthenticationScreen", Reflection.getOrCreateKotlinClass(ah.i.class), new KClass[]{Reflection.getOrCreateKotlinClass(ah.f.class), Reflection.getOrCreateKotlinClass(ah.g.class), Reflection.getOrCreateKotlinClass(ah.h.class)}, new KSerializer[]{new i90.a("com.app.tgtg.feature.authentication.ui.AuthenticationScreen.EnterEmailScreen", ah.f.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.authentication.ui.AuthenticationScreen.MainScreen", ah.g.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.authentication.ui.AuthenticationScreen.PinScreen", ah.h.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 10:
                return new i90.a("com.app.tgtg.feature.authentication.ui.AuthenticationScreen.EnterEmailScreen", ah.f.INSTANCE, new Annotation[0]);
            case 11:
                return new i90.a("com.app.tgtg.feature.authentication.ui.AuthenticationScreen.MainScreen", ah.g.INSTANCE, new Annotation[0]);
            case 12:
                return new i90.a("com.app.tgtg.feature.authentication.ui.AuthenticationScreen.PinScreen", ah.h.INSTANCE, new Annotation[0]);
            case 13:
                return new m90.d(BasketBriefItem$$serializer.INSTANCE, 0);
            case 14:
                return new androidx.lifecycle.o0();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new av.e();
            case 16:
                return new i90.f("com.app.tgtg.feature.logincharity.ui.email.navigation.NavigationLoginEmailCharity", Reflection.getOrCreateKotlinClass(am.m.class), new KClass[]{Reflection.getOrCreateKotlinClass(am.f.class), Reflection.getOrCreateKotlinClass(am.i.class), Reflection.getOrCreateKotlinClass(am.l.class)}, new KSerializer[]{am.d.f1608a, am.g.f1610a, am.j.f1612a}, new Annotation[0]);
            case 17:
                return BuildConfig.RuntimeErrorEvent();
            case 18:
                return BuildConfig.getTransactionID();
            case 19:
                return BuildConfig.getErrorDetails();
            case 20:
                return BuildConfig.ErrorMessage();
            case 21:
                return BuildConfig.ChallengeResultTimeout();
            case 22:
                return BuildConfig.getErrorCode();
            case 23:
                return BuildConfig.getAdditionalDetails();
            case 24:
                return BuildConfig.ChallengeResultCompleted();
            case 25:
                return BuildConfig.ChallengeResultError();
            case 26:
                return BuildConfig.show();
            case 27:
                return BuildConfig.getTransactionStatus();
            case 28:
                return BuildConfig.ChallengeResultKt();
            default:
                return BuildConfig.ChallengeStatusReceiver();
        }
    }
}
