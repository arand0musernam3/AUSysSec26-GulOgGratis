package rg;

import com.app.tgtg.model.remote.specialrewards.response.SpecialRewardsResponse;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38012a;

    public /* synthetic */ m(int i11) {
        this.f38012a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38012a) {
            case 0:
                return new i90.a("com.app.tgtg.favWidget.FavouriteWidgetState.NoUser", n.INSTANCE, new Annotation[0]);
            case 1:
                return new i90.f("com.app.tgtg.feature.logincharity.domain.NavigationLoginCharity", Reflection.getOrCreateKotlinClass(rl.f.class), new KClass[]{Reflection.getOrCreateKotlinClass(rl.d.class), Reflection.getOrCreateKotlinClass(rl.e.class)}, new KSerializer[]{new i90.a("com.app.tgtg.feature.logincharity.domain.NavigationLoginCharity.EmailLoginScreen", rl.d.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.logincharity.domain.NavigationLoginCharity.MainLoginScreen", rl.e.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 2:
                return new i90.a("com.app.tgtg.feature.logincharity.domain.NavigationLoginCharity.EmailLoginScreen", rl.d.INSTANCE, new Annotation[0]);
            case 3:
                return new i90.a("com.app.tgtg.feature.logincharity.domain.NavigationLoginCharity.MainLoginScreen", rl.e.INSTANCE, new Annotation[0]);
            case 4:
                return SpecialRewardsResponse._childSerializers$_anonymous_();
            case 5:
                return BrazeConfig.Builder.setFirebaseCloudMessagingSenderIdKey$lambda$21();
            case 6:
                return BrazeConfig.Builder.setApiKey$lambda$0();
            case 7:
                return BrazeConfig.Builder.setDefaultNotificationChannelName$lambda$1();
            case 8:
                return BrazeConfig.Builder.setDefaultNotificationChannelDescription$lambda$2();
            case 9:
                return BrazeConfigurationProvider._get_versionCode_$lambda$11();
            case 10:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$6();
            case 11:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$7();
            case 12:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$8();
            case 13:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$9();
            case 14:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$10();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeConfigurationProvider._get_defaultNotificationAccentColor_$lambda$13();
            case 16:
                return BrazeConfigurationProvider._get_ephemeralEventKeys_$lambda$0();
            case 17:
                return BrazeConfigurationProvider._get_sdkFlavor_$lambda$14();
            case 18:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$1();
            case 19:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$2();
            case 20:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$3();
            case 21:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$4();
            case 22:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$5();
            case 23:
                return CachedConfigurationProvider.resetCache$lambda$5();
            case 24:
                return CachedConfigurationProvider.readResourceValue$lambda$3();
            case 25:
                return RuntimeAppConfigurationProvider.clearAllConfigurationValues$lambda$44();
            case 26:
                return com.braze.configuration.e.b();
            case 27:
                return com.braze.triggers.utils.c.a();
            case 28:
                return com.braze.triggers.utils.c.b();
            default:
                return com.braze.triggers.utils.c.c();
        }
    }
}
